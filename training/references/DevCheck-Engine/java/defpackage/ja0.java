package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class ja0 extends gm2 {
    public final /* synthetic */ ka0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(ka0 ka0Var) {
        super(1);
        this.k = ka0Var;
    }

    @Override // defpackage.gm2
    public final c1 R(int i) {
        return new c1(AccessibilityNodeInfo.obtain(this.k.q(i).f104a));
    }

    @Override // defpackage.gm2
    public final c1 S(int i) {
        ka0 ka0Var = this.k;
        int i2 = i == 2 ? ka0Var.k : ka0Var.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return R(i2);
    }

    @Override // defpackage.gm2
    public final boolean V(int i, int i2, Bundle bundle) {
        int i3;
        ka0 ka0Var = this.k;
        View view = ka0Var.i;
        if (i == -1) {
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return ka0Var.v(i);
        }
        if (i2 == 2) {
            return ka0Var.j(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return ka0Var.r(i, i2, bundle);
            }
            if (ka0Var.k != i) {
                return false;
            }
            ka0Var.k = Integer.MIN_VALUE;
            view.invalidate();
            ka0Var.w(i, rt0.B);
            return true;
        }
        AccessibilityManager accessibilityManager = ka0Var.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = ka0Var.k) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            ka0Var.k = Integer.MIN_VALUE;
            view.invalidate();
            ka0Var.w(i3, rt0.B);
        }
        ka0Var.k = i;
        view.invalidate();
        ka0Var.w(i, rt0.A);
        return true;
    }
}
