package defpackage;

/* loaded from: classes.dex */
public final class tj0 extends pj0 {
    public boolean k;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i) {
            return;
        }
        if (!this.k) {
            a(uj0.f);
        }
        this.i = true;
    }

    @Override // defpackage.pj0, defpackage.lp1
    public final long g(long j, wl wlVar) {
        if (this.i) {
            c.n("closed");
            return 0L;
        }
        if (this.k) {
            return -1L;
        }
        long g = super.g(8192L, wlVar);
        if (g != -1) {
            return g;
        }
        this.k = true;
        a(ui0.h);
        return -1L;
    }
}
