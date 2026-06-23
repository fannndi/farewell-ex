package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class fc2 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f277a = new AtomicReferenceArray(rt0.s);
    public volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    public volatile /* synthetic */ int consumerIndex$volatile;
    public volatile /* synthetic */ Object lastScheduledTask$volatile;
    public volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(fc2.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = lj1.f595a.objectFieldOffset(fc2.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(fc2.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(fc2.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(fc2.class, "blockingTasksInBuffer$volatile");

    public final mv1 a(mv1 mv1Var, boolean z) {
        if (z) {
            return b(mv1Var);
        }
        b.getClass();
        mv1 mv1Var2 = (mv1) lj1.f595a.getAndSetObject(this, f, mv1Var);
        if (mv1Var2 == null) {
            return null;
        }
        return b(mv1Var2);
    }

    public final mv1 b(mv1 mv1Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return mv1Var;
        }
        if (mv1Var.h) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f277a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, mv1Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = lj1.f595a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(gg0 gg0Var) {
        b.getClass();
        mv1 mv1Var = (mv1) lj1.f595a.getAndSetObject(this, f, (Object) null);
        if (mv1Var != null) {
            gg0Var.a(mv1Var);
        }
        while (true) {
            mv1 f2 = f();
            if (f2 == null) {
                return;
            } else {
                gg0Var.a(f2);
            }
        }
    }

    public final mv1 e() {
        b.getClass();
        mv1 mv1Var = (mv1) lj1.f595a.getAndSetObject(this, f, (Object) null);
        return mv1Var == null ? f() : mv1Var;
    }

    public final mv1 f() {
        mv1 mv1Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (mv1Var = (mv1) this.f277a.getAndSet(i2, null)) != null) {
                if (mv1Var.h) {
                    e.decrementAndGet(this);
                }
                return mv1Var;
            }
        }
    }

    public final mv1 g() {
        fc2 fc2Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = f;
            mv1 mv1Var = (mv1) unsafe.getObjectVolatile(this, j);
            if (mv1Var != null && mv1Var.h) {
                while (true) {
                    Unsafe unsafe2 = lj1.f595a;
                    fc2Var = this;
                    if (unsafe2.compareAndSwapObject(fc2Var, f, mv1Var, (Object) null)) {
                        return mv1Var;
                    }
                    if (unsafe2.getObjectVolatile(fc2Var, j) != mv1Var) {
                        break;
                    }
                    this = fc2Var;
                }
            }
            this = fc2Var;
        }
        fc2 fc2Var2 = this;
        int i = d.get(fc2Var2);
        int i2 = c.get(fc2Var2);
        while (i != i2 && e.get(fc2Var2) != 0) {
            i2--;
            mv1 h = fc2Var2.h(i2, true);
            if (h != null) {
                return h;
            }
        }
        return null;
    }

    public final mv1 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f277a;
        mv1 mv1Var = (mv1) atomicReferenceArray.get(i2);
        if (mv1Var != null && mv1Var.h == z) {
            while (!atomicReferenceArray.compareAndSet(i2, mv1Var, null)) {
                if (atomicReferenceArray.get(i2) != mv1Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return mv1Var;
        }
        return null;
    }

    public final long i(int i, ze1 ze1Var) {
        fc2 fc2Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = lj1.f595a;
            long j = f;
            mv1 mv1Var = (mv1) unsafe.getObjectVolatile(this, j);
            if (mv1Var == null) {
                return -2L;
            }
            if (((mv1Var.h ? 1 : 2) & i) == 0) {
                return -2L;
            }
            kw1.f.getClass();
            long nanoTime = System.nanoTime() - mv1Var.g;
            long j2 = kw1.b;
            if (nanoTime < j2) {
                return j2 - nanoTime;
            }
            while (true) {
                Unsafe unsafe2 = lj1.f595a;
                fc2Var = this;
                if (unsafe2.compareAndSwapObject(fc2Var, f, mv1Var, (Object) null)) {
                    ze1Var.g = mv1Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(fc2Var, j) != mv1Var) {
                    break;
                }
                this = fc2Var;
            }
            this = fc2Var;
        }
    }
}
