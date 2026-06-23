package defpackage;

/* loaded from: classes.dex */
public abstract class a50 {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f9a = new o1(6, "UNDEFINED");
    public static final o1 b = new o1(6, "REUSABLE_CLAIMED");

    public static final void a(dx dxVar, Object obj) {
        if (!(dxVar instanceof z40)) {
            dxVar.g(obj);
            return;
        }
        z40 z40Var = (z40) dxVar;
        sx sxVar = z40Var.j;
        ex exVar = z40Var.k;
        Throwable a2 = qg1.a(obj);
        Object otVar = a2 == null ? obj : new ot(a2, false);
        if (sxVar.F(exVar.d())) {
            z40Var.l = otVar;
            z40Var.i = 1;
            sxVar.D(exVar.d(), z40Var);
            return;
        }
        n90 a3 = uy1.a();
        if (a3.i >= 4294967296L) {
            z40Var.l = otVar;
            z40Var.i = 1;
            a3.I(z40Var);
            return;
        }
        a3.J(true);
        try {
            rn0 rn0Var = (rn0) exVar.d().r(pg0.k);
            if (rn0Var == null || rn0Var.a()) {
                Object obj2 = z40Var.m;
                qx d = exVar.d();
                Object c = sy1.c(d, obj2);
                z32 K = c != sy1.f961a ? xc1.K(exVar, d, c) : null;
                try {
                    exVar.g(obj);
                } finally {
                    if (K == null || K.i0()) {
                        sy1.a(d, c);
                    }
                }
            } else {
                z40Var.g(new pg1(((bo0) rn0Var).C()));
            }
            while (a3.L()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
