package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes.dex */
public final class mf2 implements lg0, mg0 {
    public final q4 h;
    public final u4 i;
    public final xi0 j;
    public final int m;
    public final vf2 n;
    public boolean o;
    public final /* synthetic */ ng0 r;
    public final LinkedList g = new LinkedList();
    public final HashSet k = new HashSet();
    public final HashMap l = new HashMap();
    public final ArrayList p = new ArrayList();
    public uu q = null;

    public mf2(ng0 ng0Var, hg2 hg2Var) {
        this.r = ng0Var;
        Looper looper = ng0Var.m.getLooper();
        fh a2 = hg2Var.a();
        yf yfVar = new yf((r9) a2.h, (String) a2.i, (String) a2.j);
        hf2 hf2Var = (hf2) hg2Var.c.h;
        xc1.j(hf2Var);
        q4 e = hf2Var.e(hg2Var.f384a, looper, yfVar, hg2Var.d, this, this);
        String str = hg2Var.b;
        if (str != null && (e instanceof a)) {
            ((a) e).r = str;
        }
        if (str != null && (e instanceof z21)) {
            iy1.g(e);
            throw null;
        }
        this.h = e;
        this.i = hg2Var.e;
        this.j = new xi0(13);
        this.m = hg2Var.f;
        if (!e.k()) {
            this.n = null;
            return;
        }
        Context context = ng0Var.e;
        lg2 lg2Var = ng0Var.m;
        fh a3 = hg2Var.a();
        this.n = new vf2(context, lg2Var, new yf((r9) a3.h, (String) a3.i, (String) a3.j));
    }

    @Override // defpackage.lg0
    public final void a(int i) {
        Looper myLooper = Looper.myLooper();
        lg2 lg2Var = this.r.m;
        if (myLooper == lg2Var.getLooper()) {
            i(i);
        } else {
            lg2Var.post(new ce(i, 6, this));
        }
    }

    @Override // defpackage.mg0
    public final void b(uu uuVar) {
        o(uuVar, null);
    }

