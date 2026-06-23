package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class qd2 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f836a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ qd2(String str, boolean z) {
        this.f836a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f836a);
        thread.setDaemon(this.b);
        return thread;
    }
}
