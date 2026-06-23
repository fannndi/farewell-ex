package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class fj1 extends ij1 implements Iterator {
    public gj1 g;
    public gj1 h;
    public final /* synthetic */ int i;

    public fj1(gj1 gj1Var, gj1 gj1Var2, int i) {
        this.i = i;
        this.g = gj1Var2;
        this.h = gj1Var;
    }

    @Override // defpackage.ij1
    public final void a(gj1 gj1Var) {
        gj1 gj1Var2;
        gj1 gj1Var3 = null;
        if (this.g == gj1Var && gj1Var == this.h) {
            this.h = null;
            this.g = null;
        }
        gj1 gj1Var4 = this.g;
        if (gj1Var4 == gj1Var) {
            switch (this.i) {
                case 0:
                    gj1Var2 = gj1Var4.j;
                    break;
                default:
                    gj1Var2 = gj1Var4.i;
                    break;
            }
            this.g = gj1Var2;
        }
        gj1 gj1Var5 = this.h;
        if (gj1Var5 == gj1Var) {
            gj1 gj1Var6 = this.g;
            if (gj1Var5 != gj1Var6 && gj1Var6 != null) {
                gj1Var3 = b(gj1Var5);
            }
            this.h = gj1Var3;
        }
    }

    public final gj1 b(gj1 gj1Var) {
        switch (this.i) {
            case 0:
                return gj1Var.i;
            default:
                return gj1Var.j;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        gj1 gj1Var = this.h;
        gj1 gj1Var2 = this.g;
        this.h = (gj1Var == gj1Var2 || gj1Var2 == null) ? null : b(gj1Var);
        return gj1Var;
    }
}
