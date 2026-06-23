package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import flar2.devcheck.R;
import flar2.devcheck.systemGraphs.widgets.RealtimeLineChartView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public class my extends ld0 {
    public lu1 d0;
    public RealtimeLineChartView e0;
    public View f0;
    public View g0;
    public RealtimeLineChartView h0;
    public View i0;
    public RealtimeLineChartView j0;
    public TextView k0;
    public RealtimeLineChartView l0;
    public LinearLayout n0;
    public LinearLayout q0;
    public final ArrayList m0 = new ArrayList();
    public final ArrayList o0 = new ArrayList();
    public final ArrayList p0 = new ArrayList();
    public int r0 = 0;

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        int i;
        int i2;
        Context context;
        int i3;
        ArrayList arrayList;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        final my myVar = this;
        LayoutInflater layoutInflater2 = layoutInflater;
        boolean z = false;
        View inflate = layoutInflater2.inflate(R.layout.fragment_system_graphs_cpu, viewGroup, false);
        a5 g0 = myVar.g0();
        n72 l = g0.l();
        l72 g = g0.g();
        gr grVar = new gr(l, g, d51.i(g0, l, g));
        vq a2 = af1.a(lu1.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        myVar.d0 = (lu1) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.cpu_overall_container);
        int i5 = R.layout.card_system_graphs_chart;
        View inflate2 = layoutInflater2.inflate(R.layout.card_system_graphs_chart, viewGroup2, false);
        ((LinearLayout) inflate.findViewById(R.id.cpu_overall_container)).addView(inflate2);
        int i6 = R.id.chart_title;
        ((TextView) inflate2.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_cpu_overall_load);
        RealtimeLineChartView realtimeLineChartView = (RealtimeLineChartView) inflate2.findViewById(R.id.chart);
        myVar.e0 = realtimeLineChartView;
        realtimeLineChartView.a(myVar.v0(R.attr.colorPrimary, -14776091));
        myVar.e0.g(0.0f, 100.0f);
        boolean z2 = true;
        myVar.e0.setUnitFormatter(new rw(1));
        myVar.e0.setFillUnderPrimary(true);
        myVar.e0.setValueLabel((TextView) inflate2.findViewById(R.id.chart_subtitle));
        inflate2.setVisibility(8);
        myVar.f0 = inflate2;
        View findViewById = inflate.findViewById(R.id.cpu_iowait_card);
        myVar.g0 = findViewById;
        ((TextView) findViewById.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_cpu_iowait);
        RealtimeLineChartView realtimeLineChartView2 = (RealtimeLineChartView) myVar.g0.findViewById(R.id.chart);
        myVar.h0 = realtimeLineChartView2;
        realtimeLineChartView2.a(myVar.v0(R.attr.colorPrimary, -14776091));
        myVar.h0.g(0.0f, 100.0f);
        myVar.h0.setUnitFormatter(new rw(4));
        myVar.h0.setFillUnderPrimary(true);
        myVar.h0.setValueLabel((TextView) myVar.g0.findViewById(R.id.chart_subtitle));
        myVar.g0.setVisibility(8);
        View findViewById2 = inflate.findViewById(R.id.cpu_pressure_card);
        myVar.i0 = findViewById2;
        ((TextView) findViewById2.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_cpu_pressure);
        RealtimeLineChartView realtimeLineChartView3 = (RealtimeLineChartView) myVar.i0.findViewById(R.id.chart);
        myVar.j0 = realtimeLineChartView3;
        realtimeLineChartView3.a(myVar.v0(R.attr.colorPrimary, -14776091));
        myVar.j0.f();
        myVar.j0.setMinYRange(5.0f);
        myVar.j0.setYNonNegative(true);
        myVar.j0.setUnitFormatter(new rw(5));
        myVar.j0.setFillUnderPrimary(true);
        myVar.j0.setValueLabel((TextView) myVar.i0.findViewById(R.id.chart_subtitle));
        myVar.i0.setVisibility(8);
        View findViewById3 = inflate.findViewById(R.id.cpu_info_card);
        TextView textView = (TextView) findViewById3.findViewById(R.id.info_title);
        TextView textView2 = (TextView) findViewById3.findViewById(R.id.info_subtitle);
        myVar.k0 = (TextView) findViewById3.findViewById(R.id.info_extra);
        ImageView imageView = (ImageView) findViewById3.findViewById(R.id.info_icon);
        imageView.setImageResource(uz1.d(myVar.i0()) ? R.drawable.ic_cpu_light : R.drawable.ic_cpu_dark);
        int i7 = (int) (myVar.z().getDisplayMetrics().density * 5.0f);
        imageView.setPadding(i7, i7, i7, i7);
        imageView.setImageTintList(ColorStateList.valueOf(myVar.v0(R.attr.colorPrimary, -14776091)));
        imageView.setVisibility(0);
        String e = i51.e("prefProcessor");
        if (e != null && !e.isEmpty()) {
            textView.setText(e);
            textView.setVisibility(0);
        }
        int i8 = myVar.d0.f.c;
        try {
            str = ju0.G();
        } catch (Throwable unused) {
            str = bOxzFZXgEkjph.fanUKhrjl;
        }
        if (i8 > 0) {
            String quantityString = myVar.z().getQuantityString(R.plurals.sysgraphs_cpu_cores_count, i8, Integer.valueOf(i8));
            if (!str.isEmpty()) {
                quantityString = d51.s(quantityString, " · ", str);
            }
            textView2.setText(quantityString);
            textView2.setVisibility(0);
        }
        myVar.n0 = (LinearLayout) inflate.findViewById(R.id.cpu_cluster_container);
        myVar.q0 = (LinearLayout) inflate.findViewById(R.id.cpu_core_groups);
        ArrayList arrayList4 = myVar.d0.f.d;
        int[] u0 = myVar.u0(arrayList4.size());
        int size = arrayList4.size();
        String[] strArr = new String[size];
        if (size == 1) {
            strArr[0] = myVar.A(R.string.sysgraphs_cpu_cores);
        } else {
            Integer[] numArr = new Integer[size];
            for (int i9 = 0; i9 < size; i9++) {
                numArr[i9] = Integer.valueOf(i9);
            }
            Arrays.sort(numArr, new iy(0, arrayList4));
            int[] iArr = new int[size];
            for (int i10 = 0; i10 < size; i10++) {
                iArr[numArr[i10].intValue()] = i10;
            }
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    strArr[i11] = myVar.A(R.string.sysgraphs_cpu_efficiency_cores);
                } else if (i12 == size - 1) {
                    strArr[i11] = ((ny) arrayList4.get(i11)).f706a.size() == 1 ? myVar.A(R.string.sysgraphs_cpu_prime_core) : myVar.A(R.string.sysgraphs_cpu_performance_cores);
                } else {
                    strArr[i11] = myVar.A(R.string.sysgraphs_cpu_performance_cores);
                }
            }
        }
        int i13 = 0;
        while (i13 < arrayList4.size()) {
            ny nyVar = (ny) arrayList4.get(i13);
            View inflate3 = layoutInflater2.inflate(i5, myVar.n0, z);
            TextView textView3 = (TextView) inflate3.findViewById(i6);
            String str2 = strArr[i13];
            boolean z3 = z2;
            String s = d51.s(str2, "\n", String.format(Locale.getDefault(), "%s · %d cores", nyVar.d, Integer.valueOf(nyVar.f706a.size())));
            SpannableString spannableString = new SpannableString(s);
            int length = str2.length() + 1;
            spannableString.setSpan(new RelativeSizeSpan(0.85f), length, s.length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(myVar.v0(R.attr.textTertiary, -10066330)), length, s.length(), 33);
            spannableString.setSpan(new StyleSpan(0), length, s.length(), 33);
            textView3.setText(spannableString);
            RealtimeLineChartView realtimeLineChartView4 = (RealtimeLineChartView) inflate3.findViewById(R.id.chart);
            realtimeLineChartView4.a(u0[i13]);
            TextView textView4 = (TextView) inflate3.findViewById(R.id.chart_subtitle);
            textView4.setTextColor(u0[i13]);
            realtimeLineChartView4.setValueLabel(textView4);
            int i14 = nyVar.c;
            if (i14 <= 0) {
                i14 = myVar.d0.f.e;
            }
            int i15 = nyVar.b;
            if (i15 <= 0 || i15 >= i14) {
                i15 = 0;
            }
            realtimeLineChartView4.g(i15, i14);
            realtimeLineChartView4.setUnitFormatter(new rw(2));
            realtimeLineChartView4.setAxisFormatter(new rw(3));
            realtimeLineChartView4.setFillUnderPrimary(z3);
            realtimeLineChartView4.setUseExplicitYBoundsLabels(z3);
            realtimeLineChartView4.setGridLineCount(4);
            myVar.m0.add(realtimeLineChartView4);
            myVar.n0.addView(inflate3);
            i13++;
            i6 = R.id.chart_title;
            z = false;
            i5 = R.layout.card_system_graphs_chart;
            z2 = true;
        }
        Context i0 = myVar.i0();
        ArrayList arrayList5 = myVar.d0.f.d;
        int[] u02 = myVar.u0(arrayList5.size());
        py pyVar = myVar.d0.f;
        int i16 = pyVar.e;
        int i17 = pyVar.c;
        float f = myVar.z().getDisplayMetrics().density;
        int i18 = (myVar.z().getBoolean(R.bool.isTablet) || myVar.z().getBoolean(R.bool.isTablet10)) ? 4 : 2;
        ArrayList arrayList6 = myVar.o0;
        arrayList6.clear();
        ArrayList arrayList7 = myVar.p0;
        arrayList7.clear();
        for (int i19 = 0; i19 < i17; i19++) {
            arrayList6.add(null);
            arrayList7.add(null);
        }
        int i20 = (int) (4.0f * f);
        int i21 = 0;
        while (i21 < arrayList5.size()) {
            ny nyVar2 = (ny) arrayList5.get(i21);
            ArrayList arrayList8 = arrayList5;
            int i22 = u02[i21];
            int[] iArr2 = u02;
            int i23 = nyVar2.c;
            ArrayList arrayList9 = nyVar2.f706a;
            if (i23 > 0) {
                i = i16;
                i16 = i23;
            } else {
                i = i16;
            }
            float f2 = f;
            int i24 = nyVar2.b;
            if (i24 <= 0 || i24 >= i16) {
                i24 = 0;
            }
            int i25 = i21;
            View view = inflate;
            MaterialCardView materialCardView = new MaterialCardView(i0, null);
            ArrayList arrayList10 = arrayList7;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int i26 = (int) (f2 * 8.0f);
            int i27 = (int) (f2 * 6.0f);
            layoutParams.setMargins(i26, i27, i26, i27);
            materialCardView.setLayoutParams(layoutParams);
            materialCardView.setCardElevation(0.0f);
            materialCardView.setStrokeWidth((int) (1.5f * f2));
            materialCardView.setStrokeColor(i22);
            materialCardView.setRadius(12.0f * f2);
            materialCardView.setCardBackgroundColor(0);
            LinearLayout linearLayout = new LinearLayout(i0);
            linearLayout.setOrientation(1);
            int i28 = (int) (10.0f * f2);
            linearLayout.setPadding(i26, i28, i26, i28);
            TextView textView5 = new TextView(i0);
            ArrayList arrayList11 = arrayList6;
            textView5.setText(String.format(Locale.getDefault(), "%s · %d cores", nyVar2.d, Integer.valueOf(arrayList9.size())));
            textView5.setTextColor(i22);
            textView5.setTextSize(13.0f);
            textView5.setTypeface(textView5.getTypeface(), 1);
            textView5.setPadding(i26, 0, i26, i26);
            linearLayout.addView(textView5);
            GridLayout gridLayout = new GridLayout(i0);
            gridLayout.setColumnCount(i18);
            gridLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            int size2 = arrayList9.size();
            int i29 = 0;
            while (i29 < size2) {
                Integer num = (Integer) arrayList9.get(i29);
                int intValue = num.intValue();
                if (intValue < 0 || intValue >= i17) {
                    i2 = size2;
                    context = i0;
                    i3 = i22;
                    arrayList = arrayList9;
                    i4 = i29;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList11;
                } else {
                    i2 = size2;
                    context = i0;
                    View inflate4 = layoutInflater2.inflate(R.layout.card_system_graphs_compact_core, (ViewGroup) gridLayout, false);
                    TextView textView6 = (TextView) inflate4.findViewById(R.id.core_title);
                    TextView textView7 = (TextView) inflate4.findViewById(R.id.core_freq);
                    arrayList = arrayList9;
                    i4 = i29;
                    textView6.setText(String.format(Locale.getDefault(), "CPU %d", num));
                    textView7.setTextColor(i22);
                    RealtimeLineChartView realtimeLineChartView5 = (RealtimeLineChartView) inflate4.findViewById(R.id.core_chart);
                    realtimeLineChartView5.a(i22);
                    realtimeLineChartView5.g(i24, i16 * 1.05f);
                    realtimeLineChartView5.setShowAxisLabels(false);
                    realtimeLineChartView5.setUnitFormatter(null);
                    realtimeLineChartView5.setFillUnderPrimary(true);
                    GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams();
                    layoutParams2.width = 0;
                    layoutParams2.height = -2;
                    i3 = i22;
                    layoutParams2.columnSpec = GridLayout.spec(i4 % i18, 1, 1.0f);
                    layoutParams2.rowSpec = GridLayout.spec(i4 / i18);
                    layoutParams2.setMargins(i20, i20, i20, i20);
                    inflate4.setLayoutParams(layoutParams2);
                    gridLayout.addView(inflate4);
                    arrayList3 = arrayList11;
                    arrayList3.set(intValue, realtimeLineChartView5);
                    arrayList2 = arrayList10;
                    arrayList2.set(intValue, textView7);
                }
                i29 = i4 + 1;
                layoutInflater2 = layoutInflater;
                arrayList11 = arrayList3;
                arrayList10 = arrayList2;
                size2 = i2;
                i0 = context;
                arrayList9 = arrayList;
                i22 = i3;
            }
            arrayList6 = arrayList11;
            linearLayout.addView(gridLayout);
            materialCardView.addView(linearLayout);
            myVar = this;
            myVar.q0.addView(materialCardView);
            i21 = i25 + 1;
            layoutInflater2 = layoutInflater;
            arrayList7 = arrayList10;
            arrayList5 = arrayList8;
            u02 = iArr2;
            i16 = i;
            f = f2;
            inflate = view;
            i0 = i0;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) inflate.findViewById(R.id.cpu_mode_toggle);
        int c = i51.c(0, "prefSysGraphsCpuMode");
        myVar.r0 = c;
        materialButtonToggleGroup.l(c == 1 ? R.id.cpu_mode_core : R.id.cpu_mode_cluster, true);
        int i30 = myVar.r0;
        LinearLayout linearLayout2 = myVar.n0;
        if (i30 == 0) {
            linearLayout2.setVisibility(0);
            myVar.q0.setVisibility(8);
        } else {
            linearLayout2.setVisibility(8);
            myVar.q0.setVisibility(0);
        }
        materialButtonToggleGroup.s.add(new jy(0, myVar));
        myVar.d0.t.e(myVar.D(), new bh(1, myVar, inflate.findViewById(R.id.loading_progress), inflate.findViewById(R.id.sg_scroll)));
        View findViewById4 = inflate.findViewById(R.id.cpu_temp_card);
        ((TextView) findViewById4.findViewById(R.id.chart_title)).setText(R.string.sysgraphs_cpu_temp);
        RealtimeLineChartView realtimeLineChartView6 = (RealtimeLineChartView) findViewById4.findViewById(R.id.chart);
        myVar.l0 = realtimeLineChartView6;
        realtimeLineChartView6.a(myVar.v0(R.attr.colorPrimary, -14776091));
        myVar.l0.f();
        myVar.l0.setMinYRange(20.0f);
        myVar.l0.setUnitFormatter(new rw(6));
        myVar.l0.setShowPill(false);
        myVar.l0.setFillUnderPrimary(false);
        myVar.l0.setGridLineCount(5);
        View findViewById5 = findViewById4.findViewById(R.id.cpu_thermal_section);
        View findViewById6 = findViewById4.findViewById(R.id.cpu_temp_chart_section);
        TextView textView8 = (TextView) findViewById4.findViewById(R.id.cpu_thermal_status_label);
        View findViewById7 = findViewById4.findViewById(R.id.cpu_headroom_row);
        ProgressBar progressBar = (ProgressBar) findViewById4.findViewById(R.id.cpu_headroom_bar);
        TextView textView9 = (TextView) findViewById4.findViewById(R.id.cpu_headroom_value);
        boolean[] zArr = {false};
        boolean[] zArr2 = {false};
        final boolean[] zArr3 = {false};
        final fj fjVar = new fj(zArr, zArr2, findViewById5, findViewById6, zArr3, findViewById4, 1);
        ((qy0) ry1.f(myVar.g0().getApplication()).d).e(myVar.D(), new q8(myVar, zArr, textView8, fjVar, 2));
        myVar.d0.F.e(myVar.D(), new ky(myVar, zArr2, findViewById7, progressBar, textView9, fjVar));
        final TextView textView10 = (TextView) findViewById4.findViewById(R.id.chart_subtitle);
        final int v0 = myVar.v0(R.attr.colorPrimary, -14776091);
        textView10.setTextColor(v0);
        myVar.l0.setValueLabel(textView10);
        findViewById4.setVisibility(8);
        myVar.d0.z.e(myVar.D(), new v31() { // from class: ly
            @Override // defpackage.v31
            public final void a(Object obj) {
                sw1 sw1Var = (sw1) obj;
                if (sw1Var != null) {
                    float f3 = sw1Var.d;
                    float f4 = sw1Var.c;
                    float f5 = sw1Var.f959a;
                    float f6 = sw1Var.b;
                    if (Float.isNaN(f5)) {
                        return;
                    }
                    my myVar2 = my.this;
                    if (myVar2.l0 != null) {
                        boolean[] zArr4 = zArr3;
                        if (!zArr4[0]) {
                            zArr4[0] = true;
                            fjVar.run();
                        }
                        boolean z4 = !Float.isNaN(f4) && ((!Float.isNaN(f6) && (f5 > f6 ? 1 : (f5 == f6 ? 0 : -1)) >= 0) || Float.isNaN(f6));
                        boolean z5 = (Float.isNaN(f6) || z4) ? false : true;
                        myVar2.l0.setWarningLine(z5 ? f6 : Float.NaN);
                        myVar2.l0.setCriticalLine(z4 ? f4 : Float.NaN);
                        RealtimeLineChartView realtimeLineChartView7 = myVar2.l0;
                        float f7 = sw1Var.e;
                        if (Float.isNaN(f3)) {
                            f3 = 20.0f;
                        }
                        if (z4) {
                            f7 = f4;
                        } else if (z5) {
                            f7 = f6;
                        } else if (Float.isNaN(f7)) {
                            f7 = 60.0f;
                        }
                        if (f7 - f3 < 20.0f) {
                            f7 = f3 + 20.0f;
                        }
                        realtimeLineChartView7.g(f3, f7);
                        textView10.setTextColor(md2.g(myVar2.i0(), f5, f6, f4, v0));
                        myVar2.l0.c(0, f5);
                    }
                }
            }
        });
        return inflate;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        tl0.a("sysmon_cpu");
        lu1 lu1Var = this.d0;
        lu1Var.e.R(lu1Var.f);
        lu1 lu1Var2 = this.d0;
        lu1Var2.e.R(lu1Var2.m);
        lu1 lu1Var3 = this.d0;
        lu1Var3.e.R(lu1Var3.s);
        ry1.f(g0().getApplication()).l();
        this.e0.i();
        this.h0.i();
        RealtimeLineChartView realtimeLineChartView = this.j0;
        if (realtimeLineChartView != null) {
            realtimeLineChartView.i();
        }
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((RealtimeLineChartView) obj).i();
        }
        ArrayList arrayList2 = this.o0;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            RealtimeLineChartView realtimeLineChartView2 = (RealtimeLineChartView) obj2;
            if (realtimeLineChartView2 != null) {
                realtimeLineChartView2.i();
            }
        }
        RealtimeLineChartView realtimeLineChartView3 = this.l0;
        if (realtimeLineChartView3 != null) {
            realtimeLineChartView3.i();
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        tl0.b(t(), "sysmon_cpu");
        lu1 lu1Var = this.d0;
        lu1Var.e.M(lu1Var.f);
        lu1 lu1Var2 = this.d0;
        lu1Var2.e.M(lu1Var2.m);
        lu1 lu1Var3 = this.d0;
        lu1Var3.e.M(lu1Var3.s);
        ry1.f(g0().getApplication()).k();
        this.e0.h();
        this.h0.h();
        RealtimeLineChartView realtimeLineChartView = this.j0;
        if (realtimeLineChartView != null) {
            realtimeLineChartView.h();
        }
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((RealtimeLineChartView) obj).h();
        }
        ArrayList arrayList2 = this.o0;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            RealtimeLineChartView realtimeLineChartView2 = (RealtimeLineChartView) obj2;
            if (realtimeLineChartView2 != null) {
                realtimeLineChartView2.h();
            }
        }
        RealtimeLineChartView realtimeLineChartView3 = this.l0;
        if (realtimeLineChartView3 != null) {
            realtimeLineChartView3.h();
        }
    }

    public final int[] u0(int i) {
        int v0 = v0(R.attr.colorPrimary, -14776091);
        int[] iArr = new int[i];
        iArr[0] = v0;
        if (i > 1) {
            float[] fArr = new float[3];
            Color.colorToHSV(v0, fArr);
            for (int i2 = 1; i2 < i; i2++) {
                iArr[i2] = Color.HSVToColor(new float[]{((fArr[0] + 360.0f) - (i2 * 35.0f)) % 360.0f, fArr[1], fArr[2]});
            }
        }
        return iArr;
    }

    public final int v0(int i, int i2) {
        TypedArray obtainStyledAttributes = i0().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
