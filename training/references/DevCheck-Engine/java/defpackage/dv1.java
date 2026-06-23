package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class dv1 implements u72 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f210a;
    public int b;
    public int c;

    public dv1(TabLayout tabLayout) {
        this.f210a = new WeakReference(tabLayout);
    }

    @Override // defpackage.u72
    public final void a(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.f210a.get();
        if (tabLayout != null) {
            tabLayout.d0 = this.c;
        }
    }

    @Override // defpackage.u72
    public final void b(int i) {
        TabLayout tabLayout = (TabLayout) this.f210a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.l(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }

    @Override // defpackage.u72
    public final void c(int i, float f) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.f210a.get();
        if (tabLayout != null) {
            int i2 = this.c;
            boolean z2 = true;
            if (i2 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i2 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.n(i, f, z2, z, false);
        }
    }
}
