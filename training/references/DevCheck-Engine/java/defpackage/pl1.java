package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class pl1 extends km {
    public final transient byte[][] k;
    public final transient int[] l;

    public pl1(byte[][] bArr, int[] iArr) {
        super(km.j.g);
        this.k = bArr;
        this.l = iArr;
    }

    @Override // defpackage.km
    public final int a() {
        return this.l[this.k.length - 1];
    }

    @Override // defpackage.km
    public final String b() {
        return new km(l()).b();
    }

    @Override // defpackage.km
    public final byte[] c() {
        return l();
    }

    @Override // defpackage.km
    public final byte d(int i) {
        byte[][] bArr = this.k;
        int length = bArr.length - 1;
        int[] iArr = this.l;
        je2.g(iArr[length], i, 1L);
        int w = md2.w(this, i);
        return bArr[w][(i - (w == 0 ? 0 : iArr[w - 1])) + iArr[bArr.length + w]];
    }

    @Override // defpackage.km
    public final boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= a() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int w = md2.w(this, i);
            while (i < i4) {
                int[] iArr = this.l;
                int i5 = w == 0 ? 0 : iArr[w - 1];
                int i6 = iArr[w] - i5;
                byte[][] bArr2 = this.k;
                int i7 = iArr[bArr2.length + w];
                int min = Math.min(i4, i6 + i5) - i;
                int i8 = (i - i5) + i7;
                byte[] bArr3 = bArr2[w];
                bArr3.getClass();
                for (int i9 = 0; i9 < min; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += min;
                i += min;
                w++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.km
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof km)) {
            return false;
        }
        km kmVar = (km) obj;
        return kmVar.a() == a() && f(kmVar, a());
    }

    @Override // defpackage.km
    public final boolean f(km kmVar, int i) {
        kmVar.getClass();
        if (a() - i >= 0) {
            int w = md2.w(this, 0);
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int[] iArr = this.l;
                int i4 = w == 0 ? 0 : iArr[w - 1];
                int i5 = iArr[w] - i4;
                byte[][] bArr = this.k;
                int i6 = iArr[bArr.length + w];
                int min = Math.min(i, i5 + i4) - i2;
                if (kmVar.e(i3, bArr[w], (i2 - i4) + i6, min)) {
                    i3 += min;
                    i2 += min;
                    w++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.km
    public final String g(Charset charset) {
        charset.getClass();
        return new km(l()).g(charset);
    }

    @Override // defpackage.km
    public final km h(int i, int i2) {
        if (i < 0) {
            c.d(d51.p(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > a()) {
            throw new IllegalArgumentException(("endIndex=" + i2 + " > length(" + a() + ')').toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            c.d(d51.n(i2, i, "endIndex=", " < beginIndex="));
            return null;
        }
        if (i == 0 && i2 == a()) {
            return this;
        }
        if (i == i2) {
            return km.j;
        }
        int w = md2.w(this, i);
        int w2 = md2.w(this, i2 - 1);
        byte[][] bArr = this.k;
        byte[][] bArr2 = (byte[][]) u9.k0(bArr, w, w2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.l;
        if (w <= w2) {
            int i4 = w;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == w2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = w != 0 ? iArr2[w - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new pl1(bArr2, iArr);
    }

    @Override // defpackage.km
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.k;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.l;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.h = i3;
        return i3;
    }

    @Override // defpackage.km
    public final km i() {
        return new km(l()).i();
    }

    @Override // defpackage.km
    public final void k(wl wlVar, int i) {
        int w = md2.w(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.l;
            int i3 = w == 0 ? 0 : iArr[w - 1];
            int i4 = iArr[w] - i3;
            byte[][] bArr = this.k;
            int i5 = iArr[bArr.length + w];
            int min = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            ml1 ml1Var = new ml1(bArr[w], i6, i6 + min, true);
            ml1 ml1Var2 = wlVar.g;
            if (ml1Var2 == null) {
                ml1Var.g = ml1Var;
                ml1Var.f = ml1Var;
                wlVar.g = ml1Var;
            } else {
                ml1 ml1Var3 = ml1Var2.g;
                ml1Var3.getClass();
                ml1Var3.b(ml1Var);
            }
            i2 += min;
            w++;
        }
        wlVar.h += i;
    }

    public final byte[] l() {
        byte[] bArr = new byte[a()];
        byte[][] bArr2 = this.k;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.l;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            u9.h0(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.km
    public final String toString() {
        return new km(l()).toString();
    }
}
