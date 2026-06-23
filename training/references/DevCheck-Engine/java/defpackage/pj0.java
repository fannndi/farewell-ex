package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class pj0 implements lp1 {
    public final ok0 g;
    public final gd0 h;
    public boolean i;
    public final /* synthetic */ uj0 j;

    public pj0(uj0 uj0Var, ok0 ok0Var) {
        ok0Var.getClass();
        this.j = uj0Var;
        this.g = ok0Var;
        this.h = new gd0(((zc1) uj0Var.c.i).g.c());
    }

    public final void a(ui0 ui0Var) {
        a41 a41Var;
        pg0 pg0Var;
        ui0Var.getClass();
        uj0 uj0Var = this.j;
        int i = uj0Var.d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            jw0.b(uj0Var.d, "state: ");
            return;
        }
        gd0 gd0Var = this.h;
        bz1 bz1Var = gd0Var.e;
        gd0Var.e = bz1.d;
        bz1Var.a();
        bz1Var.b();
        uj0Var.d = 6;
        if (ui0Var.size() <= 0 || (a41Var = uj0Var.f1046a) == null || (pg0Var = a41Var.j) == null) {
            return;
        }
        nk0.b(pg0Var, this.g, ui0Var);
    }

    @Override // defpackage.lp1
    public final bz1 c() {
        return this.h;
    }

    @Override // defpackage.lp1
    public long g(long j, wl wlVar) {
        uj0 uj0Var = this.j;
        wlVar.getClass();
        try {
            return ((zc1) uj0Var.c.i).g(j, wlVar);
        } catch (IOException e) {
            uj0Var.b.h();
            this.a(uj0.f);
            throw e;
        }
    }
}
