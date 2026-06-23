package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class ty0 extends sl1 implements ry0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(ty0.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long q = lj1.f595a.objectFieldOffset(ty0.class.getDeclaredField("owner$volatile"));
    public volatile /* synthetic */ Object owner$volatile;

    public ty0() {
        super(1);
        this.owner$volatile = uy0.f1058a;
    }

    @Override // defpackage.ry0
    public final void a(Object obj) {
        while (Math.max(sl1.m.get(this), 0) == 0) {
            p.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = q;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            o1 o1Var = uy0.f1058a;
            if (objectVolatile != o1Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = lj1.f595a;
                    ty0 ty0Var = this;
                    if (unsafe2.compareAndSwapObject(ty0Var, q, objectVolatile, o1Var)) {
                        ty0Var.c();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(ty0Var, j) != objectVolatile) {
                            this = ty0Var;
                            break;
                        }
                        this = ty0Var;
                    }
                }
            }
        }
        c.n("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        r5 = defpackage.ty0.p;
        r3 = r0.h;
        r5.set(r3, null);
        r5 = r0.g;
        r5.G(r1, r5.i, new defpackage.zn(0, new defpackage.m(r3, r0)));
     */
    @Override // defpackage.ry0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ex r6) {
        /*
            r5 = this;
            int r0 = r5.f()
            e42 r1 = defpackage.e42.f219a
            if (r0 == 0) goto L66
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L1b
            r5 = 2
            if (r0 == r5) goto L15
            java.lang.String r5 = "unexpected"
            defpackage.c.n(r5)
            return r2
        L15:
            java.lang.String r5 = "This mutex is already locked by the specified owner: null"
            defpackage.c.n(r5)
            return r2
        L1b:
            dx r6 = defpackage.ju0.T(r6)
            ao r6 = defpackage.d10.t(r6)
            sy0 r0 = new sy0     // Catch: java.lang.Throwable -> L61
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L61
        L28:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.sl1.m     // Catch: java.lang.Throwable -> L61
            int r3 = r3.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L61
            int r4 = r5.g     // Catch: java.lang.Throwable -> L61
            if (r3 > r4) goto L28
            if (r3 <= 0) goto L4e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.ty0.p     // Catch: java.lang.Throwable -> L61
            ty0 r3 = r0.h     // Catch: java.lang.Throwable -> L61
            r5.set(r3, r2)     // Catch: java.lang.Throwable -> L61
            ao r5 = r0.g     // Catch: java.lang.Throwable -> L61
            m r2 = new m     // Catch: java.lang.Throwable -> L61
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L61
            int r0 = r5.i     // Catch: java.lang.Throwable -> L61
            zn r3 = new zn     // Catch: java.lang.Throwable -> L61
            r4 = 0
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L61
            r5.G(r1, r0, r3)     // Catch: java.lang.Throwable -> L61
            goto L54
        L4e:
            boolean r3 = r5.b(r0)     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L28
        L54:
            java.lang.Object r5 = r6.v()
            zx r6 = defpackage.zx.g
            if (r5 != r6) goto L5d
            goto L5e
        L5d:
            r5 = r1
        L5e:
            if (r5 != r6) goto L66
            return r5
        L61:
            r5 = move-exception
            r6.E()
            throw r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty0.e(ex):java.lang.Object");
    }

    public final int f() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = sl1.m;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.g;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    p.getClass();
                    lj1.f595a.putObjectVolatile(this, q, (Object) null);
                    return 0;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(d10.r(this));
        sb.append("[isLocked=");
        sb.append(Math.max(sl1.m.get(this), 0) == 0);
        sb.append(",owner=");
        p.getClass();
        sb.append(lj1.f595a.getObjectVolatile(this, q));
        sb.append(']');
        return sb.toString();
    }
}
