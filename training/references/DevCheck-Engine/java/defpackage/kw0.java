package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.systemGraphs.widgets.RealtimeLineChartView;

/* loaded from: classes.dex */
public class kw0 extends ld0 {
    public lu1 d0;
    public RealtimeLineChartView e0;
    public RealtimeLineChartView f0;
    public RealtimeLineChartView g0;
    public RealtimeLineChartView h0;
    public RealtimeLineChartView i0;
    public RealtimeLineChartView j0;
    public View k0;
    public View l0;
    public View m0;
    public TextView n0;
    public View o0;
    public TextView p0;
    public TextView q0;
    public TextView r0;
    public TextView s0;
    public ProgressBar t0;
    public TextView u0;
    public TextView v0;
    public TextView w0;
    public TextView x0;
    public ProgressBar y0;

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_system_graphs_memory, viewGroup, false);
        a5 g0 = g0();
        n72 l = g0.l();
        l72 g = g0.g();
        gr grVar = new gr(l, g, d51.i(g0, l, g));
        vq a2 = af1.a(lu1.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        this.d0 = (lu1) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        TypedArray obtainStyledAttributes = i0().obtainStyledAttributes(new int[]{R.attr.colorPrimary});
        try {
            int color = obtainStyledAttributes.getColor(0, -14776091);
            obtainStyledAttributes.recycle();
            View findViewById = inflate.findViewById(R.id.mem_ram_zram_card);
            this.p0 = (TextView) findViewById.findViewById(R.id.ram_title);
            this.q0 = (TextView) findViewById.findViewById(R.id.ram_total);
            this.r0 = (TextView) findViewById.findViewById(R.id.ram_available);
            this.s0 = (TextView) findViewById.findViewById(R.id.ram_secondary);
            this.t0 = (ProgressBar) findViewById.findViewById(R.id.ram_bar);
            this.p0.setText(R.string.ram);
            this.o0 = findViewById.findViewById(R.id.zram_section);
            this.u0 = (TextView) findViewById.findViewById(R.id.zram_title);
            this.v0 = (TextView) findViewById.findViewById(R.id.zram_total);
            this.w0 = (TextView) findViewById.findViewById(R.id.zram_in_use);
            this.x0 = (TextView) findViewById.findViewById(R.id.zram_compression);
            this.y0 = (ProgressBar) findViewById.findViewById(R.id.zram_bar);
            this.u0.setText(R.string.zram);
            View findViewById2 = inflate.findViewById(R.id.mem_used_card);
            ((TextView) findViewById2.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_memory_used);
            this.n0 = (TextView) findViewById2.findViewById(R.id.chart_subtitle);
            RealtimeLineChartView realtimeLineChartView = (RealtimeLineChartView) findViewById2.findViewById(R.id.chart);
            this.e0 = realtimeLineChartView;
            realtimeLineChartView.a(color);
            this.e0.f();
            this.e0.setMinYRange(500.0f);
            this.e0.setUnitFormatter(new ld1(this) { // from class: iw0
                public final /* synthetic */ kw0 h;

                {
                    this.h = this;
                }

                @Override // defpackage.ld1
                public final String c(float f) {
                    int i2 = i;
                    kw0 kw0Var = this.h;
                    switch (i2) {
                    }
                    return kw0Var.u0(f);
                }
            });
            final int i2 = 1;
            this.e0.setFillUnderPrimary(true);
            this.e0.setValueLabel(this.n0);
            this.e0.setYNonNegative(true);
            this.e0.setUseExplicitYBoundsLabels(true);
            this.e0.setGridLineCount(4);
            View findViewById3 = inflate.findViewById(R.id.mem_available_card);
            ((TextView) findViewById3.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_memory_available);
            RealtimeLineChartView realtimeLineChartView2 = (RealtimeLineChartView) findViewById3.findViewById(R.id.chart);
            this.f0 = realtimeLineChartView2;
            realtimeLineChartView2.a(color);
            this.f0.f();
            this.f0.setMinYRange(500.0f);
            this.f0.setUnitFormatter(new ld1(this) { // from class: iw0
                public final /* synthetic */ kw0 h;

                {
                    this.h = this;
                }

                @Override // defpackage.ld1
                public final String c(float f) {
                    int i22 = i2;
                    kw0 kw0Var = this.h;
                    switch (i22) {
                    }
                    return kw0Var.u0(f);
                }
            });
            this.f0.setFillUnderPrimary(true);
            this.f0.setValueLabel((TextView) findViewById3.findViewById(R.id.chart_subtitle));
            this.f0.setYNonNegative(true);
            this.f0.setUseExplicitYBoundsLabels(true);
            this.f0.setGridLineCount(4);
            View findViewById4 = inflate.findViewById(R.id.mem_cached_card);
            ((TextView) findViewById4.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_memory_cached);
            RealtimeLineChartView realtimeLineChartView3 = (RealtimeLineChartView) findViewById4.findViewById(R.id.chart);
            this.g0 = realtimeLineChartView3;
            realtimeLineChartView3.a(color);
            final int i3 = 2;
            this.g0.setUnitFormatter(new ld1(this) { // from class: iw0
                public final /* synthetic */ kw0 h;

                {
                    this.h = this;
                }

                @Override // defpackage.ld1
                public final String c(float f) {
                    int i22 = i3;
                    kw0 kw0Var = this.h;
                    switch (i22) {
                    }
                    return kw0Var.u0(f);
                }
            });
            this.g0.setFillUnderPrimary(true);
            this.g0.setValueLabel((TextView) findViewById4.findViewById(R.id.chart_subtitle));
            this.g0.setYNonNegative(true);
            this.g0.setUseExplicitYBoundsLabels(true);
            this.g0.setGridLineCount(4);
            View findViewById5 = inflate.findViewById(R.id.mem_pressure_card);
            this.l0 = findViewById5;
            ((TextView) findViewById5.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_memory_pressure);
            RealtimeLineChartView realtimeLineChartView4 = (RealtimeLineChartView) this.l0.findViewById(R.id.chart);
            this.i0 = realtimeLineChartView4;
            realtimeLineChartView4.a(color);
            RealtimeLineChartView realtimeLineChartView5 = this.i0;
            obtainStyledAttributes = i0().obtainStyledAttributes(new int[]{R.attr.dashboard_red});
            try {
                int color2 = obtainStyledAttributes.getColor(0, -1754827);
                obtainStyledAttributes.recycle();
                realtimeLineChartView5.a(color2);
                this.i0.f();
                this.i0.setMinYRange(5.0f);
                this.i0.setYNonNegative(true);
                this.i0.setUnitFormatter(new rw(29));
                this.i0.setFillUnderPrimary(false);
                this.i0.setGridLineCount(4);
                this.i0.setValueLabel((TextView) this.l0.findViewById(R.id.chart_subtitle));
                this.l0.setVisibility(8);
                View findViewById6 = inflate.findViewById(R.id.mem_majfault_card);
                this.m0 = findViewById6;
                ((TextView) findViewById6.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_memory_majfault);
                RealtimeLineChartView realtimeLineChartView6 = (RealtimeLineChartView) this.m0.findViewById(R.id.chart);
                this.j0 = realtimeLineChartView6;
                realtimeLineChartView6.a(color);
                this.j0.f();
                this.j0.setMinYRange(10.0f);
                this.j0.setYNonNegative(true);
                this.j0.setUnitFormatter(new jw0(0));
                this.j0.setFillUnderPrimary(true);
                this.j0.setAutoYNiceSnap(true);
                final int i4 = 3;
                this.j0.setGridLineCount(3);
                this.j0.setValueLabel((TextView) this.m0.findViewById(R.id.chart_subtitle));
                this.m0.setVisibility(8);
                View findViewById7 = inflate.findViewById(R.id.mem_swap_card);
                this.k0 = findViewById7;
                ((TextView) findViewById7.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_memory_swap);
                RealtimeLineChartView realtimeLineChartView7 = (RealtimeLineChartView) this.k0.findViewById(R.id.chart);
                this.h0 = realtimeLineChartView7;
                realtimeLineChartView7.a(color);
                this.h0.setUnitFormatter(new ld1(this) { // from class: iw0
                    public final /* synthetic */ kw0 h;

                    {
                        this.h = this;
                    }

                    @Override // defpackage.ld1
                    public final String c(float f) {
                        int i22 = i4;
                        kw0 kw0Var = this.h;
                        switch (i22) {
                        }
                        return kw0Var.u0(f);
                    }
                });
                this.h0.setFillUnderPrimary(true);
                this.h0.setValueLabel((TextView) this.k0.findViewById(R.id.chart_subtitle));
                this.h0.setYNonNegative(true);
                this.h0.setUseExplicitYBoundsLabels(true);
                this.h0.setGridLineCount(4);
                this.k0.setVisibility(8);
                this.d0.v.e(D(), new q8((ld0) this, inflate.findViewById(R.id.loading_progress), inflate.findViewById(R.id.sg_scroll), (Object) new boolean[]{false, false}, 3));
                return inflate;
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        lu1 lu1Var = this.d0;
        lu1Var.e.R(lu1Var.h);
        this.e0.i();
        this.f0.i();
        this.g0.i();
        RealtimeLineChartView realtimeLineChartView = this.h0;
        if (realtimeLineChartView != null) {
            realtimeLineChartView.i();
        }
        RealtimeLineChartView realtimeLineChartView2 = this.i0;
        if (realtimeLineChartView2 != null) {
            realtimeLineChartView2.i();
        }
        RealtimeLineChartView realtimeLineChartView3 = this.j0;
        if (realtimeLineChartView3 != null) {
            realtimeLineChartView3.i();
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        lu1 lu1Var = this.d0;
        lu1Var.e.M(lu1Var.h);
        this.e0.h();
        this.f0.h();
        this.g0.h();
        RealtimeLineChartView realtimeLineChartView = this.h0;
        if (realtimeLineChartView != null) {
            realtimeLineChartView.h();
        }
        RealtimeLineChartView realtimeLineChartView2 = this.i0;
        if (realtimeLineChartView2 != null) {
            realtimeLineChartView2.h();
        }
        RealtimeLineChartView realtimeLineChartView3 = this.j0;
        if (realtimeLineChartView3 != null) {
            realtimeLineChartView3.h();
        }
    }

    public final String u0(float f) {
        long j = (long) (f * 1024.0f * 1024.0f);
        Context i0 = i0();
        String str = uz1.f1060a;
        return Formatter.formatFileSize(i0, j);
    }
}
