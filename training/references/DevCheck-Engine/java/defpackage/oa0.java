package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class oa0 extends td {
    public final /* synthetic */ ExtendedFloatingActionButton g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(ExtendedFloatingActionButton extendedFloatingActionButton, gm2 gm2Var) {
        super(extendedFloatingActionButton, gm2Var);
        this.g = extendedFloatingActionButton;
    }

    @Override // defpackage.td
    public final int c() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.td
    public final void e() {
        this.d.h = null;
        this.g.W = 0;
    }

    @Override // defpackage.td
    public final void f(Animator animator) {
        gm2 gm2Var = this.d;
        Animator animator2 = (Animator) gm2Var.h;
        if (animator2 != null) {
            animator2.cancel();
        }
        gm2Var.h = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.W = 2;
    }

    @Override // defpackage.td
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.td
    public final boolean h() {
        sd sdVar = ExtendedFloatingActionButton.p0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.W;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }
}
