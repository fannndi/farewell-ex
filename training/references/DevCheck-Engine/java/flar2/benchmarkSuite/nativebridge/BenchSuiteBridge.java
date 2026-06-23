package flar2.devcheck.benchmarkSuite.nativebridge;

import android.os.Process;

/* loaded from: classes.dex */
public final class BenchSuiteBridge {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f289a;

    public static boolean a() {
        int i = f289a;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        synchronized (BenchSuiteBridge.class) {
            try {
                int i2 = f289a;
                if (i2 == 1) {
                    return true;
                }
                if (i2 == 2) {
                    return false;
                }
                if (!Process.is64Bit()) {
                    f289a = 2;
                    return false;
                }
                try {
                    System.loadLibrary("benchmarksuite");
                    f289a = 1;
                    return true;
                } catch (Throwable unused) {
                    f289a = 2;
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int[] b() {
        if (!a()) {
            return new int[0];
        }
        try {
            int[] nativeGetPinnedCpus = nativeGetPinnedCpus();
            return nativeGetPinnedCpus != null ? nativeGetPinnedCpus : new int[0];
        } catch (Throwable unused) {
            return new int[0];
        }
    }

    public static long c() {
        if (!a()) {
            return 0L;
        }
        try {
            return nativeNowNs();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String d() {
        if (!a()) {
            return null;
        }
        try {
            return nativePing();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static double e(double d, int[] iArr) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunAes(d, iArr);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double f(double d, int[] iArr) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunDijkstra(d, iArr);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double g(double d) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunGpuFp16Matmul(d);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double h(double d) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunGpuFp32Matmul(d);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double i(double d) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunGpuImageBlur(d);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double j(double d) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunGpuMemBw(d);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double k(double d) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunGpuReduction(d);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double l(double d, int[] iArr) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunMemLatency(d, iArr);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double m(double d, int[] iArr) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunMemRead(d, iArr);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double n(double d, int[] iArr) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunMemTriad(d, iArr);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    private static native int[] nativeGetPinnedCpus();

    private static native long nativeNowNs();

    private static native String nativePing();

    private static native double nativeRunAes(double d, int[] iArr);

    private static native double nativeRunDijkstra(double d, int[] iArr);

    private static native double nativeRunGpuFp16Matmul(double d);

    private static native double nativeRunGpuFp32Matmul(double d);

    private static native double nativeRunGpuImageBlur(double d);

    private static native double nativeRunGpuMemBw(double d);

    private static native double nativeRunGpuReduction(double d);

    private static native double nativeRunMemLatency(double d, int[] iArr);

    private static native double nativeRunMemRead(double d, int[] iArr);

    private static native double nativeRunMemTriad(double d, int[] iArr);

    private static native double nativeRunMemWrite(double d, int[] iArr);

    private static native double nativeRunRandRead(double d, String str);

    private static native double nativeRunRandWrite(double d, String str);

    private static native double nativeRunSeqRead(double d, String str);

    private static native double nativeRunSeqWrite(double d, String str);

    private static native double nativeRunSgemm(double d, int[] iArr);

    private static native double nativeRunSha256(double d, int[] iArr);

    private static native double nativeRunZstdDecompress(double d, int[] iArr);

    private static native void nativeWarmupCpus(int[] iArr, int i);

    public static double o(double d, int[] iArr) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunMemWrite(d, iArr);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double p(double d, String str) {
        if (a() && d > 0.0d && str != null && !str.isEmpty()) {
            try {
                return nativeRunRandRead(d, str);
            } catch (Throwable unused) {
            }
        }
        return 0.0d;
    }

    public static double q(double d, String str) {
        if (a() && d > 0.0d && str != null && !str.isEmpty()) {
            try {
                return nativeRunRandWrite(d, str);
            } catch (Throwable unused) {
            }
        }
        return 0.0d;
    }

    public static double r(double d, String str) {
        if (a() && d > 0.0d && str != null && !str.isEmpty()) {
            try {
                return nativeRunSeqRead(d, str);
            } catch (Throwable unused) {
            }
        }
        return 0.0d;
    }

    public static double s(double d, String str) {
        if (a() && d > 0.0d && str != null && !str.isEmpty()) {
            try {
                return nativeRunSeqWrite(d, str);
            } catch (Throwable unused) {
            }
        }
        return 0.0d;
    }

    public static double t(double d, int[] iArr) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunSgemm(d, iArr);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double u(double d, int[] iArr) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunSha256(d, iArr);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static double v(double d, int[] iArr) {
        if (!a() || d <= 0.0d) {
            return 0.0d;
        }
        try {
            return nativeRunZstdDecompress(d, iArr);
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static void w(int[] iArr) {
        if (a()) {
            try {
                nativeWarmupCpus(iArr, 100);
            } catch (Throwable unused) {
            }
        }
    }
}
