/*
 * Farewell Vector/Xposed Module
 * Target: POCO X3 NFC (SM7150-AC)
 * Tier: 5 (Vector/LSPosed required)
 *
 * Per-app: DPI override, font scaling, DisplayMetrics rewrite
 * Requires: Vector or LSPosed Xposed framework installed
 */

#include <jni.h>
#include <string>
#include <unordered_map>
#include <mutex>
#include <cstring>

// ==================== Config ====================

static std::unordered_map<std::string, int> dpi_overrides;      // pkg -> dpi
static std::unordered_map<std::string, float> font_overrides;    // pkg -> font scale
static std::mutex config_mutex;

static const char* CONFIG_PATH = "/data/local/tmp/farewell_vector_config.json";

// ==================== JNI: Config Setter ====================

extern "C" {

JNIEXPORT void JNICALL
Java_com_farewell_kernelmanager_kernel_NativeLib_setVectorDpiOverride(
    JNIEnv* env, jclass, jstring pkg, jint dpi) {
    std::lock_guard<std::mutex> lock(config_mutex);
    const char* p = env->GetStringUTFChars(pkg, nullptr);
    dpi_overrides[p] = dpi;
    env->ReleaseStringUTFChars(pkg, p);
}

JNIEXPORT void JNICALL
Java_com_farewell_kernelmanager_kernel_NativeLib_setVectorFontOverride(
    JNIEnv* env, jclass, jstring pkg, jfloat scale) {
    std::lock_guard<std::mutex> lock(config_mutex);
    const char* p = env->GetStringUTFChars(pkg, nullptr);
    font_overrides[p] = scale;
    env->ReleaseStringUTFChars(pkg, p);
}

JNIEXPORT void JNICALL
Java_com_farewell_kernelmanager_kernel_NativeLib_clearVectorOverrides(
    JNIEnv*, jclass) {
    std::lock_guard<std::mutex> lock(config_mutex);
    dpi_overrides.clear();
    font_overrides.clear();
}

} // extern "C"

// ==================== Xposed Hooks (deployed by Vector) ====================
// 
// The Xposed module hooks the following methods at ART level:
//
// 1. android.view.Display.getMetrics(DisplayMetrics)
//    → If package has DPI override, rewrite densityDpi
//
// 2. android.widget.TextView.setTextSize(float)
//    → If package has font override, scale text size
//
// 3. android.util.DisplayMetrics.setToDefaults()
//    → Override densityDpi, scaledDensity per package
//
// These hooks are registered via IXposedHookLoadPackage
// and deployed as a standalone Xposed module APK.
//
// See: knowledge/modules/17-dpis.md for the full DPIS pattern
// See: knowledge/modules/22-vector.md for LSPlant integration

/*
// Example Xposed hook skeleton (Java):
public class FarewellXposed implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        String pkg = lpparam.packageName;

        int dpi = getDpiForPackage(pkg);
        if (dpi > 0) {
            XposedHelpers.findAndHookMethod("android.view.Display",
                lpparam.classLoader,
                "getMetrics",
                android.util.DisplayMetrics.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) {
                        android.util.DisplayMetrics dm =
                            (android.util.DisplayMetrics) param.args[0];
                        dm.densityDpi = dpi;
                    }
                });
        }
    }
}
*/
