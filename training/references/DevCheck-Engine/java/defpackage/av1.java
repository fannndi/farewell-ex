package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class av1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f55a;
    public final /* synthetic */ View b;
    public final /* synthetic */ bv1 c;

    public av1(bv1 bv1Var, View view, View view2) {
        this.c = bv1Var;
        this.f55a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.f55a, this.b, valueAnimator.getAnimatedFraction());
    }
}
