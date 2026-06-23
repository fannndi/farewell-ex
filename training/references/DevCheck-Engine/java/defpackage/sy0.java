package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class sy0 implements yn, f92 {
    public final ao g;
    public final /* synthetic */ ty0 h;

    public sy0(ty0 ty0Var, ao aoVar) {
        this.h = ty0Var;
        this.g = aoVar;
    }

    @Override // defpackage.f92
    public final void a(nl1 nl1Var, int i) {
        this.g.a(nl1Var, i);
    }

    @Override // defpackage.dx
    public final qx d() {
        return this.g.k;
    }

    @Override // defpackage.dx
    public final void g(Object obj) {
        this.g.g(obj);
    }

    @Override // defpackage.yn
    public final void h(Object obj, qf0 qf0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ty0.p;
        ty0 ty0Var = this.h;
        atomicReferenceFieldUpdater.set(ty0Var, null);
        m mVar = new m(ty0Var, this);
        ao aoVar = this.g;
        aoVar.G(e42.f219a, aoVar.i, new zn(0, mVar));
    }

    @Override // defpackage.yn
    public final o1 i(Object obj, qf0 qf0Var) {
        ty0 ty0Var = this.h;
        zn znVar = new zn(ty0Var, this);
        o1 J = this.g.J((e42) obj, znVar);
        if (J != null) {
            ty0.p.set(ty0Var, null);
        }
        return J;
    }

    @Override // defpackage.yn
    public final void n(Object obj) {
        this.g.n(obj);
    }
}
