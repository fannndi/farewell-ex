package defpackage;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class vw0 implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f1102a;
    public final /* synthetic */ ww0 b;

    public vw0(ww0 ww0Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = ww0Var;
        this.f1102a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f1102a.onMenuItemActionCollapse(this.b.h(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f1102a.onMenuItemActionExpand(this.b.h(menuItem));
    }
}
