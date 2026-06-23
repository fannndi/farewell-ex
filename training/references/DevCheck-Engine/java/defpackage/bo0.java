package defpackage;

import com.google.android.material.behavior.YqV.Gvyagftz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public class bo0 implements rn0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(bo0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = lj1.f595a;
        j = unsafe.objectFieldOffset(bo0.class.getDeclaredField("_state$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(bo0.class, Object.class, "_parentHandle$volatile");
        i = unsafe.objectFieldOffset(bo0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public bo0(boolean z) {
        this._state$volatile = z ? co0.g : co0.f;
    }

    public static yp R(vs0 vs0Var) {
        while (vs0Var.n()) {
            vs0Var = vs0Var.m();
        }
        while (true) {
            vs0Var = vs0Var.l();
            if (!vs0Var.n()) {
                if (vs0Var instanceof yp) {
                    return (yp) vs0Var;
                }
                if (vs0Var instanceof x21) {
                    return null;
                }
            }
        }
    }

    public static String a0(Object obj) {
        if (!(obj instanceof ao0)) {
            return obj instanceof vl0 ? ((vl0) obj).a() ? "Active" : "New" : obj instanceof ot ? "Cancelled" : "Completed";
        }
        ao0 ao0Var = (ao0) obj;
        return ao0Var.f() ? "Cancelling" : ao0.h.get(ao0Var) != 0 ? "Completing" : "Active";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable A(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        bo0 bo0Var = (bo0) obj;
        Object I = bo0Var.I();
        if (I instanceof ao0) {
            cancellationException = ((ao0) I).e();
        } else if (I instanceof ot) {
            cancellationException = ((ot) I).f756a;
        } else {
            if (I instanceof vl0) {
                rw.m("Cannot be cancelling child in this state: ", I);
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new sn0("Parent job is ".concat(a0(I)), cancellationException, bo0Var) : cancellationException2;
    }

    public final Object B(ao0 ao0Var, Object obj) {
        ao0 ao0Var2;
        Throwable th;
        Throwable D;
        bo0 bo0Var;
        ao0 ao0Var3;
        ot otVar = obj instanceof ot ? (ot) obj : null;
        Throwable th2 = otVar != null ? otVar.f756a : null;
        synchronized (ao0Var) {
            try {
                ao0Var.f();
                ArrayList g2 = ao0Var.g(th2);
                D = D(ao0Var, g2);
                if (D != null) {
                    try {
                        if (g2.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g2.size()));
                            int size = g2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj2 = g2.get(i2);
                                i2++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != D && th3 != D && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    bw0.b(D, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        ao0Var2 = ao0Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                ao0Var2 = ao0Var;
                th = th5;
            }
        }
        if (D != null && D != th2) {
            obj = new ot(D, false);
        }
        if (D != null && (w(D) || J(D))) {
            obj.getClass();
            ot.b.compareAndSet((ot) obj, 0, 1);
        }
        T(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        Object wl0Var = obj instanceof vl0 ? new wl0((vl0) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = lj1.f595a;
            long j2 = j;
            bo0Var = this;
            ao0Var3 = ao0Var;
            if (!unsafe.compareAndSwapObject(bo0Var, j2, ao0Var3, wl0Var) && unsafe.getObjectVolatile(bo0Var, j2) == ao0Var3) {
                this = bo0Var;
                ao0Var = ao0Var3;
            }
        }
        bo0Var.z(ao0Var3, obj);
        return obj;
    }

    public final CancellationException C() {
        CancellationException cancellationException;
        Object I = I();
        boolean z = I instanceof ao0;
        String str = Gvyagftz.fRrZdATKTLtRwa;
        if (z) {
            Throwable e = ((ao0) I).e();
            if (e == null) {
                rw.m(str, this);
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = e instanceof CancellationException ? (CancellationException) e : null;
            return cancellationException == null ? new sn0(concat, e, this) : cancellationException;
        }
        if (I instanceof vl0) {
            rw.m(str, this);
            return null;
        }
        if (!(I instanceof ot)) {
            return new sn0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((ot) I).f756a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new sn0(x(), th, this) : cancellationException;
    }

    public final Throwable D(ao0 ao0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (ao0Var.f()) {
                return new sn0(x(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            i3++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof cz1) {
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i2);
                i2++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof cz1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return this instanceof lt;
    }

    public final x21 G(vl0 vl0Var) {
        x21 d = vl0Var.d();
        if (d != null) {
            return d;
        }
        if (vl0Var instanceof l80) {
            return new x21();
        }
        if (vl0Var instanceof vn0) {
            W((vn0) vl0Var);
            return null;
        }
        rw.m("State should have list: ", vl0Var);
        return null;
    }

    public final xp H() {
        h.getClass();
        return (xp) lj1.f595a.getObjectVolatile(this, i);
    }

    public final Object I() {
        g.getClass();
        return lj1.f595a.getObjectVolatile(this, j);
    }

    public boolean J(Throwable th) {
        return false;
    }

    public void K(pt ptVar) {
        throw ptVar;
    }

    public final void L(rn0 rn0Var) {
        int Z;
        y21 y21Var = y21.g;
        if (rn0Var == null) {
            Y(y21Var);
            return;
        }
        bo0 bo0Var = (bo0) rn0Var;
        do {
            Z = bo0Var.Z(bo0Var.I());
            if (Z == 0) {
                break;
            }
        } while (Z != 1);
        xp s = bo0Var.s(this);
        Y(s);
        if (I() instanceof vl0) {
            return;
        }
        s.b();
        Y(y21Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n50 M(boolean r7, defpackage.vn0 r8) {
        /*
            r6 = this;
            r8.m = r6
        L2:
            java.lang.Object r4 = r6.I()
            boolean r0 = r4 instanceof defpackage.l80
            if (r0 == 0) goto L33
            r0 = r4
            l80 r0 = (defpackage.l80) r0
            boolean r1 = r0.g
            if (r1 == 0) goto L2d
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.bo0.g
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.lj1.f595a
            long r2 = defpackage.bo0.j
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L23
            goto L74
        L23:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2a
            goto L75
        L2a:
            r6 = r1
            r8 = r5
            goto L11
        L2d:
            r1 = r6
            r5 = r8
            r1.V(r0)
            goto L75
        L33:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof defpackage.vl0
            y21 r8 = defpackage.y21.g
            r0 = 0
            if (r6 == 0) goto L78
            r6 = r4
            vl0 r6 = (defpackage.vl0) r6
            x21 r2 = r6.d()
            if (r2 != 0) goto L4b
            vn0 r4 = (defpackage.vn0) r4
            r1.W(r4)
            goto L75
        L4b:
            boolean r3 = r5.r()
            if (r3 == 0) goto L6d
            boolean r3 = r6 instanceof defpackage.ao0
            if (r3 == 0) goto L58
            ao0 r6 = (defpackage.ao0) r6
            goto L59
        L58:
            r6 = r0
        L59:
            if (r6 == 0) goto L5f
            java.lang.Throwable r0 = r6.e()
        L5f:
            if (r0 != 0) goto L67
            r6 = 5
            boolean r6 = r2.e(r5, r6)
            goto L72
        L67:
            if (r7 == 0) goto L8d
            r5.s(r0)
            return r8
        L6d:
            r6 = 1
            boolean r6 = r2.e(r5, r6)
        L72:
            if (r6 == 0) goto L75
        L74:
            return r5
        L75:
            r6 = r1
            r8 = r5
            goto L2
        L78:
            if (r7 == 0) goto L8d
            java.lang.Object r6 = r1.I()
            boolean r7 = r6 instanceof defpackage.ot
            if (r7 == 0) goto L85
            ot r6 = (defpackage.ot) r6
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8a
            java.lang.Throwable r0 = r6.f756a
        L8a:
            r5.s(r0)
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo0.M(boolean, vn0):n50");
    }

    public final boolean N() {
        Object I = I();
        if (I instanceof ot) {
            return true;
        }
        return (I instanceof ao0) && ((ao0) I).f();
    }

    public boolean O() {
        return this instanceof mk;
    }

    public final Object P(Object obj) {
        Object d0;
        do {
            d0 = d0(I(), obj);
            if (d0 == co0.f132a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                ot otVar = obj instanceof ot ? (ot) obj : null;
                throw new IllegalStateException(str, otVar != null ? otVar.f756a : null);
            }
        } while (d0 == co0.c);
        return d0;
    }

    public String Q() {
        return getClass().getSimpleName();
    }

    public final void S(x21 x21Var, Throwable th) {
        x21Var.e(new or0(4), 4);
        Object k = x21Var.k();
        k.getClass();
        pt ptVar = null;
        for (vs0 vs0Var = (vs0) k; !vs0Var.equals(x21Var); vs0Var = vs0Var.l()) {
            if ((vs0Var instanceof vn0) && ((vn0) vs0Var).r()) {
                try {
                    ((vn0) vs0Var).s(th);
                } catch (Throwable th2) {
                    if (ptVar != null) {
                        bw0.b(ptVar, th2);
                    } else {
                        ptVar = new pt("Exception in completion handler " + vs0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (ptVar != null) {
            K(ptVar);
        }
        w(th);
    }

    public void T(Object obj) {
    }

    public void U() {
    }

    public final void V(l80 l80Var) {
        x21 x21Var = new x21();
        Object ul0Var = l80Var.g ? x21Var : new ul0(x21Var);
        while (true) {
            g.getClass();
            Unsafe unsafe = lj1.f595a;
            long j2 = j;
            bo0 bo0Var = this;
            l80 l80Var2 = l80Var;
            if (unsafe.compareAndSwapObject(bo0Var, j2, l80Var2, ul0Var) || unsafe.getObjectVolatile(bo0Var, j2) != l80Var2) {
                return;
            }
            this = bo0Var;
            l80Var = l80Var2;
        }
    }

    public final void W(vn0 vn0Var) {
        vn0Var.g(new x21());
        vs0 l = vn0Var.l();
        while (true) {
            g.getClass();
            Unsafe unsafe = lj1.f595a;
            long j2 = j;
            bo0 bo0Var = this;
            vn0 vn0Var2 = vn0Var;
            if (unsafe.compareAndSwapObject(bo0Var, j2, vn0Var2, l) || unsafe.getObjectVolatile(bo0Var, j2) != vn0Var2) {
                return;
            }
            this = bo0Var;
            vn0Var = vn0Var2;
        }
    }

    public final void X(vn0 vn0Var) {
        bo0 bo0Var;
        while (true) {
            Object I = this.I();
            if (!(I instanceof vn0)) {
                if (!(I instanceof vl0) || ((vl0) I).d() == null) {
                    return;
                }
                vn0Var.o();
                return;
            }
            if (I != vn0Var) {
                return;
            }
            while (true) {
                g.getClass();
                Unsafe unsafe = lj1.f595a;
                long j2 = j;
                bo0Var = this;
                if (unsafe.compareAndSwapObject(bo0Var, j2, I, co0.g)) {
                    return;
                }
                if (unsafe.getObjectVolatile(bo0Var, j2) != I) {
                    break;
                } else {
                    this = bo0Var;
                }
            }
            this = bo0Var;
        }
    }

    public final void Y(xp xpVar) {
        h.getClass();
        lj1.f595a.putObjectVolatile(this, i, xpVar);
    }

    public final int Z(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof l80;
        long j2 = j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        if (!z) {
            bo0 bo0Var = this;
            Object obj2 = obj;
            if (!(obj2 instanceof ul0)) {
                return 0;
            }
            x21 x21Var = ((ul0) obj2).g;
            do {
                atomicReferenceFieldUpdater.getClass();
                bo0 bo0Var2 = bo0Var;
                unsafe = lj1.f595a;
                Object obj3 = obj2;
                boolean compareAndSwapObject = unsafe.compareAndSwapObject(bo0Var2, j, obj3, x21Var);
                bo0Var = bo0Var2;
                obj2 = obj3;
                if (compareAndSwapObject) {
                    bo0Var.U();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(bo0Var, j2) == obj2);
            return -1;
        }
        if (((l80) obj).g) {
            return 0;
        }
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe2 = lj1.f595a;
            bo0 bo0Var3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(bo0Var3, j, obj4, co0.g)) {
                bo0Var3.U();
                return 1;
            }
            if (unsafe2.getObjectVolatile(bo0Var3, j2) != obj4) {
                return -1;
            }
            this = bo0Var3;
            obj = obj4;
        }
    }

    @Override // defpackage.rn0
    public boolean a() {
        Object I = I();
        return (I instanceof vl0) && ((vl0) I).a();
    }

    public final boolean b0(vl0 vl0Var, Object obj) {
        Object wl0Var = obj instanceof vl0 ? new wl0((vl0) obj) : obj;
        while (true) {
            g.getClass();
            Unsafe unsafe = lj1.f595a;
            long j2 = j;
            bo0 bo0Var = this;
            vl0 vl0Var2 = vl0Var;
            if (unsafe.compareAndSwapObject(bo0Var, j2, vl0Var2, wl0Var)) {
                bo0Var.T(obj);
                bo0Var.z(vl0Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(bo0Var, j2) != vl0Var2) {
                return false;
            }
            this = bo0Var;
            vl0Var = vl0Var2;
        }
    }

    public final boolean c0(vl0 vl0Var, Throwable th) {
        x21 G = G(vl0Var);
        if (G == null) {
            return false;
        }
        ao0 ao0Var = new ao0(G, th);
        while (true) {
            g.getClass();
            Unsafe unsafe = lj1.f595a;
            long j2 = j;
            bo0 bo0Var = this;
            vl0 vl0Var2 = vl0Var;
            if (unsafe.compareAndSwapObject(bo0Var, j2, vl0Var2, ao0Var)) {
                bo0Var.S(G, th);
                return true;
            }
            if (unsafe.getObjectVolatile(bo0Var, j2) != vl0Var2) {
                return false;
            }
            this = bo0Var;
            vl0Var = vl0Var2;
        }
    }

    public final Object d0(Object obj, Object obj2) {
        if (!(obj instanceof vl0)) {
            return co0.f132a;
        }
        if (((obj instanceof l80) || (obj instanceof vn0)) && !(obj instanceof yp) && !(obj2 instanceof ot)) {
            return b0((vl0) obj, obj2) ? obj2 : co0.c;
        }
        vl0 vl0Var = (vl0) obj;
        x21 G = G(vl0Var);
        if (G == null) {
            return co0.c;
        }
        ao0 ao0Var = vl0Var instanceof ao0 ? (ao0) vl0Var : null;
        if (ao0Var == null) {
            ao0Var = new ao0(G, null);
        }
        synchronized (ao0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ao0.h;
            if (atomicIntegerFieldUpdater.get(ao0Var) != 0) {
                return co0.f132a;
            }
            atomicIntegerFieldUpdater.set(ao0Var, 1);
            if (ao0Var != vl0Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, vl0Var, ao0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != vl0Var) {
                        return co0.c;
                    }
                }
            }
            boolean f = ao0Var.f();
            ot otVar = obj2 instanceof ot ? (ot) obj2 : null;
            if (otVar != null) {
                ao0Var.b(otVar.f756a);
            }
            Throwable e = f ? null : ao0Var.e();
            if (e != null) {
                S(G, e);
            }
            yp R = R(G);
            if (R != null && e0(ao0Var, R, obj2)) {
                return co0.b;
            }
            G.e(new or0(2), 2);
            yp R2 = R(G);
            return (R2 == null || !e0(ao0Var, R2, obj2)) ? B(ao0Var, obj2) : co0.b;
        }
    }

    @Override // defpackage.rn0
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new sn0(x(), null, this);
        }
        u(cancellationException);
    }

    public final boolean e0(ao0 ao0Var, yp ypVar, Object obj) {
        while (je2.F(ypVar.n, false, new zn0(this, ao0Var, ypVar, obj)) == y21.g) {
            ypVar = R(ypVar);
            if (ypVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ox
    public final px getKey() {
        return pg0.k;
    }

    @Override // defpackage.qx
    public final Object m(Object obj, pf0 pf0Var) {
        return pf0Var.f(obj, this);
    }

    @Override // defpackage.qx
    public final qx o(qx qxVar) {
        return bw0.w(this, qxVar);
    }

    public void p(Object obj) {
    }

    public void q(Object obj) {
        p(obj);
    }

    @Override // defpackage.qx
    public final ox r(px pxVar) {
        return bw0.h(this, pxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007a, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xp s(defpackage.bo0 r7) {
        /*
            r6 = this;
            yp r5 = new yp
            r5.<init>(r7)
            r5.m = r6
        L7:
            java.lang.Object r4 = r6.I()
            boolean r7 = r4 instanceof defpackage.l80
            if (r7 == 0) goto L35
            r7 = r4
            l80 r7 = (defpackage.l80) r7
            boolean r0 = r7.g
            if (r0 == 0) goto L30
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.bo0.g
            r7.getClass()
            sun.misc.Unsafe r0 = defpackage.lj1.f595a
            long r2 = defpackage.bo0.j
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L27
            goto L7a
        L27:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2e
            goto L4b
        L2e:
            r6 = r1
            goto L16
        L30:
            r1 = r6
            r1.V(r7)
            goto L4b
        L35:
            r1 = r6
            boolean r6 = r4 instanceof defpackage.vl0
            y21 r7 = defpackage.y21.g
            r0 = 0
            if (r6 == 0) goto L7c
            r6 = r4
            vl0 r6 = (defpackage.vl0) r6
            x21 r6 = r6.d()
            if (r6 != 0) goto L4d
            vn0 r4 = (defpackage.vn0) r4
            r1.W(r4)
        L4b:
            r6 = r1
            goto L7
        L4d:
            r2 = 7
            boolean r2 = r6.e(r5, r2)
            if (r2 == 0) goto L55
            goto L7a
        L55:
            r2 = 3
            boolean r6 = r6.e(r5, r2)
            java.lang.Object r1 = r1.I()
            boolean r2 = r1 instanceof defpackage.ao0
            if (r2 == 0) goto L69
            ao0 r1 = (defpackage.ao0) r1
            java.lang.Throwable r0 = r1.e()
            goto L75
        L69:
            boolean r2 = r1 instanceof defpackage.ot
            if (r2 == 0) goto L70
            ot r1 = (defpackage.ot) r1
            goto L71
        L70:
            r1 = r0
        L71:
            if (r1 == 0) goto L75
            java.lang.Throwable r0 = r1.f756a
        L75:
            r5.s(r0)
            if (r6 == 0) goto L7b
        L7a:
            return r5
        L7b:
            return r7
        L7c:
            java.lang.Object r6 = r1.I()
            boolean r1 = r6 instanceof defpackage.ot
            if (r1 == 0) goto L87
            ot r6 = (defpackage.ot) r6
            goto L88
        L87:
            r6 = r0
        L88:
            if (r6 == 0) goto L8c
            java.lang.Throwable r0 = r6.f756a
        L8c:
            r5.s(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo0.s(bo0):xp");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == defpackage.co0.b) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0059, code lost:
    
        r0 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo0.t(java.lang.Object):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Q() + '{' + a0(I()) + '}');
        sb.append('@');
        sb.append(d10.r(this));
        return sb.toString();
    }

    public void u(CancellationException cancellationException) {
        t(cancellationException);
    }

    @Override // defpackage.qx
    public final qx v(px pxVar) {
        return bw0.t(this, pxVar);
    }

    public final boolean w(Throwable th) {
        if (O()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        xp H = H();
        return (H == null || H == y21.g) ? z : H.c(th) || z;
    }

    public String x() {
        return "Job was cancelled";
    }

    public boolean y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return t(th) && E();
    }

    public final void z(vl0 vl0Var, Object obj) {
        xp H = H();
        if (H != null) {
            H.b();
            Y(y21.g);
        }
        pt ptVar = null;
        ot otVar = obj instanceof ot ? (ot) obj : null;
        Throwable th = otVar != null ? otVar.f756a : null;
        if (vl0Var instanceof vn0) {
            try {
                ((vn0) vl0Var).s(th);
                return;
            } catch (Throwable th2) {
                K(new pt("Exception in completion handler " + vl0Var + " for " + this, th2));
                return;
            }
        }
        x21 d = vl0Var.d();
        if (d != null) {
            d.e(new or0(1), 1);
            Object k = d.k();
            k.getClass();
            for (vs0 vs0Var = (vs0) k; !vs0Var.equals(d); vs0Var = vs0Var.l()) {
                if (vs0Var instanceof vn0) {
                    try {
                        ((vn0) vs0Var).s(th);
                    } catch (Throwable th3) {
                        if (ptVar != null) {
                            bw0.b(ptVar, th3);
                        } else {
                            ptVar = new pt("Exception in completion handler " + vs0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (ptVar != null) {
                K(ptVar);
            }
        }
    }
}
