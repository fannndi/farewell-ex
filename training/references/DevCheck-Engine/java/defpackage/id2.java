package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class id2 extends hd2 {
    public final Path o;
    public final float[] p;

    public id2(i82 i82Var, gd2 gd2Var, h02 h02Var) {
        super(i82Var, gd2Var, h02Var);
        new Path();
        this.o = new Path();
        this.p = new float[4];
        this.g.setTextAlign(Paint.Align.LEFT);
    }

    @Override // defpackage.pb
    public final void l(float f, float f2) {
        i82 i82Var = (i82) this.f202a;
        RectF rectF = i82Var.b;
        RectF rectF2 = i82Var.b;
        if (rectF.height() > 10.0f && !i82Var.b()) {
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

    @Override // defpackage.hd2
    public final void n(Canvas canvas, float f, float[] fArr, float f2) {
        gd2 gd2Var = this.h;
        gd2Var.getClass();
        Paint paint = this.e;
        paint.setTypeface(null);
        paint.setTextSize(gd2Var.d);
        paint.setColor(gd2Var.e);
        boolean z = gd2Var.B;
        int i = gd2Var.l;
        if (!z) {
            i--;
        }
        for (int i2 = !gd2Var.A ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(gd2Var.c(i2), fArr[i2 * 2], f - f2, paint);
        }
    }

    @Override // defpackage.hd2
    public final RectF o() {
        RectF rectF = ((i82) this.f202a).b;
        RectF rectF2 = this.j;
        rectF2.set(rectF);
        rectF2.inset(-this.b.h, 0.0f);
        return rectF2;
    }

    @Override // defpackage.hd2
    public final float[] p() {
        int length = this.k.length;
        gd2 gd2Var = this.h;
        int i = gd2Var.l;
        if (length != i * 2) {
            this.k = new float[i * 2];
        }
        float[] fArr = this.k;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2] = gd2Var.k[i2 / 2];
        }
        this.c.f(fArr);
        return fArr;
    }

    @Override // defpackage.hd2
    public final Path q(Path path, int i, float[] fArr) {
        float f = fArr[i];
        i82 i82Var = (i82) this.f202a;
        path.moveTo(f, i82Var.b.top);
        path.lineTo(fArr[i], i82Var.b.bottom);
        return path;
    }

    @Override // defpackage.hd2
    public final void r(Canvas canvas) {
        float f;
        i82 i82Var = (i82) this.f202a;
        gd2 gd2Var = this.h;
        if (gd2Var.f53a && gd2Var.q) {
            float[] p = p();
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(gd2Var.d);
            paint.setColor(gd2Var.e);
            paint.setTextAlign(Paint.Align.CENTER);
            float c = n52.c(2.5f);
            float a2 = n52.a(paint, "Q");
            int i = gd2Var.F;
            int i2 = gd2Var.E;
            if (i == 1) {
                f = (i2 == 1 ? i82Var.b.top : i82Var.b.top) - c;
            } else {
                f = (i2 == 1 ? i82Var.b.bottom : i82Var.b.bottom) + a2 + c;
            }
            n(canvas, f, p, gd2Var.c);
        }
    }

    @Override // defpackage.hd2
    public final void s(Canvas canvas) {
        gd2 gd2Var = this.h;
        if (gd2Var.f53a && gd2Var.p) {
            int i = gd2Var.i;
            Paint paint = this.f;
            paint.setColor(i);
            paint.setStrokeWidth(gd2Var.j);
            int i2 = gd2Var.F;
            i82 i82Var = (i82) this.f202a;
            if (i2 == 1) {
                RectF rectF = i82Var.b;
                float f = rectF.left;
                float f2 = rectF.top;
                canvas.drawLine(f, f2, rectF.right, f2, paint);
                return;
            }
            RectF rectF2 = i82Var.b;
            float f3 = rectF2.left;
            float f4 = rectF2.bottom;
            canvas.drawLine(f3, f4, rectF2.right, f4, paint);
        }
    }

    @Override // defpackage.hd2
    public final void u(Canvas canvas) {
        boolean z;
        char c;
        i82 i82Var = (i82) this.f202a;
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.p;
        boolean z2 = false;
        float f = 0.0f;
        fArr[0] = 0.0f;
        char c2 = 1;
        fArr[1] = 0.0f;
        char c3 = 2;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        Path path = this.o;
        path.reset();
        int i = 0;
        while (i < arrayList.size()) {
            kq0 kq0Var = (kq0) arrayList.get(i);
            if (kq0Var.f53a) {
                int save = canvas.save();
                RectF rectF = i82Var.b;
                RectF rectF2 = i82Var.b;
                z = z2;
                RectF rectF3 = this.n;
                rectF3.set(rectF);
                rectF3.inset(-kq0Var.g, f);
                canvas.clipRect(rectF3);
                float f2 = kq0Var.f;
                fArr[z ? 1 : 0] = f2;
                fArr[c3] = f2;
                this.c.f(fArr);
                float f3 = rectF2.top;
                fArr[c2] = f3;
                fArr[3] = rectF2.bottom;
                path.moveTo(fArr[z ? 1 : 0], f3);
                path.lineTo(fArr[c3], fArr[3]);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.g;
                paint.setStyle(style);
                paint.setColor(kq0Var.h);
                paint.setPathEffect(kq0Var.k);
                paint.setStrokeWidth(kq0Var.g);
                canvas.drawPath(path, paint);
                path.reset();
                String str = kq0Var.j;
                if (str == null || str.equals("")) {
                    c = c2;
                } else {
                    paint.setStyle(kq0Var.i);
                    paint.setPathEffect(null);
                    paint.setColor(kq0Var.e);
                    paint.setTypeface(null);
                    paint.setStrokeWidth(0.5f);
                    paint.setTextSize(kq0Var.d);
                    float f4 = kq0Var.g + kq0Var.b;
                    float c4 = n52.c(2.0f) + kq0Var.c;
                    int i2 = kq0Var.l;
                    if (i2 == 3) {
                        float a2 = n52.a(paint, str);
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, fArr[z ? 1 : 0] + f4, rectF2.top + c4 + a2, paint);
                    } else if (i2 == 4) {
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, fArr[z ? 1 : 0] + f4, rectF2.bottom - c4, paint);
                    } else {
                        c = 1;
                        if (i2 == 1) {
                            paint.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, fArr[z ? 1 : 0] - f4, rectF2.top + c4 + n52.a(paint, str), paint);
                        } else {
                            paint.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(str, fArr[z ? 1 : 0] - f4, rectF2.bottom - c4, paint);
                        }
                    }
                    c = 1;
                }
                canvas.restoreToCount(save);
            } else {
                z = z2;
                c = c2;
            }
            i++;
            c2 = c;
            z2 = z;
            f = 0.0f;
            c3 = 2;
        }
    }
}
