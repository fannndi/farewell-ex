package defpackage;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import flar2.devcheck.benchmarkSuite.ui.widgets.TrendChartView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.logging.impl.SimpleLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ch extends ld0 {
    public kt d0;
    public jj e0;
    public boolean f0 = false;
    public ArrayList g0 = new ArrayList();
    public String h0 = "overall";
    public MaterialCardView i0;
    public TrendChartView j0;
    public TextView k0;
    public TextView l0;
    public TextView m0;
    public TextView n0;
    public TextView o0;
    public View p0;
    public View q0;
    public View r0;
    public View s0;
    public View t0;

    public static void w0(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setVisibility(z ? 0 : 4);
    }

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        n0(true);
    }

    @Override // defpackage.ld0
    public final void N(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_bench_history, menu);
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_bench_history, viewGroup, false);
    }

    @Override // defpackage.ld0
    public final boolean U(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_leaderboard) {
            ym0.v(g0());
            return true;
        }
        if (itemId != R.id.action_clear_history) {
            return false;
        }
        if (this.e0 == null) {
            return true;
        }
        th2 th2Var = new th2(i0());
        th2Var.k(R.string.benchmark_history_clear_confirm_title);
        th2Var.f(R.string.benchmark_history_clear_confirm_body);
        th2Var.g(android.R.string.cancel, null);
        th2Var.i(R.string.benchmark_history_clear, new qf(2, this));
        th2Var.l();
        return true;
    }

    @Override // defpackage.ld0
    public final void W(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.action_clear_history);
        if (findItem != null) {
            findItem.setVisible(this.f0);
        }
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
        this.e0 = (jj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bench_history_list);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.bench_history_empty);
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.bench_history_empty_cta);
        this.i0 = (MaterialCardView) view.findViewById(R.id.bench_history_trend_card);
        this.j0 = (TrendChartView) view.findViewById(R.id.bench_history_trend);
        this.k0 = (TextView) view.findViewById(R.id.bench_history_trend_latest);
        this.l0 = (TextView) view.findViewById(R.id.bench_history_trend_best);
        this.m0 = (TextView) view.findViewById(R.id.bench_history_trend_median);
        this.n0 = (TextView) view.findViewById(R.id.bench_history_trend_runs);
        this.o0 = (TextView) view.findViewById(R.id.bench_history_trend_range);
        this.p0 = view.findViewById(R.id.bench_history_trend_chip_overall_underline);
        this.q0 = view.findViewById(R.id.bench_history_trend_chip_cpu_underline);
        this.r0 = view.findViewById(R.id.bench_history_trend_chip_memory_underline);
        this.s0 = view.findViewById(R.id.bench_history_trend_chip_disk_underline);
        this.t0 = view.findViewById(R.id.bench_history_trend_chip_gpu_underline);
        final int i = 1;
        view.findViewById(R.id.bench_history_trend_chip_overall).setOnClickListener(new View.OnClickListener(this) { // from class: ah
            public final /* synthetic */ ch h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                ch chVar = this.h;
                switch (i2) {
                    case 0:
                        if (chVar.g0() instanceof BenchmarkSuiteActivity) {
                            BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) chVar.g0();
                            if (benchmarkSuiteActivity.J != R.id.action_benchmarks) {
                                BottomNavigationView bottomNavigationView = benchmarkSuiteActivity.I;
                                if (bottomNavigationView != null) {
                                    bottomNavigationView.setSelectedItemId(R.id.action_benchmarks);
                                    break;
                                }
                            } else {
                                ym0.o(benchmarkSuiteActivity);
                                break;
                            }
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        chVar.v0("overall");
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        chVar.v0("cpu");
                        break;
                    case 3:
                        chVar.v0("memory");
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        chVar.v0("disk");
                        break;
                    default:
                        chVar.v0("gpu");
                        break;
                }
            }
        });
        final int i2 = 2;
        view.findViewById(R.id.bench_history_trend_chip_cpu).setOnClickListener(new View.OnClickListener(this) { // from class: ah
            public final /* synthetic */ ch h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                ch chVar = this.h;
                switch (i22) {
                    case 0:
                        if (chVar.g0() instanceof BenchmarkSuiteActivity) {
                            BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) chVar.g0();
                            if (benchmarkSuiteActivity.J != R.id.action_benchmarks) {
                                BottomNavigationView bottomNavigationView = benchmarkSuiteActivity.I;
                                if (bottomNavigationView != null) {
                                    bottomNavigationView.setSelectedItemId(R.id.action_benchmarks);
                                    break;
                                }
                            } else {
                                ym0.o(benchmarkSuiteActivity);
                                break;
                            }
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        chVar.v0("overall");
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        chVar.v0("cpu");
                        break;
                    case 3:
                        chVar.v0("memory");
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        chVar.v0("disk");
                        break;
                    default:
                        chVar.v0("gpu");
                        break;
                }
            }
        });
        final int i3 = 3;
        view.findViewById(R.id.bench_history_trend_chip_memory).setOnClickListener(new View.OnClickListener(this) { // from class: ah
            public final /* synthetic */ ch h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i3;
                ch chVar = this.h;
                switch (i22) {
                    case 0:
                        if (chVar.g0() instanceof BenchmarkSuiteActivity) {
                            BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) chVar.g0();
                            if (benchmarkSuiteActivity.J != R.id.action_benchmarks) {
                                BottomNavigationView bottomNavigationView = benchmarkSuiteActivity.I;
                                if (bottomNavigationView != null) {
                                    bottomNavigationView.setSelectedItemId(R.id.action_benchmarks);
                                    break;
                                }
                            } else {
                                ym0.o(benchmarkSuiteActivity);
                                break;
                            }
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        chVar.v0("overall");
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        chVar.v0("cpu");
                        break;
                    case 3:
                        chVar.v0("memory");
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        chVar.v0("disk");
                        break;
                    default:
                        chVar.v0("gpu");
                        break;
                }
            }
        });
        final int i4 = 4;
        view.findViewById(R.id.bench_history_trend_chip_disk).setOnClickListener(new View.OnClickListener(this) { // from class: ah
            public final /* synthetic */ ch h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i4;
                ch chVar = this.h;
                switch (i22) {
                    case 0:
                        if (chVar.g0() instanceof BenchmarkSuiteActivity) {
                            BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) chVar.g0();
                            if (benchmarkSuiteActivity.J != R.id.action_benchmarks) {
                                BottomNavigationView bottomNavigationView = benchmarkSuiteActivity.I;
                                if (bottomNavigationView != null) {
                                    bottomNavigationView.setSelectedItemId(R.id.action_benchmarks);
                                    break;
                                }
                            } else {
                                ym0.o(benchmarkSuiteActivity);
                                break;
                            }
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        chVar.v0("overall");
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        chVar.v0("cpu");
                        break;
                    case 3:
                        chVar.v0("memory");
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        chVar.v0("disk");
                        break;
                    default:
                        chVar.v0("gpu");
                        break;
                }
            }
        });
        final int i5 = 5;
        view.findViewById(R.id.bench_history_trend_chip_gpu).setOnClickListener(new View.OnClickListener(this) { // from class: ah
            public final /* synthetic */ ch h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i5;
                ch chVar = this.h;
                switch (i22) {
                    case 0:
                        if (chVar.g0() instanceof BenchmarkSuiteActivity) {
                            BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) chVar.g0();
                            if (benchmarkSuiteActivity.J != R.id.action_benchmarks) {
                                BottomNavigationView bottomNavigationView = benchmarkSuiteActivity.I;
                                if (bottomNavigationView != null) {
                                    bottomNavigationView.setSelectedItemId(R.id.action_benchmarks);
                                    break;
                                }
                            } else {
                                ym0.o(benchmarkSuiteActivity);
                                break;
                            }
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        chVar.v0("overall");
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        chVar.v0("cpu");
                        break;
                    case 3:
                        chVar.v0("memory");
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        chVar.v0("disk");
                        break;
                    default:
                        chVar.v0("gpu");
                        break;
                }
            }
        });
        final int i6 = 0;
        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: ah
            public final /* synthetic */ ch h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i6;
                ch chVar = this.h;
                switch (i22) {
                    case 0:
                        if (chVar.g0() instanceof BenchmarkSuiteActivity) {
                            BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) chVar.g0();
                            if (benchmarkSuiteActivity.J != R.id.action_benchmarks) {
                                BottomNavigationView bottomNavigationView = benchmarkSuiteActivity.I;
                                if (bottomNavigationView != null) {
                                    bottomNavigationView.setSelectedItemId(R.id.action_benchmarks);
                                    break;
                                }
                            } else {
                                ym0.o(benchmarkSuiteActivity);
                                break;
                            }
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        chVar.v0("overall");
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        chVar.v0("cpu");
                        break;
                    case 3:
                        chVar.v0("memory");
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        chVar.v0("disk");
                        break;
                    default:
                        chVar.v0("gpu");
                        break;
                }
            }
        });
        this.d0 = new kt(new p8(5, this), (byte) 0);
        i0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(this.d0);
        this.e0.d().e(D(), new bh(i6, this, linearLayout, recyclerView));
    }

    public final void u0() {
        int g;
        double d;
        double d2;
        if (this.i0 == null || this.j0 == null) {
            return;
        }
        if (this.g0.size() < 2) {
            this.i0.setVisibility(8);
            return;
        }
        int size = this.g0.size();
        double[] dArr = new double[size];
        int i = 0;
        while (true) {
            double d3 = 0.0d;
            if (i >= this.g0.size()) {
                break;
            }
            li liVar = ((oi1) this.g0.get((r5.size() - 1) - i)).f738a;
            String str = this.h0;
            if (liVar != null) {
                if ("overall".equals(str)) {
                    d3 = liVar.e;
                } else {
                    String str2 = liVar.f;
                    if (str2 != null && !str2.isEmpty()) {
                        try {
                            d3 = new JSONObject(str2).optDouble(str, 0.0d);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            dArr[i] = d3;
            i++;
        }
        TrendChartView trendChartView = this.j0;
        if ("overall".equals(this.h0)) {
            TypedArray obtainStyledAttributes = i0().obtainStyledAttributes(new int[]{R.attr.colorPrimary});
            try {
                g = obtainStyledAttributes.getColor(0, -14776091);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            g = ym0.g(i0(), this.h0);
        }
        trendChartView.setAccentColor(g);
        this.j0.setValues(dArr);
        ArrayList arrayList = this.g0;
        if (this.k0 != null && this.l0 != null && this.m0 != null && this.n0 != null && this.o0 != null) {
            int i2 = size - 1;
            while (true) {
                d = Double.NaN;
                if (i2 < 0) {
                    d2 = Double.NaN;
                    break;
                }
                if (Double.isFinite(dArr[i2])) {
                    d2 = dArr[i2];
                    if (d2 > 0.0d) {
                        break;
                    }
                }
                i2--;
            }
            double[] dArr2 = new double[size];
            double d4 = Double.NEGATIVE_INFINITY;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                double d5 = dArr[i4];
                if (Double.isFinite(d5) && d5 > 0.0d) {
                    int i5 = i3 + 1;
                    dArr2[i3] = d5;
                    if (d5 > d4) {
                        i3 = i5;
                        d4 = d5;
                    } else {
                        i3 = i5;
                    }
                }
            }
            if (i3 > 0) {
                double[] copyOf = Arrays.copyOf(dArr2, i3);
                Arrays.sort(copyOf);
                if (i3 % 2 == 0) {
                    int i6 = i3 / 2;
                    d = (copyOf[i6 - 1] + copyOf[i6]) / 2.0d;
                } else {
                    d = copyOf[i3 / 2];
                }
            }
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(Locale.getDefault());
            this.k0.setText(Double.isNaN(d2) ? "—" : integerInstance.format(Math.round(d2)));
            this.l0.setText(i3 == 0 ? "—" : integerInstance.format(Math.round(d4)));
            this.m0.setText(Double.isNaN(d) ? "—" : integerInstance.format(Math.round(d)));
            this.n0.setText(integerInstance.format(arrayList.size()));
            this.o0.setText(DateUtils.formatDateRange(i0(), ((oi1) arrayList.get(arrayList.size() - 1)).f738a.b, ((oi1) arrayList.get(0)).f738a.b, 65552));
        }
        w0(this.p0, "overall".equals(this.h0));
        w0(this.q0, "cpu".equals(this.h0));
        w0(this.r0, "memory".equals(this.h0));
        w0(this.s0, "disk".equals(this.h0));
        w0(this.t0, "gpu".equals(this.h0));
        this.i0.setVisibility(0);
    }

    public final void v0(String str) {
        if (str.equals(this.h0)) {
            return;
        }
        this.h0 = str;
        u0();
    }
}
