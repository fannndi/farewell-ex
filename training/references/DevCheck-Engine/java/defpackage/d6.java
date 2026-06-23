package defpackage;

import android.app.Dialog;

/* loaded from: classes.dex */
public class d6 extends i40 {
    @Override // defpackage.i40
    public Dialog x0() {
        return new c6(v(), w0());
    }

    @Override // defpackage.i40
    public final void y0(Dialog dialog2, int i) {
        if (!(dialog2 instanceof c6)) {
            super.y0(dialog2, i);
            return;
        }
        c6 c6Var = (c6) dialog2;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog2.getWindow().addFlags(24);
            }
        }
        c6Var.d().i(1);
    }
}
