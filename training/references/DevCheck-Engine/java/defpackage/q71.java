package defpackage;

import android.os.Build;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public abstract class q71 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile q71 f821a;
    public static final Logger b;

    static {
        try {
            for (Map.Entry entry : v3.b.entrySet()) {
                v3.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException unused) {
            System.err.getClass();
        } catch (UnsatisfiedLinkError unused2) {
            System.err.getClass();
        }
        q71 p3Var = p3.e ? new p3() : null;
        if (p3Var == null) {
            p3Var = y3.e ? new y3() : null;
        }
        if (p3Var == null) {
            jw0.b(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was ");
        } else {
            f821a = p3Var;
            b = Logger.getLogger(a41.class.getName());
        }
    }

    public abstract bw0 c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public abstract String f(SSLSocket sSLSocket);

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean h(String str);

    public abstract void i(int i, String str);

    public void j(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str);
    }

    public abstract SSLContext k();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
