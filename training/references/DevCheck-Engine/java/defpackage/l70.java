package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* loaded from: classes.dex */
public class l70 extends s81 {
    public EditText B0;
    public CharSequence C0;
    public final wa D0 = new wa(9, this);
    public long E0 = -1;

    @Override // defpackage.s81
    public final void B0(View view) {
        super.B0(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.B0 = editText;
        if (editText == null) {
            c.n("Dialog view must contain an EditText with id @android:id/edit");
            return;
        }
        editText.requestFocus();
        this.B0.setText(this.C0);
        EditText editText2 = this.B0;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) A0()).getClass();
    }

    @Override // defpackage.s81
    public final void C0(boolean z) {
        if (z) {
            String obj = this.B0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) A0();
            editTextPreference.getClass();
            editTextPreference.w(obj);
        }
    }

    public final void E0() {
        long j = this.E0;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.B0;
        if (editText == null || !editText.isFocused()) {
            this.E0 = -1L;
            return;
        }
        if (((InputMethodManager) this.B0.getContext().getSystemService("input_method")).showSoftInput(this.B0, 0)) {
            this.E0 = -1L;
            return;
        }
        EditText editText2 = this.B0;
        wa waVar = this.D0;
        editText2.removeCallbacks(waVar);
        this.B0.postDelayed(waVar, 50L);
    }

    @Override // defpackage.s81, defpackage.i40, defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (bundle == null) {
            this.C0 = ((EditTextPreference) A0()).Y;
        } else {
            this.C0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.s81, defpackage.i40, defpackage.ld0
    public final void Z(Bundle bundle) {
        super.Z(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.C0);
    }
}
