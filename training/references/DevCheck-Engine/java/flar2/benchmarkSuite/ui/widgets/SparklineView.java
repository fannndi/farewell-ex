package flar2.devcheck.benchmarkSuite.ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class SparklineView extends View {
    public final Paint g;
    public final Paint h;
    public final Path i;
    public double[] j;
    public final float k;
    public final float l;

    public SparklineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.i = new Path();
        float f = getResources().getDisplayMetrics().density;
        float f2 = 1.5f * f;
        this.k = f2;
        this.l = f * 1.8f;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.colorPrimary});
        try {
            int color = obtainStyledAttributes.getColor(0, -14776091);
            obtainStyledAttributes.recycle();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f2);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setColor(color);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(color);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        double d;
        double[] dArr = this.j;
        if (dArr == null || dArr.length < 2) {
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width <= 0 || height <= 0) {
            return;
        }
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        double d2 = Double.POSITIVE_INFINITY;
        double d3 = Double.NEGATIVE_INFINITY;
        int i = 0;
        for (double d4 : this.j) {
            if (!Double.isNaN(d4) && !Double.isInfinite(d4)) {
                if (d4 < d2) {
                    d2 = d4;
                }
                if (d4 > d3) {
                    d3 = d4;
                }
                i++;
            }
        }
        if (i < 2) {
            return;
        }
        double d5 = d3 - d2;
        if (d5 < 1.0E-12d) {
            d5 = 1.0d;
        }
        Path path = this.i;
        path.reset();
        float f = (this.k * 0.5f) + 1.0f;
        float f2 = height - (2.0f * f);
        float f3 = paddingTop + f;
        float length = width / (this.j.length - 1);
        int i2 = 0;
        boolean z = false;
        while (true) {
            double[] dArr2 = this.j;
            if (i2 >= dArr2.length) {
                break;
            }
            double d6 = dArr2[i2];
            if (Double.isNaN(d6) || Double.isInfinite(d6)) {
                d = d2;
                z = false;
            } else {
                float f4 = (i2 * length) + paddingLeft;
                d = d2;
                float f5 = ((float) (f2 * (1.0d - ((d6 - d2) / d5)))) + f3;
                if (z) {
                    path.lineTo(f4, f5);
                } else {
                    path.moveTo(f4, f5);
                    z = true;
                }
            }
            i2++;
            d2 = d;
        }
        double d7 = d2;
        canvas.drawPath(path, this.g);
        int length2 = this.j.length - 1;
        while (length2 >= 0 && (Double.isNaN(this.j[length2]) || Double.isInfinite(this.j[length2]))) {
            length2--;
        }
        if (length2 >= 0) {
            canvas.drawCircle((length * length2) + paddingLeft, f3 + ((float) ((1.0d - ((this.j[length2] - d7) / d5)) * f2)), this.l, this.h);
        }
    }

    public void setAccentColor(int i) {
        this.g.setColor(i);
        this.h.setColor(i);
        invalidate();
    }

    public void setValues(double[] dArr) {
        this.j = dArr;
        invalidate();
    }
}
