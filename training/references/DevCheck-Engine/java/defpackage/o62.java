package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o62 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public gb2 f717a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ b41 c;

    public o62(View view, b41 b41Var) {
        this.b = view;
        this.c = b41Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        gb2 h = gb2.h(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        b41 b41Var = this.c;
        if (i < 30) {
            p62.a(windowInsets, this.b);
            if (h.equals(this.f717a)) {
                return b41Var.v(view, h).g();
            }
        }
        this.f717a = h;
        gb2 v = b41Var.v(view, h);
        if (i >= 30) {
            return v.g();
        }
        WeakHashMap weakHashMap = y62.f1215a;
        view.requestApplyInsets();
        return v.g();
    }
}
