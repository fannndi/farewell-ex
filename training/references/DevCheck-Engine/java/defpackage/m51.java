package defpackage;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final /* synthetic */ class m51 implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        try {
            BottomSheetBehavior.E((FrameLayout) ((bl) dialogInterface).findViewById(R.id.bottom_sheet_drawer)).O(3);
        } catch (Exception unused) {
        }
    }
}
