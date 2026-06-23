package defpackage;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class kf implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ju0.q0("pm grant --user 0 " + ju0.r0("flar2.devcheck") + " " + ju0.r0("android.permission.BATTERY_STATS"));
    }
}
