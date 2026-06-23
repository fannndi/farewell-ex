package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ b9(int i, Object obj, Object obj2, Object obj3) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    public /* synthetic */ b9(d20 d20Var, nb nbVar, jw0 jw0Var, eb ebVar) {
        this.g = 6;
        this.h = d20Var;
        this.i = nbVar;
        this.j = ebVar;
    }

    public /* synthetic */ b9(Object obj, ArrayList arrayList, Object obj2, int i) {
        this.g = i;
        this.h = obj;
        this.j = arrayList;
        this.i = obj2;
    }

    private final void a() {
        int i;
        boolean z;
        kp kpVar = (kp) this.h;
        vq1 vq1Var = (vq1) this.i;
        final la1 la1Var = (la1) kpVar.h;
        la1Var.getClass();
        xb2 xb2Var = vq1Var.f1098a;
        final String str = xb2Var.f1176a;
        final ArrayList arrayList = new ArrayList();
        gc2 gc2Var = (gc2) la1Var.e.u(new Callable() { // from class: ka1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = la1.this.e;
                mc2 D = workDatabase.D();
                D.getClass();
                String str2 = str;
                str2.getClass();
                arrayList.addAll((List) tl2.E(D.f625a, true, false, new y20(14, str2)));
                return workDatabase.C().b(str2);
            }
        });
        int i2 = 7;
        if (gc2Var == null) {
            ai1 h = ai1.h();
            xb2Var.toString();
            h.getClass();
            ((kj1) la1Var.d.k).execute(new n51(la1Var, i2, xb2Var));
            return;
        }
        synchronized (la1Var.k) {
            try {
                synchronized (la1Var.k) {
                    i = 1;
                    z = la1Var.c(str) != null;
                }
                if (z) {
                    Set set = (Set) la1Var.h.get(str);
                    if (((vq1) set.iterator().next()).f1098a.b == xb2Var.b) {
                        set.add(vq1Var);
                        ai1 h2 = ai1.h();
                        xb2Var.toString();
                        h2.getClass();
                    } else {
                        ((kj1) la1Var.d.k).execute(new n51(la1Var, i2, xb2Var));
                    }
                    return;
                }
                if (gc2Var.t != xb2Var.b) {
                    ((kj1) la1Var.d.k).execute(new n51(la1Var, i2, xb2Var));
                    return;
                }
                yc2 yc2Var = new yc2(new h02(la1Var.b, la1Var.c, la1Var.d, la1Var, la1Var.e, gc2Var, arrayList));
                sx sxVar = (sx) yc2Var.d.i;
                tn0 a2 = je2.a();
                sxVar.getClass();
                pn y = xc1.y(bw0.w(sxVar, a2), new wc2(yc2Var, null, i));
                y.h.a(new b9(14, la1Var, y, yc2Var), (kj1) la1Var.d.k);
                la1Var.g.put(str, yc2Var);
                HashSet hashSet = new HashSet();
                hashSet.add(vq1Var);
                la1Var.h.put(str, hashSet);
                ai1 h3 = ai1.h();
                xb2Var.toString();
                h3.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:391:0x07de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b9.run():void");
    }
}
