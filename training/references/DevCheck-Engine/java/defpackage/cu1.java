package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class cu1 extends dn2 {
    public final HashMap b = new HashMap();
    public final /* synthetic */ du1 c;

    public cu1(du1 du1Var) {
        this.c = du1Var;
    }

    @Override // defpackage.dn2
    public final void a(ma2 ma2Var) {
        ArrayList arrayList = this.c.b;
        if ((ma2Var.f621a.d() & 519) != 0) {
            this.b.remove(ma2Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                wa1 wa1Var = (wa1) arrayList.get(size);
                int i = wa1Var.c;
                boolean z = i > 0;
                int i2 = i - 1;
                wa1Var.c = i2;
                if (z && i2 == 0) {
                    ArrayList arrayList2 = wa1Var.f1122a;
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        throw iy1.e(arrayList2, size2);
                    }
                }
            }
        }
    }

    @Override // defpackage.dn2
    public final void b(ma2 ma2Var) {
        ArrayList arrayList = this.c.b;
        if ((ma2Var.f621a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((wa1) arrayList.get(size)).c++;
            }
        }
    }

    @Override // defpackage.dn2
    public final gb2 c(gb2 gb2Var, List list) {
        ArrayList arrayList = this.c.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        for (int size = list.size() - 1; size >= 0; size--) {
            ma2 ma2Var = (ma2) list.get(size);
            Integer num = (Integer) this.b.get(ma2Var);
            if (num != null) {
                int intValue = num.intValue();
                float a2 = ma2Var.f621a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a2;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a2;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a2;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a2;
                }
            }
        }
        mm0.b(gb2Var.f329a.h(519), gb2Var.f329a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList2 = ((wa1) arrayList.get(size2)).f1122a;
            int size3 = arrayList2.size() - 1;
            if (size3 >= 0) {
                throw iy1.e(arrayList2, size3);
            }
        }
        return gb2Var;
    }

    @Override // defpackage.dn2
    public final zf d(ma2 ma2Var, zf zfVar) {
        if ((ma2Var.f621a.d() & 519) != 0) {
            mm0 mm0Var = (mm0) zfVar.i;
            mm0 mm0Var2 = (mm0) zfVar.h;
            int i = mm0Var.f643a != mm0Var2.f643a ? 1 : 0;
            if (mm0Var.b != mm0Var2.b) {
                i |= 2;
            }
            if (mm0Var.c != mm0Var2.c) {
                i |= 4;
            }
            if (mm0Var.d != mm0Var2.d) {
                i |= 8;
            }
            this.b.put(ma2Var, Integer.valueOf(i));
        }
        return zfVar;
    }
}
