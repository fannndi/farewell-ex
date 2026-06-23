package defpackage;

import android.view.WindowManager;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class kq1 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z92 f546a;
    public final /* synthetic */ oq1 b;

    public kq1(oq1 oq1Var, z92 z92Var) {
        this.b = oq1Var;
        this.f546a = z92Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        WindowManager windowManager = this.b.h;
        z92 z92Var = this.f546a;
        windowManager.removeView(z92Var);
        z92Var.h = 0;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
