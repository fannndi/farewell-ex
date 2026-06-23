package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e91 extends q9 {
    public kp1[] f;
    public kp1[] g;
    public int h;
    public zf i;

    @Override // defpackage.q9
    public final kp1 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            kp1[] kp1VarArr = this.f;
            kp1 kp1Var = kp1VarArr[i2];
            if (!zArr[kp1Var.h]) {
                zf zfVar = this.i;
                zfVar.h = kp1Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((kp1) zfVar.h).n[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    kp1 kp1Var2 = kp1VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = kp1Var2.n[i3];
                            float f3 = ((kp1) zfVar.h).n[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.q9
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.q9
    public final void i(dr0 dr0Var, q9 q9Var, boolean z) {
        kp1 kp1Var = q9Var.f826a;
        if (kp1Var == null) {
            return;
        }
        float[] fArr = kp1Var.n;
        k9 k9Var = q9Var.d;
        int d = k9Var.d();
        for (int i = 0; i < d; i++) {
            kp1 e = k9Var.e(i);
            float f = k9Var.f(i);
            zf zfVar = this.i;
            zfVar.h = e;
            if (e.g) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((kp1) zfVar.h).n;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((kp1) zfVar.h).n[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((e91) zfVar.i).k((kp1) zfVar.h);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((kp1) zfVar.h).n[i3] = f4;
                    } else {
                        ((kp1) zfVar.h).n[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (q9Var.b * f) + this.b;
        }
        k(kp1Var);
    }

    public final void j(kp1 kp1Var) {
        int i;
        kp1[] kp1VarArr;
        int i2 = this.h + 1;
        kp1[] kp1VarArr2 = this.f;
        if (i2 > kp1VarArr2.length) {
            kp1[] kp1VarArr3 = (kp1[]) Arrays.copyOf(kp1VarArr2, kp1VarArr2.length * 2);
            this.f = kp1VarArr3;
            this.g = (kp1[]) Arrays.copyOf(kp1VarArr3, kp1VarArr3.length * 2);
        }
        kp1[] kp1VarArr4 = this.f;
        int i3 = this.h;
        kp1VarArr4[i3] = kp1Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && kp1VarArr4[i3].h > kp1Var.h) {
            int i5 = 0;
            while (true) {
                i = this.h;
                kp1VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                kp1VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(kp1VarArr, 0, i, new c4(10));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        kp1Var.g = true;
        kp1Var.a(this);
    }

    public final void k(kp1 kp1Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == kp1Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        kp1Var.g = false;
                        return;
                    } else {
                        kp1[] kp1VarArr = this.f;
                        int i3 = i + 1;
                        kp1VarArr[i] = kp1VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.q9
    public final String toString() {
        zf zfVar = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            zfVar.h = this.f[i];
            str = str + zfVar + " ";
        }
        return str;
    }
}
