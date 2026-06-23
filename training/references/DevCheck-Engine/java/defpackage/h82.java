package defpackage;

import androidx.media.RfwE.BIxeFreLLop;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;

/* loaded from: classes.dex */
public final class h82 extends w51 {
    public final ae0 b;
    public boolean f;
    public yb d = null;
    public ld0 e = null;
    public final int c = 1;

    public h82(ae0 ae0Var) {
        this.b = ae0Var;
    }

    @Override // defpackage.w51
    public final void a(Object obj) {
        ld0 ld0Var = (ld0) obj;
        if (this.d == null) {
            ae0 ae0Var = this.b;
            ae0Var.getClass();
            this.d = new yb(ae0Var);
        }
        yb ybVar = this.d;
        ybVar.getClass();
        ae0 ae0Var2 = ld0Var.y;
        if (ae0Var2 != null && ae0Var2 != ybVar.s) {
            c.b(ld0Var, "Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            return;
        }
        ybVar.b(new me0(6, ld0Var));
        if (ld0Var != this.e) {
            return;
        }
        this.e = null;
    }

    @Override // defpackage.w51
    public final void b() {
        yb ybVar = this.d;
        if (ybVar != null) {
            if (!this.f) {
                try {
                    this.f = true;
                    if (ybVar.i) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    ybVar.j = false;
                    ybVar.s.z(ybVar, true);
                } finally {
                    this.f = false;
                }
            }
            this.d = null;
        }
    }

    @Override // defpackage.w51
    public final void c(g82 g82Var) {
        if (g82Var.getId() != -1) {
            return;
        }
        p22.c(ILBLnlCHDVqsSN.wMvXr, this, BIxeFreLLop.wqxACYtbYIV);
    }
}
