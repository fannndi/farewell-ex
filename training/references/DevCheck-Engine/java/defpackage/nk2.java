package defpackage;

/* loaded from: classes.dex */
public final class nk2 extends zj2 implements Runnable, vj2 {
    public final Runnable n;

    public nk2(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // defpackage.zj2
    public final String c() {
        return d51.y("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
