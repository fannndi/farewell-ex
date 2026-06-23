package defpackage;

/* loaded from: classes.dex */
public final class e92 implements Runnable {
    public eh g;

    @Override // java.lang.Runnable
    public final synchronized void run() {
        this.g.run();
        this.g = null;
        notifyAll();
    }
}
