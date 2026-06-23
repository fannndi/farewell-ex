package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public final class qm1 implements Runnable {
    public final /* synthetic */ int g = 1;
    public boolean h;
    public final Object i;
    public final Object j;

    public qm1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.j = swipeDismissBehavior;
        this.i = view;
        this.h = z;
    }

    public qm1(gq0 gq0Var, xp0 xp0Var) {
        gq0Var.getClass();
        xp0Var.getClass();
        this.i = gq0Var;
        this.j = xp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ke keVar;
        int i = this.g;
        Object obj = this.j;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                if (!this.h) {
                    ((gq0) obj2).d((xp0) obj);
                    this.h = true;
                    break;
                }
                break;
            default:
                View view = (View) obj2;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                b72 b72Var = swipeDismissBehavior.f141a;
                if (b72Var != null && b72Var.f()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.h && (keVar = swipeDismissBehavior.b) != null) {
                    keVar.a(view);
                    break;
                }
                break;
        }
    }
}
