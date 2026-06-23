package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* loaded from: classes.dex */
public final class ie implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i == 0) {
            pe peVar = (pe) message.obj;
            oe oeVar = peVar.i;
            if (oeVar.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = oeVar.getLayoutParams();
                if (layoutParams instanceof kx) {
                    kx kxVar = (kx) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    gm2 gm2Var = baseTransientBottomBar$Behavior.i;
                    gm2Var.getClass();
                    gm2Var.h = peVar.t;
                    baseTransientBottomBar$Behavior.b = new ke(peVar);
                    kxVar.b(baseTransientBottomBar$Behavior);
                    kxVar.g = 80;
                }
                ViewGroup viewGroup = peVar.g;
                oeVar.q = true;
                viewGroup.addView(oeVar);
                oeVar.q = false;
                peVar.e();
                oeVar.setVisibility(4);
            }
            if (oeVar.isLaidOut()) {
                peVar.d();
                return true;
            }
            peVar.r = true;
            return true;
        }
        if (i != 1) {
            return false;
        }
        pe peVar2 = (pe) message.obj;
        int i2 = message.arg1;
        oe oeVar2 = peVar2.i;
        AccessibilityManager accessibilityManager = peVar2.s;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || oeVar2.getVisibility() != 0) {
            peVar2.b();
            return true;
        }
        if (oeVar2.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setInterpolator(peVar2.d);
            ofFloat.addUpdateListener(new he(peVar2, 0));
            ofFloat.setDuration(peVar2.b);
            ofFloat.addListener(new ge(peVar2, i2, 0));
            ofFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        oe oeVar3 = peVar2.i;
        int height = oeVar3.getHeight();
        ViewGroup.LayoutParams layoutParams2 = oeVar3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(peVar2.e);
        valueAnimator.setDuration(peVar2.c);
        valueAnimator.addListener(new ge(peVar2, i2, 2));
        valueAnimator.addUpdateListener(new he(peVar2, 3));
        valueAnimator.start();
        return true;
    }
}
