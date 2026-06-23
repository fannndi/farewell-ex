package defpackage;

import android.app.Application;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public class lu1 extends a4 {
    public final qy0 A;
    public final qy0 B;
    public final qy0 C;
    public final qy0 D;
    public final qy0 E;
    public final qy0 F;
    public boolean G;
    public final h91 c;
    public final kp d;
    public final fh e;
    public final py f;
    public final bh0 g;
    public final mw0 h;
    public final x40 i;
    public final cg j;
    public final l21 k;
    public final py1 l;
    public final m30 m;
    public final m30 n;
    public final m30 o;
    public final m30 p;
    public final j50 q;
    public final nr1 r;
    public final fy1 s;
    public final qy0 t;
    public final qy0 u;
    public final qy0 v;
    public final qy0 w;
    public final qy0 x;
    public final qy0 y;
    public final qy0 z;

    public lu1(Application application) {
        super(application);
        qy0 qy0Var = new qy0();
        this.t = qy0Var;
        qy0 qy0Var2 = new qy0();
        this.u = qy0Var2;
        qy0 qy0Var3 = new qy0();
        this.v = qy0Var3;
        qy0 qy0Var4 = new qy0();
        this.w = qy0Var4;
        qy0 qy0Var5 = new qy0();
        this.x = qy0Var5;
        qy0 qy0Var6 = new qy0();
        this.y = qy0Var6;
        qy0 qy0Var7 = new qy0();
        this.z = qy0Var7;
        qy0 qy0Var8 = new qy0();
        this.A = qy0Var8;
        qy0 qy0Var9 = new qy0();
        this.B = qy0Var9;
        qy0 qy0Var10 = new qy0();
        this.C = qy0Var10;
        qy0 qy0Var11 = new qy0();
        this.D = qy0Var11;
        qy0 qy0Var12 = new qy0();
        this.E = qy0Var12;
        qy0 qy0Var13 = new qy0();
        this.F = qy0Var13;
        h91 h91Var = new h91(application);
        this.c = h91Var;
        kp kpVar = new kp(h91Var);
        this.d = kpVar;
        this.e = new fh();
        this.f = new py(kpVar, new ku1(qy0Var));
        this.g = new bh0(kpVar, new ku1(qy0Var2));
        this.h = new mw0(kpVar, new ku1(qy0Var3));
        this.i = new x40(kpVar, new ku1(qy0Var4));
        this.j = new cg(application, kpVar, h91Var, new ku1(qy0Var5));
        this.k = new l21(application, new ku1(qy0Var6));
        py1 py1Var = new py1(application);
        this.l = py1Var;
        this.m = new m30(application, py1Var, ly1.g, new ku1(qy0Var7));
        this.n = new m30(application, py1Var, ly1.h, new ku1(qy0Var8));
        this.o = new m30(application, py1Var, ly1.l, new ku1(qy0Var9));
        this.p = new m30(kpVar, new ku1(qy0Var10));
        this.q = new j50(new ku1(qy0Var11));
        this.r = new nr1(application, new ku1(qy0Var12));
        this.s = new fy1(new ku1(qy0Var13));
    }

    @Override // defpackage.i72
    public final void b() {
        fh fhVar = this.e;
        synchronized (fhVar) {
            synchronized (fhVar) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) fhVar.j;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    fhVar.j = null;
                }
            }
        }
        Iterator it = ((HashSet) fhVar.i).iterator();
        while (it.hasNext()) {
            try {
                ((mj1) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        ((HashSet) fhVar.i).clear();
        ((ScheduledExecutorService) fhVar.h).shutdownNow();
    }
}
