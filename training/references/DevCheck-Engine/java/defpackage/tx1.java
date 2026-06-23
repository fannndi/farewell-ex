package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class tx1 extends o0 {
    public final TextInputLayout d;

    public tx1(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.o0
    public final void d(View view, c1 c1Var) {
        CharSequence charSequence;
        CharSequence charSequence2;
        AccessibilityNodeInfo accessibilityNodeInfo = c1Var.f104a;
        this.f709a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.B0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence3 = !isEmpty2 ? hint.toString() : "";
        if (TextUtils.isEmpty(helperText)) {
            charSequence = error;
            charSequence2 = counterOverflowDescription;
        } else {
            bm0 bm0Var = textInputLayout.q;
            charSequence = error;
            charSequence2 = counterOverflowDescription;
            if (bm0Var.o == 2 && bm0Var.y != null && !TextUtils.isEmpty(bm0Var.w)) {
                if (TextUtils.isEmpty(charSequence3)) {
                    charSequence3 = helperText.toString();
                } else {
                    charSequence3 = charSequence3 + ", " + ((Object) helperText);
                }
            }
        }
        uq1 uq1Var = textInputLayout.h;
        AppCompatTextView appCompatTextView = uq1Var.h;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uq1Var.j);
        }
        if (!isEmpty) {
            c1Var.m(text);
        } else if (!TextUtils.isEmpty(charSequence3)) {
            c1Var.m(charSequence3);
            if (!z && placeholderText != null) {
                c1Var.m(charSequence3 + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            c1Var.m(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                c1Var.k(charSequence3);
            } else {
                if (!isEmpty) {
                    charSequence3 = ((Object) text) + ", " + charSequence3;
                }
                c1Var.m(charSequence3);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                c1Var.g(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            accessibilityNodeInfo.setError(!isEmpty3 ? charSequence : charSequence2);
        }
        textInputLayout.i.b().m(c1Var);
    }

    @Override // defpackage.o0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.i.b().n(accessibilityEvent);
    }
}
