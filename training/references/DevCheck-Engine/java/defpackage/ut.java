package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ut implements bq0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ zt h;

    public /* synthetic */ ut(zt ztVar, int i) {
        this.g = i;
        this.h = ztVar;
    }

    @Override // defpackage.bq0
    public final void e(eq0 eq0Var, xp0 xp0Var) {
        switch (this.g) {
            case 0:
                if (xp0Var == xp0.ON_STOP) {
                    Window window = this.h.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                if (xp0Var == xp0.ON_DESTROY) {
                    this.h.h.b = null;
                    if (!this.h.isChangingConfigurations()) {
                        this.h.l().a();
                    }
                    xt xtVar = this.h.o;
                    zt ztVar = xtVar.j;
                    ztVar.getWindow().getDecorView().removeCallbacks(xtVar);
                    ztVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xtVar);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                zt ztVar2 = this.h;
                if (ztVar2.l == null) {
                    wt wtVar = (wt) ztVar2.getLastNonConfigurationInstance();
                    if (wtVar != null) {
                        ztVar2.l = wtVar.f1147a;
                    }
                    if (ztVar2.l == null) {
                        ztVar2.l = new n72();
                    }
                }
                ztVar2.j.f(this);
                break;
            default:
                if (xp0Var == xp0.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    l41 l41Var = this.h.n;
                    OnBackInvokedDispatcher a2 = vt.a((zt) eq0Var);
                    l41Var.getClass();
                    a2.getClass();
                    l41Var.e = a2;
                    l41Var.c(l41Var.g);
                    break;
                }
                break;
        }
    }
}
