package defpackage;

import Cwd.YSHrxiHkAFcciU;

/* loaded from: classes.dex */
public abstract class o extends bo0 implements dx, yx {
    public final qx k;

    public o(qx qxVar, boolean z) {
        super(z);
        L((rn0) qxVar.r(pg0.k));
        this.k = qxVar.o(this);
    }

    @Override // defpackage.bo0
    public final void K(pt ptVar) {
        op0.y(this.k, ptVar);
    }

    @Override // defpackage.bo0
    public final void T(Object obj) {
        if (!(obj instanceof ot)) {
            g0(obj);
        } else {
            ot otVar = (ot) obj;
            f0(otVar.f756a, ot.b.get(otVar) != 0);
        }
    }

    @Override // defpackage.dx
    public final qx d() {
        return this.k;
    }

    @Override // defpackage.yx
    public final qx f() {
        return this.k;
    }

    public void f0(Throwable th, boolean z) {
    }

    @Override // defpackage.dx
    public final void g(Object obj) {
        Throwable a2 = qg1.a(obj);
        if (a2 != null) {
            obj = new ot(a2, false);
        }
        Object P = P(obj);
        if (P == co0.b) {
            return;
        }
        q(P);
    }

    public void g0(Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0(cy cyVar, o oVar, pf0 pf0Var) {
        int ordinal = cyVar.ordinal();
        e42 e42Var = e42.f219a;
        if (ordinal == 0) {
            try {
                a50.a(ju0.T(((qd) pf0Var).l(this, oVar)), e42Var);
                return;
            } finally {
                g(new pg1(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                ju0.T(((qd) pf0Var).l(this, oVar)).g(e42Var);
                return;
            }
            if (ordinal != 3) {
                throw new pt();
            }
            try {
                qx qxVar = this.k;
                Object c = sy1.c(qxVar, null);
                try {
                    k32.g(2, pf0Var);
                    Object f = pf0Var.f(oVar, this);
                    if (f != zx.g) {
                        g(f);
                    }
                } finally {
                    sy1.a(qxVar, c);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // defpackage.bo0
    public final String x() {
        return getClass().getSimpleName().concat(YSHrxiHkAFcciU.jkdl);
    }
}
