package defpackage;

import android.app.Dialog;

/* loaded from: classes.dex */
public class pl extends d6 {
    public final void A0() {
        Dialog dialog2 = this.o0;
        if (dialog2 instanceof ol) {
            ol olVar = (ol) dialog2;
            if (olVar.l == null) {
                olVar.f();
            }
            boolean z = olVar.l.J;
        }
        v0(false, false);
    }

    @Override // defpackage.d6, defpackage.i40
    public Dialog x0() {
        return new ol(v(), w0());
    }
}
