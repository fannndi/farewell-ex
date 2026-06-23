package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class ll2 implements Iterable, Serializable {
    public static final ll2 i = new ll2(zl2.b);
    public int g = 0;
    public final byte[] h;

    static {
        int i2 = fl2.f287a;
    }

    public ll2(byte[] bArr) {
        bArr.getClass();
        this.h = bArr;
    }

    public static int e(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            c.g(d51.p(i2, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i3 < i2) {
            c.g(d51.n(i2, i3, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        c.g(d51.n(i3, i4, "End index: ", " >= "));
        return 0;
    }

    public static ll2 f(byte[] bArr, int i2, int i3) {
        e(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new ll2(bArr2);
    }

    public byte b(int i2) {
        return this.h[i2];
    }

    public byte c(int i2) {
        return this.h[i2];
    }

    public int d() {
        return this.h.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ll2) && d() == ((ll2) obj).d()) {
            if (d() == 0) {
                return true;
            }
            if (!(obj instanceof ll2)) {
                return obj.equals(this);
            }
            ll2 ll2Var = (ll2) obj;
            int i2 = this.g;
            int i3 = ll2Var.g;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                int d = d();
                if (d > ll2Var.d()) {
                    throw new IllegalArgumentException("Length too large: " + d + d());
                }
                if (d > ll2Var.d()) {
                    c.m(d51.n(d, ll2Var.d(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = ll2Var.h;
                int i4 = 0;
                int i5 = 0;
                while (i4 < d) {
                    if (this.h[i4] == bArr[i5]) {
                        i4++;
                        i5++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        int d = d();
        int i3 = d;
        for (int i4 = 0; i4 < d; i4++) {
            i3 = (i3 * 31) + this.h[i4];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.g = i3;
        return i3;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new jl2(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d = d();
        if (d() <= 50) {
            concat = op0.M(this);
        } else {
            int e = e(0, 47, d());
            concat = op0.M(e == 0 ? i : new kl2(e, this.h)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(d);
        sb.append(" contents=\"");
        return d51.u(sb, concat, "\">");
    }
}
