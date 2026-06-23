package defpackage;

/* loaded from: classes.dex */
public class mh0 extends nm1 {

    /* renamed from: a, reason: collision with root package name */
    public c22 f631a = null;

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        c22 c22Var = this.f631a;
        if (c22Var != null) {
            return c22Var.b(ro0Var);
        }
        c.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        c22 c22Var = this.f631a;
        if (c22Var != null) {
            c22Var.c(to0Var, obj);
        } else {
            c.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // defpackage.nm1
    public final c22 d() {
        c22 c22Var = this.f631a;
        if (c22Var != null) {
            return c22Var;
        }
        c.n("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
