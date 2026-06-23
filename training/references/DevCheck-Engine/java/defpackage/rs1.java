package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import flar2.devcheck.utils.SuccessLoadingView;

/* loaded from: classes.dex */
public final class rs1 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f905a;
    public final /* synthetic */ SuccessLoadingView b;

    public /* synthetic */ rs1(SuccessLoadingView successLoadingView, int i) {
        this.f905a = i;
        this.b = successLoadingView;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f905a;
        SuccessLoadingView successLoadingView = this.b;
        switch (i) {
            case 0:
                successLoadingView.u = false;
                successLoadingView.v = true;
                successLoadingView.w = false;
                successLoadingView.x = true;
                break;
            default:
                successLoadingView.w = false;
                successLoadingView.x = true;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f905a;
        SuccessLoadingView successLoadingView = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                successLoadingView.u = false;
                successLoadingView.v = true;
                if (!successLoadingView.w) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    successLoadingView.z = ofFloat;
                    ofFloat.setDuration(successLoadingView.h);
                    successLoadingView.z.addUpdateListener(successLoadingView.A);
                    successLoadingView.z.addListener(new rs1(successLoadingView, i2));
                    successLoadingView.z.start();
                    break;
                }
                break;
            default:
                successLoadingView.w = false;
                successLoadingView.x = true;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f905a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f905a;
        SuccessLoadingView successLoadingView = this.b;
        switch (i) {
            case 0:
                successLoadingView.u = true;
                successLoadingView.v = false;
                break;
            default:
                successLoadingView.w = true;
                successLoadingView.x = false;
                break;
        }
    }
}
