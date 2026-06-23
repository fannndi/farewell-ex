package defpackage;

/* loaded from: classes.dex */
public final class pv1 extends mv1 {
    public final Runnable i;

    public pv1(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.i;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(d10.r(runnable));
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
