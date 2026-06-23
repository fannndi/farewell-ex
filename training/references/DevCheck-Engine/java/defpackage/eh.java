package defpackage;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import java.util.List;
import java.util.Objects;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class eh implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ eh(fh fhVar, dn dnVar, List list, int i) {
        this.g = 0;
        this.i = fhVar;
        this.j = dnVar;
        this.k = list;
        this.h = i;
    }

    public /* synthetic */ eh(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.g = i2;
        this.i = obj;
        this.j = obj2;
        this.h = i;
        this.k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        Object obj = this.k;
        int i2 = this.h;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                try {
                    ((fh) obj3).I((dn) obj2, (List) obj, i2);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                try {
                    ((IBinder[]) obj2)[0] = ((zh1) obj3).a((Intent) obj, i2);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            default:
                w42 w42Var = (w42) obj3;
                nb nbVar = (nb) obj2;
                Runnable runnable = (Runnable) obj;
                zi1 zi1Var = w42Var.f;
                int i3 = 1;
                try {
                    try {
                        zi1 zi1Var2 = w42Var.c;
                        Objects.requireNonNull(zi1Var2);
                        zi1Var.o(new t42(zi1Var2, i3));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) w42Var.f1113a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            zi1Var.o(new um0(w42Var, nbVar, i2));
                        } else {
                            w42Var.a(nbVar, i2);
                        }
                    } catch (ut1 unused3) {
                        w42Var.d.N(nbVar, i2 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }
}
