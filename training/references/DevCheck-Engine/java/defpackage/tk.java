package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* loaded from: classes.dex */
public final class tk implements NsdManager.DiscoveryListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f991a;
    public final /* synthetic */ fh b;

    public tk(fh fhVar, String str) {
        this.b = fhVar;
        this.f991a = str;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        ((NsdManager) this.b.h).resolveService(nsdServiceInfo, new sk(this));
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        try {
            ((NsdManager) this.b.h).stopServiceDiscovery(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        try {
            ((NsdManager) this.b.h).stopServiceDiscovery(this);
        } catch (Exception unused) {
        }
    }
}
