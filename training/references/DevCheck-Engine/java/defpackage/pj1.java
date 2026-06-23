package defpackage;

/* loaded from: classes.dex */
public final class pj1 implements bq0, AutoCloseable {
    public final String g;
    public final oj1 h;
    public boolean i;

    public pj1(String str, oj1 oj1Var) {
        this.g = str;
        this.h = oj1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.bq0
    public final void e(eq0 eq0Var, xp0 xp0Var) {
        if (xp0Var == xp0.ON_DESTROY) {
            this.i = false;
            eq0Var.q().f(this);
        }
    }

    public final void j(zf zfVar, gq0 gq0Var) {
        zfVar.getClass();
        gq0Var.getClass();
        if (this.i) {
            c.n("Already attached to lifecycleOwner");
            return;
        }
        this.i = true;
        gq0Var.a(this);
        zfVar.K(this.g, (rt) this.h.f741a.k);
    }
}
