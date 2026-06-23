package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class g41 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf0 f318a;
    public final /* synthetic */ lf0 b;
    public final /* synthetic */ af0 c;
    public final /* synthetic */ af0 d;

    public g41(lf0 lf0Var, lf0 lf0Var2, af0 af0Var, af0 af0Var2) {
        this.f318a = lf0Var;
        this.b = lf0Var2;
        this.c = af0Var;
        this.d = af0Var2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.j(new xb(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.f318a.j(new xb(backEvent));
    }
}
