package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class g10 {
    public static final za0 d = new za0(2);
    public static final za0 e = new za0(0);

    /* renamed from: a, reason: collision with root package name */
    public final View f311a;
    public boolean b = true;
    public boolean c;

    public g10(View view) {
        this.f311a = view;
    }

    public final void a(View view, View view2) {
        if (this.b) {
            return;
        }
        this.b = true;
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        za0 za0Var = d;
        duration.setInterpolator(za0Var).start();
        view2.animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(za0Var).start();
    }
}
