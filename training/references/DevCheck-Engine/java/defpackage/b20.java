package defpackage;

import android.util.Log;
import android.widget.ImageView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final /* synthetic */ class b20 implements vt1, nn, oz0, xi1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ b20(int i, Object obj, Object obj2, Object obj3) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    public /* synthetic */ b20(zi1 zi1Var, Object obj, nb nbVar, int i) {
        this.g = i;
        this.h = zi1Var;
        this.j = obj;
        this.i = nbVar;
    }

    @Override // defpackage.nn
    public Object a(mn mnVar) {
        qx qxVar = (qx) this.h;
        cy cyVar = (cy) this.i;
        pf0 pf0Var = (pf0) this.j;
        r60 r60Var = new r60(5, (rn0) qxVar.r(pg0.k));
        dg1 dg1Var = mnVar.c;
        if (dg1Var != null) {
            dg1Var.a(r60Var, r40.g);
        }
        return ju0.X(k32.e(qxVar), null, cyVar, new bp(pf0Var, mnVar, null, 2), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // defpackage.xi1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b20.apply(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.vt1
    public Object e() {
        d20 d20Var = (d20) this.h;
        nb nbVar = (nb) this.i;
        eb ebVar = (eb) this.j;
        zi1 zi1Var = d20Var.d;
        zi1Var.getClass();
        d91 d91Var = nbVar.c;
        int i = 3;
        if (Log.isLoggable(op0.w("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(d91Var);
        }
        ((Long) zi1Var.j(new b20(zi1Var, ebVar, nbVar, i))).getClass();
        d20Var.f166a.N(nbVar, 1, false);
        return null;
    }

    @Override // defpackage.oz0
    public void k(int i) {
        l01 l01Var = (l01) this.h;
        xz0 xz0Var = (xz0) this.i;
        kz0 kz0Var = (kz0) this.j;
        String str = ((hn0) l01Var.d.get(xz0Var.b())).z;
        boolean z = l01.G;
        ImageView imageView = kz0Var.A;
        if (z) {
            imageView.setImageResource(R.drawable.ic_action_down);
        } else {
            imageView.setImageResource(R.drawable.ic_action_down_light);
        }
    }
}
