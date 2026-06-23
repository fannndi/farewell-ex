package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class cm0 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129a;
    public final Object b;

    public /* synthetic */ cm0(int i, Object obj) {
        this.f129a = i;
        this.b = obj;
    }

    public cm0(x20 x20Var) {
        this.f129a = 0;
        this.b = x20Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f129a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((e21) this.b).u();
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.f129a) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                network.getClass();
                if (network.equals(((q21) this.b).f.getActiveNetwork())) {
                    ai1 h = ai1.h();
                    int i = p21.f771a;
                    h.getClass();
                    q21 q21Var = (q21) this.b;
                    Object obj = q21Var.e;
                    if (obj == null) {
                        obj = q21Var.a();
                    }
                    o21 o21Var = (o21) obj;
                    q21 q21Var2 = (q21) this.b;
                    synchronized (q21Var2.g) {
                        if (q21Var2.h == z) {
                            return;
                        }
                        q21Var2.h = z;
                        ((q21) this.b).b(new o21(o21Var.f714a, o21Var.b, o21Var.c, o21Var.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f129a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                ai1 h = ai1.h();
                int i = ob2.f725a;
                h.getClass();
                ((x20) this.b).j(nw.f704a);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((e21) this.b).u();
                break;
            default:
                network.getClass();
                networkCapabilities.getClass();
                ai1 h2 = ai1.h();
                int i2 = p21.f771a;
                networkCapabilities.toString();
                h2.getClass();
                q21 q21Var = (q21) this.b;
                q21Var.b(p21.a(q21Var.f, q21Var.h));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = this.f129a;
        Object obj = this.b;
        switch (i) {
            case 0:
                network.getClass();
                ai1 h = ai1.h();
                int i2 = ob2.f725a;
                h.getClass();
                ((x20) obj).j(new ow(7));
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((e21) obj).u();
                break;
            default:
                network.getClass();
                ai1 h2 = ai1.h();
                int i3 = p21.f771a;
                h2.getClass();
                ((q21) obj).b(new o21(false, false, false, false, false));
                break;
        }
    }
}
