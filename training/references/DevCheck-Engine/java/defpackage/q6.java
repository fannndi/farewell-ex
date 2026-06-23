package defpackage;

/* loaded from: classes.dex */
public final class q6 extends fd0 {
    public final /* synthetic */ w6 p;
    public final /* synthetic */ z6 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(z6 z6Var, z6 z6Var2, w6 w6Var) {
        super(z6Var2);
        this.q = z6Var;
        this.p = w6Var;
    }

    @Override // defpackage.fd0
    public final ro1 b() {
        return this.p;
    }

    @Override // defpackage.fd0
    public final boolean c() {
        z6 z6Var = this.q;
        if (z6Var.getInternalPopup().b()) {
            return true;
        }
        z6Var.l.m(z6Var.getTextDirection(), z6Var.getTextAlignment());
        return true;
    }
}
