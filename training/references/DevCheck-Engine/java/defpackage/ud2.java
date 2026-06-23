package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ud2 implements fe2 {
    public final ee2 g;

    public ud2(Context context) {
        qz qzVar = new qz(context, false);
        ee2 a2 = ee2.a(le2.f585a);
        i8 i8Var = new i8();
        i8Var.g = qzVar;
        i8Var.h = a2;
        ee2 a3 = ee2.a(i8Var);
        this.g = ee2.a(new xi0(a3, ee2.a(new ud2(a3))));
    }

    public ud2(ee2 ee2Var) {
        this.g = ee2Var;
    }

    @Override // defpackage.ge2
    public /* bridge */ /* synthetic */ Object b() {
        return new ue2((qe2) this.g.b());
    }
}
