package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class td {

    /* renamed from: a, reason: collision with root package name */
    public final Context f981a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList c = new ArrayList();
    public final gm2 d;
    public dy0 e;
    public dy0 f;

    public td(ExtendedFloatingActionButton extendedFloatingActionButton, gm2 gm2Var) {
        this.b = extendedFloatingActionButton;
        this.f981a = extendedFloatingActionButton.getContext();
        this.d = gm2Var;
    }

    public AnimatorSet a() {
        dy0 dy0Var = this.f;
        if (dy0Var == null) {
            if (this.e == null) {
                this.e = dy0.b(this.f981a, c());
            }
            dy0Var = this.e;
            dy0Var.getClass();
        }
        return b(dy0Var);
    }

    public final AnimatorSet b(dy0 dy0Var) {
        ArrayList arrayList = new ArrayList();
        String str = MiGPiFgcCQCVh.VcmjJYBQeWqS;
        boolean f = dy0Var.f(str);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (f) {
            arrayList.add(dy0Var.d(str, extendedFloatingActionButton, View.ALPHA));
        }
        if (dy0Var.f("scale")) {
            arrayList.add(dy0Var.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(dy0Var.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (dy0Var.f("width")) {
            arrayList.add(dy0Var.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.p0));
        }
        if (dy0Var.f("height")) {
            arrayList.add(dy0Var.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.q0));
        }
        if (dy0Var.f("paddingStart")) {
            arrayList.add(dy0Var.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.r0));
        }
        if (dy0Var.f("paddingEnd")) {
            arrayList.add(dy0Var.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.s0));
        }
        if (dy0Var.f("labelOpacity")) {
            arrayList.add(dy0Var.d("labelOpacity", extendedFloatingActionButton, new sd(Float.class, "LABEL_OPACITY_PROPERTY", 0)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        bw0.v(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int c();

    public void d() {
        this.d.h = null;
    }

    public abstract void e();

    public abstract void f(Animator animator);

    public abstract void g();

    public abstract boolean h();
}
