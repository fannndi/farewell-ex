package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuBuilder;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class dx0 extends wr0 implements rw0 {
    public static final Method J;
    public gm2 I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // defpackage.wr0
    public final l60 a(Context context, boolean z) {
        cx0 cx0Var = new cx0(context, z);
        cx0Var.setHoverListener(this);
        return cx0Var;
    }

    @Override // defpackage.rw0
    public final void f(MenuBuilder menuBuilder, MenuItem menuItem) {
        gm2 gm2Var = this.I;
        if (gm2Var != null) {
            gm2Var.f(menuBuilder, menuItem);
        }
    }

    @Override // defpackage.rw0
    public final void o(MenuBuilder menuBuilder, sw0 sw0Var) {
        gm2 gm2Var = this.I;
        if (gm2Var != null) {
            gm2Var.o(menuBuilder, sw0Var);
        }
    }
}
