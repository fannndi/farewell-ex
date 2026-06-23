package defpackage;

import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.systemGraphs.widgets.RealtimeLineChartView;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ns1 extends ld0 {
    public lu1 d0;
    public LinearLayout g0;
    public int h0;
    public final ArrayList e0 = new ArrayList();
    public final ArrayDeque f0 = new ArrayDeque();
    public boolean i0 = false;

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_system_graphs_subsystems, viewGroup, false);
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
            this.h0 = color;
            this.g0 = (LinearLayout) inflate.findViewById(R.id.subsystems_container);
            this.d0.C.e(D(), new q8((ld0) this, inflate.findViewById(R.id.loading_progress), inflate.findViewById(R.id.sg_scroll), (Object) layoutInflater, 5));
            return inflate;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        tl0.a("sysmon_subsystems");
        lu1 lu1Var = this.d0;
        lu1Var.e.R(lu1Var.p);
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((RealtimeLineChartView) obj).i();
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        tl0.b(t(), "sysmon_subsystems");
        lu1 lu1Var = this.d0;
        lu1Var.e.M(lu1Var.p);
        ArrayList arrayList = this.e0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((RealtimeLineChartView) obj).h();
        }
    }

    public final void u0(LayoutInflater layoutInflater) {
        if (!G() || this.g0 == null || this.f0.isEmpty()) {
            return;
        }
        v0(layoutInflater);
        this.g0.post(new ms1(this, layoutInflater, 1));
    }

    public final void v0(LayoutInflater layoutInflater) {
        if (this.g0 != null) {
            ArrayDeque arrayDeque = this.f0;
            if (arrayDeque.isEmpty()) {
                return;
            }
            j30 j30Var = (j30) arrayDeque.pollFirst();
            View inflate = layoutInflater.inflate(R.layout.card_system_graphs_chart, (ViewGroup) this.g0, false);
            TextView textView = (TextView) inflate.findViewById(R.id.chart_title);
            String str = j30Var.f460a;
            String str2 = j30Var.d;
            textView.setText(str);
            RealtimeLineChartView realtimeLineChartView = (RealtimeLineChartView) inflate.findViewById(R.id.chart);
            realtimeLineChartView.a(this.h0);
            long j = j30Var.c;
            if (j > 0) {
                realtimeLineChartView.g(0.0f, j);
                realtimeLineChartView.setUseExplicitYBoundsLabels(true);
            } else {
                realtimeLineChartView.f();
                realtimeLineChartView.setMinYRange("MB/s".equals(str2) ? 100.0f : 50.0f);
            }
            realtimeLineChartView.setUnitFormatter(new xg0(3, str2));
            realtimeLineChartView.setFillUnderPrimary(true);
            realtimeLineChartView.setValueLabel((TextView) inflate.findViewById(R.id.chart_subtitle));
            realtimeLineChartView.setYNonNegative(true);
            realtimeLineChartView.setGridLineCount(3);
            this.e0.add(realtimeLineChartView);
            this.g0.addView(inflate);
            if (this.g >= 7) {
                realtimeLineChartView.h();
            }
        }
    }
}
