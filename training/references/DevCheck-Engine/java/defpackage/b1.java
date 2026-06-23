package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class b1 implements sa0 {
    public final Object g;

    public /* synthetic */ b1(Object obj) {
        this.g = obj;
    }

    public static b1 a(int i, int i2, int i3) {
        return new b1(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public static b1 b(boolean z, int i, int i2, int i3, int i4) {
        return new b1(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    @Override // defpackage.db1
    public Object get() {
        return this.g;
    }
}
