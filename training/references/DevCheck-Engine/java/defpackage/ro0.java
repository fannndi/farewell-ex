package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class ro0 implements Closeable {
    public final StringReader g;
    public long n;
    public int o;
    public String p;
    public int[] q;
    public String[] s;
    public int[] t;
    public int u = 2;
    public final char[] h = new char[rt0.v];
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int r = 1;

    static {
        pg0.n = new pg0();
    }

    public ro0(StringReader stringReader) {
        int[] iArr = new int[32];
        this.q = iArr;
        iArr[0] = 6;
        this.s = new String[32];
        this.t = new int[32];
        this.g = stringReader;
    }

    public final boolean D() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean E(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    public final String F() {
        return " at line " + (this.k + 1) + " column " + ((this.i - this.l) + 1) + " path " + v(false);
    }

    public final boolean G() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i == 5) {
            this.m = 0;
            int[] iArr = this.t;
            int i2 = this.r - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw Y("a boolean");
        }
        this.m = 0;
        int[] iArr2 = this.t;
        int i3 = this.r - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final double H() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i == 15) {
            this.m = 0;
            int[] iArr = this.t;
            int i2 = this.r - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.n;
        }
        if (i == 16) {
            this.p = new String(this.h, this.i, this.o);
            this.i += this.o;
        } else if (i == 8 || i == 9) {
            this.p = N(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.p = P();
        } else if (i != 11) {
            throw Y("a double");
        }
        this.m = 11;
        double parseDouble = Double.parseDouble(this.p);
        if (this.u != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            X("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.p = null;
        this.m = 0;
        int[] iArr2 = this.t;
        int i3 = this.r - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public final int I() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i == 15) {
            long j = this.n;
            int i2 = (int) j;
            if (j == i2) {
                this.m = 0;
                int[] iArr = this.t;
                int i3 = this.r - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.n + F());
        }
        if (i == 16) {
            this.p = new String(this.h, this.i, this.o);
            this.i += this.o;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw Y("an int");
            }
            if (i == 10) {
                this.p = P();
            } else {
                this.p = N(i == 8 ? '\'' : '\"');
            }
            Z(this.p);
            try {
                int parseInt = Integer.parseInt(this.p);
                this.m = 0;
                int[] iArr2 = this.t;
                int i4 = this.r - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        double parseDouble = Double.parseDouble(this.p);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.p = null;
            this.m = 0;
            int[] iArr3 = this.t;
            int i6 = this.r - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.p + F());
    }

    public final long J() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i == 15) {
            this.m = 0;
            int[] iArr = this.t;
            int i2 = this.r - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.n;
        }
        if (i == 16) {
            this.p = new String(this.h, this.i, this.o);
            this.i += this.o;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw Y("a long");
            }
            if (i == 10) {
                this.p = P();
            } else {
                this.p = N(i == 8 ? '\'' : '\"');
            }
            Z(this.p);
            try {
                long parseLong = Long.parseLong(this.p);
                this.m = 0;
                int[] iArr2 = this.t;
                int i3 = this.r - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        double parseDouble = Double.parseDouble(this.p);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.p = null;
            this.m = 0;
            int[] iArr3 = this.t;
            int i4 = this.r - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.p + F());
    }

    public final String K() {
        String N;
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i == 14) {
            N = P();
        } else if (i == 12) {
            N = N('\'');
        } else {
            if (i != 13) {
                throw Y("a name");
            }
            N = N('\"');
        }
        this.m = 0;
        this.s[this.r - 1] = N;
        return N;
    }

    public final int L(boolean z) {
        char c;
        int i = this.i;
        int i2 = this.j;
        while (true) {
            if (i == i2) {
                this.i = i;
                if (!r(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(F()));
                    }
                    return -1;
                }
                i = this.i;
                i2 = this.j;
            }
            int i3 = i + 1;
            char[] cArr = this.h;
            c = cArr[i];
            if (c == '\n') {
                this.k++;
                this.l = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.i = i3;
                    if (i3 == i2) {
                        this.i = i;
                        boolean r = r(2);
                        this.i++;
                        if (!r) {
                            break;
                        }
                    }
                    j();
                    int i4 = this.i;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.i = i4 + 1;
                        while (true) {
                            if (this.i + 2 > this.j && !r(2)) {
                                X("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.i;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.i;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.j;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.k++;
                                this.l = i5 + 1;
                            }
                            this.i++;
                        }
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.i = i4 + 1;
                        U();
                        i = this.i;
                        i2 = this.j;
                    }
                } else {
                    if (c != '#') {
                        this.i = i3;
                        return c;
                    }
                    this.i = i3;
                    j();
                    U();
                    i = this.i;
                    i2 = this.j;
                }
            }
            i = i3;
        }
        return c;
    }

    public final void M() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i != 7) {
            throw Y("null");
        }
        this.m = 0;
        int[] iArr = this.t;
        int i2 = this.r - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.i = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.i = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String N(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.i
            int r3 = r11.j
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.h
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r7[r2]
            int r9 = r11.u
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.X(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.i = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r11 = new java.lang.String
            r11.<init>(r7, r3, r8)
            return r11
        L31:
            r1.append(r7, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.i = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L4f:
            r1.append(r7, r3, r2)
            char r2 = r11.S()
            r1.append(r2)
            int r2 = r11.i
            int r3 = r11.j
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.k
            int r2 = r2 + r6
            r11.k = r2
            r11.l = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.i = r2
            boolean r2 = r11.r(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.X(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro0.N(char):java.lang.String");
    }

    public final String O() {
        String str;
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i == 10) {
            str = P();
        } else if (i == 8) {
            str = N('\'');
        } else if (i == 9) {
            str = N('\"');
        } else if (i == 11) {
            str = this.p;
            this.p = null;
        } else if (i == 15) {
            str = Long.toString(this.n);
        } else {
            if (i != 16) {
                throw Y("a string");
            }
            str = new String(this.h, this.i, this.o);
            this.i += this.o;
        }
        this.m = 0;
        int[] iArr = this.t;
        int i2 = this.r - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        j();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String P() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.i
            int r3 = r3 + r2
            int r4 = r6.j
            char[] r5 = r6.h
            if (r3 >= r4) goto L4c
            char r3 = r5[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r6.j()
            goto L58
        L4c:
            int r3 = r5.length
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r6.r(r3)
            if (r3 == 0) goto L58
            goto L3
        L58:
            r1 = r2
            goto L78
        L5a:
            if (r0 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L67:
            int r3 = r6.i
            r0.append(r5, r3, r2)
            int r3 = r6.i
            int r3 = r3 + r2
            r6.i = r3
            r2 = 1
            boolean r2 = r6.r(r2)
            if (r2 != 0) goto L2
        L78:
            int r2 = r6.i
            if (r0 != 0) goto L82
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r2, r1)
            goto L89
        L82:
            r0.append(r5, r2, r1)
            java.lang.String r0 = r0.toString()
        L89:
            int r2 = r6.i
            int r2 = r2 + r1
            r6.i = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro0.P():java.lang.String");
    }

    public final int Q() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 3;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return 4;
            case 3:
                return 1;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return 2;
            case 5:
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return 8;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return 9;
            case 8:
            case rt0.o /* 9 */:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case rt0.p /* 17 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void R(int i) {
        int i2 = this.r;
        if (i2 - 1 >= 255) {
            throw new xt0("Nesting limit 255 reached".concat(F()));
        }
        int[] iArr = this.q;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.q = Arrays.copyOf(iArr, i3);
            this.t = Arrays.copyOf(this.t, i3);
            this.s = (String[]) Arrays.copyOf(this.s, i3);
        }
        int[] iArr2 = this.q;
        int i4 = this.r;
        this.r = i4 + 1;
        iArr2[i4] = i;
    }

    public final char S() {
        int i;
        if (this.i == this.j && !r(1)) {
            X("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        char[] cArr = this.h;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            X("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.j && !r(4)) {
                            X("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.i;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    X("Malformed Unicode escape \\u".concat(new String(cArr, this.i, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.i += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.u == 3) {
            X("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.k++;
        this.l = i3;
        if (this.u == 3) {
            X("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    public final void T(char c) {
        do {
            int i = this.i;
            int i2 = this.j;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.h[i];
                if (c2 == c) {
                    this.i = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.i = i3;
                    S();
                    i = this.i;
                    i2 = this.j;
                } else {
                    if (c2 == '\n') {
                        this.k++;
                        this.l = i3;
                    }
                    i = i3;
                }
            }
            this.i = i;
        } while (r(1));
        X("Unterminated string");
        throw null;
    }

    public final void U() {
        char c;
        do {
            if (this.i >= this.j && !r(1)) {
                return;
            }
            int i = this.i;
            int i2 = i + 1;
            this.i = i2;
            c = this.h[i];
            if (c == '\n') {
                this.k++;
                this.l = i2;
                return;
            }
        } while (c != '\r');
    }

    public final void V() {
        do {
            int i = 0;
            while (true) {
                int i2 = this.i + i;
                if (i2 < this.j) {
                    char c = this.h[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.i = i2;
                }
            }
            j();
            this.i += i;
            return;
        } while (r(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void W() {
        int i = 0;
        do {
            int i2 = this.m;
            if (i2 == 0) {
                i2 = l();
            }
            switch (i2) {
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    R(3);
                    i++;
                    this.m = 0;
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    if (i == 0) {
                        this.s[this.r - 1] = null;
                    }
                    this.r--;
                    i--;
                    this.m = 0;
                    break;
                case 3:
                    R(1);
                    i++;
                    this.m = 0;
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    this.r--;
                    i--;
                    this.m = 0;
                    break;
                case 5:
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                case 11:
                case 15:
                default:
                    this.m = 0;
                    break;
                case 8:
                    T('\'');
                    this.m = 0;
                    break;
                case rt0.o /* 9 */:
                    T('\"');
                    this.m = 0;
                    break;
                case 10:
                    V();
                    this.m = 0;
                    break;
                case 12:
                    T('\'');
                    if (i == 0) {
                        this.s[this.r - 1] = "<skipped>";
                    }
                    this.m = 0;
                    break;
                case 13:
                    T('\"');
                    if (i == 0) {
                        this.s[this.r - 1] = "<skipped>";
                    }
                    this.m = 0;
                    break;
                case 14:
                    V();
                    if (i == 0) {
                        this.s[this.r - 1] = "<skipped>";
                    }
                    this.m = 0;
                    break;
                case 16:
                    this.i += this.o;
                    this.m = 0;
                    break;
                case rt0.p /* 17 */:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.t;
        int i3 = this.r - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public final void X(String str) {
        throw new xt0(str + F() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
    }

    public final IllegalStateException Y(String str) {
        String str2 = Q() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder w = d51.w("Expected ", str, " but was ");
        w.append(d51.B(Q()));
        w.append(F());
        w.append("\nSee ");
        w.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(w.toString());
    }

    public final void Z(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                X("String contains non-ASCII characters: ".concat(str));
                throw null;
            }
        }
    }

    public final void a() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i != 3) {
            throw Y("BEGIN_ARRAY");
        }
        R(1);
        this.t[this.r - 1] = 0;
        this.m = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.q[0] = 8;
        this.r = 1;
        this.g.close();
    }

    public final void e() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i != 1) {
            throw Y("BEGIN_OBJECT");
        }
        R(3);
        this.m = 0;
    }

    public final void j() {
        if (this.u == 1) {
            return;
        }
        X("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cf, code lost:
    
        r24 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0224, code lost:
    
        if (E(r14) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a8, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0227, code lost:
    
        if (r12 != 2) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0229, code lost:
    
        if (r13 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x022f, code lost:
    
        if (r24 != Long.MIN_VALUE) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0231, code lost:
    
        if (r7 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0238, code lost:
    
        if (r24 != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x023a, code lost:
    
        if (r7 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023c, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023e, code lost:
    
        if (r7 == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0241, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0242, code lost:
    
        r26.n = r4;
        r26.i += r2;
        r9 = 15;
        r26.m = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0234, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x024e, code lost:
    
        if (r12 == r8) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0251, code lost:
    
        if (r12 == 4) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0254, code lost:
    
        if (r12 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0256, code lost:
    
        r26.o = r2;
        r9 = 16;
        r26.m = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0280 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l() {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro0.l():int");
    }

    public final void m() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i != 4) {
            throw Y("END_ARRAY");
        }
        int i2 = this.r;
        this.r = i2 - 1;
        int[] iArr = this.t;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.m = 0;
    }

    public final void o() {
        int i = this.m;
        if (i == 0) {
            i = l();
        }
        if (i != 2) {
            throw Y("END_OBJECT");
        }
        int i2 = this.r;
        int i3 = i2 - 1;
        this.r = i3;
        this.s[i3] = null;
        int[] iArr = this.t;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.m = 0;
    }

    public final boolean r(int i) {
        int i2;
        int i3;
        int i4 = this.l;
        int i5 = this.i;
        this.l = i4 - i5;
        int i6 = this.j;
        char[] cArr = this.h;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.j = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.j = 0;
        }
        this.i = 0;
        do {
            int i8 = this.j;
            int read = this.g.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.j + read;
            this.j = i2;
            if (this.k == 0 && (i3 = this.l) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.i++;
                this.l = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String toString() {
        return ro0.class.getSimpleName().concat(F());
    }

    public final String v(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.r;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.q[i];
            switch (i3) {
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    int i4 = this.t[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                case 5:
                    sb.append('.');
                    String str = this.s[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                case 8:
                    break;
                default:
                    throw new AssertionError(d51.q("Unknown scope value: ", i3));
            }
            i++;
        }
    }
}
