package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class f30 extends kk1 {
    public final /* synthetic */ int i;

    public /* synthetic */ f30(int i) {
        this.i = i;
    }

    @Override // defpackage.kk1
    public final void O(Object obj, float f) {
        switch (this.i) {
            case 0:
                g30 g30Var = (g30) obj;
                g30Var.v.b = f / 10000.0f;
                g30Var.invalidateSelf();
                int i = (int) f;
                br0 br0Var = g30Var.h;
                if (br0Var.c(true)) {
                    Context context = g30Var.g;
                    if (g30Var.z == null) {
                        LinearInterpolator linearInterpolator = o4.f715a;
                        g30Var.B = kk1.K(context, R.attr.motionEasingStandardInterpolator, linearInterpolator);
                        g30Var.C = kk1.K(context, R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        g30Var.z = valueAnimator;
                        valueAnimator.setDuration(500L);
                        g30Var.z.setFloatValues(0.0f, 1.0f);
                        g30Var.z.setInterpolator(null);
                        g30Var.z.addUpdateListener(new zd(2, g30Var));
                    }
                    float f2 = i;
                    float f3 = (f2 < br0Var.o * 10000.0f || f2 > br0Var.p * 10000.0f) ? 0.0f : 1.0f;
                    float f4 = g30Var.w;
                    ValueAnimator valueAnimator2 = g30Var.z;
                    if (f3 == f4) {
                        if (!valueAnimator2.isRunning()) {
                            g30Var.v.e = f3;
                            g30Var.invalidateSelf();
                            break;
                        }
                    } else {
                        if (valueAnimator2.isRunning()) {
                            g30Var.z.cancel();
                        }
                        g30Var.w = f3;
                        if (f3 != 1.0f) {
                            g30Var.A = g30Var.C;
                            g30Var.z.reverse();
                            break;
                        } else {
                            g30Var.A = g30Var.B;
                            g30Var.z.start();
                            break;
                        }
                    }
                }
                break;
            default:
                ((MaterialButton) obj).setDisplayedWidthIncrease(f);
                break;
        }
    }

    @Override // defpackage.kk1
    public final float u(Object obj) {
        float displayedWidthIncrease;
        switch (this.i) {
            case 0:
                return ((g30) obj).v.b * 10000.0f;
            default:
                displayedWidthIncrease = ((MaterialButton) obj).getDisplayedWidthIncrease();
                return displayedWidthIncrease;
        }
    }
}
