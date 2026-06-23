package defpackage;

import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public class sl1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i;
    public static final /* synthetic */ AtomicLongFieldUpdater j;
    public static final /* synthetic */ AtomicReferenceFieldUpdater k;
    public static final /* synthetic */ AtomicLongFieldUpdater l;
    public static final /* synthetic */ AtomicIntegerFieldUpdater m;
    public static final /* synthetic */ long n;
    public static final /* synthetic */ long o;
    public volatile /* synthetic */ int _availablePermits$volatile;
    public volatile /* synthetic */ long deqIdx$volatile;
    public volatile /* synthetic */ long enqIdx$volatile;
    public final int g;
    public final zn h;
    public volatile /* synthetic */ Object head$volatile;
    public volatile /* synthetic */ Object tail$volatile;

    static {
        String str = YHJbtPFAANaPQ.woSXggfYmJi;
        i = AtomicReferenceFieldUpdater.newUpdater(sl1.class, Object.class, str);
        Unsafe unsafe = lj1.f595a;
        n = unsafe.objectFieldOffset(sl1.class.getDeclaredField(str));
        j = AtomicLongFieldUpdater.newUpdater(sl1.class, "deqIdx$volatile");
        k = AtomicReferenceFieldUpdater.newUpdater(sl1.class, Object.class, "tail$volatile");
        o = unsafe.objectFieldOffset(sl1.class.getDeclaredField("tail$volatile"));
        l = AtomicLongFieldUpdater.newUpdater(sl1.class, MiGPiFgcCQCVh.gRntYVkjs);
        m = AtomicIntegerFieldUpdater.newUpdater(sl1.class, "_availablePermits$volatile");
    }

    public sl1(int i2) {
        this.g = i2;
        if (i2 <= 0) {
            c.d(d51.q("Semaphore should have at least 1 permit, but had ", i2));
            throw null;
        }
        if (i2 < 0) {
            c.d(d51.q("The number of acquired permits should be in 0..", i2));
            throw null;
        }
        vl1 vl1Var = new vl1(0L, null, 2);
        this.head$volatile = vl1Var;
        this.tail$volatile = vl1Var;
        this._availablePermits$volatile = i2;
        this.h = new zn(2, this);
    }

    public final boolean b(f92 f92Var) {
        Object a2;
        Unsafe unsafe;
        sl1 sl1Var = this;
        k.getClass();
        Unsafe unsafe2 = lj1.f595a;
        long j2 = o;
        vl1 vl1Var = (vl1) unsafe2.getObjectVolatile(sl1Var, j2);
        long andIncrement = l.getAndIncrement(sl1Var);
        ql1 ql1Var = ql1.n;
        long j3 = andIncrement / ul1.f;
        loop0: while (true) {
            a2 = hu.a(vl1Var, j3, ql1Var);
            if (ym0.p(a2)) {
                break;
            }
            nl1 n2 = ym0.n(a2);
            while (true) {
                nl1 nl1Var = (nl1) lj1.f595a.getObjectVolatile(sl1Var, j2);
                if (nl1Var.e >= n2.e) {
                    sl1Var = this;
                    break loop0;
                }
                if (!n2.n()) {
                    break;
                }
                do {
                    unsafe = lj1.f595a;
                    sl1Var = this;
                    if (unsafe.compareAndSwapObject(sl1Var, o, nl1Var, n2)) {
                        if (nl1Var.j()) {
                            nl1Var.h();
                        }
                    }
                } while (unsafe.getObjectVolatile(sl1Var, j2) == nl1Var);
                if (n2.j()) {
                    n2.h();
                }
            }
            sl1Var = this;
        }
        vl1 vl1Var2 = (vl1) ym0.n(a2);
        AtomicReferenceArray atomicReferenceArray = vl1Var2.g;
        int i2 = (int) (andIncrement % ul1.f);
        while (!atomicReferenceArray.compareAndSet(i2, null, f92Var)) {
            if (atomicReferenceArray.get(i2) != null) {
                o1 o1Var = ul1.b;
                o1 o1Var2 = ul1.c;
                while (!atomicReferenceArray.compareAndSet(i2, o1Var, o1Var2)) {
                    if (atomicReferenceArray.get(i2) != o1Var) {
                        return false;
                    }
                }
                ((yn) f92Var).h(e42.f219a, sl1Var.h);
                return true;
            }
        }
        f92Var.a(vl1Var2, i2);
        return true;
    }

    public final void c() {
        int i2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.g;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!d());
    }

    public final boolean d() {
        Object a2;
        Unsafe unsafe;
        i.getClass();
        Unsafe unsafe2 = lj1.f595a;
        long j2 = n;
        vl1 vl1Var = (vl1) unsafe2.getObjectVolatile(this, j2);
        long andIncrement = j.getAndIncrement(this);
        long j3 = andIncrement / ul1.f;
        rl1 rl1Var = rl1.n;
        loop0: while (true) {
            a2 = hu.a(vl1Var, j3, rl1Var);
            if (ym0.p(a2)) {
                break;
            }
            nl1 n2 = ym0.n(a2);
            while (true) {
                nl1 nl1Var = (nl1) lj1.f595a.getObjectVolatile(this, j2);
                if (nl1Var.e >= n2.e) {
                    break loop0;
                }
                if (!n2.n()) {
                    break;
                }
                do {
                    unsafe = lj1.f595a;
                    if (unsafe.compareAndSwapObject(this, n, nl1Var, n2)) {
                        if (nl1Var.j()) {
                            nl1Var.h();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j2) == nl1Var);
                if (n2.j()) {
                    n2.h();
                }
            }
        }
        vl1 vl1Var2 = (vl1) ym0.n(a2);
        AtomicReferenceArray atomicReferenceArray = vl1Var2.g;
        vl1Var2.a();
        boolean z = false;
        if (vl1Var2.e <= j3) {
            int i2 = (int) (andIncrement % ul1.f);
            Object andSet = atomicReferenceArray.getAndSet(i2, ul1.b);
            if (andSet == null) {
                int i3 = ul1.f1048a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (atomicReferenceArray.get(i2) == ul1.c) {
                        return true;
                    }
                }
                o1 o1Var = ul1.b;
                o1 o1Var2 = ul1.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i2, o1Var, o1Var2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i2) != o1Var) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != ul1.e) {
                if (!(andSet instanceof yn)) {
                    rw.m("unexpected: ", andSet);
                    return false;
                }
                yn ynVar = (yn) andSet;
                o1 i5 = ynVar.i(e42.f219a, this.h);
                if (i5 != null) {
                    ynVar.n(i5);
                    return true;
                }
            }
        }
        return false;
    }
}
