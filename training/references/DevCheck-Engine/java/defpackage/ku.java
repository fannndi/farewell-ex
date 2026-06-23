package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ku implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f549a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public ku(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        return new Thread(runnable, (this.b ? "WM.task-" : "androidx.work-") + this.f549a.incrementAndGet());
    }
}
