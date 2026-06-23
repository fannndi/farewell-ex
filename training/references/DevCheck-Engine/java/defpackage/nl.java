package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class nl extends kl {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f689a;
    public final gb2 b;
    public Window c;
    public boolean d;

    public nl(View view, gb2 gb2Var) {
        this.b = gb2Var;
        vv0 vv0Var = BottomSheetBehavior.E(view).j;
        ColorStateList backgroundTintList = vv0Var != null ? vv0Var.h.c : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.f689a = Boolean.valueOf(je2.H(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList D = ju0.D(view.getBackground());
        Integer valueOf = D != null ? Integer.valueOf(D.getDefaultColor()) : null;
        if (valueOf != null) {
            this.f689a = Boolean.valueOf(je2.H(valueOf.intValue()));
        } else {
            this.f689a = null;
        }
    }

    @Override // defpackage.kl
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.kl
    public final void b(View view, float f) {
        d(view);
    }

    @Override // defpackage.kl
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        gb2 gb2Var = this.b;
        if (top < gb2Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.f689a;
                boolean booleanValue = bool == null ? this.d : bool.booleanValue();
                pg0 pg0Var = new pg0(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new lb2(window, pg0Var) : i >= 30 ? new kb2(window, pg0Var) : i >= 26 ? new ib2(window, pg0Var) : new hb2(window, pg0Var)).L(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), gb2Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                pg0 pg0Var2 = new pg0(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new lb2(window2, pg0Var2) : i2 >= 30 ? new kb2(window2, pg0Var2) : i2 >= 26 ? new ib2(window2, pg0Var2) : new hb2(window2, pg0Var2)).L(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            pg0 pg0Var = new pg0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            this.d = (i >= 35 ? new lb2(window, pg0Var) : i >= 30 ? new kb2(window, pg0Var) : i >= 26 ? new ib2(window, pg0Var) : new hb2(window, pg0Var)).E();
        }
    }
}
