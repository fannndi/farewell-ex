package defpackage;

/* loaded from: classes.dex */
public final class tj2 implements Runnable {
    public final zj2 g;
    public final kk2 h;

    public tj2(zj2 zj2Var, kk2 kk2Var) {
        this.g = zj2Var;
        this.h = kk2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.g.g != this) {
            return;
        }
        kk2 kk2Var = this.h;
        if (zj2.l.J(this.g, this, zj2.f(kk2Var))) {
            zj2.h(this.g);
        }
    }
}
