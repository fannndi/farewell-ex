package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import flar2.devcheck.R;
import java.util.List;

/* loaded from: classes.dex */
public final class ia2 extends la2 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final za0 f = new za0(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, ma2 ma2Var) {
        dn2 k = k(view);
        if (k != null) {
            k.a(ma2Var);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), ma2Var);
            }
        }
    }

    public static void g(View view, ma2 ma2Var, gb2 gb2Var, boolean z) {
        dn2 k = k(view);
        if (k != null) {
            k.f202a = gb2Var;
            if (!z) {
                k.b(ma2Var);
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ma2Var, gb2Var, z);
            }
        }
    }

    public static void h(View view, gb2 gb2Var, List list) {
        dn2 k = k(view);
        if (k != null) {
            k.c(gb2Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), gb2Var, list);
            }
        }
    }

    public static void i(View view, ma2 ma2Var, zf zfVar) {
        dn2 k = k(view);
        if (k != null) {
            k.d(ma2Var, zfVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), ma2Var, zfVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static dn2 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ha2) {
            return ((ha2) tag).f372a;
        }
        return null;
    }
}
