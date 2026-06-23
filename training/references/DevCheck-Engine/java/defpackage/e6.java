package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class e6 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static e6 c;

    /* renamed from: a, reason: collision with root package name */
    public fg1 f222a;

    public static synchronized e6 a() {
        e6 e6Var;
        synchronized (e6.class) {
            try {
                if (c == null) {
                    d();
                }
                e6Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e6Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (e6.class) {
            e = fg1.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (e6.class) {
            if (c == null) {
                e6 e6Var = new e6();
                c = e6Var;
                e6Var.f222a = fg1.b();
                fg1 fg1Var = c.f222a;
                yf yfVar = new yf(1);
                synchronized (fg1Var) {
                    fg1Var.e = yfVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, wu wuVar, int[] iArr) {
        PorterDuff.Mode mode = fg1.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = wuVar.b;
            if (!z && !wuVar.f1148a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z ? (ColorStateList) wuVar.c : null;
            PorterDuff.Mode mode2 = wuVar.f1148a ? (PorterDuff.Mode) wuVar.d : fg1.f;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = fg1.e(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f222a.c(context, i);
    }
}
