package defpackage;

import com.google.android.material.bottomappbar.HaCM.rQcwh;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class uj0 implements y90 {
    public static final ui0 f;

    /* renamed from: a, reason: collision with root package name */
    public final a41 f1046a;
    public final x90 b;
    public final fh c;
    public int d;
    public final zp e;

    static {
        ui0 ui0Var = ui0.h;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 != 0) {
            c.m("Expected alternating header names and values");
            return;
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                c.m("Headers cannot be null");
                return;
            }
            strArr2[i2] = as1.s0(strArr[i2]).toString();
        }
        int z = je2.z(0, strArr2.length - 1, 2);
        if (z >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                op0.A(str);
                op0.B(str2, str);
                if (i == z) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        f = new ui0(strArr2);
    }

    public uj0(a41 a41Var, x90 x90Var, fh fhVar) {
        fhVar.getClass();
        this.f1046a = a41Var;
        this.b = x90Var;
        this.c = fhVar;
        this.e = new zp((zc1) fhVar.i);
    }

    @Override // defpackage.y90
    public final lp1 a(lg1 lg1Var) {
        yf yfVar = lg1Var.g;
        if (!nk0.a(lg1Var)) {
            return k((ok0) yfVar.b, 0L);
        }
        String b = lg1Var.l.b("Transfer-Encoding");
        if (b == null) {
            b = null;
        }
        if ("chunked".equalsIgnoreCase(b)) {
            ok0 ok0Var = (ok0) yfVar.b;
            if (this.d == 4) {
                this.d = 5;
                return new rj0(this, ok0Var);
            }
            jw0.m(this.d, "state: ");
            return null;
        }
        long d = rd2.d(lg1Var);
        if (d != -1) {
            return k((ok0) yfVar.b, d);
        }
        ok0 ok0Var2 = (ok0) yfVar.b;
        if (this.d != 4) {
            jw0.m(this.d, "state: ");
            return null;
        }
        this.d = 5;
        this.b.h();
        ok0Var2.getClass();
        return new tj0(this, ok0Var2);
    }

    @Override // defpackage.y90
    public final void b(yf yfVar) {
        Proxy.Type type = this.b.f().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((String) yfVar.c);
        sb.append(' ');
        ok0 ok0Var = (ok0) yfVar.b;
        if (ym0.b(ok0Var.f742a, "https") || type != Proxy.Type.HTTP) {
            String b = ok0Var.b();
            String d = ok0Var.d();
            if (d != null) {
                b = b + '?' + d;
            }
            sb.append(b);
        } else {
            sb.append(ok0Var);
        }
        sb.append(" HTTP/1.1");
        l((ui0) yfVar.d, sb.toString());
    }

    @Override // defpackage.y90
    public final void c() {
        ((yc1) this.c.j).flush();
    }

    @Override // defpackage.y90
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.y90
    public final boolean d() {
        return this.d == 6;
    }

    @Override // defpackage.y90
    public final void e() {
        ((yc1) this.c.j).flush();
    }

    @Override // defpackage.y90
    public final gp1 f() {
        return this.c;
    }

    @Override // defpackage.y90
    public final x90 g() {
        return this.b;
    }

    @Override // defpackage.y90
    public final long h(lg1 lg1Var) {
        if (!nk0.a(lg1Var)) {
            return 0L;
        }
        String b = lg1Var.l.b("Transfer-Encoding");
        if (b == null) {
            b = null;
        }
        if ("chunked".equalsIgnoreCase(b)) {
            return -1L;
        }
        return rd2.d(lg1Var);
    }

    @Override // defpackage.y90
    public final ap1 i(yf yfVar, long j) {
        if ("chunked".equalsIgnoreCase(((ui0) yfVar.d).b(rQcwh.XvEx))) {
            if (this.d == 1) {
                this.d = 2;
                return new qj0(this);
            }
            jw0.m(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            c.n("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = 2;
            return new p20(this);
        }
        jw0.m(this.d, "state: ");
        return null;
    }

    @Override // defpackage.y90
    public final kg1 j(boolean z) {
        zp zpVar = this.e;
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            jw0.m(this.d, "state: ");
            return null;
        }
        try {
            String t = ((fm) zpVar.c).t(zpVar.b);
            zpVar.b -= t.length();
            rg1 A = c3.A(t);
            int i2 = A.b;
            kg1 kg1Var = new kg1();
            kg1Var.b = (cb1) A.c;
            kg1Var.c = i2;
            kg1Var.d = (String) A.d;
            kg1Var.f = zpVar.f().d();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.d = 3;
                return kg1Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.d = 4;
                return kg1Var;
            }
            this.d = 3;
            return kg1Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.f().f386a.h.g()), e);
        }
    }

    public final sj0 k(ok0 ok0Var, long j) {
        if (this.d == 4) {
            this.d = 5;
            return new sj0(this, ok0Var, j);
        }
        jw0.m(this.d, "state: ");
        return null;
    }

    public final void l(ui0 ui0Var, String str) {
        ui0Var.getClass();
        if (this.d != 0) {
            jw0.m(this.d, "state: ");
            return;
        }
        fh fhVar = this.c;
        yc1 yc1Var = (yc1) fhVar.j;
        yc1Var.y(str);
        yc1Var.y("\r\n");
        int size = ui0Var.size();
        int i = 0;
        while (true) {
            yc1 yc1Var2 = (yc1) fhVar.j;
            if (i >= size) {
                yc1Var2.y("\r\n");
                this.d = 1;
                return;
            } else {
                yc1Var2.y(ui0Var.c(i));
                yc1Var2.y(": ");
                yc1Var2.y(ui0Var.e(i));
                yc1Var2.y("\r\n");
                i++;
            }
        }
    }
}
