package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public abstract class ld extends pl {
    public abstract int B0();

    public void C0(View view) {
    }

    @Override // defpackage.i40, defpackage.ld0
    public final void L(Context context) {
        super.L(context);
        context.getApplicationContext();
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(B0(), viewGroup, false);
    }

    @Override // defpackage.i40, defpackage.ld0
    public final void a0() {
        View findViewById;
        super.a0();
        Dialog dialog2 = this.o0;
        if ((dialog2 instanceof ol) && (findViewById = ((ol) dialog2).findViewById(R.id.design_bottom_sheet)) != null) {
            BottomSheetBehavior E = BottomSheetBehavior.E(findViewById);
            E.M(true);
            E.K = false;
            E.O(4);
        }
    }

    @Override // defpackage.ld0
    public final void c0(View view, Bundle bundle) {
        C0(view);
    }

    @Override // defpackage.i40
    public final int w0() {
        return R.style.CustomBottomSheetDialogTheme;
    }

    @Override // defpackage.pl, defpackage.d6, defpackage.i40
    public final Dialog x0() {
        return new ol(i0(), R.style.CustomBottomSheetDialogTheme);
    }
}
