package flar2.devcheck.nativebridge;

import defpackage.o01;

/* loaded from: classes.dex */
public abstract class VulkanBridge {
    public static String a() {
        String vulkanInfoJson;
        if (!o01.b()) {
            return "{}";
        }
        try {
            vulkanInfoJson = getVulkanInfoJson();
        } catch (Throwable unused) {
        }
        return vulkanInfoJson != null ? vulkanInfoJson : "{}";
    }

    public static String b() {
        if (!o01.b()) {
            return "0.0.0";
        }
        try {
            return getVulkanVersion();
        } catch (Throwable unused) {
            return "0.0.0";
        }
    }

    private static native String getVulkanInfoJson();

    private static native String getVulkanVersion();
}
