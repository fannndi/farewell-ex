package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes.dex */
public final class jk2 extends AbstractOwnableSynchronizer implements Runnable {
    public final uk2 g;

    public /* synthetic */ jk2(uk2 uk2Var) {
        this.g = uk2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.g.toString();
    }
}
