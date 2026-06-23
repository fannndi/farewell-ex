package defpackage;

import com.github.mikephil.charting.charts.BarChart;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jj0 extends bd {
    @Override // defpackage.bd, defpackage.pp, defpackage.sk0
    public final fj0 a(float f, float f2) {
        cd cdVar = this.g;
        ic barData = ((BarChart) cdVar).getBarData();
        ht0 b = cdVar.f0.b(f2, f);
        fj0 e = e((float) b.i, f2, f);
        if (e == null) {
            return null;
        }
        jc jcVar = (jc) barData.e(e.e);
        if (!jcVar.n()) {
            ht0.b(b);
            return e;
        }
        if (((ad) jcVar.h((float) b.i, (float) b.h, 3)) == null) {
            return null;
        }
        return e;
    }

    @Override // defpackage.pp
    public final ArrayList b(rk0 rk0Var, int i, float f) {
        e90 h;
        ArrayList arrayList = new ArrayList();
        w00 w00Var = (w00) rk0Var;
        ArrayList f2 = w00Var.f(f);
        if (f2.size() == 0 && (h = w00Var.h(f, Float.NaN, 3)) != null) {
            f2 = w00Var.f(h.a());
        }
        if (f2.size() != 0) {
            int size = f2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = f2.get(i2);
                i2++;
                e90 e90Var = (e90) obj;
                ht0 a2 = ((BarChart) this.g).f0.a(e90Var.b(), e90Var.a());
                arrayList.add(new fj0(e90Var.a(), e90Var.b(), (float) a2.h, (float) a2.i, i, 1));
            }
        }
        return arrayList;
    }

    @Override // defpackage.bd, defpackage.pp
    public final float d(float f, float f2, float f3, float f4) {
        return Math.abs(f2 - f4);
    }
}
