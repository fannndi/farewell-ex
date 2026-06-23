package flar2.devcheck.nativebridge;

import defpackage.o01;
import flar2.devcheck.gpu.adreno.AdrenoInfo;
import flar2.devcheck.gpu.mali.MaliInfo;

/* loaded from: classes.dex */
public abstract class GpuBridge {
    public static AdrenoInfo a() {
        if (!o01.a()) {
            return null;
        }
        try {
            return nGetAdrenoInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static MaliInfo b() {
        if (!o01.a()) {
            return null;
        }
        try {
            return nGetMaliInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long[] c() {
        if (!o01.a()) {
            return null;
        }
        try {
            return nativeGetMaxCuAndFreq();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static native AdrenoInfo nGetAdrenoInfo();

    private static native MaliInfo nGetMaliInfo();

    private static native long[] nativeGetMaxCuAndFreq();
}
