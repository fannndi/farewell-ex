package defpackage;

import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import flar2.devcheck.nativebridge.xm.oWuW;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class fk0 implements y90 {
    public static final List g = rd2.j(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", oWuW.VPBSSIbCPYIgI});
    public static final List h = rd2.j(new String[]{GFUHKHDfiFuPm.DnqbnNQWBYwtDbZ, "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* renamed from: a, reason: collision with root package name */
    public final ed1 f284a;
    public final hd1 b;
    public final ek0 c;
    public volatile lk0 d;
    public final cb1 e;
    public volatile boolean f;

    public fk0(a41 a41Var, ed1 ed1Var, hd1 hd1Var, ek0 ek0Var) {
        a41Var.getClass();
        ek0Var.getClass();
        this.f284a = ed1Var;
        this.b = hd1Var;
        this.c = ek0Var;
        List list = a41Var.r;
        cb1 cb1Var = cb1.m;
        this.e = list.contains(cb1Var) ? cb1Var : cb1.l;
    }

    @Override // defpackage.y90
    public final lp1 a(lg1 lg1Var) {
        lk0 lk0Var = this.d;
        lk0Var.getClass();
        return lk0Var.n;
    }

    @Override // defpackage.y90
    public final void b(yf yfVar) {
        int i;
        lk0 lk0Var;
        boolean z;
        if (this.d != null) {
            return;
        }
        boolean z2 = ((xf1) yfVar.e) != null;
        ui0 ui0Var = (ui0) yfVar.d;
        ArrayList arrayList = new ArrayList(ui0Var.size() + 4);
        arrayList.add(new pi0(pi0.f, (String) yfVar.c));
        km kmVar = pi0.g;
        ok0 ok0Var = (ok0) yfVar.b;
        ok0Var.getClass();
        String b = ok0Var.b();
        String d = ok0Var.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new pi0(kmVar, b));
        String b2 = ui0Var.b("Host");
        if (b2 != null) {
            arrayList.add(new pi0(pi0.i, b2));
        }
        arrayList.add(new pi0(pi0.h, ok0Var.f742a));
        int size = ui0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String c = ui0Var.c(i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = c.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && ui0Var.e(i2).equals("trailers"))) {
                arrayList.add(new pi0(lowerCase, ui0Var.e(i2)));
            }
        }
        ek0 ek0Var = this.c;
        ek0Var.getClass();
        boolean z3 = !z2;
        synchronized (ek0Var.C) {
            synchronized (ek0Var) {
                try {
                    if (ek0Var.k > 1073741823) {
                        ek0Var.l(j90.m);
                    }
                    if (ek0Var.l) {
                        throw new vu();
                    }
                    i = ek0Var.k;
                    ek0Var.k = i + 2;
                    lk0Var = new lk0(i, ek0Var, z3, false, null);
                    z = !z2 || ek0Var.z >= ek0Var.A || lk0Var.j >= lk0Var.k;
                    if (lk0Var.i()) {
                        ek0Var.h.put(Integer.valueOf(i), lk0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ek0Var.C.m(z3, i, arrayList);
        }
        if (z) {
            ek0Var.C.flush();
        }
        this.d = lk0Var;
        boolean z4 = this.f;
        lk0 lk0Var2 = this.d;
        if (z4) {
            lk0Var2.getClass();
            lk0Var2.f(j90.n);
            rw.f("Canceled");
        } else {
            lk0Var2.getClass();
            lk0Var2.p.g(this.b.g);
            lk0 lk0Var3 = this.d;
            lk0Var3.getClass();
            lk0Var3.q.g(this.b.h);
        }
    }

    @Override // defpackage.y90
    public final void c() {
        lk0 lk0Var = this.d;
        lk0Var.getClass();
        lk0Var.o.close();
    }

    @Override // defpackage.y90
    public final void cancel() {
        this.f = true;
        lk0 lk0Var = this.d;
        if (lk0Var != null) {
            lk0Var.f(j90.n);
        }
    }

    @Override // defpackage.y90
    public final boolean d() {
        boolean z;
        lk0 lk0Var = this.d;
        if (lk0Var != null) {
            synchronized (lk0Var) {
                jk0 jk0Var = lk0Var.n;
                if (jk0Var.h) {
                    if (jk0Var.j.e()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.y90
    public final void e() {
        this.c.flush();
    }

    @Override // defpackage.y90
    public final gp1 f() {
        lk0 lk0Var = this.d;
        lk0Var.getClass();
        return lk0Var;
    }

    @Override // defpackage.y90
    public final x90 g() {
        return this.f284a;
    }

    @Override // defpackage.y90
    public final long h(lg1 lg1Var) {
        if (nk0.a(lg1Var)) {
            return rd2.d(lg1Var);
        }
        return 0L;
    }

    @Override // defpackage.y90
    public final ap1 i(yf yfVar, long j) {
        lk0 lk0Var = this.d;
        lk0Var.getClass();
        return lk0Var.o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r4 == false) goto L20;
     */
    @Override // defpackage.y90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kg1 j(boolean r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk0.j(boolean):kg1");
    }
}
