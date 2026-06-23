package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mk2 extends sl implements ScheduledFuture, kk2, Future {
    public final zj2 u;
    public final ScheduledFuture v;

    public mk2(zj2 zj2Var, ScheduledFuture scheduledFuture) {
        super(20);
        this.u = zj2Var;
        this.v = scheduledFuture;
    }

    @Override // defpackage.kk2
    public final void b(Runnable runnable, Executor executor) {
        this.u.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = this.u.cancel(z);
        if (cancel) {
            this.v.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.v.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.u.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.u.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.v.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.u.g instanceof pj2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.u.isDone();
    }
}
