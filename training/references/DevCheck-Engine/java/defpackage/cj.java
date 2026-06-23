package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.Chip;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cj extends ld0 {
    public static final String[] H0 = {"rank", "score_asc", "family_az", "soc_az"};
    public static final int[] I0 = {R.string.benchmark_rankings_top_sort_rank, R.string.benchmark_rankings_top_sort_score_asc, R.string.benchmark_rankings_top_sort_family_az, R.string.benchmark_rankings_top_sort_soc_az};
    public static final String[] J0 = {"samsung", "google", "oneplus", "xiaomi", "motorola", "asus", CDsMEtnUjndKau.HLaPtURYRKdFuF, "nothing", "oppo", "vivo", "realme", "huawei"};
    public static final int[] K0 = {R.string.benchmark_rankings_top_mfr_samsung, R.string.benchmark_rankings_top_mfr_google, R.string.benchmark_rankings_top_mfr_oneplus, R.string.benchmark_rankings_top_mfr_xiaomi, R.string.benchmark_rankings_top_mfr_motorola, R.string.benchmark_rankings_top_mfr_asus, R.string.benchmark_rankings_top_mfr_sony, R.string.benchmark_rankings_top_mfr_nothing, R.string.benchmark_rankings_top_mfr_oppo, R.string.benchmark_rankings_top_mfr_vivo, R.string.benchmark_rankings_top_mfr_realme, R.string.benchmark_rankings_top_mfr_huawei};
    public static final String[] L0 = {"qualcomm", "mediatek", "samsung", "google", "hisilicon", "unisoc"};
    public static final int[] M0 = {R.string.benchmark_rankings_top_soc_qualcomm, R.string.benchmark_rankings_top_soc_mediatek, R.string.benchmark_rankings_top_soc_samsung, R.string.benchmark_rankings_top_soc_google, R.string.benchmark_rankings_top_soc_hisilicon, R.string.benchmark_rankings_top_soc_unisoc};
    public static final String[] N0 = {"flagship", "mid", "entry", "unclassified"};
    public static final int[] O0 = {R.string.benchmark_rankings_top_tier_flagship, R.string.benchmark_rankings_top_tier_mid, R.string.benchmark_rankings_top_tier_entry, R.string.benchmark_rankings_top_tier_unclassified};
    public static final String[] P0 = {"4", "6", "8", "12", "16"};
    public static final int[] Q0 = {R.string.benchmark_rankings_top_ram_4, R.string.benchmark_rankings_top_ram_6, R.string.benchmark_rankings_top_ram_8, R.string.benchmark_rankings_top_ram_12, R.string.benchmark_rankings_top_ram_16};
    public Chip A0;
    public ar0 B0;
    public LinearLayoutManager C0;
    public j2 D0;
    public MenuItem E0;
    public boolean F0;
    public final gm2 G0;
    public n02 e0;
    public k02 f0;
    public ProgressBar g0;
    public ProgressBar h0;
    public TextView i0;
    public SwipeRefreshLayout j0;
    public View k0;
    public gc1 l0;
    public GradientDrawable n0;
    public EditText p0;
    public ImageButton q0;
    public ImageButton r0;
    public ImageButton s0;
    public bj t0;
    public final l2 v0;
    public Chip w0;
    public Chip x0;
    public Chip y0;
    public Chip z0;
    public final Handler d0 = new Handler(Looper.getMainLooper());
    public List m0 = Collections.EMPTY_LIST;
    public boolean o0 = true;
    public String u0 = "";

    public cj() {
        int i = 15;
        this.v0 = new l2(i, this);
        this.G0 = new gm2(i, this);
    }

    public static String A0(String str, String str2) {
        return (str == null || str.isEmpty()) ? str2 : str;
    }

    public final void B0() {
        View view = this.k0;
        if (view == null || this.l0 == null || !this.o0 || view.getVisibility() != 0) {
            return;
        }
        w0(this.l0);
    }

    public final void C0(String str) {
        boolean isEmpty = str.isEmpty();
        ImageButton imageButton = this.q0;
        if (imageButton != null) {
            imageButton.setImageResource(!isEmpty ? R.drawable.ic_arrow_back_24 : R.drawable.ic_search_24);
        }
        ImageButton imageButton2 = this.r0;
        if (imageButton2 != null) {
            imageButton2.setVisibility(!isEmpty ? 0 : 8);
        }
    }

    public final String D0(String str, String[] strArr, int[] iArr, int i) {
        if (str != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2].equals(str)) {
                    return A(iArr[i2]);
                }
            }
        }
        return A(i);
    }

    public final void E0(Chip chip, int[] iArr, final String[] strArr, String str, final boolean z, final yi yiVar) {
        int i;
        PopupMenu popupMenu = new PopupMenu(new cx(i0(), R.style.BenchFilterPopupOverlay), chip);
        int i2 = 0;
        if (z) {
            popupMenu.getMenu().add(0, 0, 0, R.string.benchmark_rankings_top_clear);
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 0;
        while (i3 < iArr.length) {
            popupMenu.getMenu().add(0, i, 0, iArr[i3]);
            i3++;
            i++;
        }
        if (str != null) {
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                }
                if (strArr[i2].equals(str)) {
                    MenuItem item = popupMenu.getMenu().getItem(i2 + (z ? 1 : 0));
                    item.setCheckable(true);
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
        }
        final int i4 = z ? 1 : 0;
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: zi
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                boolean z2 = z;
                yi yiVar2 = yiVar;
                if (z2 && itemId == 0) {
                    yiVar2.a(null);
                    return true;
                }
                yiVar2.a(strArr[itemId - i4]);
                return true;
            }
        });
        popupMenu.show();
    }

    public final boolean F0() {
        int c;
        j2 n = g0().p().n(this.G0);
        this.D0 = n;
        if (n == null) {
            return false;
        }
        k02 k02Var = this.f0;
        if (k02Var != null && (c = k02Var.c()) != 0) {
            k02Var.f983a.d(0, c, null);
        }
        B0();
        return true;
    }

    public final void G0() {
        boolean z = !this.o0;
        this.o0 = z;
        i51.h("bench_top_devices_sticky_user_row", z);
        View view = this.M;
        RecyclerView recyclerView = view == null ? null : (RecyclerView) view.findViewById(R.id.bench_top_devices_list);
        LinearLayoutManager linearLayoutManager = this.C0;
        boolean z2 = linearLayoutManager != null && linearLayoutManager.P0() == 0;
        if (recyclerView != null) {
            zd1 itemAnimator = recyclerView.getItemAnimator();
            recyclerView.setItemAnimator(null);
            u0();
            recyclerView.post(new b9(3, this, recyclerView, itemAnimator));
        } else {
            u0();
        }
        if (this.o0 || !z2 || recyclerView == null) {
            return;
        }
        recyclerView.post(new l2(14, recyclerView));
    }

    public final void H0(gc1 gc1Var) {
        n02 n02Var = this.e0;
        if (n02Var != null) {
            LinkedHashMap linkedHashMap = n02Var.l;
            String str = gc1Var.d;
            if (str == null || str.isEmpty()) {
                return;
            }
            if (linkedHashMap.containsKey(str)) {
                linkedHashMap.remove(str);
            } else {
                if (linkedHashMap.size() >= 10) {
                    Toast.makeText(i0(), B(R.string.benchmark_compare_limit_toast, 10), 0).show();
                    return;
                }
                linkedHashMap.put(str, gc1Var);
            }
            n02Var.m.k(Collections.unmodifiableSet(new LinkedHashSet(linkedHashMap.keySet())));
        }
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_bench_top_devices, viewGroup, false);
    }

    @Override // defpackage.ld0
    public final void Q() {
        LinearLayoutManager linearLayoutManager = this.C0;
        if (linearLayoutManager != null) {
            this.B0 = (ar0) linearLayoutManager.g0();
            this.C0 = null;
        }
        j2 j2Var = this.D0;
        if (j2Var != null) {
            this.F0 = true;
            j2Var.a();
        }
        x0();
        this.k0 = null;
        this.K = true;
    }

    @Override // defpackage.ld0
    public final void T(boolean z) {
        n02 n02Var;
        if (z) {
            j2 j2Var = this.D0;
            if (j2Var != null) {
                this.F0 = true;
                j2Var.a();
            }
            x0();
            return;
        }
        v0();
        if (this.D0 != null || (n02Var = this.e0) == null || n02Var.l.size() <= 0) {
            return;
        }
        F0();
    }

    @Override // defpackage.ld0
    public final void c0(View view, Bundle bundle) {
        n72 l = l();
        l72 g = g();
        py0 h = h();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(n02.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.e0 = (n02) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.bench_top_devices_list);
        this.g0 = (ProgressBar) view.findViewById(R.id.bench_top_devices_progress);
        this.h0 = (ProgressBar) view.findViewById(R.id.bench_top_devices_initial_progress);
        this.i0 = (TextView) view.findViewById(R.id.bench_top_devices_empty);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.bench_top_devices_swipe);
        this.j0 = swipeRefreshLayout;
        n02 n02Var = this.e0;
        Objects.requireNonNull(n02Var);
        int i = 9;
        swipeRefreshLayout.setOnRefreshListener(new p8(i, n02Var));
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.container);
        if (coordinatorLayout != null) {
            op0.a(coordinatorLayout, false, true, false, false, true, true);
        }
        v0();
        this.w0 = (Chip) view.findViewById(R.id.bench_top_devices_chip_sort);
        this.x0 = (Chip) view.findViewById(R.id.bench_top_devices_chip_manufacturer);
        this.y0 = (Chip) view.findViewById(R.id.bench_top_devices_chip_soc_vendor);
        this.z0 = (Chip) view.findViewById(R.id.bench_top_devices_chip_soc_class);
        this.A0 = (Chip) view.findViewById(R.id.bench_top_devices_chip_ram);
        i0();
        final int i2 = 1;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.C0 = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        if (this.f0 == null) {
            this.f0 = new k02();
        }
        k02 k02Var = this.f0;
        k02Var.e = this;
        k02Var.f = new p8(10, this);
        recyclerView.setAdapter(k02Var);
        this.o0 = ((il1) i51.f()).getBoolean(MiGPiFgcCQCVh.OTBji, true);
        View findViewById = view.findViewById(R.id.bench_top_devices_sticky_row);
        this.k0 = findViewById;
        if (findViewById != null) {
            ((ImageButton) findViewById.findViewById(R.id.bench_rank_row_pin)).setOnClickListener(new wi(this, i));
        }
        ar0 ar0Var = this.B0;
        if (ar0Var != null) {
            this.C0.f0(ar0Var);
            this.B0 = null;
        }
        final int i3 = 0;
        recyclerView.j(new aj(this, this.C0, i3));
        this.w0.setOnClickListener(new wi(this, i2));
        this.x0.setOnClickListener(new wi(this, 2));
        int i4 = 3;
        this.y0.setOnClickListener(new wi(this, i4));
        this.z0.setOnClickListener(new wi(this, 4));
        this.A0.setOnClickListener(new wi(this, 5));
        Chip chip = this.w0;
        chip.setOnCloseIconClickListener(new tc(i4, chip));
        Chip chip2 = this.x0;
        chip2.setOnCloseIconClickListener(new tc(i4, chip2));
        Chip chip3 = this.y0;
        chip3.setOnCloseIconClickListener(new tc(i4, chip3));
        Chip chip4 = this.z0;
        chip4.setOnCloseIconClickListener(new tc(i4, chip4));
        Chip chip5 = this.A0;
        chip5.setOnCloseIconClickListener(new tc(i4, chip5));
        this.e0.e.e(D(), new v31(this) { // from class: xi
            public final /* synthetic */ cj b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
            /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0188  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x01aa  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x018b  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x00e7  */
            @Override // defpackage.v31
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 528
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xi.a(java.lang.Object):void");
            }
        });
        this.e0.m.e(D(), new v31(this) { // from class: xi
            public final /* synthetic */ cj b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                /*
                    Method dump skipped, instructions count: 528
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xi.a(java.lang.Object):void");
            }
        });
        n02 n02Var2 = this.e0;
        if (n02Var2.k) {
            return;
        }
        n02Var2.k = true;
        n02Var2.d();
    }

    public final void u0() {
        gc1 gc1Var = this.l0;
        boolean z = gc1Var != null && this.o0;
        boolean z2 = (gc1Var == null || this.o0) ? false : true;
        k02 k02Var = this.f0;
        double d = gc1Var == null ? 0.0d : gc1Var.g;
        if (d != k02Var.i) {
            double v = k02Var.v();
            k02Var.i = d;
            if (k02Var.v() != v && k02Var.c() > 0) {
                k02Var.f983a.d(0, k02Var.c(), null);
            }
        }
        k02 k02Var2 = this.f0;
        gc1 gc1Var2 = z2 ? gc1Var : null;
        ud1 ud1Var = k02Var2.f983a;
        boolean z3 = k02Var2.g != null;
        boolean z4 = gc1Var2 != null;
        k02Var2.g = gc1Var2;
        if (z3 && z4) {
            k02Var2.g(0);
        } else if (!z3 && z4) {
            ud1Var.e(0, 1);
        } else if (z3) {
            ud1Var.f(0, 1);
        }
        View view = this.k0;
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
        } else {
            w0(gc1Var);
            this.k0.setVisibility(0);
        }
    }

    public final void v0() {
        View view;
        ViewGroup.LayoutParams layoutParams;
        if (this.t0 == null && (view = this.M) != null) {
            int i = 0;
            if (g0() instanceof BenchmarkSuiteActivity) {
                BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) g0();
                AppBarLayout appBarLayout = benchmarkSuiteActivity.G;
                if (appBarLayout != null) {
                    appBarLayout.e(true, false, true);
                }
                AppBarLayout appBarLayout2 = benchmarkSuiteActivity.G;
                if (appBarLayout2 != null && (layoutParams = appBarLayout2.getLayoutParams()) != null && layoutParams.height != 0) {
                    layoutParams.height = 0;
                    benchmarkSuiteActivity.G.setLayoutParams(layoutParams);
                }
                View findViewById = benchmarkSuiteActivity.findViewById(R.id.root);
                if (findViewById != null) {
                    findViewById.requestLayout();
                }
            }
            this.p0 = (EditText) view.findViewById(R.id.bench_top_devices_search_input);
            this.q0 = (ImageButton) view.findViewById(R.id.bench_top_devices_search_nav);
            this.r0 = (ImageButton) view.findViewById(R.id.bench_top_devices_search_clear);
            this.s0 = (ImageButton) view.findViewById(R.id.bench_top_devices_compare_action);
            this.q0.setOnClickListener(new wi(this, i));
            this.r0.setOnClickListener(new wi(this, 6));
            this.s0.setOnClickListener(new wi(this, 7));
            ym0.z(this.s0, A(R.string.benchmark_compare_action_compare));
            String str = this.e0.j.f86a;
            if (str == null) {
                str = "";
            }
            this.p0.setText(str);
            this.p0.setSelection(str.length());
            this.u0 = str;
            C0(str);
            bj bjVar = new bj(i, this);
            this.t0 = bjVar;
            this.p0.addTextChangedListener(bjVar);
        }
    }

    public final void w0(gc1 gc1Var) {
        View view = this.k0;
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        TextView textView = (TextView) this.k0.findViewById(R.id.bench_rank_row_rank);
        ImageView imageView = (ImageView) this.k0.findViewById(R.id.bench_rank_row_check);
        ImageButton imageButton = (ImageButton) this.k0.findViewById(R.id.bench_rank_row_pin);
        TextView textView2 = (TextView) this.k0.findViewById(R.id.bench_rank_row_device);
        TextView textView3 = (TextView) this.k0.findViewById(R.id.bench_rank_row_soc);
        TextView textView4 = (TextView) this.k0.findViewById(R.id.bench_rank_row_you_pill);
        TextView textView5 = (TextView) this.k0.findViewById(R.id.bench_rank_row_score);
        ProgressBar progressBar = (ProgressBar) this.k0.findViewById(R.id.bench_rank_row_bar);
        textView.setVisibility(4);
        boolean z = this.D0 != null;
        n02 n02Var = this.e0;
        boolean z2 = n02Var != null && n02Var.l.containsKey("__mine__");
        int i = 8;
        if (z) {
            imageButton.setVisibility(8);
            imageButton.setOnClickListener(null);
            imageView.setVisibility(0);
            imageView.setImageResource(z2 ? R.drawable.ic_bench_select_on : R.drawable.ic_bench_select_off);
        } else {
            imageView.setVisibility(8);
            imageButton.setImageResource(R.drawable.ic_bench_pin_on);
            imageButton.setVisibility(0);
            imageButton.setOnClickListener(new wi(this, i));
        }
        String str = gc1Var.e;
        double d = gc1Var.g;
        textView2.setText(A0(str, gc1Var.b));
        textView3.setText(A0(gc1Var.f, gc1Var.c));
        textView5.setText(String.format(Locale.getDefault(), "%,.0f", Double.valueOf(d)));
        TypedValue typedValue = new TypedValue();
        int i2 = context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true) ? typedValue.data : -11760651;
        TypedValue typedValue2 = new TypedValue();
        int i3 = context.getTheme().resolveAttribute(R.attr.colorVeryLightNeutral, typedValue2, true) ? typedValue2.data : -2039584;
        Iterator it = this.m0.iterator();
        double d2 = d;
        while (it.hasNext()) {
            double d3 = ((gc1) it.next()).g;
            if (d3 > d2) {
                d2 = d3;
            }
        }
        int round = d2 > 0.0d ? (int) Math.round(Math.max(1.0d, Math.min(100.0d, (d * 100.0d) / d2))) : 100;
        progressBar.setIndeterminate(false);
        progressBar.setMax(100);
        progressBar.setProgressTintList(ColorStateList.valueOf(i2));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(i3));
        progressBar.setVisibility(0);
        progressBar.setProgress(round, false);
        this.k0.setBackgroundColor((16777215 & i2) | 520093696);
        if (this.n0 == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.n0 = gradientDrawable;
            gradientDrawable.setShape(0);
            this.n0.setCornerRadius(context.getResources().getDisplayMetrics().density * 8.0f);
            textView4.setBackground(this.n0);
        }
        this.n0.setColor(i2);
        textView4.setText(context.getString(R.string.benchmark_rankings_leaderboard_you).toUpperCase(Locale.getDefault()));
        textView4.setVisibility(0);
        View view2 = this.k0;
        if (z) {
            view2.setClickable(true);
            this.k0.setLongClickable(false);
            this.k0.setOnClickListener(new uc(this, 4, gc1Var));
            this.k0.setOnLongClickListener(null);
            return;
        }
        view2.setClickable(false);
        this.k0.setLongClickable(false);
        this.k0.setOnClickListener(null);
        this.k0.setOnLongClickListener(null);
    }

    public final void x0() {
        ViewGroup.LayoutParams layoutParams;
        bj bjVar;
        this.d0.removeCallbacks(this.v0);
        EditText editText = this.p0;
        if (editText != null && (bjVar = this.t0) != null) {
            editText.removeTextChangedListener(bjVar);
        }
        this.t0 = null;
        if (t() instanceof BenchmarkSuiteActivity) {
            BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) t();
            AppBarLayout appBarLayout = benchmarkSuiteActivity.G;
            if (appBarLayout != null && (layoutParams = appBarLayout.getLayoutParams()) != null && layoutParams.height != -2) {
                layoutParams.height = -2;
                benchmarkSuiteActivity.G.setLayoutParams(layoutParams);
            }
            AppBarLayout appBarLayout2 = benchmarkSuiteActivity.G;
            if (appBarLayout2 != null) {
                appBarLayout2.e(true, false, true);
            }
        }
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
    }

    public final void y0() {
        InputMethodManager inputMethodManager;
        n02 n02Var = this.e0;
        if (n02Var == null) {
            return;
        }
        if (n02Var.l.size() < 2) {
            Toast.makeText(i0(), R.string.benchmark_compare_need_two_toast, 0).show();
            return;
        }
        n02 n02Var2 = this.e0;
        if (n02Var2 == null || n02Var2.l.size() < 2) {
            Toast.makeText(i0(), R.string.benchmark_compare_need_two_toast, 0).show();
            return;
        }
        n02 n02Var3 = this.e0;
        n02Var3.getClass();
        ArrayList arrayList = new ArrayList(n02Var3.l.values());
        int size = arrayList.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        String[] strArr3 = new String[size];
        for (int i = 0; i < size; i++) {
            gc1 gc1Var = (gc1) arrayList.get(i);
            strArr[i] = gc1Var.d;
            strArr2[i] = A0(gc1Var.e, gc1Var.b);
            strArr3[i] = A0(gc1Var.f, gc1Var.c);
        }
        j2 j2Var = this.D0;
        if (j2Var != null) {
            this.F0 = true;
            j2Var.a();
        }
        View currentFocus = g0().getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) g0().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) g0();
        Bundle bundle = new Bundle();
        bundle.putStringArray("familyKeys", strArr);
        bundle.putStringArray("familyHints", strArr2);
        bundle.putStringArray("socHints", strArr3);
        qg qgVar = new qg();
        qgVar.m0(bundle);
        benchmarkSuiteActivity.H(qgVar, "bench.compare");
    }

    public final void z0(gc1 gc1Var) {
        InputMethodManager inputMethodManager;
        if (this.D0 != null) {
            H0(gc1Var);
            return;
        }
        String str = gc1Var.d;
        if (str == null || str.isEmpty() || "__mine__".equals(str)) {
            return;
        }
        View currentFocus = g0().getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) g0().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        ym0.u(g0(), str, A0(gc1Var.e, gc1Var.b), A0(gc1Var.f, gc1Var.c));
    }
}
