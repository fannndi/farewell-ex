package defpackage;

/* loaded from: classes.dex */
public final class b22 extends c22 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c22 f62a;

    public b22(c22 c22Var) {
        this.f62a = c22Var;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() != 9) {
            return this.f62a.b(ro0Var);
        }
        ro0Var.M();
        return null;
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        if (obj == null) {
            to0Var.D();
        } else {
            this.f62a.c(to0Var, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f62a + "]";
    }
}
