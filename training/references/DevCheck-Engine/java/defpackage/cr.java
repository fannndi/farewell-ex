package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class cr extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150a;
    public final /* synthetic */ dr b;

    public /* synthetic */ cr(dr drVar, int i) {
        this.f150a = i;
        this.b = drVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f150a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.b.b.i(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f150a) {
            case 0:
                this.b.b.i(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
