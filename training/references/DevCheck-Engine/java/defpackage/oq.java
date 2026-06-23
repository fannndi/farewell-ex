package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class oq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qq f753a;
    public final /* synthetic */ rq b;

    public oq(rq rqVar, qq qqVar) {
        this.b = rqVar;
        this.f753a = qqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        qq qqVar = this.f753a;
        rq.d(floatValue, qqVar);
        rq rqVar = this.b;
        rqVar.a(floatValue, qqVar, false);
        rqVar.invalidateSelf();
    }
}
