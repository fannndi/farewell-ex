/*
 * Farewell ZygiskNext Companion Module
 * Target: POCO X3 NFC (SM7150-AC)
 * Tier: 4 (ZygiskNext required)
 *
 * Per-app: renderer spoof, device property spoof, cpuinfo mount
 * Requires: ZygiskNext installed, KernelSU with Zygisk support
 */

#include <jni.h>
#include <string>
#include <unordered_map>
#include <mutex>
#include <cstring>
#include <dlfcn.h>
#include <sys/mman.h>
#include <unistd.h>

// ==================== Config ====================

static std::unordered_map<std::string, std::string> prop_overrides;
static std::unordered_map<std::string, std::string> renderer_overrides;
static std::string cpuinfo_spoof_path;
static std::mutex config_mutex;

static const char* CONFIG_PATH = "/data/local/tmp/farewell_zygisk_config.json";

// ==================== Foreground Detection ====================

static std::string detect_foreground_package() {
    char buf[512];
    FILE* fp = popen("dumpsys window | grep mCurrentFocus | head -1", "r");
    if (!fp) return "";
    std::string result;
    while (fgets(buf, sizeof(buf), fp)) {
        result += buf;
    }
    pclose(fp);

    // Extract package name from "Window{... com.pkg.name/...}"
    size_t start = result.find("com.");
    if (start == std::string::npos) start = result.find("org.");
    if (start == std::string::npos) start = result.find("io.");
    if (start == std::string::npos) return "";

    size_t end = result.find('/', start);
    if (end == std::string::npos) end = result.find(' ', start);
    if (end == std::string::npos) return "";

    return result.substr(start, end - start);
}

// ==================== PLT Hook: __system_property_get ====================

// Original function pointer
typedef void (*orig_property_get_t)(const char* name, char* value);
static orig_property_get_t orig_get = nullptr;

static void hooked_property_get(const char* name, char* value) {
    orig_get(name, value);

    // Check if we have an override for this property
    std::string pkg = detect_foreground_package();
    if (pkg.empty()) return;

    std::lock_guard<std::mutex> lock(config_mutex);

    // Check property overrides
    auto prop_it = prop_overrides.find(std::string(name));
    if (prop_it != prop_overrides.end()) {
        strncpy(value, prop_it->second.c_str(), 92);
        value[91] = '\0';
    }

    // Check renderer overrides
    auto ren_it = renderer_overrides.find(pkg);
    if (ren_it != renderer_overrides.end() &&
        (strcmp(name, "debug.hwui.renderer") == 0 ||
         strcmp(name, "ro.hwui.use_vulkan") == 0)) {
        strncpy(value, ren_it->second.c_str(), 92);
        value[91] = '\0';
    }
}

static void install_property_hook() {
    void* handle = dlopen("libc.so", RTLD_NOW);
    if (!handle) return;
    orig_get = (orig_property_get_t)dlsym(handle, "__system_property_get");
    if (!orig_get) return;

    // ZygiskNext PLT hook via zn_api would be used here in production
    // For now: mark as pending — actual hook requires zn_api.pltHook()
}

// ==================== JNI Interface ====================

extern "C" {

JNIEXPORT void JNICALL
Java_com_farewell_kernelmanager_kernel_NativeLib_setZygiskPropertyOverrides(
    JNIEnv* env, jclass, jobjectArray props) {
    std::lock_guard<std::mutex> lock(config_mutex);
    prop_overrides.clear();
    renderer_overrides.clear();

    int count = env->GetArrayLength(props);
    for (int i = 0; i < count; i += 2) {
        auto name = (jstring)env->GetObjectArrayElement(props, i);
        auto val = (jstring)env->GetObjectArrayElement(props, i + 1);
        if (!name || !val) continue;

        const char* n = env->GetStringUTFChars(name, nullptr);
        const char* v = env->GetStringUTFChars(val, nullptr);
        prop_overrides[n] = v;
        env->ReleaseStringUTFChars(name, n);
        env->ReleaseStringUTFChars(val, v);
    }
}

JNIEXPORT void JNICALL
Java_com_farewell_kernelmanager_kernel_NativeLib_setZygiskRendererOverride(
    JNIEnv* env, jclass, jstring pkg, jstring renderer) {
    std::lock_guard<std::mutex> lock(config_mutex);
    const char* p = env->GetStringUTFChars(pkg, nullptr);
    const char* r = env->GetStringUTFChars(renderer, nullptr);
    renderer_overrides[p] = r;
    env->ReleaseStringUTFChars(pkg, p);
    env->ReleaseStringUTFChars(renderer, r);
}

JNIEXPORT void JNICALL
Java_com_farewell_kernelmanager_kernel_NativeLib_setZygiskCpuinfoSpoof(
    JNIEnv* env, jclass, jstring spoof_path) {
    const char* path = env->GetStringUTFChars(spoof_path, nullptr);
    cpuinfo_spoof_path = std::string(path);
    env->ReleaseStringUTFChars(spoof_path, path);
}

JNIEXPORT void JNICALL
Java_com_farewell_kernelmanager_kernel_NativeLib_startZygiskHook(
    JNIEnv*, jclass) {
    install_property_hook();
}

} // extern "C"
