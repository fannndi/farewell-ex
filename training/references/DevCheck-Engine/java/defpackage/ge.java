package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ge extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f335a;
    public final /* synthetic */ pe b;

    public /* synthetic */ ge(pe peVar, int i) {
        this.f335a = i;
        this.b = peVar;
    }

    public /* synthetic */ ge(pe peVar, int i, int i2) {
        this.f335a = i2;
        this.b = peVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f335a;
        pe peVar = this.b;
        switch (i) {
            case 0:
                peVar.b();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                peVar.c();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                peVar.b();
                break;
            default:
                peVar.c();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.f335a;
        pe peVar = this.b;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                SnackbarContentLayout snackbarContentLayout = peVar.j;
                int i2 = peVar.c;
                int i3 = peVar.f786a;
                int i4 = i2 - i3;
                snackbarContentLayout.g.setAlpha(0.0f);
                long j = i3;
                ViewPropertyAnimator duration = snackbarContentLayout.g.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.j;
                long j2 = i4;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.h.getVisibility() == 0) {
                    snackbarContentLayout.h.setAlpha(0.0f);
                    snackbarContentLayout.h.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                SnackbarContentLayout snackbarContentLayout2 = peVar.j;
                int i5 = peVar.b;
                snackbarContentLayout2.g.setAlpha(1.0f);
                long j3 = i5;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.g.animate().alpha(0.0f).setDuration(j3);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.j;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                if (snackbarContentLayout2.h.getVisibility() == 0) {
                    snackbarContentLayout2.h.setAlpha(1.0f);
                    snackbarContentLayout2.h.animate().alpha(0.0f).setDuration(j3).setInterpolator(timeInterpolator2).setStartDelay(0L).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
