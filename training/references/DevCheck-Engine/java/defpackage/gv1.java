package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class gv1 extends a82 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f354a;
    public int c = 0;
    public int b = 0;

    public gv1(TabLayout tabLayout) {
        this.f354a = new WeakReference(tabLayout);
    }

    @Override // defpackage.a82
    public final void a(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.f354a.get();
        if (tabLayout != null) {
            tabLayout.d0 = this.c;
        }
    }

    @Override // defpackage.a82
    public final void b(int i, float f, int i2) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.f354a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z2 = true;
            if (i3 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.n(i, f, z2, z, false);
        }
    }

    @Override // defpackage.a82
    public final void c(int i) {
        TabLayout tabLayout = (TabLayout) this.f354a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.l(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
