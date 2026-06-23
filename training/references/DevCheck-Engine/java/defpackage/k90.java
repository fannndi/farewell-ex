package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class k90 extends DialogFragment {
    public Dialog g;
    public DialogInterface.OnCancelListener h;
    public AlertDialog i;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.h;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog2 = this.g;
        if (dialog2 != null) {
            return dialog2;
        }
        setShowsDialog(false);
        if (this.i == null) {
            Activity activity = getActivity();
            xc1.j(activity);
            this.i = new AlertDialog.Builder(activity).create();
        }
        return this.i;
    }
}
