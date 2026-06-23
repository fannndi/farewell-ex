package defpackage;

/* loaded from: classes.dex */
public abstract class nk0 {
    static {
        km kmVar = km.j;
        pg0.h("\"\\");
        pg0.h("\t ,=");
    }

    public static final boolean a(lg1 lg1Var) {
        if (ym0.b((String) lg1Var.g.c, "HEAD")) {
            return false;
        }
        int i = lg1Var.j;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || rd2.d(lg1Var) != -1) {
            return true;
        }
        String b = lg1Var.l.b("Transfer-Encoding");
        if (b == null) {
            b = null;
        }
        return "chunked".equalsIgnoreCase(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x020f, code lost:
    
        if (r9.g.matcher(r0).matches() == false) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.pg0 r36, defpackage.ok0 r37, defpackage.ui0 r38) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk0.b(pg0, ok0, ui0):void");
    }
}
