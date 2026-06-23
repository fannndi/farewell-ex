package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class i82 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f417a = new Matrix();
    public final RectF b = new RectF();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public float f = Float.MAX_VALUE;
    public float g = 1.0f;
    public float h = Float.MAX_VALUE;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = 0.0f;
    public float l = 0.0f;
    public float m = 0.0f;
    public final Matrix n = new Matrix();
    public final float[] o = new float[9];

    public final void a(float[] fArr, View view) {
        Matrix matrix = this.n;
        matrix.reset();
        matrix.set(this.f417a);
        float f = fArr[0];
        RectF rectF = this.b;
        matrix.postTranslate(-(f - rectF.left), -(fArr[1] - rectF.top));
        k(matrix, view, true);
    }

    public final boolean b() {
        float f = this.i;
        float f2 = this.g;
        return f <= f2 && f2 <= 1.0f;
    }

    public final boolean c() {
        float f = this.j;
        float f2 = this.e;
        return f <= f2 && f2 <= 1.0f;
    }

    public final boolean d(float f) {
        return this.b.bottom >= ((float) ((int) (f * 100.0f))) / 100.0f;
    }

    public final boolean e(float f) {
        return this.b.left <= f + 1.0f;
    }

    public final boolean f(float f) {
        return this.b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public final boolean g(float f) {
        return this.b.top <= f;
    }

    public final boolean h(float f) {
        return g(f) && d(f);
    }

    public final void i(Matrix matrix, RectF rectF) {
        float f;
        float f2;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float f3 = fArr[2];
        float f4 = fArr[0];
        float f5 = fArr[5];
        float f6 = fArr[4];
        this.i = Math.min(Math.max(this.g, f4), this.h);
        this.j = Math.min(Math.max(this.e, f6), this.f);
        if (rectF != null) {
            f = rectF.width();
            f2 = rectF.height();
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.k = Math.min(Math.max(f3, ((this.i - 1.0f) * (-f)) - this.l), this.l);
        float max = Math.max(Math.min(f5, ((this.j - 1.0f) * f2) + this.m), -this.m);
        fArr[2] = this.k;
        fArr[0] = this.i;
        fArr[5] = max;
        fArr[4] = this.j;
        matrix.setValues(fArr);
    }

    public final float j() {
        return this.d - this.b.bottom;
    }

    public final void k(Matrix matrix, View view, boolean z) {
        Matrix matrix2 = this.f417a;
        matrix2.set(matrix);
        i(matrix2, this.b);
        if (z) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }

    public final void l(float f, float f2, float f3, float f4) {
        this.b.set(f, f2, this.c - f3, this.d - f4);
    }
}
