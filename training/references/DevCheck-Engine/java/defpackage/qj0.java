package defpackage;

/* loaded from: classes.dex */
public final class qj0 implements ap1 {
    public final gd0 g;
    public boolean h;
    public final /* synthetic */ uj0 i;

    public qj0(uj0 uj0Var) {
        this.i = uj0Var;
        this.g = new gd0(((yc1) uj0Var.c.j).g.c());
    }

    @Override // defpackage.ap1
    public final bz1 c() {
        return this.g;
    }

    @Override // defpackage.ap1, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((yc1) this.i.c.j).y("0\r\n\r\n");
        gd0 gd0Var = this.g;
        bz1 bz1Var = gd0Var.e;
        gd0Var.e = bz1.d;
        bz1Var.a();
        bz1Var.b();
        this.i.d = 3;
    }

    @Override // defpackage.ap1, java.io.Flushable
    public final synchronized void flush() {
        if (this.h) {
            return;
        }
        ((yc1) this.i.c.j).flush();
    }

    @Override // defpackage.ap1
    public final void q(long j, wl wlVar) {
        if (this.h) {
            c.n("closed");
            return;
        }
        if (j == 0) {
            return;
        }
        yc1 yc1Var = (yc1) this.i.c.j;
        if (yc1Var.i) {
            c.n("closed");
            return;
        }
        yc1Var.h.K(j);
        yc1Var.a();
        yc1Var.y("\r\n");
        yc1Var.q(j, wlVar);
        yc1Var.y("\r\n");
    }
}
