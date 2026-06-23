package defpackage;

/* loaded from: classes.dex */
public final class ku0 extends j70 {
    public final float p;

    public ku0(float f) {
        super(0);
        this.p = f - 0.001f;
    }

    @Override // defpackage.j70
    public final void k(float f, float f2, float f3, mn1 mn1Var) {
        double d = this.p;
        float sqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(sqrt, 2.0d));
        mn1Var.d(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2, 270.0f, 0.0f);
        mn1Var.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        mn1Var.c(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
    }
}
