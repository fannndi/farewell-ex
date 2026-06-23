package defpackage;

import android.view.ActionProvider;
import androidx.appcompat.view.menu.MenuBuilder;

/* loaded from: classes.dex */
public final class tw0 implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public h70 f1012a;
    public final ActionProvider b;

    public tw0(ww0 ww0Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        h70 h70Var = this.f1012a;
        if (h70Var != null) {
            MenuBuilder menuBuilder = ((sw0) h70Var.g).n;
            menuBuilder.h = true;
            menuBuilder.p(true);
        }
    }
}
