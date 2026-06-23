package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class sj2 extends ym0 {
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;

    public sj2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f = atomicReferenceFieldUpdater;
        this.g = atomicReferenceFieldUpdater2;
        this.h = atomicReferenceFieldUpdater3;
        this.i = atomicReferenceFieldUpdater4;
        this.j = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.ym0
    public final rj2 E(zj2 zj2Var) {
        return (rj2) this.i.getAndSet(zj2Var, rj2.d);
    }

    @Override // defpackage.ym0
    public final yj2 F(zj2 zj2Var) {
        return (yj2) this.h.getAndSet(zj2Var, yj2.c);
    }

    @Override // defpackage.ym0
    public final void G(yj2 yj2Var, yj2 yj2Var2) {
        this.g.lazySet(yj2Var, yj2Var2);
    }

    @Override // defpackage.ym0
    public final void H(yj2 yj2Var, Thread thread) {
        this.f.lazySet(yj2Var, thread);
    }

    @Override // defpackage.ym0
    public final boolean I(zj2 zj2Var, rj2 rj2Var, rj2 rj2Var2) {
        return bw0.C(this.i, zj2Var, rj2Var, rj2Var2);
    }

    @Override // defpackage.ym0
    public final boolean J(zj2 zj2Var, Object obj, Object obj2) {
        return bw0.C(this.j, zj2Var, obj, obj2);
    }

    @Override // defpackage.ym0
    public final boolean K(zj2 zj2Var, yj2 yj2Var, yj2 yj2Var2) {
        return bw0.C(this.h, zj2Var, yj2Var, yj2Var2);
    }
}
