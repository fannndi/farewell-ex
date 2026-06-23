package defpackage;

/* loaded from: classes.dex */
public final class g21 extends pd {
    public final int b;

    static {
        ai1.k("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g21(q21 q21Var) {
        super(q21Var);
        q21Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.gv
    public final boolean b(gc2 gc2Var) {
        gc2Var.getClass();
        return gc2Var.j.f609a == r21.j;
    }

    @Override // defpackage.pd
    public final int d() {
        return this.b;
    }

    @Override // defpackage.pd
    public final boolean e(Object obj) {
        o21 o21Var = (o21) obj;
        o21Var.getClass();
        return (o21Var.f714a && o21Var.d && !o21Var.e) ? false : true;
    }
}
