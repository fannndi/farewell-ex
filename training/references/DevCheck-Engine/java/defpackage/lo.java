package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class lo implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lo(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                a90 a90Var = (a90) obj;
                AccessibilityManager accessibilityManager = a90Var.z;
                if (a90Var.A != null && accessibilityManager != null && a90Var.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(a90Var.A);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = y62.f1215a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                oo ooVar = (oo) obj;
                ViewTreeObserver viewTreeObserver = ooVar.E;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        ooVar.E = view.getViewTreeObserver();
                    }
                    ooVar.E.removeGlobalOnLayoutListener(ooVar.p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                a90 a90Var = (a90) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = a90Var.A;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = a90Var.z) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                break;
            case 3:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                dj0 dj0Var = hideBottomViewOnScrollBehavior.h;
                if (dj0Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(dj0Var);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                dj0 dj0Var2 = hideViewOnScrollBehavior.c;
                if (dj0Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(dj0Var2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            default:
                tq1 tq1Var = (tq1) obj;
                ViewTreeObserver viewTreeObserver2 = tq1Var.v;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        tq1Var.v = view.getViewTreeObserver();
                    }
                    tq1Var.v.removeGlobalOnLayoutListener(tq1Var.p);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
