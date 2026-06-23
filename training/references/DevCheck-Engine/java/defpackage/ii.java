package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
import java.util.Locale;

/* loaded from: classes.dex */
public final /* synthetic */ class ii implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f431a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ ii(TextView textView, int i) {
        this.f431a = i;
        this.b = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f431a;
        TextView textView = this.b;
        switch (i) {
            case 0:
                textView.setText(String.format(Locale.getDefault(), "%,.0f", Double.valueOf(((Float) valueAnimator.getAnimatedValue()).doubleValue())));
                break;
            default:
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
