package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q10 extends fa0 implements Executor {
    public static final q10 i = new q10();
    public static final sx j;

    static {
        g42 g42Var = g42.i;
        int i2 = tu1.f1008a;
        if (64 >= i2) {
            i2 = 64;
        }
        j = g42Var.G(xc1.G(i2, "kotlinx.coroutines.io.parallelism", 12));
    }

    @Override // defpackage.sx
    public final void D(qx qxVar, Runnable runnable) {
        j.D(qxVar, runnable);
    }

    @Override // defpackage.sx
    public final void E(qx qxVar, Runnable runnable) {
        j.E(qxVar, runnable);
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        D(n80.g, runnable);
    }

    @Override // defpackage.sx
    public final String toString() {
        return "Dispatchers.IO";
    }
}
