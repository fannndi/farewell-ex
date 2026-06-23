package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class m2 implements Application.ActivityLifecycleCallbacks {
    public Object g;
    public Activity h;
    public final int i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;

    public m2(Activity activity) {
        this.h = activity;
        this.i = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.h == activity) {
            this.h = null;
            this.k = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.k || this.l || this.j) {
            return;
        }
        Object obj = this.g;
        try {
            Object obj2 = n2.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.i) {
                n2.g.postAtFrontOfQueue(new hk2(n2.b.get(activity), 4, obj2));
                this.l = true;
                this.g = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.h == activity) {
            this.j = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
