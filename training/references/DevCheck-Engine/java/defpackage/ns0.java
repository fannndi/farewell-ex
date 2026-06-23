package defpackage;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class ns0 {
    public static final Object k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f699a;
    public final jj1 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final wa j;

    public ns0() {
        this.f699a = new Object();
        this.b = new jj1();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new wa(15, this);
        this.e = obj;
        this.g = -1;
    }

    public ns0(Object obj) {
        this.f699a = new Object();
        this.b = new jj1();
        this.c = 0;
        this.f = k;
        this.j = new wa(15, this);
        this.e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        h9.E().j.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        c.n(d51.y("Cannot invoke ", str, " on a background thread"));
    }

    public final void b(ms0 ms0Var) {
        if (ms0Var.h) {
            if (!ms0Var.f()) {
                ms0Var.b(false);
                return;
            }
            int i = ms0Var.i;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            ms0Var.i = i2;
            ms0Var.g.a(this.e);
        }
    }

    public final void c(ms0 ms0Var) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (ms0Var != null) {
                b(ms0Var);
                ms0Var = null;
            } else {
                jj1 jj1Var = this.b;
                jj1Var.getClass();
                hj1 hj1Var = new hj1(jj1Var);
                jj1Var.i.put(hj1Var, Boolean.FALSE);
                while (hj1Var.hasNext()) {
                    b((ms0) ((Map.Entry) hj1Var.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public void e(eq0 eq0Var, v31 v31Var) {
        Object obj;
        a("observe");
        if (eq0Var.q().c == yp0.g) {
            return;
        }
        ls0 ls0Var = new ls0(this, eq0Var, v31Var);
        jj1 jj1Var = this.b;
        gj1 b = jj1Var.b(v31Var);
        if (b != null) {
            obj = b.h;
        } else {
            gj1 gj1Var = new gj1(v31Var, ls0Var);
            jj1Var.j++;
            gj1 gj1Var2 = jj1Var.h;
            if (gj1Var2 == null) {
                jj1Var.g = gj1Var;
                jj1Var.h = gj1Var;
            } else {
                gj1Var2.i = gj1Var;
                gj1Var.j = gj1Var2;
                jj1Var.h = gj1Var;
            }
            obj = null;
        }
        ms0 ms0Var = (ms0) obj;
        if (ms0Var != null && !ms0Var.d(eq0Var)) {
            c.m("Cannot add the same observer with different lifecycles");
        } else {
            if (ms0Var != null) {
                return;
            }
            eq0Var.q().a(ls0Var);
        }
    }

    public final void f(v31 v31Var) {
        Object obj;
        a("observeForever");
        ks0 ks0Var = new ks0(this, v31Var);
        jj1 jj1Var = this.b;
        gj1 b = jj1Var.b(v31Var);
        if (b != null) {
            obj = b.h;
        } else {
            gj1 gj1Var = new gj1(v31Var, ks0Var);
            jj1Var.j++;
            gj1 gj1Var2 = jj1Var.h;
            if (gj1Var2 == null) {
                jj1Var.g = gj1Var;
                jj1Var.h = gj1Var;
            } else {
                gj1Var2.i = gj1Var;
                gj1Var.j = gj1Var2;
                jj1Var.h = gj1Var;
            }
            obj = null;
        }
        ms0 ms0Var = (ms0) obj;
        if (ms0Var instanceof ls0) {
            c.m("Cannot add the same observer with different lifecycles");
        } else {
            if (ms0Var != null) {
                return;
            }
            ks0Var.b(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.f699a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            h9.E().F(this.j);
        }
    }

    public final void j(v31 v31Var) {
        a("removeObserver");
        ms0 ms0Var = (ms0) this.b.c(v31Var);
        if (ms0Var == null) {
            return;
        }
        ms0Var.c();
        ms0Var.b(false);
    }

    public void k(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }
}
