package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class tl implements hp1 {

    /* renamed from: a, reason: collision with root package name */
    public static final rl f993a = new rl();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, sl.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // defpackage.hp1
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.hp1
    public final boolean b() {
        return b;
    }

    @Override // defpackage.hp1
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.hp1
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            q71 q71Var = q71.f821a;
            parameters.setApplicationProtocols((String[]) j70.e(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
