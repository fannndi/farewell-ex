package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class vk2 extends gk2 implements RunnableFuture {
    public volatile uk2 n;

    public vk2(Callable callable) {
        this.n = new uk2(this, callable);
    }

    @Override // defpackage.zj2
    public final String c() {
        uk2 uk2Var = this.n;
        return uk2Var != null ? d51.y("task=[", uk2Var.toString(), "]") : super.c();
    }

    @Override // defpackage.zj2
    public final void d() {
        uk2 uk2Var;
        Object obj = this.g;
        if ((obj instanceof pj2) && ((pj2) obj).f793a && (uk2Var = this.n) != null) {
            x70 x70Var = uk2.j;
            x70 x70Var2 = uk2.i;
            Runnable runnable = (Runnable) uk2Var.get();
            if (runnable instanceof Thread) {
                jk2 jk2Var = new jk2(uk2Var);
                jk2Var.setExclusiveOwnerThread(Thread.currentThread());
                if (uk2Var.compareAndSet(runnable, jk2Var)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) uk2Var.getAndSet(x70Var2)) == x70Var) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) uk2Var.getAndSet(x70Var2)) == x70Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.n = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        uk2 uk2Var = this.n;
        if (uk2Var != null) {
            uk2Var.run();
        }
        this.n = null;
    }
}
