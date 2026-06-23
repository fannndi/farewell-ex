package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public class ly0 extends s81 {
    public final HashSet B0 = new HashSet();
    public boolean C0;
    public CharSequence[] D0;
    public CharSequence[] E0;

    @Override // defpackage.s81
    public final void C0(boolean z) {
        if (z && this.C0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A0();
            multiSelectListPreference.getClass();
            multiSelectListPreference.w(this.B0);
        }
        this.C0 = false;
    }

    @Override // defpackage.s81
    public final void D0(th2 th2Var) {
        int length = this.E0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.B0.contains(this.E0[i].toString());
        }
        CharSequence[] charSequenceArr = this.D0;
        ky0 ky0Var = new ky0(this);
        j3 j3Var = (j3) th2Var.h;
        j3Var.p = charSequenceArr;
        j3Var.x = ky0Var;
        j3Var.t = zArr;
        j3Var.u = true;
    }

    @Override // defpackage.s81, defpackage.i40, defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        HashSet hashSet = this.B0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.C0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.D0 = bundle.getCharSequenceArray(XmJDY.zmWSmRpCRb);
            this.E0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) A0();
        CharSequence[] charSequenceArr = multiSelectListPreference.Y;
        CharSequence[] charSequenceArr2 = multiSelectListPreference.Z;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            c.n("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.a0);
        this.C0 = false;
        this.D0 = multiSelectListPreference.Y;
        this.E0 = charSequenceArr2;
    }

    @Override // defpackage.s81, defpackage.i40, defpackage.ld0
    public final void Z(Bundle bundle) {
        super.Z(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.B0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.C0);
        bundle.putCharSequenceArray(IGQCApxXGMWo.wxAnNAm, this.D0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.E0);
    }
}
