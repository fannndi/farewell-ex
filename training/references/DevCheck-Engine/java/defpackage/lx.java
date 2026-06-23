package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class lx implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout g;

    public lx(CoordinatorLayout coordinatorLayout) {
        this.g = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.g.o(0);
        return true;
    }
}
