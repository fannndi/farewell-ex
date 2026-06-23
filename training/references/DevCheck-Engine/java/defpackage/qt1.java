package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class qt1 extends Animation {
    public final /* synthetic */ int g;
    public final /* synthetic */ SwipeRefreshLayout h;

    public /* synthetic */ qt1(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.g = i;
        this.h = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.g;
        SwipeRefreshLayout swipeRefreshLayout = this.h;
        switch (i) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(f);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                boolean z = swipeRefreshLayout.L;
                int i2 = swipeRefreshLayout.C;
                if (!z) {
                    i2 -= Math.abs(swipeRefreshLayout.B);
                }
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.A + ((int) ((i2 - r4) * f))) - swipeRefreshLayout.y.getTop());
                rq rqVar = swipeRefreshLayout.E;
                float f2 = 1.0f - f;
                qq qqVar = rqVar.g;
                if (f2 != qqVar.p) {
                    qqVar.p = f2;
                }
                rqVar.invalidateSelf();
                break;
            default:
                swipeRefreshLayout.e(f);
                break;
        }
    }
}
