package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;

/* loaded from: classes.dex */
public final class gi1 extends ij0 {
    public float n;

    @Override // defpackage.ij0, defpackage.hc
    public final void u(Canvas canvas, jc jcVar, int i) {
        Paint paint;
        Paint paint2;
        Canvas canvas2 = canvas;
        i82 i82Var = (i82) this.f202a;
        BarChart barChart = this.g;
        h02 h02Var = barChart.f0;
        int i2 = jcVar.q;
        Paint paint3 = this.j;
        paint3.setColor(i2);
        this.b.getClass();
        gc gcVar = this.i[i];
        gcVar.getClass();
        gcVar.c = barChart.getBarData().j;
        barChart.j();
        gcVar.b(jcVar);
        float[] fArr = gcVar.b;
        h02Var.f(fArr);
        int size = jcVar.f1104a.size();
        Paint paint4 = this.c;
        if (size <= 1) {
            paint4.setColor(jcVar.d());
            int i3 = 0;
            while (i3 < fArr.length) {
                int i4 = i3 + 2;
                if (i82Var.e(fArr[i4])) {
                    if (!i82Var.f(fArr[i3])) {
                        return;
                    }
                    if (barChart.p0) {
                        if (this.n > 0.0f) {
                            float f = fArr[i3];
                            RectF rectF = i82Var.b;
                            RectF rectF2 = new RectF(f, rectF.top, fArr[i4], rectF.bottom);
                            float f2 = this.n;
                            canvas2.drawRoundRect(rectF2, f2, f2, paint3);
                        } else {
                            canvas2.drawRect(fArr[i3], fArr[i3 + 1], fArr[i4], fArr[i3 + 3], paint4);
                        }
                    }
                    if (this.n > 0.0f) {
                        Path path = new Path();
                        path.addRoundRect(new RectF(fArr[i3], fArr[i3 + 1], fArr[i4], fArr[i3 + 3]), new float[]{5.0f, 5.0f, 24.0f, 24.0f, 24.0f, 24.0f, 5.0f, 5.0f}, Path.Direction.CW);
                        canvas2.drawPath(path, paint4);
                    } else {
                        canvas2.drawRect(fArr[i3], fArr[i3 + 1], fArr[i4], fArr[i3 + 3], paint4);
                    }
                }
                i3 += 4;
                canvas2 = canvas;
            }
            return;
        }
        int i5 = 0;
        while (i5 < fArr.length) {
            int i6 = i5 + 2;
            boolean e = i82Var.e(fArr[i6]);
            RectF rectF3 = i82Var.b;
            if (!e) {
                paint = paint3;
            } else {
                if (!i82Var.f(fArr[i5])) {
                    return;
                }
                if (barChart.p0) {
                    if (this.n > 0.0f) {
                        RectF rectF4 = new RectF(fArr[i5], rectF3.top, fArr[i6], rectF3.bottom);
                        float f3 = this.n;
                        canvas2.drawRoundRect(rectF4, f3, f3, paint3);
                    } else {
                        canvas2.drawRect(fArr[i5], rectF3.top, fArr[i6], rectF3.bottom, paint3);
                    }
                }
                paint = paint3;
                paint4.setColor(jcVar.e(i5 / 4));
                if (this.n > 0.0f) {
                    RectF rectF5 = new RectF(fArr[i5], fArr[i5 + 1], fArr[i6], fArr[i5 + 3]);
                    float f4 = this.n;
                    canvas2.drawRoundRect(rectF5, f4, f4, paint4);
                } else {
                    paint2 = paint4;
                    canvas2.drawRect(fArr[i5], fArr[i5 + 1], fArr[i6], fArr[i5 + 3], paint2);
                    i5 += 4;
                    paint4 = paint2;
                    paint3 = paint;
                }
            }
            paint2 = paint4;
            i5 += 4;
            paint4 = paint2;
            paint3 = paint;
        }
    }
}
