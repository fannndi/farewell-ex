package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.vf1;

/* loaded from: classes.dex */
public abstract class tf1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, xp0 xp0Var) {
        gq0 q;
        xp0Var.getClass();
        if (!(activity instanceof eq0) || (q = ((eq0) activity).q()) == null) {
            return;
        }
        q.d(xp0Var);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            vf1.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new vf1.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new vf1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
