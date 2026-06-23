package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;
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
import com.google.android.material.button.MaterialButton;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class kh extends ld0 {
    public jj d0;
    public kt e0;
    public ic1 g0;
    public LinearLayout h0;
    public RecyclerView i0;
    public TextView j0;
    public TextView k0;
    public LinearLayout l0;
    public LinearLayout m0;
    public TextView n0;
    public TextView o0;
    public TextView p0;
    public TextView q0;
    public TextView r0;
    public TextView s0;
    public TextView t0;
    public TextView u0;
    public TextView v0;
    public MaterialButton w0;
    public ColorStateList x0;
    public w5 y0;
    public gh z0;
    public List f0 = Collections.EMPTY_LIST;
    public final Handler A0 = new Handler(Looper.getMainLooper());
    public int B0 = 0;

    public static String u0(double d) {
        return (d <= 0.0d || Double.isNaN(d)) ? "—" : NumberFormat.getIntegerInstance(Locale.getDefault()).format(Math.round(d));
    }

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        n0(true);
    }

    @Override // defpackage.ld0
    public final void N(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_bench_leaderboard, menu);
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_bench_home, viewGroup, false);
    }

    @Override // defpackage.ld0
    public final void Q() {
        this.B0++;
        this.A0.removeCallbacksAndMessages(null);
        this.K = true;
    }

    @Override // defpackage.ld0
    public final boolean U(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_leaderboard) {
            return false;
        }
        ym0.v(g0());
        return true;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        Context v = v();
        w5 w5Var = this.y0;
        if (w5Var != null && v != null) {
            try {
                v.unregisterReceiver(w5Var);
            } catch (IllegalArgumentException unused) {
            }
            this.y0 = null;
        }
        if (Build.VERSION.SDK_INT < 29 || this.z0 == null || v == null) {
            return;
        }
        PowerManager powerManager = (PowerManager) v.getSystemService("power");
        if (powerManager != null) {
            try {
                powerManager.removeThermalStatusListener(this.z0);
            } catch (Throwable unused2) {
            }
        }
        this.z0 = null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [gh] */
    @Override // defpackage.ld0
    public final void Y() {
        PowerManager powerManager;
        this.K = true;
        Context i0 = i0();
        if (this.y0 == null) {
            this.y0 = new w5(4, this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            w5 w5Var = this.y0;
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                ax.e(i0, w5Var, intentFilter);
            } else if (i >= 26) {
                i0.registerReceiver(w5Var, intentFilter, pr.I(i0), null);
            } else {
                i0.registerReceiver(w5Var, intentFilter, pr.I(i0), null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29 && this.z0 == null && (powerManager = (PowerManager) i0.getSystemService("power")) != null) {
            ?? r1 = new PowerManager$OnThermalStatusChangedListener() { // from class: gh
                public final void onThermalStatusChanged(int i2) {
                    kh.this.w0();
                }
            };
            this.z0 = r1;
            try {
                powerManager.addThermalStatusListener(r1);
            } catch (Throwable unused) {
                this.z0 = null;
            }
        }
        w0();
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
        this.j0 = (TextView) view.findViewById(R.id.bench_home_device_name);
        this.k0 = (TextView) view.findViewById(R.id.bench_home_device_chip);
        this.l0 = (LinearLayout) view.findViewById(R.id.bench_home_score_group);
        this.m0 = (LinearLayout) view.findViewById(R.id.bench_home_empty_group);
        this.n0 = (TextView) view.findViewById(R.id.bench_home_score_label);
        this.o0 = (TextView) view.findViewById(R.id.bench_home_latest_score);
        this.p0 = (TextView) view.findViewById(R.id.bench_home_cat_cpu);
        this.q0 = (TextView) view.findViewById(R.id.bench_home_cat_memory);
        this.r0 = (TextView) view.findViewById(R.id.bench_home_cat_disk);
        this.s0 = (TextView) view.findViewById(R.id.bench_home_cat_gpu);
        this.t0 = (TextView) view.findViewById(R.id.bench_home_latest_timestamp);
        this.w0 = (MaterialButton) view.findViewById(R.id.bench_home_run);
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.bench_home_stress);
        this.u0 = (TextView) view.findViewById(R.id.bench_home_ready_title);
        this.v0 = (TextView) view.findViewById(R.id.bench_home_ready_detail);
        this.x0 = this.u0.getTextColors();
        this.h0 = (LinearLayout) view.findViewById(R.id.bench_home_history_header);
        this.i0 = (RecyclerView) view.findViewById(R.id.bench_home_history_list);
        final int i = 1;
        this.j0.setText(uz1.A(true));
        this.k0.setText(i51.e("prefProcessor"));
        final int i2 = 0;
        this.w0.setOnClickListener(new View.OnClickListener(this) { // from class: ih
            public final /* synthetic */ kh h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                kh khVar = this.h;
                switch (i3) {
                    case 0:
                        khVar.d0.g();
                        break;
                    default:
                        ((BenchmarkSuiteActivity) khVar.g0()).H(new xr1(), "bench.stress");
                        break;
                }
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: ih
            public final /* synthetic */ kh h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                kh khVar = this.h;
                switch (i3) {
                    case 0:
                        khVar.d0.g();
                        break;
                    default:
                        ((BenchmarkSuiteActivity) khVar.g0()).H(new xr1(), "bench.stress");
                        break;
                }
            }
        });
        this.e0 = new kt(new p8(6, this), (byte) 0);
        RecyclerView recyclerView = this.i0;
        i0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.i0.setAdapter(this.e0);
        this.d0.f.b(null);
        this.d0.d().e(D(), new v31(this) { // from class: jh
            public final /* synthetic */ kh b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i3 = i2;
                kh khVar = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        if (list == null) {
                            list = Collections.EMPTY_LIST;
                        }
                        khVar.f0 = list;
                        khVar.v0();
                        break;
                    default:
                        khVar.g0 = (ic1) obj;
                        khVar.v0();
                        break;
                }
            }
        });
        this.d0.f.c.e(D(), new v31(this) { // from class: jh
            public final /* synthetic */ kh b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i3 = i;
                kh khVar = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        if (list == null) {
                            list = Collections.EMPTY_LIST;
                        }
                        khVar.f0 = list;
                        khVar.v0();
                        break;
                    default:
                        khVar.g0 = (ic1) obj;
                        khVar.v0();
                        break;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0197  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0() {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh.v0():void");
    }

    public final void w0() {
        Context v;
        if (this.u0 == null || this.v0 == null || this.w0 == null || (v = v()) == null || !G()) {
            return;
        }
        int i = this.B0 + 1;
        this.B0 = i;
        MainApp.h.execute(new hh(this, v.getApplicationContext(), i, 0));
    }
}
