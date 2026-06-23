package defpackage;

import android.content.Context;
import android.graphics.Color;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class o70 {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f719a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public o70(Context context) {
        boolean r = md2.r(context, R.attr.elevationOverlayEnabled, false);
        Integer t = je2.t(context, R.attr.elevationOverlayColor);
        int intValue = t != null ? t.intValue() : 0;
        Integer t2 = je2.t(context, R.attr.elevationOverlayAccentColor);
        int intValue2 = t2 != null ? t2.intValue() : 0;
        Integer t3 = je2.t(context, R.attr.colorSurface);
        int intValue3 = t3 != null ? t3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f719a = r;
        this.b = intValue;
        this.c = intValue2;
        this.d = intValue3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.f719a || ts.e(i, 255) != this.d) {
            return i;
        }
        float min = (this.e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int J = je2.J(ts.e(i, 255), min, this.b);
        if (min > 0.0f && (i2 = this.c) != 0) {
            J = ts.b(ts.e(i2, f), J);
        }
        return ts.e(J, alpha);
    }
}
