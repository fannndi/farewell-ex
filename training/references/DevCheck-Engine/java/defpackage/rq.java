package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class rq extends Drawable implements Animatable {
    public static final LinearInterpolator m = new LinearInterpolator();
    public static final za0 n = new za0(1);
    public static final int[] o = {-16777216};
    public final qq g;
    public float h;
    public final Resources i;
    public final ValueAnimator j;
    public float k;
    public boolean l;

    public rq(Context context) {
        context.getClass();
        this.i = context.getResources();
        qq qqVar = new qq();
        this.g = qqVar;
        qqVar.i = o;
        qqVar.a(0);
        qqVar.h = 2.5f;
        qqVar.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new oq(this, qqVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(m);
        ofFloat.addListener(new pq(this, qqVar));
        this.j = ofFloat;
    }

    public static void d(float f, qq qqVar) {
        if (f <= 0.75f) {
            qqVar.u = qqVar.i[qqVar.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = qqVar.i;
        int i = qqVar.j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        qqVar.u = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r1) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r3) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r4) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r2))));
    }

    public final void a(float f, qq qqVar, boolean z) {
        float f2;
        if (this.l) {
            d(f, qqVar);
            float floor = (float) (Math.floor(qqVar.m / 0.8f) + 1.0d);
            float f3 = qqVar.k;
            float f4 = qqVar.l;
            qqVar.e = (((f4 - 0.01f) - f3) * f) + f3;
            qqVar.f = f4;
            float f5 = qqVar.m;
            qqVar.g = ((floor - f5) * f) + f5;
            return;
        }
        if (f != 1.0f || z) {
            float f6 = qqVar.m;
            float f7 = qqVar.k;
            za0 za0Var = n;
            if (f < 0.5f) {
                f2 = (za0Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f7;
            } else {
                float f8 = f7 + 0.79f;
                f7 = f8 - (((1.0f - za0Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f8;
            }
            float f9 = (0.20999998f * f) + f6;
            float f10 = (f + this.k) * 216.0f;
            qqVar.e = f7;
            qqVar.f = f2;
            qqVar.g = f9;
            this.h = f10;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.i.getDisplayMetrics().density;
        float f6 = f2 * f5;
        qq qqVar = this.g;
        qqVar.h = f6;
        qqVar.b.setStrokeWidth(f6);
        qqVar.q = f * f5;
        qqVar.a(0);
        qqVar.r = (int) (f3 * f5);
        qqVar.s = (int) (f4 * f5);
    }

    public final void c(int i) {
        if (i == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        qq qqVar = this.g;
        Paint paint = qqVar.b;
        RectF rectF = qqVar.f857a;
        float f = qqVar.q;
        float f2 = (qqVar.h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((qqVar.r * qqVar.p) / 2.0f, qqVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = qqVar.e;
        float f4 = qqVar.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((qqVar.f + f4) * 360.0f) - f5;
        paint.setColor(qqVar.u);
        paint.setAlpha(qqVar.t);
        float f7 = qqVar.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, qqVar.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = qqVar.c;
        if (qqVar.n) {
            Path path = qqVar.o;
            if (path == null) {
                Path path2 = new Path();
                qqVar.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (qqVar.r * qqVar.p) / 2.0f;
            qqVar.o.moveTo(0.0f, 0.0f);
            qqVar.o.lineTo(qqVar.r * qqVar.p, 0.0f);
            Path path3 = qqVar.o;
            float f10 = qqVar.r;
            float f11 = qqVar.p;
            path3.lineTo((f10 * f11) / 2.0f, qqVar.s * f11);
            qqVar.o.offset((rectF.centerX() + min) - f9, (qqVar.h / 2.0f) + rectF.centerY());
            qqVar.o.close();
            paint2.setColor(qqVar.u);
            paint2.setAlpha(qqVar.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(qqVar.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.g.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.j.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.g.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.j;
        valueAnimator.cancel();
        qq qqVar = this.g;
        float f = qqVar.e;
        qqVar.k = f;
        float f2 = qqVar.f;
        qqVar.l = f2;
        qqVar.m = qqVar.g;
        if (f2 != f) {
            this.l = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        qqVar.a(0);
        qqVar.k = 0.0f;
        qqVar.l = 0.0f;
        qqVar.m = 0.0f;
        qqVar.e = 0.0f;
        qqVar.f = 0.0f;
        qqVar.g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.j.cancel();
        this.h = 0.0f;
        qq qqVar = this.g;
        if (qqVar.n) {
            qqVar.n = false;
        }
        qqVar.a(0);
        qqVar.k = 0.0f;
        qqVar.l = 0.0f;
        qqVar.m = 0.0f;
        qqVar.e = 0.0f;
        qqVar.f = 0.0f;
        qqVar.g = 0.0f;
        invalidateSelf();
    }
}
