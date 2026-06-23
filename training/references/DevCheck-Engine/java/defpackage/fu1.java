package defpackage;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class fu1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ gu1 h;

    public /* synthetic */ fu1(gu1 gu1Var, int i) {
        this.g = i;
        this.h = gu1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.g;
        gu1 gu1Var = this.h;
        switch (i2) {
            case 0:
                try {
                    gu1Var.g0.dismiss();
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
            default:
                try {
                    gu1Var.g0.dismiss();
                    break;
                } catch (IllegalStateException unused2) {
                    return;
                }
        }
    }
}
