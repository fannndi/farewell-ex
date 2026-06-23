package defpackage;

import java.util.TimeZone;

/* loaded from: classes.dex */
public final class jk0 implements lp1 {
    public final long g;
    public boolean h;
    public final wl i = new wl();
    public final wl j = new wl();
    public boolean k;
    public final /* synthetic */ lk0 l;

    public jk0(lk0 lk0Var, long j, boolean z) {
        this.l = lk0Var;
        this.g = j;
        this.h = z;
    }

    @Override // defpackage.lp1
    public final bz1 c() {
        return this.l.p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        lk0 lk0Var = this.l;
        synchronized (lk0Var) {
            this.k = true;
            wl wlVar = this.j;
            j = wlVar.h;
            wlVar.skip(j);
            lk0Var.notifyAll();
        }
        if (j > 0) {
            lk0 lk0Var2 = this.l;
            TimeZone timeZone = rd2.f888a;
            lk0Var2.h.m(j);
        }
        this.l.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0012, B:12:0x001c, B:32:0x00b9, B:63:0x00df, B:64:0x00e4, B:14:0x0025, B:16:0x002b, B:18:0x002f, B:20:0x0033, B:21:0x0044, B:23:0x0048, B:25:0x0052, B:27:0x006f, B:29:0x0080, B:46:0x0097, B:50:0x00a1, B:53:0x00a7, B:54:0x00b3, B:57:0x00d5, B:58:0x00dc), top: B:4:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:14:0x0025, B:16:0x002b, B:18:0x002f, B:20:0x0033, B:21:0x0044, B:23:0x0048, B:25:0x0052, B:27:0x006f, B:29:0x0080, B:46:0x0097, B:50:0x00a1, B:53:0x00a7, B:54:0x00b3, B:57:0x00d5, B:58:0x00dc), top: B:13:0x0025, outer: #1, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[Catch: all -> 0x0022, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0012, B:12:0x001c, B:32:0x00b9, B:63:0x00df, B:64:0x00e4, B:14:0x0025, B:16:0x002b, B:18:0x002f, B:20:0x0033, B:21:0x0044, B:23:0x0048, B:25:0x0052, B:27:0x006f, B:29:0x0080, B:46:0x0097, B:50:0x00a1, B:53:0x00a7, B:54:0x00b3, B:57:0x00d5, B:58:0x00dc), top: B:4:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[SYNTHETIC] */
    @Override // defpackage.lp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(long r22, defpackage.wl r24) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk0.g(long, wl):long");
    }
}
