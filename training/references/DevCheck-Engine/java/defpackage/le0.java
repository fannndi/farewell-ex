package defpackage;

/* loaded from: classes.dex */
public abstract class le0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ke0 f584a = ke0.f530a;

    public static ke0 a(ld0 ld0Var) {
        while (ld0Var != null) {
            if (ld0Var.G()) {
                ld0Var.y();
            }
            ld0Var = ld0Var.B;
        }
        return f584a;
    }

    public static void b(y82 y82Var) {
        if (ae0.H(3)) {
            y82Var.g.getClass();
        }
    }

    public static final void c(ld0 ld0Var, String str) {
        ld0Var.getClass();
        str.getClass();
        b(new fe0(ld0Var, "Attempting to reuse fragment " + ld0Var + " with previous ID " + str));
        a(ld0Var).getClass();
    }
}
