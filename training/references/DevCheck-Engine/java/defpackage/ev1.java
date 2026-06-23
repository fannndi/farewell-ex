package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class ev1 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f251a;
    public final /* synthetic */ fv1 b;

    public ev1(fv1 fv1Var, View view) {
        this.b = fv1Var;
        this.f251a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f251a;
        if (view2.getVisibility() == 0) {
            this.b.c(view2);
        }
    }
}
