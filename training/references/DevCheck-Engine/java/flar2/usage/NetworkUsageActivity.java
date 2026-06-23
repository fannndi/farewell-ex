package flar2.devcheck.usage;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButtonToggleGroup;
import defpackage.a40;
import defpackage.a5;
import defpackage.af1;
import defpackage.b52;
import defpackage.c;
import defpackage.c3;
import defpackage.d52;
import defpackage.g52;
import defpackage.gr;
import defpackage.i52;
import defpackage.j3;
import defpackage.j52;
import defpackage.jy;
import defpackage.l72;
import defpackage.n72;
import defpackage.op0;
import defpackage.p8;
import defpackage.pr;
import defpackage.py0;
import defpackage.sl;
import defpackage.tc;
import defpackage.th2;
import defpackage.v31;
import defpackage.vm0;
import defpackage.vq;
import defpackage.y42;
import flar2.devcheck.R;
import flar2.devcheck.usage.NetworkUsageActivity;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class NetworkUsageActivity extends a5 {
    public static final /* synthetic */ int W = 0;
    public b52 F;
    public j52 G;
    public a40 H;
    public boolean I;
    public View J;
    public ViewGroup K;
    public RecyclerView L;
    public View M;
    public boolean N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public MaterialButtonToggleGroup R;
    public TextView S;
    public ProgressBar T;
    public TextView U;
    public TextView V;

    public final void B(g52 g52Var, y42 y42Var, vm0 vm0Var) {
        long j;
        long j2;
        String format;
        char charAt;
        d52 d52Var = (d52) vm0Var.b;
        long j3 = d52Var.b + d52Var.d + d52Var.f174a + d52Var.c;
        TextView textView = this.O;
        if (g52Var == g52.g) {
            textView.setText(getString(R.string.total));
            this.P.setText(sl.r(this, j3));
            vm0 vm0Var2 = y42Var.b;
            if (vm0Var2 != null) {
                d52 d52Var2 = (d52) vm0Var2.b;
                j = j3;
                j2 = ((d52Var2.b + d52Var2.d) + (d52Var2.f174a + d52Var2.c)) / 7;
            } else {
                j = j3;
                j2 = 0;
            }
            if (j2 <= 0) {
                format = "—";
            } else {
                double d = ((j - j2) * 100.0d) / j2;
                format = String.format(Locale.US, "%s%.0f%% vs 7-day avg", d > 0.0d ? "+" : "", Double.valueOf(d));
            }
            if (!format.isEmpty() && ((charAt = format.charAt(0)) == '+' || charAt == '-')) {
                format = format.substring(1).trim();
            }
            long j4 = j - j2;
            TextView textView2 = this.Q;
            String str = format != null ? format : "";
            String str2 = j4 > 0 ? "↑ " : j4 < 0 ? "↓ " : "  ";
            SpannableString spannableString = new SpannableString(str2.concat(str));
            spannableString.setSpan(new RelativeSizeSpan(1.3f), 0, str2.length(), 33);
            textView2.setText(spannableString);
        } else {
            textView.setText(getString(R.string.daily_average));
            long j5 = g52Var == g52.i ? 30L : 7L;
            this.P.setText(sl.r(this, j3 / j5) + "/day");
            String str3 = getString(R.string.total) + ": " + sl.r(this, j3);
            TextView textView3 = this.Q;
            SpannableString spannableString2 = new SpannableString(str3.concat("\u200b"));
            spannableString2.setSpan(new RelativeSizeSpan(1.3f), str3.length(), str3.length() + 1, 33);
            textView3.setText(spannableString2);
        }
        long j6 = d52Var.f174a + d52Var.b;
        long j7 = d52Var.c + d52Var.d + j6;
        int round = j7 > 0 ? (int) Math.round((j6 * 100.0d) / j7) : 0;
        this.S.setText("Wi-Fi " + round + "% • Mobile " + (100 - round) + "%");
        this.T.setProgress(round);
        this.U.setText("↓ " + sl.r(this, d52Var.f174a + d52Var.c) + "   ↑ " + sl.r(this, d52Var.b + d52Var.d));
        this.V.setText("Wi-Fi ↓ " + sl.r(this, d52Var.f174a) + " ↑ " + sl.r(this, d52Var.b) + "   •   Mobile ↓ " + sl.r(this, d52Var.c) + " ↑ " + sl.r(this, d52Var.d));
    }

    public final void C() {
        if (!this.I && pr.z(this)) {
            this.I = true;
            a40 a40Var = this.H;
            if (a40Var != null) {
                a40Var.c();
            }
            j52 j52Var = this.G;
            j52Var.c.execute(new i52(j52Var, 0));
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_network_usage);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord_layout);
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.nestedscrollview);
        if (coordinatorLayout != null && nestedScrollView != null) {
            op0.a(coordinatorLayout, true, false, true, false, false, false);
            op0.a(nestedScrollView, false, false, false, true, false, false);
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.toolbar);
        A(materialToolbar);
        final int i = 1;
        if (r() != null) {
            r().j0(true);
        }
        materialToolbar.setNavigationOnClickListener(new tc(21, this));
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        final int i2 = 0;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
            collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
            collapsingToolbarLayout.setTitle(getString(R.string.network_usage));
            getWindow().setStatusBarColor(getColor(android.R.color.transparent));
            pr.U(getWindow(), false);
        }
        this.L = (RecyclerView) findViewById(R.id.recycler);
        this.M = findViewById(R.id.empty);
        this.K = (ViewGroup) findViewById(R.id.header_container);
        this.J = findViewById(R.id.loading);
        View inflate = LayoutInflater.from(this).inflate(R.layout.usage_header_network, this.K, false);
        this.K.addView(inflate);
        this.O = (TextView) inflate.findViewById(R.id.title);
        this.P = (TextView) inflate.findViewById(R.id.big_value);
        this.Q = (TextView) inflate.findViewById(R.id.delta);
        this.R = (MaterialButtonToggleGroup) inflate.findViewById(R.id.range_toggle);
        this.S = (TextView) inflate.findViewById(R.id.split);
        this.T = (ProgressBar) inflate.findViewById(R.id.wifi_bar);
        this.U = (TextView) inflate.findViewById(R.id.directions);
        this.V = (TextView) inflate.findViewById(R.id.sub_directions);
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        this.M.setVisibility(8);
        this.N = false;
        View view = this.J;
        if (view != null) {
            view.setVisibility(0);
        }
        this.L.setLayoutManager(new LinearLayoutManager(1));
        b52 b52Var = new b52(1);
        this.F = b52Var;
        this.L.setAdapter(b52Var);
        this.F.h = new p8(28, this);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        l.getClass();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(j52.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        j52 j52Var = (j52) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.G = j52Var;
        j52Var.f(g52.g);
        this.R.l(R.id.today, true);
        MaterialButtonToggleGroup materialButtonToggleGroup = this.R;
        materialButtonToggleGroup.s.add(new jy(i, this));
        this.G.e.e(this, new v31(this) { // from class: s21
            public final /* synthetic */ NetworkUsageActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                g52 g52Var;
                vm0 a3;
                int i3 = i2;
                NetworkUsageActivity networkUsageActivity = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        View view2 = networkUsageActivity.J;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        if (list != null && !list.isEmpty()) {
                            networkUsageActivity.M.setVisibility(8);
                            networkUsageActivity.L.setVisibility(0);
                            networkUsageActivity.K.setVisibility(networkUsageActivity.N ? 0 : 8);
                            networkUsageActivity.F.v(list);
                            break;
                        } else {
                            networkUsageActivity.K.setVisibility(8);
                            networkUsageActivity.L.setVisibility(8);
                            networkUsageActivity.M.setVisibility(0);
                            networkUsageActivity.F.v(list);
                            break;
                        }
                    default:
                        y42 y42Var = (y42) obj;
                        int i4 = NetworkUsageActivity.W;
                        if (y42Var != null && y42Var.f1211a != null && (a3 = y42Var.a((g52Var = networkUsageActivity.G.i))) != null) {
                            networkUsageActivity.B(g52Var, y42Var, a3);
                            networkUsageActivity.N = true;
                            if (networkUsageActivity.L.getVisibility() == 0) {
                                networkUsageActivity.K.setVisibility(0);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.G.g.e(this, new v31(this) { // from class: s21
            public final /* synthetic */ NetworkUsageActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                g52 g52Var;
                vm0 a3;
                int i3 = i;
                NetworkUsageActivity networkUsageActivity = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        View view2 = networkUsageActivity.J;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        if (list != null && !list.isEmpty()) {
                            networkUsageActivity.M.setVisibility(8);
                            networkUsageActivity.L.setVisibility(0);
                            networkUsageActivity.K.setVisibility(networkUsageActivity.N ? 0 : 8);
                            networkUsageActivity.F.v(list);
                            break;
                        } else {
                            networkUsageActivity.K.setVisibility(8);
                            networkUsageActivity.L.setVisibility(8);
                            networkUsageActivity.M.setVisibility(0);
                            networkUsageActivity.F.v(list);
                            break;
                        }
                    default:
                        y42 y42Var = (y42) obj;
                        int i4 = NetworkUsageActivity.W;
                        if (y42Var != null && y42Var.f1211a != null && (a3 = y42Var.a((g52Var = networkUsageActivity.G.i))) != null) {
                            networkUsageActivity.B(g52Var, y42Var, a3);
                            networkUsageActivity.N = true;
                            if (networkUsageActivity.L.getVisibility() == 0) {
                                networkUsageActivity.K.setVisibility(0);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        if (pr.z(this)) {
            C();
            return;
        }
        th2 th2Var = new th2(this);
        th2Var.k(R.string.usage_permission_title);
        th2Var.f(R.string.usage_permission_msg);
        ((j3) th2Var.h).n = false;
        th2Var.g(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: t21
            public final /* synthetic */ NetworkUsageActivity h;

            {
                this.h = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i2;
                NetworkUsageActivity networkUsageActivity = this.h;
                switch (i4) {
                    case 0:
                        int i5 = NetworkUsageActivity.W;
                        networkUsageActivity.finish();
                        break;
                    default:
                        int i6 = NetworkUsageActivity.W;
                        Intent addFlags = new Intent("android.settings.USAGE_ACCESS_SETTINGS", Uri.parse("package:" + networkUsageActivity.getPackageName())).addFlags(1082130432);
                        Intent addFlags2 = new Intent("android.settings.USAGE_ACCESS_SETTINGS").addFlags(1082130432);
                        try {
                            try {
                                networkUsageActivity.startActivity(addFlags);
                            } catch (Throwable unused) {
                                networkUsageActivity.startActivity(addFlags2);
                            }
                            Intent intent = new Intent(networkUsageActivity, networkUsageActivity.getClass());
                            intent.addFlags(604110848);
                            PendingIntent activity = PendingIntent.getActivity(networkUsageActivity, 0, intent, 67108864);
                            if (networkUsageActivity.H == null) {
                                networkUsageActivity.H = new a40(networkUsageActivity, activity);
                            }
                            a40 a40Var = networkUsageActivity.H;
                            AppOpsManager appOpsManager = (AppOpsManager) a40Var.c;
                            if (appOpsManager != null && !a40Var.f7a) {
                                appOpsManager.startWatchingMode("android:get_usage_stats", ((Context) a40Var.b).getPackageName(), (e52) a40Var.g);
                                a40Var.f7a = true;
                                break;
                            }
                        } catch (Throwable unused2) {
                            networkUsageActivity.finish();
                        }
                        break;
                }
            }
        });
        th2Var.i(R.string.settings, new DialogInterface.OnClickListener(this) { // from class: t21
            public final /* synthetic */ NetworkUsageActivity h;

            {
                this.h = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i;
                NetworkUsageActivity networkUsageActivity = this.h;
                switch (i4) {
                    case 0:
                        int i5 = NetworkUsageActivity.W;
                        networkUsageActivity.finish();
                        break;
                    default:
                        int i6 = NetworkUsageActivity.W;
                        Intent addFlags = new Intent("android.settings.USAGE_ACCESS_SETTINGS", Uri.parse("package:" + networkUsageActivity.getPackageName())).addFlags(1082130432);
                        Intent addFlags2 = new Intent("android.settings.USAGE_ACCESS_SETTINGS").addFlags(1082130432);
                        try {
                            try {
                                networkUsageActivity.startActivity(addFlags);
                            } catch (Throwable unused) {
                                networkUsageActivity.startActivity(addFlags2);
                            }
                            Intent intent = new Intent(networkUsageActivity, networkUsageActivity.getClass());
                            intent.addFlags(604110848);
                            PendingIntent activity = PendingIntent.getActivity(networkUsageActivity, 0, intent, 67108864);
                            if (networkUsageActivity.H == null) {
                                networkUsageActivity.H = new a40(networkUsageActivity, activity);
                            }
                            a40 a40Var = networkUsageActivity.H;
                            AppOpsManager appOpsManager = (AppOpsManager) a40Var.c;
                            if (appOpsManager != null && !a40Var.f7a) {
                                appOpsManager.startWatchingMode("android:get_usage_stats", ((Context) a40Var.b).getPackageName(), (e52) a40Var.g);
                                a40Var.f7a = true;
                                break;
                            }
                        } catch (Throwable unused2) {
                            networkUsageActivity.finish();
                        }
                        break;
                }
            }
        });
        th2Var.l();
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onDestroy() {
        a40 a40Var = this.H;
        if (a40Var != null) {
            a40Var.c();
        }
        super.onDestroy();
    }

    @Override // defpackage.zt, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (pr.z(this)) {
            C();
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (pr.z(this)) {
            C();
        }
    }
}
