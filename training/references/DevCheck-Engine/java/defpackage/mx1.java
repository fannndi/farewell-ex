package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class mx1 extends sl {
    public final /* synthetic */ je2 u;
    public final /* synthetic */ ox1 v;

    public mx1(ox1 ox1Var, je2 je2Var) {
        super(14);
        this.v = ox1Var;
        this.u = je2Var;
    }

    @Override // defpackage.sl
    public final void T(int i) {
        this.v.n = true;
        this.u.L(i);
    }

    @Override // defpackage.sl
    public final void U(Typeface typeface) {
        ox1 ox1Var = this.v;
        Typeface create = Typeface.create(typeface, ox1Var.d);
        ox1Var.p = create;
        ox1Var.n = true;
        this.u.M(create, false);
    }
}
