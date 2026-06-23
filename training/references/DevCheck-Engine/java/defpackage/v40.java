package defpackage;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import flar2.devcheck.systemGraphs.widgets.RealtimeLineChartView;
import java.util.Locale;

/* loaded from: classes.dex */
public class v40 extends ld0 {
    public lu1 d0;
    public RealtimeLineChartView e0;
    public TextView f0;
    public View g0;
    public int h0;
    public int i0;
    public RealtimeLineChartView j0;
    public View k0;

    public static String u0(float f) {
        return f >= 1024.0f ? String.format(Locale.getDefault(), "%.1f MB/s", Float.valueOf(f / 1024.0f)) : String.format(Locale.getDefault(), "%.0f kB/s", Float.valueOf(f));
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_system_graphs_disk, viewGroup, false);
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
        this.d0 = (lu1) grVar.t(a2, bPnJ.XhweOxIGcBuy.concat(b));
        View findViewById = inflate.findViewById(R.id.disk_storage_card);
        this.d0.E.e(D(), new ky((TextView) findViewById.findViewById(R.id.used), (TextView) findViewById.findViewById(R.id.total), (ProgressBar) findViewById.findViewById(R.id.pbPercent), (TextView) findViewById.findViewById(R.id.item_data_size), (TextView) findViewById.findViewById(R.id.item_system_size), (TextView) findViewById.findViewById(R.id.item_free_size)));
        this.g0 = inflate.findViewById(R.id.disk_throughput_card);
        TypedArray obtainStyledAttributes = i0().obtainStyledAttributes(new int[]{R.attr.colorPrimary});
        try {
            int color = obtainStyledAttributes.getColor(0, -14776091);
            obtainStyledAttributes.recycle();
            this.h0 = color;
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            fArr[0] = ((fArr[0] - 90.0f) + 360.0f) % 360.0f;
            this.i0 = Color.HSVToColor(fArr);
            this.f0 = (TextView) this.g0.findViewById(R.id.chart_subtitle);
            RealtimeLineChartView realtimeLineChartView = (RealtimeLineChartView) this.g0.findViewById(R.id.chart);
            this.e0 = realtimeLineChartView;
            realtimeLineChartView.a(this.h0);
            realtimeLineChartView.a(this.i0);
            realtimeLineChartView.f();
            realtimeLineChartView.setMinYRange(100.0f);
            realtimeLineChartView.setUnitFormatter(new rw(13));
            realtimeLineChartView.setFillUnderPrimary(true);
            realtimeLineChartView.setYNonNegative(true);
            realtimeLineChartView.setAutoYNiceSnap(true);
            realtimeLineChartView.setGridLineCount(3);
            this.g0.setVisibility(8);
            View findViewById2 = inflate.findViewById(R.id.disk_pressure_card);
            this.k0 = findViewById2;
            ((TextView) findViewById2.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_disk_pressure);
            RealtimeLineChartView realtimeLineChartView2 = (RealtimeLineChartView) this.k0.findViewById(R.id.chart);
            this.j0 = realtimeLineChartView2;
            realtimeLineChartView2.a(this.h0);
            RealtimeLineChartView realtimeLineChartView3 = this.j0;
            obtainStyledAttributes = i0().obtainStyledAttributes(new int[]{R.attr.dashboard_red});
            try {
                int color2 = obtainStyledAttributes.getColor(0, -1754827);
                obtainStyledAttributes.recycle();
                realtimeLineChartView3.a(color2);
                this.j0.f();
                this.j0.setMinYRange(5.0f);
                this.j0.setYNonNegative(true);
                this.j0.setUnitFormatter(new rw(12));
                this.j0.setFillUnderPrimary(false);
                this.j0.setGridLineCount(4);
                this.j0.setValueLabel((TextView) this.k0.findViewById(R.id.chart_subtitle));
                this.k0.setVisibility(8);
                this.d0.w.e(D(), new bh(2, this, inflate.findViewById(R.id.loading_progress), inflate.findViewById(R.id.sg_scroll)));
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
        lu1Var.e.R(lu1Var.i);
        lu1 lu1Var2 = this.d0;
        lu1Var2.e.R(lu1Var2.r);
        RealtimeLineChartView realtimeLineChartView = this.e0;
        if (realtimeLineChartView != null) {
            realtimeLineChartView.i();
        }
        RealtimeLineChartView realtimeLineChartView2 = this.j0;
        if (realtimeLineChartView2 != null) {
            realtimeLineChartView2.i();
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        lu1 lu1Var = this.d0;
        lu1Var.e.M(lu1Var.i);
        lu1 lu1Var2 = this.d0;
        nr1 nr1Var = lu1Var2.r;
        nr1Var.c = 0L;
        lu1Var2.e.M(nr1Var);
        RealtimeLineChartView realtimeLineChartView = this.e0;
        if (realtimeLineChartView != null) {
            realtimeLineChartView.h();
        }
        RealtimeLineChartView realtimeLineChartView2 = this.j0;
        if (realtimeLineChartView2 != null) {
            realtimeLineChartView2.h();
        }
    }
}
