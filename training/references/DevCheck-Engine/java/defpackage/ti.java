package defpackage;

import android.view.MenuItem;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import java.util.Deque;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class ti implements c11, b11 {
    public final /* synthetic */ BenchmarkSuiteActivity g;

    public /* synthetic */ ti(BenchmarkSuiteActivity benchmarkSuiteActivity) {
        this.g = benchmarkSuiteActivity;
    }

    @Override // defpackage.c11
    public boolean c(MenuItem menuItem) {
        int i = BenchmarkSuiteActivity.M;
        int itemId = menuItem.getItemId();
        BenchmarkSuiteActivity benchmarkSuiteActivity = this.g;
        if (itemId != benchmarkSuiteActivity.J) {
            int itemId2 = menuItem.getItemId();
            HashMap hashMap = benchmarkSuiteActivity.L;
            int i2 = benchmarkSuiteActivity.J;
            if (itemId2 != i2) {
                benchmarkSuiteActivity.J = itemId2;
                benchmarkSuiteActivity.H.setTitle(benchmarkSuiteActivity.L(itemId2));
                ae0 s = benchmarkSuiteActivity.s();
                Deque deque = (Deque) hashMap.get(Integer.valueOf(i2));
                ld0 ld0Var = null;
                ld0 ld0Var2 = (deque == null || deque.isEmpty()) ? null : (ld0) deque.peek();
                Deque deque2 = (Deque) hashMap.get(Integer.valueOf(itemId2));
                if (deque2 != null && !deque2.isEmpty()) {
                    ld0Var = (ld0) deque2.peek();
                }
                if (ld0Var != null) {
                    s.getClass();
                    yb ybVar = new yb(s);
                    ybVar.r = true;
                    if (ld0Var2 != null) {
                        ybVar.i(ld0Var2);
                    }
                    ybVar.m(ld0Var);
                    ybVar.e(true);
                } else {
                    if (ld0Var2 != null) {
                        s.getClass();
                        yb ybVar2 = new yb(s);
                        ybVar2.r = true;
                        ybVar2.i(ld0Var2);
                        ybVar2.e(true);
                    }
                    if (itemId2 == R.id.action_benchmarks) {
                        benchmarkSuiteActivity.I(R.id.action_benchmarks, new kh(), "bench.home");
                    } else if (itemId2 == R.id.action_history) {
                        benchmarkSuiteActivity.I(R.id.action_history, new ch(), "bench.history");
                    } else if (itemId2 == R.id.action_rankings) {
                        benchmarkSuiteActivity.I(R.id.action_rankings, new ci(), "bench.rankings");
                    }
                }
                s.y(true);
                s.D();
                if (itemId2 == R.id.action_benchmarks) {
                    pi piVar = (pi) ((qy0) benchmarkSuiteActivity.F.c.c).d();
                    int i3 = piVar == null ? 1 : piVar.f790a;
                    ld0 C = benchmarkSuiteActivity.C();
                    if (C != null) {
                        String str = C.E;
                        boolean equals = "bench.home".equals(str);
                        String str2 = ILBLnlCHDVqsSN.ogRJIiNjre;
                        if ((equals || str2.equals(str) || "bench.results".equals(str)) && ((i3 != 1 || !"bench.home".equals(str)) && ((!BenchmarkSuiteActivity.E(i3) || !str2.equals(str)) && (!BenchmarkSuiteActivity.D(i3) || !"bench.results".equals(str))))) {
                            benchmarkSuiteActivity.B(i3);
                        }
                    }
                    benchmarkSuiteActivity.K = i3;
                }
            }
        }
        return true;
    }
}
