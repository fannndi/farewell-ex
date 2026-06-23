package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class vn2 extends xc1 {
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;

    public vn2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.d = atomicReferenceFieldUpdater;
        this.e = atomicReferenceFieldUpdater2;
        this.f = atomicReferenceFieldUpdater3;
        this.g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.xc1
    public final void M(oo2 oo2Var, oo2 oo2Var2) {
        this.e.lazySet(oo2Var, oo2Var2);
    }

    @Override // defpackage.xc1
    public final void N(oo2 oo2Var, Thread thread) {
        this.d.lazySet(oo2Var, thread);
    }

    @Override // defpackage.xc1
    public final boolean O(ro2 ro2Var, um2 um2Var, um2 um2Var2) {
        return ju0.G0(this.g, ro2Var, um2Var, um2Var2);
    }

    @Override // defpackage.xc1
    public final boolean P(ro2 ro2Var, Object obj, Object obj2) {
        return ju0.G0(this.h, ro2Var, obj, obj2);
    }

    @Override // defpackage.xc1
    public final boolean Q(ro2 ro2Var, oo2 oo2Var, oo2 oo2Var2) {
        return ju0.G0(this.f, ro2Var, oo2Var, oo2Var2);
    }
}
