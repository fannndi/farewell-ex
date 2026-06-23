package defpackage;

/* loaded from: classes.dex */
public final class ug1 extends vn0 {
    public final yn0 n;

    public ug1(yn0 yn0Var) {
        this.n = yn0Var;
    }

    @Override // defpackage.vn0
    public final boolean r() {
        return false;
    }

    @Override // defpackage.vn0
    public final void s(Throwable th) {
        Object I = q().I();
        boolean z = I instanceof ot;
        yn0 yn0Var = this.n;
        if (!z) {
            yn0Var.g(co0.a(I));
            return;
        }
        Throwable th2 = ((ot) I).f756a;
        th2.getClass();
        yn0Var.g(new pg1(th2));
    }
}
