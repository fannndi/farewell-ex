package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class p3 extends q71 implements zw {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public p3() {
        int i = 0;
        ArrayList n0 = u9.n0(new hp1[]{Build.VERSION.SDK_INT >= 29 ? new q3() : null, new o20(z3.e), new o20(cv.f154a), new o20(tl.f993a)});
        ArrayList arrayList = new ArrayList();
        int size = n0.size();
        while (i < size) {
            Object obj = n0.get(i);
            i++;
            if (((hp1) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.zw
    public final void a(Context context) {
        this.c = context;
    }

    @Override // defpackage.zw
    public final Context b() {
        return this.c;
    }

    @Override // defpackage.q71
    public final bw0 c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        r3 r3Var = x509TrustManagerExtensions != null ? new r3(x509TrustManager, x509TrustManagerExtensions) : null;
        if (r3Var != null) {
            return r3Var;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new te(new we((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // defpackage.q71
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((hp1) obj).a(sSLSocket)) {
                break;
            }
        }
        hp1 hp1Var = (hp1) obj;
        if (hp1Var != null) {
            hp1Var.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.q71
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((hp1) obj).a(sSLSocket)) {
                break;
            }
        }
        hp1 hp1Var = (hp1) obj;
        if (hp1Var != null) {
            return hp1Var.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.q71
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard h = s0.h();
        h.open("response.body().close()");
        return h;
    }

    @Override // defpackage.q71
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.q71
    public final void i(int i, String str) {
        if (i == 5) {
            boolean z = y3.e;
        } else {
            boolean z2 = y3.e;
        }
    }

    @Override // defpackage.q71
    public final void j(String str, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            super.j(str, obj);
        } else {
            obj.getClass();
            s0.i(obj).warnIfOpen();
        }
    }

    @Override // defpackage.q71
    public final SSLContext k() {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance(hTYJVDOvZnZlYL.mcolBenlRWQR);
        sSLContext.getClass();
        return sSLContext;
    }
}
