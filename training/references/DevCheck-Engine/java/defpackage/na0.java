package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class na0 extends td {
    public boolean g;
    public final /* synthetic */ ExtendedFloatingActionButton h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(ExtendedFloatingActionButton extendedFloatingActionButton, gm2 gm2Var) {
        super(extendedFloatingActionButton, gm2Var);
        this.h = extendedFloatingActionButton;
    }

    @Override // defpackage.td
    public final int c() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.td
    public final void d() {
        super.d();
        this.g = true;
    }

    @Override // defpackage.td
    public final void e() {
        this.d.h = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        extendedFloatingActionButton.W = 0;
        if (this.g) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // defpackage.td
    public final void f(Animator animator) {
        gm2 gm2Var = this.d;
        Animator animator2 = (Animator) gm2Var.h;
        if (animator2 != null) {
            animator2.cancel();
        }
        gm2Var.h = animator;
        this.g = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.W = 1;
    }

    @Override // defpackage.td
    public final void g() {
        this.h.setVisibility(8);
    }

    @Override // defpackage.td
    public final boolean h() {
        sd sdVar = ExtendedFloatingActionButton.p0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.W;
        if (visibility == 0) {
            if (i != 1) {
                return false;
            }
        } else if (i == 2) {
            return false;
        }
        return true;
    }
}
