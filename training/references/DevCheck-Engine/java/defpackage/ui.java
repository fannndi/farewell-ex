package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.carousel.CarouselLayoutManager;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class ui implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1043a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ui(int i, Object obj) {
        this.f1043a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        dc dcVar;
        int i9 = this.f1043a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) obj;
                int i10 = BenchmarkSuiteActivity.M;
                if (i4 - i2 != i8 - i6) {
                    benchmarkSuiteActivity.J();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new l2(22, carouselLayoutManager));
                    break;
                }
                break;
            default:
                el elVar = (el) obj;
                View view2 = elVar.x;
                ImageView imageView = elVar.z;
                if (imageView.getVisibility() == 0 && (dcVar = elVar.g0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    dcVar.setBounds(rect);
                    dcVar.j(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) elVar.w.getLayoutParams();
                int i11 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i12 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z2 = true;
                if (elVar.h0 == 1 && elVar.b0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (elVar.b0 != -2 || view2.getMeasuredWidth() == i11) {
                        z = false;
                    } else {
                        layoutParams2.width = Math.max(i11, Math.min(elVar.W, elVar.getMeasuredWidth() - (elVar.e0 * 2)));
                        z = true;
                    }
                    if (view2.getMeasuredHeight() < i12) {
                        layoutParams2.height = i12;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        view2.setLayoutParams(layoutParams2);
                        break;
                    }
                }
                break;
        }
    }
}
