package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class q9 {
    public final k9 d;

    /* renamed from: a, reason: collision with root package name */
    public kp1 f826a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public q9(fh fhVar) {
        this.d = new k9(this, fhVar);
    }

    public final void a(dr0 dr0Var, int i) {
        kp1 j = dr0Var.j(i);
        k9 k9Var = this.d;
        k9Var.g(j, 1.0f);
        k9Var.g(dr0Var.j(i), -1.0f);
    }

    public final void b(kp1 kp1Var, kp1 kp1Var2, kp1 kp1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        k9 k9Var = this.d;
        if (z) {
            k9Var.g(kp1Var, 1.0f);
            k9Var.g(kp1Var2, -1.0f);
            k9Var.g(kp1Var3, -1.0f);
        } else {
            k9Var.g(kp1Var, -1.0f);
            k9Var.g(kp1Var2, 1.0f);
            k9Var.g(kp1Var3, 1.0f);
        }
    }

    public final void c(kp1 kp1Var, kp1 kp1Var2, kp1 kp1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        k9 k9Var = this.d;
        if (z) {
            k9Var.g(kp1Var, 1.0f);
            k9Var.g(kp1Var2, -1.0f);
            k9Var.g(kp1Var3, 1.0f);
        } else {
            k9Var.g(kp1Var, -1.0f);
            k9Var.g(kp1Var2, 1.0f);
            k9Var.g(kp1Var3, -1.0f);
        }
    }

    public kp1 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f826a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final kp1 f(boolean[] zArr, kp1 kp1Var) {
        int i;
        k9 k9Var = this.d;
        int d = k9Var.d();
        kp1 kp1Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f2 = k9Var.f(i2);
            if (f2 < 0.0f) {
                kp1 e = k9Var.e(i2);
                if ((zArr == null || !zArr[e.h]) && e != kp1Var && (((i = e.r) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    kp1Var2 = e;
                }
            }
        }
        return kp1Var2;
    }

    public final void g(kp1 kp1Var) {
        kp1 kp1Var2 = this.f826a;
        k9 k9Var = this.d;
        if (kp1Var2 != null) {
            k9Var.g(kp1Var2, -1.0f);
            this.f826a.i = -1;
            this.f826a = null;
        }
        float h = k9Var.h(kp1Var, true) * (-1.0f);
        this.f826a = kp1Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = k9Var.h;
        for (int i2 = 0; i != -1 && i2 < k9Var.f520a; i2++) {
            float[] fArr = k9Var.g;
            fArr[i] = fArr[i] / h;
            i = k9Var.f[i];
        }
    }

    public final void h(dr0 dr0Var, kp1 kp1Var, boolean z) {
        if (kp1Var.l) {
            k9 k9Var = this.d;
            float c = k9Var.c(kp1Var);
            this.b = (kp1Var.k * c) + this.b;
            k9Var.h(kp1Var, z);
            if (z) {
                kp1Var.b(this);
            }
            if (k9Var.d() == 0) {
                this.e = true;
                dr0Var.b = true;
            }
        }
    }

    public void i(dr0 dr0Var, q9 q9Var, boolean z) {
        k9 k9Var = this.d;
        k9Var.getClass();
        float c = k9Var.c(q9Var.f826a);
        k9Var.h(q9Var.f826a, z);
        k9 k9Var2 = q9Var.d;
        int d = k9Var2.d();
        for (int i = 0; i < d; i++) {
            kp1 e = k9Var2.e(i);
            k9Var.a(e, k9Var2.c(e) * c, z);
        }
        this.b = (q9Var.b * c) + this.b;
        if (z) {
            q9Var.f826a.b(this);
        }
        if (this.f826a == null || k9Var.d() != 0) {
            return;
        }
        this.e = true;
        dr0Var.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            kp1 r0 = r10.f826a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            kp1 r1 = r10.f826a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L3a
        L39:
            r1 = r3
        L3a:
            k9 r10 = r10.d
            int r5 = r10.d()
        L40:
            if (r3 >= r5) goto L9c
            kp1 r6 = r10.e(r3)
            if (r6 != 0) goto L49
            goto L99
        L49:
            float r7 = r10.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L99
        L52:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L66
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
        L64:
            float r7 = r7 * r9
            goto L76
        L66:
            if (r8 <= 0) goto L6f
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L76
        L6f:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = r0.concat(r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r4
        L99:
            int r3 = r3 + 1
            goto L40
        L9c:
            if (r1 != 0) goto La5
            java.lang.String r10 = "0.0"
            java.lang.String r10 = r0.concat(r10)
            return r10
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q9.toString():java.lang.String");
    }
}
