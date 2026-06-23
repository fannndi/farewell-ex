package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class da2 extends k32 {
    public final /* synthetic */ int j;
    public final /* synthetic */ fa2 k;

    public /* synthetic */ da2(fa2 fa2Var, int i) {
        this.j = i;
        this.k = fa2Var;
    }

    @Override // defpackage.l82
    public final void a() {
        View view;
        int i = this.j;
        fa2 fa2Var = this.k;
        switch (i) {
            case 0:
                if (fa2Var.I && (view = fa2Var.A) != null) {
                    view.setTranslationY(0.0f);
                    fa2Var.x.setTranslationY(0.0f);
                }
                fa2Var.x.setVisibility(8);
                fa2Var.x.setTransitioning(false);
                fa2Var.M = null;
                i8 i8Var = fa2Var.E;
                if (i8Var != null) {
                    i8Var.u(fa2Var.D);
                    fa2Var.D = null;
                    fa2Var.E = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = fa2Var.w;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = y62.f1215a;
                    actionBarOverlayLayout.requestApplyInsets();
                    break;
                }
                break;
            default:
                fa2Var.M = null;
                fa2Var.x.requestLayout();
                break;
        }
    }
}
