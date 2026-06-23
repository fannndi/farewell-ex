package flar2.devcheck.benchmarkSuite.ui.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import defpackage.d51;
import defpackage.ik1;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class ScoreRingView extends View {
    public static final /* synthetic */ int u = 0;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final RectF k;
    public final Paint.FontMetrics l;
    public final float m;
    public final float n;
    public double o;
    public double p;
    public double q;
    public String r;
    public double s;
    public ValueAnimator t;

    public ScoreRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Paint paint3 = new Paint(1);
        this.i = paint3;
        Paint paint4 = new Paint(1);
        this.j = paint4;
        this.k = new RectF();
        Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
        this.l = fontMetrics;
        this.q = 10000.0d;
        this.s = -1.0d;
        float f = getResources().getDisplayMetrics().density;
        float f2 = 10.0f * f;
        this.m = f2;
        float f3 = 56.0f * f;
        float f4 = f * 12.0f;
        this.n = f4;
        int a2 = a(R.attr.colorDivider, 864585864);
        int a3 = a(R.attr.colorPrimary, -14776091);
        int a4 = a(R.attr.textPrimary, -15658735);
        int a5 = a(R.attr.textTertiary, -7829368);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setColor(a2);
        paint.setStrokeWidth(f2);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(a3);
        paint2.setStrokeWidth(f2);
        paint3.setColor(a4);
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint3.setTextSize(f3);
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint3.getFontMetrics(fontMetrics);
        paint4.setColor(a5);
        paint4.setTextAlign(align);
        paint4.setTextSize(f4);
        paint4.setLetterSpacing(0.08f);
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
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.t = null;
        }
        if (!Double.isFinite(d) || d < 0.0d) {
            d = 0.0d;
        }
        this.o = d;
        String str = this.r;
        String u2 = (str == null || str.isEmpty()) ? GFUHKHDfiFuPm.NRLpxi : d51.u(new StringBuilder(), this.r, ", ");
        StringBuilder sb = new StringBuilder();
        sb.append(u2);
        double d2 = this.o;
        sb.append(d2 > 0.0d ? String.valueOf(Math.round(d2)) : "no score");
        setContentDescription(sb.toString());
        if (!z) {
            this.p = this.o;
            invalidate();
            return;
        }
        double d3 = this.p;
        double d4 = this.o;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(900L);
        ofFloat.setInterpolator(new DecelerateInterpolator(1.6f));
        ofFloat.addUpdateListener(new ik1(this, d3, d4, 1));
        ofFloat.start();
        this.t = ofFloat;
    }

    public double getScore() {
        return this.o;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.t = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.g;
        RectF rectF = this.k;
        canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
        double d = this.s;
        if (d < 0.0d) {
            d = this.p / this.q;
        }
        if (d < 0.0d) {
            d = 0.0d;
        }
        if (d > 1.0d) {
            d = 1.0d;
        }
        float f = (float) (d * 360.0d);
        if (f > 0.01f) {
            canvas.drawArc(rectF, -90.0f, f, false, this.h);
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        Paint.FontMetrics fontMetrics = this.l;
        float f2 = centerY - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        double d2 = this.p;
        canvas.drawText(d2 > 0.0d ? String.valueOf(Math.round(d2)) : "—", centerX, f2, this.i);
        String str = this.r;
        if (str == null || str.isEmpty()) {
            return;
        }
        canvas.drawText(this.r, centerX, (this.n * 1.2f) + f2 + fontMetrics.descent, this.j);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float paddingLeft = (this.m * 0.5f) + getPaddingLeft();
        this.k.set(paddingLeft, paddingLeft, i - paddingLeft, i2 - paddingLeft);
    }

    public void setAccentColor(int i) {
        this.h.setColor(i);
        invalidate();
    }

    public void setArcFraction(double d) {
        if (Double.isNaN(d)) {
            d = -1.0d;
        }
        this.s = d;
        invalidate();
    }

    public void setCaption(String str) {
        this.r = str;
        invalidate();
    }

    public void setMaxScore(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.q = d;
        invalidate();
    }
}
