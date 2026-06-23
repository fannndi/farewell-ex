package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class lm1 implements Executor {
    public final /* synthetic */ int g;
    public final Executor h;
    public final ArrayDeque i;
    public Runnable j;
    public final Object k;

    public lm1(Executor executor, int i) {
        this.g = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                executor.getClass();
                this.h = executor;
                this.i = new ArrayDeque();
                this.k = new Object();
                break;
            default:
                this.h = executor;
                this.i = new ArrayDeque();
                this.k = new Object();
                break;
        }
    }

    public lm1(l5 l5Var) {
        this.g = 2;
        this.k = new Object();
        this.i = new ArrayDeque();
        this.h = l5Var;
    }

    public final void a() {
        switch (this.g) {
            case 0:
                Runnable runnable = (Runnable) this.i.poll();
                this.j = runnable;
                if (runnable != null) {
                    this.h.execute(runnable);
                    return;
                }
                return;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                synchronized (this.k) {
                    Object poll = this.i.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.j = runnable2;
                    if (poll != null) {
                        this.h.execute(runnable2);
                    }
                }
                return;
            default:
                synchronized (this.k) {
                    try {
                        Runnable runnable3 = (Runnable) this.i.poll();
                        this.j = runnable3;
                        if (runnable3 != null) {
                            ((l5) this.h).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.g) {
            case 0:
                synchronized (this.k) {
                    try {
                        this.i.add(new hk2(this, 14, runnable));
                        if (this.j == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                runnable.getClass();
                synchronized (this.k) {
                    this.i.offer(new n51(runnable, 21, this));
                    if (this.j == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.k) {
                    try {
                        this.i.add(new k5(this, 0, runnable));
                        if (this.j == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
