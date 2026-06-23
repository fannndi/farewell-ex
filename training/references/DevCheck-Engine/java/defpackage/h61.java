package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class h61 implements rn1 {
    public final /* synthetic */ i61 g;
    public final /* synthetic */ Executor h;

    public /* synthetic */ h61(i61 i61Var, Executor executor) {
        this.g = i61Var;
        this.h = executor;
    }

    @Override // defpackage.rn1
    public void a(wn1 wn1Var) {
        i61.m(this.g, this.h, wn1Var);
    }

    public void b(rg1 rg1Var) {
        i61 i61Var = this.g;
        if (i61Var.o && rg1Var == rg1.f) {
            i61Var.o = false;
            i61Var.l(this.h, null);
        }
    }
}
