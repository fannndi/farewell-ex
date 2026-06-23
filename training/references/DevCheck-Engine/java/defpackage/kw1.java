package defpackage;

import Cwd.YSHrxiHkAFcciU;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class kw1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f554a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final j70 f;

    static {
        String str;
        String str2 = YSHrxiHkAFcciU.hUdkDIVR;
        int i = tu1.f1008a;
        try {
            str = System.getProperty(str2);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f554a = str;
        b = xc1.F("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = tu1.f1008a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = xc1.G(i2, "kotlinx.coroutines.scheduler.core.pool.size", 8);
        d = xc1.G(2097150, "kotlinx.coroutines.scheduler.max.pool.size", 4);
        e = TimeUnit.SECONDS.toNanos(xc1.F("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = j70.l;
    }
}
