package defpackage;

/* loaded from: classes.dex */
public final class th0 extends o92 {
    @Override // defpackage.w20
    public final void a(w20 w20Var) {
        c30 c30Var = this.h;
        if (c30Var.c && !c30Var.j) {
            c30Var.d((int) ((((c30) c30Var.l.get(0)).g * ((sh0) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.o92
    public final void d() {
        iw iwVar = this.b;
        sh0 sh0Var = (sh0) iwVar;
        int i = sh0Var.r0;
        int i2 = sh0Var.s0;
        int i3 = sh0Var.u0;
        c30 c30Var = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c30Var.l.add(iwVar.T.d.h);
                this.b.T.d.h.k.add(c30Var);
                c30Var.f = i;
            } else if (i2 != -1) {
                c30Var.l.add(iwVar.T.d.i);
                this.b.T.d.i.k.add(c30Var);
                c30Var.f = -i2;
            } else {
                c30Var.b = true;
                c30Var.l.add(iwVar.T.d.i);
                this.b.T.d.i.k.add(c30Var);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            c30Var.l.add(iwVar.T.e.h);
            this.b.T.e.h.k.add(c30Var);
            c30Var.f = i;
        } else if (i2 != -1) {
            c30Var.l.add(iwVar.T.e.i);
            this.b.T.e.i.k.add(c30Var);
            c30Var.f = -i2;
        } else {
            c30Var.b = true;
            c30Var.l.add(iwVar.T.e.i);
            this.b.T.e.i.k.add(c30Var);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.o92
    public final void e() {
        iw iwVar = this.b;
        int i = ((sh0) iwVar).u0;
        c30 c30Var = this.h;
        if (i == 1) {
            iwVar.Y = c30Var.g;
        } else {
            iwVar.Z = c30Var.g;
        }
    }

    @Override // defpackage.o92
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.o92
    public final boolean k() {
        return false;
    }

    public final void m(c30 c30Var) {
        c30 c30Var2 = this.h;
        c30Var2.k.add(c30Var);
        c30Var.l.add(c30Var2);
    }
}
