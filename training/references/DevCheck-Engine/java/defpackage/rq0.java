package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;

/* loaded from: classes.dex */
public final class rq0 extends f60 {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public Pair o;

    @Override // defpackage.f60
    public final int a() {
        br0 br0Var = this.f265a;
        return (br0Var.l * 2) + br0Var.f96a;
    }

    @Override // defpackage.f60
    public final void b() {
        Path path = this.b;
        path.rewind();
        br0 br0Var = this.f265a;
        if (br0Var.c(this.m)) {
            int i = this.m ? br0Var.j : br0Var.k;
            float f = this.f;
            int i2 = (int) (f / i);
            this.k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, 0.0f, f4, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f, 0.0f);
        }
        this.d.setPath(path, false);
    }

    public final void e(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        float f7;
        Canvas canvas2;
        Pair pair = this.o;
        float j = pr.j(f, 0.0f, 1.0f);
        float j2 = pr.j(f2, 0.0f, 1.0f);
        float L = sl.L(1.0f - this.n, 1.0f, j);
        float L2 = sl.L(1.0f - this.n, 1.0f, j2);
        int j3 = (int) ((pr.j(L, 0.0f, 0.01f) * i2) / 0.01f);
        int j4 = (int) (((1.0f - pr.j(L2, 0.99f, 1.0f)) * i3) / 0.01f);
        float f8 = this.f;
        int i4 = (int) ((L * f8) + j3);
        int i5 = (int) ((L2 * f8) - j4);
        float f9 = this.h;
        float f10 = this.i;
        if (f9 != f10) {
            float max = Math.max(f9, f10);
            float f11 = this.f;
            float f12 = max / f11;
            f5 = sl.L(this.h, this.i, pr.j(i4 / f11, 0.0f, f12) / f12);
            float f13 = this.h;
            float f14 = this.i;
            float f15 = this.f;
            f6 = sl.L(f13, f14, pr.j((f15 - i5) / f15, 0.0f, f12) / f12);
        } else {
            f5 = f9;
            f6 = f5;
        }
        float f16 = (-this.f) / 2.0f;
        br0 br0Var = this.f265a;
        boolean z2 = br0Var.c(this.m) && z && f3 > 0.0f;
        if (i4 <= i5) {
            float f17 = i4 + f5;
            float f18 = i5 - f6;
            float f19 = f5 * 2.0f;
            float f20 = f6 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            ((e60) pair.first).a();
            ((e60) pair.second).a();
            ((e60) pair.first).c(f17 + f16);
            ((e60) pair.second).c(f18 + f16);
            if (i4 == 0 && f18 + f6 < f17 + f5) {
                e60 e60Var = (e60) pair.first;
                float f21 = this.g;
                f(canvas, paint, e60Var, f19, f21, f5, (e60) pair.second, f20, f21, f6, true);
                return;
            }
            if (f17 - f5 > f18 - f6) {
                e60 e60Var2 = (e60) pair.second;
                float f22 = this.g;
                f(canvas, paint, e60Var2, f20, f22, f6, (e60) pair.first, f19, f22, f5, false);
                return;
            }
            float f23 = f6;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap((br0Var.d && br0Var.c == 0.5f && br0Var.b() == br0Var.a()) ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                float f24 = this.f;
                float f25 = f17 / f24;
                float f26 = f18 / f24;
                int i6 = this.m ? br0Var.j : br0Var.k;
                if (i6 != this.l) {
                    this.l = i6;
                    b();
                }
                Path path = this.c;
                path.rewind();
                float f27 = (-this.f) / 2.0f;
                boolean c = br0Var.c(this.m);
                if (c) {
                    float f28 = this.f;
                    f7 = 0.5f;
                    float f29 = this.k;
                    float f30 = f28 / f29;
                    float f31 = f4 / f30;
                    float f32 = f30 / (f30 + 1.0f);
                    f25 = (f25 + f31) * f32;
                    f26 = (f26 + f31) * f32;
                    f27 -= f29 * f4;
                } else {
                    f7 = 0.5f;
                }
                PathMeasure pathMeasure = this.d;
                float length = pathMeasure.getLength() * f25;
                float length2 = pathMeasure.getLength() * f26;
                pathMeasure.getSegment(length, length2, path, true);
                e60 e60Var3 = (e60) pair.first;
                e60Var3.a();
                pathMeasure.getPosTan(length, e60Var3.f223a, e60Var3.b);
                e60 e60Var4 = (e60) pair.second;
                e60Var4.a();
                pathMeasure.getPosTan(length2, e60Var4.f223a, e60Var4.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f27, 0.0f);
                e60Var3.c(f27);
                e60Var4.c(f27);
                if (c) {
                    float f33 = this.j * f3;
                    matrix.postScale(1.0f, f33);
                    e60Var3.b(f33);
                    e60Var4.b(f33);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((e60) pair.first).f223a;
                float f34 = fArr[0];
                float f35 = fArr[1];
                float[] fArr2 = ((e60) pair.second).f223a;
                canvas.drawLine(f34, f35, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                f7 = 0.5f;
            }
            if (br0Var.d && br0Var.c == f7 && br0Var.b() == br0Var.a()) {
                return;
            }
            if (f17 > 0.0f && f5 > 0.0f) {
                f(canvas2, paint, (e60) pair.first, f19, this.g, f5, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f18 >= this.f || f23 <= 0.0f) {
                return;
            }
            f(canvas, paint, (e60) pair.second, f20, this.g, f23, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    public final void f(Canvas canvas, Paint paint, e60 e60Var, float f, float f2, float f3, e60 e60Var2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float min = Math.min(f2, this.g);
        float f9 = (-f) / 2.0f;
        float f10 = (-min) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = min / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (e60Var2 != null) {
            float[] fArr = e60Var2.b;
            float[] fArr2 = e60Var2.f223a;
            float min2 = Math.min(f5, this.g);
            float min3 = Math.min(f4 / 2.0f, (f6 * min2) / this.g);
            RectF rectF2 = new RectF();
            if (z) {
                float f13 = (fArr2[0] - min3) - (e60Var.f223a[0] - f3);
                if (f13 > 0.0f) {
                    e60Var2.c((-f13) / 2.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f10, f11, f12);
            } else {
                float f14 = (fArr2[0] + min3) - (e60Var.f223a[0] + f3);
                if (f14 < 0.0f) {
                    e60Var2.c((-f14) / 2.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, 0.0f, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-min2) / 2.0f, f8 / 2.0f, min2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(f60.d(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-f60.d(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = e60Var.f223a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(f60.d(e60Var.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = e60Var.f223a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(f60.d(e60Var.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    public final void g(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int j = je2.j(i, i2);
        this.m = false;
        e(canvas, paint, f, f2, j, i3, i3, 0.0f, 0.0f, false);
    }
}
