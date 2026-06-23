package flar2.devcheck.ui.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public final class CpuLoadGraphView extends View {
    public final float[] g;
    public int h;
    public float i;
    public int j;
    public final Paint k;
    public final Paint l;
    public final Path m;
    public final Path n;
    public LinearGradient o;
    public int p;

    public CpuLoadGraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new float[60];
        this.h = 0;
        this.i = 100.0f;
        this.j = -7829368;
        Paint paint = new Paint(1);
        this.k = paint;
        Paint paint2 = new Paint(1);
        this.l = paint2;
        this.m = new Path();
        this.n = new Path();
        this.p = 0;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDisplayMetrics().density * 2.0f);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.FILL);
    }

    public final void a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.i;
        if (f > f2) {
            f = f2;
        }
        float[] fArr = this.g;
        System.arraycopy(fArr, 1, fArr, 0, 59);
        fArr[59] = f;
        int i = this.h;
        if (i < 60) {
            this.h = i + 1;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path;
        int i;
        int i2;
        Path path2;
        float f;
        if (this.h < 1) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        LinearGradient linearGradient = this.o;
        Paint paint = this.l;
        if (linearGradient == null || this.p != height) {
            int i3 = this.j;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, height, (i3 & 16777215) | 2013265920, (i3 & 16777215) | 1006632960, Shader.TileMode.CLAMP);
            this.o = linearGradient2;
            this.p = height;
            paint.setShader(linearGradient2);
        }
        float f2 = height;
        float f3 = f2 / this.i;
        Path path3 = this.m;
        path3.rewind();
        Path path4 = this.n;
        path4.rewind();
        int i4 = this.h;
        float[] fArr = this.g;
        float f4 = 0.0f;
        if (i4 == 1) {
            float f5 = f2 - (fArr[59] * f3);
            path3.moveTo(0.0f, f5);
            float f6 = width;
            path3.lineTo(f6, f5);
            path4.moveTo(0.0f, f2);
            path4.lineTo(0.0f, f5);
            path4.lineTo(f6, f5);
            path4.lineTo(f6, f2);
            path4.close();
            path = path4;
        } else {
            int i5 = 60 - i4;
            float f7 = width;
            float f8 = f7 / (i4 - 1);
            float f9 = 0.0f;
            int i6 = i5;
            while (i6 < 60) {
                float f10 = (i6 - i5) * f8;
                float f11 = f2 - (fArr[i6] * f3);
                if (i6 == i5) {
                    path3.moveTo(f10, f11);
                    path4.moveTo(f10, f2);
                    path4.lineTo(f10, f11);
                    i = i5;
                    i2 = i6;
                    f = f11;
                    path2 = path4;
                } else {
                    float f12 = (f4 + f10) * 0.5f;
                    i = i5;
                    i2 = i6;
                    float f13 = f9;
                    path3.cubicTo(f12, f13, f12, f11, f10, f11);
                    path2 = path4;
                    path2.cubicTo(f12, f13, f12, f11, f10, f11);
                    f = f11;
                    f10 = f10;
                }
                path4 = path2;
                f9 = f;
                i5 = i;
                i6 = i2 + 1;
                f4 = f10;
            }
            path = path4;
            path.lineTo(f7, f2);
            path.close();
        }
        canvas.drawPath(path, paint);
        canvas.drawPath(path3, this.k);
    }

    public void setLineColor(int i) {
        this.j = i;
        this.k.setColor(i & 16777215);
        this.o = null;
        invalidate();
    }

    public void setMaxValue(float f) {
        if (f <= 0.0f) {
            return;
        }
        this.i = f;
        invalidate();
    }
}
