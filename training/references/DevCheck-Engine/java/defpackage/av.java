package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class av implements n20 {
    @Override // defpackage.n20
    public final boolean a(SSLSocket sSLSocket) {
        return cv.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.n20
    public final hp1 b(SSLSocket sSLSocket) {
        return new cv();
    }
}
