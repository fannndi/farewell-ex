package defpackage;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class gd2 extends ob {
    public final int F;
    public final boolean A = true;
    public final boolean B = true;
    public final float C = 10.0f;
    public final float D = 10.0f;
    public final int E = 1;
    public final float G = Float.POSITIVE_INFINITY;

    public gd2(int i) {
        this.F = i;
        this.c = 0.0f;
    }

    @Override // defpackage.ob
    public final void b(float f, float f2) {
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float abs = Math.abs(f2 - f);
        float f3 = this.v ? this.y : f - ((abs / 100.0f) * this.D);
        this.y = f3;
        float f4 = this.w ? this.x : f2 + ((abs / 100.0f) * this.C);
        this.x = f4;
        this.z = Math.abs(f3 - f4);
    }

    public final float f(Paint paint) {
        paint.setTextSize(this.d);
        String d = d();
        DisplayMetrics displayMetrics = n52.f665a;
        float measureText = (this.b * 2.0f) + ((int) paint.measureText(d));
        float f = this.G;
        if (f > 0.0f && f != Float.POSITIVE_INFINITY) {
            f = n52.c(f);
        }
        if (f <= 0.0d) {
            f = measureText;
        }
        return Math.max(0.0f, Math.min(measureText, f));
    }

    public final boolean g() {
        return this.f53a && this.q && this.E == 1;
    }
}
