package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class mm1 extends AbstractExecutorService implements Callable, AutoCloseable {
    public boolean g;
    public ArrayDeque h;
    public FutureTask i;

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean awaitTermination(long j, TimeUnit timeUnit) {
        FutureTask futureTask = this.i;
        if (futureTask == null) {
            return true;
        }
        try {
            futureTask.get(j, timeUnit);
        } catch (ExecutionException unused) {
        } catch (TimeoutException unused2) {
            return false;
        }
        return true;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Runnable runnable;
        while (true) {
            synchronized (this) {
                try {
                    runnable = (Runnable) this.h.poll();
                    if (runnable == null) {
                        this.i = null;
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            runnable.run();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.g) {
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + toString());
        }
        this.h.offer(runnable);
        if (this.i == null) {
            FutureTask futureTask = new FutureTask(this);
            this.i = futureTask;
            wn1.m.execute(futureTask);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean isShutdown() {
        return this.g;
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized boolean isTerminated() {
        boolean z;
        if (this.g) {
            z = this.i == null;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized void shutdown() {
        this.g = true;
        this.h.clear();
    }

    @Override // java.util.concurrent.ExecutorService
    public final synchronized List shutdownNow() {
        this.g = true;
        FutureTask futureTask = this.i;
        if (futureTask != null) {
            futureTask.cancel(true);
        }
        try {
        } finally {
            this.h.clear();
        }
        return new ArrayList(this.h);
    }
}
