package defpackage;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class i21 implements gv {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f408a;

    public i21(ConnectivityManager connectivityManager) {
        this.f408a = connectivityManager;
    }

    @Override // defpackage.gv
    public final ln a(lw lwVar) {
        lwVar.getClass();
        return new ln(new bp(lwVar, this, null, 3), n80.g, -2, xl.g);
    }

    @Override // defpackage.gv
    public final boolean b(gc2 gc2Var) {
        gc2Var.getClass();
        lw lwVar = gc2Var.j;
        return (lwVar.a() == null && lwVar.f609a == r21.g) ? false : true;
    }

    @Override // defpackage.gv
    public final boolean c(gc2 gc2Var) {
        if (!b(gc2Var)) {
            return false;
        }
        c.n("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }
}
