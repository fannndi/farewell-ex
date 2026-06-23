package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class te2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f985a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ue2 c;

    public te2(ue2 ue2Var, long j, long j2) {
        this.f985a = j;
        this.b = j2;
        Objects.requireNonNull(ue2Var);
        this.c = ue2Var;
    }

    public final xo2 a(cf2 cf2Var) {
        qe2 qe2Var = this.c.f1038a;
        long j = this.b;
        qe2Var.f838a.b("requestExpressIntegrityToken(%s)", Long.valueOf(j));
        nv1 nv1Var = new nv1();
        ne2 ne2Var = new ne2(qe2Var, nv1Var, cf2Var, this.f985a, j, nv1Var);
        vd2 vd2Var = qe2Var.e;
        vd2Var.getClass();
        vd2Var.a().post(new gf2(vd2Var, nv1Var, nv1Var, ne2Var));
        return nv1Var.f703a;
    }
}
