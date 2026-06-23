package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class cv implements hp1 {

    /* renamed from: a, reason: collision with root package name */
    public static final av f154a = new av();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, bv.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (bv.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // defpackage.hp1
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.hp1
    public final boolean b() {
        return b;
    }

    @Override // defpackage.hp1
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.hp1
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            q71 q71Var = q71.f821a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) j70.e(list).toArray(new String[0]));
        }
    }
}
