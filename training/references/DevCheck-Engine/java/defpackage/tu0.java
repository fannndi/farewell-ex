package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class tu0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ru0 f1007a;
    public final /* synthetic */ uu0 b;

    public tu0(uu0 uu0Var, ru0 ru0Var) {
        this.b = uu0Var;
        this.f1007a = ru0Var;
    }

    public final void onBackCancelled() {
        if (this.b.f955a != null) {
            this.f1007a.d();
        }
    }

    public final void onBackInvoked() {
        this.f1007a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.f955a != null) {
            this.f1007a.b(new xb(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.f955a != null) {
            this.f1007a.c(new xb(backEvent));
        }
    }
}
