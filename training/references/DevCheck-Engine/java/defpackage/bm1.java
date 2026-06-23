package defpackage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import flar2.devcheck.R;
import flar2.devcheck.sensors.SensorActivity;
import flar2.devcheck.temperature.TemperatureActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bm1 extends ld0 implements e01 {
    public RecyclerView d0;
    public boolean e0 = false;
    public fm1 f0;
    public SwipeRefreshLayout g0;

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.tab_fragment2, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.fragment_recyclerview);
        this.d0 = recyclerView;
        recyclerView.setAlpha(0.0f);
        i0();
        this.d0.setLayoutManager(new LinearLayoutManager(1));
        this.d0.setHasFixedSize(true);
        l01 l01Var = new l01(i0(), (List) new ArrayList());
        l01Var.n = this;
        this.d0.setAdapter(l01Var);
        int i = (z().getBoolean(R.bool.isTablet) || z().getBoolean(R.bool.isTablet10)) ? 320 : (z().getBoolean(R.bool.isNexus6) && z().getBoolean(R.bool.isLandscape)) ? 420 : z().getBoolean(R.bool.isLandscape) ? 350 : z().getBoolean(R.bool.isNexus6) ? 530 : 450;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.swipe_container);
        this.g0 = swipeRefreshLayout;
        swipeRefreshLayout.g(i);
        int i2 = 3;
        this.g0.setOnRefreshListener(new c71(i2, this));
        this.g0.setRefreshing(true);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(fm1.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        fm1 fm1Var = (fm1) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.f0 = fm1Var;
        if (fm1Var.c == null) {
            fm1Var.c = new qy0();
            fm1Var.d.execute(new r60(25, fm1Var));
        }
        fm1Var.c.e(D(), new rn(this, i2, l01Var));
        return inflate;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
    }

    @Override // defpackage.e01
    public final void m(am1 am1Var) {
        try {
            if (am1Var == null) {
                s0(new Intent(i0(), (Class<?>) TemperatureActivity.class));
                return;
            }
            int i = am1Var.c;
            Intent intent = new Intent(i0(), (Class<?>) SensorActivity.class);
            intent.putExtra("sensorTitle", am1Var.b);
            intent.putExtra("sensorType", i);
            intent.putExtra("sensorTypeString", i);
            intent.putExtra("sensorMfg", am1Var.e);
            intent.putExtra("sensorModel", am1.a(am1Var.j, true));
            s0(intent);
        } catch (Exception unused) {
        }
    }
}
