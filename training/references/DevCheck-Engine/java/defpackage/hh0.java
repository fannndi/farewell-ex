package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hh0 implements p41, bk1, da0 {
    public final Context g;
    public final r20 i;
    public boolean j;
    public final i8 l;
    public final la1 m;
    public final kp n;
    public final ju o;
    public final HashMap p;
    public Boolean q;
    public final ti0 r;
    public final gr s;
    public final gr t;
    public final HashMap h = new HashMap();
    public final Object k = new Object();

    static {
        ai1.k("GreedyScheduler");
    }

    public hh0(Context context, ju juVar, yh yhVar, la1 la1Var, kp kpVar, gr grVar) {
        s00 s00Var = new s00(3);
        i8 i8Var = new i8();
        i8Var.g = s00Var;
        i8Var.h = new Object();
        this.l = i8Var;
        this.p = new HashMap();
        this.g = context;
        gm2 gm2Var = juVar.g;
        this.i = new r20(this, gm2Var, juVar.d);
        this.t = new gr(gm2Var, kpVar);
        this.s = grVar;
        this.r = new ti0(yhVar);
        this.o = juVar;
        this.m = la1Var;
        this.n = kpVar;
    }

    @Override // defpackage.bk1
    public final void a(String str) {
        List<vq1> d;
        Runnable runnable;
        if (this.q == null) {
            this.q = Boolean.valueOf(ja1.a(this.g, this.o));
        }
        if (!this.q.booleanValue()) {
            ai1.h().getClass();
            return;
        }
        if (!this.j) {
            this.m.a(this);
            this.j = true;
        }
        ai1.h().getClass();
        r20 r20Var = this.i;
        if (r20Var != null && (runnable = (Runnable) r20Var.d.remove(str)) != null) {
            ((Handler) r20Var.b.h).removeCallbacks(runnable);
        }
        i8 i8Var = this.l;
        i8Var.getClass();
        str.getClass();
        synchronized (i8Var.h) {
            d = ((s00) i8Var.g).d(str);
        }
        for (vq1 vq1Var : d) {
            this.t.e(vq1Var);
            kp kpVar = this.n;
            kpVar.getClass();
            kpVar.p(vq1Var, -512);
        }
    }

    @Override // defpackage.p41
    public final void b(gc2 gc2Var, pw pwVar) {
        xb2 q = xc1.q(gc2Var);
        boolean z = pwVar instanceof nw;
        kp kpVar = this.n;
        gr grVar = this.t;
        i8 i8Var = this.l;
        if (z) {
            if (i8Var.h(q)) {
                return;
            }
            ai1 h = ai1.h();
            q.toString();
            h.getClass();
            vq1 o = i8Var.o(q);
            grVar.D(o);
            kpVar.getClass();
            kpVar.o(o, null);
            return;
        }
        ai1 h2 = ai1.h();
        q.toString();
        h2.getClass();
        vq1 l = i8Var.l(q);
        if (l != null) {
            grVar.e(l);
            int i = ((ow) pwVar).f762a;
            kpVar.getClass();
            kpVar.p(l, i);
        }
    }

    @Override // defpackage.bk1
    public final void c(gc2... gc2VarArr) {
        long max;
        if (this.q == null) {
            this.q = Boolean.valueOf(ja1.a(this.g, this.o));
        }
        if (!this.q.booleanValue()) {
            ai1.h().getClass();
            return;
        }
        if (!this.j) {
            this.m.a(this);
            this.j = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        boolean z = false;
        for (gc2 gc2Var : gc2VarArr) {
            if (!this.l.h(xc1.q(gc2Var))) {
                synchronized (this.k) {
                    try {
                        xb2 q = xc1.q(gc2Var);
                        gh0 gh0Var = (gh0) this.p.get(q);
                        if (gh0Var == null) {
                            int i = gc2Var.k;
                            this.o.d.getClass();
                            gh0Var = new gh0(i, System.currentTimeMillis());
                            this.p.put(q, gh0Var);
                        }
                        max = (Math.max((gc2Var.k - gh0Var.f340a) - 5, 0) * 30000) + gh0Var.b;
                    } finally {
                    }
                }
                long max2 = Math.max(gc2Var.a(), max);
                this.o.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (gc2Var.b == yb2.g) {
                    if (currentTimeMillis < max2) {
                        r20 r20Var = this.i;
                        if (r20Var != null) {
                            gm2 gm2Var = r20Var.b;
                            HashMap hashMap = r20Var.d;
                            Runnable runnable = (Runnable) hashMap.remove(gc2Var.f332a);
                            if (runnable != null) {
                                ((Handler) gm2Var.h).removeCallbacks(runnable);
                            }
                            hk2 hk2Var = new hk2(r20Var, gc2Var, 9, z);
                            hashMap.put(gc2Var.f332a, hk2Var);
                            r20Var.c.getClass();
                            ((Handler) gm2Var.h).postDelayed(hk2Var, max2 - System.currentTimeMillis());
                        }
                    } else if (!ym0.b(lw.j, gc2Var.j)) {
                        lw lwVar = gc2Var.j;
                        if (lwVar.d) {
                            ai1 h = ai1.h();
                            gc2Var.toString();
                            h.getClass();
                        } else if (lwVar.i.isEmpty()) {
                            hashSet.add(gc2Var);
                            hashSet2.add(gc2Var.f332a);
                        } else {
                            ai1 h2 = ai1.h();
                            gc2Var.toString();
                            h2.getClass();
                        }
                    } else if (!this.l.h(xc1.q(gc2Var))) {
                        ai1.h().getClass();
                        i8 i8Var = this.l;
                        i8Var.getClass();
                        vq1 o = i8Var.o(xc1.q(gc2Var));
                        this.t.D(o);
                        kp kpVar = this.n;
                        kpVar.getClass();
                        kpVar.o(o, null);
                    }
                }
            }
        }
        synchronized (this.k) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    ai1.h().getClass();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        gc2 gc2Var2 = (gc2) it.next();
                        xb2 q2 = xc1.q(gc2Var2);
                        if (!this.h.containsKey(q2)) {
                            this.h.put(q2, ob2.a(this.r, gc2Var2, (sx) this.s.i, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.da0
    public final void d(xb2 xb2Var, boolean z) {
        rn0 rn0Var;
        vq1 l = this.l.l(xb2Var);
        if (l != null) {
            this.t.e(l);
        }
        synchronized (this.k) {
            rn0Var = (rn0) this.h.remove(xb2Var);
        }
        if (rn0Var != null) {
            ai1 h = ai1.h();
            Objects.toString(xb2Var);
            h.getClass();
            rn0Var.e(null);
        }
        if (z) {
            return;
        }
        synchronized (this.k) {
            this.p.remove(xb2Var);
        }
    }

    @Override // defpackage.bk1
    public final boolean e() {
        return false;
    }
}
