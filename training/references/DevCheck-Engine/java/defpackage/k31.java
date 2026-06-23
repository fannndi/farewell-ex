package defpackage;

/* loaded from: classes.dex */
public final class k31 extends c22 {
    public static final j31 b = new j31(new k31(2), 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f511a;

    public k31(int i) {
        this.f511a = i;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        int Q = ro0Var.Q();
        int A = d51.A(Q);
        if (A == 5 || A == 6) {
            return iy1.a(this.f511a, ro0Var);
        }
        if (A == 8) {
            ro0Var.M();
            return null;
        }
        throw new no0("Expecting number, got: " + d51.B(Q) + "; at path " + ro0Var.v(false));
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        to0Var.J((Number) obj);
    }
}
