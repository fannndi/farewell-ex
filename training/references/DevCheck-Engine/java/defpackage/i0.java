package defpackage;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.skydoves.colorpickerview.ColorPickerView;
import com.skydoves.colorpickerview.sliders.BrightnessSlideBar;
import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class i0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i0(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        BrightnessSlideBar brightnessSlideBar;
        int i = this.g;
        int i2 = 0;
        Object obj = this.h;
        switch (i) {
            case 0:
                j0 j0Var = (j0) obj;
                j0Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                j0Var.e();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                z6 z6Var = (z6) obj;
                if (!z6Var.getInternalPopup().b()) {
                    z6Var.l.m(z6Var.getTextDirection(), z6Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = z6Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                w6 w6Var = (w6) obj;
                z6 z6Var2 = w6Var.M;
                if (!z6Var2.isAttachedToWindow() || !z6Var2.getGlobalVisibleRect(w6Var.K)) {
                    w6Var.dismiss();
                    break;
                } else {
                    w6Var.s();
                    w6Var.d();
                    break;
                }
                break;
            case 3:
                oo ooVar = (oo) obj;
                ArrayList arrayList = ooVar.o;
                if (ooVar.b() && arrayList.size() > 0 && !((no) arrayList.get(0)).f693a.E) {
                    View view = ooVar.v;
                    if (view != null && view.isShown()) {
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            ((no) obj2).f693a.d();
                        }
                        break;
                    } else {
                        ooVar.dismiss();
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                ColorPickerView colorPickerView = (ColorPickerView) obj;
                colorPickerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                gm2 gm2Var = colorPickerView.A;
                if (colorPickerView.getParent() != null && (colorPickerView.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) colorPickerView.getParent()).setClipChildren(false);
                }
                if (colorPickerView.getPreferenceName() == null) {
                    Point i3 = ym0.i(colorPickerView, new Point(colorPickerView.getWidth() / 2, colorPickerView.getMeasuredHeight() / 2));
                    int c = colorPickerView.c(i3.x, i3.y);
                    colorPickerView.g = c;
                    colorPickerView.h = c;
                    colorPickerView.i = new Point(i3.x, i3.y);
                    colorPickerView.h(i3.x, i3.y);
                    colorPickerView.b(colorPickerView.getColor());
                    colorPickerView.f(colorPickerView.i);
                    if (colorPickerView.d() && (brightnessSlideBar = colorPickerView.n) != null) {
                        brightnessSlideBar.setSelectorByHalfSelectorPosition(1.0f);
                        colorPickerView.b(colorPickerView.getColor());
                        break;
                    }
                } else {
                    gm2Var.getClass();
                    SharedPreferences sharedPreferences = (SharedPreferences) gm2Var.h;
                    if (colorPickerView.getPreferenceName() != null) {
                        String preferenceName = colorPickerView.getPreferenceName();
                        colorPickerView.setPureColor(sharedPreferences.getInt(preferenceName + "_COLOR", -1));
                        Point point = new Point(colorPickerView.getWidth() / 2, colorPickerView.getMeasuredHeight() / 2);
                        int i4 = gm2Var.U(preferenceName, point).x;
                        int i5 = gm2Var.U(preferenceName, point).y;
                        int i6 = sharedPreferences.getInt(preferenceName + "_COLOR", -1);
                        colorPickerView.g = i6;
                        colorPickerView.h = i6;
                        colorPickerView.i = new Point(i4, i5);
                        colorPickerView.h(i4, i5);
                        colorPickerView.b(colorPickerView.getColor());
                        colorPickerView.f(colorPickerView.i);
                    }
                    int i7 = sharedPreferences.getInt(colorPickerView.getPreferenceName() + "_COLOR", -1);
                    if ((colorPickerView.j.getDrawable() instanceof hs) && i7 != -1) {
                        colorPickerView.post(new ks(colorPickerView, i7, 1));
                        break;
                    }
                }
                break;
            default:
                tq1 tq1Var = (tq1) obj;
                dx0 dx0Var = tq1Var.o;
                if (tq1Var.b() && !dx0Var.E) {
                    View view2 = tq1Var.t;
                    if (view2 != null && view2.isShown()) {
                        dx0Var.d();
                        break;
                    } else {
                        tq1Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
