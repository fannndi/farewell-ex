package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import flar2.devcheck.benchmarkSuite.ui.widgets.ScoreBarView;
import flar2.devcheck.benchmarkSuite.ui.widgets.ScoreRingView;

/* loaded from: classes.dex */
public final /* synthetic */ class ik1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f436a;
    public final /* synthetic */ double b;
    public final /* synthetic */ double c;
    public final /* synthetic */ View d;

    public /* synthetic */ ik1(View view, double d, double d2, int i) {
        this.f436a = i;
        this.d = view;
        this.b = d;
        this.c = d2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f436a;
        double d = this.c;
        double d2 = this.b;
        View view = this.d;
        switch (i) {
            case 0:
                ScoreBarView scoreBarView = (ScoreBarView) view;
                int i2 = ScoreBarView.q;
                scoreBarView.l = ((d - d2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) + d2;
                scoreBarView.invalidate();
                break;
            default:
                ScoreRingView scoreRingView = (ScoreRingView) view;
                int i3 = ScoreRingView.u;
                scoreRingView.p = ((d - d2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) + d2;
                scoreRingView.invalidate();
                break;
        }
    }
}
