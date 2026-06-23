package defpackage;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.systemGraphs.widgets.RealtimeLineChartView;
import java.util.Locale;

/* loaded from: classes.dex */
public class w11 extends ld0 {
    public lu1 d0;
    public RealtimeLineChartView e0;
    public RealtimeLineChartView f0;
    public RealtimeLineChartView g0;
    public TextView h0;
    public TextView i0;
    public TextView j0;
    public TextView k0;
    public ImageView l0;
    public View m0;
    public View n0;

    public static String u0(float f) {
        return f >= 1024.0f ? String.format(Locale.getDefault(), "%.1f MB/s", Float.valueOf(f / 1024.0f)) : String.format(Locale.getDefault(), "%.0f kB/s", Float.valueOf(f));
    }

    public static int v0(int i, float f, int i2) {
        if (i == 2) {
            if (f <= -100.0f) {
                return 0;
            }
            if (f >= -50.0f) {
                return 100;
            }
            return Math.round((f + 100.0f) * 2.0f);
        }
        if (i2 <= 0 || i2 < 3) {
            return 0;
        }
        if (i2 > 75) {
            return 100;
        }
        return Math.round((i2 * 100.0f) / 75.0f);
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_system_graphs_network, viewGroup, false);
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
            final int color = obtainStyledAttributes.getColor(0, -14776091);
            obtainStyledAttributes.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            fArr[0] = ((fArr[0] - 90.0f) + 360.0f) % 360.0f;
            final int HSVToColor = Color.HSVToColor(fArr);
            View findViewById = inflate.findViewById(R.id.net_info_card);
            this.j0 = (TextView) findViewById.findViewById(R.id.info_title);
            this.k0 = (TextView) findViewById.findViewById(R.id.info_subtitle);
            this.l0 = (ImageView) findViewById.findViewById(R.id.info_icon);
            final View findViewById2 = inflate.findViewById(R.id.net_throughput_card);
            ((TextView) findViewById2.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_network_throughput);
            findViewById2.setVisibility(8);
            RealtimeLineChartView realtimeLineChartView = (RealtimeLineChartView) findViewById2.findViewById(R.id.chart);
            this.e0 = realtimeLineChartView;
            realtimeLineChartView.a(color);
            this.e0.a(HSVToColor);
            this.e0.f();
            this.e0.setMinYRange(100.0f);
            this.e0.setUnitFormatter(new jw0(1));
            this.e0.setFillUnderPrimary(true);
            final TextView textView = (TextView) findViewById2.findViewById(R.id.chart_subtitle);
            this.e0.setYNonNegative(true);
            View findViewById3 = inflate.findViewById(R.id.net_signal_card);
            this.m0 = findViewById3;
            TextView textView2 = (TextView) findViewById3.findViewById(R.id.chart_title);
            this.h0 = textView2;
            textView2.setText(R.string.sysgraphs_network_signal_wifi);
            TextView textView3 = (TextView) this.m0.findViewById(R.id.chart_subtitle);
            this.i0 = textView3;
            textView3.setTextColor(color);
            RealtimeLineChartView realtimeLineChartView2 = (RealtimeLineChartView) this.m0.findViewById(R.id.chart);
            this.f0 = realtimeLineChartView2;
            realtimeLineChartView2.a(color);
            this.f0.g(-120.0f, -40.0f);
            this.f0.setUnitFormatter(new jw0(2));
            this.f0.setFillUnderPrimary(true);
            this.m0.setVisibility(8);
            View findViewById4 = inflate.findViewById(R.id.net_link_speed_card);
            this.n0 = findViewById4;
            ((TextView) findViewById4.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_network_link_speed);
            RealtimeLineChartView realtimeLineChartView3 = (RealtimeLineChartView) this.n0.findViewById(R.id.chart);
            this.g0 = realtimeLineChartView3;
            realtimeLineChartView3.a(color);
            this.g0.f();
            this.g0.setMinYRange(200.0f);
            this.g0.setUnitFormatter(new jw0(3));
            this.g0.setFillUnderPrimary(true);
            this.g0.setValueLabel((TextView) this.n0.findViewById(R.id.chart_subtitle));
            this.g0.setYNonNegative(true);
            this.g0.setGridLineCount(3);
            this.n0.setVisibility(8);
            final View findViewById5 = inflate.findViewById(R.id.loading_progress);
            final View findViewById6 = inflate.findViewById(R.id.sg_scroll);
            this.d0.y.e(D(), new v31() { // from class: v11
                /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
                
                    if (r8 > (-84.0f)) goto L43;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
                
                    if (r11 < 80) goto L49;
                 */
                /* JADX WARN: Removed duplicated region for block: B:107:0x01cd  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0234  */
                @Override // defpackage.v31
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(java.lang.Object r21) {
                    /*
                        Method dump skipped, instructions count: 648
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.v11.a(java.lang.Object):void");
                }
            });
            return inflate;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        tl0.a("sysmon_network");
        lu1 lu1Var = this.d0;
        lu1Var.e.R(lu1Var.k);
        RealtimeLineChartView realtimeLineChartView = this.e0;
        if (realtimeLineChartView != null) {
            realtimeLineChartView.i();
        }
        RealtimeLineChartView realtimeLineChartView2 = this.f0;
        if (realtimeLineChartView2 != null) {
            realtimeLineChartView2.i();
        }
        RealtimeLineChartView realtimeLineChartView3 = this.g0;
        if (realtimeLineChartView3 != null) {
            realtimeLineChartView3.i();
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        tl0.b(t(), "sysmon_network");
        lu1 lu1Var = this.d0;
        lu1Var.e.M(lu1Var.k);
        RealtimeLineChartView realtimeLineChartView = this.e0;
        if (realtimeLineChartView != null) {
            realtimeLineChartView.h();
        }
        RealtimeLineChartView realtimeLineChartView2 = this.f0;
        if (realtimeLineChartView2 != null) {
            realtimeLineChartView2.h();
        }
        RealtimeLineChartView realtimeLineChartView3 = this.g0;
        if (realtimeLineChartView3 != null) {
            realtimeLineChartView3.h();
        }
    }
}
