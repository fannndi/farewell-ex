package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class hd1 {

    /* renamed from: a, reason: collision with root package name */
    public final dd1 f377a;
    public final ArrayList b;
    public final int c;
    public final oj d;
    public final yf e;
    public final int f;
    public final int g;
    public final int h;
    public final j70 i;
    public final so j;
    public final gm2 k;
    public final pg0 l;
    public final pg0 m;
    public final HostnameVerifier n;
    public final j70 o;
    public final ProxySelector p;
    public final boolean q;
    public final SocketFactory r;
    public final SSLSocketFactory s;
    public final X509TrustManager t;
    public final bw0 u;
    public int v;

    public hd1(dd1 dd1Var, ArrayList arrayList, int i, oj ojVar, yf yfVar, int i2, int i3, int i4, j70 j70Var, so soVar, gm2 gm2Var, pg0 pg0Var, pg0 pg0Var2, HostnameVerifier hostnameVerifier, j70 j70Var2, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, bw0 bw0Var) {
        j70Var.getClass();
        soVar.getClass();
        gm2Var.getClass();
        pg0Var.getClass();
        pg0Var2.getClass();
        hostnameVerifier.getClass();
        j70Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.f377a = dd1Var;
        this.b = arrayList;
        this.c = i;
        this.d = ojVar;
        this.e = yfVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = j70Var;
        this.j = soVar;
        this.k = gm2Var;
        this.l = pg0Var;
        this.m = pg0Var2;
        this.n = hostnameVerifier;
        this.o = j70Var2;
        this.p = proxySelector;
        this.q = z;
        this.r = socketFactory;
        this.s = sSLSocketFactory;
        this.t = x509TrustManager;
        this.u = bw0Var;
    }

    public static hd1 a(hd1 hd1Var, int i, oj ojVar, yf yfVar, int i2) {
        int i3 = (i2 & 1) != 0 ? hd1Var.c : i;
        oj ojVar2 = (i2 & 2) != 0 ? hd1Var.d : ojVar;
        yf yfVar2 = (i2 & 4) != 0 ? hd1Var.e : yfVar;
        int i4 = hd1Var.f;
        int i5 = hd1Var.g;
        int i6 = hd1Var.h;
        j70 j70Var = hd1Var.i;
        so soVar = hd1Var.j;
        gm2 gm2Var = hd1Var.k;
        pg0 pg0Var = hd1Var.l;
        pg0 pg0Var2 = hd1Var.m;
        HostnameVerifier hostnameVerifier = hd1Var.n;
        j70 j70Var2 = hd1Var.o;
        ProxySelector proxySelector = hd1Var.p;
        boolean z = hd1Var.q;
        SocketFactory socketFactory = hd1Var.r;
        SSLSocketFactory sSLSocketFactory = hd1Var.s;
        X509TrustManager x509TrustManager = hd1Var.t;
        bw0 bw0Var = hd1Var.u;
        yfVar2.getClass();
        j70Var.getClass();
        soVar.getClass();
        gm2Var.getClass();
        pg0Var.getClass();
        pg0Var2.getClass();
        hostnameVerifier.getClass();
        j70Var2.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new hd1(hd1Var.f377a, hd1Var.b, i3, ojVar2, yfVar2, i4, i5, i6, j70Var, soVar, gm2Var, pg0Var, pg0Var2, hostnameVerifier, j70Var2, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, bw0Var);
    }

    public final lg1 b(yf yfVar) {
        yfVar.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            c.n("Check failed.");
            return null;
        }
        this.v++;
        oj ojVar = this.d;
        if (ojVar != null) {
            jd1 e = ((z90) ojVar.c).e();
            ok0 ok0Var = (ok0) yfVar.b;
            e.getClass();
            ok0Var.getClass();
            ok0 ok0Var2 = e.i.h;
            if (ok0Var.e != ok0Var2.e || !ym0.b(ok0Var.d, ok0Var2.d)) {
                jw0.h("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.v != 1) {
                jw0.h("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        hd1 a2 = a(this, i2, null, yfVar, 2097146);
        xm0 xm0Var = (xm0) arrayList.get(i);
        lg1 a3 = xm0Var.a(a2);
        if (a3 == null) {
            throw new NullPointerException("interceptor " + xm0Var + " returned null");
        }
        if (ojVar == null || i2 >= arrayList.size() || a2.v == 1) {
            return a3;
        }
        jw0.h("network interceptor ", xm0Var, " must call proceed() exactly once");
        return null;
    }
}
