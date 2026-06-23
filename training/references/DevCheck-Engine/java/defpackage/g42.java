package defpackage;

/* loaded from: classes.dex */
public final class g42 extends sx {
    public static final g42 i = new g42();

    @Override // defpackage.sx
    public final void D(qx qxVar, Runnable runnable) {
        c20.j.i.e(runnable, true, false);
    }

    @Override // defpackage.sx
    public final void E(qx qxVar, Runnable runnable) {
        c20.j.i.e(runnable, true, true);
    }

    @Override // defpackage.sx
    public final sx G(int i2) {
        ym0.c(i2);
        return i2 >= kw1.d ? this : super.G(i2);
    }

    @Override // defpackage.sx
    public final String toString() {
        return "Dispatchers.IO";
    }
}
