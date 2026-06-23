package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class pn implements bs0 {
    public final WeakReference g;
    public final on h = new on(this);

    public pn(mn mnVar) {
        this.g = new WeakReference(mnVar);
    }

    @Override // defpackage.bs0
    public final void a(Runnable runnable, Executor executor) {
        this.h.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        mn mnVar = (mn) this.g.get();
        boolean cancel = this.h.cancel(z);
        if (cancel && mnVar != null) {
            mnVar.f645a = null;
            mnVar.b = null;
            mnVar.c.k(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.h.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.h.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.h.g instanceof y;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.h.isDone();
    }

    public final String toString() {
        return this.h.toString();
    }
}
