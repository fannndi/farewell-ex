package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class lq0 extends sx implements q20 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(lq0.class, "runningWorkers$volatile");
    public final /* synthetic */ q20 i;
    public final sx j;
    public final int k;
    public final ws0 l;
    public final Object m;
    public volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public lq0(sx sxVar, int i) {
        q20 q20Var = sxVar instanceof q20 ? (q20) sxVar : null;
        this.i = q20Var == null ? o10.f712a : q20Var;
        this.j = sxVar;
        this.k = i;
        this.l = new ws0();
        this.m = new Object();
    }

    @Override // defpackage.sx
    public final void D(qx qxVar, Runnable runnable) {
        Runnable H;
        this.l.a(runnable);
        if (n.get(this) >= this.k || !I() || (H = H()) == null) {
            return;
        }
        this.j.D(this, new hk2(this, H, 11, false));
    }

    @Override // defpackage.sx
    public final void E(qx qxVar, Runnable runnable) {
        Runnable H;
        this.l.a(runnable);
        if (n.get(this) >= this.k || !I() || (H = H()) == null) {
            return;
        }
        this.j.E(this, new hk2(this, H, 11, false));
    }

    public final Runnable H() {
        while (true) {
            Runnable runnable = (Runnable) this.l.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.m) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.l.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean I() {
        synchronized (this.m) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n;
            if (atomicIntegerFieldUpdater.get(this) >= this.k) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.q20
    public final n50 j(long j, dz1 dz1Var, qx qxVar) {
        return this.i.j(j, dz1Var, qxVar);
    }

    @Override // defpackage.q20
    public final void l(long j, ao aoVar) {
        this.i.l(j, aoVar);
    }

    @Override // defpackage.sx
    public final String toString() {
        return this.j + ".limitedParallelism(" + this.k + ')';
    }
}
