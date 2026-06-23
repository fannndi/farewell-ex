package defpackage;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class kz1 implements g2, ow0 {
    public final /* synthetic */ Toolbar g;

    public /* synthetic */ kz1(Toolbar toolbar) {
        this.g = toolbar;
    }

    @Override // defpackage.ow0
    public void H(MenuBuilder menuBuilder) {
        Toolbar toolbar = this.g;
        d2 d2Var = toolbar.g.z;
        if (d2Var == null || !d2Var.i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.M.i).iterator();
            while (it.hasNext()) {
                ((ud0) it.next()).f1036a.s(menuBuilder);
            }
        }
        qz1 qz1Var = toolbar.U;
        if (qz1Var != null) {
            qz1Var.H(menuBuilder);
        }
    }

    @Override // defpackage.ow0
    public boolean x(MenuBuilder menuBuilder, MenuItem menuItem) {
        return false;
    }
}
