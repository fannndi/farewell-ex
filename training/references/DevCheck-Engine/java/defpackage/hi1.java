package defpackage;

import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class hi1 {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f386a;
    public final Proxy b;
    public final InetSocketAddress c;

    public hi1(x2 x2Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.f386a = x2Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hi1)) {
            return false;
        }
        hi1 hi1Var = (hi1) obj;
        return hi1Var.f386a.equals(this.f386a) && hi1Var.b.equals(this.b) && ym0.b(hi1Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f386a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        ok0 ok0Var = this.f386a.h;
        String str = ok0Var.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : nd2.b(hostAddress);
        if (as1.c0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (ok0Var.e != inetSocketAddress.getPort() || str.equals(b)) {
            sb.append(":");
            sb.append(ok0Var.e);
        }
        if (!str.equals(b)) {
            if (this.b.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (b == null) {
                sb.append(yFbVsaLCWAtQC.ooZmnYXc);
            } else if (as1.c0(b, ':')) {
                sb.append("[");
                sb.append(b);
                sb.append("]");
            } else {
                sb.append(b);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
