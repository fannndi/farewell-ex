package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class sx1 implements TextWatcher {
    public int g;
    public final /* synthetic */ EditText h;
    public final /* synthetic */ TextInputLayout i;

    public sx1(TextInputLayout textInputLayout, EditText editText) {
        this.i = textInputLayout;
        this.h = editText;
        this.g = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.i;
        textInputLayout.w(!textInputLayout.H0, false);
        if (textInputLayout.r) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.z) {
            textInputLayout.x(editable);
        }
        EditText editText = this.h;
        int lineCount = editText.getLineCount();
        int i = this.g;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.A0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.g = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
