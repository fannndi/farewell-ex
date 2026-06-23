package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class ga2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ma2 f325a;
    public final /* synthetic */ gb2 b;
    public final /* synthetic */ gb2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public ga2(ma2 ma2Var, gb2 gb2Var, gb2 gb2Var2, int i, View view) {
        this.f325a = ma2Var;
        this.b = gb2Var;
        this.c = gb2Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ma2 ma2Var = this.f325a;
        la2 la2Var = ma2Var.f621a;
        la2Var.e(animatedFraction);
        float c = la2Var.c();
        PathInterpolator pathInterpolator = ia2.e;
        int i = Build.VERSION.SDK_INT;
        gb2 gb2Var = this.b;
        ua2 ta2Var = i >= 36 ? new ta2(gb2Var) : i >= 35 ? new sa2(gb2Var) : i >= 34 ? new ra2(gb2Var) : i >= 31 ? new qa2(gb2Var) : i >= 30 ? new pa2(gb2Var) : i >= 29 ? new oa2(gb2Var) : new na2(gb2Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            db2 db2Var = gb2Var.f329a;
            if (i3 == 0) {
                ta2Var.d(i2, db2Var.h(i2));
            } else {
                mm0 h = db2Var.h(i2);
                mm0 h2 = this.c.f329a.h(i2);
                float f = 1.0f - c;
                ta2Var.d(i2, gb2.e(h, (int) (((h.f643a - h2.f643a) * f) + 0.5d), (int) (((h.b - h2.b) * f) + 0.5d), (int) (((h.c - h2.c) * f) + 0.5d), (int) (((h.d - h2.d) * f) + 0.5d)));
            }
        }
        ia2.h(this.e, ta2Var.b(), Collections.singletonList(ma2Var));
    }
}
