package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class ta0 extends AnimatorListenerAdapter implements y02 {

    /* renamed from: a, reason: collision with root package name */
    public final View f976a;
    public boolean b = false;

    public ta0(View view) {
        this.f976a = view;
    }

    @Override // defpackage.y02
    public final void a(z02 z02Var) {
    }

    @Override // defpackage.y02
    public final void b() {
        View view = this.f976a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? q82.f825a.l(view) : 0.0f));
    }

    @Override // defpackage.y02
    public final void c() {
        this.f976a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.y02
    public final void d(z02 z02Var) {
    }

    @Override // defpackage.y02
    public final void e(z02 z02Var) {
    }

    @Override // defpackage.y02
    public final void f(z02 z02Var) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        q82.f825a.x(this.f976a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.f976a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        s82 s82Var = q82.f825a;
        s82Var.x(view, 1.0f);
        s82Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f976a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }
}
