package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.os.StatFs;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class r30 {

    /* renamed from: a, reason: collision with root package name */
    public String f872a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String[] h;
    public String i;
    public int j;
    public String k;
    public int l;
    public long[] m;
    public long n;
    public long o;
    public int p;
    public boolean q;
    public int r;
    public long s;

    public r30() {
        this.f872a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = null;
        this.g = null;
        this.h = new String[0];
        this.i = "";
        this.j = 0;
        this.k = "";
        this.l = 0;
        this.m = new long[0];
        this.n = -1L;
        this.o = -1L;
        this.p = -1;
        this.q = false;
        this.r = -1;
        this.s = 0L;
    }

    public r30(r30 r30Var) {
        this.f872a = r30Var.f872a;
        this.b = r30Var.b;
        this.c = r30Var.c;
        this.d = r30Var.d;
        this.e = r30Var.e;
        this.f = r30Var.f;
        this.g = r30Var.g;
        this.h = r30Var.h;
        this.i = r30Var.i;
        this.j = r30Var.j;
        this.k = r30Var.k;
        this.l = r30Var.l;
        this.m = r30Var.m;
        this.n = r30Var.n;
        this.o = r30Var.o;
        this.p = r30Var.p;
        this.q = r30Var.q;
        this.r = r30Var.r;
        this.s = r30Var.s;
    }

    public static r30 a(Context context) {
        PowerManager powerManager;
        int currentThermalStatus;
        String str;
        String str2;
        r30 r30Var = new r30();
        String str3 = Build.MANUFACTURER;
        if (str3 == null) {
            str3 = "";
        }
        r30Var.f872a = str3;
        String str4 = Build.MODEL;
        if (str4 == null) {
            str4 = "";
        }
        r30Var.b = str4;
        String str5 = Build.DEVICE;
        if (str5 == null) {
            str5 = "";
        }
        r30Var.c = str5;
        String str6 = Build.BOARD;
        if (str6 == null) {
            str6 = "";
        }
        r30Var.d = str6;
        String str7 = Build.HARDWARE;
        if (str7 == null) {
            str7 = "";
        }
        r30Var.e = str7;
        String str8 = Build.FINGERPRINT;
        if (str8 == null) {
            str8 = "";
        }
        r30Var.i = str8;
        int i = Build.VERSION.SDK_INT;
        r30Var.j = i;
        String str9 = Build.VERSION.RELEASE;
        if (str9 == null) {
            str9 = "";
        }
        r30Var.k = str9;
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr == null) {
            strArr = new String[0];
        }
        r30Var.h = strArr;
        if (i >= 31) {
            str = Build.SOC_MANUFACTURER;
            if (str == null) {
                str = "";
            }
            r30Var.f = str;
            str2 = Build.SOC_MODEL;
            r30Var.g = str2 != null ? str2 : "";
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        r30Var.l = availableProcessors;
        int max = Math.max(availableProcessors, 0);
        long[] jArr = new long[max];
        for (int i2 = 0; i2 < max; i2++) {
            jArr[i2] = -1;
        }
        for (int i3 = 0; i3 < max; i3++) {
            File file = new File(d51.p(i3, "/sys/devices/system/cpu/cpu", "/cpufreq/cpuinfo_max_freq"));
            if (file.canRead()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            jArr[i3] = Long.parseLong(readLine.trim());
                        }
                        bufferedReader.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException | NumberFormatException unused) {
                    continue;
                }
            }
        }
        r30Var.m = jArr;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            r30Var.n = memoryInfo.totalMem;
        }
        try {
            StatFs statFs = new StatFs(context.getFilesDir().getAbsolutePath());
            r30Var.o = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused2) {
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                r30Var.p = (int) Math.round((intExtra * 100.0d) / intExtra2);
            }
            int intExtra3 = registerReceiver.getIntExtra("status", 1);
            r30Var.q = intExtra3 == 2 || intExtra3 == 5;
        }
        r30Var.r = -1;
        if (Build.VERSION.SDK_INT >= 29 && (powerManager = (PowerManager) context.getSystemService(rQcwh.wAkWINeg)) != null) {
            try {
                currentThermalStatus = powerManager.getCurrentThermalStatus();
                r30Var.r = currentThermalStatus;
            } catch (Throwable unused3) {
            }
        }
        r30Var.s = System.currentTimeMillis();
        return new r30(r30Var);
    }
}
