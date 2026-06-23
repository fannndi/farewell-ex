package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i61 extends un0 {
    public boolean o;

    public static void m(i61 i61Var, Executor executor, wn1 wn1Var) {
        if (i61Var.i instanceof n01) {
            i61Var.i = null;
        }
        i61Var.k = wn1Var;
        super.l(executor, new h61(i61Var, executor));
    }

    @Override // defpackage.un0
    public final void l(Executor executor, h61 h61Var) {
        rt0.l(null, new h61(this, executor));
    }

    public final rg1 o() {
        try {
            this.k = rt0.k();
            if (this.i instanceof n01) {
                this.i = new ArrayList();
            }
            rg1 e = e();
            if (!this.o || e != rg1.f) {
                return e;
            }
            this.o = false;
            return o();
        } catch (w21 unused) {
            close();
            return rg1.e;
        }
    }
}
