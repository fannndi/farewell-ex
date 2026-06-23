package defpackage;

import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* loaded from: classes.dex */
public final class ot0 implements u72 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomNavigationView f757a;
    public final /* synthetic */ View b;

    public ot0(BottomNavigationView bottomNavigationView, View view) {
        this.f757a = bottomNavigationView;
        this.b = view;
    }

    @Override // defpackage.u72
    public final void a(int i) {
    }

    @Override // defpackage.u72
    public final void b(int i) {
    }

    @Override // defpackage.u72
    public final void c(int i, float f) {
        View view = this.b;
        BottomNavigationView bottomNavigationView = this.f757a;
        if (i == 5) {
            float f2 = 1.0f - (f * 3.5f);
            bottomNavigationView.setAlpha(f2);
            view.setAlpha(f2);
            if (bottomNavigationView.getAlpha() == 0.0f) {
                bottomNavigationView.setVisibility(8);
                return;
            } else {
                bottomNavigationView.setVisibility(0);
                return;
            }
        }
        if (i != 4) {
            bottomNavigationView.setAlpha(0.0f);
            view.setAlpha(0.0f);
            bottomNavigationView.setVisibility(8);
            return;
        }
        float f3 = 1.0f - ((1.0f - f) * 3.5f);
        bottomNavigationView.setAlpha(f3);
        view.setAlpha(f3);
        if (f == 0.0f) {
            bottomNavigationView.setVisibility(8);
        } else {
            bottomNavigationView.setVisibility(0);
        }
    }
}
