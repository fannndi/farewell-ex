package defpackage;

/* loaded from: classes.dex */
public abstract class p implements ox {
    public final px g;

    public p(px pxVar) {
        this.g = pxVar;
    }

    @Override // defpackage.ox
    public final px getKey() {
        return this.g;
    }

    @Override // defpackage.qx
    public final Object m(Object obj, pf0 pf0Var) {
        return pf0Var.f(obj, this);
    }

    @Override // defpackage.qx
    public final /* bridge */ qx o(qx qxVar) {
        return bw0.w(this, qxVar);
    }

    @Override // defpackage.qx
    public /* bridge */ ox r(px pxVar) {
        return bw0.h(this, pxVar);
    }

    @Override // defpackage.qx
    public /* bridge */ qx v(px pxVar) {
        return bw0.t(this, pxVar);
    }
}
