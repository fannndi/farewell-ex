package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class n10 extends s90 implements Runnable {
    public static volatile Thread _thread;
    public static volatile int debugStatus;
    public static final n10 r;
    public static final long s;

    static {
        Long l;
        n10 n10Var = new n10();
        r = n10Var;
        n10Var.J(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        s = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.s90
    public final void O(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.O(runnable);
    }

    @Override // defpackage.s90
    public final Thread S() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(r.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.s90
    public final void U(long j, q90 q90Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void a0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            W();
            notifyAll();
        }
    }

    @Override // defpackage.s90, defpackage.q20
    public final n50 j(long j, dz1 dz1Var, qx qxVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return y21.g;
        }
        long nanoTime = System.nanoTime();
        p90 p90Var = new p90(j2 + nanoTime, dz1Var);
        X(nanoTime, p90Var);
        return p90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean T;
        uy1.f1059a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (T) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long K = K();
                    if (K == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = s + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            a0();
                            if (T()) {
                                return;
                            }
                            S();
                            return;
                        }
                        if (K > j2) {
                            K = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (K > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            a0();
                            if (T()) {
                                return;
                            }
                            S();
                            return;
                        }
                        LockSupport.parkNanos(this, K);
                    }
                }
            }
        } finally {
            _thread = null;
            a0();
            if (!T()) {
                S();
            }
        }
    }

    @Override // defpackage.s90, defpackage.n90
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.sx
    public final String toString() {
        return "DefaultExecutor";
    }
}
