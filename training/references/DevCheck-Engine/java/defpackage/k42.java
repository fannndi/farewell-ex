package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class k42 implements Spannable {
    public boolean g = false;
    public Spannable h;

    public k42(Spannable spannable) {
        this.h = spannable;
    }

    public final void a() {
        Spannable spannable = this.h;
        if (!this.g) {
            if ((Build.VERSION.SDK_INT < 28 ? new i42() : new j42()).a(spannable)) {
                this.h = new SpannableString(spannable);
            }
        }
        this.g = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.h.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.h.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.h.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.h.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.h.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.h.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.h.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.h.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.h.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.h.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.h.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.h.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.h.toString();
    }
}
