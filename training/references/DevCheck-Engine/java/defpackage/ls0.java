package defpackage;

/* loaded from: classes.dex */
public final class ls0 extends ms0 implements bq0 {
    public final eq0 k;
    public final /* synthetic */ ns0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(ns0 ns0Var, eq0 eq0Var, v31 v31Var) {
        super(ns0Var, v31Var);
        this.l = ns0Var;
        this.k = eq0Var;
    }

    @Override // defpackage.ms0
    public final void c() {
        this.k.q().f(this);
    }

    @Override // defpackage.ms0
    public final boolean d(eq0 eq0Var) {
        return this.k == eq0Var;
    }

    @Override // defpackage.bq0
    public final void e(eq0 eq0Var, xp0 xp0Var) {
        eq0 eq0Var2 = this.k;
        yp0 yp0Var = eq0Var2.q().c;
        if (yp0Var == yp0.g) {
            this.l.j(this.g);
            return;
        }
        yp0 yp0Var2 = null;
        while (yp0Var2 != yp0Var) {
            b(f());
            yp0Var2 = yp0Var;
            yp0Var = eq0Var2.q().c;
        }
    }

    @Override // defpackage.ms0
    public final boolean f() {
        return this.k.q().c.compareTo(yp0.j) >= 0;
    }
}
