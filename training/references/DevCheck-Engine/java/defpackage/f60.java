package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class f60 {

    /* renamed from: a, reason: collision with root package name */
    public final br0 f265a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    public f60(br0 br0Var) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.f265a = br0Var;
        this.e = new Matrix();
    }

    public static float d(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract int a();

    public abstract void b();

    public final void c(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.f265a.d();
        rq0 rq0Var = (rq0) this;
        if (rq0Var.f != rect.width()) {
            rq0Var.f = rect.width();
            rq0Var.b();
        }
        float a2 = rq0Var.a();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - a2) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        br0 br0Var = rq0Var.f265a;
        if (br0Var.s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = rq0Var.f / 2.0f;
        float f3 = a2 / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        rq0Var.g = br0Var.f96a * f;
        rq0Var.h = Math.min(r0 / 2, br0Var.a()) * f;
        rq0Var.j = br0Var.l * f;
        rq0Var.i = Math.min(br0Var.f96a / 2.0f, br0Var.b()) * f;
        if (z || z2) {
            if ((z && br0Var.g == 2) || (z2 && br0Var.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && br0Var.h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * br0Var.f96a) / 2.0f);
            }
        }
        if (z2 && br0Var.h == 3) {
            rq0Var.n = f;
        } else {
            rq0Var.n = 1.0f;
        }
    }
}
