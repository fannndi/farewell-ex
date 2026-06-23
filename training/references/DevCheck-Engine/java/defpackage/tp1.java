package defpackage;

/* loaded from: classes.dex */
public final class tp1 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ up1 h;
    public final /* synthetic */ k20 i;

    public /* synthetic */ tp1(k20 k20Var, up1 up1Var, int i) {
        this.g = i;
        this.i = k20Var;
        this.h = up1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        up1 up1Var = this.h;
        k20 k20Var = this.i;
        switch (i) {
            case 0:
                if (k20Var.b.contains(up1Var)) {
                    d51.b(up1Var.c.M, up1Var.f1051a);
                    break;
                }
                break;
            default:
                k20Var.b.remove(up1Var);
                k20Var.c.remove(up1Var);
                break;
        }
    }
}
