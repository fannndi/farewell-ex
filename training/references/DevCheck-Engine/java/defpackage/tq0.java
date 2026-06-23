package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class tq0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1001a;
    public final /* synthetic */ uq0 b;

    public /* synthetic */ tq0(uq0 uq0Var, int i) {
        this.f1001a = i;
        this.b = uq0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1001a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                super.onAnimationEnd(animator);
                uq0 uq0Var = this.b;
                uq0Var.c();
                wd wdVar = uq0Var.j;
                if (wdVar != null) {
                    wdVar.a((xl0) uq0Var.f1165a);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f1001a) {
            case 0:
                super.onAnimationRepeat(animator);
                uq0 uq0Var = this.b;
                uq0Var.g = (uq0Var.g + 1) % uq0Var.f.e.length;
                uq0Var.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
