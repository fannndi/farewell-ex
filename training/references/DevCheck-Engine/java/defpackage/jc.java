package defpackage;

import android.graphics.Color;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jc extends fd {
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final String[] t;

    public jc(ArrayList arrayList) {
        super(null, arrayList);
        this.p = 1;
        this.q = Color.rgb(215, 215, 215);
        this.r = -16777216;
        this.s = 120;
        this.t = new String[]{"Stack"};
        this.o = Color.rgb(0, 0, 0);
        for (int i = 0; i < arrayList.size(); i++) {
            ((ad) arrayList.get(i)).getClass();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ad) arrayList.get(i2)).getClass();
        }
    }

    @Override // defpackage.w00
    public final void a(e90 e90Var) {
        ad adVar = (ad) e90Var;
        if (adVar == null || Float.isNaN(adVar.g)) {
            return;
        }
        float f = adVar.g;
        if (f < this.l) {
            this.l = f;
        }
        if (f > this.k) {
            this.k = f;
        }
        b(adVar);
    }

    public final boolean n() {
        return this.p > 1;
    }
}
