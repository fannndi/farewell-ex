package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class je implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ pe h;

    public /* synthetic */ je(pe peVar, int i) {
        this.g = i;
        this.h = peVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        int i = this.g;
        pe peVar = this.h;
        switch (i) {
            case 0:
                oe oeVar = peVar.i;
                if (oeVar != null) {
                    WindowManager windowManager = (WindowManager) peVar.h.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    oeVar.getLocationInWindow(iArr);
                    int height2 = (height - (oeVar.getHeight() + iArr[1])) + ((int) oeVar.getTranslationY());
                    int i2 = peVar.p;
                    if (height2 < i2) {
                        ViewGroup.LayoutParams layoutParams = oeVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            za0 za0Var = pe.u;
                            break;
                        } else {
                            int i3 = peVar.p;
                            peVar.q = i3;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                            oeVar.requestLayout();
                            break;
                        }
                    } else {
                        peVar.q = i2;
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                peVar.b();
                break;
            default:
                oe oeVar2 = peVar.i;
                if (oeVar2 != null) {
                    if (oeVar2.getParent() != null) {
                        oeVar2.setVisibility(0);
                    }
                    if (oeVar2.getAnimationMode() != 1) {
                        int height3 = oeVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = oeVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        oeVar2.setTranslationY(height3);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height3, 0);
                        valueAnimator.setInterpolator(peVar.e);
                        valueAnimator.setDuration(peVar.c);
                        valueAnimator.addListener(new ge(peVar, 1));
                        valueAnimator.addUpdateListener(new he(peVar, 2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(peVar.d);
                        ofFloat.addUpdateListener(new he(peVar, 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(peVar.f);
                        ofFloat2.addUpdateListener(new he(peVar, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(peVar.f786a);
                        animatorSet.addListener(new ge(peVar, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
