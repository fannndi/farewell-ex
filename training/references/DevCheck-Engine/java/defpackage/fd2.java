package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class fd2 extends ed2 {
    public final Path p;

    public fd2(i82 i82Var, dd2 dd2Var, h02 h02Var) {
        super(i82Var, dd2Var, h02Var);
        this.p = new Path();
    }

    @Override // defpackage.ed2, defpackage.pb
    public final void l(float f, float f2) {
        i82 i82Var = (i82) this.f202a;
        RectF rectF = i82Var.b;
        RectF rectF2 = i82Var.b;
        if (rectF.width() > 10.0f && !i82Var.c()) {
            float f3 = rectF2.left;
            float f4 = rectF2.bottom;
            h02 h02Var = this.c;
            ht0 b = h02Var.b(f3, f4);
            ht0 b2 = h02Var.b(rectF2.left, rectF2.top);
            float f5 = (float) b.i;
            float f6 = (float) b2.i;
            ht0.b(b);
            ht0.b(b2);
            f = f5;
            f2 = f6;
        }
        m(f, f2);
    }

    @Override // defpackage.ed2
    public final void n() {
        dd2 dd2Var = this.h;
        dd2Var.getClass();
        Paint paint = this.e;
        paint.setTypeface(null);
        paint.setTextSize(dd2Var.d);
        ra0 b = n52.b(paint, dd2Var.d());
        float f = b.h;
        float f2 = (int) ((dd2Var.b * 3.5f) + f);
        float f3 = b.i;
        ra0 e = n52.e(f, f3);
        Math.round(f2);
        Math.round(f3);
        dd2Var.A = (int) ((dd2Var.b * 3.5f) + e.h);
        dd2Var.B = Math.round(e.i);
        ra0.j.c(e);
    }

    @Override // defpackage.ed2
    public final void o(Canvas canvas, float f, float f2, Path path) {
        i82 i82Var = (i82) this.f202a;
        path.moveTo(i82Var.b.right, f2);
        path.lineTo(i82Var.b.left, f2);
        canvas.drawPath(path, this.d);
        path.reset();
    }

    @Override // defpackage.ed2
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
            fArr[i3 + 1] = dd2Var.k[i3 / 2];
        }
        this.c.f(fArr);
        while (i2 < i) {
            float f3 = fArr[i2 + 1];
            if (((i82) this.f202a).h(f3)) {
                canvas2 = canvas;
                f2 = f;
                it0Var2 = it0Var;
                n52.d(canvas2, dd2Var.e().a(dd2Var.k[i2 / 2]), f2, f3, this.e, it0Var2);
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

    @Override // defpackage.ed2
    public final RectF q() {
        RectF rectF = ((i82) this.f202a).b;
        RectF rectF2 = this.k;
        rectF2.set(rectF);
        rectF2.inset(0.0f, -this.b.h);
        return rectF2;
    }

    @Override // defpackage.ed2
    public final void r(Canvas canvas) {
        i82 i82Var = (i82) this.f202a;
        dd2 dd2Var = this.h;
        if (dd2Var.f53a && dd2Var.q) {
            float f = dd2Var.b;
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(dd2Var.d);
            paint.setColor(dd2Var.e);
            it0 b = it0.b(0.0f, 0.0f);
            int i = dd2Var.C;
            if (i == 1) {
                b.h = 0.0f;
                b.i = 0.5f;
                p(canvas, i82Var.b.right + f, b);
            } else if (i == 4) {
                b.h = 1.0f;
                b.i = 0.5f;
                p(canvas, i82Var.b.right - f, b);
            } else if (i == 2) {
                b.h = 1.0f;
                b.i = 0.5f;
                p(canvas, i82Var.b.left - f, b);
            } else if (i == 5) {
                b.h = 1.0f;
                b.i = 0.5f;
                p(canvas, i82Var.b.left + f, b);
            } else {
                b.h = 0.0f;
                b.i = 0.5f;
                p(canvas, i82Var.b.right + f, b);
                b.h = 1.0f;
                b.i = 0.5f;
                p(canvas, i82Var.b.left - f, b);
            }
            it0.d(b);
        }
    }

    @Override // defpackage.ed2
    public final void s(Canvas canvas) {
        Canvas canvas2;
        i82 i82Var = (i82) this.f202a;
        dd2 dd2Var = this.h;
        if (dd2Var.p && dd2Var.f53a) {
            int i = dd2Var.i;
            Paint paint = this.f;
            paint.setColor(i);
            paint.setStrokeWidth(dd2Var.j);
            int i2 = dd2Var.C;
            if (i2 == 1 || i2 == 4 || i2 == 3) {
                RectF rectF = i82Var.b;
                float f = rectF.right;
                canvas2 = canvas;
                canvas2.drawLine(f, rectF.top, f, rectF.bottom, paint);
            } else {
                canvas2 = canvas;
            }
            int i3 = dd2Var.C;
            if (i3 == 2 || i3 == 5 || i3 == 3) {
                RectF rectF2 = i82Var.b;
                float f2 = rectF2.left;
                canvas2.drawLine(f2, rectF2.top, f2, rectF2.bottom, paint);
            }
        }
    }

    @Override // defpackage.ed2
    public final void u(Canvas canvas) {
        int i;
        i82 i82Var = (i82) this.f202a;
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.l;
        int i2 = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        int i3 = 1;
        fArr[1] = 0.0f;
        Path path = this.p;
        path.reset();
        while (i2 < arrayList.size()) {
            kq0 kq0Var = (kq0) arrayList.get(i2);
            if (kq0Var.f53a) {
                int save = canvas.save();
                RectF rectF = i82Var.b;
                RectF rectF2 = i82Var.b;
                RectF rectF3 = this.m;
                rectF3.set(rectF);
                rectF3.inset(f, -kq0Var.g);
                canvas.clipRect(rectF3);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.g;
                paint.setStyle(style);
                paint.setColor(kq0Var.h);
                paint.setStrokeWidth(kq0Var.g);
                paint.setPathEffect(kq0Var.k);
                fArr[i3] = kq0Var.f;
                this.c.f(fArr);
                path.moveTo(rectF2.left, fArr[i3]);
                path.lineTo(rectF2.right, fArr[i3]);
                canvas.drawPath(path, paint);
                path.reset();
                String str = kq0Var.j;
                if (str == null || str.equals("")) {
                    i = i3;
                } else {
                    paint.setStyle(kq0Var.i);
                    paint.setPathEffect(null);
                    paint.setColor(kq0Var.e);
                    paint.setStrokeWidth(0.5f);
                    paint.setTextSize(kq0Var.d);
                    float a2 = n52.a(paint, str);
                    float c = n52.c(4.0f) + kq0Var.b;
                    int i4 = i3;
                    float f2 = kq0Var.g + a2 + kq0Var.c;
                    int i5 = kq0Var.l;
                    if (i5 == 3) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, rectF2.right - c, (fArr[i4] - f2) + a2, paint);
                    } else if (i5 == 4) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, rectF2.right - c, fArr[i4] + f2, paint);
                    } else {
                        i = i4;
                        if (i5 == i) {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, rectF2.left + c, (fArr[i] - f2) + a2, paint);
                        } else {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, rectF2.left + c, fArr[i] + f2, paint);
                        }
                    }
                    i = i4;
                }
                canvas.restoreToCount(save);
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
            f = 0.0f;
        }
    }
}
