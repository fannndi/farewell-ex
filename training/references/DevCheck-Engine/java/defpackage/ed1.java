package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public final class ed1 extends bk0 implements x90 {
    public final jw1 b;
    public final hi1 c;
    public final Socket d;
    public final Socket e;
    public final ai0 f;
    public final cb1 g;
    public final fh h;
    public ek0 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public ed1(jw1 jw1Var, gd1 gd1Var, hi1 hi1Var, Socket socket, Socket socket2, ai0 ai0Var, cb1 cb1Var, fh fhVar) {
        jw1Var.getClass();
        gd1Var.getClass();
        hi1Var.getClass();
        socket.getClass();
        socket2.getClass();
        cb1Var.getClass();
        fhVar.getClass();
        this.b = jw1Var;
        this.c = hi1Var;
        this.d = socket;
        this.e = socket2;
        this.f = ai0Var;
        this.g = cb1Var;
        this.h = fhVar;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(a41 a41Var, hi1 hi1Var, IOException iOException) {
        a41Var.getClass();
        hi1Var.getClass();
        iOException.getClass();
        if (hi1Var.b.type() != Proxy.Type.DIRECT) {
            x2 x2Var = hi1Var.f386a;
            x2Var.g.connectFailed(x2Var.h.h(), hi1Var.b.address(), iOException);
        }
        h70 h70Var = a41Var.y;
        synchronized (h70Var) {
            ((LinkedHashSet) h70Var.g).add(hi1Var);
        }
    }

    @Override // defpackage.bk0
    public final void a(ek0 ek0Var, ym1 ym1Var) {
        ym1Var.getClass();
        synchronized (this) {
            this.o = (ym1Var.f1239a & 8) != 0 ? ym1Var.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // defpackage.x90
    public final void b(dd1 dd1Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof pr1)) {
                    if (!(this.i != null) || (iOException instanceof vu)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                d(dd1Var.g, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                } else if (((pr1) iOException).g == j90.m) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i > 1) {
                        this.j = true;
                        this.l++;
                    }
                } else if (((pr1) iOException).g != j90.n || !dd1Var.w) {
                    this.j = true;
                    this.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bk0
    public final void c(lk0 lk0Var) {
        lk0Var.d(j90.m, null);
    }

    @Override // defpackage.x90
    public final void cancel() {
        rd2.b(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if (defpackage.y31.c(r5, (java.security.cert.X509Certificate) r8) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.x2 r9, java.util.List r10) {
        /*
            r8 = this;
            ok0 r0 = r9.h
            java.util.TimeZone r1 = defpackage.rd2.f888a
            java.util.ArrayList r1 = r8.p
            int r1 = r1.size()
            int r2 = r8.o
            r3 = 0
            if (r1 >= r2) goto Ld4
            boolean r1 = r8.j
            if (r1 == 0) goto L15
            goto Ld4
        L15:
            hi1 r1 = r8.c
            x2 r2 = r1.f386a
            x2 r4 = r1.f386a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L23
            goto Ld4
        L23:
            java.lang.String r2 = r0.d
            java.lang.String r5 = r0.d
            ok0 r6 = r4.h
            java.lang.String r6 = r6.d
            boolean r2 = defpackage.ym0.b(r2, r6)
            if (r2 == 0) goto L33
            goto Lc9
        L33:
            ek0 r2 = r8.i
            if (r2 != 0) goto L39
            goto Ld4
        L39:
            if (r10 == 0) goto Ld4
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L43
            goto Ld4
        L43:
            java.util.Iterator r10 = r10.iterator()
        L47:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Ld4
            java.lang.Object r2 = r10.next()
            hi1 r2 = (defpackage.hi1) r2
            java.net.Proxy r6 = r2.b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L47
            java.net.Proxy r6 = r1.b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L47
            java.net.InetSocketAddress r6 = r1.c
            java.net.InetSocketAddress r2 = r2.c
            boolean r2 = defpackage.ym0.b(r6, r2)
            if (r2 == 0) goto L47
            javax.net.ssl.HostnameVerifier r10 = r9.d
            y31 r1 = defpackage.y31.f1207a
            if (r10 == r1) goto L76
            goto Ld4
        L76:
            java.util.TimeZone r10 = defpackage.rd2.f888a
            ok0 r10 = r4.h
            int r0 = r0.e
            int r1 = r10.e
            if (r0 == r1) goto L81
            goto Ld4
        L81:
            java.lang.String r10 = r10.d
            boolean r10 = defpackage.ym0.b(r5, r10)
            ai0 r0 = r8.f
            if (r10 == 0) goto L8c
            goto Lab
        L8c:
            boolean r8 = r8.k
            if (r8 != 0) goto Ld4
            if (r0 == 0) goto Ld4
            java.util.List r8 = r0.a()
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto Ld4
            java.lang.Object r8 = r8.get(r3)
            r8.getClass()
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            boolean r8 = defpackage.y31.c(r5, r8)
            if (r8 == 0) goto Ld4
        Lab:
            so r8 = r9.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r0.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            java.util.List r9 = r0.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r5.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            java.util.Set r8 = r8.f945a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            if (r9 != 0) goto Lcb
        Lc9:
            r8 = 1
            return r8
        Lcb:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            defpackage.iy1.g(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld4
        Ld4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed1.e(x2, java.util.List):boolean");
    }

    @Override // defpackage.x90
    public final hi1 f() {
        return this.c;
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = rd2.f888a;
        long nanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        ek0 ek0Var = this.i;
        if (ek0Var != null) {
            synchronized (ek0Var) {
                if (ek0Var.l) {
                    return false;
                }
                if (ek0Var.t < ek0Var.s) {
                    if (nanoTime >= ek0Var.u) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        zc1 zc1Var = (zc1) this.h.i;
        socket.getClass();
        zc1Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !zc1Var.a();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // defpackage.x90
    public final void h() {
        synchronized (this) {
            this.j = true;
        }
    }

    public final void i() {
        this.q = System.nanoTime();
        cb1 cb1Var = this.g;
        if (cb1Var == cb1.l || cb1Var == cb1.m) {
            this.e.setSoTimeout(0);
            pg0 pg0Var = pg0.h;
            ub0 ub0Var = ub0.f1031a;
            jw1 jw1Var = this.b;
            jw1Var.getClass();
            yh yhVar = new yh();
            yhVar.g = jw1Var;
            yhVar.j = bk0.f88a;
            yhVar.k = ub0.f1031a;
            fh fhVar = this.h;
            String str = this.c.f386a.h.d;
            fhVar.getClass();
            str.getClass();
            yhVar.h = fhVar;
            yhVar.i = rd2.b + ' ' + str;
            yhVar.j = this;
            yhVar.k = ub0Var;
            ek0 ek0Var = new ek0(yhVar);
            this.i = ek0Var;
            ym1 ym1Var = ek0.F;
            this.o = (ym1Var.f1239a & 8) != 0 ? ym1Var.b[3] : Integer.MAX_VALUE;
            mk0 mk0Var = ek0Var.C;
            synchronized (mk0Var) {
                try {
                    if (mk0Var.j) {
                        throw new IOException(yttXLrAeLjN.qapFx);
                    }
                    Logger logger = mk0.l;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(rd2.c(">> CONNECTION " + vj0.f1088a.b(), new Object[0]));
                    }
                    mk0Var.g.A(vj0.f1088a);
                    mk0Var.g.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            mk0 mk0Var2 = ek0Var.C;
            ym1 ym1Var2 = ek0Var.w;
            mk0Var2.getClass();
            ym1Var2.getClass();
            synchronized (mk0Var2) {
                try {
                    if (mk0Var2.j) {
                        throw new IOException("closed");
                    }
                    mk0Var2.j(0, Integer.bitCount(ym1Var2.f1239a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & ym1Var2.f1239a) == 0) {
                            z = false;
                        }
                        if (z) {
                            mk0Var2.g.writeShort(i);
                            mk0Var2.g.writeInt(ym1Var2.b[i]);
                        }
                    }
                    mk0Var2.g.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (ek0Var.w.a() != 65535) {
                ek0Var.C.v(0, r7 - 65535);
            }
            iw1.b(ek0Var.m.d(), ek0Var.i, ek0Var.D);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        hi1 hi1Var = this.c;
        sb.append(hi1Var.f386a.h.d);
        sb.append(':');
        sb.append(hi1Var.f386a.h.e);
        sb.append(", proxy=");
        sb.append(hi1Var.b);
        sb.append(" hostAddress=");
        sb.append(hi1Var.c);
        sb.append(" cipherSuite=");
        ai0 ai0Var = this.f;
        sb.append(ai0Var != null ? ai0Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
