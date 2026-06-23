package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class j80 implements TextWatcher {
    public final EditText g;
    public i80 h;
    public boolean i = true;

    public j80(EditText editText) {
        this.g = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            u70 a2 = u70.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.g;
        if (editText.isInEditMode() || !this.i || u70.k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b = u70.a().b();
        if (b != 0) {
            if (b == 1) {
                u70.a().e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (b != 3) {
                return;
            }
        }
        u70 a2 = u70.a();
        if (this.h == null) {
            this.h = new i80(editText);
        }
        a2.f(this.h);
    }
}
