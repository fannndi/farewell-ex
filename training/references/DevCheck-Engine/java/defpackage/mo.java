package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;

/* loaded from: classes.dex */
public final class mo implements Runnable {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public mo(View view, ma2 ma2Var, zf zfVar, ValueAnimator valueAnimator) {
        this.h = view;
        this.i = ma2Var;
        this.j = zfVar;
        this.k = valueAnimator;
    }

    public mo(gm2 gm2Var, no noVar, sw0 sw0Var, MenuBuilder menuBuilder) {
        this.k = gm2Var;
        this.h = noVar;
        this.i = sw0Var;
        this.j = menuBuilder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                oo ooVar = (oo) ((gm2) obj).h;
                sw0 sw0Var = (sw0) obj3;
                no noVar = (no) obj4;
                if (noVar != null) {
                    ooVar.G = true;
                    noVar.b.c(false);
                    ooVar.G = false;
                }
                if (sw0Var.isEnabled() && sw0Var.hasSubMenu()) {
                    ((MenuBuilder) obj2).q(sw0Var, null, 4);
                    break;
                }
                break;
            default:
                ia2.i((View) obj4, (ma2) obj3, (zf) obj2);
                ((ValueAnimator) obj).start();
                break;
        }
    }
}
