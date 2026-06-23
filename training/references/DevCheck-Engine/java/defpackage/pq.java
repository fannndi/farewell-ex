package defpackage;

import android.animation.Animator;

/* loaded from: classes.dex */
public final class pq implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qq f803a;
    public final /* synthetic */ rq b;

    public pq(rq rqVar, qq qqVar) {
        this.b = rqVar;
        this.f803a = qqVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        rq rqVar = this.b;
        qq qqVar = this.f803a;
        rqVar.a(1.0f, qqVar, true);
        qqVar.k = qqVar.e;
        qqVar.l = qqVar.f;
        qqVar.m = qqVar.g;
        qqVar.a((qqVar.j + 1) % qqVar.i.length);
        if (!rqVar.l) {
            rqVar.k += 1.0f;
            return;
        }
        rqVar.l = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (qqVar.n) {
            qqVar.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.k = 0.0f;
    }
}
