package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class s10 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f914a = 1;
    public final /* synthetic */ te1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ x10 e;

    public s10(x10 x10Var, te1 te1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = x10Var;
        this.b = te1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    public s10(x10 x10Var, te1 te1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = x10Var;
        this.b = te1Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f914a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f914a;
        te1 te1Var = this.b;
        x10 x10Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                x10Var.c(te1Var);
                x10Var.q.remove(te1Var);
                x10Var.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                x10Var.c(te1Var);
                x10Var.o.remove(te1Var);
                x10Var.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f914a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }
}
