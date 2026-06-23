package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g20 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f313a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ up1 d;
    public final /* synthetic */ i20 e;

    public g20(ViewGroup viewGroup, View view, boolean z, up1 up1Var, i20 i20Var) {
        this.f313a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = up1Var;
        this.e = i20Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f313a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        up1 up1Var = this.d;
        if (z) {
            d51.b(view, up1Var.f1051a);
        }
        this.e.e();
        if (ae0.H(2)) {
            Objects.toString(up1Var);
        }
    }
}
