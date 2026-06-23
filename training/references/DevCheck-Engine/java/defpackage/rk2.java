package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rk2 extends lk2 implements ScheduledExecutorService {
    public final ScheduledExecutorService h;

    public rk2(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.h = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        vk2 vk2Var = new vk2(Executors.callable(runnable, null));
        return new mk2(vk2Var, this.h.schedule(vk2Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        vk2 vk2Var = new vk2(callable);
        return new mk2(vk2Var, this.h.schedule(vk2Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        nk2 nk2Var = new nk2(runnable);
        return new mk2(nk2Var, this.h.scheduleAtFixedRate(nk2Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        nk2 nk2Var = new nk2(runnable);
        return new mk2(nk2Var, this.h.scheduleWithFixedDelay(nk2Var, j, j2, timeUnit));
    }
}
