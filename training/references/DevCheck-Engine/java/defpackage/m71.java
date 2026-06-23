package defpackage;

import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieChart;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m71 extends mp {
    public float I;
    public float J;
    public boolean K;
    public float L;

    @Override // android.view.View
    public final void computeScroll() {
        rp rpVar = this.s;
        if (rpVar instanceof o71) {
            o71 o71Var = (o71) rpVar;
            mp mpVar = o71Var.j;
            if (o71Var.o == 0.0f) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            m71 m71Var = (m71) mpVar;
            o71Var.o = m71Var.getDragDecelerationFrictionCoef() * o71Var.o;
            m71Var.setRotationAngle((o71Var.o * ((currentAnimationTimeMillis - o71Var.n) / 1000.0f)) + m71Var.getRotationAngle());
            o71Var.n = currentAnimationTimeMillis;
            if (Math.abs(o71Var.o) < 0.001d) {
                o71Var.o = 0.0f;
            } else {
                DisplayMetrics displayMetrics = n52.f665a;
                mpVar.postInvalidateOnAnimation();
            }
        }
    }

    @Override // defpackage.mp
    public void e() {
        super.e();
        o71 o71Var = new o71(this);
        o71Var.k = it0.b(0.0f, 0.0f);
        o71Var.l = 0.0f;
        o71Var.m = new ArrayList();
        o71Var.n = 0L;
        o71Var.o = 0.0f;
        this.s = o71Var;
    }

    @Override // defpackage.mp
    public final void f() {
        if (this.h == null) {
            return;
        }
        PieChart pieChart = (PieChart) this;
        int g = ((j71) pieChart.h).g();
        float f = 0.0f;
        if (pieChart.O.length != g) {
            pieChart.O = new float[g];
        } else {
            for (int i = 0; i < g; i++) {
                pieChart.O[i] = 0.0f;
            }
        }
        if (pieChart.P.length != g) {
            pieChart.P = new float[g];
        } else {
            for (int i2 = 0; i2 < g; i2++) {
                pieChart.P[i2] = 0.0f;
            }
        }
        float m = ((j71) pieChart.h).m();
        ArrayList arrayList = ((j71) pieChart.h).i;
        float f2 = pieChart.e0;
        boolean z = f2 != 0.0f && ((float) g) * f2 <= pieChart.d0;
        float[] fArr = new float[g];
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < ((j71) pieChart.h).f(); i4++) {
            k71 k71Var = (k71) arrayList.get(i4);
            int i5 = 0;
            while (i5 < k71Var.j.size()) {
                float f5 = f;
                float abs = (Math.abs(((l71) k71Var.g(i5)).g) / m) * pieChart.d0;
                if (z) {
                    float f6 = pieChart.e0;
                    float f7 = abs - f6;
                    if (f7 <= f5) {
                        fArr[i3] = f6;
                        f3 += -f7;
                    } else {
                        fArr[i3] = abs;
                        f4 += f7;
                    }
                }
                pieChart.O[i3] = abs;
                float[] fArr2 = pieChart.P;
                if (i3 == 0) {
                    fArr2[i3] = abs;
                } else {
                    fArr2[i3] = fArr2[i3 - 1] + abs;
                }
                i3++;
                i5++;
                f = f5;
            }
        }
        if (z) {
            for (int i6 = 0; i6 < g; i6++) {
                float f8 = fArr[i6];
                float f9 = f8 - (((f8 - pieChart.e0) / f4) * f3);
                fArr[i6] = f9;
                float[] fArr3 = pieChart.P;
                if (i6 == 0) {
                    fArr3[0] = fArr[0];
                } else {
                    fArr3[i6] = fArr3[i6 - 1] + f9;
                }
            }
            pieChart.O = fArr;
        }
        if (this.r != null) {
            this.u.l(this.h);
        }
        a();
    }

    public float getDiameter() {
        RectF rectF = this.x.b;
        rectF.left = getExtraLeftOffset() + rectF.left;
        rectF.top = getExtraTopOffset() + rectF.top;
        rectF.right -= getExtraRightOffset();
        rectF.bottom -= getExtraBottomOffset();
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // defpackage.mp, defpackage.qp
    public int getMaxVisibleCount() {
        return this.h.g();
    }

    public float getMinOffset() {
        return this.L;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.J;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.I;
    }

    @Override // defpackage.mp
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // defpackage.mp
    public float getYChartMin() {
        return 0.0f;
    }

    public final float h(float f, float f2) {
        it0 centerOffsets = getCenterOffsets();
        float f3 = centerOffsets.h;
        float f4 = f > f3 ? f - f3 : f3 - f;
        float sqrt = (float) Math.sqrt(Math.pow(f2 > centerOffsets.i ? f2 - r0 : r0 - f2, 2.0d) + Math.pow(f4, 2.0d));
        it0.d(centerOffsets);
        return sqrt;
    }

    public final float i(float f, float f2) {
        it0 centerOffsets = getCenterOffsets();
        double d = f - centerOffsets.h;
        double d2 = f2 - centerOffsets.i;
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d2 * d2) + (d * d))));
        if (f > centerOffsets.h) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        it0.d(centerOffsets);
        return f3;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rp rpVar;
        return (!this.p || (rpVar = this.s) == null) ? super.onTouchEvent(motionEvent) : rpVar.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f) {
        this.L = f;
    }

    public void setRotationAngle(float f) {
        this.J = f;
        DisplayMetrics displayMetrics = n52.f665a;
        while (f < 0.0f) {
            f += 360.0f;
        }
        this.I = f % 360.0f;
    }

    public void setRotationEnabled(boolean z) {
        this.K = z;
    }
}
