package defpackage;

import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.systemGraphs.widgets.BatteryProjectionView;
import flar2.devcheck.systemGraphs.widgets.RealtimeLineChartView;

/* loaded from: classes.dex */
public class nf extends ld0 {
    public lu1 d0;
    public RealtimeLineChartView e0;
    public RealtimeLineChartView f0;
    public RealtimeLineChartView g0;
    public RealtimeLineChartView h0;
    public RealtimeLineChartView i0;
    public RealtimeLineChartView j0;
    public boolean k0;
    public TextView l0;
    public TextView m0;
    public TextView n0;
    public ImageView o0;
    public boolean p0;
    public TextView q0;
    public TextView r0;
    public BatteryProjectionView s0;
    public TextView t0;
    public TextView u0;
    public View v0;
    public View w0;
    public View x0;
    public View y0;
    public View z0;

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_system_graphs_battery, viewGroup, false);
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
        int u0 = u0(R.attr.colorPrimary, -14776091);
        View findViewById = inflate.findViewById(R.id.bat_info_card);
        this.l0 = (TextView) findViewById.findViewById(R.id.info_title);
        this.n0 = (TextView) findViewById.findViewById(R.id.info_subtitle);
        this.m0 = (TextView) findViewById.findViewById(R.id.info_extra);
        this.o0 = (ImageView) findViewById.findViewById(R.id.info_icon);
        View findViewById2 = inflate.findViewById(R.id.bat_current_card);
        TextView textView = (TextView) findViewById2.findViewById(R.id.chart_title);
        this.q0 = textView;
        textView.setText(R.string.sysgraphs_battery_current);
        RealtimeLineChartView realtimeLineChartView = (RealtimeLineChartView) findViewById2.findViewById(R.id.chart);
        this.e0 = realtimeLineChartView;
        realtimeLineChartView.a(u0);
        this.e0.f();
        this.e0.setMinYRange(1000.0f);
        this.e0.setUnitFormatter(new c(2));
        this.e0.setFillUnderPrimary(false);
        this.e0.setReferenceLine(0.0f);
        this.e0.setValueLabel((TextView) findViewById2.findViewById(R.id.chart_subtitle));
        this.e0.setGridLineCount(4);
        View findViewById3 = inflate.findViewById(R.id.bat_voltage_card);
        this.v0 = findViewById3;
        ((TextView) findViewById3.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_battery_voltage);
        RealtimeLineChartView realtimeLineChartView2 = (RealtimeLineChartView) this.v0.findViewById(R.id.chart);
        this.f0 = realtimeLineChartView2;
        realtimeLineChartView2.a(u0);
        this.f0.g(3.0f, 4.5f);
        this.f0.setUnitFormatter(new c(3));
        this.f0.setFillUnderPrimary(true);
        this.f0.setValueLabel((TextView) this.v0.findViewById(R.id.chart_subtitle));
        this.f0.setGridLineCount(3);
        this.v0.setVisibility(8);
        View findViewById4 = inflate.findViewById(R.id.bat_power_card);
        this.w0 = findViewById4;
        TextView textView2 = (TextView) findViewById4.findViewById(R.id.chart_title);
        this.r0 = textView2;
        textView2.setText(R.string.sysgraphs_battery_power);
        RealtimeLineChartView realtimeLineChartView3 = (RealtimeLineChartView) this.w0.findViewById(R.id.chart);
        this.g0 = realtimeLineChartView3;
        realtimeLineChartView3.a(u0);
        this.g0.f();
        this.g0.setMinYRange(2.0f);
        this.g0.setUnitFormatter(new c(4));
        this.g0.setFillUnderPrimary(true);
        this.g0.setValueLabel((TextView) this.w0.findViewById(R.id.chart_subtitle));
        this.g0.setGridLineCount(3);
        this.w0.setVisibility(8);
        View findViewById5 = inflate.findViewById(R.id.bat_projection_card);
        this.x0 = findViewById5;
        TextView textView3 = (TextView) findViewById5.findViewById(R.id.projection_title);
        this.t0 = textView3;
        textView3.setText(R.string.sysgraphs_battery_discharge_projection);
        BatteryProjectionView batteryProjectionView = (BatteryProjectionView) this.x0.findViewById(R.id.projection_view);
        this.s0 = batteryProjectionView;
        batteryProjectionView.setValueLabel((TextView) this.x0.findViewById(R.id.projection_subtitle));
        this.x0.setVisibility(8);
        View findViewById6 = inflate.findViewById(R.id.bat_charge_rate_card);
        this.y0 = findViewById6;
        TextView textView4 = (TextView) findViewById6.findViewById(R.id.chart_title);
        this.u0 = textView4;
        textView4.setText(R.string.sysgraphs_battery_discharge_rate);
        RealtimeLineChartView realtimeLineChartView4 = (RealtimeLineChartView) this.y0.findViewById(R.id.chart);
        this.h0 = realtimeLineChartView4;
        realtimeLineChartView4.a(u0);
        this.h0.g(0.0f, 5.0f);
        this.h0.setUnitFormatter(new c(5));
        this.h0.setFillUnderPrimary(true);
        this.h0.setValueLabel((TextView) this.y0.findViewById(R.id.chart_subtitle));
        this.y0.setVisibility(8);
        View findViewById7 = inflate.findViewById(R.id.bat_temp_card);
        this.z0 = findViewById7;
        ((TextView) findViewById7.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_battery_temp);
        RealtimeLineChartView realtimeLineChartView5 = (RealtimeLineChartView) this.z0.findViewById(R.id.chart);
        this.i0 = realtimeLineChartView5;
        realtimeLineChartView5.a(u0);
        this.i0.f();
        this.i0.setMinYRange(15.0f);
        this.i0.setUnitFormatter(new c(6));
        this.i0.setFillUnderPrimary(false);
        this.i0.setGridLineCount(5);
        TextView textView5 = (TextView) this.z0.findViewById(R.id.chart_subtitle);
        int u02 = u0(R.attr.colorPrimary, -14776091);
        textView5.setTextColor(u02);
        this.i0.setValueLabel(textView5);
        this.z0.setVisibility(8);
        boolean[] zArr = {false};
        this.d0.B.e(D(), new mf(this, zArr, textView5, u02, 0));
        View findViewById8 = inflate.findViewById(R.id.bat_level_card);
        ((TextView) findViewById8.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_battery_charge_counter);
        RealtimeLineChartView realtimeLineChartView6 = (RealtimeLineChartView) findViewById8.findViewById(R.id.chart);
        this.j0 = realtimeLineChartView6;
        realtimeLineChartView6.a(u0);
        this.j0.setUnitFormatter(new c(7));
        this.j0.setAxisFormatter(new c(8));
        this.j0.setFillUnderPrimary(true);
        this.j0.setValueLabel((TextView) findViewById8.findViewById(R.id.chart_subtitle));
        this.j0.setYNonNegative(true);
        this.j0.setUseExplicitYBoundsLabels(true);
        this.j0.setGridLineCount(4);
        this.d0.x.e(D(), new q8((ld0) this, inflate.findViewById(R.id.loading_progress), inflate.findViewById(R.id.sg_scroll), (Object) zArr, 1));
        return inflate;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        tl0.a("sysmon_battery");
        lu1 lu1Var = this.d0;
        lu1Var.e.R(lu1Var.j);
        lu1 lu1Var2 = this.d0;
        lu1Var2.e.R(lu1Var2.o);
        this.e0.i();
        this.f0.i();
        this.g0.i();
        this.h0.i();
        this.i0.i();
        this.j0.i();
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        tl0.b(t(), "sysmon_battery");
        lu1 lu1Var = this.d0;
        lu1Var.e.M(lu1Var.j);
        lu1 lu1Var2 = this.d0;
        lu1Var2.e.M(lu1Var2.o);
        this.e0.h();
        this.f0.h();
        this.g0.h();
        this.h0.h();
        this.i0.h();
        this.j0.h();
    }

    public final int u0(int i, int i2) {
        TypedArray obtainStyledAttributes = i0().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
