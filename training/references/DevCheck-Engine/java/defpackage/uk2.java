package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class uk2 extends AtomicReference implements Runnable {
    public static final x70 i;
    public static final x70 j;
    public final Callable g;
    public final /* synthetic */ vk2 h;

    static {
        int i2 = 1;
        i = new x70(i2);
        j = new x70(i2);
    }

    public uk2(vk2 vk2Var, Callable callable) {
        this.h = vk2Var;
        callable.getClass();
        this.g = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        jk2 jk2Var = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            boolean z2 = runnable instanceof jk2;
            x70 x70Var = j;
            if (!z2) {
                if (runnable != x70Var) {
                    break;
                }
            } else {
                jk2Var = (jk2) runnable;
            }
            i2++;
            if (i2 <= 1000) {
                Thread.yield();
            } else if (runnable == x70Var || compareAndSet(runnable, x70Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(jk2Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            vk2 vk2Var = this.h;
            boolean isDone = vk2Var.isDone();
            x70 x70Var = i;
            if (isDone) {
                call = null;
            } else {
                try {
                    call = this.g.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, x70Var)) {
                            a(currentThread);
                        }
                        vk2Var.e(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, x70Var)) {
                            a(currentThread);
                        }
                        if (zj2.l.J(vk2Var, null, zj2.m)) {
                            zj2.h(vk2Var);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, x70Var)) {
                a(currentThread);
            }
            if (isDone) {
                return;
            }
            if (call == null) {
                call = zj2.m;
            }
            if (zj2.l.J(vk2Var, null, call)) {
                zj2.h(vk2Var);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return d51.s(runnable == i ? "running=[DONE]" : runnable instanceof jk2 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? d51.y("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", this.g.toString());
    }
}
