package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.jjoe64.graphview.GraphView;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.ui.viewmodels.CpuConfigurationView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class l01 extends td1 {
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;
    public static int F;
    public static boolean G;
    public final List d;
    public final int e;
    public final HashMap f;
    public b01 g;
    public u11 h;
    public a01 i;
    public d01 j;
    public h01 k;
    public gz0 l;
    public nz0 m;
    public e01 n;
    public ei0 o;
    public f01 p;
    public sn q;
    public p8 r;
    public final Context s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public String x;
    public final HashMap y;
    public final int z;

    public l01(Context context, ArrayList arrayList) {
        this.y = new HashMap();
        this.d = arrayList;
        this.f = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hn0 hn0Var = (hn0) obj;
            if (hn0Var.u != 40) {
                arrayList2.add(hn0Var);
            } else {
                this.f.put(hn0Var.z, Boolean.FALSE);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.s = context;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        A = typedValue.data;
        boolean d = uz1.d(context);
        G = d;
        if (d) {
            this.e = context.getColor(R.color.red_text);
            B = ts.e(A, 42);
        } else {
            this.e = context.getColor(R.color.highlight);
            B = ts.e(A, 42);
        }
        context.getTheme().resolveAttribute(R.attr.textSecondary, typedValue, true);
        C = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.textPrimary, typedValue, true);
        D = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.textTertiary, typedValue, true);
        context.getTheme().resolveAttribute(R.attr.dashboard_red, typedValue, true);
        this.w = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.dashboard_orange, typedValue, true);
        this.v = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.dashboard_yellow, typedValue, true);
        this.u = typedValue.data;
        this.z = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
    }

    public l01(Context context, List list) {
        this.y = new HashMap();
        this.d = list;
        this.s = context;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        A = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.colorPrimaryAlpha, typedValue, true);
        context.getTheme().resolveAttribute(R.attr.card_background_color, typedValue, true);
        F = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.textSecondary, typedValue, true);
        C = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.textPrimary, typedValue, true);
        D = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.textTertiary, typedValue, true);
        boolean d = uz1.d(context);
        G = d;
        if (d) {
            this.e = context.getColor(R.color.red_text);
            E = context.getColor(R.color.light_neutral_dark);
            B = ts.e(A, 60);
        } else {
            this.e = context.getColor(R.color.highlight);
            E = context.getColor(R.color.light_neutral);
            B = ts.e(A, 192);
        }
        context.getTheme().resolveAttribute(R.attr.dashboard_red, typedValue, true);
        this.w = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.dashboard_orange, typedValue, true);
        this.v = typedValue.data;
        context.getTheme().resolveAttribute(R.attr.dashboard_yellow, typedValue, true);
        this.u = typedValue.data;
        this.t = context.getColor(R.color.green);
        this.z = (int) TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics());
    }

    public static zv0 v(Context context) {
        return new zv0(context, null, 1);
    }

    public static int w(int i, ProgressBar progressBar) {
        int max = progressBar.getMax() > 0 ? progressBar.getMax() : 100;
        if (i < 0) {
            return 0;
        }
        return i > max ? max : i;
    }

    @Override // defpackage.td1
    public final int c() {
        List list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.td1
    public final int e(int i) {
        return ((hn0) this.d.get(i)).u;
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        qq0 qq0Var;
        int i2;
        String str;
        int i3;
        int i4;
        Drawable drawable;
        Drawable x;
        xz0 xz0Var = (xz0) te1Var;
        int b = xz0Var.b();
        List list = this.d;
        if (b < list.size()) {
            int i5 = xz0Var.l;
            AttributeSet attributeSet = null;
            float f = 42.0f;
            int i6 = this.e;
            String str2 = CGvJMCDBOmCdj.kTsS;
            int i7 = this.w;
            int i8 = this.v;
            int i9 = 1;
            Context context = this.s;
            boolean z = false;
            try {
                switch (i5) {
                    case 0:
                    case 27:
                        ((mz0) xz0Var).A.setText(((hn0) list.get(xz0Var.b())).d());
                        return;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    case 29:
                    case 30:
                    case 40:
                    case 47:
                    case 50:
                    default:
                        vz0 vz0Var = (vz0) xz0Var;
                        vz0Var.A.setText(((hn0) list.get(xz0Var.b())).b);
                        vz0Var.B.setText(((hn0) list.get(xz0Var.b())).d, TextView.BufferType.NORMAL);
                        return;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        dz0 dz0Var = (dz0) xz0Var;
                        dz0Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        dz0Var.B.setText(((hn0) list.get(xz0Var.b())).b());
                        dz0Var.C = new vy0(this, 0);
                        return;
                    case 3:
                    case 24:
                    case rt0.q /* 32 */:
                        k01 k01Var = (k01) xz0Var;
                        TextView textView = k01Var.B;
                        TextView textView2 = k01Var.D;
                        k01Var.A.setImageDrawable(((hn0) list.get(xz0Var.b())).a());
                        k01Var.C.setText(((hn0) list.get(xz0Var.b())).b());
                        k01Var.E = new vy0(this, 5);
                        String str3 = ((hn0) list.get(xz0Var.b())).s;
                        if (TextUtils.isEmpty(this.x) || str3 == null || !str3.toLowerCase(Locale.ROOT).contains(this.x)) {
                            textView2.setText(str3);
                        } else {
                            textView2.setText(uz1.H(i6, str3, this.x));
                        }
                        String d = ((hn0) list.get(xz0Var.b())).d();
                        if (TextUtils.isEmpty(this.x) || d == null || !d.toLowerCase(Locale.ROOT).contains(this.x)) {
                            textView.setText(d);
                            return;
                        } else {
                            textView.setText(uz1.H(i6, d, this.x));
                            return;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        jz0 jz0Var = (jz0) xz0Var;
                        jz0Var.A.setText(((hn0) list.get(xz0Var.b())).b(), TextView.BufferType.NORMAL);
                        jz0Var.B.setImageDrawable(((hn0) list.get(xz0Var.b())).a());
                        return;
                    case 5:
                        j01 j01Var = (j01) xz0Var;
                        j01Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        j01Var.B.setText(((hn0) list.get(xz0Var.b())).b());
                        return;
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        dz0 dz0Var2 = (dz0) xz0Var;
                        dz0Var2.A.setText(((hn0) list.get(xz0Var.b())).d());
                        dz0Var2.B.setText(((hn0) list.get(xz0Var.b())).b());
                        dz0Var2.C = new vy0(this, 2);
                        return;
                    case 8:
                        yy0 yy0Var = (yy0) xz0Var;
                        ProgressBar progressBar = yy0Var.E;
                        yy0Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        TextView textView3 = yy0Var.B;
                        String str4 = ((hn0) list.get(xz0Var.b())).e;
                        TextView.BufferType bufferType = TextView.BufferType.NORMAL;
                        textView3.setText(str4, bufferType);
                        yy0Var.C.setText(((hn0) list.get(xz0Var.b())).f, bufferType);
                        yy0Var.D.setText(((hn0) list.get(xz0Var.b())).c(), bufferType);
                        progressBar.setProgress(w(((hn0) list.get(xz0Var.b())).t, progressBar));
                        return;
                    case rt0.o /* 9 */:
                        cz0 cz0Var = (cz0) xz0Var;
                        TextView textView4 = cz0Var.D;
                        TextView textView5 = cz0Var.I;
                        TextView textView6 = cz0Var.H;
                        TextView textView7 = cz0Var.G;
                        TextView textView8 = cz0Var.F;
                        TextView textView9 = cz0Var.A;
                        TextView textView10 = cz0Var.E;
                        GraphView graphView = cz0Var.J;
                        int b2 = cz0Var.b();
                        if (b2 == -1 || b2 >= list.size()) {
                            return;
                        }
                        hn0 hn0Var = (hn0) list.get(b2);
                        Context context2 = cz0Var.g.getContext();
                        StringBuilder sb = new StringBuilder();
                        int i10 = hn0Var.k;
                        int i11 = hn0Var.l;
                        sb.append(i10);
                        sb.append(" mA");
                        String sb2 = sb.toString();
                        textView9.setText(i11 + "%");
                        if (i11 < 10) {
                            textView9.setTextColor(i7);
                        } else if (i11 < 20) {
                            textView9.setTextColor(i8);
                        } else {
                            textView9.setTextColor(A);
                        }
                        cz0Var.B.setText(hn0Var.i);
                        cz0Var.C.setText(sb2);
                        textView4.setText(hn0Var.j);
                        String str5 = hn0Var.h;
                        if (str5 == null || str5.isEmpty()) {
                            textView10.setVisibility(8);
                        } else {
                            textView10.setVisibility(0);
                            String string = context2.getString(R.string.temperature_status_normal);
                            String string2 = context2.getString(R.string.temperature_status_warm);
                            String string3 = context2.getString(R.string.temperature_status_hot);
                            String string4 = context2.getString(R.string.temperature_status_overheat);
                            int currentTextColor = textView4.getCurrentTextColor();
                            int indexOf = str5.indexOf(" (");
                            if (indexOf > 0) {
                                i2 = currentTextColor;
                                str = str5.substring(0, indexOf);
                            } else {
                                i2 = currentTextColor;
                                str = str5;
                            }
                            textView10.setText(str);
                            if (!str5.contains("(" + string2 + ")")) {
                                if (str5.contains("(" + string3 + ")")) {
                                    i7 = i8;
                                } else {
                                    if (!str5.contains("(" + string4 + ")")) {
                                        str5.contains("(" + string + ")");
                                    }
                                }
                                textView10.setTextColor(i7);
                            }
                            i7 = i2;
                            textView10.setTextColor(i7);
                        }
                        String str6 = hn0Var.m;
                        if (str6 == null || str6.isEmpty()) {
                            textView8.setVisibility(8);
                        } else {
                            textView8.setVisibility(0);
                            textView8.setText(str6);
                        }
                        String str7 = hn0Var.n;
                        if (str7 == null || str7.isEmpty()) {
                            textView7.setVisibility(4);
                        } else {
                            textView7.setVisibility(0);
                            textView7.setText(str7);
                        }
                        String str8 = hn0Var.o;
                        String str9 = hn0Var.p;
                        if (str8 == null || str8.isEmpty()) {
                            textView6.setVisibility(8);
                            textView5.setVisibility(8);
                        } else {
                            textView6.setVisibility(0);
                            textView6.setText(str8);
                            textView5.setVisibility(0);
                            textView5.setText(str9);
                        }
                        if (graphView == null || (qq0Var = cz0Var.K) == null) {
                            return;
                        }
                        int i12 = hn0Var.k;
                        if (i12 == 0) {
                            graphView.setVisibility(8);
                            return;
                        }
                        int i13 = cz0Var.L;
                        cz0Var.L = i13 + 1;
                        double d2 = i13;
                        qq0Var.a(new u00(d2, i12));
                        graphView.getViewport().d.f375a = Math.max(0.0d, d2 - 60.0d);
                        graphView.getViewport().d.b = d2;
                        graphView.setVisibility(0);
                        return;
                    case 10:
                        i01 i01Var = (i01) xz0Var;
                        i01Var.A.setImageDrawable(((hn0) list.get(xz0Var.b())).a());
                        i01Var.B.setText(((hn0) list.get(xz0Var.b())).d());
                        i01Var.C.setText(((hn0) list.get(xz0Var.b())).b());
                        i01Var.D = new vy0(this, 4);
                        return;
                    case 11:
                        yz0 yz0Var = (yz0) xz0Var;
                        TextView textView11 = yz0Var.E;
                        yz0Var.A.setImageDrawable(((hn0) list.get(xz0Var.b())).a());
                        yz0Var.B.setText(((hn0) list.get(xz0Var.b())).d());
                        TextView textView12 = yz0Var.C;
                        String b3 = ((hn0) list.get(xz0Var.b())).b();
                        TextView.BufferType bufferType2 = TextView.BufferType.NORMAL;
                        textView12.setText(b3, bufferType2);
                        try {
                            yz0Var.D.setText(((hn0) list.get(xz0Var.b())).s, bufferType2);
                        } catch (Exception unused) {
                        }
                        boolean z2 = ((hn0) list.get(xz0Var.b())).q;
                        TextView textView13 = yz0Var.F;
                        if (z2) {
                            i4 = 0;
                            textView13.setVisibility(0);
                            i3 = 8;
                        } else {
                            i3 = 8;
                            i4 = 0;
                            textView13.setVisibility(8);
                        }
                        if (((hn0) list.get(xz0Var.b())).c() == null) {
                            textView11.setVisibility(i3);
                            return;
                        } else {
                            textView11.setVisibility(i4);
                            textView11.setText(((hn0) list.get(xz0Var.b())).c(), TextView.BufferType.NORMAL);
                            return;
                        }
                    case 12:
                        dz0 dz0Var3 = (dz0) xz0Var;
                        dz0Var3.A.setText(((hn0) list.get(xz0Var.b())).d());
                        dz0Var3.B.setText(((hn0) list.get(xz0Var.b())).b());
                        dz0Var3.C = new vy0(this, i9);
                        return;
                    case 13:
                    case 21:
                        pz0 pz0Var = (pz0) xz0Var;
                        pz0Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        pz0Var.B.setText(((hn0) list.get(xz0Var.b())).b());
                        pz0Var.C = new vy0(this, 8);
                        return;
                    case 14:
                    case 37:
                    case 51:
                        rz0 rz0Var = (rz0) xz0Var;
                        rz0Var.B.setText(((hn0) list.get(xz0Var.b())).d());
                        rz0Var.C.setText(((hn0) list.get(xz0Var.b())).b(), TextView.BufferType.NORMAL);
                        return;
                    case 15:
                        tz0 tz0Var = (tz0) xz0Var;
                        TextView textView14 = tz0Var.B;
                        tz0Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        String b4 = ((hn0) list.get(xz0Var.b())).b();
                        if (b4 != null) {
                            str2 = b4;
                        }
                        try {
                            textView14.setText(Html.fromHtml(str2, 63));
                            return;
                        } catch (Exception unused2) {
                            textView14.setText(str2);
                            return;
                        }
                    case 16:
                    case 18:
                    case 26:
                    case 48:
                    case 49:
                    case 58:
                    case 60:
                    case 61:
                        return;
                    case rt0.p /* 17 */:
                        ((iz0) xz0Var).A.setText(((hn0) list.get(xz0Var.b())).d());
                        return;
                    case 19:
                        zy0 zy0Var = (zy0) xz0Var;
                        ProgressBar progressBar2 = zy0Var.E;
                        zy0Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        TextView textView15 = zy0Var.B;
                        String str10 = ((hn0) list.get(xz0Var.b())).e;
                        TextView.BufferType bufferType3 = TextView.BufferType.NORMAL;
                        textView15.setText(str10, bufferType3);
                        zy0Var.C.setText(((hn0) list.get(xz0Var.b())).f, bufferType3);
                        zy0Var.D.setText(((hn0) list.get(xz0Var.b())).c(), bufferType3);
                        progressBar2.setProgress(w(((hn0) list.get(xz0Var.b())).t, progressBar2));
                        return;
                    case 20:
                        kz0 kz0Var = (kz0) xz0Var;
                        kz0Var.B.setText(((hn0) list.get(xz0Var.b())).d());
                        kz0Var.C = new p8(this, 25, kz0Var);
                        return;
                    case 22:
                        uz0 uz0Var = (uz0) xz0Var;
                        uz0Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        uz0Var.B.setText(((hn0) list.get(xz0Var.b())).b());
                        uz0Var.C = new vy0(this, 9);
                        return;
                    case 23:
                        vz0 vz0Var2 = (vz0) xz0Var;
                        vz0Var2.A.setText(((hn0) list.get(xz0Var.b())).d());
                        vz0Var2.B.setText(((hn0) list.get(xz0Var.b())).b());
                        return;
                    case 25:
                        dz0 dz0Var4 = (dz0) xz0Var;
                        dz0Var4.A.setText(((hn0) list.get(xz0Var.b())).d());
                        dz0Var4.B.setText(((hn0) list.get(xz0Var.b())).b());
                        dz0Var4.C = new vy0(this, 3);
                        return;
                    case 28:
                        jz0 jz0Var2 = (jz0) xz0Var;
                        ImageView imageView = jz0Var2.B;
                        jz0Var2.A.setText(((hn0) list.get(xz0Var.b())).b(), TextView.BufferType.NORMAL);
                        imageView.setImageDrawable(((hn0) list.get(xz0Var.b())).a());
                        imageView.setImageTintList(ColorStateList.valueOf(B));
                        return;
                    case 31:
                        lz0 lz0Var = (lz0) xz0Var;
                        ImageView imageView2 = lz0Var.B;
                        lz0Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        lz0Var.C = new vy0(this, 10);
                        if (((hn0) list.get(xz0Var.b())).d().equals(context.getString(R.string.processor))) {
                            imageView2.setImageDrawable(k32.x(context, R.drawable.ic_info));
                        } else {
                            imageView2.setImageDrawable(k32.x(context, R.drawable.ic_action_settings));
                            if (G) {
                                imageView2.setImageDrawable(k32.x(context, R.drawable.ic_action_settings));
                            }
                        }
                        imageView2.setImageTintList(ColorStateList.valueOf(D));
                        return;
                    case 33:
                        g01 g01Var = (g01) xz0Var;
                        g01Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        g01Var.B.setText(((hn0) list.get(xz0Var.b())).b(), TextView.BufferType.NORMAL);
                        return;
                    case 34:
                        wz0 wz0Var = (wz0) xz0Var;
                        TextView textView16 = wz0Var.A;
                        ProgressBar progressBar3 = wz0Var.D;
                        String t = d51.t(new StringBuilder(), ((hn0) list.get(xz0Var.b())).v, nTAZxGMqQtZZAQ.HwHmup);
                        TextView textView17 = wz0Var.B;
                        TextView.BufferType bufferType4 = TextView.BufferType.NORMAL;
                        textView17.setText(t, bufferType4);
                        wz0Var.C.setImageDrawable(((hn0) list.get(xz0Var.b())).a());
                        progressBar3.setProgress(w(((hn0) list.get(xz0Var.b())).t, progressBar3));
                        String d3 = ((hn0) list.get(xz0Var.b())).d();
                        if (TextUtils.isEmpty(this.x) || d3 == null || !d3.toLowerCase(Locale.ROOT).contains(this.x)) {
                            textView16.setText(d3, bufferType4);
                        } else {
                            textView16.setText(uz1.H(i6, d3, this.x), bufferType4);
                        }
                        wz0Var.E = new vy0(this, 6);
                        return;
                    case 35:
                        ((hn0) list.get(xz0Var.b())).getClass();
                        throw null;
                    case 36:
                        return;
                    case 38:
                        az0 az0Var = (az0) xz0Var;
                        ProgressBar progressBar4 = az0Var.E;
                        az0Var.A.setText(((hn0) list.get(xz0Var.b())).d());
                        TextView textView18 = az0Var.B;
                        String str11 = ((hn0) list.get(xz0Var.b())).e;
                        TextView.BufferType bufferType5 = TextView.BufferType.NORMAL;
                        textView18.setText(str11, bufferType5);
                        az0Var.C.setText(((hn0) list.get(xz0Var.b())).f, bufferType5);
                        az0Var.D.setText(((hn0) list.get(xz0Var.b())).c(), bufferType5);
                        progressBar4.setProgress(w(((hn0) list.get(xz0Var.b())).t, progressBar4));
                        return;
                    case 39:
                        PieChart pieChart = ((zz0) xz0Var).A;
                        j71 j71Var = ((hn0) list.get(i)).y;
                        if (j71Var == null) {
                            pieChart.h = null;
                            pieChart.D = false;
                            pieChart.E = null;
                            pieChart.s.h = null;
                            pieChart.invalidate();
                            pieChart.setCenterText(str2);
                            return;
                        }
                        pieChart.setData(j71Var);
                        pieChart.setCenterText(((int) j71Var.m()) + " " + context.getString(R.string.total));
                        k71 l = j71Var.l();
                        if (l != null) {
                            l.s = C;
                            int i14 = C;
                            ArrayList arrayList = l.b;
                            arrayList.clear();
                            arrayList.add(Integer.valueOf(i14));
                            l.h = n52.c(16.0f);
                            l.r = 2;
                        }
                        pieChart.invalidate();
                        return;
                    case 41:
                        kz0 kz0Var2 = (kz0) xz0Var;
                        kz0Var2.C = new b20(2, this, xz0Var, kz0Var2);
                        return;
                    case 42:
                        ((kz0) xz0Var).C = new tb(this, 9, xz0Var);
                        return;
                    case 43:
                        vz0 vz0Var3 = (vz0) xz0Var;
                        String str12 = ((hn0) list.get(xz0Var.b())).d;
                        if (str12 != null) {
                            str2 = str12;
                        }
                        vz0Var3.B.setText(Html.fromHtml(str2, 63));
                        return;
                    case 44:
                    case 46:
                        xy0 xy0Var = (xy0) xz0Var;
                        ProgressBar progressBar5 = xy0Var.G;
                        TextView textView19 = xy0Var.B;
                        String str13 = ((hn0) list.get(xz0Var.b())).f;
                        TextView.BufferType bufferType6 = TextView.BufferType.NORMAL;
                        textView19.setText(str13, bufferType6);
                        xy0Var.A.setText(((hn0) list.get(xz0Var.b())).e, bufferType6);
                        xy0Var.F.setText(((hn0) list.get(xz0Var.b())).d, bufferType6);
                        xy0Var.E.setText(((hn0) list.get(xz0Var.b())).s, bufferType6);
                        xy0Var.C.setText(((hn0) list.get(xz0Var.b())).g, bufferType6);
                        xy0Var.D.setText(uz1.a(context.getString(R.string.free)), bufferType6);
                        progressBar5.setProgress(((hn0) list.get(xz0Var.b())).v);
                        progressBar5.setSecondaryProgress(((hn0) list.get(xz0Var.b())).t);
                        return;
                    case 45:
                        ez0 ez0Var = (ez0) xz0Var;
                        ImageView imageView3 = ez0Var.C;
                        ImageView imageView4 = ez0Var.B;
                        ez0Var.A.setText(((hn0) list.get(xz0Var.b())).b, TextView.BufferType.NORMAL);
                        if (((hn0) list.get(xz0Var.b())).D) {
                            imageView4.setVisibility(0);
                            imageView3.setVisibility(8);
                            return;
                        } else {
                            imageView3.setVisibility(0);
                            imageView4.setVisibility(8);
                            return;
                        }
                    case 52:
                        c01 c01Var = (c01) xz0Var;
                        MaterialButton materialButton = c01Var.A;
                        int b5 = c01Var.b();
                        if (b5 == -1) {
                            return;
                        }
                        hn0 hn0Var2 = (hn0) list.get(b5);
                        String str14 = hn0Var2.d;
                        int i15 = hn0Var2.r;
                        Integer valueOf = Integer.valueOf(i15);
                        HashMap hashMap = this.y;
                        if (hashMap.containsKey(valueOf)) {
                            drawable = (Drawable) hashMap.get(Integer.valueOf(i15));
                        } else {
                            Drawable x2 = k32.x(context, i15);
                            if (x2 != null) {
                                x2 = x2.mutate();
                                x2.setTint(D);
                                int i16 = this.z;
                                x2.setBounds(0, 0, i16, i16);
                                hashMap.put(Integer.valueOf(i15), x2);
                            }
                            drawable = x2;
                        }
                        if (drawable != null) {
                            Drawable mutate = drawable.getConstantState().newDrawable().mutate();
                            mutate.setBounds(drawable.getBounds());
                            SpannableString spannableString = new SpannableString("   " + str14);
                            spannableString.setSpan(new ro(mutate), 0, 1, 17);
                            materialButton.setText(spannableString);
                        } else {
                            materialButton.setText(str14);
                        }
                        materialButton.setOnClickListener(new uc(this, 12, c01Var));
                        return;
                    case 53:
                        pz0 pz0Var2 = (pz0) xz0Var;
                        pz0Var2.A.setText(((hn0) list.get(xz0Var.b())).b);
                        try {
                            pz0Var2.B.setText(((hn0) list.get(xz0Var.b())).d, TextView.BufferType.NORMAL);
                        } catch (Exception unused3) {
                        }
                        pz0Var2.C = new vy0(this, 7);
                        return;
                    case 54:
                        qz0 qz0Var = (qz0) xz0Var;
                        TextView textView20 = qz0Var.D;
                        qz0Var.A.setText(((hn0) list.get(xz0Var.b())).b);
                        try {
                            qz0Var.C.setText(((hn0) list.get(xz0Var.b())).d, TextView.BufferType.NORMAL);
                        } catch (Exception unused4) {
                        }
                        qz0Var.B.setText(((hn0) list.get(xz0Var.b())).c);
                        String str15 = ((hn0) list.get(xz0Var.b())).s;
                        textView20.setText(str15, TextView.BufferType.NORMAL);
                        if (ts0.b(context, R.string.verified_boot_orange).equals(str15)) {
                            textView20.setTextColor(i8);
                            return;
                        }
                        if (ts0.b(context, R.string.verified_boot_green).equals(str15)) {
                            textView20.setTextColor(this.t);
                            return;
                        }
                        if (ts0.b(context, R.string.verified_boot_yellow).equals(str15)) {
                            textView20.setTextColor(this.u);
                            return;
                        } else if (ts0.b(context, R.string.verified_boot_red).equals(str15)) {
                            textView20.setTextColor(i7);
                            return;
                        } else {
                            textView20.setTextColor(D);
                            return;
                        }
                    case 55:
                        g01 g01Var2 = (g01) xz0Var;
                        g01Var2.A.setText(((hn0) list.get(xz0Var.b())).b);
                        g01Var2.B.setText(((hn0) list.get(xz0Var.b())).d, TextView.BufferType.NORMAL);
                        return;
                    case 56:
                        fz0 fz0Var = (fz0) xz0Var;
                        ChipGroup chipGroup = fz0Var.A;
                        int b6 = fz0Var.b();
                        if (b6 == -1 || b6 >= list.size()) {
                            return;
                        }
                        ArrayList arrayList2 = ((hn0) list.get(b6)).A;
                        chipGroup.removeAllViews();
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            return;
                        }
                        LayoutInflater.from(chipGroup.getContext());
                        int size = arrayList2.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            Chip chip = new Chip(chipGroup.getContext(), null);
                            chip.setText((String) obj);
                            chip.setCheckable(false);
                            chip.setClickable(false);
                            chip.setFocusable(false);
                            chip.setChipBackgroundColor(ColorStateList.valueOf(F));
                            chip.setChipStrokeColor(ColorStateList.valueOf(A));
                            chip.setChipCornerRadius(42.0f);
                            chip.setTextColor(A);
                            chip.setChipStrokeWidth(1.75f);
                            chip.setTextSize(2, 12.0f);
                            chip.setChipMinHeight(uz1.l(context, 24.0f));
                            chip.setAllCaps(false);
                            chip.setEllipsize(TextUtils.TruncateAt.END);
                            chip.setMaxLines(1);
                            chipGroup.addView(chip);
                        }
                        return;
                    case 57:
                        wy0 wy0Var = (wy0) xz0Var;
                        ImageView imageView5 = wy0Var.C;
                        TextView textView21 = wy0Var.A;
                        String str16 = ((hn0) list.get(xz0Var.b())).b;
                        TextView.BufferType bufferType7 = TextView.BufferType.NORMAL;
                        textView21.setText(str16, bufferType7);
                        wy0Var.B.setText(((hn0) list.get(xz0Var.b())).d, bufferType7);
                        imageView5.setImageDrawable(((hn0) list.get(xz0Var.b())).f391a);
                        imageView5.setImageTintList(ColorStateList.valueOf(B));
                        if (G) {
                            imageView5.setImageAlpha(200);
                            return;
                        }
                        return;
                    case 59:
                        ((hz0) xz0Var).A.setClusters(((hn0) list.get(xz0Var.b())).E);
                        return;
                    case 62:
                        fz0 fz0Var2 = (fz0) xz0Var;
                        ChipGroup chipGroup2 = fz0Var2.A;
                        int b7 = fz0Var2.b();
                        if (b7 == -1 || b7 >= list.size()) {
                            return;
                        }
                        ArrayList arrayList3 = ((hn0) list.get(b7)).B;
                        chipGroup2.removeAllViews();
                        if (arrayList3 == null || arrayList3.isEmpty()) {
                            return;
                        }
                        int size2 = arrayList3.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj2 = arrayList3.get(i18);
                            i18++;
                            p71 p71Var = (p71) obj2;
                            Chip chip2 = new Chip(chipGroup2.getContext(), attributeSet);
                            int i19 = p71Var.f774a;
                            boolean z3 = i19 == R.id.action_open ? true : z;
                            int i20 = z3 ? -1 : C;
                            chip2.setText(p71Var.b);
                            chip2.setCheckable(z);
                            chip2.setClickable(true);
                            chip2.setFocusable(true);
                            chip2.setChipBackgroundColor(ColorStateList.valueOf(z3 ? A : ts.b(ts.e(A, 40), F)));
                            chip2.setElevation(0.0f);
                            chip2.setChipStrokeColor(ColorStateList.valueOf(A));
                            chip2.setChipStrokeWidth(0.0f);
                            chip2.setChipCornerRadius(f);
                            chip2.setTextColor(i20);
                            chip2.setTextSize(2, 13.0f);
                            chip2.setChipMinHeight(uz1.l(context, 28.0f));
                            chip2.setChipStartPadding(uz1.l(context, 4.0f));
                            chip2.setChipEndPadding(uz1.l(context, 6.0f));
                            chip2.setAllCaps(z);
                            chip2.setEllipsize(TextUtils.TruncateAt.END);
                            chip2.setMaxLines(1);
                            chip2.setRippleColor(ColorStateList.valueOf(ts.e(A, 60)));
                            int i21 = i19 == R.id.action_open ? R.attr.ic_open : i19 == R.id.action_market ? R.attr.ic_market : i19 == R.id.action_manifest ? R.attr.ic_manifest : i19 == R.id.action_download ? R.attr.ic_download : i19 == R.id.action_kill ? R.attr.ic_kill : i19 == R.id.action_uninstall ? R.attr.ic_uninstall : i19 == R.id.action_disable ? R.attr.ic_disable : 0;
                            if (i21 != 0) {
                                TypedValue typedValue = new TypedValue();
                                if (context.getTheme().resolveAttribute(i21, typedValue, true) && (x = k32.x(context, typedValue.resourceId)) != null) {
                                    Drawable mutate2 = x.mutate();
                                    mutate2.setTint(i20);
                                    chip2.setChipIcon(mutate2);
                                    chip2.setChipIconVisible(true);
                                    chip2.setChipIconSize(uz1.l(context, 14.0f));
                                    chip2.setIconStartPadding(uz1.l(context, 6.0f));
                                    chip2.setTextStartPadding(uz1.l(context, 4.0f));
                                }
                            }
                            chip2.setOnClickListener(new j8(this, i19));
                            chipGroup2.addView(chip2);
                            attributeSet = null;
                            z = false;
                            f = 42.0f;
                        }
                        return;
                }
            } catch (IndexOutOfBoundsException | Exception unused5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        yy0 yy0Var;
        switch (i) {
            case 0:
                return new mz0(d51.j(viewGroup, R.layout.recyclerlist_header, viewGroup, false));
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
            default:
                return new vz0(d51.j(viewGroup, R.layout.recyclerlist_item_card, viewGroup, false));
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
            case 12:
            case 25:
                View j = d51.j(viewGroup, R.layout.recyclerlist_button_card, viewGroup, false);
                dz0 dz0Var = new dz0(j);
                MaterialCardView materialCardView = (MaterialCardView) j.findViewById(R.id.button_card);
                dz0Var.A = (TextView) j.findViewById(R.id.button_title);
                dz0Var.B = (TextView) j.findViewById(R.id.button_summary);
                materialCardView.setOnClickListener(dz0Var);
                return dz0Var;
            case 3:
                return new k01(d51.j(viewGroup, R.layout.recyclerlist_task_card, viewGroup, false));
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new jz0(d51.j(viewGroup, R.layout.recyclerlist_hardware_card, viewGroup, false));
            case 5:
                View j2 = d51.j(viewGroup, R.layout.recyclerlist_taskheader, viewGroup, false);
                j01 j01Var = new j01(j2);
                j01Var.A = (TextView) j2.findViewById(R.id.taskheader_title);
                j01Var.B = (TextView) j2.findViewById(R.id.taskheader_summary);
                return j01Var;
            case 8:
                View j3 = d51.j(viewGroup, R.layout.recyclerlist_bar_card, viewGroup, false);
                yy0 yy0Var2 = new yy0(j3);
                yy0Var2.A = (TextView) j3.findViewById(R.id.item_title);
                TextView textView = (TextView) j3.findViewById(R.id.item_summary_total);
                yy0Var2.B = textView;
                yy0Var2.C = (TextView) j3.findViewById(R.id.item_summary_used);
                yy0Var2.D = (TextView) j3.findViewById(R.id.item_summary_free);
                yy0Var2.E = (ProgressBar) j3.findViewById(R.id.pbPercent);
                RelativeLayout relativeLayout = (RelativeLayout) j3.findViewById(R.id.container);
                yy0Var2.F = relativeLayout;
                zv0 v = v(j3.getContext());
                try {
                    v.setLayoutParams(textView.getLayoutParams());
                    v.setTextColor(textView.getTextColors().getDefaultColor());
                    v.setTypeface(textView.getTypeface(), 1);
                    v.setTextSize(uz1.o0(j3.getContext(), j3.getResources().getDimension(R.dimen.recycler_item_font_size)));
                    relativeLayout.removeView(textView);
                    relativeLayout.addView(v);
                } catch (Exception unused) {
                }
                yy0Var2.B = v;
                zv0 v2 = v(j3.getContext());
                try {
                    v2.setLayoutParams(yy0Var2.C.getLayoutParams());
                    v2.setTextColor(yy0Var2.C.getTextColors().getDefaultColor());
                    v2.setTextSize(14.0f);
                    yy0Var2.F.removeView(yy0Var2.C);
                    yy0Var2.F.addView(v2);
                } catch (Exception unused2) {
                }
                yy0Var2.C = v2;
                zv0 v3 = v(j3.getContext());
                try {
                    v3.setLayoutParams(yy0Var2.D.getLayoutParams());
                    v3.setTextColor(yy0Var2.D.getTextColors().getDefaultColor());
                    v3.setTextSize(14.0f);
                    yy0Var2.F.removeView(yy0Var2.D);
                    yy0Var2.F.addView(v3);
                } catch (Exception unused3) {
                }
                yy0Var2.D = v3;
                yy0Var = yy0Var2;
                return yy0Var;
            case rt0.o /* 9 */:
                View j4 = d51.j(viewGroup, R.layout.recyclerlist_battery_card, viewGroup, false);
                cz0 cz0Var = new cz0(j4);
                cz0Var.L = 0;
                cz0Var.A = (TextView) j4.findViewById(R.id.battery_level);
                cz0Var.B = (TextView) j4.findViewById(R.id.battery_status);
                cz0Var.C = (TextView) j4.findViewById(R.id.battery_current);
                cz0Var.D = (TextView) j4.findViewById(R.id.battery_power);
                cz0Var.E = (TextView) j4.findViewById(R.id.battery_temp);
                cz0Var.F = (TextView) j4.findViewById(R.id.battery_voltage);
                cz0Var.G = (TextView) j4.findViewById(R.id.battery_charge_rate);
                cz0Var.H = (TextView) j4.findViewById(R.id.battery_time);
                cz0Var.I = (TextView) j4.findViewById(R.id.battery_time_label);
                GraphView graphView = (GraphView) j4.findViewById(R.id.battery_graph);
                cz0Var.J = graphView;
                qq0 qq0Var = new qq0();
                cz0Var.K = qq0Var;
                graphView.getClass();
                qq0Var.f.add(new WeakReference(graphView));
                graphView.g.add(qq0Var);
                graphView.b(false, false);
                jh0 gridLabelRenderer = graphView.getGridLabelRenderer();
                ih0 ih0Var = gridLabelRenderer.f483a;
                ih0Var.l = 3;
                ih0Var.g = E;
                gridLabelRenderer.b();
                ih0 ih0Var2 = gridLabelRenderer.f483a;
                ih0Var2.j = false;
                ih0Var2.k = false;
                x82 viewport = graphView.getViewport();
                viewport.o = true;
                viewport.p = 3;
                graphView.getViewport().g = false;
                graphView.getViewport().getClass();
                sh shVar = qq0Var.h;
                shVar.getClass();
                shVar.f936a = 8;
                qq0Var.c = A;
                return cz0Var;
            case 10:
                View j5 = d51.j(viewGroup, R.layout.recyclerlist_store_card, viewGroup, false);
                i01 i01Var = new i01(j5);
                i01Var.A = (ImageView) j5.findViewById(R.id.button_image);
                i01Var.B = (TextView) j5.findViewById(R.id.button_title);
                TextView textView2 = (TextView) j5.findViewById(R.id.button_summary);
                i01Var.C = textView2;
                textView2.setOnClickListener(i01Var);
                return i01Var;
            case 11:
                View j6 = d51.j(viewGroup, R.layout.recyclerlist_network_card, viewGroup, false);
                yz0 yz0Var = new yz0(j6);
                yz0Var.A = (ImageView) j6.findViewById(R.id.net_icon);
                yz0Var.B = (TextView) j6.findViewById(R.id.net_title);
                yz0Var.C = (TextView) j6.findViewById(R.id.net_summary);
                yz0Var.D = (TextView) j6.findViewById(R.id.net_summary2);
                yz0Var.E = (TextView) j6.findViewById(R.id.net_summary1);
                yz0Var.F = (TextView) j6.findViewById(R.id.badge_vpn);
                return yz0Var;
            case 13:
            case 21:
                return new pz0(d51.j(viewGroup, R.layout.recyclerlist_item_copy_card, viewGroup, false));
            case 14:
                return new rz0(d51.j(viewGroup, R.layout.recyclerlist_packageinfo_card, viewGroup, false), 14);
            case 15:
                View j7 = d51.j(viewGroup, R.layout.recyclerlist_permissions_card, viewGroup, false);
                tz0 tz0Var = new tz0(j7);
                tz0Var.A = (TextView) j7.findViewById(R.id.item_title);
                tz0Var.B = (TextView) j7.findViewById(R.id.item_summary);
                return tz0Var;
            case 16:
                return new sz0(d51.j(viewGroup, R.layout.recyclerlist_padding_card, viewGroup, false), 1);
            case rt0.p /* 17 */:
                View j8 = d51.j(viewGroup, R.layout.recyclerlist_dialog_header, viewGroup, false);
                iz0 iz0Var = new iz0(j8);
                iz0Var.A = (TextView) j8.findViewById(R.id.dialog_header_title);
                return iz0Var;
            case 18:
                return new sz0(d51.j(viewGroup, R.layout.recyclerlist_padding_fill_card, viewGroup, false), 0);
            case 19:
                View j9 = d51.j(viewGroup, R.layout.recyclerlist_dialog_bar_card, viewGroup, false);
                zy0 zy0Var = new zy0(j9);
                zy0Var.A = (TextView) j9.findViewById(R.id.item_title);
                TextView textView3 = (TextView) j9.findViewById(R.id.item_summary_total);
                zy0Var.B = textView3;
                zy0Var.C = (TextView) j9.findViewById(R.id.item_summary_used);
                zy0Var.D = (TextView) j9.findViewById(R.id.item_summary_free);
                zy0Var.E = (ProgressBar) j9.findViewById(R.id.pbPercent);
                RelativeLayout relativeLayout2 = (RelativeLayout) j9.findViewById(R.id.container);
                zy0Var.F = relativeLayout2;
                zv0 v4 = v(j9.getContext());
                try {
                    v4.setLayoutParams(textView3.getLayoutParams());
                    v4.setTextColor(textView3.getTextColors().getDefaultColor());
                    v4.setTypeface(textView3.getTypeface(), 1);
                    v4.setTextSize(uz1.o0(j9.getContext(), j9.getResources().getDimension(R.dimen.recycler_item_font_size)));
                    relativeLayout2.removeView(textView3);
                    relativeLayout2.addView(v4);
                } catch (Exception unused4) {
                }
                zy0Var.B = v4;
                zv0 v5 = v(j9.getContext());
                try {
                    v5.setLayoutParams(zy0Var.C.getLayoutParams());
                    v5.setTextColor(zy0Var.C.getTextColors().getDefaultColor());
                    v5.setTextSize(uz1.o0(j9.getContext(), j9.getResources().getDimension(R.dimen.recycler_item_small_font_size)));
                    zy0Var.F.removeView(zy0Var.C);
                    zy0Var.F.addView(v5);
                } catch (Exception unused5) {
                }
                zy0Var.C = v5;
                zv0 v6 = v(j9.getContext());
                try {
                    v6.setLayoutParams(zy0Var.D.getLayoutParams());
                    v6.setTextColor(zy0Var.D.getTextColors().getDefaultColor());
                    v6.setTextSize(uz1.o0(j9.getContext(), j9.getResources().getDimension(R.dimen.recycler_item_small_font_size)));
                    zy0Var.F.removeView(zy0Var.D);
                    zy0Var.F.addView(v6);
                } catch (Exception unused6) {
                }
                zy0Var.D = v6;
                yy0Var = zy0Var;
                return yy0Var;
            case 20:
                return new kz0(d51.j(viewGroup, R.layout.recyclerlist_header_hide, viewGroup, false));
            case 22:
                View j10 = d51.j(viewGroup, R.layout.recyclerlist_sensor_main, viewGroup, false);
                uz0 uz0Var = new uz0(j10);
                MaterialCardView materialCardView2 = (MaterialCardView) j10.findViewById(R.id.sensor_card_main);
                uz0Var.A = (TextView) j10.findViewById(R.id.sensor_title);
                uz0Var.B = (TextView) j10.findViewById(R.id.sensor_summary);
                materialCardView2.setOnClickListener(uz0Var);
                return uz0Var;
            case 23:
                return new vz0(d51.j(viewGroup, R.layout.recyclerlist_sensor_item, viewGroup, false));
            case 24:
                return new k01(d51.j(viewGroup, R.layout.recyclerlist_task_updated_card, viewGroup, false));
            case 26:
                return new sz0(d51.j(viewGroup, R.layout.recyclerlist_padding_dummy_card, viewGroup, false), 0);
            case 27:
                return new mz0(d51.j(viewGroup, R.layout.recyclerlist_subheader, viewGroup, false));
            case 28:
                return new jz0(d51.j(viewGroup, R.layout.recyclerlist_camera_summary_card, viewGroup, false));
            case 29:
            case 40:
                return new vz0(d51.j(viewGroup, R.layout.recyclerlist_item_card, viewGroup, false));
            case 30:
                return new vz0(d51.j(viewGroup, R.layout.recyclerlist_camera_item_card, viewGroup, false));
            case 31:
                View j11 = d51.j(viewGroup, R.layout.recyclerlist_header_settings, viewGroup, false);
                lz0 lz0Var = new lz0(j11);
                lz0Var.A = (TextView) j11.findViewById(R.id.header_title);
                ImageView imageView = (ImageView) j11.findViewById(R.id.settings_button);
                lz0Var.B = imageView;
                imageView.setOnClickListener(lz0Var);
                return lz0Var;
            case rt0.q /* 32 */:
                return new k01(d51.j(viewGroup, R.layout.recyclerlist_camera_warn_card, viewGroup, false));
            case 33:
                return new g01(d51.j(viewGroup, R.layout.recyclerlist_item_card_stacked_mono, viewGroup, false));
            case 34:
                return new wz0(d51.j(viewGroup, R.layout.recyclerlist_memory, viewGroup, false));
            case 35:
                View j12 = d51.j(viewGroup, R.layout.recyclerlist_battery_monitor_card, viewGroup, false);
                bz0 bz0Var = new bz0(j12);
                return bz0Var;
            case 36:
                return new wz0(d51.j(viewGroup, R.layout.recyclerlist_battery_monitor_card, viewGroup, false));
            case 37:
                return new rz0(d51.j(viewGroup, R.layout.tools_bluetooth_pair_item, viewGroup, false), 37);
            case 38:
                View j13 = d51.j(viewGroup, R.layout.tools_bluetooth_item, viewGroup, false);
                az0 az0Var = new az0(j13);
                az0Var.A = (TextView) j13.findViewById(R.id.item_title);
                az0Var.B = (TextView) j13.findViewById(R.id.item_summary_total);
                az0Var.C = (TextView) j13.findViewById(R.id.item_summary_used);
                az0Var.D = (TextView) j13.findViewById(R.id.item_summary_free);
                az0Var.E = (ProgressBar) j13.findViewById(R.id.pbPercent);
                return az0Var;
            case 39:
                return new zz0(d51.j(viewGroup, R.layout.recyclerlist_pie_card, viewGroup, false));
            case 41:
                return new kz0(d51.j(viewGroup, R.layout.recyclerlist_header_unhide, viewGroup, false));
            case 42:
                return new kz0(d51.j(viewGroup, R.layout.recyclerlist_header_more, viewGroup, false));
            case 43:
                return new vz0(d51.j(viewGroup, R.layout.recyclerlist_item_single_line, viewGroup, false));
            case 44:
                return new xy0(d51.j(viewGroup, R.layout.recyclerlist_dialog_bar3_card, viewGroup, false));
            case 45:
                View j14 = d51.j(viewGroup, R.layout.recyclerlist_check, viewGroup, false);
                ez0 ez0Var = new ez0(j14);
                ez0Var.A = (TextView) j14.findViewById(R.id.item_title);
                ez0Var.B = (ImageView) j14.findViewById(R.id.item_checked);
                ez0Var.C = (ImageView) j14.findViewById(R.id.item_not_checked);
                return ez0Var;
            case 46:
                return new xy0(d51.j(viewGroup, R.layout.recyclerlist_bar3_card, viewGroup, false));
            case 47:
                return new vz0(d51.j(viewGroup, R.layout.recyclerlist_item_fill, viewGroup, false));
            case 48:
                return new sz0(d51.j(viewGroup, R.layout.recyclerlist_padding_card_slim, viewGroup, false), 1);
            case 49:
                return new sz0(d51.j(viewGroup, R.layout.recyclerlist_padding_card_slimmer, viewGroup, false), 1);
            case 50:
                return new vz0(d51.j(viewGroup, R.layout.recyclerlist_item_fake, viewGroup, false));
            case 51:
                return new rz0(d51.j(viewGroup, R.layout.recyclerlist_dialog_info_fake_card, viewGroup, false), 51);
            case 52:
                View j15 = d51.j(viewGroup, R.layout.recyclerlist_real_button_card, viewGroup, false);
                c01 c01Var = new c01(j15);
                c01Var.A = (MaterialButton) j15.findViewById(R.id.button);
                return c01Var;
            case 53:
                return new pz0(d51.j(viewGroup, R.layout.recyclerlist_item_icon_card, viewGroup, false));
            case 54:
                View j16 = d51.j(viewGroup, R.layout.recyclerlist_item_double_card, viewGroup, false);
                qz0 qz0Var = new qz0(j16);
                qz0Var.A = (TextView) j16.findViewById(R.id.item_title_left);
                qz0Var.C = (TextView) j16.findViewById(R.id.item_summary_left);
                qz0Var.B = (TextView) j16.findViewById(R.id.item_title_right);
                qz0Var.D = (TextView) j16.findViewById(R.id.item_summary_right);
                return qz0Var;
            case 55:
                return new g01(d51.j(viewGroup, R.layout.recyclerlist_item_card_stacked, viewGroup, false));
            case 56:
                return new fz0(d51.j(viewGroup, R.layout.recyclerlist_chip_row, viewGroup, false));
            case 57:
                View j17 = d51.j(viewGroup, R.layout.recyclerlist_banner_card, viewGroup, false);
                wy0 wy0Var = new wy0(j17);
                wy0Var.A = (TextView) j17.findViewById(R.id.item_title);
                wy0Var.B = (TextView) j17.findViewById(R.id.item_summary);
                wy0Var.C = (ImageView) j17.findViewById(R.id.item_icon);
                return wy0Var;
            case 58:
                return new vz0(d51.j(viewGroup, R.layout.recyclerlist_item_fill_slim, viewGroup, false));
            case 59:
                View j18 = d51.j(viewGroup, R.layout.recyclerlist_cpu_configuration, viewGroup, false);
                hz0 hz0Var = new hz0(j18);
                hz0Var.A = (CpuConfigurationView) j18.findViewById(R.id.cpu_config_view);
                return hz0Var;
            case 60:
                return new sz0(d51.j(viewGroup, R.layout.recyclerlist_divider, viewGroup, false), 1);
            case 61:
                return new vz0(d51.j(viewGroup, R.layout.recyclerlist_button_double, viewGroup, false));
            case 62:
                return new fz0(d51.j(viewGroup, R.layout.recyclerlist_pill_row, viewGroup, false));
        }
    }

    public final void x(List list) {
        List list2 = this.d;
        try {
            list2.clear();
            if (list != null) {
                list2.addAll(list);
            }
            f();
        } catch (NullPointerException unused) {
        }
    }
}
