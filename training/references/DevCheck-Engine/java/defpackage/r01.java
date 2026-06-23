package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class r01 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f869a;
    public final /* synthetic */ t01 b;

    public r01(t01 t01Var, float f) {
        this.b = t01Var;
        this.f869a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f869a);
    }
}
