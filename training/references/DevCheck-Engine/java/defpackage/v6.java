package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class v6 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ i0 g;
    public final /* synthetic */ w6 h;

    public v6(w6 w6Var, i0 i0Var) {
        this.h = w6Var;
        this.g = i0Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.h.M.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.g);
        }
    }
}
