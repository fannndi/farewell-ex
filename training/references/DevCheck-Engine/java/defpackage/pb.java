package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: classes.dex */
public abstract class pb extends dn2 {
    public final ob b;
    public final h02 c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Paint g;

    public pb(i82 i82Var, h02 h02Var, ob obVar) {
        super(i82Var);
        this.c = h02Var;
        this.b = obVar;
        if (i82Var != null) {
            this.e = new Paint(1);
            Paint paint = new Paint();
            this.d = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.g = paint3;
            paint3.setStyle(style);
        }
    }

    public void l(float f, float f2) {
        i82 i82Var = (i82) this.f202a;
        if (i82Var != null) {
            RectF rectF = i82Var.b;
            if (rectF.width() > 10.0f && !i82Var.c()) {
                float f3 = rectF.left;
                float f4 = rectF.top;
                h02 h02Var = this.c;
                ht0 b = h02Var.b(f3, f4);
                ht0 b2 = h02Var.b(rectF.left, rectF.bottom);
                float f5 = (float) b2.i;
                float f6 = (float) b.i;
                ht0.b(b);
                ht0.b(b2);
                f = f5;
                f2 = f6;
            }
        }
        m(f, f2);
    }

    public void m(float f, float f2) {
        double floor;
        int i;
        ob obVar = this.b;
        int i2 = obVar.n;
        double abs = Math.abs(f2 - f);
        if (i2 == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            obVar.k = new float[0];
            obVar.l = 0;
            return;
        }
        double g = n52.g(abs / i2);
        double g2 = n52.g(Math.pow(10.0d, (int) Math.log10(g)));
        if (((int) (g / g2)) > 5) {
            g = Math.floor(g2 * 10.0d);
        }
        double ceil = g == 0.0d ? 0.0d : Math.ceil(f / g) * g;
        if (g == 0.0d) {
            floor = 0.0d;
        } else {
            floor = Math.floor(f2 / g) * g;
            if (floor != Double.POSITIVE_INFINITY) {
                double d = floor + 0.0d;
                floor = Double.longBitsToDouble(Double.doubleToRawLongBits(d) + (d >= 0.0d ? 1L : -1L));
            }
        }
        if (g != 0.0d) {
            i = 0;
            for (double d2 = ceil; d2 <= floor; d2 += g) {
                i++;
            }
        } else {
            i = 0;
        }
        obVar.l = i;
        if (obVar.k.length < i) {
            obVar.k = new float[i];
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (ceil == 0.0d) {
                ceil = 0.0d;
            }
            obVar.k[i3] = (float) ceil;
            ceil += g;
        }
        if (g < 1.0d) {
            obVar.m = (int) Math.ceil(-Math.log10(g));
        } else {
            obVar.m = 0;
        }
    }
}
