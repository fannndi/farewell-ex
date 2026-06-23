package defpackage;

import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.text.TextUtils;
import androidx.media.RfwE.BIxeFreLLop;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class au1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f54a = {"/sys/power/pnpmgr/thermal/thermal_temp_cpu0", "/sys/power/pnpmgr/thermal/thermal_temp_cpu1", "/sys/power/pnpmgr/thermal/thermal_temp_cpu2", "/sys/power/pnpmgr/thermal/thermal_temp_cpu3", "/sys/power/pnpmgr/thermal/thermal_temp_cpu4", "/sys/power/pnpmgr/thermal/thermal_temp_cpu5", "/sys/power/pnpmgr/thermal/thermal_temp_cpu6", "/sys/power/pnpmgr/thermal/thermal_temp_cpu7"};
    public static final String[] b = {"thermal_temp_cpu0", "thermal_temp_cpu1", "thermal_temp_cpu2", "thermal_temp_cpu3", BIxeFreLLop.TpIiltXCBTvBl, "thermal_temp_cpu5", "thermal_temp_cpu6", "thermal_temp_cpu7"};
    public static final String[] c = {"/sys/kernel/debug/tegra_soctherm/plltemp", jYVJoqfHJs.FLXjAP, "/sys/kernel/debug/tegra_soctherm/gputemp", "/sys/kernel/debug/tegra_soctherm/cputemp", "/sys/class/i2c-adapter/i2c-4/4-004c/temperature", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature", "/sys/devices/platform/omap/omap_temp_sensor.0/temperature", "/sys/devices/platform/tegra_tmon/temp1_input", "/sys/kernel/debug/tegra_thermal/temp_tj", "/sys/devices/platform/s5p-tmu/temperature", "/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp", "/proc/mtktscpu/mtktscpu_temperature", "/sys/devices/platform/s5p-tmu/curr_temp", "/sys/class/kgsl/kgsl-3d0/temp", "/sys/htc/cpu_temp", "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/ext_temperature", "/sys/devices/platform/tegra-tsensor/tsensor_temperature", "/sys/devices/platform/google,battery/power_supply/battery/temp", "/sys/devices/platform/audiometrics/speaker_temp", "/sys/devices/platform/*.hsi2c/*/*/power_supply/maxfg/temp", "/sys/devices/platform/cp-tm1/cp_temp", "/sys/kernel/gpu/gpu_tmu"};
    public static final String[] d = {"plltemp", "memtemp", "gputemp", "cputemp", "i2c temperature", rlfWzcx.TeILbi, "omap_temp_sensor.0", "tegra_tmon", bOxzFZXgEkjph.GJZjS, "s5p-tmu", "cpu0_temp", "mtktscpu_temperature", "s5p-tmu", "kgsl-3d0", "htc_cpu_temp", "ext_temperature", "tsensor_temperature", "Battery", "Speaker", "Power supply", rlfWzcx.edAlaSlBDDbPF, "GPU"};
    public static final String[][] e = {new String[]{"battery", "/sys/class/power_supply/battery/temp", "battery"}};
    public static final HashSet f = new HashSet(Arrays.asList("soc", "socd", "quiet_therm", "mmw-pa4-usr", GFUHKHDfiFuPm.JuaeljjAabc, "min-temp-1-lowf", "cellular-emergency", "xo-therm", "xo-therm-usr"));

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            yt1 yt1Var = (yt1) obj;
            float f2 = yt1Var.d;
            if (f2 >= 5.0f && f2 <= 120.0f) {
                arrayList2.add(yt1Var);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x04a6 A[FALL_THROUGH, PHI: r24
  0x04a6: PHI (r24v3 float) = (r24v1 float), (r24v2 float) binds: [B:147:0x04a3, B:178:0x04a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.y41 b(android.content.Context r31, defpackage.xt1 r32) {
        /*
            Method dump skipped, instructions count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au1.b(android.content.Context, xt1):y41");
    }

    public static Float c(String str) {
        if (str.contains(".")) {
            return Float.valueOf(Float.parseFloat(str));
        }
        long parseLong = Long.parseLong(str);
        if (parseLong != 0 && parseLong != -274000 && parseLong != -273000 && parseLong != -40000) {
            if (parseLong <= 1000 && parseLong >= -1000) {
                return Float.valueOf(parseLong);
            }
            return Float.valueOf(parseLong / 1000.0f);
        }
        return null;
    }

    public static List d(y41 y41Var) {
        ArrayList arrayList;
        Float c2;
        if (y41Var == null || (arrayList = (ArrayList) y41Var.e) == null || arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) y41Var.e;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            zt1 zt1Var = (zt1) obj;
            if (zt1Var != null && zt1Var.k && !TextUtils.isEmpty(zt1Var.b)) {
                String e2 = e(new File(zt1Var.b));
                if (!TextUtils.isEmpty(e2) && (c2 = c(e2.trim())) != null && c2.floatValue() >= 5.0f && c2.floatValue() <= 120.0f) {
                    oy1 oy1Var = new oy1();
                    oy1Var.b = zt1Var.c;
                    oy1Var.f768a = zt1Var.d;
                    oy1Var.c = -1;
                    oy1Var.d = zt1Var.e;
                    oy1Var.e = zt1Var.f;
                    oy1Var.f = c2.floatValue();
                    oy1Var.g = zt1Var.g;
                    float f2 = zt1Var.h;
                    oy1Var.h = f2;
                    float f3 = zt1Var.i;
                    oy1Var.i = f3;
                    oy1Var.j = zt1Var.j;
                    oy1Var.k = f2 <= f3 ? 0.0f : (Math.max(f3, Math.min(f2, c2.floatValue())) - f3) / (f2 - f3);
                    float f4 = zt1Var.g;
                    float f5 = zt1Var.h;
                    float floatValue = c2.floatValue();
                    oy1Var.l = floatValue >= f5 ? 2 : floatValue >= f4 ? 1 : 0;
                    arrayList2.add(oy1Var);
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0089, code lost:
    
        if (r1.isEmpty() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(java.io.File r8) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au1.e(java.io.File):java.lang.String");
    }

    public static void f(String str, ArrayList arrayList, HashSet hashSet) {
        String str2;
        Float c2;
        try {
            str2 = new File(str).getCanonicalPath();
        } catch (IOException unused) {
            str2 = str;
        }
        if (hashSet.add(str2)) {
            File file = new File(str);
            File[] listFiles = file.isDirectory() ? file.listFiles() : null;
            if (i51.b("prefRoot").booleanValue() && (listFiles == null || listFiles.length == 0)) {
                try {
                    ks1 ks1Var = new ks1(str);
                    if (ks1Var.b("[ -d @@ ]")) {
                        listFiles = ks1Var.listFiles();
                    }
                } catch (Throwable unused2) {
                }
            }
            if (listFiles == null || listFiles.length == 0) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    File file3 = new File(file2, "name");
                    if (file3.isFile()) {
                        String trim = e(file3).trim();
                        if (!TextUtils.isEmpty(trim)) {
                            File file4 = new File(file2, "temp1_input");
                            if (file4.isFile()) {
                                String e2 = e(file4);
                                if (!TextUtils.isEmpty(e2) && (c2 = c(e2.trim())) != null) {
                                    yt1 yt1Var = new yt1();
                                    yt1Var.f1247a = "hwmon:" + file2.getName();
                                    yt1Var.b = file4.getAbsolutePath();
                                    yt1Var.c = trim;
                                    yt1Var.d = c2.floatValue();
                                    arrayList.add(yt1Var);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static ArrayList g() {
        Float c2;
        Float c3;
        Float c4;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int size = arrayList.size();
        h("/sys/class/thermal", arrayList, hashSet, hashSet2);
        if (arrayList.size() == size) {
            h("/sys/devices/virtual/thermal", arrayList, hashSet, hashSet2);
        }
        int size2 = arrayList.size();
        f("/sys/class/hwmon", arrayList, hashSet2);
        if (arrayList.size() == size2) {
            f("/sys/devices/virtual/hwmon", arrayList, hashSet2);
        }
        for (int i = 0; i < 8 && i < 8; i++) {
            String str = f54a[i];
            String str2 = b[i];
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.isFile()) {
                    String e2 = e(file);
                    if (!TextUtils.isEmpty(e2) && (c4 = c(e2.trim())) != null) {
                        yt1 yt1Var = new yt1();
                        yt1Var.f1247a = "pnpmgr:" + str2;
                        yt1Var.b = file.getAbsolutePath();
                        yt1Var.c = str2;
                        yt1Var.d = c4.floatValue();
                        arrayList.add(yt1Var);
                    }
                }
            }
        }
        for (int i2 = 0; i2 < 22 && i2 < 22; i2++) {
            String str3 = c[i2];
            String str4 = d[i2];
            if (!TextUtils.isEmpty(str3)) {
                File file2 = new File(str3);
                if (file2.isFile()) {
                    String e3 = e(file2);
                    if (!TextUtils.isEmpty(e3) && (c3 = c(e3.trim())) != null) {
                        yt1 yt1Var2 = new yt1();
                        StringBuilder w = d51.w("misc:", str4, ":");
                        w.append(file2.getAbsolutePath());
                        yt1Var2.f1247a = w.toString();
                        yt1Var2.b = file2.getAbsolutePath();
                        yt1Var2.c = str4;
                        yt1Var2.d = c3.floatValue();
                        arrayList.add(yt1Var2);
                    }
                }
            }
        }
        String[] strArr = e[0];
        if (strArr.length >= 2) {
            String str5 = strArr[0];
            String str6 = strArr[1];
            String str7 = strArr.length >= 3 ? strArr[2] : str5;
            File file3 = new File(str6);
            if (file3.isFile()) {
                String e4 = e(file3);
                if (!TextUtils.isEmpty(e4) && (c2 = c(e4.trim())) != null) {
                    yt1 yt1Var3 = new yt1();
                    yt1Var3.f1247a = "extra:" + str5;
                    yt1Var3.b = file3.getAbsolutePath();
                    yt1Var3.c = str7;
                    yt1Var3.d = c2.floatValue();
                    arrayList.add(yt1Var3);
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public static void h(String str, ArrayList arrayList, HashSet hashSet, HashSet hashSet2) {
        String str2;
        Float c2;
        try {
            str2 = new File(str).getCanonicalPath();
        } catch (IOException unused) {
            str2 = str;
        }
        if (hashSet2.add(str2)) {
            File file = new File(str);
            File[] listFiles = file.isDirectory() ? file.listFiles() : null;
            if (i51.b("prefRoot").booleanValue() && (listFiles == null || listFiles.length == 0)) {
                try {
                    ks1 ks1Var = new ks1(str);
                    if (ks1Var.b("[ -d @@ ]")) {
                        listFiles = ks1Var.listFiles();
                    }
                } catch (Throwable unused2) {
                }
            }
            if (listFiles == null || listFiles.length == 0) {
                return;
            }
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (name.startsWith("thermal_zone")) {
                    if (hashSet.add(str2 + ":" + name)) {
                        File file3 = new File(file2, "type");
                        File file4 = new File(file2, "temp");
                        boolean isFile = file3.isFile();
                        boolean isFile2 = file4.isFile();
                        if (i51.b("prefRoot").booleanValue() && (!isFile || !isFile2)) {
                            try {
                                ks1 ks1Var2 = new ks1(file3.getAbsolutePath());
                                ks1 ks1Var3 = new ks1(file4.getAbsolutePath());
                                isFile = ks1Var2.b("[ -f @@ ]");
                                isFile2 = ks1Var3.b("[ -f @@ ]");
                            } catch (Throwable unused3) {
                            }
                        }
                        if (isFile && isFile2) {
                            String e2 = e(file3);
                            String e3 = e(file4);
                            if (!TextUtils.isEmpty(e2) && !TextUtils.isEmpty(e3) && (c2 = c(e3.trim())) != null) {
                                yt1 yt1Var = new yt1();
                                yt1Var.f1247a = "tz:".concat(name);
                                yt1Var.b = file4.getAbsolutePath();
                                yt1Var.c = e2.trim();
                                yt1Var.d = c2.floatValue();
                                arrayList.add(yt1Var);
                            }
                        }
                    }
                }
            }
        }
    }
}
