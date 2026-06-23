package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import flar2.devcheck.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class o5 implements b41, tw, ex0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ a6 h;

    public /* synthetic */ o5(a6 a6Var, int i) {
        this.g = i;
        this.h = a6Var;
    }

    @Override // defpackage.ex0
    public boolean G(MenuBuilder menuBuilder) {
        Window.Callback callback;
        int i = this.g;
        a6 a6Var = this.h;
        switch (i) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                Window.Callback callback2 = a6Var.r.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuBuilder);
                    break;
                }
                break;
            default:
                if (menuBuilder == menuBuilder.k() && a6Var.L && (callback = a6Var.r.getCallback()) != null && !a6Var.W) {
                    callback.onMenuOpened(108, menuBuilder);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.ex0
    public void a(MenuBuilder menuBuilder, boolean z) {
        z5 z5Var;
        int i = this.g;
        a6 a6Var = this.h;
        switch (i) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                a6Var.t(menuBuilder);
                break;
            default:
                MenuBuilder k = menuBuilder.k();
                int i2 = 0;
                boolean z2 = k != menuBuilder;
                if (z2) {
                    menuBuilder = k;
                }
                z5[] z5VarArr = a6Var.R;
                int length = z5VarArr != null ? z5VarArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        z5Var = null;
                    } else {
                        z5Var = z5VarArr[i2];
                        if (z5Var == null || z5Var.h != menuBuilder) {
                            i2++;
                        }
                    }
                }
                if (z5Var != null) {
                    if (!z2) {
                        a6Var.u(z5Var, z);
                        break;
                    } else {
                        a6Var.s(z5Var.f1260a, z5Var, k);
                        a6Var.u(z5Var, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.b41
    public gb2 v(View view, gb2 gb2Var) {
        boolean z;
        boolean z2;
        int d = gb2Var.d();
        a6 a6Var = this.h;
        Context context = a6Var.q;
        int d2 = gb2Var.d();
        ActionBarContextView actionBarContextView = a6Var.A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a6Var.A.getLayoutParams();
            if (a6Var.A.isShown()) {
                if (a6Var.i0 == null) {
                    a6Var.i0 = new Rect();
                    a6Var.j0 = new Rect();
                }
                Rect rect = a6Var.i0;
                Rect rect2 = a6Var.j0;
                rect.set(gb2Var.b(), gb2Var.d(), gb2Var.c(), gb2Var.a());
                ViewGroup viewGroup = a6Var.G;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = r82.f877a;
                    n82.a(viewGroup, rect, rect2);
                } else {
                    if (!r82.f877a) {
                        r82.f877a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            r82.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                r82.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = r82.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = a6Var.G;
                WeakHashMap weakHashMap = y62.f1215a;
                gb2 a2 = q62.a(viewGroup2);
                int b = a2 == null ? 0 : a2.b();
                int c = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || a6Var.I != null) {
                    View view2 = a6Var.I;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            a6Var.I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    a6Var.I = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    a6Var.G.addView(a6Var.I, -1, layoutParams);
                }
                View view4 = a6Var.I;
                r7 = view4 != null;
                if (r7 && view4.getVisibility() != 0) {
                    View view5 = a6Var.I;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & rt0.y) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!a6Var.N && r7) {
                    d2 = 0;
                }
                z = r7;
                r7 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r7 = false;
            }
            if (r7) {
                a6Var.A.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = a6Var.I;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return y62.j(view, d != d2 ? gb2Var.f(gb2Var.b(), d2, gb2Var.c(), gb2Var.a()) : gb2Var);
    }
}
