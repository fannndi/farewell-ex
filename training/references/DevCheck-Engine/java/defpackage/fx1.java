package defpackage;

import flar2.devcheck.tests.TestActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class fx1 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ gx1 h;

    public /* synthetic */ fx1(gx1 gx1Var, int i) {
        this.g = i;
        this.h = gx1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        gx1 gx1Var = this.h;
        switch (i) {
            case 0:
                TestActivity.B(gx1Var.i, true);
                break;
            default:
                TestActivity.B(gx1Var.i, false);
                break;
        }
    }
}
