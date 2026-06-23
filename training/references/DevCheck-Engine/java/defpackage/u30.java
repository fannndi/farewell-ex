package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u30 extends ProxySelector {
    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        try {
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector != null) {
                proxySelector.connectFailed(uri, socketAddress, iOException);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        try {
            ProxySelector proxySelector = ProxySelector.getDefault();
            return proxySelector == null ? Collections.singletonList(Proxy.NO_PROXY) : proxySelector.select(uri);
        } catch (Throwable unused) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
    }
}
