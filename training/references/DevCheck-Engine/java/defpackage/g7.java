package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g7 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f321a;
    public wu b;
    public wu c;
    public wu d;
    public wu e;
    public wu f;
    public wu g;
    public wu h;
    public final o7 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public g7(TextView textView) {
        this.f321a = textView;
        this.i = new o7(textView);
    }

    public static wu c(Context context, e6 e6Var, int i) {
        ColorStateList f;
        synchronized (e6Var) {
            f = e6Var.f222a.f(context, i);
        }
        if (f == null) {
            return null;
        }
        wu wuVar = new wu();
        wuVar.b = true;
        wuVar.c = f;
        return wuVar;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            w0.f(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            w0.f(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            c3.O(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            c3.O(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            c3.O(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        c3.O(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public final void a(Drawable drawable, wu wuVar) {
        if (drawable == null || wuVar == null) {
            return;
        }
        e6.e(drawable, wuVar, this.f321a.getDrawableState());
    }

    public final void b() {
        wu wuVar = this.b;
        TextView textView = this.f321a;
        if (wuVar != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        wu wuVar = this.h;
        if (wuVar != null) {
            return (ColorStateList) wuVar.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        wu wuVar = this.h;
        if (wuVar != null) {
            return (PorterDuff.Mode) wuVar.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, zb1.x);
        fh fhVar = new fh(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f321a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, fhVar);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            e7.d(textView, string);
        }
        fhVar.L();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        o7 o7Var = this.i;
        if (o7Var.i()) {
            DisplayMetrics displayMetrics = o7Var.j.getResources().getDisplayMetrics();
            o7Var.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (o7Var.g()) {
                o7Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        o7 o7Var = this.i;
        if (o7Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = o7Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                o7Var.f = o7.b(iArr2);
                if (!o7Var.h()) {
                    rw.g("None of the preset sizes is valid: ", Arrays.toString(iArr));
                    return;
                }
            } else {
                o7Var.g = false;
            }
            if (o7Var.g()) {
                o7Var.a();
            }
        }
    }

    public final void k(int i) {
        o7 o7Var = this.i;
        if (o7Var.i()) {
            if (i == 0) {
                o7Var.f718a = 0;
                o7Var.d = -1.0f;
                o7Var.e = -1.0f;
                o7Var.c = -1.0f;
                o7Var.f = new int[0];
                o7Var.b = false;
                return;
            }
            if (i != 1) {
                c.m(d51.q("Unknown auto-size text type: ", i));
                return;
            }
            DisplayMetrics displayMetrics = o7Var.j.getResources().getDisplayMetrics();
            o7Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (o7Var.g()) {
                o7Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new wu();
        }
        wu wuVar = this.h;
        wuVar.c = colorStateList;
        wuVar.b = colorStateList != null;
        this.b = wuVar;
        this.c = wuVar;
        this.d = wuVar;
        this.e = wuVar;
        this.f = wuVar;
        this.g = wuVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new wu();
        }
        wu wuVar = this.h;
        wuVar.d = mode;
        wuVar.f1148a = mode != null;
        this.b = wuVar;
        this.c = wuVar;
        this.d = wuVar;
        this.e = wuVar;
        this.f = wuVar;
        this.g = wuVar;
    }

    public final void n(Context context, fh fhVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) fhVar.i;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface y = fhVar.y(i5, this.j, new b7(this, i6, i7, new WeakReference(this.f321a)));
                if (y != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = y;
                    } else {
                        this.l = f7.a(Typeface.create(y, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = f7.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
