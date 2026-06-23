package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class g30 extends b60 {
    public static final f30 D = new f30(0);
    public TimeInterpolator A;
    public TimeInterpolator B;
    public TimeInterpolator C;
    public final rq0 t;
    public final vp1 u;
    public final d60 v;
    public float w;
    public boolean x;
    public final ValueAnimator y;
    public ValueAnimator z;

    public g30(Context context, br0 br0Var, rq0 rq0Var) {
        super(context, br0Var);
        this.x = false;
        this.t = rq0Var;
        d60 d60Var = new d60();
        this.v = d60Var;
        d60Var.g = true;
        vp1 vp1Var = new vp1(this, D);
        this.u = vp1Var;
        wp1 wp1Var = new wp1();
        wp1Var.a(1.0f);
        wp1Var.b(50.0f);
        vp1Var.k = wp1Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.y = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new w4(this, 1, br0Var));
        if (br0Var.c(true) && br0Var.m != 0) {
            valueAnimator.start();
        }
        if (this.o != 1.0f) {
            this.o = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.r)) {
            canvas.save();
            Rect bounds = getBounds();
            float b = b();
            ObjectAnimator objectAnimator = this.j;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.k;
            this.t.c(canvas, bounds, b, z, objectAnimator2 != null && objectAnimator2.isRunning());
            float c = c();
            d60 d60Var = this.v;
            d60Var.f = c;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.p;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            br0 br0Var = this.h;
            d60Var.c = br0Var.e[0];
            int i = br0Var.i;
            rq0 rq0Var = this.t;
            if (i > 0) {
                if (rq0Var == null) {
                    i = (int) ((pr.j(d60Var.b, 0.0f, 0.01f) * i) / 0.01f);
                }
                this.t.g(canvas, paint, d60Var.b, 1.0f, br0Var.f, this.q, i);
            } else {
                rq0Var.g(canvas, paint, 0.0f, 1.0f, br0Var.f, this.q, 0);
            }
            int i2 = this.q;
            rq0 rq0Var2 = this.t;
            rq0Var2.getClass();
            int j = je2.j(d60Var.c, i2);
            rq0Var2.m = d60Var.g;
            float f = d60Var.f175a;
            float f2 = d60Var.b;
            int i3 = d60Var.d;
            rq0Var2.e(canvas, paint, f, f2, j, i3, i3, d60Var.e, d60Var.f, true);
            int i4 = br0Var.e[0];
            int i5 = this.q;
            rq0 rq0Var3 = this.t;
            rq0Var3.getClass();
            int j2 = je2.j(i4, i5);
            rq0Var3.m = false;
            br0 br0Var2 = rq0Var3.f265a;
            int min = Math.min(br0Var2.t, br0Var2.f96a);
            if (min > 0 && j2 != 0) {
                paint.setStyle(style);
                paint.setColor(j2);
                Integer num = br0Var2.u;
                float f3 = min;
                rq0Var3.f(canvas, paint, new e60(new float[]{(rq0Var3.f / 2.0f) - (num != null ? (br0Var2.t / 2.0f) + num.floatValue() : rq0Var3.g / 2.0f), 0.0f}, new float[]{1.0f, 0.0f}), f3, f3, (rq0Var3.h * f3) / rq0Var3.g, null, 0.0f, 0.0f, 0.0f, false);
            }
            canvas.restore();
        }
    }

    @Override // defpackage.b60
    public final boolean e(boolean z, boolean z2, boolean z3) {
        boolean e = super.e(z, z2, z3);
        p4 p4Var = this.i;
        ContentResolver contentResolver = this.g.getContentResolver();
        p4Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.x = true;
            return e;
        }
        this.x = false;
        this.u.k.b(50.0f / f);
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.t.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.t.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.u.d();
        this.v.b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        float f = i;
        br0 br0Var = this.h;
        float f2 = (f < br0Var.o * 10000.0f || f > br0Var.p * 10000.0f) ? 0.0f : 1.0f;
        boolean z = this.x;
        d60 d60Var = this.v;
        vp1 vp1Var = this.u;
        if (z) {
            vp1Var.d();
            d60Var.b = f / 10000.0f;
            invalidateSelf();
            d60Var.e = f2;
            invalidateSelf();
            return true;
        }
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            if (this.t != null) {
                float f3 = 10000.0f / width;
                if (f3 <= 0.0f) {
                    vp1Var.getClass();
                    c.m("Minimum visible change must be positive.");
                    return false;
                }
                vp1Var.h = f3;
            } else {
                float min = (float) (10000.0d / (Math.min(height, width) * 3.141592653589793d));
                if (min <= 0.0f) {
                    vp1Var.getClass();
                    c.m("Minimum visible change must be positive.");
                    return false;
                }
                vp1Var.h = min;
            }
        }
        vp1Var.b = d60Var.b * 10000.0f;
        vp1Var.c = true;
        vp1Var.a(f);
        return true;
    }
}
