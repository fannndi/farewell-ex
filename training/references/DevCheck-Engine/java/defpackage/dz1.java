package defpackage;

/* loaded from: classes.dex */
public final class dz1 extends hk1 implements Runnable {
    public final long m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dz1(long r2, defpackage.su r4) {
        /*
            r1 = this;
            qx r0 = r4.h
            r0.getClass()
            r1.<init>(r4, r0)
            r1.m = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz1.<init>(long, su):void");
    }

    @Override // defpackage.bo0
    public final String Q() {
        return super.Q() + "(timeMillis=" + this.m + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        pr.r(this.k);
        t(new cz1("Timed out waiting for " + this.m + " ms", this));
    }
}
