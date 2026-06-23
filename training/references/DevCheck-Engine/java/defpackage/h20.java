package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h20 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ up1 f360a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ View c;
    public final /* synthetic */ i20 d;

    public h20(up1 up1Var, ViewGroup viewGroup, View view, i20 i20Var) {
        this.f360a = up1Var;
        this.b = viewGroup;
        this.c = view;
        this.d = i20Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.b.post(new wa(6, this));
        if (ae0.H(2)) {
            Objects.toString(this.f360a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (ae0.H(2)) {
            Objects.toString(this.f360a);
        }
    }
}
