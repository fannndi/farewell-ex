package defpackage;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final /* synthetic */ class mu implements af0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ mu(int i, Object obj, Object obj2, Object obj3) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    @Override // defpackage.af0
    public final Object a() {
        int i = this.g;
        Object obj = this.j;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                bw0 bw0Var = ((so) obj3).b;
                bw0Var.getClass();
                return bw0Var.d(((x2) obj).h.d, ((ai0) obj2).a());
            default:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                cm0 cm0Var = (cm0) obj;
                if (((ye1) obj3).g) {
                    ai1 h = ai1.h();
                    int i2 = ob2.f725a;
                    h.getClass();
                    connectivityManager.unregisterNetworkCallback(cm0Var);
                }
                return e42.f219a;
        }
    }
}
