package defpackage;

/* loaded from: classes.dex */
public final class dt1 implements qu {
    public final h70 g;

    public dt1(h70 h70Var) {
        this.g = h70Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((ft1) this.g.g).close();
    }

    @Override // defpackage.qu
    public final Object p(boolean z, pf0 pf0Var, ex exVar) {
        ft1 ft1Var = (ft1) this.g.g;
        ft1Var.getClass();
        return pf0Var.f(new ht1(new ct1(ft1Var.z())), exVar);
    }
}
