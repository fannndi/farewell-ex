package defpackage;

import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public class bm implements ap {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(bm.class, GFUHKHDfiFuPm.QaVAtpq);
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(bm.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(bm.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater k = AtomicLongFieldUpdater.newUpdater(bm.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(bm.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m;
    public static final /* synthetic */ AtomicReferenceFieldUpdater n;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    public static final /* synthetic */ AtomicReferenceFieldUpdater p;
    public static final /* synthetic */ long q;
    public static final /* synthetic */ long r;
    public static final /* synthetic */ long s;
    public static final /* synthetic */ long t;
    public static final /* synthetic */ long u;
    public volatile /* synthetic */ Object _closeCause$volatile;
    public volatile /* synthetic */ long bufferEnd$volatile;
    public volatile /* synthetic */ Object bufferEndSegment$volatile;
    public volatile /* synthetic */ Object closeHandler$volatile;
    public volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int g;
    public volatile /* synthetic */ Object receiveSegment$volatile;
    public volatile /* synthetic */ long receivers$volatile;
    public volatile /* synthetic */ Object sendSegment$volatile;
    public volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = lj1.f595a;
        u = unsafe.objectFieldOffset(bm.class.getDeclaredField("sendSegment$volatile"));
        m = AtomicReferenceFieldUpdater.newUpdater(bm.class, Object.class, "receiveSegment$volatile");
        t = unsafe.objectFieldOffset(bm.class.getDeclaredField("receiveSegment$volatile"));
        n = AtomicReferenceFieldUpdater.newUpdater(bm.class, Object.class, "bufferEndSegment$volatile");
        r = unsafe.objectFieldOffset(bm.class.getDeclaredField("bufferEndSegment$volatile"));
        o = AtomicReferenceFieldUpdater.newUpdater(bm.class, Object.class, "_closeCause$volatile");
        q = unsafe.objectFieldOffset(bm.class.getDeclaredField("_closeCause$volatile"));
        p = AtomicReferenceFieldUpdater.newUpdater(bm.class, Object.class, "closeHandler$volatile");
        s = unsafe.objectFieldOffset(bm.class.getDeclaredField("closeHandler$volatile"));
    }

    public bm(int i2) {
        this.g = i2;
        if (i2 < 0) {
            c.d(d51.p(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        hp hpVar = dm.f197a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = j.get(this);
        hp hpVar2 = new hp(0L, null, this, 3);
        this.sendSegment$volatile = hpVar2;
        this.receiveSegment$volatile = hpVar2;
        if (B()) {
            hpVar2 = dm.f197a;
            hpVar2.getClass();
        }
        this.bufferEndSegment$volatile = hpVar2;
        this._closeCause$volatile = dm.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object E(defpackage.bm r13, defpackage.ex r14) {
        /*
            boolean r0 = r14 instanceof defpackage.zl
            if (r0 == 0) goto L14
            r0 = r14
            zl r0 = (defpackage.zl) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zl r0 = new zl
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.j
            int r0 = r6.l
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            defpackage.om0.O(r14)
            gp r14 = (defpackage.gp) r14
            java.lang.Object r13 = r14.f348a
            return r13
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r13)
            return r1
        L32:
            defpackage.om0.O(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.bm.m
            r14.getClass()
            sun.misc.Unsafe r14 = defpackage.lj1.f595a
            long r3 = defpackage.bm.t
            java.lang.Object r14 = r14.getObjectVolatile(r13, r3)
            hp r14 = (defpackage.hp) r14
        L44:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.bm.h
            long r3 = r0.get(r13)
            boolean r0 = r13.y(r3, r2)
            if (r0 == 0) goto L5a
            java.lang.Throwable r13 = r13.r()
            ep r14 = new ep
            r14.<init>(r13)
            return r14
        L5a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.bm.i
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.dm.b
            long r7 = (long) r0
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L77
            hp r0 = r13.p(r9, r14)
            if (r0 != 0) goto L75
            goto L44
        L75:
            r8 = r0
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.L(r8, r9, r10, r12)
            o1 r14 = defpackage.dm.m
            if (r13 == r14) goto Lac
            o1 r14 = defpackage.dm.o
            if (r13 != r14) goto L96
            long r13 = r7.t()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L93
            r8.a()
        L93:
            r13 = r7
            r14 = r8
            goto L44
        L96:
            o1 r14 = defpackage.dm.n
            if (r13 != r14) goto La8
            r6.l = r2
            r1 = r7
            r2 = r8
            java.lang.Object r13 = r1.F(r2, r3, r4, r6)
            zx r14 = defpackage.zx.g
            if (r13 != r14) goto La7
            return r14
        La7:
            return r13
        La8:
            r8.a()
            return r13
        Lac:
            java.lang.String r13 = "unexpected"
            defpackage.c.n(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.E(bm, ex):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object H(defpackage.bm r26, java.lang.Object r27, defpackage.dx r28) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.H(bm, java.lang.Object, dx):java.lang.Object");
    }

    public static boolean J(Object obj) {
        if (obj instanceof yn) {
            return dm.a((yn) obj, e42.f219a, null);
        }
        rw.m("Unexpected waiter: ", obj);
        return false;
    }

    public static final void a(bm bmVar, Object obj, ao aoVar) {
        aoVar.g(new pg1(bmVar.s()));
    }

    public static final int c(bm bmVar, hp hpVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        hpVar.r(i2, obj);
        if (z) {
            return bmVar.M(hpVar, i2, obj, j2, obj2, z);
        }
        Object p2 = hpVar.p(i2);
        if (p2 == null) {
            if (bmVar.d(j2)) {
                if (hpVar.o(null, i2, dm.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (hpVar.o(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (p2 instanceof f92) {
            hpVar.r(i2, null);
            if (bmVar.I(p2, obj)) {
                hpVar.s(i2, dm.i);
                return 0;
            }
            o1 o1Var = dm.k;
            if (hpVar.h.getAndSet((i2 * 2) + 1, o1Var) == o1Var) {
                return 5;
            }
            hpVar.q(i2, true);
            return 5;
        }
        return bmVar.M(hpVar, i2, obj, j2, obj2, z);
    }

    public static void v(bm bmVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = k;
        if ((atomicLongFieldUpdater.addAndGet(bmVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bmVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public boolean A() {
        return false;
    }

    public final boolean B() {
        long j2 = j.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r5.j() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r5.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(long r7, defpackage.hp r9) {
        /*
            r6 = this;
        L0:
            long r0 = r9.e
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            iu r0 = r9.c()
            hp r0 = (defpackage.hp) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.f()
            if (r7 == 0) goto L23
            iu r7 = r5.c()
            hp r7 = (defpackage.hp) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.bm.n
            r7.getClass()
            sun.misc.Unsafe r7 = defpackage.lj1.f595a
            long r8 = defpackage.bm.r
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            nl1 r4 = (defpackage.nl1) r4
            long r0 = r4.e
            long r2 = r5.e
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L3c
            goto L58
        L3c:
            boolean r7 = r5.n()
            if (r7 != 0) goto L44
            r9 = r5
            goto L11
        L44:
            sun.misc.Unsafe r0 = defpackage.lj1.f595a
            long r2 = defpackage.bm.r
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L59
            boolean r6 = r4.j()
            if (r6 == 0) goto L58
            r4.h()
        L58:
            return
        L59:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L6a
            boolean r6 = r5.j()
            if (r6 == 0) goto L68
            r5.h()
        L68:
            r6 = r1
            goto L23
        L6a:
            r6 = r1
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.C(long, hp):void");
    }

    public final Object D(dx dxVar, Object obj) {
        ao aoVar = new ao(1, ju0.T(dxVar));
        aoVar.x();
        aoVar.g(new pg1(s()));
        Object v = aoVar.v();
        return v == zx.g ? v : e42.f219a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(defpackage.hp r11, int r12, long r13, defpackage.ex r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.F(hp, int, long, ex):java.lang.Object");
    }

    public final void G(f92 f92Var, boolean z) {
        Throwable s2;
        if (f92Var instanceof yn) {
            dx dxVar = (dx) f92Var;
            if (z) {
                s2 = r();
                if (s2 == null) {
                    s2 = new mr("Channel was closed");
                }
            } else {
                s2 = s();
            }
            dxVar.g(new pg1(s2));
            return;
        }
        if (f92Var instanceof md1) {
            ((md1) f92Var).g.g(new gp(new ep(r())));
            return;
        }
        if (!(f92Var instanceof yl)) {
            rw.m("Unexpected waiter: ", f92Var);
            return;
        }
        yl ylVar = (yl) f92Var;
        ao aoVar = ylVar.h;
        aoVar.getClass();
        ylVar.h = null;
        ylVar.g = dm.l;
        Throwable r2 = ylVar.i.r();
        if (r2 == null) {
            aoVar.g(Boolean.FALSE);
        } else {
            aoVar.g(new pg1(r2));
        }
    }

    public final boolean I(Object obj, Object obj2) {
        if (obj instanceof md1) {
            return dm.a(((md1) obj).g, new gp(obj2), null);
        }
        if (!(obj instanceof yl)) {
            if (obj instanceof yn) {
                return dm.a((yn) obj, obj2, null);
            }
            rw.m("Unexpected receiver type: ", obj);
            return false;
        }
        yl ylVar = (yl) obj;
        ao aoVar = ylVar.h;
        aoVar.getClass();
        ylVar.h = null;
        ylVar.g = obj2;
        return dm.a(aoVar, Boolean.TRUE, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(java.lang.Object r14) {
        /*
            r13 = this;
            o1 r6 = defpackage.dm.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.bm.l
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.lj1.f595a
            long r1 = defpackage.bm.u
            java.lang.Object r0 = r0.getObjectVolatile(r13, r1)
            hp r0 = (defpackage.hp) r0
        L11:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.bm.h
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r1 & r3
            r3 = 0
            boolean r7 = r13.y(r1, r3)
            int r8 = defpackage.dm.b
            long r9 = (long) r8
            long r1 = r4 / r9
            long r11 = r4 % r9
            int r3 = (int) r11
            long r11 = r0.e
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 == 0) goto L47
            hp r1 = r13.q(r1, r0)
            if (r1 != 0) goto L43
            if (r7 == 0) goto L11
            java.lang.Throwable r13 = r13.s()
            ep r14 = new ep
            r14.<init>(r13)
            return r14
        L43:
            r0 = r13
            r2 = r3
        L45:
            r3 = r14
            goto L4b
        L47:
            r1 = r0
            r2 = r3
            r0 = r13
            goto L45
        L4b:
            int r13 = c(r0, r1, r2, r3, r4, r6, r7)
            r14 = r0
            r0 = r1
            e42 r1 = defpackage.e42.f219a
            if (r13 == 0) goto Laf
            r11 = 1
            if (r13 == r11) goto Lae
            r11 = 2
            r12 = 0
            if (r13 == r11) goto L89
            r1 = 3
            if (r13 == r1) goto L83
            r1 = 4
            if (r13 == r1) goto L6c
            r1 = 5
            if (r13 == r1) goto L66
            goto L69
        L66:
            r0.a()
        L69:
            r13 = r14
            r14 = r3
            goto L11
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r13 = defpackage.bm.i
            long r1 = r13.get(r14)
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 >= 0) goto L79
            r0.a()
        L79:
            java.lang.Throwable r13 = r14.s()
            ep r14 = new ep
            r14.<init>(r13)
            return r14
        L83:
            java.lang.String r13 = "unexpected"
            defpackage.c.n(r13)
            return r12
        L89:
            if (r7 == 0) goto L98
            r0.m()
            java.lang.Throwable r13 = r14.s()
            ep r14 = new ep
            r14.<init>(r13)
            return r14
        L98:
            boolean r13 = r6 instanceof defpackage.f92
            if (r13 == 0) goto L9f
            r12 = r6
            f92 r12 = (defpackage.f92) r12
        L9f:
            if (r12 == 0) goto La6
            int r3 = r2 + r8
            r12.a(r0, r3)
        La6:
            long r3 = r0.e
            long r3 = r3 * r9
            long r5 = (long) r2
            long r3 = r3 + r5
            r14.m(r3)
        Lae:
            return r1
        Laf:
            r0.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.K(java.lang.Object):java.lang.Object");
    }

    public final Object L(hp hpVar, int i2, long j2, Object obj) {
        Object p2 = hpVar.p(i2);
        AtomicReferenceArray atomicReferenceArray = hpVar.h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if (p2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return dm.n;
                }
                if (hpVar.o(p2, i2, obj)) {
                    n();
                    return dm.m;
                }
            }
        } else if (p2 == dm.d && hpVar.o(p2, i2, dm.i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            hpVar.r(i2, null);
            return obj2;
        }
        while (true) {
            Object p3 = hpVar.p(i2);
            if (p3 == null || p3 == dm.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (hpVar.o(p3, i2, dm.h)) {
                        n();
                        return dm.o;
                    }
                } else {
                    if (obj == null) {
                        return dm.n;
                    }
                    if (hpVar.o(p3, i2, obj)) {
                        n();
                        return dm.m;
                    }
                }
            } else {
                if (p3 != dm.d) {
                    o1 o1Var = dm.j;
                    if (p3 != o1Var && p3 != dm.h) {
                        if (p3 == dm.l) {
                            n();
                            return dm.o;
                        }
                        if (p3 != dm.g && hpVar.o(p3, i2, dm.f)) {
                            boolean z = p3 instanceof g92;
                            if (z) {
                                p3 = ((g92) p3).f323a;
                            }
                            if (J(p3)) {
                                hpVar.s(i2, dm.i);
                                n();
                                Object obj3 = atomicReferenceArray.get(i2 * 2);
                                hpVar.r(i2, null);
                                return obj3;
                            }
                            hpVar.s(i2, o1Var);
                            hpVar.m();
                            if (z) {
                                n();
                            }
                            return dm.o;
                        }
                    }
                    return dm.o;
                }
                if (hpVar.o(p3, i2, dm.i)) {
                    n();
                    Object obj4 = atomicReferenceArray.get(i2 * 2);
                    hpVar.r(i2, null);
                    return obj4;
                }
            }
        }
    }

    public final int M(hp hpVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object p2 = hpVar.p(i2);
            if (p2 == null) {
                if (!d(j2) || z) {
                    if (z) {
                        if (hpVar.o(null, i2, dm.j)) {
                            hpVar.m();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (hpVar.o(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (hpVar.o(null, i2, dm.d)) {
                    break;
                }
            } else {
                if (p2 != dm.e) {
                    o1 o1Var = dm.k;
                    if (p2 == o1Var) {
                        hpVar.r(i2, null);
                        return 5;
                    }
                    if (p2 == dm.h) {
                        hpVar.r(i2, null);
                        return 5;
                    }
                    if (p2 == dm.l) {
                        hpVar.r(i2, null);
                        z();
                        return 4;
                    }
                    hpVar.r(i2, null);
                    if (p2 instanceof g92) {
                        p2 = ((g92) p2).f323a;
                    }
                    if (I(p2, obj)) {
                        hpVar.s(i2, dm.i);
                        return 0;
                    }
                    if (hpVar.h.getAndSet((i2 * 2) + 1, o1Var) != o1Var) {
                        hpVar.q(i2, true);
                    }
                    return 5;
                }
                if (hpVar.o(p2, i2, dm.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void N(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        bm bmVar = this;
        if (bmVar.B()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = j;
            if (atomicLongFieldUpdater.get(bmVar) > j2) {
                break;
            } else {
                bmVar = this;
            }
        }
        int i2 = dm.c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = k;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(bmVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(bmVar)) && j3 == atomicLongFieldUpdater.get(bmVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(bmVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bmVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bmVar = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(bmVar);
                    long j6 = atomicLongFieldUpdater2.get(bmVar);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(bmVar)) {
                        break;
                    }
                    if (z) {
                        bmVar = this;
                    } else {
                        bmVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bmVar, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(bmVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bmVar, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        bmVar = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.wl1
    public Object b(dx dxVar, Object obj) {
        return H(this, obj, dxVar);
    }

    public final boolean d(long j2) {
        return j2 < j.get(this) || j2 < i.get(this) + ((long) this.g);
    }

    @Override // defpackage.ap
    public final void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    public final boolean f(Throwable th) {
        return h(th, false);
    }

    public final hp g() {
        n.getClass();
        Unsafe unsafe = lj1.f595a;
        Object objectVolatile = unsafe.getObjectVolatile(this, r);
        l.getClass();
        hp hpVar = (hp) unsafe.getObjectVolatile(this, u);
        if (hpVar.e > ((hp) objectVolatile).e) {
            objectVolatile = hpVar;
        }
        m.getClass();
        hp hpVar2 = (hp) unsafe.getObjectVolatile(this, t);
        if (hpVar2.e > ((hp) objectVolatile).e) {
            objectVolatile = hpVar2;
        }
        iu iuVar = (iu) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = iu.f448a;
            Object d = iuVar.d();
            if (d == hu.f399a) {
                break;
            }
            iu iuVar2 = (iu) d;
            if (iuVar2 != null) {
                iuVar = iuVar2;
            } else if (iuVar.g()) {
                break;
            }
        }
        return (hp) iuVar;
    }

    public final boolean h(Throwable th, boolean z) {
        bm bmVar;
        boolean z2;
        long j2;
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if (z) {
            while (true) {
                long j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                hp hpVar = dm.f197a;
                bmVar = this;
                if (atomicLongFieldUpdater.compareAndSet(bmVar, j5, (j5 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = bmVar;
            }
        }
        bmVar = this;
        o1 o1Var = dm.s;
        while (true) {
            o.getClass();
            bm bmVar2 = bmVar;
            Unsafe unsafe = lj1.f595a;
            long j6 = q;
            Throwable th2 = th;
            boolean compareAndSwapObject = unsafe.compareAndSwapObject(bmVar2, j6, o1Var, th2);
            bmVar = bmVar2;
            if (compareAndSwapObject) {
                z2 = true;
                break;
            }
            if (unsafe.getObjectVolatile(bmVar, j6) != o1Var) {
                z2 = false;
                break;
            }
            th = th2;
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(bmVar);
            } while (!atomicLongFieldUpdater.compareAndSet(bmVar, j4, 3458764513820540928L + (j4 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(bmVar);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = (j2 & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (j2 & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bmVar, j2, j3));
        }
        bmVar.z();
        if (z2) {
            bmVar.w();
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        r1 = (defpackage.hp) r1.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hp i(long r12) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.i(long):hp");
    }

    @Override // defpackage.ap
    public final yl iterator() {
        return new yl(this);
    }

    @Override // defpackage.ap
    public final Object j() {
        hp hpVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = h;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (y(j3, true)) {
            return new ep(r());
        }
        long j4 = j3 & 1152921504606846975L;
        fp fpVar = gp.b;
        if (j2 >= j4) {
            return fpVar;
        }
        Object obj = dm.k;
        m.getClass();
        hp hpVar2 = (hp) lj1.f595a.getObjectVolatile(this, t);
        while (!this.y(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = dm.b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (hpVar2.e != j6) {
                hp p2 = this.p(j6, hpVar2);
                if (p2 == null) {
                    continue;
                } else {
                    hpVar = p2;
                }
            } else {
                hpVar = hpVar2;
            }
            bm bmVar = this;
            Object L = bmVar.L(hpVar, i2, andIncrement, obj);
            hpVar2 = hpVar;
            if (L == dm.m) {
                f92 f92Var = obj instanceof f92 ? (f92) obj : null;
                if (f92Var != null) {
                    f92Var.a(hpVar2, i2);
                }
                bmVar.N(andIncrement);
                hpVar2.m();
                return fpVar;
            }
            if (L != dm.o) {
                if (L != dm.n) {
                    hpVar2.a();
                    return L;
                }
                c.n("unexpected");
                return null;
            }
            if (andIncrement < bmVar.t()) {
                hpVar2.a();
            }
            this = bmVar;
        }
        return new ep(this.r());
    }

    @Override // defpackage.wl1
    public Object k(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = y(atomicLongFieldUpdater.get(this), false) ? false : !d(r1 & 1152921504606846975L);
        fp fpVar = gp.b;
        if (z2) {
            return fpVar;
        }
        jt1 jt1Var = dm.j;
        l.getClass();
        hp hpVar = (hp) lj1.f595a.getObjectVolatile(this, u);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean y = y(andIncrement, z);
            int i2 = dm.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (hpVar.e != j5) {
                hp q2 = q(j5, hpVar);
                if (q2 != null) {
                    hpVar = q2;
                } else {
                    if (y) {
                        return new ep(s());
                    }
                    z = false;
                    j2 = 1152921504606846975L;
                }
            }
            int c = c(this, hpVar, i3, obj, j3, jt1Var, y);
            e42 e42Var = e42.f219a;
            if (c == 0) {
                hpVar.a();
                return e42Var;
            }
            if (c == 1) {
                return e42Var;
            }
            if (c == 2) {
                if (y) {
                    hpVar.m();
                    return new ep(s());
                }
                f92 f92Var = jt1Var instanceof f92 ? (f92) jt1Var : null;
                if (f92Var != null) {
                    f92Var.a(hpVar, i3 + i2);
                }
                hpVar.m();
                return fpVar;
            }
            if (c == 3) {
                c.n(YHJbtPFAANaPQ.zSLfFZh);
                return null;
            }
            if (c == 4) {
                if (j3 < i.get(this)) {
                    hpVar.a();
                }
                return new ep(s());
            }
            if (c == 5) {
                hpVar.a();
            }
            z = false;
            j2 = 1152921504606846975L;
        }
    }

    @Override // defpackage.ap
    public final Object l(xs xsVar) {
        return E(this, xsVar);
    }

    public final void m(long j2) {
        m.getClass();
        hp hpVar = (hp) lj1.f595a.getObjectVolatile(this, t);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.g + j3, j.get(this))) {
                return;
            }
            bm bmVar = this;
            if (atomicLongFieldUpdater.compareAndSet(bmVar, j3, 1 + j3)) {
                long j4 = dm.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (hpVar.e != j5) {
                    hp p2 = bmVar.p(j5, hpVar);
                    if (p2 != null) {
                        hpVar = p2;
                    }
                }
                hp hpVar2 = hpVar;
                if (bmVar.L(hpVar2, i2, j3, null) != dm.o) {
                    hpVar2.a();
                } else if (j3 < bmVar.t()) {
                    hpVar2.a();
                }
                this = bmVar;
                hpVar = hpVar2;
            }
            this = bmVar;
        }
    }

    public final void n() {
        bm bmVar;
        if (B()) {
            return;
        }
        n.getClass();
        hp hpVar = (hp) lj1.f595a.getObjectVolatile(this, r);
        loop0: while (true) {
            long andIncrement = j.getAndIncrement(this);
            long j2 = dm.b;
            long j3 = andIncrement / j2;
            if (this.t() <= andIncrement) {
                if (hpVar.e < j3 && hpVar.c() != null) {
                    this.C(j3, hpVar);
                }
                v(this);
                return;
            }
            bmVar = this;
            if (hpVar.e != j3) {
                hp o2 = bmVar.o(j3, hpVar, andIncrement);
                if (o2 == null) {
                    continue;
                    this = bmVar;
                } else {
                    hpVar = o2;
                }
            }
            int i2 = (int) (andIncrement % j2);
            Object p2 = hpVar.p(i2);
            boolean z = p2 instanceof f92;
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            if (!z || andIncrement < atomicLongFieldUpdater.get(bmVar) || !hpVar.o(p2, i2, dm.g)) {
                while (true) {
                    Object p3 = hpVar.p(i2);
                    if (!(p3 instanceof f92)) {
                        if (p3 != dm.j) {
                            if (p3 != null) {
                                if (p3 == dm.d || p3 == dm.h || p3 == dm.i || p3 == dm.k || p3 == dm.l) {
                                    break loop0;
                                } else if (p3 != dm.f) {
                                    rw.m(QCeVODiUkb.DJDwflvKokmXxd, p3);
                                    return;
                                }
                            } else if (hpVar.o(p3, i2, dm.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater.get(bmVar)) {
                        if (hpVar.o(p3, i2, new g92((f92) p3))) {
                            break loop0;
                        }
                    } else if (hpVar.o(p3, i2, dm.g)) {
                        if (J(p3)) {
                            hpVar.s(i2, dm.d);
                            break;
                        } else {
                            hpVar.s(i2, dm.j);
                            hpVar.m();
                        }
                    }
                }
                v(bmVar);
            } else if (J(p2)) {
                hpVar.s(i2, dm.d);
                break;
            } else {
                hpVar.s(i2, dm.j);
                hpVar.m();
                v(bmVar);
            }
            this = bmVar;
        }
        v(bmVar);
    }

    public final hp o(long j2, hp hpVar, long j3) {
        Object a2;
        Unsafe unsafe;
        hp hpVar2 = dm.f197a;
        cm cmVar = cm.n;
        loop0: while (true) {
            a2 = hu.a(hpVar, j2, cmVar);
            if (!ym0.p(a2)) {
                nl1 n2 = ym0.n(a2);
                while (true) {
                    n.getClass();
                    Unsafe unsafe2 = lj1.f595a;
                    long j4 = r;
                    nl1 nl1Var = (nl1) unsafe2.getObjectVolatile(this, j4);
                    if (nl1Var.e >= n2.e) {
                        break loop0;
                    }
                    if (!n2.n()) {
                        break;
                    }
                    do {
                        unsafe = lj1.f595a;
                        if (unsafe.compareAndSwapObject(this, r, nl1Var, n2)) {
                            if (nl1Var.j()) {
                                nl1Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == nl1Var);
                    if (n2.j()) {
                        n2.h();
                    }
                }
            } else {
                break;
            }
        }
        if (ym0.p(a2)) {
            z();
            C(j2, hpVar);
            v(this);
            return null;
        }
        hp hpVar3 = (hp) ym0.n(a2);
        long j5 = hpVar3.e;
        if (j5 <= j2) {
            return hpVar3;
        }
        long j6 = j5 * dm.b;
        if (!j.compareAndSet(this, j3 + 1, j6)) {
            v(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = k;
        if ((atomicLongFieldUpdater.addAndGet(this, j6 - j3) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        if (r8.j() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r8.h();
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hp p(long r16, defpackage.hp r18) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.p(long, hp):hp");
    }

    public final hp q(long j2, hp hpVar) {
        Object a2;
        long j3;
        long j4;
        Unsafe unsafe;
        hp hpVar2 = dm.f197a;
        cm cmVar = cm.n;
        loop0: while (true) {
            a2 = hu.a(hpVar, j2, cmVar);
            if (!ym0.p(a2)) {
                nl1 n2 = ym0.n(a2);
                while (true) {
                    l.getClass();
                    Unsafe unsafe2 = lj1.f595a;
                    long j5 = u;
                    nl1 nl1Var = (nl1) unsafe2.getObjectVolatile(this, j5);
                    if (nl1Var.e >= n2.e) {
                        break loop0;
                    }
                    if (!n2.n()) {
                        break;
                    }
                    do {
                        unsafe = lj1.f595a;
                        if (unsafe.compareAndSwapObject(this, u, nl1Var, n2)) {
                            if (nl1Var.j()) {
                                nl1Var.h();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j5) == nl1Var);
                    if (n2.j()) {
                        n2.h();
                    }
                }
            } else {
                break;
            }
        }
        boolean p2 = ym0.p(a2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (p2) {
            z();
            if (hpVar.e * dm.b < atomicLongFieldUpdater.get(this)) {
                hpVar.a();
                return null;
            }
        } else {
            hp hpVar3 = (hp) ym0.n(a2);
            long j6 = hpVar3.e;
            if (j6 <= j2) {
                return hpVar3;
            }
            long j7 = j6 * dm.b;
            do {
                j3 = h.get(this);
                j4 = 1152921504606846975L & j3;
                if (j4 >= j7) {
                    break;
                }
            } while (!h.compareAndSet(this, j3, j4 + (((int) (j3 >> 60)) << 60)));
            if (j6 * dm.b < atomicLongFieldUpdater.get(this)) {
                hpVar3.a();
            }
        }
        return null;
    }

    public final Throwable r() {
        o.getClass();
        return (Throwable) lj1.f595a.getObjectVolatile(this, q);
    }

    public final Throwable s() {
        Throwable r2 = r();
        return r2 == null ? new nr("Channel was closed") : r2;
    }

    public final long t() {
        return h.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        r15 = r8;
        r3 = (defpackage.hp) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01af, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.toString():java.lang.String");
    }

    public final boolean u() {
        while (true) {
            m.getClass();
            Unsafe unsafe = lj1.f595a;
            long j2 = t;
            hp hpVar = (hp) unsafe.getObjectVolatile(this, j2);
            AtomicLongFieldUpdater atomicLongFieldUpdater = i;
            long j3 = atomicLongFieldUpdater.get(this);
            if (t() <= j3) {
                return false;
            }
            long j4 = dm.b;
            long j5 = j3 / j4;
            if (hpVar.e == j5 || (hpVar = p(j5, hpVar)) != null) {
                hpVar.a();
                int i2 = (int) (j3 % j4);
                while (true) {
                    Object p2 = hpVar.p(i2);
                    if (p2 == null || p2 == dm.e) {
                        if (hpVar.o(p2, i2, dm.h)) {
                            n();
                            break;
                        }
                    } else {
                        if (p2 == dm.d) {
                            return true;
                        }
                        if (p2 != dm.j && p2 != dm.l && p2 != dm.i && p2 != dm.h) {
                            if (p2 == dm.g) {
                                return true;
                            }
                            if (p2 != dm.f && j3 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                i.compareAndSet(this, j3, j3 + 1);
            } else if (((hp) unsafe.getObjectVolatile(this, j2)).e < j5) {
                return false;
            }
        }
    }

    public final void w() {
        Object objectVolatile;
        bm bmVar;
        loop0: while (true) {
            p.getClass();
            Unsafe unsafe = lj1.f595a;
            long j2 = s;
            objectVolatile = unsafe.getObjectVolatile(this, j2);
            o1 o1Var = objectVolatile == null ? dm.q : dm.r;
            while (true) {
                Unsafe unsafe2 = lj1.f595a;
                bmVar = this;
                if (unsafe2.compareAndSwapObject(bmVar, s, objectVolatile, o1Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(bmVar, j2) != objectVolatile) {
                    break;
                } else {
                    this = bmVar;
                }
            }
            this = bmVar;
        }
        if (objectVolatile == null) {
            return;
        }
        k32.g(1, objectVolatile);
        ((lf0) objectVolatile).j(bmVar.r());
    }

    public final void x(ds0 ds0Var) {
        Unsafe unsafe;
        while (true) {
            p.getClass();
            Unsafe unsafe2 = lj1.f595a;
            bm bmVar = this;
            if (unsafe2.compareAndSwapObject(bmVar, s, (Object) null, ds0Var)) {
                return;
            }
            long j2 = s;
            if (unsafe2.getObjectVolatile(bmVar, j2) != null) {
                while (true) {
                    Object objectVolatile = lj1.f595a.getObjectVolatile(bmVar, j2);
                    o1 o1Var = dm.q;
                    if (objectVolatile != o1Var) {
                        if (objectVolatile == dm.r) {
                            c.n("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            rw.m("Another handler is already registered: ", objectVolatile);
                            return;
                        }
                    }
                    o1 o1Var2 = dm.r;
                    do {
                        bm bmVar2 = bmVar;
                        unsafe = lj1.f595a;
                        boolean compareAndSwapObject = unsafe.compareAndSwapObject(bmVar2, s, o1Var, o1Var2);
                        bmVar = bmVar2;
                        if (compareAndSwapObject) {
                            ds0Var.j(bmVar.r());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(bmVar, j2) == o1Var);
                }
            } else {
                this = bmVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a3, code lost:
    
        r10 = (defpackage.hp) r10.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(long r10, boolean r12) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm.y(long, boolean):boolean");
    }

    public final boolean z() {
        return y(h.get(this), false);
    }
}
