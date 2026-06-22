/* FarewellXposed - Xposed module for per-app DPI/font.
 * Auto-registered by LSPosed/Vector from /data/adb/modules/farewell/xposed/
 * No conflict - LSPosed loads ALL Xposed modules simultaneously */
package com.farewell.xposed;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class FarewellXposed implements IXposedHookLoadPackage {
    private static native int getDpiForPackage(String pkg);
    private static native float getFontScaleForPackage(String pkg);
    private static native boolean hasOverrides();

    static { System.loadLibrary("farewell_xposed"); }

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        if (!hasOverrides()) return;
        final String pkg = lpparam.packageName;
        final int dpi = getDpiForPackage(pkg);
        final float fontScale = getFontScaleForPackage(pkg);
        if (dpi <= 0 && fontScale <= 0) return;

        ClassLoader cl = lpparam.classLoader;
        if (dpi > 0) {
            XposedHelpers.findAndHookMethod("android.view.Display", cl,
                "getMetrics", DisplayMetrics.class, new XC_MethodHook() {
                    @Override protected void afterHookedMethod(MethodHookParam param) {
                        DisplayMetrics dm = (DisplayMetrics) param.args[0];
                        dm.densityDpi = dpi; dm.density = dpi / 160f;
                        dm.scaledDensity = dm.density * (fontScale > 0 ? fontScale : 1f);
                    }
                });
            XposedHelpers.findAndHookMethod("android.view.Display", cl,
                "getRealMetrics", DisplayMetrics.class, new XC_MethodHook() {
                    @Override protected void afterHookedMethod(MethodHookParam param) {
                        DisplayMetrics dm = (DisplayMetrics) param.args[0];
                        dm.densityDpi = dpi; dm.density = dpi / 160f;
                    }
                });
        }
    }
}
