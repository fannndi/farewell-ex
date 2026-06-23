package defpackage;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f58a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(lp.f601a);
        bytes.getClass();
        f58a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(long j, wl wlVar) {
        if (j > 0) {
            long j2 = j - 1;
            if (wlVar.j(j2) == 13) {
                String r = wlVar.r(j2, lp.f601a);
                wlVar.skip(2L);
                return r;
            }
        }
        String r2 = wlVar.r(j, lp.f601a);
        wlVar.skip(1L);
        return r2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(defpackage.wl r16, defpackage.e51 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.b(wl, e51, boolean):int");
    }
}
