package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class id0 extends tl2 {
    public final /* synthetic */ ld0 n;

    public id0(ld0 ld0Var) {
        this.n = ld0Var;
    }

    @Override // defpackage.tl2
    public final View B(int i) {
        ld0 ld0Var = this.n;
        View view = ld0Var.M;
        if (view != null) {
            return view.findViewById(i);
        }
        c.n(d51.r("Fragment ", ld0Var, " does not have a view"));
        return null;
    }

    @Override // defpackage.tl2
    public final boolean C() {
        return this.n.M != null;
    }
}
