package defpackage;

/* loaded from: classes.dex */
public final class j71 extends op {
    @Override // defpackage.op
    public final rk0 e(int i) {
        if (i == 0) {
            return l();
        }
        return null;
    }

    @Override // defpackage.op
    public final e90 h(fj0 fj0Var) {
        return l().g((int) fj0Var.f283a);
    }

    public final k71 l() {
        return (k71) this.i.get(0);
    }

    public final float m() {
        float f = 0.0f;
        for (int i = 0; i < l().j.size(); i++) {
            f += ((l71) l().g(i)).g;
        }
        return f;
    }
}
