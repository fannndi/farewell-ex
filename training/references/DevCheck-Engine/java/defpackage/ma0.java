package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class ma0 extends td {
    public final pa0 g;
    public final boolean h;
    public final /* synthetic */ ExtendedFloatingActionButton i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(ExtendedFloatingActionButton extendedFloatingActionButton, gm2 gm2Var, pa0 pa0Var, boolean z) {
        super(extendedFloatingActionButton, gm2Var);
        this.i = extendedFloatingActionButton;
        this.g = pa0Var;
        this.h = z;
    }

    @Override // defpackage.td
    public final AnimatorSet a() {
        dy0 dy0Var = this.f;
        if (dy0Var == null) {
            if (this.e == null) {
                this.e = dy0.b(this.f981a, c());
            }
            dy0Var = this.e;
            dy0Var.getClass();
        }
        boolean f = dy0Var.f("width");
        pa0 pa0Var = this.g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        if (f) {
            PropertyValuesHolder[] e = dy0Var.e("width");
            e[0].setFloatValues(extendedFloatingActionButton.getWidth(), pa0Var.k());
            dy0Var.g("width", e);
        }
        if (dy0Var.f("height")) {
            PropertyValuesHolder[] e2 = dy0Var.e("height");
            e2[0].setFloatValues(extendedFloatingActionButton.getHeight(), pa0Var.a());
            dy0Var.g("height", e2);
        }
        if (dy0Var.f("paddingStart")) {
            PropertyValuesHolder[] e3 = dy0Var.e("paddingStart");
            e3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), pa0Var.e());
            dy0Var.g("paddingStart", e3);
        }
        if (dy0Var.f("paddingEnd")) {
            PropertyValuesHolder[] e4 = dy0Var.e("paddingEnd");
            e4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), pa0Var.c());
            dy0Var.g("paddingEnd", e4);
        }
        if (dy0Var.f("labelOpacity")) {
            PropertyValuesHolder[] e5 = dy0Var.e("labelOpacity");
            int alpha = Color.alpha(extendedFloatingActionButton.getCurrentOriginalTextColor());
            e5[0].setFloatValues(alpha != 0 ? Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / alpha : 0.0f, this.h ? 1.0f : 0.0f);
            dy0Var.g("labelOpacity", e5);
        }
        return b(dy0Var);
    }

    @Override // defpackage.td
    public final int c() {
        return this.h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.td
    public final void e() {
        this.d.h = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.k0 = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        pa0 pa0Var = this.g;
        layoutParams.width = pa0Var.l().width;
        layoutParams.height = pa0Var.l().height;
    }

    @Override // defpackage.td
    public final void f(Animator animator) {
        gm2 gm2Var = this.d;
        Animator animator2 = (Animator) gm2Var.h;
        if (animator2 != null) {
            animator2.cancel();
        }
        gm2Var.h = animator;
        boolean z = this.h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        extendedFloatingActionButton.j0 = z;
        extendedFloatingActionButton.k0 = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
        extendedFloatingActionButton.A();
    }

    @Override // defpackage.td
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        boolean z = this.h;
        extendedFloatingActionButton.j0 = z;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z) {
            extendedFloatingActionButton.n0 = layoutParams.width;
            extendedFloatingActionButton.o0 = layoutParams.height;
        }
        pa0 pa0Var = this.g;
        layoutParams.width = pa0Var.l().width;
        layoutParams.height = pa0Var.l().height;
        if (z) {
            extendedFloatingActionButton.z(extendedFloatingActionButton.m0);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.z(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(pa0Var.e(), extendedFloatingActionButton.getPaddingTop(), pa0Var.c(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
        extendedFloatingActionButton.A();
    }

    @Override // defpackage.td
    public final boolean h() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.i;
        return this.h == extendedFloatingActionButton.j0 || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
