package defpackage;

/* loaded from: classes.dex */
public final class v9 extends xc1 {
    public final /* synthetic */ w9 d;

    public v9(w9 w9Var) {
        this.d = w9Var;
    }

    @Override // defpackage.xc1
    public final boolean b(int i, int i2) {
        w9 w9Var = this.d;
        Object obj = w9Var.g.get(i);
        Object obj2 = w9Var.h.get(i2);
        if (obj != null && obj2 != null) {
            return ((kk1) w9Var.j.b.i).d(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // defpackage.xc1
    public final boolean c(int i, int i2) {
        w9 w9Var = this.d;
        Object obj = w9Var.g.get(i);
        Object obj2 = w9Var.h.get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((kk1) w9Var.j.b.i).e(obj, obj2);
    }

    @Override // defpackage.xc1
    public final Object r(int i, int i2) {
        w9 w9Var = this.d;
        Object obj = w9Var.g.get(i);
        Object obj2 = w9Var.h.get(i2);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        Object obj3 = w9Var.j.b.i;
        return null;
    }

    @Override // defpackage.xc1
    public final int s() {
        return this.d.h.size();
    }

    @Override // defpackage.xc1
    public final int t() {
        return this.d.g.size();
    }
}
