package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class pp implements sk0 {
    public final cd g;
    public final ArrayList h = new ArrayList();

    public pp(cd cdVar) {
        this.g = cdVar;
    }

    public static float f(ArrayList arrayList, float f, int i) {
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            fj0 fj0Var = (fj0) arrayList.get(i2);
            if (fj0Var.f == i) {
                float abs = Math.abs(fj0Var.d - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
        }
        return f2;
    }

    @Override // defpackage.sk0
    public fj0 a(float f, float f2) {
        ht0 b = this.g.f0.b(f, f2);
        float f3 = (float) b.h;
        ht0.b(b);
        return e(f3, f, f2);
    }

    public ArrayList b(rk0 rk0Var, int i, float f) {
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
                ht0 a2 = this.g.f0.a(e90Var.a(), e90Var.b());
                arrayList.add(new fj0(e90Var.a(), e90Var.b(), (float) a2.h, (float) a2.i, i, 1));
            }
        }
        return arrayList;
    }

    public ed c() {
        return this.g.getData();
    }

    public float d(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f - f3, f2 - f4);
    }

    public final fj0 e(float f, float f2, float f3) {
        ArrayList arrayList = this.h;
        arrayList.clear();
        ed c = c();
        if (c != null) {
            int f4 = c.f();
            for (int i = 0; i < f4; i++) {
                rk0 e = c.e(i);
                ((w00) e).getClass();
                arrayList.addAll(b(e, i, f));
            }
        }
        fj0 fj0Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int i2 = f(arrayList, f3, 1) >= f(arrayList, f3, 2) ? 2 : 1;
        float maxHighlightDistance = this.g.getMaxHighlightDistance();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            fj0 fj0Var2 = (fj0) arrayList.get(i3);
            if (fj0Var2.f == i2) {
                float d = d(f2, f3, fj0Var2.c, fj0Var2.d);
                if (d < maxHighlightDistance) {
                    fj0Var = fj0Var2;
                    maxHighlightDistance = d;
                }
            }
        }
        return fj0Var;
    }
}
