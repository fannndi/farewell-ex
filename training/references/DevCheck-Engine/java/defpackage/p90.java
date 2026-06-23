package defpackage;

/* loaded from: classes.dex */
public final class p90 extends q90 {
    public final dz1 i;

    public p90(long j, dz1 dz1Var) {
        super(j);
        this.i = dz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.run();
    }

    @Override // defpackage.q90
    public final String toString() {
        return super.toString() + this.i;
    }
}
