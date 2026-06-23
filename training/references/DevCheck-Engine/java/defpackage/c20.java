package defpackage;

/* loaded from: classes.dex */
public final class c20 extends fa0 {
    public static final c20 j;
    public xx i;

    static {
        int i = kw1.c;
        int i2 = kw1.d;
        long j2 = kw1.e;
        String str = kw1.f554a;
        c20 c20Var = new c20();
        c20Var.i = new xx(i, i2, j2, str);
        j = c20Var;
    }

    @Override // defpackage.sx
    public final void D(qx qxVar, Runnable runnable) {
        xx.j(this.i, runnable, 6);
    }

    @Override // defpackage.sx
    public final void E(qx qxVar, Runnable runnable) {
        xx.j(this.i, runnable, 2);
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.sx
    public final String toString() {
        return "Dispatchers.Default";
    }
}
