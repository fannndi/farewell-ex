package flar2.devcheck.benchmarkSuite.ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import flar2.devcheck.R;
import java.util.Locale;

/* loaded from: classes.dex */
public final class TrendChartView extends View {
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Path l;
    public final Path m;
    public final Paint.FontMetrics n;
    public double[] o;
    public final float p;
    public final float q;
    public final float r;

    public TrendChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Paint paint3 = new Paint(1);
        this.i = paint3;
        Paint paint4 = new Paint(1);
        this.j = paint4;
        Paint paint5 = new Paint(1);
        this.k = paint5;
        this.l = new Path();
        this.m = new Path();
        Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
        this.n = fontMetrics;
        this.o = new double[0];
        float f = getResources().getDisplayMetrics().density;
        float f2 = 2.0f * f;
        this.p = f2;
        this.q = 2.5f * f;
        float f3 = 11.0f * f;
        this.r = f * 6.0f;
        int a2 = a(R.attr.colorPrimary, -14776091);
        int a3 = a(R.attr.colorDivider, 579373192);
        int a4 = a(R.attr.textTertiary, -7829368);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(f2);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(a2);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setColor(Color.argb(40, Color.red(a2), Color.green(a2), Color.blue(a2)));
        paint3.setStyle(style2);
        paint3.setColor(a2);
        paint4.setStyle(style);
        paint4.setStrokeWidth(1.0f);
        paint4.setColor(a3);
        paint5.setStyle(style2);
        paint5.setColor(a4);
        paint5.setTextSize(f3);
        paint5.setTextAlign(Paint.Align.LEFT);
        paint5.getFontMetrics(fontMetrics);
    }

    public final int a(int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width <= 0 || height <= 0) {
            return;
        }
        double[] dArr = this.o;
        if (dArr.length == 0) {
            return;
        }
        double d = Double.NEGATIVE_INFINITY;
        double d2 = Double.POSITIVE_INFINITY;
        int i = 0;
        for (double d3 : dArr) {
            if (Double.isFinite(d3) && d3 > 0.0d) {
                if (d3 < d2) {
                    d2 = d3;
                }
                if (d3 > d) {
                    d = d3;
                }
                i++;
            }
        }
        if (i == 0) {
            return;
        }
        String format = String.format(Locale.getDefault(), "%,.0f", Double.valueOf(d));
        String format2 = String.format(Locale.getDefault(), "%,.0f", Double.valueOf(d2));
        Paint paint = this.k;
        float paddingLeft = (getPaddingLeft() + width) - Math.max(paint.measureText(format), paint.measureText(format2));
        float f2 = this.r;
        float f3 = paddingLeft - f2;
        float paddingLeft2 = getPaddingLeft();
        float f4 = this.p;
        float f5 = paddingLeft2 + f4;
        float paddingTop = getPaddingTop() + f4;
        float paddingTop2 = (getPaddingTop() + height) - f4;
        float f6 = f3 - f5;
        float f7 = paddingTop2 - paddingTop;
        if (f6 <= 0.0f || f7 <= 0.0f) {
            return;
        }
        Paint paint2 = this.j;
        float f8 = f5;
        canvas.drawLine(f8, paddingTop, f3, paddingTop, paint2);
        canvas.drawLine(f8, paddingTop2, f3, paddingTop2, paint2);
        Paint.FontMetrics fontMetrics = this.n;
        float f9 = (fontMetrics.ascent + fontMetrics.descent) / 2.0f;
        float f10 = f3 + f2;
        canvas.drawText(format, f10, paddingTop - f9, paint);
        canvas.drawText(format2, f10, paddingTop2 - f9, paint);
        double d4 = d - d2;
        if (d4 < 1.0E-9d) {
            d4 = 1.0d;
        }
        Path path = this.l;
        path.reset();
        Path path2 = this.m;
        path2.reset();
        float length = this.o.length > 1 ? f6 / (r14.length - 1) : 0.0f;
        float f11 = Float.NaN;
        float f12 = Float.NaN;
        int i2 = 0;
        boolean z = false;
        while (true) {
            double[] dArr2 = this.o;
            f = f8;
            if (i2 >= dArr2.length) {
                break;
            }
            double d5 = dArr2[i2];
            if (!Double.isFinite(d5) || d5 <= 0.0d) {
                if (z) {
                    path2.lineTo(f11, paddingTop2);
                    path2.lineTo(f12, paddingTop2);
                    path2.close();
                }
                z = false;
            } else {
                float f13 = (i2 * length) + f;
                float f14 = ((float) (f7 * (1.0d - ((d5 - d2) / d4)))) + paddingTop;
                if (z) {
                    path.lineTo(f13, f14);
                    path2.lineTo(f13, f14);
                } else {
                    path.moveTo(f13, f14);
                    path2.moveTo(f13, paddingTop2);
                    path2.lineTo(f13, f14);
                    f12 = f13;
                    z = true;
                }
                f11 = f13;
            }
            i2++;
            f8 = f;
        }
        if (z) {
            path2.lineTo(f11, paddingTop2);
            path2.lineTo(f12, paddingTop2);
            path2.close();
        }
        canvas.drawPath(path2, this.h);
        canvas.drawPath(path, this.g);
        int i3 = 0;
        while (true) {
            double[] dArr3 = this.o;
            if (i3 >= dArr3.length) {
                return;
            }
            double d6 = dArr3[i3];
            if (Double.isFinite(d6) && d6 > 0.0d) {
                canvas.drawCircle((i3 * length) + f, ((float) ((1.0d - ((d6 - d2) / d4)) * f7)) + paddingTop, this.q, this.i);
            }
            i3++;
        }
    }

    public void setAccentColor(int i) {
        this.g.setColor(i);
        this.h.setColor(Color.argb(40, Color.red(i), Color.green(i), Color.blue(i)));
        this.i.setColor(i);
        invalidate();
    }

    public void setValues(double[] dArr) {
        int i = 0;
        if (dArr == null) {
            dArr = new double[0];
        }
        this.o = dArr;
        String str = "no trend data";
        if (dArr.length != 0) {
            double d = Double.NaN;
            double d2 = Double.NEGATIVE_INFINITY;
            while (true) {
                double[] dArr2 = this.o;
                if (i >= dArr2.length) {
                    break;
                }
                double d3 = dArr2[i];
                if (Double.isFinite(d3) && d3 > 0.0d) {
                    d = d3;
                    if (d3 > d2) {
                        d2 = d;
                    }
                }
                i++;
            }
            if (!Double.isNaN(d)) {
                str = String.format(Locale.getDefault(), "latest %,.0f, best %,.0f across %d runs", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(this.o.length));
            }
        }
        setContentDescription(str);
        invalidate();
    }
}
