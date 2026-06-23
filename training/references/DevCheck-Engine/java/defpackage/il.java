package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import flar2.devcheck.utils.SuccessLoadingView;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class il implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f437a;
    public final /* synthetic */ Object b;

    public /* synthetic */ il(int i, Object obj) {
        this.f437a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f437a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vv0 vv0Var = ((BottomSheetBehavior) obj).j;
                if (vv0Var != null) {
                    vv0Var.u(floatValue);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((mp) obj).postInvalidate();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ib0 ib0Var = (ib0) obj;
                ib0Var.c.setAlpha(floatValue2);
                ib0Var.d.setAlpha(floatValue2);
                ib0Var.s.invalidate();
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                SuccessLoadingView successLoadingView = (SuccessLoadingView) obj;
                if (valueAnimator.isRunning()) {
                    successLoadingView.t = Float.parseFloat(String.valueOf(valueAnimator.getAnimatedValue()));
                    successLoadingView.invalidate();
                    break;
                }
                break;
            case 5:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                ((TextInputLayout) obj).C0.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
                break;
        }
    }
}
