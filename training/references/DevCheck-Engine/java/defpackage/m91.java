package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class m91 extends m80 {
    public final /* synthetic */ n91 this$0;

    public static final class a extends m80 {
        public final /* synthetic */ n91 this$0;

        public a(n91 n91Var) {
            this.this$0 = n91Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            n91 n91Var = this.this$0;
            int i = n91Var.g + 1;
            n91Var.g = i;
            if (i == 1 && n91Var.j) {
                n91Var.l.d(xp0.ON_START);
                n91Var.j = false;
            }
        }
    }

    public m91(n91 n91Var) {
        this.this$0 = n91Var;
    }

    @Override // defpackage.m80, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = vf1.h;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((vf1) findFragmentByTag).g = this.this$0.n;
        }
    }

    @Override // defpackage.m80, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        n91 n91Var = this.this$0;
        int i = n91Var.h - 1;
        n91Var.h = i;
        if (i == 0) {
            Handler handler = n91Var.k;
            handler.getClass();
            handler.postDelayed(n91Var.m, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        b8.e(activity, new a(this.this$0));
    }

    @Override // defpackage.m80, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        n91 n91Var = this.this$0;
        int i = n91Var.g - 1;
        n91Var.g = i;
        if (i == 0 && n91Var.i) {
            n91Var.l.d(xp0.ON_STOP);
            n91Var.j = true;
        }
    }
}
