package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c0 extends rt0 {
    public final AtomicReferenceFieldUpdater D;
    public final AtomicReferenceFieldUpdater E;
    public final AtomicReferenceFieldUpdater F;
    public final AtomicReferenceFieldUpdater G;
    public final AtomicReferenceFieldUpdater H;

    public c0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.D = atomicReferenceFieldUpdater;
        this.E = atomicReferenceFieldUpdater2;
        this.F = atomicReferenceFieldUpdater3;
        this.G = atomicReferenceFieldUpdater4;
        this.H = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.rt0
    public final void A(e0 e0Var, Thread thread) {
        this.D.lazySet(e0Var, thread);
    }

    @Override // defpackage.rt0
    public final boolean b(f0 f0Var, b0 b0Var, b0 b0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.G;
            if (atomicReferenceFieldUpdater.compareAndSet(f0Var, b0Var, b0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f0Var) == b0Var);
        return false;
    }

    @Override // defpackage.rt0
    public final boolean c(f0 f0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.H;
            if (atomicReferenceFieldUpdater.compareAndSet(f0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f0Var) == obj);
        return false;
    }

    @Override // defpackage.rt0
    public final boolean d(f0 f0Var, e0 e0Var, e0 e0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.F;
            if (atomicReferenceFieldUpdater.compareAndSet(f0Var, e0Var, e0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f0Var) == e0Var);
        return false;
    }

    @Override // defpackage.rt0
    public final void z(e0 e0Var, e0 e0Var2) {
        this.E.lazySet(e0Var, e0Var2);
    }
}
