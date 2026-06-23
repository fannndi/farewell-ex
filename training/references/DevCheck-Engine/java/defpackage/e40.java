package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class e40 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ i40 g;

    public e40(i40 i40Var) {
        this.g = i40Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        i40 i40Var = this.g;
        Dialog dialog2 = i40Var.o0;
        if (dialog2 != null) {
            i40Var.onCancel(dialog2);
        }
    }
}
