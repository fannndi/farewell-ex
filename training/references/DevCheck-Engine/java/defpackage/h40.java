package defpackage;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
public final class h40 extends tl2 {
    public final /* synthetic */ id0 n;
    public final /* synthetic */ i40 o;

    public h40(i40 i40Var, id0 id0Var) {
        this.o = i40Var;
        this.n = id0Var;
    }

    @Override // defpackage.tl2
    public final View B(int i) {
        id0 id0Var = this.n;
        if (id0Var.C()) {
            return id0Var.B(i);
        }
        Dialog dialog2 = this.o.o0;
        if (dialog2 != null) {
            return dialog2.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.tl2
    public final boolean C() {
        return this.n.C() || this.o.s0;
    }
}
