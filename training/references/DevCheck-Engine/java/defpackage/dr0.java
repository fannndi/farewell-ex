package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class dr0 {
    public static boolean q;
    public final e91 d;
    public final fh m;
    public q9 p;

    /* renamed from: a, reason: collision with root package name */
    public int f205a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public kp1[] n = new kp1[1000];
    public int o = 0;
    public q9[] g = new q9[32];

    public dr0() {
        s();
        fh fhVar = new fh(9);
        fhVar.h = new f81();
        fhVar.i = new f81();
        fhVar.j = new kp1[32];
        this.m = fhVar;
        e91 e91Var = new e91(fhVar);
        e91Var.f = new kp1[rt0.s];
        e91Var.g = new kp1[rt0.s];
        e91Var.h = 0;
        e91Var.i = new zf(9, e91Var);
        this.d = e91Var;
        this.p = new q9(fhVar);
    }

    public static int n(Object obj) {
        kp1 kp1Var = ((ev) obj).i;
        if (kp1Var != null) {
            return (int) (kp1Var.k + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final kp1 a(int i) {
        f81 f81Var = (f81) this.m.i;
        int i2 = f81Var.b;
        kp1 kp1Var = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = f81Var.f270a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            f81Var.b = i3;
            kp1Var = r4;
        }
        kp1 kp1Var2 = kp1Var;
        if (kp1Var2 == null) {
            kp1Var2 = new kp1(i);
            kp1Var2.r = i;
        } else {
            kp1Var2.c();
            kp1Var2.r = i;
        }
        int i4 = this.o;
        int i5 = this.f205a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f205a = i6;
            this.n = (kp1[]) Arrays.copyOf(this.n, i6);
        }
        kp1[] kp1VarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        kp1VarArr[i7] = kp1Var2;
        return kp1Var2;
    }

    public final void b(kp1 kp1Var, kp1 kp1Var2, int i, float f, kp1 kp1Var3, kp1 kp1Var4, int i2, int i3) {
        q9 l = l();
        if (kp1Var2 == kp1Var3) {
            l.d.g(kp1Var, 1.0f);
            l.d.g(kp1Var4, 1.0f);
            l.d.g(kp1Var2, -2.0f);
        } else {
            k9 k9Var = l.d;
            if (f == 0.5f) {
                k9Var.g(kp1Var, 1.0f);
                l.d.g(kp1Var2, -1.0f);
                l.d.g(kp1Var3, -1.0f);
                l.d.g(kp1Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                k9Var.g(kp1Var, -1.0f);
                l.d.g(kp1Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                k9Var.g(kp1Var4, -1.0f);
                l.d.g(kp1Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                k9Var.g(kp1Var, f2 * 1.0f);
                l.d.g(kp1Var2, f2 * (-1.0f));
                l.d.g(kp1Var3, (-1.0f) * f);
                l.d.g(kp1Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        if (r4.q <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d3, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        if (r4.q <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f2, code lost:
    
        if (r4.q <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ff, code lost:
    
        if (r4.q <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.q9 r18) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr0.c(q9):void");
    }

    public final void d(kp1 kp1Var, int i) {
        int i2 = kp1Var.i;
        if (i2 == -1) {
            kp1Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                kp1 kp1Var2 = ((kp1[]) this.m.j)[i3];
            }
            return;
        }
        if (i2 == -1) {
            q9 l = l();
            l.f826a = kp1Var;
            float f = i;
            kp1Var.k = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        q9 q9Var = this.g[i2];
        if (q9Var.e) {
            q9Var.b = i;
            return;
        }
        if (q9Var.d.d() == 0) {
            q9Var.e = true;
            q9Var.b = i;
            return;
        }
        q9 l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.g(kp1Var, 1.0f);
        } else {
            l2.b = i;
            l2.d.g(kp1Var, -1.0f);
        }
        c(l2);
    }

    public final void e(kp1 kp1Var, kp1 kp1Var2, int i, int i2) {
        if (i2 == 8 && kp1Var2.l && kp1Var.i == -1) {
            kp1Var.d(this, kp1Var2.k + i);
            return;
        }
        q9 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        k9 k9Var = l.d;
        if (z) {
            k9Var.g(kp1Var, 1.0f);
            l.d.g(kp1Var2, -1.0f);
        } else {
            k9Var.g(kp1Var, -1.0f);
            l.d.g(kp1Var2, 1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(kp1 kp1Var, kp1 kp1Var2, int i, int i2) {
        q9 l = l();
        kp1 m = m();
        m.j = 0;
        l.b(kp1Var, kp1Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(kp1 kp1Var, kp1 kp1Var2, int i, int i2) {
        q9 l = l();
        kp1 m = m();
        m.j = 0;
        l.c(kp1Var, kp1Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(q9 q9Var) {
        int i;
        if (q9Var.e) {
            q9Var.f826a.d(this, q9Var.b);
        } else {
            q9[] q9VarArr = this.g;
            int i2 = this.k;
            q9VarArr[i2] = q9Var;
            kp1 kp1Var = q9Var.f826a;
            kp1Var.i = i2;
            this.k = i2 + 1;
            kp1Var.e(this, q9Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.getClass();
                }
                q9 q9Var2 = this.g[i3];
                if (q9Var2 != null && q9Var2.e) {
                    q9Var2.f826a.d(this, q9Var2.b);
                    ((f81) this.m.h).b(q9Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        q9[] q9VarArr2 = this.g;
                        int i6 = i4 - 1;
                        q9 q9Var3 = q9VarArr2[i4];
                        q9VarArr2[i6] = q9Var3;
                        kp1 kp1Var2 = q9Var3.f826a;
                        if (kp1Var2.i == i4) {
                            kp1Var2.i = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            q9 q9Var = this.g[i];
            q9Var.f826a.k = q9Var.b;
        }
    }

    public final kp1 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        kp1 a2 = a(4);
        float[] fArr = a2.n;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a2.h = i2;
        a2.j = i;
        ((kp1[]) this.m.j)[i2] = a2;
        e91 e91Var = this.d;
        e91Var.i.h = a2;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.j] = 1.0f;
        e91Var.j(a2);
        return a2;
    }

    public final kp1 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof ev)) {
            return null;
        }
        ev evVar = (ev) obj;
        kp1 kp1Var = evVar.i;
        if (kp1Var == null) {
            evVar.k();
            kp1Var = evVar.i;
        }
        int i = kp1Var.h;
        fh fhVar = this.m;
        if (i != -1 && i <= this.c && ((kp1[]) fhVar.j)[i] != null) {
            return kp1Var;
        }
        if (i != -1) {
            kp1Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        kp1Var.h = i2;
        kp1Var.r = 1;
        ((kp1[]) fhVar.j)[i2] = kp1Var;
        return kp1Var;
    }

    public final q9 l() {
        Object obj;
        fh fhVar = this.m;
        f81 f81Var = (f81) fhVar.h;
        int i = f81Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = f81Var.f270a;
            obj = objArr[i2];
            objArr[i2] = null;
            f81Var.b = i2;
        } else {
            obj = null;
        }
        q9 q9Var = (q9) obj;
        if (q9Var == null) {
            return new q9(fhVar);
        }
        q9Var.f826a = null;
        q9Var.d.b();
        q9Var.b = 0.0f;
        q9Var.e = false;
        return q9Var;
    }

    public final kp1 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        kp1 a2 = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a2.h = i;
        ((kp1[]) this.m.j)[i] = a2;
        return a2;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (q9[]) Arrays.copyOf(this.g, i);
        fh fhVar = this.m;
        fhVar.j = (kp1[]) Arrays.copyOf((kp1[]) fhVar.j, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        e91 e91Var = this.d;
        if (e91Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(e91Var);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(e91Var);
                return;
            }
        }
        i();
    }

    public final void q(e91 e91Var) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            q9 q9Var = this.g[i];
            int i2 = 1;
            if (q9Var.f826a.r != 1) {
                float f = 0.0f;
                if (q9Var.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            q9 q9Var2 = this.g[i6];
                            if (q9Var2.f826a.r != i2 && !q9Var2.e && q9Var2.b < f) {
                                int d = q9Var2.d.d();
                                int i8 = 0;
                                while (i8 < d) {
                                    kp1 e = q9Var2.d.e(i8);
                                    float c = q9Var2.d.c(e);
                                    if (c > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = e.m[i9] / c;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = e.h;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            q9 q9Var3 = this.g[i4];
                            q9Var3.f826a.i = -1;
                            q9Var3.g(((kp1[]) this.m.j)[i5]);
                            kp1 kp1Var = q9Var3.f826a;
                            kp1Var.i = i4;
                            kp1Var.e(this, q9Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(e91Var);
        i();
    }

    public final void r(q9 q9Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            kp1 kp1Var = q9Var.f826a;
            if (kp1Var != null) {
                this.i[kp1Var.h] = true;
            }
            kp1 d = q9Var.d(this.i);
            if (d != null) {
                boolean[] zArr = this.i;
                int i4 = d.h;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k) {
                    q9 q9Var2 = this.g[i5];
                    if (q9Var2.f826a.r != 1 && !q9Var2.e) {
                        k9 k9Var = q9Var2.d;
                        int i7 = k9Var.h;
                        if (i7 != -1) {
                            for (int i8 = i; i7 != -1 && i8 < k9Var.f520a; i8++) {
                                if (k9Var.e[i7] == d.h) {
                                    z = true;
                                    break;
                                }
                                i7 = k9Var.f[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = q9Var2.d.c(d);
                            if (c < 0.0f) {
                                float f2 = (-q9Var2.b) / c;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    q9 q9Var3 = this.g[i6];
                    q9Var3.f826a.i = -1;
                    q9Var3.g(d);
                    kp1 kp1Var2 = q9Var3.f826a;
                    kp1Var2.i = i6;
                    kp1Var2.e(this, q9Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            q9 q9Var = this.g[i];
            if (q9Var != null) {
                ((f81) this.m.h).b(q9Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        fh fhVar;
        int i = 0;
        while (true) {
            fhVar = this.m;
            kp1[] kp1VarArr = (kp1[]) fhVar.j;
            if (i >= kp1VarArr.length) {
                break;
            }
            kp1 kp1Var = kp1VarArr[i];
            if (kp1Var != null) {
                kp1Var.c();
            }
            i++;
        }
        f81 f81Var = (f81) fhVar.i;
        kp1[] kp1VarArr2 = this.n;
        int i2 = this.o;
        f81Var.getClass();
        if (i2 > kp1VarArr2.length) {
            i2 = kp1VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            kp1 kp1Var2 = kp1VarArr2[i3];
            int i4 = f81Var.b;
            Object[] objArr = f81Var.f270a;
            if (i4 < objArr.length) {
                objArr[i4] = kp1Var2;
                f81Var.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((kp1[]) fhVar.j, (Object) null);
        this.c = 0;
        e91 e91Var = this.d;
        e91Var.h = 0;
        e91Var.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            q9 q9Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new q9(fhVar);
    }
}
