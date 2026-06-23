package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public abstract class p62 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static gb2 b(View view, gb2 gb2Var, Rect rect) {
        WindowInsets g = gb2Var.g();
        if (g != null) {
            return gb2.h(view, view.computeSystemWindowInsets(g, rect));
        }
        rect.setEmpty();
        return gb2Var;
    }

    public static void c(View view, b41 b41Var) {
        o62 o62Var = b41Var != null ? new o62(view, b41Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, o62Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (o62Var != null) {
            view.setOnApplyWindowInsetsListener(o62Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
