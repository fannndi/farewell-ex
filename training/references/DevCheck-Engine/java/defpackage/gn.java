package defpackage;

import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class gn implements xm0 {
    public static final gn b = new gn(0);
    public static final gn c = new gn(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f345a;

    public /* synthetic */ gn(int i) {
        this.f345a = i;
    }

    public static yf b(lg1 lg1Var, oj ojVar, hd1 hd1Var) {
        eu euVar;
        lg1 lg1Var2;
        hi1 hi1Var = ojVar != null ? ojVar.b().c : null;
        int i = lg1Var.j;
        String str = (String) lg1Var.g.c;
        if (i != 307 && i != 308) {
            if (i == 401) {
                hd1Var.i.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    lg1 lg1Var3 = lg1Var.q;
                    if ((lg1Var3 == null || lg1Var3.j != 503) && d(lg1Var, Integer.MAX_VALUE) == 0) {
                        return lg1Var.g;
                    }
                } else {
                    if (i == 407) {
                        hi1Var.getClass();
                        if (hi1Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        hd1Var.o.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (hd1Var.q && (((lg1Var2 = lg1Var.q) == null || lg1Var2.j != 408) && d(lg1Var, 0) <= 0)) {
                        return lg1Var.g;
                    }
                }
            } else if (ojVar != null && !ym0.b(((z90) ojVar.c).e().i.h.d, ((y90) ojVar.d).g().f().f386a.h.d)) {
                ed1 b2 = ojVar.b();
                synchronized (b2) {
                    b2.k = true;
                }
                return lg1Var.g;
            }
            return null;
        }
        if (hd1Var.f377a.g.h) {
            String b3 = lg1Var.l.b("Location");
            if (b3 == null) {
                b3 = null;
            }
            yf yfVar = lg1Var.g;
            if (b3 != null) {
                ok0 ok0Var = (ok0) yfVar.b;
                ok0Var.getClass();
                try {
                    euVar = new eu(1);
                    euVar.k(ok0Var, b3);
                } catch (IllegalArgumentException unused) {
                    euVar = null;
                }
                ok0 c2 = euVar != null ? euVar.c() : null;
                if (c2 != null && (ym0.b(c2.f742a, ((ok0) yfVar.b).f742a) || hd1Var.f377a.g.i)) {
                    yh i2 = yfVar.i();
                    if (bw0.u(str)) {
                        int i3 = lg1Var.j;
                        boolean z = str.equals("PROPFIND") || i3 == 308 || i3 == 307;
                        if (str.equals("PROPFIND") || i3 == 308 || i3 == 307) {
                            i2.b(str, z ? (xf1) yfVar.e : null);
                        } else {
                            i2.b("GET", null);
                        }
                        if (!z) {
                            ((ti0) i2.i).b("Transfer-Encoding");
                            ((ti0) i2.i).b("Content-Length");
                            ((ti0) i2.i).b("Content-Type");
                        }
                    }
                    if (!rd2.a((ok0) yfVar.b, c2)) {
                        ((ti0) i2.i).b("Authorization");
                    }
                    i2.g = c2;
                    return new yf(i2);
                }
            }
        }
        return null;
    }

    public static boolean c(IOException iOException, dd1 dd1Var, hd1 hd1Var, yf yfVar) {
        boolean z = iOException instanceof vu;
        if (!hd1Var.q) {
            return false;
        }
        if ((!z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        oj ojVar = dd1Var.x;
        if (ojVar == null || !ojVar.f739a) {
            return false;
        }
        z90 z90Var = dd1Var.n;
        z90Var.getClass();
        jd1 e = z90Var.e();
        oj ojVar2 = dd1Var.x;
        return e.a(ojVar2 != null ? ojVar2.b() : null);
    }

    public static int d(lg1 lg1Var, int i) {
        String b2 = lg1Var.l.b("Retry-After");
        if (b2 == null) {
            b2 = null;
        }
        if (b2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile(jYVJoqfHJs.QGxIzSr);
        compile.getClass();
        if (!compile.matcher(b2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b2);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:310:0x0746, code lost:
    
        if ("close".equalsIgnoreCase(r1 == null ? null : r1) != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018a, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x068a A[Catch: IOException -> 0x0657, TryCatch #2 {IOException -> 0x0657, blocks: (B:263:0x063d, B:265:0x0646, B:266:0x065a, B:270:0x0681, B:272:0x068a, B:274:0x0693, B:282:0x06ac, B:286:0x06bf, B:291:0x06cd, B:292:0x06d4, B:295:0x06d7, B:298:0x06e0, B:303:0x06ed, B:304:0x0724, B:306:0x0737, B:309:0x0742, B:316:0x075b, B:318:0x0768, B:319:0x078c, B:321:0x0748, B:322:0x070f), top: B:262:0x063d }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0693 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06bf A[Catch: IOException -> 0x0657, TryCatch #2 {IOException -> 0x0657, blocks: (B:263:0x063d, B:265:0x0646, B:266:0x065a, B:270:0x0681, B:272:0x068a, B:274:0x0693, B:282:0x06ac, B:286:0x06bf, B:291:0x06cd, B:292:0x06d4, B:295:0x06d7, B:298:0x06e0, B:303:0x06ed, B:304:0x0724, B:306:0x0737, B:309:0x0742, B:316:0x075b, B:318:0x0768, B:319:0x078c, B:321:0x0748, B:322:0x070f), top: B:262:0x063d }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06d7 A[Catch: IOException -> 0x0657, TryCatch #2 {IOException -> 0x0657, blocks: (B:263:0x063d, B:265:0x0646, B:266:0x065a, B:270:0x0681, B:272:0x068a, B:274:0x0693, B:282:0x06ac, B:286:0x06bf, B:291:0x06cd, B:292:0x06d4, B:295:0x06d7, B:298:0x06e0, B:303:0x06ed, B:304:0x0724, B:306:0x0737, B:309:0x0742, B:316:0x075b, B:318:0x0768, B:319:0x078c, B:321:0x0748, B:322:0x070f), top: B:262:0x063d }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0737 A[Catch: IOException -> 0x0657, TryCatch #2 {IOException -> 0x0657, blocks: (B:263:0x063d, B:265:0x0646, B:266:0x065a, B:270:0x0681, B:272:0x068a, B:274:0x0693, B:282:0x06ac, B:286:0x06bf, B:291:0x06cd, B:292:0x06d4, B:295:0x06d7, B:298:0x06e0, B:303:0x06ed, B:304:0x0724, B:306:0x0737, B:309:0x0742, B:316:0x075b, B:318:0x0768, B:319:0x078c, B:321:0x0748, B:322:0x070f), top: B:262:0x063d }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0795  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v17, types: [y90] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.util.ArrayList] */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lg1 a(defpackage.hd1 r41) {
        /*
            Method dump skipped, instructions count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn.a(hd1):lg1");
    }
}
