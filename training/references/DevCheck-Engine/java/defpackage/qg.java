package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.emoji2.text.Fk.Iyrs;
import androidx.media.RfwE.BIxeFreLLop;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class qg extends ld0 {
    public static final String[] o0 = {"overall", "cpu", "memory", "disk", "gpu"};
    public NestedScrollView f0;
    public TextView g0;
    public LinearLayout h0;
    public ProgressBar i0;
    public View j0;
    public qh[] k0;
    public int l0;
    public boolean m0;
    public final zf d0 = new zf(3);
    public final Handler e0 = new Handler(Looper.getMainLooper());
    public boolean n0 = false;

    public static boolean A0(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public static int C0(long j) {
        int[] iArr = {1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, rt0.s, rt0.t, rt0.u, rt0.v, rt0.w};
        double d = j / 1.073741824E9d;
        for (int i = 0; i < 17; i++) {
            int i2 = iArr[i];
            if (i2 >= d - 0.5d) {
                return i2;
            }
        }
        return iArr[16];
    }

    public static String F0(String str) {
        int indexOf;
        if (str == null || str.isEmpty()) {
            return null;
        }
        int indexOf2 = str.indexOf(10);
        if (indexOf2 >= 0) {
            str = str.substring(indexOf2 + 1);
        }
        if (indexOf2 < 0 && (indexOf = str.indexOf(58)) >= 0 && indexOf < str.length() - 1) {
            str = str.substring(indexOf + 1);
        }
        String trim = str.replace('\n', ',').trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim;
    }

    public static TreeSet u0(xh xhVar, boolean z) {
        TreeSet treeSet = new TreeSet();
        ArrayList arrayList = (ArrayList) xhVar.k;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                wh whVar = (wh) obj;
                int i2 = z ? whVar.f1134a : whVar.b;
                if (i2 > 0) {
                    treeSet.add(Integer.valueOf(i2));
                }
            }
        }
        return treeSet;
    }

    public static GradientDrawable w0(TextView textView, Context context) {
        Drawable background = textView.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(Math.round(6.0f * context.getResources().getDisplayMetrics().density));
        textView.setBackground(gradientDrawable);
        return gradientDrawable;
    }

    public static String y0(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(" · ");
            }
            sb.append((String) arrayList.get(i));
        }
        return sb.toString();
    }

    public static zh z0(double d) {
        zh zhVar = new zh();
        zhVar.f1274a = d;
        zhVar.d = 0;
        return zhVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final void B0() {
        int g;
        int i;
        LayoutInflater layoutInflater;
        Context context;
        char c;
        int i2;
        TextView textView;
        String str;
        String str2;
        String str3;
        ProgressBar progressBar;
        TextView textView2;
        int i3;
        xh xhVar;
        String x0;
        String str4;
        th thVar;
        int i4;
        int i5;
        String str5;
        int parseInt;
        int i6;
        vh vhVar;
        xh xhVar2;
        String str6;
        Context context2;
        int i7;
        boolean z;
        View view;
        boolean z2;
        int i8;
        zh zhVar;
        if (this.m0) {
            D0();
            return;
        }
        if (!G() || this.k0 == null) {
            return;
        }
        Context i0 = i0();
        LayoutInflater from = LayoutInflater.from(i0);
        this.h0.removeAllViews();
        ArrayList arrayList = new ArrayList(this.k0.length);
        ?? r6 = 0;
        for (qh qhVar : this.k0) {
            if (qhVar != null) {
                arrayList.add(qhVar);
            }
        }
        if (arrayList.size() < 2) {
            D0();
            return;
        }
        int i9 = 0;
        LayoutInflater layoutInflater2 = from;
        while (i9 < 5) {
            String str7 = o0[i9];
            View inflate = layoutInflater2.inflate(R.layout.item_bench_compare_metric_card, this.h0, (boolean) r6);
            TextView textView3 = (TextView) inflate.findViewById(R.id.bench_compare_card_title);
            TextView textView4 = (TextView) inflate.findViewById(R.id.bench_compare_card_empty);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.bench_compare_card_rows);
            linearLayout.removeAllViews();
            if ("overall".equals(str7)) {
                try {
                    g = i0.obtainStyledAttributes(new int[]{R.attr.colorPrimary}).getColor(r6, -11760651);
                } finally {
                }
            } else {
                g = ym0.g(i0, str7);
            }
            int i10 = g;
            int hashCode = str7.hashCode();
            String str8 = Iyrs.CZWTLUMLd;
            String str9 = "cpu";
            String str10 = "gpu";
            String str11 = "disk";
            switch (hashCode) {
                case -1091298227:
                    str7.equals("overall");
                    i = R.string.benchmark_compare_metric_overall;
                    break;
                case -1077756671:
                    if (str7.equals(str8)) {
                        i = R.string.benchmark_rankings_section_memory;
                        break;
                    }
                    i = R.string.benchmark_compare_metric_overall;
                    break;
                case 98728:
                    if (str7.equals("cpu")) {
                        i = R.string.benchmark_rankings_section_cpu;
                        break;
                    }
                    i = R.string.benchmark_compare_metric_overall;
                    break;
                case 102572:
                    if (str7.equals("gpu")) {
                        i = R.string.benchmark_rankings_section_gpu;
                        break;
                    }
                    i = R.string.benchmark_compare_metric_overall;
                    break;
                case 3083677:
                    if (str7.equals("disk")) {
                        i = R.string.benchmark_rankings_section_disk;
                        break;
                    }
                    i = R.string.benchmark_compare_metric_overall;
                    break;
                default:
                    i = R.string.benchmark_compare_metric_overall;
                    break;
            }
            int i11 = i9;
            textView3.setText(i);
            textView3.setTextColor(i10);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            double d = 0.0d;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                int i13 = i12 + 1;
                ArrayList arrayList3 = arrayList;
                qh qhVar2 = (qh) obj;
                switch (str7.hashCode()) {
                    case -1091298227:
                        i8 = i13;
                        str7.equals("overall");
                        zhVar = qhVar2.i;
                        break;
                    case -1077756671:
                        i8 = i13;
                        if (str7.equals(str8)) {
                            zhVar = qhVar2.k;
                            break;
                        }
                        zhVar = qhVar2.i;
                        break;
                    case 98728:
                        i8 = i13;
                        if (str7.equals("cpu")) {
                            zhVar = qhVar2.j;
                            break;
                        }
                        zhVar = qhVar2.i;
                        break;
                    case 102572:
                        i8 = i13;
                        if (str7.equals("gpu")) {
                            zhVar = qhVar2.m;
                            break;
                        }
                        zhVar = qhVar2.i;
                        break;
                    case 3083677:
                        if (str7.equals("disk")) {
                            i8 = i13;
                            zhVar = qhVar2.l;
                            break;
                        }
                    default:
                        i8 = i13;
                        zhVar = qhVar2.i;
                        break;
                }
                int i14 = size;
                double d2 = zhVar == null ? 0.0d : zhVar.f1274a;
                if (d2 <= 0.0d) {
                    i12 = i8;
                    arrayList = arrayList3;
                    size = i14;
                } else {
                    Context context3 = i0;
                    arrayList2.add(new pg(qhVar2, d2));
                    if (d2 > d) {
                        d = d2;
                    }
                    i12 = i8;
                    arrayList = arrayList3;
                    size = i14;
                    i0 = context3;
                }
            }
            Context context4 = i0;
            ArrayList arrayList4 = arrayList;
            if (arrayList2.isEmpty()) {
                layoutInflater = layoutInflater2;
                context = context4;
                c = 2;
                i2 = 0;
            } else if (d <= 0.0d) {
                layoutInflater = layoutInflater2;
                context = context4;
                i2 = 0;
                c = 2;
            } else {
                textView4.setVisibility(8);
                boolean z3 = false;
                linearLayout.setVisibility(0);
                boolean z4 = true;
                Collections.sort(arrayList2, new c4(1));
                int i15 = 0;
                LayoutInflater layoutInflater3 = layoutInflater2;
                while (i15 < arrayList2.size()) {
                    View inflate2 = layoutInflater3.inflate(R.layout.item_bench_compare_row, linearLayout, z3);
                    pg pgVar = (pg) arrayList2.get(i15);
                    boolean z5 = i15 == 0 ? z4 : false;
                    TextView textView5 = (TextView) inflate2.findViewById(R.id.bench_compare_row_device);
                    LayoutInflater layoutInflater4 = layoutInflater3;
                    TextView textView6 = (TextView) inflate2.findViewById(R.id.bench_compare_row_soc);
                    int i16 = i15;
                    TextView textView7 = (TextView) inflate2.findViewById(R.id.bench_compare_row_you_pill);
                    ArrayList arrayList5 = arrayList2;
                    TextView textView8 = (TextView) inflate2.findViewById(R.id.bench_compare_row_leader_pill);
                    boolean z6 = z5;
                    ProgressBar progressBar2 = (ProgressBar) inflate2.findViewById(R.id.bench_compare_row_bar);
                    LinearLayout linearLayout2 = linearLayout;
                    TextView textView9 = (TextView) inflate2.findViewById(R.id.bench_compare_row_score);
                    qh qhVar3 = pgVar.f788a;
                    double d3 = pgVar.b;
                    boolean equals = "__mine__".equals(qhVar3.f842a);
                    qh qhVar4 = pgVar.f788a;
                    String str12 = qhVar4.b;
                    String str13 = qhVar4.f842a;
                    if (str12 == null || str12.isEmpty()) {
                        str12 = str13;
                    }
                    textView5.setText(str12);
                    switch (str7.hashCode()) {
                        case -1091298227:
                            textView = textView6;
                            str = str9;
                            str2 = str10;
                            str3 = str11;
                            progressBar = progressBar2;
                            textView2 = textView9;
                            i3 = i10;
                            str7.equals("overall");
                            str4 = qhVar4.c;
                            break;
                        case -1077756671:
                            textView = textView6;
                            str = str9;
                            str2 = str10;
                            str3 = str11;
                            progressBar = progressBar2;
                            textView2 = textView9;
                            i3 = i10;
                            if (str7.equals(str8)) {
                                yh yhVar = qhVar4.x;
                                if (yhVar != null && (xhVar = (xh) yhVar.k) != null) {
                                    x0 = x0(u0(xhVar, true), xhVar.g, xhVar.h);
                                    str4 = x0;
                                    break;
                                }
                                str4 = null;
                                break;
                            }
                            str4 = qhVar4.c;
                            break;
                        case 98728:
                            textView = textView6;
                            str2 = str10;
                            str3 = str11;
                            progressBar = progressBar2;
                            textView2 = textView9;
                            i3 = i10;
                            if (str7.equals(str9)) {
                                yh yhVar2 = qhVar4.x;
                                if (yhVar2 != null && (thVar = (th) yhVar2.g) != null) {
                                    ArrayList arrayList6 = new ArrayList(2);
                                    String str14 = thVar.c;
                                    if (str14 == null || str14.isEmpty()) {
                                        str = str9;
                                        i4 = 0;
                                    } else {
                                        String[] split = str14.split(",");
                                        int length = split.length;
                                        int i17 = 0;
                                        i4 = 0;
                                        while (i17 < length) {
                                            String trim = split[i17].trim();
                                            String str15 = str9;
                                            int i18 = 0;
                                            while (i18 < trim.length() && Character.isDigit(trim.charAt(i18))) {
                                                i18++;
                                            }
                                            if (i18 != 0) {
                                                try {
                                                    i4 += Integer.parseInt(trim.substring(0, i18));
                                                } catch (NumberFormatException unused) {
                                                }
                                            }
                                            i17++;
                                            str9 = str15;
                                        }
                                        str = str9;
                                    }
                                    if (i4 > 0) {
                                        arrayList6.add(z().getQuantityString(R.plurals.benchmark_device_details_spec_cores, i4, Integer.valueOf(i4)));
                                    }
                                    String str16 = thVar.d;
                                    if (str16 == null || str16.isEmpty()) {
                                        i5 = 0;
                                    } else {
                                        int i19 = 0;
                                        i5 = 0;
                                        while (i19 < str16.length()) {
                                            if (Character.isDigit(str16.charAt(i19))) {
                                                int i20 = i19;
                                                while (i20 < str16.length() && Character.isDigit(str16.charAt(i20))) {
                                                    i20++;
                                                }
                                                try {
                                                    parseInt = Integer.parseInt(str16.substring(i19, i20));
                                                    i6 = i20;
                                                    while (i6 < str16.length() && Character.isWhitespace(str16.charAt(i6))) {
                                                        i6++;
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                                if (3 + i6 <= str16.length()) {
                                                    str5 = str16;
                                                    if (str5.regionMatches(true, i6, RIhTGWkqQvGL.DGpPEDexAcPQc, 0, 3) && parseInt > i5) {
                                                        i5 = parseInt;
                                                    }
                                                    i19 = i20;
                                                    str16 = str5;
                                                }
                                                str5 = str16;
                                                i19 = i20;
                                                str16 = str5;
                                            } else {
                                                i19++;
                                            }
                                        }
                                    }
                                    String B = i5 <= 0 ? null : i5 >= 1000 ? B(R.string.benchmark_device_details_spec_ghz_fmt, String.format(Locale.getDefault(), "%.2f", Double.valueOf(i5 / 1000.0d))) : B(R.string.benchmark_device_details_spec_mhz_fmt, Integer.valueOf(i5));
                                    if (B != null) {
                                        arrayList6.add(B);
                                    }
                                    x0 = arrayList6.isEmpty() ? null : y0(arrayList6);
                                    str4 = x0;
                                    break;
                                } else {
                                    str = str9;
                                    str4 = null;
                                    break;
                                }
                            }
                            str = str9;
                            str4 = qhVar4.c;
                            break;
                        case 102572:
                            str3 = str11;
                            if (!str7.equals(str10)) {
                                textView = textView6;
                                str2 = str10;
                                progressBar = progressBar2;
                                textView2 = textView9;
                                i3 = i10;
                                str = str9;
                                str4 = qhVar4.c;
                                break;
                            } else {
                                yh yhVar3 = qhVar4.x;
                                if (yhVar3 != null && (vhVar = (vh) yhVar3.h) != null) {
                                    ArrayList arrayList7 = new ArrayList(2);
                                    String str17 = vhVar.b;
                                    str2 = str10;
                                    i3 = i10;
                                    textView2 = textView9;
                                    progressBar = progressBar2;
                                    if (str17 == null || str17.isEmpty()) {
                                        textView = textView6;
                                        String str18 = vhVar.f1086a;
                                        if (str18 != null && !str18.isEmpty()) {
                                            arrayList7.add(vhVar.f1086a.replace("(TM)", "").replace("™", "").replace("®", "").replaceAll("\\s+", " ").trim());
                                        }
                                    } else {
                                        textView = textView6;
                                        arrayList7.add(vhVar.b.replace("(TM)", "").replace("™", "").replace("®", "").replaceAll("\\s+", " ").trim());
                                    }
                                    String str19 = vhVar.c;
                                    if (str19 != null && !str19.isEmpty()) {
                                        arrayList7.add(vhVar.c);
                                    }
                                    if (!arrayList7.isEmpty()) {
                                        str4 = y0(arrayList7);
                                        str = str9;
                                        break;
                                    }
                                } else {
                                    textView = textView6;
                                    str2 = str10;
                                    progressBar = progressBar2;
                                    textView2 = textView9;
                                    i3 = i10;
                                }
                                str4 = null;
                                str = str9;
                            }
                            break;
                        case 3083677:
                            if (str7.equals(str11)) {
                                yh yhVar4 = qhVar4.x;
                                if (yhVar4 == null || (xhVar2 = (xh) yhVar4.k) == null) {
                                    str3 = str11;
                                    str4 = null;
                                } else {
                                    str3 = str11;
                                    str4 = x0(u0(xhVar2, false), xhVar2.i, xhVar2.j);
                                }
                                textView = textView6;
                                str = str9;
                                str2 = str10;
                                progressBar = progressBar2;
                                textView2 = textView9;
                                i3 = i10;
                                break;
                            } else {
                                str3 = str11;
                                textView = textView6;
                                str = str9;
                                str2 = str10;
                                progressBar = progressBar2;
                                textView2 = textView9;
                                i3 = i10;
                                str4 = qhVar4.c;
                                break;
                            }
                            break;
                        default:
                            textView = textView6;
                            str = str9;
                            str2 = str10;
                            str3 = str11;
                            progressBar = progressBar2;
                            textView2 = textView9;
                            i3 = i10;
                            str4 = qhVar4.c;
                            break;
                    }
                    if (str4 == null || str4.isEmpty()) {
                        str4 = (!"__mine__".equals(qhVar4.f842a) || (str6 = qhVar4.c) == null || str6.isEmpty()) ? null : qhVar4.c;
                    }
                    TextView textView10 = textView;
                    textView10.setText(str4 != null ? str4 : "");
                    textView10.setVisibility((str4 == null || str4.isEmpty()) ? 8 : 0);
                    ProgressBar progressBar3 = progressBar;
                    progressBar3.setProgress((int) Math.round(Math.max(1.0d, Math.min(100.0d, (d3 * 100.0d) / d))));
                    progressBar3.setProgressTintList(ColorStateList.valueOf(i3));
                    TextView textView11 = textView2;
                    textView11.setText(NumberFormat.getInstance(Locale.getDefault()).format(Math.round(d3)));
                    int i21 = i3;
                    textView11.setTextColor(i21);
                    if (equals) {
                        context2 = context4;
                        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(new int[]{R.attr.colorPrimary});
                        try {
                            int color = obtainStyledAttributes.getColor(0, -11760651);
                            obtainStyledAttributes.recycle();
                            w0(textView7, context2).setColor(color);
                            textView7.setText(A(R.string.benchmark_rankings_leaderboard_you).toUpperCase(Locale.getDefault()));
                            textView7.setVisibility(0);
                            i7 = 8;
                        } finally {
                        }
                    } else {
                        context2 = context4;
                        i7 = 8;
                        textView7.setVisibility(8);
                    }
                    if (z6) {
                        w0(textView8, context2).setColor(i21);
                        textView8.setText(A(R.string.benchmark_compare_leader));
                        z = false;
                        textView8.setVisibility(0);
                    } else {
                        z = false;
                        textView8.setVisibility(i7);
                    }
                    if (equals) {
                        view = inflate2;
                        view.setOnClickListener(null);
                        view.setClickable(z);
                        z2 = true;
                    } else {
                        view = inflate2;
                        z2 = true;
                        view.setClickable(true);
                        view.setOnClickListener(new uc(this, 2, qhVar4));
                    }
                    linearLayout = linearLayout2;
                    linearLayout.addView(view);
                    i15 = i16 + 1;
                    i10 = i21;
                    context4 = context2;
                    z4 = z2;
                    layoutInflater3 = layoutInflater4;
                    arrayList2 = arrayList5;
                    str11 = str3;
                    str10 = str2;
                    str9 = str;
                    z3 = false;
                }
                layoutInflater = layoutInflater3;
                context = context4;
                c = 2;
                this.h0.addView(inflate);
                Context context5 = context;
                i9 = i11 + 1;
                i0 = context5;
                layoutInflater2 = layoutInflater;
                arrayList = arrayList4;
                r6 = 0;
            }
            textView4.setVisibility(i2);
            linearLayout.setVisibility(8);
            this.h0.addView(inflate);
            Context context52 = context;
            i9 = i11 + 1;
            i0 = context52;
            layoutInflater2 = layoutInflater;
            arrayList = arrayList4;
            r6 = 0;
        }
        this.i0.setVisibility(8);
        this.j0.setVisibility(8);
        this.f0.setVisibility(0);
    }

    public final void D0() {
        if (G()) {
            this.f0.setVisibility(8);
            this.i0.setVisibility(8);
            this.j0.setVisibility(0);
        }
    }

    public final void E0() {
        qg qgVar;
        String[] stringArray = h0().getStringArray(BIxeFreLLop.oumqGPbcxIE);
        String[] stringArray2 = h0().getStringArray("familyHints");
        String[] stringArray3 = h0().getStringArray("socHints");
        if (stringArray == null || stringArray.length < 2 || stringArray.length > 10) {
            D0();
            return;
        }
        int length = stringArray.length;
        String[] strArr = new String[length];
        if (stringArray2 != null) {
            for (int i = 0; i < length && i < stringArray2.length; i++) {
                strArr[i] = stringArray2[i];
            }
        }
        int length2 = stringArray.length;
        String[] strArr2 = new String[length2];
        if (stringArray3 != null) {
            for (int i2 = 0; i2 < length2 && i2 < stringArray3.length; i2++) {
                strArr2[i2] = stringArray3[i2];
            }
        }
        this.k0 = new qh[stringArray.length];
        this.l0 = stringArray.length;
        this.m0 = false;
        this.f0.setVisibility(8);
        this.j0.setVisibility(8);
        this.i0.setVisibility(0);
        int i3 = 0;
        while (i3 < stringArray.length) {
            if ("__mine__".equals(stringArray[i3])) {
                qgVar = this;
                fh.u(this.i0()).F(Integer.MAX_VALUE).e(this.D(), new mf(qgVar, strArr[i3], strArr2[i3], i3, 1));
            } else {
                qgVar = this;
                String str = stringArray[i3];
                String str2 = strArr[i3];
                String str3 = strArr2[i3];
                qgVar.d0.x(str, new og(i3, qgVar, strArr, strArr2));
            }
            i3++;
            this = qgVar;
        }
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_bench_compare, viewGroup, false);
    }

    @Override // defpackage.ld0
    public final void Q() {
        if (t() instanceof BenchmarkSuiteActivity) {
            ((BenchmarkSuiteActivity) t()).K(null);
        }
        this.K = true;
    }

    @Override // defpackage.ld0
    public final void c0(View view, Bundle bundle) {
        this.f0 = (NestedScrollView) view.findViewById(R.id.bench_compare_scroll);
        this.g0 = (TextView) view.findViewById(R.id.bench_compare_header);
        this.h0 = (LinearLayout) view.findViewById(R.id.bench_compare_cards);
        this.i0 = (ProgressBar) view.findViewById(R.id.bench_compare_progress);
        this.j0 = view.findViewById(R.id.bench_compare_error_group);
        view.findViewById(R.id.bench_compare_retry).setOnClickListener(new tc(1, this));
        String[] stringArray = h0().getStringArray("familyKeys");
        this.g0.setText(B(R.string.benchmark_compare_screen_title, Integer.valueOf(stringArray == null ? 0 : stringArray.length)));
        if (g0() instanceof BenchmarkSuiteActivity) {
            ((BenchmarkSuiteActivity) g0()).K(A(R.string.benchmark_compare_action_compare));
        }
        E0();
    }

    public final void v0(int i, qh qhVar, String str, String str2) {
        if (!G() || this.k0 == null) {
            return;
        }
        String str3 = qhVar.b;
        if ((str3 == null || str3.isEmpty()) && str != null && !str.isEmpty()) {
            qhVar.b = str;
        }
        String str4 = qhVar.c;
        if ((str4 == null || str4.isEmpty()) && str2 != null && !str2.isEmpty()) {
            qhVar.c = str2;
        }
        this.k0[i] = qhVar;
        int i2 = this.l0 - 1;
        this.l0 = i2;
        if (i2 == 0) {
            B0();
        }
    }

    public final String x0(TreeSet treeSet, int i, int i2) {
        if (!treeSet.isEmpty()) {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
            StringBuilder sb = new StringBuilder();
            Iterator it = treeSet.iterator();
            boolean z = true;
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!z) {
                    sb.append(" / ");
                }
                sb.append(B(R.string.benchmark_device_details_spec_gb_fmt, numberFormat.format(intValue)));
                z = false;
            }
            return sb.toString();
        }
        if (i <= 0 && i2 <= 0) {
            return null;
        }
        NumberFormat numberFormat2 = NumberFormat.getInstance(Locale.getDefault());
        if (i <= 0 || i2 <= 0 || i == i2) {
            if (i2 > 0) {
                i = i2;
            }
            return B(R.string.benchmark_device_details_spec_gb_fmt, numberFormat2.format(i));
        }
        return B(R.string.benchmark_device_details_spec_gb_fmt, numberFormat2.format(i)) + " / " + B(R.string.benchmark_device_details_spec_gb_fmt, numberFormat2.format(i2));
    }
}
