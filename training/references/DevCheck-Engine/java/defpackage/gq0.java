package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class gq0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f350a;
    public ab0 b;
    public yp0 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final zq1 i;

    public gq0(eq0 eq0Var) {
        new AtomicReference(null);
        this.f350a = true;
        this.b = new ab0();
        yp0 yp0Var = yp0.h;
        this.c = yp0Var;
        this.h = new ArrayList();
        this.d = new WeakReference(eq0Var);
        this.i = new zq1(yp0Var);
    }

    public final void a(dq0 dq0Var) {
        bq0 a20Var;
        Object obj;
        eq0 eq0Var;
        dq0Var.getClass();
        c("addObserver");
        yp0 yp0Var = this.c;
        yp0 yp0Var2 = yp0.g;
        if (yp0Var != yp0Var2) {
            yp0Var2 = yp0.h;
        }
        fq0 fq0Var = new fq0();
        HashMap hashMap = hq0.f395a;
        boolean z = dq0Var instanceof bq0;
        boolean z2 = dq0Var instanceof y10;
        int i = 1;
        if (z && z2) {
            a20Var = new a20((y10) dq0Var, (bq0) dq0Var);
        } else if (z2) {
            a20Var = new a20((y10) dq0Var, (bq0) null);
        } else if (z) {
            a20Var = (bq0) dq0Var;
        } else {
            Class<?> cls = dq0Var.getClass();
            if (hq0.b(cls) == 2) {
                Object obj2 = hq0.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    hq0.a((Constructor) list.get(0), dq0Var);
                    throw null;
                }
                int size = list.size();
                cg0[] cg0VarArr = new cg0[size];
                if (size > 0) {
                    hq0.a((Constructor) list.get(0), dq0Var);
                    throw null;
                }
                a20Var = new pd1(i, cg0VarArr);
            } else {
                a20Var = new a20(dq0Var);
            }
        }
        fq0Var.b = a20Var;
        fq0Var.f300a = yp0Var2;
        ab0 ab0Var = this.b;
        gj1 b = ab0Var.b(dq0Var);
        if (b != null) {
            obj = b.h;
        } else {
            HashMap hashMap2 = ab0Var.k;
            gj1 gj1Var = new gj1(dq0Var, fq0Var);
            ab0Var.j++;
            gj1 gj1Var2 = ab0Var.h;
            if (gj1Var2 == null) {
                ab0Var.g = gj1Var;
                ab0Var.h = gj1Var;
            } else {
                gj1Var2.i = gj1Var;
                gj1Var.j = gj1Var2;
                ab0Var.h = gj1Var;
            }
            hashMap2.put(dq0Var, gj1Var);
            obj = null;
        }
        if (((fq0) obj) == null && (eq0Var = (eq0) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            yp0 b2 = b(dq0Var);
            this.e++;
            while (fq0Var.f300a.compareTo(b2) < 0 && this.b.k.containsKey(dq0Var)) {
                yp0 yp0Var3 = fq0Var.f300a;
                ArrayList arrayList = this.h;
                arrayList.add(yp0Var3);
                vp0 vp0Var = xp0.Companion;
                yp0 yp0Var4 = fq0Var.f300a;
                vp0Var.getClass();
                yp0Var4.getClass();
                int ordinal = yp0Var4.ordinal();
                xp0 xp0Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : xp0.ON_RESUME : xp0.ON_START : xp0.ON_CREATE;
                if (xp0Var == null) {
                    jw0.n("no event up from ", fq0Var.f300a);
                    return;
                } else {
                    fq0Var.a(eq0Var, xp0Var);
                    arrayList.remove(arrayList.size() - 1);
                    b2 = b(dq0Var);
                }
            }
            if (!z3) {
                g();
            }
            this.e--;
        }
    }

    public final yp0 b(dq0 dq0Var) {
        HashMap hashMap = this.b.k;
        gj1 gj1Var = hashMap.containsKey(dq0Var) ? ((gj1) hashMap.get(dq0Var)).j : null;
        yp0 yp0Var = gj1Var != null ? ((fq0) gj1Var.h).f300a : null;
        ArrayList arrayList = this.h;
        yp0 yp0Var2 = arrayList.isEmpty() ? null : (yp0) d51.m(arrayList, 1);
        yp0 yp0Var3 = this.c;
        yp0Var3.getClass();
        if (yp0Var == null || yp0Var.compareTo(yp0Var3) >= 0) {
            yp0Var = yp0Var3;
        }
        return (yp0Var2 == null || yp0Var2.compareTo(yp0Var) >= 0) ? yp0Var : yp0Var2;
    }

    public final void c(String str) {
        if (this.f350a) {
            h9.E().j.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(d51.y("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(xp0 xp0Var) {
        xp0Var.getClass();
        c("handleLifecycleEvent");
        e(xp0Var.a());
    }

    public final void e(yp0 yp0Var) {
        if (this.c == yp0Var) {
            return;
        }
        eq0 eq0Var = (eq0) this.d.get();
        yp0 yp0Var2 = this.c;
        yp0Var2.getClass();
        yp0 yp0Var3 = yp0.h;
        yp0 yp0Var4 = yp0.g;
        if (yp0Var2 == yp0Var3 && yp0Var == yp0Var4) {
            throw new IllegalStateException(("State must be at least '" + yp0.i + "' to be moved to '" + yp0Var + "' in component " + eq0Var).toString());
        }
        if (yp0Var2 == yp0Var4 && yp0Var2 != yp0Var) {
            throw new IllegalStateException(("State is '" + yp0Var4 + "' and cannot be moved to `" + yp0Var + "` in component " + eq0Var).toString());
        }
        this.c = yp0Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == yp0Var4) {
            this.b = new ab0();
        }
    }

    public final void f(dq0 dq0Var) {
        dq0Var.getClass();
        c("removeObserver");
        this.b.c(dq0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r11.g = false;
        r0 = r11.c;
        r11 = r11.i;
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = defpackage.i31.f410a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r11.f(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gq0.g():void");
    }
}
