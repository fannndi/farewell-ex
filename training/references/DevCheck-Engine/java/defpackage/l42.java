package defpackage;

/* loaded from: classes.dex */
public final class l42 extends ng1 implements lp1 {
    public final cw0 h;
    public final long i;

    public l42(cw0 cw0Var, long j) {
        this.h = cw0Var;
        this.i = j;
    }

    @Override // defpackage.ng1
    public final long a() {
        return this.i;
    }

    @Override // defpackage.lp1
    public final bz1 c() {
        return bz1.d;
    }

    @Override // defpackage.ng1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.ng1
    public final cw0 e() {
        return this.h;
    }

    @Override // defpackage.lp1
    public final long g(long j, wl wlVar) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // defpackage.ng1
    public final fm j() {
        return new zc1(this);
    }
}
