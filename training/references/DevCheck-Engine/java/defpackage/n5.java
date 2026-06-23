package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class n5 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ a6 h;

    public /* synthetic */ n5(a6 a6Var, int i) {
        this.g = i;
        this.h = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.g;
        a6 a6Var = this.h;
        switch (i) {
            case 0:
                if ((a6Var.f0 & 1) != 0) {
                    a6Var.y(0);
                }
                if ((a6Var.f0 & rt0.x) != 0) {
                    a6Var.y(108);
                }
                a6Var.e0 = false;
                a6Var.f0 = 0;
                break;
            default:
                a6Var.B.showAtLocation(a6Var.A, 55, 0, 0);
                j82 j82Var = a6Var.D;
                if (j82Var != null) {
                    j82Var.b();
                }
                if (!a6Var.F || (viewGroup = a6Var.G) == null || !viewGroup.isLaidOut()) {
                    a6Var.A.setAlpha(1.0f);
                    a6Var.A.setVisibility(0);
                    break;
                } else {
                    a6Var.A.setAlpha(0.0f);
                    j82 b = y62.b(a6Var.A);
                    b.a(1.0f);
                    a6Var.D = b;
                    b.d(new p5(0, this));
                    break;
                }
        }
    }
}
