package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class hj1 extends ij1 implements Iterator {
    public gj1 g;
    public boolean h = true;
    public final /* synthetic */ jj1 i;

    public hj1(jj1 jj1Var) {
        this.i = jj1Var;
    }

    @Override // defpackage.ij1
    public final void a(gj1 gj1Var) {
        gj1 gj1Var2 = this.g;
        if (gj1Var == gj1Var2) {
            gj1 gj1Var3 = gj1Var2.j;
            this.g = gj1Var3;
            this.h = gj1Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.h) {
            return this.i.g != null;
        }
        gj1 gj1Var = this.g;
        return (gj1Var == null || gj1Var.i == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.h) {
            this.h = false;
            this.g = this.i.g;
        } else {
            gj1 gj1Var = this.g;
            this.g = gj1Var != null ? gj1Var.i : null;
        }
        return this.g;
    }
}
