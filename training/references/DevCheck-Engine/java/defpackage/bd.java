package defpackage;

import com.github.mikephil.charting.charts.BarChart;

/* loaded from: classes.dex */
public class bd extends pp {
    @Override // defpackage.pp, defpackage.sk0
    public fj0 a(float f, float f2) {
        fj0 a2 = super.a(f, f2);
        if (a2 == null) {
            return null;
        }
        cd cdVar = this.g;
        ht0 b = cdVar.f0.b(f, f2);
        jc jcVar = (jc) ((BarChart) cdVar).getBarData().e(a2.e);
        if (!jcVar.n()) {
            ht0.b(b);
            return a2;
        }
        if (((ad) jcVar.h((float) b.h, (float) b.i, 3)) == null) {
            return null;
        }
        return a2;
    }

    @Override // defpackage.pp
    public final ed c() {
        return ((BarChart) this.g).getBarData();
    }

    @Override // defpackage.pp
    public float d(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3);
    }
}
