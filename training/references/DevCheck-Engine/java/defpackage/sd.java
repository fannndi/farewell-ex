package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class sd extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd(Class cls, String str, int i) {
        super(cls, str);
        this.f930a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f930a) {
            case 0:
                int alpha = Color.alpha(((ExtendedFloatingActionButton) obj).getCurrentOriginalTextColor());
                return Float.valueOf(alpha != 0 ? Color.alpha(r2.getCurrentTextColor()) / alpha : 0.0f);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return null;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return null;
            case 3:
                return null;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return null;
            case 5:
                return null;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return Float.valueOf(((b60) obj).b());
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 8:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case rt0.o /* 9 */:
                return Float.valueOf(((View) obj).getPaddingStart());
            case 10:
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 11:
                return Float.valueOf(((sq0) obj).h);
            case 12:
                return Float.valueOf(((uq0) obj).i);
            case 13:
                return Float.valueOf(((SwitchCompat) obj).F);
            case 14:
                return Float.valueOf(q82.f825a.l((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f930a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f = (Float) obj2;
                if (f.floatValue() == 1.0f) {
                    extendedFloatingActionButton.z(extendedFloatingActionButton.getOriginalTextColor());
                    break;
                } else {
                    extendedFloatingActionButton.z(ColorStateList.valueOf(ts.e(extendedFloatingActionButton.getCurrentOriginalTextColor(), Math.round(o4.a(0.0f, Color.alpha(r12), f.floatValue())))));
                    break;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                xo xoVar = (xo) obj;
                PointF pointF = (PointF) obj2;
                xoVar.getClass();
                xoVar.f1190a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                xoVar.b = round;
                int i = xoVar.f + 1;
                xoVar.f = i;
                if (i == xoVar.g) {
                    q82.a(xoVar.e, xoVar.f1190a, round, xoVar.c, xoVar.d);
                    xoVar.f = 0;
                    xoVar.g = 0;
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                xo xoVar2 = (xo) obj;
                PointF pointF2 = (PointF) obj2;
                xoVar2.getClass();
                xoVar2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                xoVar2.d = round2;
                int i2 = xoVar2.g + 1;
                xoVar2.g = i2;
                if (xoVar2.f == i2) {
                    q82.a(xoVar2.e, xoVar2.f1190a, xoVar2.b, xoVar2.c, round2);
                    xoVar2.f = 0;
                    xoVar2.g = 0;
                    break;
                }
                break;
            case 3:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                q82.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                q82.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 5:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                q82.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                b60 b60Var = (b60) obj;
                float floatValue = ((Float) obj2).floatValue();
                if (b60Var.o != floatValue) {
                    b60Var.o = floatValue;
                    b60Var.invalidateSelf();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                View view4 = (View) obj;
                view4.getLayoutParams().width = ((Float) obj2).intValue();
                view4.requestLayout();
                break;
            case 8:
                View view5 = (View) obj;
                view5.getLayoutParams().height = ((Float) obj2).intValue();
                view5.requestLayout();
                break;
            case rt0.o /* 9 */:
                View view6 = (View) obj;
                view6.setPaddingRelative(((Float) obj2).intValue(), view6.getPaddingTop(), view6.getPaddingEnd(), view6.getPaddingBottom());
                break;
            case 10:
                View view7 = (View) obj;
                view7.setPaddingRelative(view7.getPaddingStart(), view7.getPaddingTop(), ((Float) obj2).intValue(), view7.getPaddingBottom());
                break;
            case 11:
                sq0 sq0Var = (sq0) obj;
                sq0Var.h = ((Float) obj2).floatValue();
                ArrayList arrayList = (ArrayList) sq0Var.b;
                ((d60) arrayList.get(0)).f175a = 0.0f;
                float j = pr.j(((int) (r12 * 333.0f)) / 667.0f, 0.0f, 1.0f);
                d60 d60Var = (d60) arrayList.get(0);
                d60 d60Var2 = (d60) arrayList.get(1);
                za0 za0Var = sq0Var.d;
                float interpolation = za0Var.getInterpolation(j);
                d60Var2.f175a = interpolation;
                d60Var.b = interpolation;
                d60 d60Var3 = (d60) arrayList.get(1);
                d60 d60Var4 = (d60) arrayList.get(2);
                float interpolation2 = za0Var.getInterpolation(j + 0.49925038f);
                d60Var4.f175a = interpolation2;
                d60Var3.b = interpolation2;
                ((d60) arrayList.get(2)).b = 1.0f;
                if (sq0Var.g && ((d60) arrayList.get(1)).b < 1.0f) {
                    ((d60) arrayList.get(2)).c = ((d60) arrayList.get(1)).c;
                    ((d60) arrayList.get(1)).c = ((d60) arrayList.get(0)).c;
                    ((d60) arrayList.get(0)).c = sq0Var.e.e[sq0Var.f];
                    sq0Var.g = false;
                }
                ((xl0) sq0Var.f1165a).invalidateSelf();
                break;
            case 12:
                uq0 uq0Var = (uq0) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                uq0Var.i = floatValue2;
                int i3 = (int) (floatValue2 * 1800.0f);
                Interpolator[] interpolatorArr = uq0Var.e;
                ArrayList arrayList2 = (ArrayList) uq0Var.b;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    d60 d60Var5 = (d60) arrayList2.get(i4);
                    int i5 = i4 * 2;
                    int i6 = uq0.l[i5];
                    int[] iArr = uq0.k;
                    d60Var5.f175a = pr.j(interpolatorArr[i5].getInterpolation(pr.j((i3 - i6) / iArr[i5], 0.0f, 1.0f)), 0.0f, 1.0f);
                    d60Var5.b = pr.j(interpolatorArr[i5 + 1].getInterpolation(pr.j((i3 - r7[r8]) / iArr[r8], 0.0f, 1.0f)), 0.0f, 1.0f);
                }
                if (uq0Var.h) {
                    int size = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = arrayList2.get(i7);
                        i7++;
                        ((d60) obj3).c = uq0Var.f.e[uq0Var.g];
                    }
                    uq0Var.h = false;
                }
                ((xl0) uq0Var.f1165a).invalidateSelf();
                break;
            case 13:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 14:
                q82.f825a.x((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
