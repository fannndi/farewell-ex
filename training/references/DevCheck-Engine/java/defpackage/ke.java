package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class ke implements b41 {
    public final /* synthetic */ pe g;

    public /* synthetic */ ke(pe peVar) {
        this.g = peVar;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.g.a(0);
    }

    @Override // defpackage.b41
    public gb2 v(View view, gb2 gb2Var) {
        int a2 = gb2Var.a();
        pe peVar = this.g;
        peVar.m = a2;
        peVar.n = gb2Var.b();
        peVar.o = gb2Var.c();
        peVar.e();
        return gb2Var;
    }
}
