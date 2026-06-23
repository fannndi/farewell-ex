package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class pt1 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f809a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ pt1(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.f809a = i;
        this.b = swipeRefreshLayout;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        tt1 tt1Var;
        int i = this.f809a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (i) {
            case 0:
                if (!swipeRefreshLayout.i) {
                    swipeRefreshLayout.f();
                    break;
                } else {
                    swipeRefreshLayout.E.setAlpha(255);
                    swipeRefreshLayout.E.start();
                    if (swipeRefreshLayout.J && (tt1Var = swipeRefreshLayout.h) != null) {
                        tt1Var.d();
                    }
                    swipeRefreshLayout.s = swipeRefreshLayout.y.getTop();
                    break;
                }
                break;
            default:
                qt1 qt1Var = new qt1(swipeRefreshLayout, 1);
                swipeRefreshLayout.G = qt1Var;
                qt1Var.setDuration(150L);
                mq mqVar = swipeRefreshLayout.y;
                mqVar.g = null;
                mqVar.clearAnimation();
                swipeRefreshLayout.y.startAnimation(swipeRefreshLayout.G);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.f809a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.f809a;
    }
}
