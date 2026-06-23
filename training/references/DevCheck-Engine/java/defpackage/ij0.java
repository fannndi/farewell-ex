package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ij0 extends hc {
    public final RectF m;

    public ij0(BarChart barChart, np npVar, i82 i82Var) {
        super(barChart, npVar, i82Var);
        this.m = new RectF();
        this.e.setTextAlign(Paint.Align.LEFT);
    }

    @Override // defpackage.hc, defpackage.v00
    public final void p(Canvas canvas) {
        it0 it0Var;
        q52 q52Var;
        gc gcVar;
        it0 it0Var2;
        int i;
        hc hcVar = this;
        i82 i82Var = (i82) hcVar.f202a;
        BarChart barChart = hcVar.g;
        if (hcVar.r(barChart)) {
            ArrayList arrayList = barChart.getBarData().i;
            float c = n52.c(5.0f);
            boolean z = barChart.o0;
            int i2 = 0;
            while (i2 < barChart.getBarData().f()) {
                jc jcVar = (jc) arrayList.get(i2);
                if (hd.t(jcVar)) {
                    barChart.j();
                    hcVar.l(jcVar);
                    Paint paint = hcVar.e;
                    float f = 2.0f;
                    float a2 = n52.a(paint, "10") / 2.0f;
                    q52 j = jcVar.j();
                    gc gcVar2 = hcVar.i[i2];
                    hcVar.b.getClass();
                    it0 c2 = it0.c(jcVar.g);
                    c2.h = n52.c(c2.h);
                    c2.i = n52.c(c2.i);
                    if (jcVar.n()) {
                        it0Var = c2;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < jcVar.j.size() * 1.0f) {
                            ad adVar = (ad) jcVar.g(i3);
                            int k = jcVar.k(i3);
                            adVar.getClass();
                            float[] fArr = gcVar2.b;
                            int i5 = i4 + 1;
                            if (!i82Var.g(fArr[i5])) {
                                break;
                            }
                            float f2 = fArr[i4];
                            if (i82Var.e(f2) && i82Var.f(f2) && i82Var.d(fArr[i5])) {
                                j.getClass();
                                String a3 = j.a(adVar.g);
                                int i6 = i3;
                                float measureText = (int) paint.measureText(a3);
                                float f3 = z ? c : -(measureText + c);
                                float f4 = z ? -(measureText + c) : c;
                                if (jcVar.e) {
                                    float f5 = fArr[i4 + 2];
                                    if (adVar.g >= 0.0f) {
                                        f4 = f3;
                                    }
                                    v(canvas, a3, f5 + f4, fArr[i5] + a2, k);
                                }
                                i4 += 4;
                                i3 = i6 + 1;
                            } else {
                                i3 = i3;
                            }
                        }
                    } else {
                        int i7 = 0;
                        while (true) {
                            float f6 = i7;
                            float[] fArr2 = gcVar2.b;
                            float f7 = f;
                            if (f6 >= fArr2.length * 1.0f) {
                                break;
                            }
                            int i8 = i7 + 1;
                            float f8 = fArr2[i8];
                            float f9 = (f8 + fArr2[i7 + 3]) / f7;
                            if (!i82Var.g(f8)) {
                                break;
                            }
                            float f10 = fArr2[i7];
                            if (i82Var.e(f10) && i82Var.f(f10) && i82Var.d(fArr2[i8])) {
                                ad adVar2 = (ad) jcVar.g(i7 / 4);
                                float f11 = adVar2.g;
                                j.getClass();
                                String a4 = j.a(adVar2.g);
                                float measureText2 = (int) paint.measureText(a4);
                                float f12 = z ? c : -(measureText2 + c);
                                float f13 = z ? -(measureText2 + c) : c;
                                if (jcVar.e) {
                                    float f14 = fArr2[i7 + 2];
                                    if (f11 >= 0.0f) {
                                        f13 = f12;
                                    }
                                    gcVar = gcVar2;
                                    i = i7;
                                    q52Var = j;
                                    it0Var2 = c2;
                                    v(canvas, a4, f14 + f13, f9 + a2, jcVar.k(i7 / 2));
                                    i7 = i + 4;
                                    j = q52Var;
                                    gcVar2 = gcVar;
                                    f = f7;
                                    c2 = it0Var2;
                                }
                            }
                            q52Var = j;
                            gcVar = gcVar2;
                            it0Var2 = c2;
                            i = i7;
                            i7 = i + 4;
                            j = q52Var;
                            gcVar2 = gcVar;
                            f = f7;
                            c2 = it0Var2;
                        }
                        it0Var = c2;
                    }
                    it0.d(it0Var);
                }
                i2++;
                hcVar = this;
            }
        }
    }

    @Override // defpackage.hc, defpackage.v00
    public final void q() {
        ic barData = this.g.getBarData();
        this.i = new hj0[barData.f()];
        for (int i = 0; i < this.i.length; i++) {
            jc jcVar = (jc) barData.e(i);
            gc[] gcVarArr = this.i;
            int size = jcVar.j.size() * 4;
            int i2 = jcVar.n() ? jcVar.p : 1;
            barData.f();
            gcVarArr[i] = new hj0(size * i2, jcVar.n());
        }
    }

    @Override // defpackage.v00
    public final boolean r(qp qpVar) {
        return ((float) qpVar.getData().g()) < ((float) qpVar.getMaxVisibleCount()) * ((i82) this.f202a).j;
    }

    @Override // defpackage.hc
    public void u(Canvas canvas, jc jcVar, int i) {
        Canvas canvas2;
        i82 i82Var = (i82) this.f202a;
        List list = jcVar.j;
        BarChart barChart = this.g;
        h02 h02Var = barChart.f0;
        int i2 = jcVar.r;
        Paint paint = this.k;
        paint.setColor(i2);
        paint.setStrokeWidth(n52.c(0.0f));
        this.b.getClass();
        int i3 = 0;
        if (barChart.p0) {
            int i4 = jcVar.q;
            Paint paint2 = this.j;
            paint2.setColor(i4);
            float f = barChart.getBarData().j / 2.0f;
            int min = Math.min((int) Math.ceil(list.size() * 1.0f), list.size());
            for (int i5 = 0; i5 < min; i5++) {
                float f2 = ((ad) jcVar.g(i5)).i;
                RectF rectF = this.m;
                rectF.top = f2 - f;
                rectF.bottom = f2 + f;
                ((Matrix) h02Var.f358a).mapRect(rectF);
                ((i82) h02Var.c).f417a.mapRect(rectF);
                ((Matrix) h02Var.b).mapRect(rectF);
                if (i82Var.g(rectF.bottom)) {
                    if (!i82Var.d(rectF.top)) {
                        break;
                    }
                    RectF rectF2 = i82Var.b;
                    rectF.left = rectF2.left;
                    rectF.right = rectF2.right;
                    canvas.drawRect(rectF, paint2);
                }
            }
        }
        gc gcVar = this.i[i];
        gcVar.getClass();
        float[] fArr = gcVar.b;
        barChart.j();
        gcVar.c = barChart.getBarData().j;
        gcVar.b(jcVar);
        h02Var.f(fArr);
        boolean z = jcVar.f1104a.size() == 1;
        Paint paint3 = this.c;
        if (z) {
            paint3.setColor(jcVar.d());
        }
        while (i3 < fArr.length) {
            int i6 = i3 + 3;
            if (!i82Var.g(fArr[i6])) {
                return;
            }
            int i7 = i3 + 1;
            if (i82Var.d(fArr[i7])) {
                if (!z) {
                    paint3.setColor(jcVar.e(i3 / 4));
                }
                canvas2 = canvas;
                canvas2.drawRect(fArr[i3], fArr[i7], fArr[i3 + 2], fArr[i6], paint3);
            } else {
                canvas2 = canvas;
            }
            i3 += 4;
            canvas = canvas2;
        }
    }

    @Override // defpackage.hc
    public final void v(Canvas canvas, String str, float f, float f2, int i) {
        Paint paint = this.e;
        paint.setColor(i);
        canvas.drawText(str, f, f2, paint);
    }

    @Override // defpackage.hc
    public final void w(float f, float f2, float f3, h02 h02Var) {
        float f4 = f - f3;
        float f5 = f + f3;
        RectF rectF = this.h;
        rectF.set(f2, f4, 0.0f, f5);
        this.b.getClass();
        h02Var.getClass();
        rectF.left *= 1.0f;
        rectF.right *= 1.0f;
        ((Matrix) h02Var.f358a).mapRect(rectF);
        ((i82) h02Var.c).f417a.mapRect(rectF);
        ((Matrix) h02Var.b).mapRect(rectF);
    }

    @Override // defpackage.hc
    public final void x(fj0 fj0Var, RectF rectF) {
        rectF.centerY();
    }
}
