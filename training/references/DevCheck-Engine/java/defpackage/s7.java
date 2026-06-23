package defpackage;

import android.view.MenuItem;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements tt1, hl {
    public final /* synthetic */ w7 g;

    public /* synthetic */ s7(w7 w7Var) {
        this.g = w7Var;
    }

    @Override // defpackage.c11
    public boolean c(MenuItem menuItem) {
        w7 w7Var = this.g;
        if (w7Var.f0.i) {
            return false;
        }
        int itemId = menuItem.getItemId();
        e9 e9Var = e9.h;
        switch (itemId) {
            case R.id.action_all /* 2131361861 */:
                w7Var.k0.g.k(e9.j);
                break;
            case R.id.action_running /* 2131361909 */:
                w7Var.k0.g.k(e9.g);
                break;
            case R.id.action_system /* 2131361915 */:
                w7Var.k0.g.k(e9.i);
                break;
            case R.id.action_user /* 2131361922 */:
                w7Var.k0.g.k(e9Var);
                break;
            default:
                w7Var.k0.g.k(e9Var);
                break;
        }
        w7Var.f0.setRefreshing(true);
        return true;
    }

    @Override // defpackage.tt1
    public void d() {
        w7 w7Var = this.g;
        w7Var.j0 = false;
        f9 f9Var = w7Var.k0;
        f9Var.h.execute(new y8(f9Var, 1));
    }
}
