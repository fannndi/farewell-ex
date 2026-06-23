package defpackage;

import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.view.menu.MenuBuilder;

/* loaded from: classes.dex */
public final class qz1 implements oz1, ow0 {
    public final /* synthetic */ rz1 g;

    @Override // defpackage.ow0
    public void H(MenuBuilder menuBuilder) {
        rz1 rz1Var = this.g;
        boolean o = rz1Var.u.f1015a.o();
        Window.Callback callback = rz1Var.v;
        if (o) {
            callback.onPanelClosed(108, menuBuilder);
        } else if (callback.onPreparePanel(0, null, menuBuilder)) {
            callback.onMenuOpened(108, menuBuilder);
        }
    }

    @Override // defpackage.ow0
    public boolean x(MenuBuilder menuBuilder, MenuItem menuItem) {
        return false;
    }
}
