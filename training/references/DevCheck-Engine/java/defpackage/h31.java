package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes.dex */
public final class h31 extends ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    public static final h31 f362a = new h31();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return tl2.z(Proxy.NO_PROXY);
        }
        c.m("uri must not be null");
        return null;
    }
}
