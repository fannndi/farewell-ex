package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class hc extends hd {
    public final BarChart g;
    public final RectF h;
    public gc[] i;
    public final Paint j;
    public final Paint k;
    public final RectF l;

    public hc(BarChart barChart, np npVar, i82 i82Var) {
        super(npVar, i82Var);
        this.h = new RectF();
        this.l = new RectF();
        this.g = barChart;
        Paint paint = new Paint(1);
        this.d = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.d.setColor(Color.rgb(0, 0, 0));
        this.d.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.j = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.k = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.v00
    public final void m(Canvas canvas) {
        ic barData = this.g.getBarData();
        for (int i = 0; i < barData.f(); i++) {
            jc jcVar = (jc) barData.e(i);
            if (jcVar.i) {
                u(canvas, jcVar, i);
            }
        }
    }

    @Override // defpackage.v00
    public final void n(Canvas canvas) {
    }

    @Override // defpackage.v00
    public final void o(Canvas canvas, fj0[] fj0VarArr) {
        BarChart barChart = this.g;
        ic barData = barChart.getBarData();
        for (fj0 fj0Var : fj0VarArr) {
            jc jcVar = (jc) barData.e(fj0Var.e);
            if (jcVar != null) {
                e90 e90Var = (ad) jcVar.h(fj0Var.f283a, fj0Var.b, 3);
                if (s(e90Var, jcVar)) {
                    h02 h02Var = barChart.f0;
                    this.d.setColor(jcVar.o);
                    this.d.setAlpha(jcVar.s);
                    w(e90Var.i, e90Var.g, barData.j / 2.0f, h02Var);
                    RectF rectF = this.h;
                    x(fj0Var, rectF);
                    canvas.drawRect(rectF, this.d);
                }
            }
        }
    }

    @Override // defpackage.v00
    public void p(Canvas canvas) {
        it0 it0Var;
        i82 i82Var;
        q52 q52Var;
        i82 i82Var2;
        it0 it0Var2;
        int i;
        q52 q52Var2;
        gc gcVar;
        hc hcVar = this;
        i82 i82Var3 = (i82) hcVar.f202a;
        BarChart barChart = hcVar.g;
        if (hcVar.r(barChart)) {
            ArrayList arrayList = barChart.getBarData().i;
            float c = n52.c(4.5f);
            boolean z = barChart.o0;
            int i2 = 0;
            while (i2 < barChart.getBarData().f()) {
                jc jcVar = (jc) arrayList.get(i2);
                if (hd.t(jcVar)) {
                    hcVar.l(jcVar);
                    barChart.j();
                    float a2 = n52.a(hcVar.e, "8");
                    float f = z ? -c : a2 + c;
                    float f2 = z ? a2 + c : -c;
                    gc gcVar2 = hcVar.i[i2];
                    hcVar.b.getClass();
                    q52 j = jcVar.j();
                    it0 c2 = it0.c(jcVar.g);
                    c2.h = n52.c(c2.h);
                    c2.i = n52.c(c2.i);
                    if (jcVar.n()) {
                        q52 q52Var3 = j;
                        it0Var = c2;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < jcVar.j.size() * 1.0f) {
                            ad adVar = (ad) jcVar.g(i3);
                            adVar.getClass();
                            float[] fArr = gcVar2.b;
                            float f3 = (fArr[i4] + fArr[i4 + 2]) / 2.0f;
                            int k = jcVar.k(i3);
                            if (!i82Var3.f(f3)) {
                                break;
                            }
                            int i5 = i4 + 1;
                            int i6 = i3;
                            if (i82Var3.h(fArr[i5]) && i82Var3.e(f3)) {
                                if (jcVar.e) {
                                    q52Var3.getClass();
                                    i82Var = i82Var3;
                                    q52Var = q52Var3;
                                    v(canvas, q52Var.a(adVar.g), f3, fArr[i5] + (adVar.g >= 0.0f ? f : f2), k);
                                } else {
                                    i82Var = i82Var3;
                                    q52Var = q52Var3;
                                }
                                i4 += 4;
                                i3 = i6 + 1;
                                q52Var3 = q52Var;
                            } else {
                                i82Var = i82Var3;
                                q52Var3 = q52Var3;
                                i3 = i6;
                            }
                            i82Var3 = i82Var;
                        }
                    } else {
                        int i7 = 0;
                        while (true) {
                            float f4 = i7;
                            float[] fArr2 = gcVar2.b;
                            if (f4 >= fArr2.length * 1.0f) {
                                break;
                            }
                            float f5 = (fArr2[i7] + fArr2[i7 + 2]) / 2.0f;
                            if (!i82Var3.f(f5)) {
                                break;
                            }
                            int i8 = i7 + 1;
                            gc gcVar3 = gcVar2;
                            if (i82Var3.h(fArr2[i8]) && i82Var3.e(f5)) {
                                int i9 = i7 / 4;
                                ad adVar2 = (ad) jcVar.g(i9);
                                it0Var2 = c2;
                                float f6 = adVar2.g;
                                if (jcVar.e) {
                                    j.getClass();
                                    String a3 = j.a(adVar2.g);
                                    float f7 = f6 >= 0.0f ? fArr2[i8] + f : fArr2[i7 + 3] + f2;
                                    i = i7;
                                    gcVar = gcVar3;
                                    q52Var2 = j;
                                    v(canvas, a3, f5, f7, jcVar.k(i9));
                                    i7 = i + 4;
                                    gcVar2 = gcVar;
                                    j = q52Var2;
                                    c2 = it0Var2;
                                }
                            } else {
                                it0Var2 = c2;
                            }
                            i = i7;
                            gcVar = gcVar3;
                            q52Var2 = j;
                            i7 = i + 4;
                            gcVar2 = gcVar;
                            j = q52Var2;
                            c2 = it0Var2;
                        }
                        it0Var = c2;
                    }
                    i82Var2 = i82Var3;
                    it0.d(it0Var);
                } else {
                    i82Var2 = i82Var3;
                }
                i2++;
                hcVar = this;
                i82Var3 = i82Var2;
            }
        }
    }

    @Override // defpackage.v00
    public void q() {
        ic barData = this.g.getBarData();
        this.i = new gc[barData.f()];
        for (int i = 0; i < this.i.length; i++) {
            jc jcVar = (jc) barData.e(i);
            gc[] gcVarArr = this.i;
            int size = jcVar.j.size() * 4;
            int i2 = jcVar.n() ? jcVar.p : 1;
            barData.f();
            gcVarArr[i] = new gc(size * i2, jcVar.n());
        }
    }

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
                RectF rectF = this.l;
                rectF.left = f2 - f;
                rectF.right = f2 + f;
                ((Matrix) h02Var.f358a).mapRect(rectF);
                ((i82) h02Var.c).f417a.mapRect(rectF);
                ((Matrix) h02Var.b).mapRect(rectF);
                if (i82Var.e(rectF.right)) {
                    if (!i82Var.f(rectF.left)) {
                        break;
                    }
                    RectF rectF2 = i82Var.b;
                    rectF.top = rectF2.top;
                    rectF.bottom = rectF2.bottom;
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
            int i6 = i3 + 2;
            if (!i82Var.e(fArr[i6])) {
                canvas2 = canvas;
            } else {
                if (!i82Var.f(fArr[i3])) {
                    return;
                }
                if (!z) {
                    paint3.setColor(jcVar.e(i3 / 4));
                }
                canvas2 = canvas;
                canvas2.drawRect(fArr[i3], fArr[i3 + 1], fArr[i6], fArr[i3 + 3], paint3);
            }
            i3 += 4;
            canvas = canvas2;
        }
    }

    public void v(Canvas canvas, String str, float f, float f2, int i) {
        Paint paint = this.e;
        paint.setColor(i);
        canvas.drawText(str, f, f2, paint);
    }

    public void w(float f, float f2, float f3, h02 h02Var) {
        float f4 = f - f3;
        float f5 = f + f3;
        RectF rectF = this.h;
        rectF.set(f4, f2, f5, 0.0f);
        this.b.getClass();
        h02Var.getClass();
        rectF.top *= 1.0f;
        rectF.bottom *= 1.0f;
        ((Matrix) h02Var.f358a).mapRect(rectF);
        ((i82) h02Var.c).f417a.mapRect(rectF);
        ((Matrix) h02Var.b).mapRect(rectF);
    }

    public void x(fj0 fj0Var, RectF rectF) {
        rectF.centerX();
    }
}
