package defpackage;

import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class o01 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f710a = new AtomicInteger(0);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static boolean a() {
        AtomicInteger atomicInteger = f710a;
        int i = atomicInteger.get();
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        synchronized (atomicInteger) {
            try {
                int i2 = atomicInteger.get();
                if (i2 == 1) {
                    return true;
                }
                if (i2 == 2) {
                    return false;
                }
                try {
                    System.loadLibrary(RIhTGWkqQvGL.bEBl);
                    atomicInteger.set(1);
                    return true;
                } catch (Throwable unused) {
                    f710a.set(2);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean b() {
        AtomicInteger atomicInteger = (AtomicInteger) b.computeIfAbsent("vulkan_info", new s8(4));
        int i = atomicInteger.get();
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            synchronized (atomicInteger) {
                try {
                    int i2 = atomicInteger.get();
                    if (i2 == 1) {
                        return true;
                    }
                    if (i2 == 2) {
                        return false;
                    }
                    try {
                        System.loadLibrary("vulkan_info");
                        atomicInteger.set(1);
                        return true;
                    } catch (Throwable unused) {
                        atomicInteger.set(2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }
}
