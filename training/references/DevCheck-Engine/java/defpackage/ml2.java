package defpackage;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class ml2 {
    public static final Logger e = Logger.getLogger(ml2.class.getName());
    public static final boolean f = en2.e;

    /* renamed from: a, reason: collision with root package name */
    public my1 f641a;
    public final byte[] b;
    public final int c;
    public int d;

    public ml2(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            c.m(d51.n(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int p(String str) {
        int length;
        try {
            length = gn2.c(str);
        } catch (fn2 unused) {
            length = str.getBytes(zl2.f1280a).length;
        }
        return q(length) + length;
    }

    public static int q(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void b(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i);
            this.d += i;
        } catch (IndexOutOfBoundsException e2) {
            throw new nl2(this.d, this.c, i, e2);
        }
    }

    public final void c(int i, ll2 ll2Var) {
        m((i << 3) | 2);
        m(ll2Var.d());
        b(ll2Var.d(), ll2Var.h);
    }

    public final void d(int i, int i2) {
        m((i << 3) | 5);
        e(i2);
    }

    public final void e(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) (i & 255);
            bArr[i2 + 1] = (byte) ((i >> 8) & 255);
            bArr[i2 + 2] = (byte) ((i >> 16) & 255);
            bArr[i2 + 3] = (byte) ((i >> 24) & 255);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new nl2(i2, this.c, 4, e2);
        }
    }

    public final void f(int i, long j) {
        m((i << 3) | 1);
        g(j);
    }

    public final void g(long j) {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) (((int) j) & 255);
            bArr[i + 1] = (byte) (((int) (j >> 8)) & 255);
            bArr[i + 2] = (byte) (((int) (j >> 16)) & 255);
            bArr[i + 3] = (byte) (((int) (j >> 24)) & 255);
            bArr[i + 4] = (byte) (((int) (j >> 32)) & 255);
            bArr[i + 5] = (byte) (((int) (j >> 40)) & 255);
            bArr[i + 6] = (byte) (((int) (j >> 48)) & 255);
            bArr[i + 7] = (byte) (((int) (j >> 56)) & 255);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e2) {
            throw new nl2(i, this.c, 8, e2);
        }
    }

    public final void h(int i, int i2) {
        m(i << 3);
        i(i2);
    }

    public final void i(int i) {
        if (i >= 0) {
            m(i);
        } else {
            o(i);
        }
    }

    public final void j(int i, String str) {
        m((i << 3) | 2);
        int i2 = this.d;
        try {
            int q = q(str.length() * 3);
            int q2 = q(str.length());
            int i3 = this.c;
            byte[] bArr = this.b;
            if (q2 != q) {
                m(gn2.c(str));
                int i4 = this.d;
                this.d = gn2.b(str, bArr, i4, i3 - i4);
            } else {
                int i5 = i2 + q2;
                this.d = i5;
                int b = gn2.b(str, bArr, i5, i3 - i5);
                this.d = i2;
                m((b - i2) - q2);
                this.d = b;
            }
        } catch (fn2 e2) {
            this.d = i2;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(zl2.f1280a);
            try {
                int length = bytes.length;
                m(length);
                b(length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new nl2(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new nl2(e4);
        }
    }

    public final void k(int i, int i2) {
        m((i << 3) | i2);
    }

    public final void l(int i, int i2) {
        m(i << 3);
        m(i2);
    }

    public final void m(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.d;
            byte[] bArr = this.b;
            if (i2 == 0) {
                this.d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) ((i | rt0.s) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new nl2(this.d, this.c, 1, e2);
                }
            }
            throw new nl2(this.d, this.c, 1, e2);
        }
    }

    public final void n(int i, long j) {
        m(i << 3);
        o(j);
    }

    public final void o(long j) {
        boolean z = f;
        byte[] bArr = this.b;
        int i = this.c;
        if (!z || i - this.d < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.d;
                if (j2 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.d = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | rt0.s) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new nl2(this.d, i, 1, e2);
                    }
                }
                throw new nl2(this.d, i, 1, e2);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = (int) j;
            int i4 = this.d;
            if (j3 == 0) {
                this.d = i4 + 1;
                en2.c.h(bArr, en2.f + i4, (byte) i3);
                return;
            }
            this.d = i4 + 1;
            en2.c.h(bArr, en2.f + i4, (byte) ((i3 | rt0.s) & 255));
            j >>>= 7;
        }
    }
}
