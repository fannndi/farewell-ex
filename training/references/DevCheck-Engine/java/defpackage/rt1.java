package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class rt1 extends Animation {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ SwipeRefreshLayout i;

    public rt1(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.i = swipeRefreshLayout;
        this.g = i;
        this.h = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.i.E.setAlpha((int) (((this.h - r0) * f) + this.g));
    }
}
