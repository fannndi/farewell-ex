package defpackage;

import android.os.Handler;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class qi0 implements Runnable {
    public final /* synthetic */ int g;
    public Object h;
    public Object i;
    public Object j;

    public /* synthetic */ qi0() {
        this.g = 1;
    }

    public /* synthetic */ qi0(fi2 fi2Var, Object obj, Object obj2, int i) {
        this.g = i;
        this.h = fi2Var;
        this.i = obj;
        this.j = obj2;
    }

    public qi0(ri0 ri0Var, CoordinatorLayout coordinatorLayout, View view) {
        this.g = 0;
        this.j = ri0Var;
        this.h = coordinatorLayout;
        this.i = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OverScroller overScroller;
        switch (this.g) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h;
                ri0 ri0Var = (ri0) this.j;
                View view = (View) this.i;
                if (view != null && (overScroller = ri0Var.d) != null) {
                    if (!overScroller.computeScrollOffset()) {
                        AppBarLayout appBarLayout = (AppBarLayout) view;
                        ((AppBarLayout.BaseBehavior) ri0Var).G(coordinatorLayout, appBarLayout);
                        if (appBarLayout.r) {
                            appBarLayout.f(appBarLayout.g(AppBarLayout.BaseBehavior.D(coordinatorLayout)));
                            break;
                        }
                    } else {
                        ri0Var.A(coordinatorLayout, view, ri0Var.d.getCurrY());
                        view.postOnAnimation(this);
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                try {
                    obj = ((qc0) this.h).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.j).post(new hk2((rc0) this.i, 12, obj));
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((fi2) this.h).z((kb1) this.i, (wb) this.j);
                break;
            default:
                ((fi2) this.h).y((o1) this.i, (tb) this.j);
                break;
        }
    }
}
