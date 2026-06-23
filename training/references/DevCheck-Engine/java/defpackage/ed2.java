package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ed2 extends pb {
    public final dd2 h;
    public final Path i;
    public float[] j;
    public final RectF k;
    public final float[] l;
    public final RectF m;
    public final float[] n;
    public final Path o;

    public ed2(i82 i82Var, dd2 dd2Var, h02 h02Var) {
        super(i82Var, h02Var, dd2Var);
        this.i = new Path();
        this.j = new float[2];
        this.k = new RectF();
        this.l = new float[2];
        this.m = new RectF();
        this.n = new float[4];
        this.o = new Path();
        this.h = dd2Var;
        this.e.setColor(-16777216);
        this.e.setTextAlign(Paint.Align.CENTER);
        this.e.setTextSize(n52.c(10.0f));
    }

    @Override // defpackage.pb
    public void l(float f, float f2) {
        i82 i82Var = (i82) this.f202a;
        RectF rectF = i82Var.b;
        RectF rectF2 = i82Var.b;
        if (rectF.width() > 10.0f && !i82Var.b()) {
            float f3 = rectF2.left;
            float f4 = rectF2.top;
            h02 h02Var = this.c;
            ht0 b = h02Var.b(f3, f4);
            ht0 b2 = h02Var.b(rectF2.right, rectF2.top);
            float f5 = (float) b.h;
            float f6 = (float) b2.h;
            ht0.b(b);
            ht0.b(b2);
            f = f5;
            f2 = f6;
        }
        m(f, f2);
    }

    @Override // defpackage.pb
    public final void m(float f, float f2) {
        super.m(f, f2);
        n();
    }

    public void n() {
        dd2 dd2Var = this.h;
        String d = dd2Var.d();
        Paint paint = this.e;
        paint.setTypeface(null);
        paint.setTextSize(dd2Var.d);
        ra0 b = n52.b(paint, d);
        float f = b.h;
        float a2 = n52.a(paint, "Q");
        ra0 e = n52.e(f, a2);
        Math.round(f);
        Math.round(a2);
        dd2Var.A = Math.round(e.h);
        dd2Var.B = Math.round(e.i);
        p31 p31Var = ra0.j;
        p31Var.c(e);
        p31Var.c(b);
    }

    public void o(Canvas canvas, float f, float f2, Path path) {
        i82 i82Var = (i82) this.f202a;
        path.moveTo(f, i82Var.b.bottom);
        path.lineTo(f, i82Var.b.top);
        canvas.drawPath(path, this.d);
        path.reset();
    }

    public void p(Canvas canvas, float f, it0 it0Var) {
        Canvas canvas2;
        float f2;
        it0 it0Var2;
        dd2 dd2Var = this.h;
        dd2Var.getClass();
        int i = dd2Var.l * 2;
        float[] fArr = new float[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            fArr[i3] = dd2Var.k[i3 / 2];
        }
        this.c.f(fArr);
        while (i2 < i) {
            float f3 = fArr[i2];
            i82 i82Var = (i82) this.f202a;
            if (i82Var.e(f3) && i82Var.f(f3)) {
                canvas2 = canvas;
                f2 = f;
                it0Var2 = it0Var;
                n52.d(canvas2, dd2Var.e().a(dd2Var.k[i2 / 2]), f3, f2, this.e, it0Var2);
            } else {
                canvas2 = canvas;
                f2 = f;
                it0Var2 = it0Var;
            }
            i2 += 2;
            canvas = canvas2;
            f = f2;
            it0Var = it0Var2;
        }
    }

    public RectF q() {
        RectF rectF = ((i82) this.f202a).b;
        RectF rectF2 = this.k;
        rectF2.set(rectF);
        rectF2.inset(-this.b.h, 0.0f);
        return rectF2;
    }

    public void r(Canvas canvas) {
        i82 i82Var = (i82) this.f202a;
        dd2 dd2Var = this.h;
        if (dd2Var.f53a && dd2Var.q) {
            float f = dd2Var.c;
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(dd2Var.d);
            paint.setColor(dd2Var.e);
            it0 b = it0.b(0.0f, 0.0f);
            int i = dd2Var.C;
            if (i == 1) {
                b.h = 0.5f;
                b.i = 1.0f;
                p(canvas, i82Var.b.top - f, b);
            } else if (i == 4) {
                b.h = 0.5f;
                b.i = 1.0f;
                p(canvas, i82Var.b.top + f + dd2Var.B, b);
            } else if (i == 2) {
                b.h = 0.5f;
                b.i = 0.0f;
                p(canvas, i82Var.b.bottom + f, b);
            } else if (i == 5) {
                b.h = 0.5f;
                b.i = 0.0f;
                p(canvas, (i82Var.b.bottom - f) - dd2Var.B, b);
            } else {
                b.h = 0.5f;
                b.i = 1.0f;
                p(canvas, i82Var.b.top - f, b);
                b.h = 0.5f;
                b.i = 0.0f;
                p(canvas, i82Var.b.bottom + f, b);
            }
            it0.d(b);
        }
    }

    public void s(Canvas canvas) {
        Canvas canvas2;
        i82 i82Var = (i82) this.f202a;
        dd2 dd2Var = this.h;
        if (dd2Var.p && dd2Var.f53a) {
            int i = dd2Var.i;
            Paint paint = this.f;
            paint.setColor(i);
            paint.setStrokeWidth(dd2Var.j);
            paint.setPathEffect(null);
            int i2 = dd2Var.C;
            if (i2 == 1 || i2 == 4 || i2 == 3) {
                RectF rectF = i82Var.b;
                float f = rectF.left;
                float f2 = rectF.top;
                canvas2 = canvas;
                canvas2.drawLine(f, f2, rectF.right, f2, paint);
            } else {
                canvas2 = canvas;
            }
            int i3 = dd2Var.C;
            if (i3 == 2 || i3 == 5 || i3 == 3) {
                RectF rectF2 = i82Var.b;
                float f3 = rectF2.left;
                float f4 = rectF2.bottom;
                canvas2.drawLine(f3, f4, rectF2.right, f4, paint);
            }
        }
    }

    public final void t(Canvas canvas) {
        dd2 dd2Var = this.h;
        if (dd2Var.o && dd2Var.f53a) {
            int save = canvas.save();
            canvas.clipRect(q());
            if (this.j.length != this.b.l * 2) {
                this.j = new float[dd2Var.l * 2];
            }
            float[] fArr = this.j;
            for (int i = 0; i < fArr.length; i += 2) {
                float[] fArr2 = dd2Var.k;
                int i2 = i / 2;
                fArr[i] = fArr2[i2];
                fArr[i + 1] = fArr2[i2];
            }
            this.c.f(fArr);
            int i3 = dd2Var.g;
            Paint paint = this.d;
            paint.setColor(i3);
            paint.setStrokeWidth(dd2Var.h);
            paint.setPathEffect(null);
            Path path = this.i;
            path.reset();
            for (int i4 = 0; i4 < fArr.length; i4 += 2) {
                o(canvas, fArr[i4], fArr[i4 + 1], path);
            }
            canvas.restoreToCount(save);
        }
    }

    public void u(Canvas canvas) {
        char c;
        i82 i82Var = (i82) this.f202a;
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.l;
        char c2 = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        int i = 0;
        while (i < arrayList.size()) {
            kq0 kq0Var = (kq0) arrayList.get(i);
            if (kq0Var.f53a) {
                int save = canvas.save();
                RectF rectF = i82Var.b;
                RectF rectF2 = i82Var.b;
                RectF rectF3 = this.m;
                rectF3.set(rectF);
                rectF3.inset(-kq0Var.g, f);
                canvas.clipRect(rectF3);
                fArr[c2] = kq0Var.f;
                fArr[1] = f;
                this.c.f(fArr);
                float f2 = fArr[c2];
                float[] fArr2 = this.n;
                fArr2[c2] = f2;
                fArr2[1] = rectF2.top;
                fArr2[2] = fArr[c2];
                fArr2[3] = rectF2.bottom;
                Path path = this.o;
                path.reset();
                c = c2;
                path.moveTo(fArr2[c], fArr2[1]);
                path.lineTo(fArr2[2], fArr2[3]);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.g;
                paint.setStyle(style);
                paint.setColor(kq0Var.h);
                paint.setStrokeWidth(kq0Var.g);
                paint.setPathEffect(kq0Var.k);
                canvas.drawPath(path, paint);
                float f3 = kq0Var.c + 2.0f;
                String str = kq0Var.j;
                if (str != null && !str.equals("")) {
                    paint.setStyle(kq0Var.i);
                    paint.setPathEffect(null);
                    paint.setColor(kq0Var.e);
                    paint.setStrokeWidth(0.5f);
                    paint.setTextSize(kq0Var.d);
                    float f4 = kq0Var.g + kq0Var.b;
                    int i2 = kq0Var.l;
                    if (i2 == 3) {
                        float a2 = n52.a(paint, str);
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, fArr[c] + f4, rectF2.top + f3 + a2, paint);
                    } else if (i2 == 4) {
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, fArr[c] + f4, rectF2.bottom - f3, paint);
                    } else if (i2 == 1) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, fArr[c] - f4, rectF2.top + f3 + n52.a(paint, str), paint);
                    } else {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, fArr[c] - f4, rectF2.bottom - f3, paint);
                    }
                }
                canvas.restoreToCount(save);
            } else {
                c = c2;
            }
            i++;
            c2 = c;
            f = 0.0f;
        }
    }
}
