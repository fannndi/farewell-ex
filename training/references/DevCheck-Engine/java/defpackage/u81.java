package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.R;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;

/* loaded from: classes.dex */
public abstract class u81 extends ld0 {
    public a91 e0;
    public RecyclerView f0;
    public boolean g0;
    public boolean h0;
    public final t81 d0 = new t81(this);
    public int i0 = R.layout.preference_list_fragment;
    public final k3 j0 = new k3(this, Looper.getMainLooper());
    public final wa k0 = new wa(17, this);

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        TypedValue typedValue = new TypedValue();
        i0().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        i0().getTheme().applyStyle(i, false);
        a91 a91Var = new a91(i0());
        this.e0 = a91Var;
        a91Var.j = this;
        Bundle bundle2 = this.m;
        u0(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = i0().obtainStyledAttributes(null, vb1.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.i0 = obtainStyledAttributes.getResourceId(0, this.i0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(i0());
        View inflate = cloneInContext.inflate(this.i0, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            c.n(hTYJVDOvZnZlYL.cTKwlfCR);
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!i0().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            i0();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAccessibilityDelegateCompat(new b91(recyclerView));
        }
        this.f0 = recyclerView;
        t81 t81Var = this.d0;
        recyclerView.i(t81Var);
        if (drawable != null) {
            t81Var.getClass();
            t81Var.b = drawable.getIntrinsicHeight();
        } else {
            t81Var.b = 0;
        }
        t81Var.f971a = drawable;
        u81 u81Var = t81Var.d;
        RecyclerView recyclerView2 = u81Var.f0;
        if (recyclerView2.v.size() != 0) {
            de1 de1Var = recyclerView2.t;
            if (de1Var != null) {
                de1Var.c("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView2.T();
            recyclerView2.requestLayout();
        }
        if (dimensionPixelSize != -1) {
            t81Var.b = dimensionPixelSize;
            RecyclerView recyclerView3 = u81Var.f0;
            if (recyclerView3.v.size() != 0) {
                de1 de1Var2 = recyclerView3.t;
                if (de1Var2 != null) {
                    de1Var2.c("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView3.T();
                recyclerView3.requestLayout();
            }
        }
        t81Var.c = z;
        if (this.f0.getParent() == null) {
            viewGroup2.addView(this.f0);
        }
        this.j0.post(this.k0);
        return inflate;
    }

    @Override // defpackage.ld0
    public final void Q() {
        wa waVar = this.k0;
        k3 k3Var = this.j0;
        k3Var.removeCallbacks(waVar);
        k3Var.removeMessages(1);
        if (this.g0) {
            this.f0.setAdapter(null);
            PreferenceScreen preferenceScreen = this.e0.g;
            if (preferenceScreen != null) {
                preferenceScreen.m();
            }
        }
        this.f0 = null;
        this.K = true;
    }

    @Override // defpackage.ld0
    public final void Z(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.e0.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.ld0
    public final void a0() {
        this.K = true;
        a91 a91Var = this.e0;
        a91Var.h = this;
        a91Var.i = this;
    }

    @Override // defpackage.ld0
    public final void b0() {
        this.K = true;
        a91 a91Var = this.e0;
        a91Var.h = null;
        a91Var.i = null;
    }

    @Override // defpackage.ld0
    public final void c0(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.e0.g) != null) {
            preferenceScreen2.a(bundle2);
        }
        if (this.g0 && (preferenceScreen = this.e0.g) != null) {
            this.f0.setAdapter(new x81(preferenceScreen));
            preferenceScreen.i();
        }
        this.h0 = true;
    }

    public abstract void u0(String str);
}
