package flar2.devcheck.benchmarkSuite.ui;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import defpackage.a5;
import defpackage.ae0;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.d51;
import defpackage.f72;
import defpackage.gr;
import defpackage.jj;
import defpackage.ki;
import defpackage.l72;
import defpackage.ld0;
import defpackage.n72;
import defpackage.nc;
import defpackage.p62;
import defpackage.pr;
import defpackage.py0;
import defpackage.qy0;
import defpackage.rt0;
import defpackage.si;
import defpackage.sl;
import defpackage.ti;
import defpackage.ui;
import defpackage.vc;
import defpackage.vg;
import defpackage.vq;
import defpackage.y62;
import defpackage.yb;
import defpackage.ym0;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class BenchmarkSuiteActivity extends a5 {
    public static final /* synthetic */ int M = 0;
    public jj F;
    public AppBarLayout G;
    public CollapsingToolbarLayout H;
    public BottomNavigationView I;
    public int J = R.id.action_benchmarks;
    public int K = 0;
    public final HashMap L = new HashMap();

    public static boolean D(int i) {
        return i == 4 || i == 5 || i == 6;
    }

    public static boolean E(int i) {
        return i == 2 || i == 3;
    }

    public final void B(int i) {
        int A = d51.A(i);
        String str = bPnJ.ljfqXmOoTSkmc;
        if (A == 1 || A == 2) {
            F("bench.results");
            H(new si(), str);
        } else if (A != 3 && A != 4 && A != 5) {
            ym0.o(this);
        } else {
            F(str);
            H(new ki(), "bench.results");
        }
    }

    public final ld0 C() {
        Deque deque = (Deque) this.L.get(Integer.valueOf(this.J));
        if (deque == null || deque.isEmpty()) {
            return null;
        }
        return (ld0) deque.peek();
    }

    public final void F(String str) {
        ld0 ld0Var;
        Deque deque = (Deque) this.L.get(Integer.valueOf(this.J));
        if (deque == null || deque.isEmpty() || (ld0Var = (ld0) deque.peek()) == null || !str.equals(ld0Var.E)) {
            return;
        }
        ld0 ld0Var2 = (ld0) deque.pop();
        ae0 s = s();
        s.getClass();
        yb ybVar = new yb(s);
        ybVar.r = true;
        ybVar.j(ld0Var2);
        ld0 ld0Var3 = (ld0) deque.peek();
        if (ld0Var3 != null) {
            ybVar.m(ld0Var3);
        }
        ybVar.e(true);
    }

    public final boolean G() {
        Deque deque = (Deque) this.L.get(Integer.valueOf(this.J));
        if (deque == null || deque.size() <= 1) {
            return false;
        }
        ld0 ld0Var = (ld0) deque.pop();
        ae0 s = s();
        s.getClass();
        yb ybVar = new yb(s);
        ybVar.r = true;
        ybVar.j(ld0Var);
        ld0 ld0Var2 = (ld0) deque.peek();
        if (ld0Var2 != null) {
            ybVar.m(ld0Var2);
        }
        ybVar.e(true);
        return true;
    }

    public final void H(ld0 ld0Var, String str) {
        int i = this.J;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.L;
        Deque deque = (Deque) hashMap.get(valueOf);
        if (deque == null) {
            deque = new ArrayDeque();
            hashMap.put(Integer.valueOf(i), deque);
        }
        ae0 s = s();
        s.getClass();
        yb ybVar = new yb(s);
        ybVar.r = true;
        ld0 ld0Var2 = (ld0) deque.peek();
        if (ld0Var2 != null) {
            ybVar.i(ld0Var2);
        }
        ybVar.g(R.id.bs_nav_host, ld0Var, str, 1);
        ybVar.e(true);
        deque.push(ld0Var);
    }

    public final void I(int i, ld0 ld0Var, String str) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.L;
        Deque deque = (Deque) hashMap.get(valueOf);
        if (deque == null) {
            deque = new ArrayDeque();
            hashMap.put(Integer.valueOf(i), deque);
        }
        ae0 s = s();
        s.getClass();
        yb ybVar = new yb(s);
        ybVar.r = true;
        ybVar.g(R.id.bs_nav_host, ld0Var, str, 1);
        ybVar.e(true);
        deque.push(ld0Var);
    }

    public final void J() {
        BottomNavigationView bottomNavigationView;
        int height;
        View findViewById = findViewById(R.id.bs_nav_host);
        if (findViewById == null || (bottomNavigationView = this.I) == null || (height = bottomNavigationView.getHeight()) <= 0) {
            return;
        }
        findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), height);
    }

    public final void K(String str) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.H;
        if (str == null) {
            str = L(this.J);
        }
        collapsingToolbarLayout.setTitle(str);
    }

    public final String L(int i) {
        return i == R.id.action_history ? getString(R.string.history) : i == R.id.action_rankings ? getString(R.string.rankings) : getString(R.string.benchmarks);
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ld0 C;
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        p().i(10);
        setContentView(R.layout.activity_benchmark_suite);
        this.G = (AppBarLayout) findViewById(R.id.bs_appbar);
        A((MaterialToolbar) findViewById(R.id.bs_toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        this.H = collapsingToolbarLayout;
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        this.H.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        final int i2 = 0;
        pr.U(getWindow(), false);
        View findViewById = findViewById(R.id.root);
        if (findViewById != null) {
            View findViewById2 = findViewById(R.id.bs_bottom_nav);
            vg vgVar = new vg(this, findViewById2, findViewById2 != null ? findViewById2.getPaddingBottom() : 0, findViewById(R.id.bs_nav_host));
            WeakHashMap weakHashMap = y62.f1215a;
            p62.c(findViewById, vgVar);
            if (findViewById.isAttachedToWindow()) {
                findViewById.requestApplyInsets();
            } else {
                findViewById.addOnAttachStateChangeListener(new f72(0));
            }
        }
        n72 l = l();
        l72 g = g();
        py0 h = h();
        l.getClass();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(jj.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.F = (jj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bs_bottom_nav);
        this.I = bottomNavigationView;
        bottomNavigationView.setOnItemSelectedListener(new ti(this));
        this.I.setOnItemReselectedListener(new ti(this));
        k().a(this, new vc(3, this));
        this.I.addOnLayoutChangeListener(new ui(i2, this));
        this.I.post(new Runnable(this) { // from class: vi
            public final /* synthetic */ BenchmarkSuiteActivity h;

            {
                this.h = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                BenchmarkSuiteActivity benchmarkSuiteActivity = this.h;
                switch (i3) {
                    case 0:
                        int i4 = BenchmarkSuiteActivity.M;
                        benchmarkSuiteActivity.J();
                        break;
                    default:
                        int i5 = BenchmarkSuiteActivity.M;
                        benchmarkSuiteActivity.I(R.id.action_benchmarks, new kh(), "bench.home");
                        pi piVar = (pi) ((qy0) benchmarkSuiteActivity.F.c.c).d();
                        int i6 = piVar == null ? 1 : piVar.f790a;
                        if (BenchmarkSuiteActivity.E(i6)) {
                            benchmarkSuiteActivity.F("bench.results");
                            benchmarkSuiteActivity.H(new si(), "bench.running");
                        } else if (BenchmarkSuiteActivity.D(i6)) {
                            benchmarkSuiteActivity.F("bench.running");
                            benchmarkSuiteActivity.H(new ki(), "bench.results");
                        }
                        benchmarkSuiteActivity.K = i6;
                        break;
                }
            }
        });
        if (bundle == null) {
            this.J = R.id.action_benchmarks;
            this.H.setTitle(getString(R.string.benchmarks));
            this.K = 1;
            findViewById(R.id.bs_nav_host).post(new Runnable(this) { // from class: vi
                public final /* synthetic */ BenchmarkSuiteActivity h;

                {
                    this.h = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i;
                    BenchmarkSuiteActivity benchmarkSuiteActivity = this.h;
                    switch (i3) {
                        case 0:
                            int i4 = BenchmarkSuiteActivity.M;
                            benchmarkSuiteActivity.J();
                            break;
                        default:
                            int i5 = BenchmarkSuiteActivity.M;
                            benchmarkSuiteActivity.I(R.id.action_benchmarks, new kh(), "bench.home");
                            pi piVar = (pi) ((qy0) benchmarkSuiteActivity.F.c.c).d();
                            int i6 = piVar == null ? 1 : piVar.f790a;
                            if (BenchmarkSuiteActivity.E(i6)) {
                                benchmarkSuiteActivity.F("bench.results");
                                benchmarkSuiteActivity.H(new si(), "bench.running");
                            } else if (BenchmarkSuiteActivity.D(i6)) {
                                benchmarkSuiteActivity.F("bench.running");
                                benchmarkSuiteActivity.H(new ki(), "bench.results");
                            }
                            benchmarkSuiteActivity.K = i6;
                            break;
                    }
                }
            });
        } else {
            this.J = bundle.getInt("bench.tabId", R.id.action_benchmarks);
            String string = bundle.getString("bench.lastPhase");
            if (string != null) {
                try {
                    this.K = d51.C(string);
                } catch (IllegalArgumentException unused) {
                }
            }
            int[] intArray = bundle.getIntArray("bench.openedTabs");
            if (intArray != null) {
                ae0 s = s();
                for (int i3 : intArray) {
                    String[] stringArray = bundle.getStringArray(tEegR.gDqVLhNJOkaKe + i3);
                    if (stringArray != null) {
                        ArrayDeque arrayDeque = new ArrayDeque();
                        for (String str : stringArray) {
                            if (str != null && !str.isEmpty() && (C = s.C(str)) != null) {
                                arrayDeque.push(C);
                            }
                        }
                        if (!arrayDeque.isEmpty()) {
                            this.L.put(Integer.valueOf(i3), arrayDeque);
                        }
                    }
                }
            }
            this.H.setTitle(L(this.J));
            int selectedItemId = this.I.getSelectedItemId();
            int i4 = this.J;
            if (selectedItemId != i4) {
                this.I.setSelectedItemId(i4);
            }
        }
        ((qy0) this.F.c.c).e(this, new nc(7, this));
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onDestroy() {
        getWindow().clearFlags(rt0.s);
        super.onDestroy();
    }

    @Override // defpackage.zt, defpackage.yt, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        String str;
        super.onSaveInstanceState(bundle);
        bundle.putInt(Gvyagftz.qfE, this.J);
        int i = this.K;
        if (i != 0) {
            switch (i) {
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    str = "IDLE";
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    str = "RUNNING";
                    break;
                case 3:
                    str = "COOLDOWN";
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    str = "DONE";
                    break;
                case 5:
                    str = "CANCELLED";
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    str = "ERROR";
                    break;
                default:
                    throw null;
            }
            bundle.putString("bench.lastPhase", str);
        }
        HashMap hashMap = this.L;
        int[] iArr = new int[hashMap.size()];
        int i2 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int i3 = i2 + 1;
            iArr[i2] = intValue;
            Deque deque = (Deque) entry.getValue();
            String[] strArr = new String[deque.size()];
            Iterator descendingIterator = deque.descendingIterator();
            int i4 = 0;
            while (descendingIterator.hasNext()) {
                String str2 = ((ld0) descendingIterator.next()).E;
                int i5 = i4 + 1;
                if (str2 == null) {
                    str2 = "";
                }
                strArr[i4] = str2;
                i4 = i5;
            }
            bundle.putStringArray(d51.q("bench.stack.", intValue), strArr);
            i2 = i3;
        }
        bundle.putIntArray("bench.openedTabs", iArr);
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onStop() {
        getWindow().clearFlags(rt0.s);
        super.onStop();
    }

    @Override // defpackage.a5
    public final boolean z() {
        k().b();
        return true;
    }
}
