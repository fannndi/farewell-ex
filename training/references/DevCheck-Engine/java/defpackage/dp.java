package defpackage;

/* loaded from: classes.dex */
public final class dp extends cp {
    public final rb0 j;

    public dp(rb0 rb0Var, qx qxVar, int i, xl xlVar) {
        super(qxVar, i, xlVar);
        this.j = rb0Var;
    }

    @Override // defpackage.cp, defpackage.rb0
    public final Object a(tb0 tb0Var, dx dxVar) {
        int i = this.h;
        zx zxVar = zx.g;
        e42 e42Var = e42.f219a;
        if (i == -3) {
            qx d = dxVar.d();
            Boolean bool = Boolean.FALSE;
            int i2 = 2;
            ys ysVar = new ys(2);
            qx qxVar = this.g;
            qx o = !((Boolean) qxVar.m(bool, ysVar)).booleanValue() ? d.o(qxVar) : xc1.o(d, qxVar, false);
            if (ym0.b(o, d)) {
                Object a2 = this.j.a(tb0Var, dxVar);
                if (a2 != zxVar) {
                    a2 = e42Var;
                }
                if (a2 == zxVar) {
                    return a2;
                }
            } else {
                j70 j70Var = j70.i;
                if (ym0.b(o.r(j70Var), d.r(j70Var))) {
                    qx d2 = dxVar.d();
                    if (!(tb0Var instanceof xl1) && !(tb0Var instanceof a31)) {
                        tb0Var = new gc0(tb0Var, d2);
                    }
                    Object K = op0.K(o, tb0Var, sy1.b(o), new od(this, null, i2), dxVar);
                    if (K == zxVar) {
                        return K;
                    }
                }
            }
        }
        Object a3 = super.a(tb0Var, dxVar);
        return a3 == zxVar ? a3 : e42Var;
    }

    @Override // defpackage.cp
    public final Object c(na1 na1Var, dx dxVar) {
        Object a2 = this.j.a(new xl1(na1Var), dxVar);
        e42 e42Var = e42.f219a;
        zx zxVar = zx.g;
        if (a2 != zxVar) {
            a2 = e42Var;
        }
        return a2 == zxVar ? a2 : e42Var;
    }

    @Override // defpackage.cp
    public final cp d(qx qxVar, int i, xl xlVar) {
        return new dp(this.j, qxVar, i, xlVar);
    }

    @Override // defpackage.cp
    public final String toString() {
        return this.j + " -> " + super.toString();
    }
}
