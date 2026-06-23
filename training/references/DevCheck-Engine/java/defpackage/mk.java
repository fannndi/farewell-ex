package defpackage;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class mk extends o {
    public final Thread l;
    public final n90 m;

    public mk(qx qxVar, Thread thread, n90 n90Var) {
        super(qxVar, true);
        this.l = thread;
        this.m = n90Var;
    }

    @Override // defpackage.bo0
    public final void p(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.l;
        if (ym0.b(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
