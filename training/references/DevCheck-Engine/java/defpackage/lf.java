package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import flar2.devcheck.BatteryMonitor.BatteryActivity;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/* loaded from: classes.dex */
public class lf extends ld0 implements f01, e01, d01 {
    public RecyclerView d0;
    public l01 e0;
    public fg f0;
    public SwipeRefreshLayout g0;
    public boolean h0 = false;

    @Override // defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        n0(true);
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.tab_fragment2, viewGroup, false);
        this.d0 = (RecyclerView) inflate.findViewById(R.id.fragment_recyclerview);
        i0();
        int i = 1;
        this.d0.setLayoutManager(new LinearLayoutManager(1));
        l01 l01Var = new l01(i0(), (List) new ArrayList());
        this.e0 = l01Var;
        l01Var.p = this;
        l01Var.n = this;
        l01Var.j = this;
        this.d0.setAdapter(l01Var);
        int i2 = (z().getBoolean(R.bool.isTablet) || z().getBoolean(R.bool.isTablet10)) ? 320 : (z().getBoolean(R.bool.isNexus6) && z().getBoolean(R.bool.isLandscape)) ? 420 : z().getBoolean(R.bool.isLandscape) ? 350 : z().getBoolean(R.bool.isNexus6) ? 530 : 450;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        this.g0 = swipeRefreshLayout;
        swipeRefreshLayout.g(i2);
        this.g0.setOnRefreshListener(new p8(i, this));
        this.g0.setRefreshing(true);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(fg.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        fg fgVar = (fg) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.f0 = fgVar;
        if (fgVar.c == null) {
            fgVar.c = new qy0();
            fgVar.d.execute(new l2(9, fgVar));
        }
        fgVar.c.e(D(), new nc(2, this));
        return inflate;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        tl0.a("battery");
        Timer timer = this.f0.n;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
        tl0.b(t(), "battery");
        fg fgVar = this.f0;
        fgVar.getClass();
        Timer timer = new Timer();
        fgVar.n = timer;
        timer.schedule(new af(1, fgVar), 0L, 1000L);
    }

    @Override // defpackage.d01
    public final void d(String str) {
        if (str.equals(A(R.string.more_info)) || str.equals("More info")) {
            try {
                th2 th2Var = new th2(g0());
                th2Var.k(R.string.battery_stats_prompt_title);
                th2Var.f(R.string.battery_stats_prompt_msg);
                th2Var.g(android.R.string.cancel, null);
                th2Var.i(R.string.grant, new kf());
                th2Var.l();
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.f01
    public final void i(String str) {
        if (str.equals(A(R.string.status))) {
            uz1.r0(i0());
            return;
        }
        Intent intent = new Intent(i0(), (Class<?>) BatteryActivity.class);
        intent.putExtra("dynamic", i51.b("prefDC"));
        intent.putExtra("systheme", i51.b("prefSysTheme"));
        intent.putExtra("darktheme", i51.b("prefDarkTheme"));
        intent.putExtra("color", i51.c(6, "prefColor"));
        intent.putExtra("language", i51.e("prefLanguage"));
        try {
            s0(intent);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.d01
    public final void j(String str) {
    }

    @Override // defpackage.e01
    public final void m(am1 am1Var) {
        if (am1Var == null) {
            Intent intent = new Intent(i0(), (Class<?>) BatteryActivity.class);
            intent.putExtra("dynamic", i51.b("prefDC"));
            intent.putExtra("systheme", i51.b("prefSysTheme"));
            intent.putExtra("darktheme", i51.b("prefDarkTheme"));
            intent.putExtra("color", i51.c(6, "prefColor"));
            intent.putExtra("language", i51.e("prefLanguage"));
            try {
                s0(intent);
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.d01
    public final void n(Intent intent, String str) {
    }
}
