package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class o20 implements hp1 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f713a;
    public hp1 b;

    public o20(n20 n20Var) {
        this.f713a = n20Var;
    }

    @Override // defpackage.hp1
    public final boolean a(SSLSocket sSLSocket) {
        return this.f713a.a(sSLSocket);
    }

    @Override // defpackage.hp1
    public final boolean b() {
        return true;
    }

    @Override // defpackage.hp1
    public final String c(SSLSocket sSLSocket) {
        hp1 e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.hp1
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        hp1 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized hp1 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.f713a.a(sSLSocket)) {
                this.b = this.f713a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
