package defpackage;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class ke2 {

    /* renamed from: a, reason: collision with root package name */
    public final qe2 f532a;
    public final ue2 b;

    public ke2(qe2 qe2Var, ue2 ue2Var) {
        this.f532a = qe2Var;
        this.b = ue2Var;
    }

    public final xo2 a(bf2 bf2Var) {
        if (!TextUtils.isEmpty(null)) {
            try {
                te2 te2Var = new te2(this.b, bf2Var.f81a, Long.parseLong(null));
                xo2 xo2Var = new xo2();
                xo2Var.f(te2Var);
                return xo2Var;
            } catch (NumberFormatException e) {
                xo2 xo2Var2 = new xo2();
                xo2Var2.e(e);
                return xo2Var2;
            }
        }
        long j = bf2Var.f81a;
        Object[] objArr = {Long.valueOf(j)};
        qe2 qe2Var = this.f532a;
        qe2Var.f838a.b("warmUpIntegrityToken(%s)", objArr);
        nv1 nv1Var = new nv1();
        me2 me2Var = new me2(qe2Var, nv1Var, j, nv1Var);
        vd2 vd2Var = qe2Var.e;
        vd2Var.getClass();
        vd2Var.a().post(new gf2(vd2Var, nv1Var, nv1Var, me2Var));
        u40 u40Var = new u40(this, 12, bf2Var);
        xo2 xo2Var3 = nv1Var.f703a;
        xo2Var3.getClass();
        kj1 kj1Var = ov1.f761a;
        xo2 xo2Var4 = new xo2();
        xo2Var3.b.d(new ql2(kj1Var, u40Var, xo2Var4));
        xo2Var3.h();
        return xo2Var4;
    }
}
