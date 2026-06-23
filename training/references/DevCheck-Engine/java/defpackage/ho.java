package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ho extends cr0 {
    public final /* synthetic */ int p = 1;

    public /* synthetic */ ho(Context context) {
        super(context);
    }

    public ho(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }

    @Override // defpackage.cr0
    public int b(View view, int i) {
        switch (this.p) {
            case 0:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.cr0
    public int c(View view, int i) {
        switch (this.p) {
            case 0:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.cr0
    public float d(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.cr0
    public PointF f(int i) {
        switch (this.p) {
            case 0:
                return null;
            default:
                return super.f(i);
        }
    }
}
