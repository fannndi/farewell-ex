package defpackage;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class hb2 extends om0 {
    public final Window l;

    public hb2(Window window, pg0 pg0Var) {
        this.l = window;
    }

    @Override // defpackage.om0
    public final boolean E() {
        return (this.l.getDecorView().getSystemUiVisibility() & rt0.y) != 0;
    }

    @Override // defpackage.om0
    public final void L(boolean z) {
        if (!z) {
            T(rt0.y);
            return;
        }
        Window window = this.l;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | rt0.y);
    }

    public final void T(int i) {
        View decorView = this.l.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
