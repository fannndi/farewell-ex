package defpackage;

/* loaded from: classes.dex */
public final class j41 implements xn {
    public final c41 g;
    public final /* synthetic */ l41 h;

    public j41(l41 l41Var, c41 c41Var) {
        c41Var.getClass();
        this.h = l41Var;
        this.g = c41Var;
    }

    @Override // defpackage.xn
    public final void cancel() {
        l41 l41Var = this.h;
        j9 j9Var = l41Var.b;
        c41 c41Var = this.g;
        j9Var.remove(c41Var);
        if (ym0.b(l41Var.c, c41Var)) {
            c41Var.getClass();
            l41Var.c = null;
        }
        c41Var.getClass();
        c41Var.b.remove(this);
        af0 af0Var = c41Var.c;
        if (af0Var != null) {
            af0Var.a();
        }
        c41Var.c = null;
    }
}
