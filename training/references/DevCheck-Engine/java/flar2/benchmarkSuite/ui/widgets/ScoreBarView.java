package flar2.devcheck.benchmarkSuite.ui.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import defpackage.ik1;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class ScoreBarView extends View {
    public static final /* synthetic */ int q = 0;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final RectF j;
    public final RectF k;
    public double l;
    public final float m;
    public boolean n;
    public boolean o;
    public ValueAnimator p;

    public ScoreBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Paint paint3 = new Paint(1);
        this.i = paint3;
        this.j = new RectF();
        this.k = new RectF();
        this.n = true;
        this.o = false;
        this.m = getResources().getDisplayMetrics().density * 3.0f;
        int a2 = a(R.attr.colorDivider, 520093696);
        int a3 = a(R.attr.colorPrimary, -14776091);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(a2);
        paint2.setStyle(style);
        paint2.setColor(a3);
        paint3.setStyle(style);
        paint3.setColor(a(R.attr.textPrimary, -16777216));
    }

    public final int a(int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void b(double d, boolean z) {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.p = null;
        }
        double d2 = (!Double.isFinite(d) || d < 0.0d) ? 0.0d : d;
        if (!z) {
            this.l = d2;
            invalidate();
            return;
        }
        double d3 = this.l;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(900L);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.6f));
        ofFloat.addUpdateListener(new ik1(this, d3, d2, 0));
        ofFloat.start();
        this.p = ofFloat;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.p = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width <= 0 || height <= 0) {
            return;
        }
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float f = width;
        float f2 = height + paddingTop;
        RectF rectF = this.j;
        rectF.set(paddingLeft, paddingTop, paddingLeft + f, f2);
        Paint paint = this.g;
        float f3 = this.m;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = getResources().getDisplayMetrics().density * 2.0f;
        float height2 = getHeight();
        boolean z = this.o;
        double d = this.l;
        Paint paint2 = this.i;
        Paint paint3 = this.h;
        RectF rectF2 = this.k;
        if (!z) {
            double d2 = d / 150.0d;
            double d3 = d2 >= 0.0d ? d2 : 0.0d;
            float f5 = (float) (width * (d3 <= 1.0d ? d3 : 1.0d));
            if (f5 > 0.5f) {
                rectF2.set(paddingLeft, paddingTop, f5 + paddingLeft, f2);
                canvas.drawRoundRect(rectF2, f3, f3, paint3);
            }
            if (this.n) {
                float f6 = (f * 0.6666667f) + paddingLeft;
                float f7 = f4 * 0.5f;
                canvas.drawRect(f6 - f7, 0.0f, f6 + f7, height2, paint2);
                return;
            }
            return;
        }
        float f8 = f * 0.5f;
        float f9 = paddingLeft + f8;
        double d4 = (d - 100.0d) / 50.0d;
        if (d4 < -1.0d) {
            d4 = -1.0d;
        }
        double d5 = d4 <= 1.0d ? d4 : 1.0d;
        float abs = (float) Math.abs(f8 * d5);
        if (abs > 0.5f) {
            rectF2.set(d5 >= 0.0d ? f9 : f9 - abs, paddingTop, d5 >= 0.0d ? abs + f9 : f9, f2);
            canvas.drawRoundRect(rectF2, f3, f3, paint3);
        }
        if (this.n) {
            float f10 = f4 * 0.5f;
            canvas.drawRect(f9 - f10, 0.0f, f9 + f10, height2, paint2);
        }
    }

    public void setAccentColor(int i) {
        this.h.setColor(i);
        invalidate();
    }

    public void setBidirectional(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        invalidate();
    }

    public void setShowTick(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        invalidate();
    }
}
