package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class gb2 {
    public static final gb2 b;

    /* renamed from: a, reason: collision with root package name */
    public final db2 f329a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = bb2.w;
        } else if (i >= 30) {
            b = za2.v;
        } else {
            b = db2.b;
        }
    }

    public gb2() {
        this.f329a = new db2(this);
    }

    public gb2(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f329a = new cb2(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f329a = new bb2(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f329a = new ab2(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f329a = new za2(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f329a = new ya2(this, windowInsets);
        } else if (i >= 28) {
            this.f329a = new xa2(this, windowInsets);
        } else {
            this.f329a = new wa2(this, windowInsets);
        }
    }

    public static mm0 e(mm0 mm0Var, int i, int i2, int i3, int i4) {
        int max = Math.max(0, mm0Var.f643a - i);
        int max2 = Math.max(0, mm0Var.b - i2);
        int max3 = Math.max(0, mm0Var.c - i3);
        int max4 = Math.max(0, mm0Var.d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? mm0Var : mm0.c(max, max2, max3, max4);
    }

    public static gb2 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        gb2 gb2Var = new gb2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = y62.f1215a;
            gb2 a2 = q62.a(view);
            db2 db2Var = gb2Var.f329a;
            db2Var.v(a2);
            View rootView = view.getRootView();
            db2Var.d(rootView);
            db2Var.o(rootView);
            db2Var.p();
            db2Var.x(view.getWindowSystemUiVisibility());
        }
        return gb2Var;
    }

    public final int a() {
        return this.f329a.m().d;
    }

    public final int b() {
        return this.f329a.m().f643a;
    }

    public final int c() {
        return this.f329a.m().c;
    }

    public final int d() {
        return this.f329a.m().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gb2) {
            return Objects.equals(this.f329a, ((gb2) obj).f329a);
        }
        return false;
    }

    public final gb2 f(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        ua2 ta2Var = i5 >= 36 ? new ta2(this) : i5 >= 35 ? new sa2(this) : i5 >= 34 ? new ra2(this) : i5 >= 31 ? new qa2(this) : i5 >= 30 ? new pa2(this) : i5 >= 29 ? new oa2(this) : new na2(this);
        ta2Var.h(mm0.c(i, i2, i3, i4));
        return ta2Var.b();
    }

    public final WindowInsets g() {
        db2 db2Var = this.f329a;
        if (db2Var instanceof va2) {
            return ((va2) db2Var).c;
        }
        return null;
    }

    public final int hashCode() {
        db2 db2Var = this.f329a;
        if (db2Var == null) {
            return 0;
        }
        return db2Var.hashCode();
    }
}
