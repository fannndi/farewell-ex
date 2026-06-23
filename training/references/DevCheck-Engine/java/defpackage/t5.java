package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t5 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static OnBackInvokedCallback b(Object obj, a6 a6Var) {
        Objects.requireNonNull(a6Var);
        s5 s5Var = new s5(0, a6Var);
        u0.j(obj).registerOnBackInvokedCallback(1000000, s5Var);
        return s5Var;
    }

    public static void c(Object obj, Object obj2) {
        u0.j(obj).unregisterOnBackInvokedCallback(u0.f(obj2));
    }
}
