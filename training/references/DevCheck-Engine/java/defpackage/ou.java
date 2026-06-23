package defpackage;

import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class ou implements ji1, x90 {

    /* renamed from: a, reason: collision with root package name */
    public final jw1 f758a;
    public final gd1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final dd1 h;
    public final jd1 i;
    public final hi1 j;
    public final List k;
    public final yf l;
    public final int m;
    public final boolean n;
    public volatile boolean o;
    public Socket p;
    public Socket q;
    public ai0 r;
    public cb1 s;
    public fh t;
    public ed1 u;

    public ou(jw1 jw1Var, gd1 gd1Var, int i, int i2, int i3, int i4, boolean z, dd1 dd1Var, jd1 jd1Var, hi1 hi1Var, List list, yf yfVar, int i5, boolean z2) {
        jw1Var.getClass();
        gd1Var.getClass();
        hi1Var.getClass();
        this.f758a = jw1Var;
        this.b = gd1Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = dd1Var;
        this.i = jd1Var;
        this.j = hi1Var;
        this.k = list;
        this.l = yfVar;
        this.m = i5;
        this.n = z2;
    }

    @Override // defpackage.ji1
    public final ji1 a() {
        return new ou(this.f758a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    @Override // defpackage.x90
    public final void b(dd1 dd1Var, IOException iOException) {
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0169  */
    @Override // defpackage.ji1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ii1 c() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou.c():ii1");
    }

    @Override // defpackage.ji1, defpackage.x90
    public final void cancel() {
        this.o = true;
        Socket socket = this.p;
        if (socket != null) {
            rd2.b(socket);
        }
    }

    @Override // defpackage.ji1
    public final ed1 d() {
        h70 h70Var = this.h.g.y;
        hi1 hi1Var = this.j;
        synchronized (h70Var) {
            hi1Var.getClass();
            ((LinkedHashSet) h70Var.g).remove(hi1Var);
        }
        ed1 ed1Var = this.u;
        ed1Var.getClass();
        this.j.getClass();
        vg1 d = this.i.d(this, this.k);
        if (d != null) {
            return d.f1085a;
        }
        synchronized (ed1Var) {
            gd1 gd1Var = this.b;
            gd1Var.getClass();
            TimeZone timeZone = rd2.f888a;
            gd1Var.d.add(ed1Var);
            gd1Var.b.c(gd1Var.c, 0L);
            this.h.b(ed1Var);
        }
        this.h.j.getClass();
        return ed1Var;
    }

    @Override // defpackage.ji1
    public final boolean e() {
        return this.s != null;
    }

    @Override // defpackage.x90
    public final hi1 f() {
        return this.j;
    }

    @Override // defpackage.ji1
    public final ii1 g() {
        Socket socket;
        Socket socket2;
        if (this.p != null) {
            c.n("TCP already connected");
            return null;
        }
        this.h.y.add(this);
        boolean z = false;
        try {
            try {
                m90 m90Var = this.h.j;
                InetSocketAddress inetSocketAddress = this.j.c;
                m90Var.getClass();
                inetSocketAddress.getClass();
                this.b.getClass();
                this.j.getClass();
                i();
                z = true;
                ii1 ii1Var = new ii1(this, (Throwable) null, 6);
                this.h.y.remove(this);
                return ii1Var;
            } catch (IOException e) {
                hi1 hi1Var = this.j;
                x2 x2Var = hi1Var.f386a;
                if (hi1Var.b.type() != Proxy.Type.DIRECT) {
                    x2 x2Var2 = this.j.f386a;
                    x2Var2.g.connectFailed(x2Var2.h.h(), this.j.b.address(), e);
                }
                m90 m90Var2 = this.h.j;
                InetSocketAddress inetSocketAddress2 = this.j.c;
                m90Var2.getClass();
                inetSocketAddress2.getClass();
                this.b.getClass();
                this.j.getClass();
                ii1 ii1Var2 = new ii1(this, e, 2);
                this.h.y.remove(this);
                if (!z && (socket2 = this.p) != null) {
                    rd2.b(socket2);
                }
                return ii1Var2;
            }
        } catch (Throwable th) {
            this.h.y.remove(this);
            if (!z && (socket = this.p) != null) {
                rd2.b(socket);
            }
            throw th;
        }
    }

    @Override // defpackage.x90
    public final void h() {
    }

    public final void i() {
        Socket createSocket;
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : nu.f701a[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = this.j.f386a.b.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(this.j.b);
        }
        this.p = createSocket;
        if (this.o) {
            rw.f(hTYJVDOvZnZlYL.BQAFbgMm);
            return;
        }
        createSocket.setSoTimeout(this.f);
        try {
            q71 q71Var = q71.f821a;
            q71.f821a.e(createSocket, this.j.c, this.e);
            try {
                this.t = new fh(new gr(createSocket));
            } catch (NullPointerException e) {
                if (ym0.b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, xu xuVar) {
        cb1 cb1Var;
        x2 x2Var = this.j.f386a;
        try {
            if (xuVar.b) {
                q71 q71Var = q71.f821a;
                q71.f821a.d(sSLSocket, x2Var.h.d, x2Var.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            ai0 p = pr.p(session);
            HostnameVerifier hostnameVerifier = x2Var.d;
            hostnameVerifier.getClass();
            boolean verify = hostnameVerifier.verify(x2Var.h.d, session);
            int i = 0;
            if (!verify) {
                List a2 = p.a();
                if (a2.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + x2Var.h.d + " not verified (no certificates)");
                }
                Object obj = a2.get(0);
                obj.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(x2Var.h.d);
                sb.append(" not verified:\n            |    certificate: ");
                so soVar = so.c;
                sb.append(xc1.E(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(yr.b0(y31.a(x509Certificate, 7), y31.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(bs1.V(sb.toString()));
            }
            so soVar2 = x2Var.e;
            soVar2.getClass();
            this.r = new ai0(p.f31a, p.b, p.c, new mu(i, soVar2, p, x2Var));
            x2Var.h.d.getClass();
            Iterator it = soVar2.f945a.iterator();
            String str = null;
            if (it.hasNext()) {
                iy1.g(it.next());
                throw null;
            }
            if (xuVar.b) {
                q71 q71Var2 = q71.f821a;
                str = q71.f821a.f(sSLSocket);
            }
            this.q = sSLSocket;
            this.t = new fh(new gr(sSLSocket));
            if (str != null) {
                cb1.h.getClass();
                cb1Var = ai1.f(str);
            } else {
                cb1Var = cb1.j;
            }
            this.s = cb1Var;
            q71 q71Var3 = q71.f821a;
            q71.f821a.getClass();
        } catch (Throwable th) {
            q71 q71Var4 = q71.f821a;
            q71.f821a.getClass();
            rd2.b(sSLSocket);
            throw th;
        }
    }

    public final ii1 k() {
        yf yfVar = this.l;
        yfVar.getClass();
        hi1 hi1Var = this.j;
        String str = "CONNECT " + rd2.h(hi1Var.f386a.h, true) + " HTTP/1.1";
        fh fhVar = this.t;
        if (fhVar == null) {
            ym0.A("socket");
            throw null;
        }
        uj0 uj0Var = new uj0(null, this, fhVar);
        fh fhVar2 = this.t;
        if (fhVar2 == null) {
            ym0.A("socket");
            throw null;
        }
        ((zc1) fhVar2.i).g.c().g(this.c);
        fh fhVar3 = this.t;
        if (fhVar3 == null) {
            ym0.A("socket");
            throw null;
        }
        ((yc1) fhVar3.j).g.c().g(this.d);
        uj0Var.l((ui0) yfVar.d, str);
        uj0Var.c();
        kg1 j = uj0Var.j(false);
        j.getClass();
        j.f534a = yfVar;
        lg1 a2 = j.a();
        int i = a2.j;
        long d = rd2.d(a2);
        if (d != -1) {
            sj0 k = uj0Var.k((ok0) a2.g.b, d);
            rd2.f(k, Integer.MAX_VALUE);
            k.close();
        }
        if (i == 200) {
            return new ii1(this, (Throwable) null, 6);
        }
        if (i != 407) {
            rw.f(d51.q("Unexpected response code for CONNECT: ", i));
            return null;
        }
        hi1Var.f386a.f.getClass();
        rw.f("Failed to authenticate with proxy");
        return null;
    }

    public final ou l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        list.getClass();
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            xu xuVar = (xu) list.get(i2);
            xuVar.getClass();
            if (xuVar.f1197a && (((strArr = xuVar.d) == null || pd2.e(strArr, sSLSocket.getEnabledProtocols(), p01.h)) && ((strArr2 = xuVar.c) == null || pd2.e(strArr2, sSLSocket.getEnabledCipherSuites(), lq.c)))) {
                return new ou(this.f758a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i2, i != -1);
            }
        }
        return null;
    }

    public final ou m(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.m != -1) {
            return this;
        }
        ou l = l(list, sSLSocket);
        if (l != null) {
            return l;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
