package defpackage;

import Cwd.YSHrxiHkAFcciU;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public class vs0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(vs0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public volatile /* synthetic */ Object _next$volatile = this;
    public volatile /* synthetic */ Object _prev$volatile = this;
    public volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = lj1.f595a;
        j = unsafe.objectFieldOffset(vs0.class.getDeclaredField("_next$volatile"));
        h = AtomicReferenceFieldUpdater.newUpdater(vs0.class, Object.class, "_prev$volatile");
        k = unsafe.objectFieldOffset(vs0.class.getDeclaredField("_prev$volatile"));
        i = AtomicReferenceFieldUpdater.newUpdater(vs0.class, Object.class, "_removedRef$volatile");
        l = unsafe.objectFieldOffset(vs0.class.getDeclaredField("_removedRef$volatile"));
    }

    public static vs0 i(vs0 vs0Var) {
        while (vs0Var.n()) {
            h.getClass();
            vs0Var = (vs0) lj1.f595a.getObjectVolatile(vs0Var, k);
        }
        return vs0Var;
    }

    public final boolean e(vs0 vs0Var, int i2) {
        vs0 m;
        do {
            m = m();
            if (m instanceof or0) {
                return (((or0) m).m & i2) == 0 && m.e(vs0Var, i2);
            }
        } while (!m.f(vs0Var, this));
        return true;
    }

    public final boolean f(vs0 vs0Var, vs0 vs0Var2) {
        h.getClass();
        Unsafe unsafe = lj1.f595a;
        unsafe.putObjectVolatile(vs0Var, k, this);
        g.getClass();
        long j2 = j;
        unsafe.putObjectVolatile(vs0Var, j2, vs0Var2);
        while (true) {
            Unsafe unsafe2 = lj1.f595a;
            vs0 vs0Var3 = this;
            vs0 vs0Var4 = vs0Var;
            vs0 vs0Var5 = vs0Var2;
            if (unsafe2.compareAndSwapObject(vs0Var3, j, vs0Var5, vs0Var4)) {
                vs0Var4.j(vs0Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(vs0Var3, j2) != vs0Var5) {
                return false;
            }
            this = vs0Var3;
            vs0Var2 = vs0Var5;
            vs0Var = vs0Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.x21 r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.vs0.h
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.lj1.f595a
            long r1 = defpackage.vs0.k
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.vs0.g
            r1.getClass()
            long r1 = defpackage.vs0.j
            r0.putObjectVolatile(r10, r1, r9)
        L16:
            java.lang.Object r0 = r9.k()
            if (r0 == r9) goto L1d
            return
        L1d:
            sun.misc.Unsafe r3 = defpackage.lj1.f595a
            long r5 = defpackage.vs0.j
            r7 = r9
            r4 = r9
            r8 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2e
            r8.j(r4)
            return
        L2e:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r4) goto L37
            r9 = r4
            r10 = r8
            goto L16
        L37:
            r9 = r4
            r10 = r8
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs0.g(x21):void");
    }

    public final vs0 h() {
        vs0 vs0Var;
        vs0 vs0Var2;
        Unsafe unsafe;
        loop0: while (true) {
            h.getClass();
            Unsafe unsafe2 = lj1.f595a;
            long j2 = k;
            vs0 vs0Var3 = (vs0) unsafe2.getObjectVolatile(this, j2);
            vs0 vs0Var4 = null;
            vs0Var = vs0Var3;
            while (true) {
                g.getClass();
                if (vs0Var == null) {
                    rw.b();
                    return null;
                }
                Unsafe unsafe3 = lj1.f595a;
                long j3 = j;
                Object objectVolatile = unsafe3.getObjectVolatile(vs0Var, j3);
                if (objectVolatile != this) {
                    vs0 vs0Var5 = vs0Var3;
                    vs0Var2 = this;
                    if (vs0Var2.n()) {
                        return null;
                    }
                    if (!(objectVolatile instanceof sf1)) {
                        objectVolatile.getClass();
                        vs0Var4 = vs0Var;
                        vs0Var = (vs0) objectVolatile;
                    } else if (vs0Var4 != null) {
                        vs0 vs0Var6 = ((sf1) objectVolatile).f933a;
                        do {
                            vs0 vs0Var7 = vs0Var;
                            unsafe = lj1.f595a;
                            boolean compareAndSwapObject = unsafe.compareAndSwapObject(vs0Var4, j, vs0Var7, vs0Var6);
                            vs0Var = vs0Var7;
                            if (compareAndSwapObject) {
                                this = vs0Var2;
                                vs0Var = vs0Var4;
                                vs0Var3 = vs0Var5;
                                vs0Var4 = null;
                            }
                        } while (unsafe.getObjectVolatile(vs0Var4, j3) == vs0Var);
                    } else {
                        if (vs0Var == null) {
                            rw.b();
                            return null;
                        }
                        vs0Var = (vs0) unsafe3.getObjectVolatile(vs0Var, j2);
                    }
                    this = vs0Var2;
                    vs0Var3 = vs0Var5;
                } else {
                    if (vs0Var3 == vs0Var) {
                        break;
                    }
                    while (true) {
                        Unsafe unsafe4 = lj1.f595a;
                        vs0 vs0Var8 = this;
                        boolean compareAndSwapObject2 = unsafe4.compareAndSwapObject(vs0Var8, k, vs0Var3, vs0Var);
                        vs0 vs0Var9 = vs0Var3;
                        vs0Var2 = vs0Var8;
                        if (compareAndSwapObject2) {
                            break loop0;
                        }
                        if (unsafe4.getObjectVolatile(vs0Var2, j2) != vs0Var9) {
                            break;
                        }
                        this = vs0Var2;
                        vs0Var3 = vs0Var9;
                    }
                }
            }
            this = vs0Var2;
        }
        return vs0Var;
    }

    public final void j(vs0 vs0Var) {
        vs0 vs0Var2;
        while (true) {
            h.getClass();
            if (vs0Var == null) {
                rw.b();
                return;
            }
            Unsafe unsafe = lj1.f595a;
            long j2 = k;
            vs0 vs0Var3 = (vs0) unsafe.getObjectVolatile(vs0Var, j2);
            if (this.k() != vs0Var) {
                return;
            }
            while (vs0Var != null) {
                Unsafe unsafe2 = lj1.f595a;
                vs0Var2 = this;
                vs0 vs0Var4 = vs0Var;
                if (unsafe2.compareAndSwapObject(vs0Var4, k, vs0Var3, vs0Var2)) {
                    if (vs0Var2.n()) {
                        vs0Var4.h();
                        return;
                    }
                    return;
                } else {
                    if (vs0Var4 == null) {
                        rw.b();
                        return;
                    }
                    vs0Var = vs0Var4;
                    if (unsafe2.getObjectVolatile(vs0Var4, j2) != vs0Var3) {
                        break;
                    } else {
                        this = vs0Var2;
                    }
                }
            }
            rw.b();
            return;
            this = vs0Var2;
        }
    }

    public final Object k() {
        g.getClass();
        return lj1.f595a.getObjectVolatile(this, j);
    }

    public final vs0 l() {
        Object k2 = k();
        sf1 sf1Var = k2 instanceof sf1 ? (sf1) k2 : null;
        if (sf1Var != null) {
            return sf1Var.f933a;
        }
        k2.getClass();
        return (vs0) k2;
    }

    public final vs0 m() {
        vs0 h2 = h();
        if (h2 != null) {
            return h2;
        }
        h.getClass();
        return i((vs0) lj1.f595a.getObjectVolatile(this, k));
    }

    public boolean n() {
        return k() instanceof sf1;
    }

    public final vs0 o() {
        vs0 vs0Var;
        while (true) {
            Object k2 = this.k();
            if (k2 instanceof sf1) {
                return ((sf1) k2).f933a;
            }
            if (k2 == this) {
                return (vs0) k2;
            }
            k2.getClass();
            vs0 vs0Var2 = (vs0) k2;
            sf1 p = vs0Var2.p();
            while (true) {
                g.getClass();
                Unsafe unsafe = lj1.f595a;
                long j2 = j;
                vs0Var = this;
                if (unsafe.compareAndSwapObject(vs0Var, j2, k2, p)) {
                    vs0Var2.h();
                    return null;
                }
                if (unsafe.getObjectVolatile(vs0Var, j2) != k2) {
                    break;
                }
                this = vs0Var;
            }
            this = vs0Var;
        }
    }

    public final sf1 p() {
        i.getClass();
        Unsafe unsafe = lj1.f595a;
        long j2 = l;
        sf1 sf1Var = (sf1) unsafe.getObjectVolatile(this, j2);
        if (sf1Var != null) {
            return sf1Var;
        }
        sf1 sf1Var2 = new sf1(this);
        unsafe.putObjectVolatile(this, j2, sf1Var2);
        return sf1Var2;
    }

    public String toString() {
        return new us0(this, d10.class, "classSimpleName", YSHrxiHkAFcciU.nLjBWpGNtloFrlW, 1) + '@' + d10.r(this);
    }
}
