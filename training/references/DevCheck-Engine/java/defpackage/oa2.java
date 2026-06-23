package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class oa2 extends ua2 {
    public final WindowInsets.Builder e;

    public oa2() {
        this.e = m32.i();
    }

    public oa2(gb2 gb2Var) {
        super(gb2Var);
        WindowInsets g = gb2Var.g();
        this.e = g != null ? m32.j(g) : m32.i();
    }

    @Override // defpackage.ua2
    public gb2 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        gb2 h = gb2.h(null, build);
        mm0[] mm0VarArr = this.b;
        db2 db2Var = h.f329a;
        db2Var.u(mm0VarArr);
        db2Var.t(null);
        db2Var.y(this.c);
        db2Var.z(this.d);
        return h;
    }

    @Override // defpackage.ua2
    public void e(mm0 mm0Var) {
        this.e.setMandatorySystemGestureInsets(mm0Var.e());
    }

    @Override // defpackage.ua2
    public void f(mm0 mm0Var) {
        this.e.setStableInsets(mm0Var.e());
    }

    @Override // defpackage.ua2
    public void g(mm0 mm0Var) {
        this.e.setSystemGestureInsets(mm0Var.e());
    }

    @Override // defpackage.ua2
    public void h(mm0 mm0Var) {
        this.e.setSystemWindowInsets(mm0Var.e());
    }

    @Override // defpackage.ua2
    public void i(mm0 mm0Var) {
        this.e.setTappableElementInsets(mm0Var.e());
    }
}
