package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.e;

/* loaded from: classes.dex */
public final class jv0<S> extends g71 {
    public int e0;
    public zm f0;
    public ay0 g0;
    public int h0;
    public fh i0;
    public RecyclerView j0;
    public RecyclerView k0;
    public View l0;
    public View m0;
    public View n0;
    public View o0;
    public MaterialButton p0;
    public AccessibilityManager q0;
    public y51 r0;
    public boolean s0;

    public static boolean v0(jv0 jv0Var, boolean z) {
        ay0 ay0Var;
        if (jv0Var.s0) {
            return false;
        }
        if (jv0Var.k0.getScrollState() != 0) {
            return true;
        }
        e eVar = (e) jv0Var.k0.getAdapter();
        if (eVar == null || (ay0Var = jv0Var.g0) == null) {
            return false;
        }
        int w = eVar.w(ay0Var) + (z ? 1 : -1);
        if (w < 0 || w >= eVar.d.m) {
            return false;
        }
        eVar.i = z ? 2 : 1;
        jv0Var.w0(eVar.v(w));
        return true;
    }

    public final void A0(int i) {
        View view = this.m0;
        if (view != null) {
            view.setEnabled(i + 1 < this.k0.getAdapter().c());
        }
        View view2 = this.l0;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.e0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            rw.b();
            return;
        }
        this.f0 = (zm) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.g0 = (ay0) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            rw.b();
        }
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(v(), this.e0);
        this.i0 = new fh(contextThemeWrapper, 10);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.q0 = (AccessibilityManager) i0().getSystemService("accessibility");
        ay0 ay0Var = this.f0.g;
        boolean C0 = rv0.C0(contextThemeWrapper, R.attr.windowFullscreen);
        this.s0 = C0;
        int i3 = 0;
        int i4 = 1;
        if (C0) {
            i = flar2.devcheck.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = flar2.devcheck.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = i0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(flar2.devcheck.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(flar2.devcheck.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(flar2.devcheck.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(flar2.devcheck.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = by0.j;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(flar2.devcheck.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(flar2.devcheck.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(flar2.devcheck.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(flar2.devcheck.R.id.mtrl_calendar_days_of_week);
        y62.o(gridView, new fv0(i3));
        int i6 = this.f0.k;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new b10(i6) : new b10()));
        gridView.setNumColumns(ay0Var.j);
        gridView.setEnabled(false);
        this.k0 = (RecyclerView) inflate.findViewById(flar2.devcheck.R.id.mtrl_calendar_months);
        this.k0.setLayoutManager(new gv0(this, i2, i2));
        this.k0.setTag("MONTHS_VIEW_GROUP_TAG");
        e eVar = new e(contextThemeWrapper, this.f0, new hv0(this), new hv0(this));
        this.k0.setAdapter(eVar);
        int integer = contextThemeWrapper.getResources().getInteger(flar2.devcheck.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(flar2.devcheck.R.id.mtrl_calendar_year_selector_frame);
        this.j0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.j0.setLayoutManager(new GridLayoutManager(integer));
            this.j0.setAdapter(new kd2(this));
            RecyclerView recyclerView2 = this.j0;
            iv0 iv0Var = new iv0();
            l52.c(null);
            l52.c(null);
            recyclerView2.i(iv0Var);
        }
        if (!this.s0) {
            y51 y51Var = new y51();
            this.r0 = y51Var;
            y51Var.a(this.k0);
        }
        if (inflate.findViewById(flar2.devcheck.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(flar2.devcheck.R.id.month_navigation_fragment_toggle);
            this.p0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            y62.o(this.p0, new le(6, this));
            View findViewById = inflate.findViewById(flar2.devcheck.R.id.month_navigation_previous);
            this.l0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            ym0.z(this.l0, A(flar2.devcheck.R.string.mtrl_picker_prev_month_tooltip));
            View findViewById2 = inflate.findViewById(flar2.devcheck.R.id.month_navigation_next);
            this.m0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            ym0.z(this.m0, A(flar2.devcheck.R.string.mtrl_picker_next_month_tooltip));
            this.n0 = inflate.findViewById(flar2.devcheck.R.id.mtrl_calendar_year_selector_frame);
            this.o0 = inflate.findViewById(flar2.devcheck.R.id.mtrl_calendar_day_selector_frame);
            x0(1);
            this.p0.setText(this.g0.c());
            this.k0.j(new aj(this, eVar, i4));
            this.p0.setOnClickListener(new q1(3, this));
            this.m0.setOnClickListener(new ev0(this, eVar, i3));
            this.l0.setOnClickListener(new ev0(this, eVar, i4));
            A0(eVar.w(this.g0));
        }
        this.k0.i0(eVar.w(this.g0));
        y62.o(this.k0, new fv0(i4));
        y0(inflate);
        return inflate;
    }

    @Override // defpackage.ld0
    public final void Z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.e0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.g0);
    }

    @Override // defpackage.g71
    public final void u0(j70 j70Var) {
        this.d0.add(j70Var);
    }

    public final void w0(ay0 ay0Var) {
        e eVar = (e) this.k0.getAdapter();
        int w = eVar.w(ay0Var);
        AccessibilityManager accessibilityManager = this.q0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int w2 = w - eVar.w(this.g0);
            int i = 3;
            boolean z = Math.abs(w2) > 3;
            boolean z2 = w2 > 0;
            this.g0 = ay0Var;
            if (z && z2) {
                this.k0.i0(w - 3);
                this.k0.post(new ce(w, i, this));
            } else {
                RecyclerView recyclerView = this.k0;
                if (z) {
                    recyclerView.i0(w + 3);
                    this.k0.post(new ce(w, i, this));
                } else {
                    recyclerView.post(new ce(w, i, this));
                }
            }
        } else {
            this.g0 = ay0Var;
            this.k0.i0(w);
        }
        z0();
        A0(w);
    }

    public final void x0(int i) {
        this.h0 = i;
        if (i == 2) {
            this.j0.getLayoutManager().s0(this.g0.i - ((kd2) this.j0.getAdapter()).d.f0.g.i);
            this.n0.setVisibility(0);
            this.o0.setVisibility(8);
            this.l0.setVisibility(8);
            this.m0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.n0.setVisibility(8);
            this.o0.setVisibility(0);
            this.l0.setVisibility(0);
            this.m0.setVisibility(0);
            w0(this.g0);
        }
    }

    public final void y0(View view) {
        if (view == null) {
            return;
        }
        int i = this.h0;
        if (i == 2) {
            y62.p(view, A(flar2.devcheck.R.string.mtrl_picker_pane_title_year_view));
        } else if (i == 1) {
            y62.p(view, A(flar2.devcheck.R.string.mtrl_picker_pane_title_calendar_view));
        }
    }

    public final void z0() {
        ay0 ay0Var;
        e eVar = (e) this.k0.getAdapter();
        if (eVar == null || this.s0 || (ay0Var = this.g0) == null || ay0Var.equals(eVar.h)) {
            return;
        }
        int w = eVar.w(eVar.h);
        eVar.h = ay0Var;
        int w2 = eVar.w(ay0Var);
        eVar.g(w);
        eVar.g(w2);
    }
}
