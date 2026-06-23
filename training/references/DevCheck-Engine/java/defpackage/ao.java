package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.apache.commons.logging.impl.SimpleLog;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public class ao extends c50 implements f92, ay, yn {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(ao.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(ao.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ long o;
    public static final /* synthetic */ long p;
    public volatile /* synthetic */ int _decisionAndIndex$volatile;
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;
    public final dx j;
    public final qx k;

    static {
        Unsafe unsafe = lj1.f595a;
        p = unsafe.objectFieldOffset(ao.class.getDeclaredField("_state$volatile"));
        n = AtomicReferenceFieldUpdater.newUpdater(ao.class, Object.class, "_parentHandle$volatile");
        o = unsafe.objectFieldOffset(ao.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ao(int i, dx dxVar) {
        super(i);
        this.j = dxVar;
        this.k = dxVar.d();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = k2.f506a;
    }

    public static void C(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object I(b31 b31Var, Object obj, int i, qf0 qf0Var) {
        if (obj instanceof ot) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (qf0Var != null || (b31Var instanceof vn)) {
            return new mt(obj, b31Var instanceof vn ? (vn) b31Var : null, qf0Var, (CancellationException) null, 16);
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
    
        C(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(defpackage.b31 r11) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao.A(b31):void");
    }

    public final boolean B() {
        return this.i == 2 && ((z40) this.j).q();
    }

    public String D() {
        return "CancellableContinuation";
    }

    public final void E() {
        Throwable s;
        dx dxVar = this.j;
        z40 z40Var = dxVar instanceof z40 ? (z40) dxVar : null;
        if (z40Var == null || (s = z40Var.s(this)) == null) {
            return;
        }
        r();
        q(s);
    }

    public final boolean F() {
        m.getClass();
        Unsafe unsafe = lj1.f595a;
        long j = p;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof mt) && ((mt) objectVolatile).d != null) {
            r();
            return false;
        }
        l.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, k2.f506a);
        return true;
    }

    public final void G(Object obj, int i, qf0 qf0Var) {
        ao aoVar;
        while (true) {
            m.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = p;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof b31)) {
                ao aoVar2 = this;
                if (objectVolatile instanceof go) {
                    go goVar = (go) objectVolatile;
                    if (go.c.compareAndSet(goVar, 0, 1)) {
                        if (qf0Var != null) {
                            aoVar2.o(qf0Var, goVar.f756a, obj);
                            return;
                        }
                        return;
                    }
                }
                rw.m("Already resumed, but proposed with update ", obj);
                return;
            }
            Object I = I((b31) objectVolatile, obj, i, qf0Var);
            while (true) {
                Unsafe unsafe2 = lj1.f595a;
                aoVar = this;
                if (unsafe2.compareAndSwapObject(aoVar, p, objectVolatile, I)) {
                    if (!aoVar.B()) {
                        aoVar.r();
                    }
                    aoVar.s(i);
                    return;
                } else if (unsafe2.getObjectVolatile(aoVar, j) != objectVolatile) {
                    break;
                } else {
                    this = aoVar;
                }
            }
            this = aoVar;
        }
    }

    public final void H(sx sxVar) {
        dx dxVar = this.j;
        z40 z40Var = dxVar instanceof z40 ? (z40) dxVar : null;
        G(e42.f219a, (z40Var != null ? z40Var.j : null) == sxVar ? 4 : this.i, null);
    }

    public final o1 J(Object obj, qf0 qf0Var) {
        ao aoVar;
        while (true) {
            m.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = p;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof b31)) {
                return null;
            }
            Object I = I((b31) objectVolatile, obj, this.i, qf0Var);
            while (true) {
                Unsafe unsafe2 = lj1.f595a;
                aoVar = this;
                if (unsafe2.compareAndSwapObject(aoVar, p, objectVolatile, I)) {
                    boolean B = aoVar.B();
                    o1 o1Var = bo.f93a;
                    if (!B) {
                        aoVar.r();
                    }
                    return o1Var;
                }
                if (unsafe2.getObjectVolatile(aoVar, j) != objectVolatile) {
                    break;
                }
                this = aoVar;
            }
            this = aoVar;
        }
    }

    @Override // defpackage.f92
    public final void a(nl1 nl1Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = l;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                c.n("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A(nl1Var);
    }

    @Override // defpackage.c50
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        ao aoVar;
        while (true) {
            m.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = p;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof b31) {
                c.n("Not completed");
                return;
            }
            if (objectVolatile instanceof ot) {
                return;
            }
            if (objectVolatile instanceof mt) {
                mt mtVar = (mt) objectVolatile;
                if (mtVar.e != null) {
                    c.n("Must be called at most once");
                    return;
                }
                mt a2 = mt.a(mtVar, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = lj1.f595a;
                    ao aoVar2 = this;
                    if (unsafe2.compareAndSwapObject(aoVar2, p, objectVolatile, a2)) {
                        vn vnVar = mtVar.b;
                        if (vnVar != null) {
                            aoVar2.m(vnVar, cancellationException);
                        }
                        qf0 qf0Var = mtVar.c;
                        if (qf0Var != null) {
                            aoVar2.o(qf0Var, cancellationException, mtVar.f653a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(aoVar2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        aoVar = aoVar2;
                        break;
                    }
                    this = aoVar2;
                }
            } else {
                ao aoVar3 = this;
                CancellationException cancellationException3 = cancellationException;
                mt mtVar2 = new mt(objectVolatile, (vn) null, (qf0) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    mt mtVar3 = mtVar2;
                    Unsafe unsafe3 = lj1.f595a;
                    aoVar = aoVar3;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(aoVar, p, objectVolatile, mtVar3);
                    mtVar2 = mtVar3;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(aoVar, j) != objectVolatile) {
                        break;
                    } else {
                        aoVar3 = aoVar;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = aoVar;
        }
    }

    @Override // defpackage.ay
    public final ay c() {
        dx dxVar = this.j;
        if (dxVar instanceof ay) {
            return (ay) dxVar;
        }
        return null;
    }

    @Override // defpackage.dx
    public final qx d() {
        return this.k;
    }

    @Override // defpackage.c50
    public final dx e() {
        return this.j;
    }

    @Override // defpackage.c50
    public final Throwable f(Object obj) {
        Throwable f = super.f(obj);
        if (f != null) {
            return f;
        }
        return null;
    }

    @Override // defpackage.dx
    public final void g(Object obj) {
        Throwable a2 = qg1.a(obj);
        if (a2 != null) {
            obj = new ot(a2, false);
        }
        G(obj, this.i, null);
    }

    @Override // defpackage.yn
    public final void h(Object obj, qf0 qf0Var) {
        G(obj, this.i, qf0Var);
    }

    @Override // defpackage.yn
    public final o1 i(Object obj, qf0 qf0Var) {
        return J(obj, qf0Var);
    }

    @Override // defpackage.c50
    public final Object j(Object obj) {
        return obj instanceof mt ? ((mt) obj).f653a : obj;
    }

    @Override // defpackage.c50
    public final Object l() {
        return w();
    }

    public final void m(vn vnVar, Throwable th) {
        try {
            switch (vnVar.f1093a) {
                case 0:
                    ((ScheduledFuture) vnVar.b).cancel(false);
                    break;
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    ((lf0) vnVar.b).j(th);
                    break;
                default:
                    ((n50) vnVar.b).b();
                    break;
            }
        } catch (Throwable th2) {
            op0.y(this.k, new pt("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.yn
    public final void n(Object obj) {
        s(this.i);
    }

    public final void o(qf0 qf0Var, Throwable th, Object obj) {
        qx qxVar = this.k;
        try {
            qf0Var.e(th, obj, qxVar);
        } catch (Throwable th2) {
            op0.y(qxVar, new pt("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void p(nl1 nl1Var, Throwable th) {
        qx qxVar = this.k;
        int i = l.get(this) & 536870911;
        if (i == 536870911) {
            c.n("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            nl1Var.l(i, qxVar);
        } catch (Throwable th2) {
            op0.y(qxVar, new pt("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean q(Throwable th) {
        ao aoVar;
        while (true) {
            m.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = p;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof b31)) {
                return false;
            }
            go goVar = new go(this, th, (objectVolatile instanceof vn) || (objectVolatile instanceof nl1));
            while (true) {
                Unsafe unsafe2 = lj1.f595a;
                aoVar = this;
                if (unsafe2.compareAndSwapObject(aoVar, p, objectVolatile, goVar)) {
                    b31 b31Var = (b31) objectVolatile;
                    if (b31Var instanceof vn) {
                        aoVar.m((vn) objectVolatile, th);
                    } else if (b31Var instanceof nl1) {
                        aoVar.p((nl1) objectVolatile, th);
                    }
                    if (!aoVar.B()) {
                        aoVar.r();
                    }
                    aoVar.s(aoVar.i);
                    return true;
                }
                if (unsafe2.getObjectVolatile(aoVar, j) != objectVolatile) {
                    break;
                }
                this = aoVar;
            }
            this = aoVar;
        }
    }

    public final void r() {
        n50 u = u();
        if (u == null) {
            return;
        }
        u.b();
        n.getClass();
        lj1.f595a.putObjectVolatile(this, o, y21.g);
    }

    public final void s(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = l;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    c.n("Already resumed");
                    return;
                }
                boolean z = i == 4;
                dx dxVar = this.j;
                if (!z && (dxVar instanceof z40)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.i;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        z40 z40Var = (z40) dxVar;
                        sx sxVar = z40Var.j;
                        qx d = z40Var.k.d();
                        if (sxVar.F(d)) {
                            sxVar.D(d, this);
                            return;
                        }
                        n90 a2 = uy1.a();
                        if (a2.i >= 4294967296L) {
                            a2.I(this);
                            return;
                        }
                        a2.J(true);
                        try {
                            op0.I(this, dxVar, true);
                            do {
                            } while (a2.L());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                op0.I(this, dxVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable t(bo0 bo0Var) {
        return bo0Var.C();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(D());
        sb.append('(');
        sb.append(d10.N(this.j));
        sb.append("){");
        Object w = w();
        sb.append(w instanceof b31 ? "Active" : w instanceof go ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(d10.r(this));
        return sb.toString();
    }

    public final n50 u() {
        n.getClass();
        return (n50) lj1.f595a.getObjectVolatile(this, o);
    }

    public final Object v() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        rn0 rn0Var;
        boolean B = B();
        do {
            atomicIntegerFieldUpdater = l;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    c.n("Already suspended");
                    return null;
                }
                if (B) {
                    E();
                }
                Object w = w();
                if (w instanceof ot) {
                    throw ((ot) w).f756a;
                }
                int i3 = this.i;
                if ((i3 != 1 && i3 != 2) || (rn0Var = (rn0) this.k.r(pg0.k)) == null || rn0Var.a()) {
                    return j(w);
                }
                CancellationException C = ((bo0) rn0Var).C();
                b(C);
                throw C;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (u() == null) {
            y();
        }
        if (B) {
            E();
        }
        return zx.g;
    }

    public final Object w() {
        m.getClass();
        return lj1.f595a.getObjectVolatile(this, p);
    }

    public final void x() {
        n50 y = y();
        if (y == null || (w() instanceof b31)) {
            return;
        }
        y.b();
        n.getClass();
        lj1.f595a.putObjectVolatile(this, o, y21.g);
    }

    public final n50 y() {
        rn0 rn0Var = (rn0) this.k.r(pg0.k);
        if (rn0Var == null) {
            return null;
        }
        n50 F = je2.F(rn0Var, true, new wp(this));
        while (true) {
            n.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = o;
            ao aoVar = this;
            if (!unsafe.compareAndSwapObject(aoVar, j, (Object) null, F) && unsafe.getObjectVolatile(aoVar, j) == null) {
                this = aoVar;
            }
        }
        return F;
    }

    public final void z(lf0 lf0Var) {
        A(new vn(1, lf0Var));
    }
}
