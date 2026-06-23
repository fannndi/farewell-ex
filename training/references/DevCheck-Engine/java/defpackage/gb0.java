package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class gb0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f327a = false;
    public final /* synthetic */ ib0 b;

    public gb0(ib0 ib0Var) {
        this.b = ib0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f327a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f327a) {
            this.f327a = false;
            return;
        }
        ib0 ib0Var = this.b;
        if (((Float) ib0Var.z.getAnimatedValue()).floatValue() == 0.0f) {
            ib0Var.A = 0;
            ib0Var.i(0);
        } else {
            ib0Var.A = 2;
            ib0Var.s.invalidate();
        }
    }
}
