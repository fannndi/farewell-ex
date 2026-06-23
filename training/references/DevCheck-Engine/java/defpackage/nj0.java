package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nj0 {

    /* renamed from: a, reason: collision with root package name */
    public final wl f686a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = rt0.x;
    public pi0[] e = new pi0[8];
    public int f = 7;

    public nj0(wl wlVar) {
        this.f686a = wlVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                pi0 pi0Var = this.e[length];
                pi0Var.getClass();
                i -= pi0Var.c;
                int i4 = this.h;
                pi0 pi0Var2 = this.e[length];
                pi0Var2.getClass();
                this.h = i4 - pi0Var2.c;
                this.g--;
                i3++;
                length--;
            }
            pi0[] pi0VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(pi0VarArr, i5, pi0VarArr, i5 + i3, this.g);
            pi0[] pi0VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(pi0VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(pi0 pi0Var) {
        int i = pi0Var.c;
        int i2 = this.d;
        if (i > i2) {
            pi0[] pi0VarArr = this.e;
            u9.l0(pi0VarArr, null, 0, pi0VarArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        pi0[] pi0VarArr2 = this.e;
        if (i3 > pi0VarArr2.length) {
            pi0[] pi0VarArr3 = new pi0[pi0VarArr2.length * 2];
            System.arraycopy(pi0VarArr2, 0, pi0VarArr3, pi0VarArr2.length, pi0VarArr2.length);
            this.f = this.e.length - 1;
            this.e = pi0VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = pi0Var;
        this.g++;
        this.h += i;
    }

    public final void c(km kmVar) {
        kmVar.getClass();
        int[] iArr = pk0.f794a;
        int a2 = kmVar.a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < a2; i++) {
            byte d = kmVar.d(i);
            byte[] bArr = pd2.f785a;
            j2 += pk0.b[d & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int a3 = kmVar.a();
        wl wlVar = this.f686a;
        if (i2 >= a3) {
            e(kmVar.a(), 127, 0);
            wlVar.G(kmVar);
            return;
        }
        wl wlVar2 = new wl();
        int[] iArr2 = pk0.f794a;
        int a4 = kmVar.a();
        int i3 = 0;
        for (int i4 = 0; i4 < a4; i4++) {
            byte d2 = kmVar.d(i4);
            byte[] bArr2 = pd2.f785a;
            int i5 = d2 & 255;
            int i6 = pk0.f794a[i5];
            byte b = pk0.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                wlVar2.I((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            wlVar2.I((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        km i7 = wlVar2.i(wlVar2.h);
        e(i7.a(), 127, rt0.s);
        wlVar.G(i7);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            pi0 pi0Var = (pi0) arrayList.get(i4);
            km i5 = pi0Var.f791a.i();
            km kmVar = pi0Var.b;
            Integer num = (Integer) oj0.b.get(i5);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    pi0[] pi0VarArr = oj0.f740a;
                    if (ym0.b(pi0VarArr[intValue].b, kmVar)) {
                        i = i2;
                    } else if (ym0.b(pi0VarArr[i2].b, kmVar)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i6 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i6 >= length) {
                        break;
                    }
                    pi0 pi0Var2 = this.e[i6];
                    pi0Var2.getClass();
                    if (ym0.b(pi0Var2.f791a, i5)) {
                        pi0 pi0Var3 = this.e[i6];
                        pi0Var3.getClass();
                        if (ym0.b(pi0Var3.b, kmVar)) {
                            i2 = oj0.f740a.length + (i6 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i6 - this.f) + oj0.f740a.length;
                        }
                    }
                    i6++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, rt0.s);
            } else if (i == -1) {
                this.f686a.I(64);
                c(i5);
                c(kmVar);
                b(pi0Var);
            } else {
                km kmVar2 = pi0.d;
                i5.getClass();
                kmVar2.getClass();
                if (!i5.f(kmVar2, kmVar2.a()) || ym0.b(pi0.i, i5)) {
                    e(i, 63, 64);
                    c(kmVar);
                    b(pi0Var);
                } else {
                    e(i, 15, 0);
                    c(kmVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        wl wlVar = this.f686a;
        if (i < i2) {
            wlVar.I(i | i3);
            return;
        }
        wlVar.I(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            wlVar.I(128 | (i4 & 127));
            i4 >>>= 7;
        }
        wlVar.I(i4);
    }
}