    public final void c(uu uuVar) {
        HashSet hashSet = this.k;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            rw.b();
        } else {
            if (md2.j(uuVar, uu.l)) {
                this.h.g();
            }
            throw null;
        }
    }

    @Override // defpackage.lg0
    public final void d() {
        Looper myLooper = Looper.myLooper();
        lg2 lg2Var = this.r.m;
        if (myLooper == lg2Var.getLooper()) {
            h();
        } else {
            lg2Var.post(new f52(4, this));
        }
    }

    public final void e(Status status) {
        xc1.i(this.r.m);
        f(status, null, false);
    }

    public final void f(Status status, Exception exc, boolean z) {
        xc1.i(this.r.m);
        if ((status == null) == (exc == null)) {
            c.m(oWuW.TPuUDFOjYrHT);
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            sf2 sf2Var = (sf2) it.next();
            if (!z || sf2Var.f934a == 2) {
                if (status != null) {
                    sf2Var.c(status);
                } else {
                    sf2Var.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.g;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sf2 sf2Var = (sf2) arrayList.get(i);
            if (!this.h.a()) {
                return;
            }
            if (k(sf2Var)) {
                linkedList.remove(sf2Var);
            }
        }
    }

    public final void h() {
        ng0 ng0Var = this.r;
        xc1.i(ng0Var.m);
        this.q = null;
        c(uu.l);
        lg2 lg2Var = ng0Var.m;
        if (this.o) {
            u4 u4Var = this.i;
            lg2Var.removeMessages(11, u4Var);
            lg2Var.removeMessages(9, u4Var);
            this.o = false;
        }
        Iterator it = this.l.values().iterator();
        if (it.hasNext()) {
            throw d51.l(it);
        }
        g();
        j();
    }

    public final void i(int i) {
        ng0 ng0Var = this.r;
        lg2 lg2Var = ng0Var.m;
        xc1.i(ng0Var.m);
        this.q = null;
        this.o = true;
        String i2 = this.h.i();
        xi0 xi0Var = this.j;
        xi0Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (i2 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(i2);
        }
        xi0Var.l(true, new Status(20, sb.toString(), null, null));
        u4 u4Var = this.i;
        lg2Var.sendMessageDelayed(Message.obtain(lg2Var, 9, u4Var), 5000L);
        lg2Var.sendMessageDelayed(Message.obtain(lg2Var, 11, u4Var), 120000L);
        ((SparseIntArray) ng0Var.g.g).clear();
        Iterator it = this.l.values().iterator();
        if (it.hasNext()) {
            throw d51.l(it);
        }
    }

    public final void j() {
        ng0 ng0Var = this.r;
        lg2 lg2Var = ng0Var.m;
        u4 u4Var = this.i;
        lg2Var.removeMessages(12, u4Var);
        lg2Var.sendMessageDelayed(lg2Var.obtainMessage(12, u4Var), ng0Var.f680a);
    }

    public final boolean k(sf2 sf2Var) {
        jb0 jb0Var;
        String str = rlfWzcx.orZXQNsr;
        if (sf2Var == null) {
            xi0 xi0Var = this.j;
            q4 q4Var = this.h;
            sf2Var.f(xi0Var, q4Var.k());
            try {
                sf2Var.e(this);
                return true;
            } catch (DeadObjectException unused) {
                a(1);
                q4Var.c(str);
                return true;
            }
        }
        jb0[] b = sf2Var.b(this);
        if (b != null && b.length != 0) {
            jb0[] f = this.h.f();
            if (f == null) {
                f = new jb0[0];
            }
            p9 p9Var = new p9(f.length);
            for (jb0 jb0Var2 : f) {
                p9Var.put(jb0Var2.g, Long.valueOf(jb0Var2.a()));
            }
            int length = b.length;
            for (int i = 0; i < length; i++) {
                jb0Var = b[i];
                Long l = (Long) p9Var.get(jb0Var.g);
                if (l == null || l.longValue() < jb0Var.a()) {
                    break;
                }
            }
        }
        jb0Var = null;
        if (jb0Var == null) {
            xi0 xi0Var2 = this.j;
            q4 q4Var2 = this.h;
            sf2Var.f(xi0Var2, q4Var2.k());
            try {
                sf2Var.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                a(1);
                q4Var2.c(str);
                return true;
            }
        }
        this.h.getClass();
        if (!this.r.n || !sf2Var.a(this)) {
            sf2Var.d(new s42(jb0Var));
            return true;
        }
        nf2 nf2Var = new nf2(this.i, jb0Var);
        int indexOf = this.p.indexOf(nf2Var);
        ArrayList arrayList = this.p;
        if (indexOf >= 0) {
            nf2 nf2Var2 = (nf2) arrayList.get(indexOf);
            this.r.m.removeMessages(15, nf2Var2);
            lg2 lg2Var = this.r.m;
            lg2Var.sendMessageDelayed(Message.obtain(lg2Var, 15, nf2Var2), 5000L);
        } else {
            arrayList.add(nf2Var);
            lg2 lg2Var2 = this.r.m;
            lg2Var2.sendMessageDelayed(Message.obtain(lg2Var2, 15, nf2Var), 5000L);
            lg2 lg2Var3 = this.r.m;
            lg2Var3.sendMessageDelayed(Message.obtain(lg2Var3, 16, nf2Var), 120000L);
            uu uuVar = new uu(2, null, null);
            if (!l(uuVar)) {
                this.r.a(uuVar, this.m);
            }
        }
        return false;
    }

    public final boolean l(uu uuVar) {
        synchronized (ng0.q) {
        }
        return false;
    }

    public final void m() {
        ng0 ng0Var = this.r;
        xc1.i(ng0Var.m);
        q4 q4Var = this.h;
        if (q4Var.a() || q4Var.e()) {
            return;
        }
        try {
            i8 i8Var = ng0Var.g;
            Context context = ng0Var.e;
            SparseIntArray sparseIntArray = (SparseIntArray) i8Var.g;
            xc1.j(context);
            int d = q4Var.d();
            int i = ((SparseIntArray) i8Var.g).get(d, -1);
            if (i == -1) {
                i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= sparseIntArray.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i2);
                    if (keyAt > d && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i == -1) {
                    i = ((jg0) i8Var.h).b(context, d);
                }
                sparseIntArray.put(d, i);
            }
            if (i != 0) {
                uu uuVar = new uu(i, null, null);
                uuVar.toString();
                o(uuVar, null);
                return;
            }
            of2 of2Var = new of2(ng0Var, q4Var, this.i);
            if (q4Var.k()) {
                vf2 vf2Var = this.n;
                xc1.j(vf2Var);
                Handler handler = vf2Var.i;
                yf yfVar = vf2Var.l;
                uo1 uo1Var = vf2Var.m;
                if (uo1Var != null) {
                    uo1Var.n();
                }
                yfVar.g = Integer.valueOf(System.identityHashCode(vf2Var));
                vf2Var.m = (uo1) vf2Var.j.e(vf2Var.h, handler.getLooper(), yfVar, (vo1) yfVar.f, vf2Var, vf2Var);
                vf2Var.n = of2Var;
                Set set = vf2Var.k;
                if (set == null || set.isEmpty()) {
                    handler.post(new f52(6, vf2Var));
                } else {
                    uo1 uo1Var2 = vf2Var.m;
                    uo1Var2.getClass();
                    uo1Var2.h(new gm2(uo1Var2));
                }
            }
            try {
                q4Var.h(of2Var);
            } catch (SecurityException e) {
                o(new uu(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            o(new uu(10, null, null), e2);
        }
    }

    public final void n(sf2 sf2Var) {
        xc1.i(this.r.m);
        boolean a2 = this.h.a();
        LinkedList linkedList = this.g;
        if (a2) {
            if (k(sf2Var)) {
                j();
                return;
            } else {
                linkedList.add(sf2Var);
                return;
            }
        }
        linkedList.add(sf2Var);
        uu uuVar = this.q;
        if (uuVar == null || uuVar.h == 0 || uuVar.i == null) {
            m();
        } else {
            o(uuVar, null);
        }
    }

    public final void o(uu uuVar, RuntimeException runtimeException) {
        uo1 uo1Var;
        xc1.i(this.r.m);
        vf2 vf2Var = this.n;
        if (vf2Var != null && (uo1Var = vf2Var.m) != null) {
            uo1Var.n();
        }
        xc1.i(this.r.m);
        this.q = null;
        ((SparseIntArray) this.r.g.g).clear();
        c(uuVar);
        if ((this.h instanceof jg2) && uuVar.h != 24) {
            ng0 ng0Var = this.r;
            ng0Var.b = true;
            lg2 lg2Var = ng0Var.m;
            lg2Var.sendMessageDelayed(lg2Var.obtainMessage(19), 300000L);
        }
        if (uuVar.h == 4) {
            e(ng0.p);
            return;
        }
        if (this.g.isEmpty()) {
            this.q = uuVar;
            return;
        }
        ng0 ng0Var2 = this.r;
        if (runtimeException != null) {
            xc1.i(ng0Var2.m);
            f(null, runtimeException, false);
            return;
        }
        boolean z = ng0Var2.n;
        u4 u4Var = this.i;
        if (!z) {
            e(ng0.b(u4Var, uuVar));
            return;
        }
        f(ng0.b(u4Var, uuVar), null, true);
        if (this.g.isEmpty() || l(uuVar) || this.r.a(uuVar, this.m)) {
            return;
        }
        if (uuVar.h == 18) {
            this.o = true;
        }
        if (!this.o) {
            e(ng0.b(this.i, uuVar));
            return;
        }
        ng0 ng0Var3 = this.r;
        u4 u4Var2 = this.i;
        lg2 lg2Var2 = ng0Var3.m;
        lg2Var2.sendMessageDelayed(Message.obtain(lg2Var2, 9, u4Var2), 5000L);
    }

    public final void p(uu uuVar) {
        xc1.i(this.r.m);
        q4 q4Var = this.h;
        q4Var.c("onSignInFailed for " + q4Var.getClass().getName() + " with " + String.valueOf(uuVar));
        o(uuVar, null);
    }

    public final void q() {
        xc1.i(this.r.m);
        Status status = ng0.o;
        e(status);
        this.j.l(false, status);
        for (js0 js0Var : (js0[]) this.l.keySet().toArray(new js0[0])) {
            n(new eg2(new nv1()));
        }
        c(new uu(4, null, null));
        q4 q4Var = this.h;
        if (q4Var.a()) {
            q4Var.j(new my1(this));
        }
    }
}
