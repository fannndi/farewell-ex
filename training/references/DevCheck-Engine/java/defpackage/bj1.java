package defpackage;

import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;

/* loaded from: classes.dex */
public final class bj1 extends ex implements tb0 {
    public final tb0 j;
    public final qx k;
    public final int l;
    public qx m;
    public dx n;

    public bj1(tb0 tb0Var, qx qxVar) {
        super(nt.i, n80.g);
        this.j = tb0Var;
        this.k = qxVar;
        this.l = ((Number) qxVar.m(0, new ys(5))).intValue();
    }

    @Override // defpackage.qd, defpackage.ay
    public final ay c() {
        dx dxVar = this.n;
        if (dxVar instanceof ay) {
            return (ay) dxVar;
        }
        return null;
    }

    @Override // defpackage.ex, defpackage.dx
    public final qx d() {
        qx qxVar = this.m;
        return qxVar == null ? n80.g : qxVar;
    }

    @Override // defpackage.tb0
    public final Object k(Object obj, dx dxVar) {
        try {
            Object q = q(dxVar, obj);
            return q == zx.g ? q : e42.f219a;
        } catch (Throwable th) {
            this.m = new u50(dxVar.d(), th);
            throw th;
        }
    }

    @Override // defpackage.qd
    public final StackTraceElement m() {
        return null;
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        Throwable a2 = qg1.a(obj);
        if (a2 != null) {
            this.m = new u50(d(), a2);
        }
        dx dxVar = this.n;
        if (dxVar != null) {
            dxVar.g(obj);
        }
        return zx.g;
    }

    public final Object q(dx dxVar, Object obj) {
        qx d = dxVar.d();
        rn0 rn0Var = (rn0) d.r(pg0.k);
        if (rn0Var != null && !rn0Var.a()) {
            throw ((bo0) rn0Var).C();
        }
        qx qxVar = this.m;
        if (qxVar != d) {
            if (qxVar instanceof u50) {
                throw new IllegalStateException(bs1.U(hTYJVDOvZnZlYL.LJmizso + ((u50) qxVar).h + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) d.m(0, new ej1(0, this))).intValue() != this.l) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.k + ",\n\t\tbut emission happened in " + d + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.m = d;
        }
        this.n = dxVar;
        qf0 qf0Var = dj1.f196a;
        tb0 tb0Var = this.j;
        tb0Var.getClass();
        Object e = qf0Var.e(tb0Var, obj, this);
        if (!ym0.b(e, zx.g)) {
            this.n = null;
        }
        return e;
    }
}
