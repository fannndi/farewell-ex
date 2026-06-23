package defpackage;

/* loaded from: classes.dex */
public final class hz extends ym0 {
    @Override // defpackage.ym0
    public final void j(mn1 mn1Var, float f, float f2) {
        float f3 = f2 * f;
        mn1Var.d(0.0f, f3, 180.0f, 90.0f);
        double d = f3;
        mn1Var.c((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
