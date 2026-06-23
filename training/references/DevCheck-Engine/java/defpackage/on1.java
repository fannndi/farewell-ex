package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class on1 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final on1 f749a = new on1();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static void a() {
        int i;
        boolean canBeSatisfiedBy;
        ArrayList arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    Iterator it = c.entrySet().iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        lf0 lf0Var = (lf0) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        on1 on1Var = f749a;
                        NetworkCapabilities networkCapabilities = d;
                        on1Var.getClass();
                        Boolean bool = f;
                        bool.getClass();
                        if (!bool.booleanValue()) {
                            canBeSatisfiedBy = networkRequest.canBeSatisfiedBy(networkCapabilities);
                            if (canBeSatisfiedBy) {
                                i = 1;
                            }
                        }
                        arrayList.add(new z51(lf0Var, i != 0 ? nw.f704a : new ow(7)));
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        z51 z51Var = (z51) obj;
                        ((lf0) z51Var.g).j((pw) z51Var.h);
                    }
                    return;
                }
                ai1 h = ai1.h();
                int i2 = ob2.f725a;
                h.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        ai1 h = ai1.h();
        int i = ob2.f725a;
        h.getClass();
        synchronized (b) {
            if (ym0.b(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        ai1 h = ai1.h();
        int i = ob2.f725a;
        h.getClass();
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        ai1 h = ai1.h();
        int i = ob2.f725a;
        h.getClass();
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((lf0) it.next()).j(new ow(7));
            }
        }
    }
}
