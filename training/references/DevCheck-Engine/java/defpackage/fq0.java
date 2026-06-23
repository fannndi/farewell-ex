package defpackage;

/* loaded from: classes.dex */
public final class fq0 {

    /* renamed from: a, reason: collision with root package name */
    public yp0 f300a;
    public bq0 b;

    public final void a(eq0 eq0Var, xp0 xp0Var) {
        yp0 a2 = xp0Var.a();
        yp0 yp0Var = this.f300a;
        yp0Var.getClass();
        if (a2.compareTo(yp0Var) < 0) {
            yp0Var = a2;
        }
        this.f300a = yp0Var;
        this.b.e(eq0Var, xp0Var);
        this.f300a = a2;
    }
}
