package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class s90 extends n90 implements q20 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(s90.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ AtomicIntegerFieldUpdater o;
    public static final /* synthetic */ long p;
    public static final /* synthetic */ long q;
    public volatile /* synthetic */ Object _delayed$volatile;
    public volatile /* synthetic */ int _isCompleted$volatile = 0;
    public volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = lj1.f595a;
        q = unsafe.objectFieldOffset(s90.class.getDeclaredField("_queue$volatile"));
        n = AtomicReferenceFieldUpdater.newUpdater(s90.class, Object.class, "_delayed$volatile");
        p = unsafe.objectFieldOffset(s90.class.getDeclaredField("_delayed$volatile"));
        o = AtomicIntegerFieldUpdater.newUpdater(s90.class, "_isCompleted$volatile");
    }

    @Override // defpackage.sx
    public final void D(qx qxVar, Runnable runnable) {
        O(runnable);
    }

    @Override // defpackage.n90
    public final long K() {
        if (L()) {
            return 0L;
        }
        P();
        Runnable N = N();
        if (N == null) {
            return R();
        }
        N.run();
        return 0L;
    }

    public final void M() {
        s90 s90Var;
        Unsafe unsafe;
        while (true) {
            m.getClass();
            Unsafe unsafe2 = lj1.f595a;
            long j = q;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            o1 o1Var = t90.b;
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = lj1.f595a;
                    s90 s90Var2 = this;
                    s90Var = s90Var2;
                    if (unsafe3.compareAndSwapObject(s90Var2, q, (Object) null, o1Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(s90Var, j) != null) {
                        break;
                    } else {
                        this = s90Var;
                    }
                }
            } else {
                s90Var = this;
                if (objectVolatile instanceof ys0) {
                    ((ys0) objectVolatile).c();
                    return;
                }
                if (objectVolatile == o1Var) {
                    return;
                }
                ys0 ys0Var = new ys0(8, true);
                ys0Var.a((Runnable) objectVolatile);
                do {
                    unsafe = lj1.f595a;
                    if (unsafe.compareAndSwapObject(s90Var, q, objectVolatile, ys0Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(s90Var, j) == objectVolatile);
            }
            this = s90Var;
        }
    }

    public final Runnable N() {
        s90 s90Var;
        Unsafe unsafe;
        while (true) {
            m.getClass();
            Unsafe unsafe2 = lj1.f595a;
            long j = q;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof ys0) {
                ys0 ys0Var = (ys0) objectVolatile;
                Object e = ys0Var.e();
                if (e != ys0.g) {
                    return (Runnable) e;
                }
                ys0 d = ys0Var.d();
                while (true) {
                    Unsafe unsafe3 = lj1.f595a;
                    s90Var = this;
                    if (!unsafe3.compareAndSwapObject(s90Var, q, objectVolatile, d) && unsafe3.getObjectVolatile(s90Var, j) == objectVolatile) {
                        this = s90Var;
                    }
                }
            } else {
                s90Var = this;
                if (objectVolatile == t90.b) {
                    return null;
                }
                do {
                    unsafe = lj1.f595a;
                    if (unsafe.compareAndSwapObject(s90Var, q, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(s90Var, j) == objectVolatile);
            }
            this = s90Var;
        }
    }

    public void O(Runnable runnable) {
        P();
        if (!Q(runnable)) {
            n10.r.O(runnable);
            return;
        }
        Thread S = S();
        if (Thread.currentThread() != S) {
            LockSupport.unpark(S);
        }
    }

    public final void P() {
        q90 q90Var;
        n.getClass();
        r90 r90Var = (r90) lj1.f595a.getObjectVolatile(this, p);
        if (r90Var == null || wy1.b.get(r90Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (r90Var) {
                try {
                    q90[] q90VarArr = r90Var.f1152a;
                    q90 q90Var2 = q90VarArr != null ? q90VarArr[0] : null;
                    if (q90Var2 != null) {
                        q90Var = ((nanoTime - q90Var2.g) > 0L ? 1 : ((nanoTime - q90Var2.g) == 0L ? 0 : -1)) >= 0 ? Q(q90Var2) : false ? r90Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (q90Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q(java.lang.Runnable r15) {
        /*
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.s90.m
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.lj1.f595a
            long r1 = defpackage.s90.q
            java.lang.Object r7 = r0.getObjectVolatile(r14, r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.s90.o
            int r0 = r0.get(r14)
            r3 = 0
            if (r0 == 0) goto L17
            return r3
        L17:
            r0 = 1
            if (r7 != 0) goto L33
        L1a:
            sun.misc.Unsafe r8 = defpackage.lj1.f595a
            long r10 = defpackage.s90.q
            r12 = 0
            r9 = r14
            r13 = r15
            boolean r14 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r4 = r9
            if (r14 == 0) goto L29
            goto L7d
        L29:
            java.lang.Object r14 = r8.getObjectVolatile(r4, r1)
            if (r14 == 0) goto L30
            goto L84
        L30:
            r14 = r4
            r15 = r13
            goto L1a
        L33:
            r4 = r14
            r13 = r15
            boolean r14 = r7 instanceof defpackage.ys0
            if (r14 == 0) goto L5e
            r14 = r7
            ys0 r14 = (defpackage.ys0) r14
            int r15 = r14.a(r13)
            if (r15 == 0) goto L7d
            if (r15 == r0) goto L48
            r14 = 2
            if (r15 == r14) goto L62
            goto L84
        L48:
            ys0 r8 = r14.d()
        L4c:
            sun.misc.Unsafe r3 = defpackage.lj1.f595a
            long r5 = defpackage.s90.q
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L57
            goto L84
        L57:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 == r7) goto L4c
            goto L84
        L5e:
            o1 r14 = defpackage.t90.b
            if (r7 != r14) goto L63
        L62:
            return r3
        L63:
            ys0 r8 = new ys0
            r14 = 8
            r8.<init>(r14, r0)
            r14 = r7
            java.lang.Runnable r14 = (java.lang.Runnable) r14
            r8.a(r14)
            r8.a(r13)
        L73:
            sun.misc.Unsafe r3 = defpackage.lj1.f595a
            long r5 = defpackage.s90.q
            boolean r14 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r14 == 0) goto L7e
        L7d:
            return r0
        L7e:
            java.lang.Object r14 = r3.getObjectVolatile(r4, r1)
            if (r14 == r7) goto L73
        L84:
            r14 = r4
            r15 = r13
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s90.Q(java.lang.Runnable):boolean");
    }

    public final long R() {
        q90 q90Var;
        j9 j9Var = this.k;
        if (((j9Var == null || j9Var.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            m.getClass();
            Unsafe unsafe = lj1.f595a;
            Object objectVolatile = unsafe.getObjectVolatile(this, q);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ys0) {
                    long j = ys0.f.get((ys0) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == t90.b) {
                    return Long.MAX_VALUE;
                }
            }
            n.getClass();
            r90 r90Var = (r90) unsafe.getObjectVolatile(this, p);
            if (r90Var != null) {
                synchronized (r90Var) {
                    q90[] q90VarArr = r90Var.f1152a;
                    q90Var = q90VarArr != null ? q90VarArr[0] : null;
                }
                if (q90Var != null) {
                    long nanoTime = q90Var.g - System.nanoTime();
                    if (nanoTime >= 0) {
                        return nanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread S();

    public final boolean T() {
        j9 j9Var = this.k;
        if (j9Var != null ? j9Var.isEmpty() : true) {
            n.getClass();
            Unsafe unsafe = lj1.f595a;
            r90 r90Var = (r90) unsafe.getObjectVolatile(this, p);
            if (r90Var != null && wy1.b.get(r90Var) != 0) {
                return false;
            }
            m.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, q);
            if (objectVolatile != null) {
                if (objectVolatile instanceof ys0) {
                    long j = ys0.f.get((ys0) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == t90.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void U(long j, q90 q90Var) {
        n10.r.X(j, q90Var);
    }

    public final void V() {
        q90 b;
        long nanoTime = System.nanoTime();
        while (true) {
            n.getClass();
            r90 r90Var = (r90) lj1.f595a.getObjectVolatile(this, p);
            if (r90Var == null) {
                return;
            }
            synchronized (r90Var) {
                b = wy1.b.get(r90Var) > 0 ? r90Var.b(0) : null;
            }
            if (b == null) {
                return;
            } else {
                U(nanoTime, b);
            }
        }
    }

    public final void W() {
        m.getClass();
        Unsafe unsafe = lj1.f595a;
        unsafe.putObjectVolatile(this, q, (Object) null);
        n.getClass();
        unsafe.putObjectVolatile(this, p, (Object) null);
    }

    public final void X(long j, q90 q90Var) {
        Thread S;
        int Y = Y(j, q90Var);
        if (Y == 0) {
            if (!Z(q90Var) || Thread.currentThread() == (S = S())) {
                return;
            }
            LockSupport.unpark(S);
            return;
        }
        if (Y == 1) {
            U(j, q90Var);
        } else {
            if (Y == 2) {
                return;
            }
            c.n("unexpected result");
        }
    }

    public final int Y(long j, q90 q90Var) {
        s90 s90Var;
        Unsafe unsafe;
        if (o.get(this) != 0) {
            return 1;
        }
        n.getClass();
        Unsafe unsafe2 = lj1.f595a;
        long j2 = p;
        r90 r90Var = (r90) unsafe2.getObjectVolatile(this, j2);
        if (r90Var == null) {
            r90 r90Var2 = new r90();
            r90Var2.c = j;
            while (true) {
                unsafe = lj1.f595a;
                s90Var = this;
                if (!unsafe.compareAndSwapObject(s90Var, p, (Object) null, r90Var2) && unsafe.getObjectVolatile(s90Var, j2) == null) {
                    this = s90Var;
                }
            }
            Object objectVolatile = unsafe.getObjectVolatile(s90Var, j2);
            objectVolatile.getClass();
            r90Var = (r90) objectVolatile;
        } else {
            s90Var = this;
        }
        return q90Var.a(j, r90Var, s90Var);
    }

    public final boolean Z(q90 q90Var) {
        n.getClass();
        r90 r90Var = (r90) lj1.f595a.getObjectVolatile(this, p);
        if (r90Var != null) {
            synchronized (r90Var) {
                q90[] q90VarArr = r90Var.f1152a;
                r0 = q90VarArr != null ? q90VarArr[0] : null;
            }
        }
        return r0 == q90Var;
    }

    public n50 j(long j, dz1 dz1Var, qx qxVar) {
        return o10.f712a.j(j, dz1Var, qxVar);
    }

    @Override // defpackage.q20
    public final void l(long j, ao aoVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            o90 o90Var = new o90(this, j2 + nanoTime, aoVar);
            X(nanoTime, o90Var);
            aoVar.A(new vn(2, o90Var));
        }
    }

    @Override // defpackage.n90
    public void shutdown() {
        uy1.f1059a.set(null);
        o.set(this, 1);
        M();
        while (K() <= 0) {
        }
        V();
    }
}
