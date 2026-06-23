package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class f40 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ i40 g;

    public f40(i40 i40Var) {
        this.g = i40Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        i40 i40Var = this.g;
        Dialog dialog2 = i40Var.o0;
        if (dialog2 != null) {
            i40Var.onDismiss(dialog2);
        }
    }
}
