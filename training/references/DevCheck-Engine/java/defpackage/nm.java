package defpackage;

import android.content.DialogInterface;
import flar2.devcheck.tools.CPUActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class nm implements DialogInterface.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ CPUActivity h;

    public /* synthetic */ nm(CPUActivity cPUActivity, int i) {
        this.g = i;
        this.h = cPUActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.g;
        CPUActivity cPUActivity = this.h;
        switch (i2) {
            case 0:
                int i3 = CPUActivity.J;
                try {
                    cPUActivity.H.dismiss();
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
            default:
                wm wmVar = cPUActivity.I;
                wmVar.d.execute(new vm(wmVar, 0));
                break;
        }
    }
}
