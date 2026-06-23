package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public final class sk implements NsdManager.ResolveListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk f941a;

    public sk(tk tkVar) {
        this.f941a = tkVar;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        String hostAddress;
        try {
            InetAddress host = nsdServiceInfo.getHost();
            if (host != null && (hostAddress = host.getHostAddress()) != null) {
                String serviceName = nsdServiceInfo.getServiceName();
                int port = nsdServiceInfo.getPort();
                tk tkVar = this.f941a;
                final uk ukVar = new uk(serviceName, tkVar.f991a, hostAddress, port);
                ((ConcurrentHashMap) tkVar.b.i).compute(hostAddress, new BiFunction() { // from class: rk
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        List list = (List) obj2;
                        if (list == null) {
                            list = new ArrayList();
                        }
                        list.add(uk.this);
                        return list;
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
