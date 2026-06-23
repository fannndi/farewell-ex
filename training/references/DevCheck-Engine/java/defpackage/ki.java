package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import flar2.devcheck.benchmarkSuite.ui.widgets.ScoreBarView;
import flar2.devcheck.benchmarkSuite.ui.widgets.ScoreRingView;
import flar2.devcheck.benchmarkSuite.ui.widgets.SparklineView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class ki extends ld0 {
    public jj d0;
    public dn e0;
    public boolean f0 = false;
    public long g0 = -1;
    public n3 h0;
    public ScoreRingView i0;
    public TextView j0;
    public TextView k0;
    public TextView l0;
    public TextView m0;
    public LinearLayout n0;
    public MaterialButton o0;
    public MaterialButton p0;
    public MaterialCardView q0;
    public TextView r0;
    public TextView s0;
    public TextView t0;
    public ji u0;

    public static String u0(r30 r30Var) {
        if (r30Var == null) {
            return "";
        }
        String str = r30Var.g;
        StringBuilder sb = new StringBuilder();
        sb.append(r30Var.b);
        if (str != null) {
            if (sb.length() > 0) {
                sb.append(" · ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        Bundle bundle2 = this.m;
        long j = bundle2 != null ? bundle2.getLong("run_id", -1L) : -1L;
        this.g0 = j;
        n0(j >= 0);
    }

    @Override // defpackage.ld0
    public final void N(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_bench_subtest_detail, menu);
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_bench_results, viewGroup, false);
    }

    @Override // defpackage.ld0
    public final void Q() {
        v0();
        this.K = true;
    }

    @Override // defpackage.ld0
    public final void T(boolean z) {
        ji jiVar = this.u0;
        if (jiVar != null) {
            jiVar.f107a = !z;
            af0 af0Var = jiVar.c;
            if (af0Var != null) {
                af0Var.a();
            }
        }
    }

    @Override // defpackage.ld0
    public final boolean U(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_delete_run) {
            return false;
        }
        if (this.d0 == null || this.g0 < 0) {
            return true;
        }
        v0();
        th2 th2Var = new th2(i0());
        th2Var.k(R.string.benchmark_history_delete_run_confirm_title);
        th2Var.f(R.string.benchmark_history_delete_run_confirm_body);
        th2Var.g(android.R.string.cancel, null);
        th2Var.i(R.string.benchmark_history_delete_run, new qf(3, this));
        this.h0 = th2Var.l();
        return true;
    }

    @Override // defpackage.ld0
    public final void c0(View view, Bundle bundle) {
        a5 g0 = g0();
        n72 l = g0.l();
        l72 g = g0.g();
        gr grVar = new gr(l, g, d51.i(g0, l, g));
        vq a2 = af1.a(jj.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.d0 = (jj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.i0 = (ScoreRingView) view.findViewById(R.id.bench_results_overall_ring);
        this.j0 = (TextView) view.findViewById(R.id.bench_results_caption);
        this.k0 = (TextView) view.findViewById(R.id.bench_results_timestamp);
        this.l0 = (TextView) view.findViewById(R.id.bench_results_status);
        this.m0 = (TextView) view.findViewById(R.id.bench_results_throttled);
        this.n0 = (LinearLayout) view.findViewById(R.id.bench_results_sections);
        this.q0 = (MaterialCardView) view.findViewById(R.id.bench_results_thermal_card);
        this.r0 = (TextView) view.findViewById(R.id.bench_results_thermal_verdict);
        this.s0 = (TextView) view.findViewById(R.id.bench_results_thermal_detail);
        this.t0 = (TextView) view.findViewById(R.id.bench_results_thermal_badge);
        this.i0.setMaxScore(10000.0d);
        this.i0.setCaption(A(R.string.benchmark_suite_overall_label).toUpperCase(Locale.getDefault()));
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.bench_results_rerun);
        this.o0 = (MaterialButton) view.findViewById(R.id.bench_results_share);
        this.p0 = (MaterialButton) view.findViewById(R.id.bench_results_submit);
        final int i = 0;
        final int i2 = 1;
        final boolean z = this.g0 >= 0;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: ei
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean z2 = z;
                ki kiVar = ki.this;
                if (z2) {
                    ((BenchmarkSuiteActivity) kiVar.g0()).G();
                }
                kiVar.d0.f();
                kiVar.d0.g();
            }
        });
        this.o0.setOnClickListener(new View.OnClickListener(this) { // from class: fi
            public final /* synthetic */ ki h;

            {
                this.h = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:74:0x04db  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x04ea  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r36) {
                /*
                    Method dump skipped, instructions count: 1284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fi.onClick(android.view.View):void");
            }
        });
        MaterialButton materialButton2 = this.p0;
        if (z) {
            materialButton2.setVisibility(8);
        } else {
            materialButton2.setOnClickListener(new View.OnClickListener(this) { // from class: fi
                public final /* synthetic */ ki h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    /*
                        Method dump skipped, instructions count: 1284
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.fi.onClick(android.view.View):void");
                }
            });
        }
        if (z) {
            Executors.newSingleThreadExecutor().execute(new hi(this, fh.u(i0()), this.g0));
        } else {
            ((qy0) this.d0.c.c).e(D(), new nc(6, this));
        }
        this.u0 = new ji(this, !H(), z);
        g0().k().a(D(), this.u0);
    }

    public final void v0() {
        n3 n3Var = this.h0;
        if (n3Var != null) {
            try {
                if (n3Var.isShowing()) {
                    this.h0.dismiss();
                }
            } catch (Throwable unused) {
            }
            this.h0 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(pi piVar) {
        dn dnVar;
        int i;
        String A;
        String quantityString;
        String A2;
        int i2;
        String str;
        String str2;
        String str3;
        String format;
        ArrayList arrayList;
        double[] dArr;
        if (piVar == null || (dnVar = piVar.r) == null) {
            return;
        }
        ArrayList arrayList2 = dnVar.g;
        this.e0 = dnVar;
        lk1 M = pr.M(i0(), dnVar);
        boolean z = true;
        this.i0.b(M.f596a, !this.f0);
        this.j0.setText(u0(dnVar.f200a));
        long j = dnVar.c;
        TextView textView = this.k0;
        boolean z2 = false;
        if (j > 0) {
            textView.setText(DateUtils.formatDateTime(i0(), j, 65553));
            this.k0.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        int i3 = piVar.f790a;
        Object[] objArr = i3 == 5 || i3 == 6;
        int A3 = d51.A(i3);
        TextView textView2 = this.l0;
        if (A3 == 4) {
            textView2.setText(A(R.string.benchmark_suite_canceled).toUpperCase(Locale.getDefault()));
            this.l0.setBackgroundResource(R.drawable.bench_pill_warn);
            this.l0.setVisibility(0);
        } else if (A3 != 5) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(A(R.string.benchmark_notif_error).toUpperCase(Locale.getDefault()));
            this.l0.setBackgroundResource(R.drawable.bench_pill_error);
            this.l0.setVisibility(0);
        }
        MaterialButton materialButton = this.o0;
        if (materialButton != null) {
            materialButton.setVisibility(objArr != false ? 8 : 0);
        }
        MaterialButton materialButton2 = this.p0;
        if (materialButton2 != null && objArr != true && this.g0 < 0) {
            materialButton2.setVisibility(0);
        } else if (materialButton2 != null && objArr != false) {
            materialButton2.setVisibility(8);
        }
        TextView textView3 = this.m0;
        int size = arrayList2.size();
        int i4 = 0;
        loop0: while (true) {
            if (i4 >= size) {
                i = 8;
                break;
            }
            Object obj = arrayList2.get(i4);
            i4++;
            List<ps1> list = ((cn) obj).c;
            if (list != null) {
                for (ps1 ps1Var : list) {
                    if (ps1Var != null && ps1Var.j) {
                        i = 0;
                        break loop0;
                    }
                }
            }
        }
        textView3.setVisibility(i);
        int i5 = 2;
        if (arrayList2.isEmpty()) {
            this.q0.setVisibility(8);
        } else {
            int size2 = arrayList2.size();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayList2.get(i8);
                i8++;
                List list2 = ((cn) obj2).c;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        i6++;
                        if (((ps1) it.next()).j) {
                            i7++;
                        }
                    }
                }
            }
            if (i6 == 0) {
                this.q0.setVisibility(8);
            } else {
                if (i7 == 0) {
                    str2 = A(R.string.benchmark_results_thermal_sustained);
                    str = A(R.string.benchmark_results_thermal_sustained_detail);
                    A2 = A(R.string.benchmark_results_thermal_badge_sustained);
                    i2 = R.color.green;
                } else {
                    if (i7 <= 2) {
                        A = A(R.string.benchmark_results_thermal_mild);
                        quantityString = z().getQuantityString(R.plurals.benchmark_results_thermal_throttled_detail, i7, Integer.valueOf(i7));
                        A2 = A(R.string.benchmark_results_thermal_badge_mild);
                        i2 = R.color.yellow;
                    } else {
                        A = A(R.string.benchmark_results_thermal_throttled);
                        quantityString = z().getQuantityString(R.plurals.benchmark_results_thermal_throttled_detail, i7, Integer.valueOf(i7));
                        A2 = A(R.string.benchmark_results_thermal_badge_throttled);
                        i2 = R.color.orange;
                    }
                    String str4 = A;
                    str = quantityString;
                    str2 = str4;
                }
                this.r0.setText(str2);
                this.s0.setText(str);
                this.t0.setText(A2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(z().getDisplayMetrics().density * 10.0f);
                gradientDrawable.setColor(i0().getColor(i2));
                this.t0.setBackground(gradientDrawable);
                this.q0.setVisibility(0);
            }
        }
        this.n0.removeAllViews();
        LayoutInflater from = LayoutInflater.from(i0());
        ArrayList arrayList3 = M.b;
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj3 = arrayList3.get(i9);
            i9++;
            mk1 mk1Var = (mk1) obj3;
            int g = ym0.g(i0(), mk1Var.f638a);
            View inflate = from.inflate(R.layout.item_benchmark_section, this.n0, z2);
            ((TextView) inflate.findViewById(R.id.section_title)).setText(mk1Var.b);
            inflate.findViewById(R.id.section_accent).setBackgroundTintList(ColorStateList.valueOf(g));
            TextView textView4 = (TextView) inflate.findViewById(R.id.section_score);
            double d = mk1Var.c;
            boolean z3 = z;
            boolean z4 = this.f0;
            String str5 = ILBLnlCHDVqsSN.IlPlDMZkmQLaQYS;
            boolean z5 = z2;
            String str6 = "—";
            if (d <= 0.0d) {
                textView4.setText("—");
            } else if (z4) {
                textView4.setText(String.format(Locale.getDefault(), str5, Double.valueOf(d)));
            } else {
                float f = (float) d;
                float[] fArr = new float[i5];
                fArr[z5 ? 1 : 0] = 0.0f;
                fArr[z3 ? 1 : 0] = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.setDuration(900L);
                ofFloat.setInterpolator(new DecelerateInterpolator(1.6f));
                ofFloat.addUpdateListener(new ii(textView4, z5 ? 1 : 0));
                ofFloat.start();
            }
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.section_subtests);
            View findViewById = inflate.findViewById(R.id.section_header);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.section_expand_chevron);
            linearLayout.setVisibility(8);
            imageView.setRotation(180.0f);
            findViewById.setOnClickListener(new uc(linearLayout, 3, imageView));
            ArrayList arrayList4 = mk1Var.d;
            int size4 = arrayList4.size();
            int i10 = 0;
            while (i10 < size4) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                nk1 nk1Var = (nk1) obj4;
                ArrayList arrayList5 = arrayList4;
                boolean z6 = nk1Var.e;
                ArrayList arrayList6 = arrayList3;
                int i11 = size3;
                double d2 = nk1Var.f;
                if (z6) {
                    arrayList4 = arrayList5;
                    arrayList3 = arrayList6;
                    size3 = i11;
                } else {
                    int i12 = i9;
                    View inflate2 = from.inflate(R.layout.item_benchmark_subtest, (ViewGroup) linearLayout, false);
                    LayoutInflater layoutInflater = from;
                    ((TextView) inflate2.findViewById(R.id.subtest_name)).setText(nk1Var.b);
                    ((TextView) inflate2.findViewById(R.id.subtest_value)).setText(nk1Var.a());
                    TextView textView5 = (TextView) inflate2.findViewById(R.id.subtest_throttled);
                    if (nk1Var.g) {
                        textView5.setVisibility(0);
                        textView5.setContentDescription(A(R.string.benchmark_throttled_description));
                    } else {
                        textView5.setVisibility(8);
                    }
                    TextView textView6 = (TextView) inflate2.findViewById(R.id.subtest_score);
                    if (d2 <= 0.0d) {
                        format = str6;
                        str3 = format;
                    } else {
                        str3 = str6;
                        format = String.format(Locale.getDefault(), str5, Double.valueOf(d2));
                    }
                    textView6.setText(format);
                    ScoreBarView scoreBarView = (ScoreBarView) inflate2.findViewById(R.id.subtest_bar);
                    scoreBarView.setAccentColor(g);
                    scoreBarView.b(d2, !this.f0);
                    SparklineView sparklineView = (SparklineView) inflate2.findViewById(R.id.subtest_sparkline);
                    sparklineView.setAccentColor(g);
                    String str7 = mk1Var.f638a;
                    String str8 = nk1Var.f688a;
                    int size5 = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size5) {
                            arrayList = arrayList2;
                            dArr = null;
                            break;
                        }
                        Object obj5 = arrayList2.get(i13);
                        i13++;
                        cn cnVar = (cn) obj5;
                        arrayList = arrayList2;
                        if (str7.equals(cnVar.f130a)) {
                            Iterator it2 = cnVar.c.iterator();
                            while (it2.hasNext()) {
                                ps1 ps1Var2 = (ps1) it2.next();
                                Iterator it3 = it2;
                                if (str8.equals(ps1Var2.f807a)) {
                                    dArr = ps1Var2.e;
                                    break;
                                }
                                it2 = it3;
                            }
                        }
                        arrayList2 = arrayList;
                    }
                    sparklineView.setValues(dArr);
                    linearLayout.addView(inflate2);
                    arrayList4 = arrayList5;
                    arrayList3 = arrayList6;
                    size3 = i11;
                    i9 = i12;
                    from = layoutInflater;
                    arrayList2 = arrayList;
                    str6 = str3;
                }
            }
            this.n0.addView(inflate);
            z = z3 ? 1 : 0;
            from = from;
            i5 = 2;
            z2 = false;
        }
        this.f0 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r3.hasTransport(3) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0() {
        /*
            r5 = this;
            boolean r0 = r5.G()
            if (r0 != 0) goto L7
            goto L65
        L7:
            android.content.Context r0 = r5.v()
            a5 r1 = r5.t()
            if (r0 == 0) goto L65
            if (r1 != 0) goto L14
            goto L65
        L14:
            android.content.Context r0 = r0.getApplicationContext()
            android.content.Context r0 = r0.getApplicationContext()
            r2 = 1
            java.lang.String r3 = "connectivity"
            java.lang.Object r3 = r0.getSystemService(r3)     // Catch: java.lang.Exception -> L58
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch: java.lang.Exception -> L58
            if (r3 != 0) goto L28
            goto L58
        L28:
            android.net.Network r4 = r3.getActiveNetwork()     // Catch: java.lang.Exception -> L58
            android.net.NetworkCapabilities r3 = r3.getNetworkCapabilities(r4)     // Catch: java.lang.Exception -> L58
            if (r3 == 0) goto L58
            boolean r4 = r3.hasTransport(r2)     // Catch: java.lang.Exception -> L58
            if (r4 != 0) goto L46
            r4 = 0
            boolean r4 = r3.hasTransport(r4)     // Catch: java.lang.Exception -> L58
            if (r4 != 0) goto L46
            r4 = 3
            boolean r3 = r3.hasTransport(r4)     // Catch: java.lang.Exception -> L58
            if (r3 == 0) goto L58
        L46:
            fh r2 = defpackage.fh.u(r0)
            k5 r3 = new k5
            r4 = 7
            r3.<init>(r2, r4, r0)
            java.lang.Object r0 = r2.j
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            r0.execute(r3)
            goto L5d
        L58:
            java.lang.String r0 = "bench_needs_upload_check"
            defpackage.i51.h(r0, r2)
        L5d:
            jj r5 = r5.d0
            r5.f()
            defpackage.ym0.o(r1)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki.x0():void");
    }
}
