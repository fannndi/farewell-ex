package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class b92 extends AnimatorListenerAdapter implements y02 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f72a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ ua0 e;

    public b92(ua0 ua0Var, ViewGroup viewGroup, View view, View view2) {
        this.e = ua0Var;
        this.f72a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.y02
    public final void a(z02 z02Var) {
    }

    @Override // defpackage.y02
    public final void b() {
    }

    @Override // defpackage.y02
    public final void c() {
    }

    @Override // defpackage.y02
    public final void d(z02 z02Var) {
        z02Var.y(this);
    }

    @Override // defpackage.y02
    public final void f(z02 z02Var) {
        if (this.d) {
            g();
        }
    }

    public final void g() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.f72a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f72a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            y62.a(this.f72a, view);
        } else {
            this.e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            y62.a(this.f72a, view2);
            this.d = true;
        }
    }
}
