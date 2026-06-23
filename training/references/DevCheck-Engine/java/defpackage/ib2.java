package defpackage;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class ib2 extends hb2 {
    @Override // defpackage.om0
    public final void K(boolean z) {
        if (!z) {
            T(16);
            return;
        }
        Window window = this.l;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
    }
}
