package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class p72 extends hx {

    /* renamed from: a, reason: collision with root package name */
    public q72 f775a;
    public int b = 0;

    public p72() {
    }

    public p72(int i) {
    }

    @Override // defpackage.hx
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        x(coordinatorLayout, view, i);
        if (this.f775a == null) {
            this.f775a = new q72(view);
        }
        q72 q72Var = this.f775a;
        View view2 = q72Var.f822a;
        q72Var.b = view2.getTop();
        q72Var.c = view2.getLeft();
        this.f775a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.f775a.b(i2);
        this.b = 0;
        return true;
    }

    public final int w() {
        q72 q72Var = this.f775a;
        if (q72Var != null) {
            return q72Var.d;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.p(view, i);
    }
}
