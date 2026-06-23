package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class kb2 extends om0 {
    public final WindowInsetsController l;
    public final Window m;

    public kb2(Window window, pg0 pg0Var) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.l = insetsController;
        this.m = window;
    }

    @Override // defpackage.om0
    public boolean E() {
        int systemBarsAppearance;
        Window window = this.m;
        if (window != null) {
            return (window.getDecorView().getSystemUiVisibility() & rt0.y) != 0;
        }
        this.l.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.l.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.om0
    public void K(boolean z) {
        T(16, 16, z);
    }

    @Override // defpackage.om0
    public void L(boolean z) {
        T(rt0.y, 8, z);
    }

    public final void T(int i, int i2, boolean z) {
        Window window = this.m;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.l;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
