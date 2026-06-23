package defpackage;

import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class tj implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f990a;

    public tj(IBinder iBinder) {
        this.f990a = iBinder;
        iBinder.linkToDeath(this, 0);
    }

    public abstract void a();

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f990a.unlinkToDeath(this, 0);
        x32.a(new l2(16, this));
    }
}
