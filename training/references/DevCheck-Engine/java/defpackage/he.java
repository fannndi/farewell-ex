package defpackage;

import android.animation.ValueAnimator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class he implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f378a;
    public final /* synthetic */ pe b;

    public /* synthetic */ he(pe peVar, int i) {
        this.f378a = i;
        this.b = peVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f378a;
        pe peVar = this.b;
        switch (i) {
            case 0:
                peVar.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oe oeVar = peVar.i;
                oeVar.setScaleX(floatValue);
                oeVar.setScaleY(floatValue);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                peVar.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                peVar.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
