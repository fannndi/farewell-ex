package defpackage;

/* loaded from: classes.dex */
public final class cw0 {
    public static final mf1 c = new mf1("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final mf1 d = new mf1(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f157a;
    public final String[] b;

    public cw0(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.f157a = str;
        this.b = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.charset.Charset a(defpackage.cw0 r5) {
        /*
            java.lang.String[] r5 = r5.b
            int r0 = r5.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = defpackage.je2.z(r2, r0, r1)
            r1 = 0
            if (r0 < 0) goto L22
        Le:
            r3 = r5[r2]
            java.lang.String r4 = "charset"
            boolean r3 = defpackage.is1.X(r3, r4)
            if (r3 == 0) goto L1d
            int r2 = r2 + 1
            r5 = r5[r2]
            goto L23
        L1d:
            if (r2 == r0) goto L22
            int r2 = r2 + 2
            goto Le
        L22:
            r5 = r1
        L23:
            if (r5 != 0) goto L26
            return r1
        L26:
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch: java.lang.IllegalArgumentException -> L2b
            return r5
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw0.a(cw0):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cw0) && ym0.b(((cw0) obj).f157a, this.f157a);
    }

    public final int hashCode() {
        return this.f157a.hashCode();
    }

    public final String toString() {
        return this.f157a;
    }
}
