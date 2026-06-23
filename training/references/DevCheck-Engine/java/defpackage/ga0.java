package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ga0 extends fa0 implements q20 {
    public final Executor i;

    public ga0(Executor executor) {
        this.i = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    public static void H(qx qxVar, RejectedExecutionException rejectedExecutionException) {
        CancellationException cancellationException = new CancellationException("The task was rejected");
        cancellationException.initCause(rejectedExecutionException);
        je2.f(qxVar, cancellationException);
    }

    @Override // defpackage.sx
    public final void D(qx qxVar, Runnable runnable) {
        try {
            this.i.execute(runnable);
        } catch (RejectedExecutionException e) {
            H(qxVar, e);
            c20 c20Var = e50.f220a;
            q10.i.D(qxVar, runnable);
        }
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        Executor executor = this.i;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ga0) && ((ga0) obj).i == this.i;
    }

    public final int hashCode() {
        return System.identityHashCode(this.i);
    }

    @Override // defpackage.q20
    public final n50 j(long j, dz1 dz1Var, qx qxVar) {
        Executor executor = this.i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(dz1Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                H(qxVar, e);
            }
        }
        return scheduledFuture != null ? new m50(scheduledFuture) : n10.r.j(j, dz1Var, qxVar);
    }

    @Override // defpackage.q20
    public final void l(long j, ao aoVar) {
        Executor executor = this.i;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            hk2 hk2Var = new hk2(this, 13, aoVar);
            qx qxVar = aoVar.k;
            try {
                scheduledFuture = scheduledExecutorService.schedule(hk2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                H(qxVar, e);
            }
        }
        if (scheduledFuture != null) {
            aoVar.A(new vn(0, scheduledFuture));
        } else {
            n10.r.l(j, aoVar);
        }
    }

    @Override // defpackage.sx
    public final String toString() {
        return this.i.toString();
    }
}
