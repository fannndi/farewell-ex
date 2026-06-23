package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class d1 extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final gm2 f163a;

    public d1(gm2 gm2Var) {
        this.f163a = gm2Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        c1 R = this.f163a.R(i);
        if (R == null) {
            return null;
        }
        return R.f104a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f163a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        c1 S = this.f163a.S(i);
        if (S == null) {
            return null;
        }
        return S.f104a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f163a.V(i, i2, bundle);
    }
}
