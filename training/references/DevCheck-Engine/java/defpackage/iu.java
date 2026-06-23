package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class iu {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f448a = AtomicReferenceFieldUpdater.newUpdater(iu.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    public volatile /* synthetic */ Object _next$volatile;
    public volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = lj1.f595a;
        c = unsafe.objectFieldOffset(iu.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(iu.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(iu.class.getDeclaredField("_prev$volatile"));
    }

    public iu(nl1 nl1Var) {
        this._prev$volatile = nl1Var;
    }

    public final void a() {
        b.getClass();
        lj1.f595a.putObjectVolatile(this, d, (Object) null);
    }

    public final iu b() {
        iu e = e();
        while (e != null && e.f()) {
            b.getClass();
            e = (iu) lj1.f595a.getObjectVolatile(e, d);
        }
        return e;
    }

    public final iu c() {
        Object d2 = d();
        if (d2 == hu.f399a) {
            return null;
        }
        return (iu) d2;
    }

    public final Object d() {
        f448a.getClass();
        return lj1.f595a.getObjectVolatile(this, c);
    }

    public final iu e() {
        b.getClass();
        return (iu) lj1.f595a.getObjectVolatile(this, d);
    }

    public abstract boolean f();

    public final boolean g() {
        while (true) {
            f448a.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = c;
            iu iuVar = this;
            if (unsafe.compareAndSwapObject(iuVar, j, (Object) null, hu.f399a)) {
                return true;
            }
            if (unsafe.getObjectVolatile(iuVar, j) != null) {
                return false;
            }
            this = iuVar;
        }
    }

    public final void h() {
        iu iuVar;
        Unsafe unsafe;
        if (c() == null) {
            return;
        }
        while (true) {
            iu b2 = b();
            iu c2 = c();
            c2.getClass();
            do {
                iuVar = c2;
                if (!iuVar.f()) {
                    break;
                } else {
                    c2 = iuVar.c();
                }
            } while (c2 != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = lj1.f595a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(iuVar, j);
                iu iuVar2 = ((iu) objectVolatile) == null ? null : b2;
                do {
                    unsafe = lj1.f595a;
                    if (unsafe.compareAndSwapObject(iuVar, d, objectVolatile, iuVar2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(iuVar, j) == objectVolatile);
            }
            if (b2 != null) {
                f448a.getClass();
                unsafe.putObjectVolatile(b2, c, iuVar);
            }
            if (!iuVar.f() || iuVar.c() == null) {
                if (b2 == null || !b2.f()) {
                    return;
                }
            }
        }
    }

    public final boolean i(nl1 nl1Var) {
        while (true) {
            f448a.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = c;
            iu iuVar = this;
            nl1 nl1Var2 = nl1Var;
            if (unsafe.compareAndSwapObject(iuVar, j, (Object) null, nl1Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(iuVar, j) != null) {
                return false;
            }
            this = iuVar;
            nl1Var = nl1Var2;
        }
    }
}
