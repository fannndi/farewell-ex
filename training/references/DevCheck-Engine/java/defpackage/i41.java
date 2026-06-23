package defpackage;

/* loaded from: classes.dex */
public final class i41 implements bq0, xn {
    public final gq0 g;
    public final c41 h;
    public j41 i;
    public final /* synthetic */ l41 j;

    public i41(l41 l41Var, gq0 gq0Var, c41 c41Var) {
        c41Var.getClass();
        this.j = l41Var;
        this.g = gq0Var;
        this.h = c41Var;
        gq0Var.a(this);
    }

    @Override // defpackage.xn
    public final void cancel() {
        this.g.f(this);
        c41 c41Var = this.h;
        c41Var.getClass();
        c41Var.b.remove(this);
        j41 j41Var = this.i;
        if (j41Var != null) {
            j41Var.cancel();
        }
        this.i = null;
    }

    @Override // defpackage.bq0
    public final void e(eq0 eq0Var, xp0 xp0Var) {
        if (xp0Var != xp0.ON_START) {
            if (xp0Var != xp0.ON_STOP) {
                if (xp0Var == xp0.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                j41 j41Var = this.i;
                if (j41Var != null) {
                    j41Var.cancel();
                    return;
                }
                return;
            }
        }
        l41 l41Var = this.j;
        l41Var.getClass();
        c41 c41Var = this.h;
        c41Var.getClass();
        l41Var.b.addLast(c41Var);
        j41 j41Var2 = new j41(l41Var, c41Var);
        c41Var.b.add(j41Var2);
        l41Var.d();
        c41Var.c = new k41(0, l41Var, l41.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.i = j41Var2;
    }
}
