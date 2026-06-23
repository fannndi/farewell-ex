package defpackage;

/* loaded from: classes.dex */
public final class fi1 extends ym0 {
    @Override // defpackage.ym0
    public final void j(mn1 mn1Var, float f, float f2) {
        float f3 = f2 * f;
        mn1Var.d(0.0f, f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        in1 in1Var = new in1(0.0f, 0.0f, f4, f4);
        in1Var.f = 180.0f;
        in1Var.g = 90.0f;
        mn1Var.g.add(in1Var);
        gn1 gn1Var = new gn1(in1Var);
        mn1Var.a(180.0f);
        mn1Var.h.add(gn1Var);
        mn1Var.e = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        mn1Var.c = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        mn1Var.d = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
