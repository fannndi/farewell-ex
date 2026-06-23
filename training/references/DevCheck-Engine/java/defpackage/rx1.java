package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class rx1 {
    public float c;
    public float d;
    public final WeakReference f;
    public ox1 g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f910a = new TextPaint(1);
    public final bq b = new bq(1, this);
    public boolean e = true;

    public rx1(qx1 qx1Var) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(qx1Var);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.f910a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void c(ox1 ox1Var, Context context) {
        if (this.g != ox1Var) {
            this.g = ox1Var;
            WeakReference weakReference = this.f;
            if (ox1Var != null) {
                TextPaint textPaint = this.f910a;
                bq bqVar = this.b;
                ox1Var.e(context, textPaint, bqVar);
                qx1 qx1Var = (qx1) weakReference.get();
                if (qx1Var != null) {
                    textPaint.drawableState = qx1Var.getState();
                }
                ox1Var.d(context, textPaint, bqVar);
                this.e = true;
            }
            qx1 qx1Var2 = (qx1) weakReference.get();
            if (qx1Var2 != null) {
                qx1Var2.a();
                qx1Var2.onStateChange(qx1Var2.getState());
            }
        }
    }
}
