package flar2.devcheck.usage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.button.MaterialButtonToggleGroup;
import defpackage.a40;
import defpackage.a5;
import defpackage.af1;
import defpackage.b52;
import defpackage.c;
import defpackage.c3;
import defpackage.c71;
import defpackage.dv0;
import defpackage.g52;
import defpackage.gr;
import defpackage.i52;
import defpackage.j3;
import defpackage.j52;
import defpackage.l72;
import defpackage.n72;
import defpackage.nc;
import defpackage.op0;
import defpackage.pr;
import defpackage.py0;
import defpackage.sl;
import defpackage.th2;
import defpackage.v31;
import defpackage.vm0;
import defpackage.vq;
import defpackage.y42;
import flar2.devcheck.R;
import flar2.devcheck.usage.ScreentimeActivity;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public class ScreentimeActivity extends a5 {
    public static final /* synthetic */ int O = 0;
    public b52 F;
    public j52 G;
    public a40 H;
    public boolean I;
    public View J;
    public ViewGroup K;
    public RecyclerView L;
    public View M;
    public boolean N;

    public final void B(g52 g52Var, y42 y42Var, vm0 vm0Var, TextView textView, TextView textView2, TextView textView3) {
        long j;
        String str;
        char charAt;
        if (g52Var != g52.g) {
            textView3.setText(getString(R.string.daily_average));
            textView.setText(sl.s(vm0Var.f1091a / 7));
            String str2 = getString(R.string.total) + ": " + sl.s(vm0Var.f1091a);
            SpannableString spannableString = new SpannableString(str2.concat("\u200b"));
            spannableString.setSpan(new RelativeSizeSpan(1.3f), str2.length(), str2.length() + 1, 33);
            textView2.setText(spannableString);
            return;
        }
        vm0 vm0Var2 = y42Var.b;
        long j2 = vm0Var2 != null ? vm0Var2.f1091a / 7 : 0L;
        long j3 = vm0Var.f1091a;
        if (j2 <= 0 || j3 <= 0) {
            j = 0;
            str = "—";
        } else {
            j = 0;
            double d = ((j3 - j2) * 100.0d) / j2;
            str = String.format(Locale.US, "%s%.0f%% vs 7-day avg", d > 0.0d ? "+" : "", Double.valueOf(d));
        }
        if (!str.isEmpty() && ((charAt = str.charAt(0)) == '+' || charAt == '-')) {
            str = str.substring(1).trim();
        }
        long j4 = j2 > 0 ? vm0Var.f1091a - j2 : j;
        String str3 = j4 > j ? "↑ " : j4 < j ? "↓ " : "  ";
        SpannableString spannableString2 = new SpannableString(str3 + str);
        spannableString2.setSpan(new RelativeSizeSpan(1.3f), 0, str3.length(), 33);
        textView2.setText(spannableString2);
        textView.setText(sl.s(vm0Var.f1091a));
        textView3.setText(getString(R.string.total));
    }

    public final void C() {
        if (!this.I && pr.z(this)) {
            int i = 1;
            this.I = true;
            a40 a40Var = this.H;
            if (a40Var != null) {
                a40Var.c();
            }
            j52 j52Var = this.G;
            j52Var.c.execute(new i52(j52Var, i));
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        pr.m(getWindow());
        setContentView(R.layout.activity_screentime);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord_layout);
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.nestedscrollview);
        if (coordinatorLayout != null && nestedScrollView != null) {
            op0.a(coordinatorLayout, true, false, true, false, false, false);
            op0.a(nestedScrollView, false, false, false, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        collapsingToolbarLayout.setTitle(getString(R.string.screentime));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        final int i2 = 0;
        pr.U(getWindow(), false);
        this.L = (RecyclerView) findViewById(R.id.recycler);
        this.M = findViewById(R.id.empty);
        this.K = (ViewGroup) findViewById(R.id.header_container);
        View inflate = LayoutInflater.from(this).inflate(R.layout.usage_header_screen_time, this.K, false);
        this.K.addView(inflate);
        final TextView textView = (TextView) inflate.findViewById(R.id.big_value);
        final TextView textView2 = (TextView) inflate.findViewById(R.id.delta);
        final TextView textView3 = (TextView) inflate.findViewById(R.id.title);
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) inflate.findViewById(R.id.range_toggle);
        this.J = findViewById(R.id.loading);
        this.K.setVisibility(8);
        this.L.setVisibility(8);
        this.M.setVisibility(8);
        this.J.setVisibility(0);
        this.N = false;
        this.L.setLayoutManager(new LinearLayoutManager(1));
        b52 b52Var = new b52(0);
        this.F = b52Var;
        this.L.setAdapter(b52Var);
        this.F.h = new c71(2, this);
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
        this.G = (j52) grVar.t(a2, qJTtDWNCVUDjB.FjShA.concat(b));
        materialButtonToggleGroup.l(R.id.today, true);
        this.G.g(g52.g);
        materialButtonToggleGroup.s.add(new dv0() { // from class: pk1
            @Override // defpackage.dv0
            public final void a(int i3, boolean z) {
                g52 g52Var;
                vm0 a3;
                int i4 = ScreentimeActivity.O;
                if (z) {
                    if (i3 == R.id.today) {
                        g52Var = g52.g;
                    } else if (i3 != R.id.last_seven_days) {
                        return;
                    } else {
                        g52Var = g52.h;
                    }
                    g52 g52Var2 = g52Var;
                    ScreentimeActivity screentimeActivity = ScreentimeActivity.this;
                    screentimeActivity.G.g(g52Var2);
                    y42 y42Var = (y42) screentimeActivity.G.f.d();
                    if (y42Var == null || (a3 = y42Var.a(g52Var2)) == null) {
                        return;
                    }
                    screentimeActivity.B(g52Var2, y42Var, a3, textView, textView2, textView3);
                }
            }
        });
        this.G.d.e(this, new nc(24, this));
        this.G.f.e(this, new v31() { // from class: qk1
            @Override // defpackage.v31
            public final void a(Object obj) {
                ScreentimeActivity screentimeActivity = ScreentimeActivity.this;
                MaterialButtonToggleGroup materialButtonToggleGroup2 = materialButtonToggleGroup;
                TextView textView4 = textView;
                TextView textView5 = textView2;
                TextView textView6 = textView3;
                y42 y42Var = (y42) obj;
                int i3 = ScreentimeActivity.O;
                if (y42Var == null || y42Var.f1211a == null) {
                    return;
                }
                g52 g52Var = screentimeActivity.G.h;
                materialButtonToggleGroup2.l(g52Var == g52.g ? R.id.today : R.id.last_seven_days, true);
                vm0 a3 = y42Var.a(g52Var);
                if (a3 == null) {
                    return;
                }
                screentimeActivity.B(g52Var, y42Var, a3, textView4, textView5, textView6);
                screentimeActivity.N = true;
                if (screentimeActivity.L.getVisibility() == 0) {
                    screentimeActivity.K.setVisibility(0);
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
        th2Var.g(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: rk1
            public final /* synthetic */ ScreentimeActivity h;

            {
                this.h = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.content.DialogInterface r5, int r6) {
                /*
                    r4 = this;
                    int r5 = r2
                    flar2.devcheck.usage.ScreentimeActivity r4 = r4.h
                    switch(r5) {
                        case 0: goto L95;
                        default: goto L7;
                    }
                L7:
                    int r5 = flar2.devcheck.usage.ScreentimeActivity.O
                    android.content.Intent r5 = new android.content.Intent
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    java.lang.String r0 = "package:"
                    r6.<init>(r0)
                    java.lang.String r0 = r4.getPackageName()
                    r6.append(r0)
                    java.lang.String r6 = r6.toString()
                    android.net.Uri r6 = android.net.Uri.parse(r6)
                    java.lang.String r0 = "android.settings.USAGE_ACCESS_SETTINGS"
                    r5.<init>(r0, r6)
                    android.content.Intent r6 = new android.content.Intent
                    r6.<init>(r0)
                    android.content.Intent[] r5 = new android.content.Intent[]{r5, r6}
                    r6 = 0
                    r0 = r6
                L31:
                    r1 = 1
                    r2 = 2
                    if (r0 >= r2) goto L55
                    r2 = r5[r0]
                    r3 = 1082130432(0x40800000, float:4.0)
                    r2.addFlags(r3)
                    r4.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L40
                    goto L55
                L40:
                    r3 = r5[r1]
                    if (r2 != r3) goto L52
                    r5 = 2131953357(0x7f1306cd, float:1.9543183E38)
                    android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
                    r5.show()
                    r4.finish()
                    goto L94
                L52:
                    int r0 = r0 + 1
                    goto L31
                L55:
                    android.content.Intent r5 = new android.content.Intent
                    java.lang.Class r0 = r4.getClass()
                    r5.<init>(r4, r0)
                    r0 = 604110848(0x24020000, float:2.8189256E-17)
                    r5.addFlags(r0)
                    r0 = 67108864(0x4000000, float:1.5046328E-36)
                    android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r4, r6, r5, r0)
                    a40 r6 = r4.H
                    if (r6 != 0) goto L74
                    a40 r6 = new a40
                    r6.<init>(r4, r5)
                    r4.H = r6
                L74:
                    a40 r4 = r4.H
                    java.lang.Object r5 = r4.c
                    android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5
                    if (r5 == 0) goto L94
                    boolean r6 = r4.f7a
                    if (r6 == 0) goto L81
                    goto L94
                L81:
                    java.lang.Object r6 = r4.b
                    android.content.Context r6 = (android.content.Context) r6
                    java.lang.String r6 = r6.getPackageName()
                    java.lang.Object r0 = r4.g
                    e52 r0 = (defpackage.e52) r0
                    java.lang.String r2 = "android:get_usage_stats"
                    r5.startWatchingMode(r2, r6, r0)
                    r4.f7a = r1
                L94:
                    return
                L95:
                    int r5 = flar2.devcheck.usage.ScreentimeActivity.O
                    r4.finish()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.onClick(android.content.DialogInterface, int):void");
            }
        });
        th2Var.i(R.string.settings, new DialogInterface.OnClickListener(this) { // from class: rk1
            public final /* synthetic */ ScreentimeActivity h;

            {
                this.h = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                /*
                    this = this;
                    int r5 = r2
                    flar2.devcheck.usage.ScreentimeActivity r4 = r4.h
                    switch(r5) {
                        case 0: goto L95;
                        default: goto L7;
                    }
                L7:
                    int r5 = flar2.devcheck.usage.ScreentimeActivity.O
                    android.content.Intent r5 = new android.content.Intent
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    java.lang.String r0 = "package:"
                    r6.<init>(r0)
                    java.lang.String r0 = r4.getPackageName()
                    r6.append(r0)
                    java.lang.String r6 = r6.toString()
                    android.net.Uri r6 = android.net.Uri.parse(r6)
                    java.lang.String r0 = "android.settings.USAGE_ACCESS_SETTINGS"
                    r5.<init>(r0, r6)
                    android.content.Intent r6 = new android.content.Intent
                    r6.<init>(r0)
                    android.content.Intent[] r5 = new android.content.Intent[]{r5, r6}
                    r6 = 0
                    r0 = r6
                L31:
                    r1 = 1
                    r2 = 2
                    if (r0 >= r2) goto L55
                    r2 = r5[r0]
                    r3 = 1082130432(0x40800000, float:4.0)
                    r2.addFlags(r3)
                    r4.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L40
                    goto L55
                L40:
                    r3 = r5[r1]
                    if (r2 != r3) goto L52
                    r5 = 2131953357(0x7f1306cd, float:1.9543183E38)
                    android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r1)
                    r5.show()
                    r4.finish()
                    goto L94
                L52:
                    int r0 = r0 + 1
                    goto L31
                L55:
                    android.content.Intent r5 = new android.content.Intent
                    java.lang.Class r0 = r4.getClass()
                    r5.<init>(r4, r0)
                    r0 = 604110848(0x24020000, float:2.8189256E-17)
                    r5.addFlags(r0)
                    r0 = 67108864(0x4000000, float:1.5046328E-36)
                    android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r4, r6, r5, r0)
                    a40 r6 = r4.H
                    if (r6 != 0) goto L74
                    a40 r6 = new a40
                    r6.<init>(r4, r5)
                    r4.H = r6
                L74:
                    a40 r4 = r4.H
                    java.lang.Object r5 = r4.c
                    android.app.AppOpsManager r5 = (android.app.AppOpsManager) r5
                    if (r5 == 0) goto L94
                    boolean r6 = r4.f7a
                    if (r6 == 0) goto L81
                    goto L94
                L81:
                    java.lang.Object r6 = r4.b
                    android.content.Context r6 = (android.content.Context) r6
                    java.lang.String r6 = r6.getPackageName()
                    java.lang.Object r0 = r4.g
                    e52 r0 = (defpackage.e52) r0
                    java.lang.String r2 = "android:get_usage_stats"
                    r5.startWatchingMode(r2, r6, r0)
                    r4.f7a = r1
                L94:
                    return
                L95:
                    int r5 = flar2.devcheck.usage.ScreentimeActivity.O
                    r4.finish()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.onClick(android.content.DialogInterface, int):void");
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
