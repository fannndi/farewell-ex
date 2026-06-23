package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class ed0 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ fd0 h;

    public /* synthetic */ ed0(fd0 fd0Var, int i) {
        this.g = i;
        this.h = fd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        fd0 fd0Var = this.h;
        switch (i) {
            case 0:
                ViewParent parent = fd0Var.j.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                fd0Var.a();
                View view = fd0Var.j;
                if (view.isEnabled() && !view.isLongClickable() && fd0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    fd0Var.m = true;
                    break;
                }
                break;
        }
    }
}
