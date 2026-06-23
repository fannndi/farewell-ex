package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class q62 {
    public static gb2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        gb2 h = gb2.h(null, rootWindowInsets);
        db2 db2Var = h.f329a;
        db2Var.v(h);
        View rootView = view.getRootView();
        db2Var.d(rootView);
        db2Var.o(rootView);
        db2Var.p();
        return h;
    }
}
