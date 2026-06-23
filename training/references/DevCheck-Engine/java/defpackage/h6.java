package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f367a;
    public final h70 b;

    public h6(TextView textView) {
        this.f367a = textView;
        h70 h70Var = new h70();
        h70Var.g = new h80(textView);
        this.b = h70Var;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((c3) this.b.g).r(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f367a.getContext().obtainStyledAttributes(attributeSet, zb1.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((c3) this.b.g).L(z);
    }

    public final void d(boolean z) {
        ((c3) this.b.g).N(z);
    }
}
