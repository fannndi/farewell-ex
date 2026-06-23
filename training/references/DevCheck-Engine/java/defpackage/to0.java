package defpackage;

import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class to0 implements Flushable, Closeable {
    public static final Pattern r = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] s = new String[rt0.s];
    public static final String[] t;
    public final Writer g;
    public int[] h;
    public int i;
    public dd0 j;
    public String k;
    public String l;
    public boolean m;
    public int n;
    public boolean o;
    public String p;
    public boolean q;

    static {
        for (int i = 0; i <= 31; i++) {
            s[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        t = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public to0(Writer writer) {
        int[] iArr = new int[32];
        this.h = iArr;
        this.i = 0;
        if (iArr.length == 0) {
            this.h = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.h;
        int i = this.i;
        this.i = i + 1;
        iArr2[i] = 6;
        this.n = 2;
        this.q = true;
        Objects.requireNonNull(writer, "out == null");
        this.g = writer;
        F(dd0.d);
    }

    public to0 D() {
        if (this.p != null) {
            if (!this.q) {
                this.p = null;
                return this;
            }
            M();
        }
        a();
        this.g.write("null");
        return this;
    }

    public final int E() {
        int i = this.i;
        if (i != 0) {
            return this.h[i - 1];
        }
        c.n("JsonWriter is closed.");
        return 0;
    }

    public final void F(dd0 dd0Var) {
        Objects.requireNonNull(dd0Var);
        this.j = dd0Var;
        this.l = ",";
        if (dd0Var.c) {
            this.k = ": ";
            if (dd0Var.f186a.isEmpty()) {
                this.l = ", ";
            }
        } else {
            this.k = ":";
        }
        this.m = this.j.f186a.isEmpty() && this.j.b.isEmpty();
    }

    public final void G(int i) {
        if (i == 0) {
            throw null;
        }
        this.n = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.o
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.to0.t
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.to0.s
        L9:
            java.io.Writer r7 = r7.g
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.to0.H(java.lang.String):void");
    }

    public void I(long j) {
        M();
        a();
        this.g.write(Long.toString(j));
    }

    public void J(Number number) {
        if (number == null) {
            D();
            return;
        }
        M();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals(XmJDY.LksnTiSGRSz) || obj.equals("NaN")) {
                if (this.n != 1) {
                    c.m("Numeric values must be finite, but was ".concat(obj));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !r.matcher(obj).matches()) {
                rw.h("String created by ", cls, " is not a valid JSON number: ", obj);
                return;
            }
        }
        a();
        this.g.append((CharSequence) obj);
    }

    public void K(String str) {
        if (str == null) {
            D();
            return;
        }
        M();
        a();
        H(str);
    }

    public void L(boolean z) {
        M();
        a();
        this.g.write(z ? "true" : "false");
    }

    public final void M() {
        if (this.p != null) {
            int E = E();
            if (E == 5) {
                this.g.write(this.l);
            } else if (E != 3) {
                c.n("Nesting problem.");
                return;
            }
            v();
            this.h[this.i - 1] = 4;
            H(this.p);
            this.p = null;
        }
    }

    public final void a() {
        int E = E();
        if (E == 1) {
            this.h[this.i - 1] = 2;
            v();
            return;
        }
        Writer writer = this.g;
        if (E == 2) {
            writer.append((CharSequence) this.l);
            v();
            return;
        }
        if (E == 4) {
            writer.append((CharSequence) this.k);
            this.h[this.i - 1] = 5;
            return;
        }
        if (E != 6) {
            if (E != 7) {
                c.n("Nesting problem.");
                return;
            } else if (this.n != 1) {
                c.n("JSON must have only one top-level value.");
                return;
            }
        }
        this.h[this.i - 1] = 7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.g.close();
        int i = this.i;
        if (i > 1 || (i == 1 && this.h[i - 1] != 7)) {
            rw.f("Incomplete document");
        } else {
            this.i = 0;
        }
    }

    public void e() {
        M();
        a();
        int i = this.i;
        int[] iArr = this.h;
        if (i == iArr.length) {
            this.h = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.h;
        int i2 = this.i;
        this.i = i2 + 1;
        iArr2[i2] = 1;
        this.g.write(91);
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.i != 0) {
            this.g.flush();
        } else {
            c.n("JsonWriter is closed.");
        }
    }

    public void j() {
        M();
        a();
        int i = this.i;
        int[] iArr = this.h;
        if (i == iArr.length) {
            this.h = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.h;
        int i2 = this.i;
        this.i = i2 + 1;
        iArr2[i2] = 3;
        this.g.write(123);
    }

    public final void l(int i, int i2, char c) {
        int E = E();
        if (E != i2 && E != i) {
            c.n("Nesting problem.");
            return;
        }
        if (this.p != null) {
            jw0.n(aEQQDLUUMo.IwilSIXdpkceV, this.p);
            return;
        }
        this.i--;
        if (E == i2) {
            v();
        }
        this.g.write(c);
    }

    public void m() {
        l(1, 2, ']');
    }

    public void o() {
        l(3, 5, '}');
    }

    public void r(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.p != null) {
            c.n("Already wrote a name, expecting a value.");
            return;
        }
        int E = E();
        if (E == 3 || E == 5) {
            this.p = str;
        } else {
            c.n("Please begin an object before writing a name.");
        }
    }

    public final void v() {
        if (this.m) {
            return;
        }
        String str = this.j.f186a;
        Writer writer = this.g;
        writer.write(str);
        int i = this.i;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.j.b);
        }
    }
}
