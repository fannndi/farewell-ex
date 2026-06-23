package defpackage;

import androidx.media.RfwE.BIxeFreLLop;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import java.net.Proxy;
import java.net.UnknownServiceException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class jd1 {

    /* renamed from: a, reason: collision with root package name */
    public final jw1 f476a;
    public final gd1 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final x2 i;
    public final h70 j;
    public final dd1 k;
    public final boolean l;
    public th2 m;
    public ki1 n;
    public hi1 o;
    public final j9 p;

    public jd1(jw1 jw1Var, gd1 gd1Var, int i, int i2, int i3, int i4, boolean z, boolean z2, x2 x2Var, h70 h70Var, dd1 dd1Var, yf yfVar) {
        jw1Var.getClass();
        gd1Var.getClass();
        h70Var.getClass();
        this.f476a = jw1Var;
        this.b = gd1Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = x2Var;
        this.j = h70Var;
        this.k = dd1Var;
        this.l = !ym0.b((String) yfVar.c, "GET");
        this.p = new j9();
    }

    public final boolean a(ed1 ed1Var) {
        ki1 ki1Var;
        hi1 hi1Var;
        if (this.p.isEmpty() && this.o == null) {
            if (ed1Var != null) {
                synchronized (ed1Var) {
                    hi1Var = null;
                    if (ed1Var.l == 0 && ed1Var.j && rd2.a(ed1Var.c.f386a.h, this.i.h)) {
                        hi1Var = ed1Var.c;
                    }
                }
                if (hi1Var != null) {
                    this.o = hi1Var;
                    return true;
                }
            }
            th2 th2Var = this.m;
            if ((th2Var == null || th2Var.g >= ((ArrayList) th2Var.h).size()) && (ki1Var = this.n) != null) {
                return ki1Var.a();
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ji1 b() {
        /*
            Method dump skipped, instructions count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd1.b():ji1");
    }

    public final ou c(hi1 hi1Var, ArrayList arrayList) {
        cb1 cb1Var = cb1.m;
        hi1Var.getClass();
        x2 x2Var = hi1Var.f386a;
        if (x2Var.c == null) {
            if (!x2Var.j.contains(xu.f)) {
                throw new UnknownServiceException(BIxeFreLLop.tYwzpag);
            }
            String str = hi1Var.f386a.h.d;
            q71 q71Var = q71.f821a;
            if (!q71.f821a.h(str)) {
                throw new UnknownServiceException(d51.y("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (x2Var.i.contains(cb1Var)) {
            throw new UnknownServiceException(YHJbtPFAANaPQ.jUoZHEqsfXERNzf);
        }
        yf yfVar = null;
        if (hi1Var.b.type() == Proxy.Type.HTTP) {
            x2 x2Var2 = hi1Var.f386a;
            if (x2Var2.c != null || x2Var2.i.contains(cb1Var)) {
                yh yhVar = new yh();
                ok0 ok0Var = hi1Var.f386a.h;
                ok0Var.getClass();
                yhVar.g = ok0Var;
                yhVar.b("CONNECT", null);
                x2 x2Var3 = hi1Var.f386a;
                yhVar.a("Host", rd2.h(x2Var3.h, true));
                yhVar.a("Proxy-Connection", IGQCApxXGMWo.BLPtZheKwKWYg);
                yhVar.a("User-Agent", "okhttp/5.4.0");
                yfVar = new yf(yhVar);
                mg1 mg1Var = ng1.g;
                ArrayList arrayList2 = new ArrayList(20);
                op0.A("Proxy-Authenticate");
                op0.B("OkHttp-Preemptive", "Proxy-Authenticate");
                int i = 0;
                while (i < arrayList2.size()) {
                    if ("Proxy-Authenticate".equalsIgnoreCase((String) arrayList2.get(i))) {
                        arrayList2.remove(i);
                        arrayList2.remove(i);
                        i -= 2;
                    }
                    i += 2;
                }
                arrayList2.add("Proxy-Authenticate");
                arrayList2.add(as1.s0("OkHttp-Preemptive").toString());
                new ui0((String[]) arrayList2.toArray(new String[0]));
                mg1Var.getClass();
                x2Var3.f.getClass();
            }
        }
        return new ou(this.f476a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, hi1Var, arrayList, yfVar, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003b, code lost:
    
        if ((r7.i != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vg1 d(defpackage.ou r11, java.util.List r12) {
        /*
            r10 = this;
            gd1 r0 = r10.b
            boolean r1 = r10.l
            x2 r2 = r10.i
            dd1 r3 = r10.k
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.e()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.d
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L21:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L69
            java.lang.Object r7 = r0.next()
            ed1 r7 = (defpackage.ed1) r7
            r7.getClass()
            monitor-enter(r7)
            if (r6 == 0) goto L41
            ek0 r9 = r7.i     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L3a
            r9 = r5
            goto L3b
        L3a:
            r9 = r4
        L3b:
            if (r9 != 0) goto L41
        L3d:
            r9 = r4
            goto L4c
        L3f:
            r10 = move-exception
            goto L67
        L41:
            boolean r9 = r7.e(r2, r12)     // Catch: java.lang.Throwable -> L3f
            if (r9 != 0) goto L48
            goto L3d
        L48:
            r3.b(r7)     // Catch: java.lang.Throwable -> L3f
            r9 = r5
        L4c:
            monitor-exit(r7)
            if (r9 == 0) goto L21
            boolean r9 = r7.g(r1)
            if (r9 == 0) goto L56
            goto L6a
        L56:
            monitor-enter(r7)
            r7.j = r5     // Catch: java.lang.Throwable -> L64
            java.net.Socket r8 = r3.j()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)
            if (r8 == 0) goto L21
            defpackage.rd2.b(r8)
            goto L21
        L64:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L67:
            monitor-exit(r7)
            throw r10
        L69:
            r7 = r8
        L6a:
            if (r7 != 0) goto L6d
            return r8
        L6d:
            if (r11 == 0) goto L7a
            hi1 r12 = r11.j
            r10.o = r12
            java.net.Socket r11 = r11.q
            if (r11 == 0) goto L7a
            defpackage.rd2.b(r11)
        L7a:
            dd1 r10 = r10.k
            m90 r10 = r10.j
            r10.getClass()
            vg1 r10 = new vg1
            r10.<init>(r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd1.d(ou, java.util.List):vg1");
    }
}
