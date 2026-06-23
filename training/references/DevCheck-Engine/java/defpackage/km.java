package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public class km implements Serializable, Comparable {
    public static final km j = new km(new byte[0]);
    public final byte[] g;
    public transient int h;
    public transient String i;

    public km(byte[] bArr) {
        bArr.getClass();
        this.g = bArr;
    }

    public int a() {
        return this.g.length;
    }

    public String b() {
        byte[] bArr = this.g;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = rt0.d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte[] c() {
        return this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        km kmVar = (km) obj;
        kmVar.getClass();
        int a2 = a();
        int a3 = kmVar.a();
        int min = Math.min(a2, a3);
        for (int i = 0; i < min; i++) {
            int d = d(i) & 255;
            int d2 = kmVar.d(i) & 255;
            if (d != d2) {
                return d < d2 ? -1 : 1;
            }
        }
        if (a2 == a3) {
            return 0;
        }
        return a2 < a3 ? -1 : 1;
    }

    public byte d(int i) {
        return this.g[i];
    }

    public boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.g;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof km) {
            km kmVar = (km) obj;
            int a2 = kmVar.a();
            byte[] bArr = this.g;
            if (a2 == bArr.length && kmVar.e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(km kmVar, int i) {
        kmVar.getClass();
        return kmVar.e(0, this.g, 0, i);
    }

    public String g(Charset charset) {
        charset.getClass();
        return new String(this.g, charset);
    }

    public km h(int i, int i2) {
        if (i < 0) {
            c.m("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.g;
        if (i2 > bArr.length) {
            c.a(bArr.length, "endIndex > length(", 41);
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new km(u9.j0(bArr, i, i2));
        }
        c.m("endIndex < beginIndex");
        return null;
    }

    public int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.g);
        this.h = hashCode;
        return hashCode;
    }

    public km i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.g;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new km(copyOf);
            }
            i++;
        }
    }

    public final String j() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        byte[] c = c();
        c.getClass();
        String str2 = new String(c, lp.f601a);
        this.i = str2;
        return str2;
    }

    public void k(wl wlVar, int i) {
        wlVar.F(i, this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km.toString():java.lang.String");
    }
}
