package defpackage;

/* loaded from: classes.dex */
public abstract class hu {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f399a = new o1(6, "CLOSED");

    public static final Object a(nl1 nl1Var, long j, pf0 pf0Var) {
        while (true) {
            if (nl1Var.e >= j && !nl1Var.f()) {
                return nl1Var;
            }
            Object d = nl1Var.d();
            o1 o1Var = f399a;
            if (d == o1Var) {
                return o1Var;
            }
            nl1 nl1Var2 = (nl1) ((iu) d);
            if (nl1Var2 == null) {
                nl1Var2 = (nl1) pf0Var.f(Long.valueOf(nl1Var.e + 1), nl1Var);
                if (nl1Var.i(nl1Var2)) {
                    if (nl1Var.f()) {
                        nl1Var.h();
                    }
                }
            }
            nl1Var = nl1Var2;
        }
    }
}
