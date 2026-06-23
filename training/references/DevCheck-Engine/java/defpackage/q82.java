package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class q82 {

    /* renamed from: a, reason: collision with root package name */
    public static final s82 f825a;
    public static final sd b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f825a = new t82();
        } else {
            f825a = new s82();
        }
        b = new sd(Float.class, "translationAlpha", 14);
        new sd(Rect.class, "clipBounds", 15);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f825a.L(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f825a.M(view, i);
    }
}
