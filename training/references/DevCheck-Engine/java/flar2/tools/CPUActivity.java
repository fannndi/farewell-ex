package flar2.devcheck.tools;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.d01;
import defpackage.gr;
import defpackage.i51;
import defpackage.ig1;
import defpackage.j3;
import defpackage.l01;
import defpackage.l72;
import defpackage.mm;
import defpackage.n3;
import defpackage.n72;
import defpackage.nm;
import defpackage.nz0;
import defpackage.om;
import defpackage.op0;
import defpackage.pr;
import defpackage.py0;
import defpackage.qy0;
import defpackage.sl;
import defpackage.tc;
import defpackage.th2;
import defpackage.tl0;
import defpackage.u7;
import defpackage.uz1;
import defpackage.vq;
import defpackage.wa;
import defpackage.wm;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.CPUTimeActivity;
import flar2.devcheck.utils.MyLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public class CPUActivity extends a5 implements nz0, d01 {
    public static final /* synthetic */ int J = 0;
    public RecyclerView F;
    public l01 G;
    public n3 H;
    public wm I;

    public final void B() {
        View inflate = getLayoutInflater().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
        th2 th2Var = new th2(this);
        j3 j3Var = (j3) th2Var.h;
        j3Var.s = inflate;
        j3Var.n = true;
        th2Var.j(getString(R.string.okay), new nm(this, 0));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
        try {
            if (uz1.d(this)) {
                imageView.setImageResource(R.drawable.ic_cpu_light);
            } else {
                imageView.setImageResource(R.drawable.ic_cpu_dark);
            }
        } catch (Exception unused) {
        }
        try {
            ((TextView) inflate.findViewById(R.id.info_title)).setText(yttXLrAeLjN.OlJr);
        } catch (Exception unused2) {
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        new om(this, recyclerView).executeOnExecutor(MainApp.h, new Void[0]);
        n3 n3Var = this.H;
        if (n3Var != null && n3Var.isShowing()) {
            this.H.dismiss();
        }
        n3 a2 = th2Var.a();
        this.H = a2;
        a2.show();
        this.H.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            int i = (getResources().getDisplayMetrics().widthPixels * 90) / 100;
            if (getResources().getConfiguration().orientation == 2 || getResources().getBoolean(R.bool.isTablet)) {
                i = (getResources().getDisplayMetrics().widthPixels * 60) / 100;
            }
            this.H.getWindow().setLayout(i, -2);
        } catch (Exception unused3) {
        }
    }

    public final void C() {
        th2 th2Var = new th2(this);
        String str = "\n" + getString(R.string.report_msg1) + "\n\n" + getString(R.string.report_msg2) + "\n";
        j3 j3Var = (j3) th2Var.h;
        j3Var.g = str;
        j3Var.e = " ";
        if (uz1.d(this)) {
            j3Var.c = R.drawable.ic_about;
        } else {
            j3Var.c = R.drawable.ic_about_light;
        }
        j3Var.n = false;
        th2Var.h(getString(R.string.cancel), null);
        j3Var.l = getString(R.string.preview);
        j3Var.m = null;
        th2Var.j(getString(R.string.submit), new nm(this, 1));
        n3 a2 = th2Var.a();
        this.H = a2;
        try {
            a2.show();
            this.H.f(-3).setOnClickListener(new tc(5, this));
            try {
                ((TextView) this.H.findViewById(R.id.alertTitle)).setTypeface(ig1.b(this, R.font.open_sans_semibold));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            this.H = null;
        }
    }

    @Override // defpackage.nz0
    public final void c() {
        try {
            if (i51.b("pfs").booleanValue()) {
                Toast.makeText(this, getString(R.string.already_submitted), 0).show();
            } else {
                C();
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.d01
    public final void d(String str) {
    }

    @Override // defpackage.d01
    public final void j(String str) {
        try {
            if (!str.equals(getString(R.string.cpu_times)) && !str.equals("CPU Times")) {
                if (str.equals("/proc/cpuinfo")) {
                    B();
                }
            }
            startActivity(new Intent(this, (Class<?>) CPUTimeActivity.class));
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.d01
    public final void n(Intent intent, String str) {
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        if (coordinatorLayout != null && recyclerView != null) {
            op0.a(coordinatorLayout, true, false, true, false, false, false);
            op0.a(recyclerView, false, false, false, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        r.j0(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        collapsingToolbarLayout.setTitle(getString(R.string.cpu_analysis));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        int i = 0;
        pr.U(getWindow(), false);
        findViewById(R.id.placeholder);
        this.F = (RecyclerView) findViewById(R.id.recyclerview);
        getBaseContext();
        this.F.setLayoutManager(new MyLinearLayoutManager(1));
        l01 l01Var = new l01((Context) this, (List) new ArrayList());
        this.G = l01Var;
        l01Var.m = this;
        l01Var.j = this;
        this.F.setAdapter(l01Var);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        l.getClass();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(wm.class);
        String b = a2.b();
        if (b == null) {
            c.m(CDsMEtnUjndKau.OLPXT);
            return;
        }
        wm wmVar = (wm) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.I = wmVar;
        if (wmVar.c == null) {
            wmVar.c = new qy0();
            wmVar.d.execute(new wa(3, wmVar));
        }
        wmVar.c.e(this, new mm(this, i));
        this.I.g.e(this, new u7(2));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        tl0.a("cpu_analysis");
        n3 n3Var = this.H;
        if (n3Var != null) {
            n3Var.dismiss();
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        tl0.b(this, "cpu_analysis");
    }
}
