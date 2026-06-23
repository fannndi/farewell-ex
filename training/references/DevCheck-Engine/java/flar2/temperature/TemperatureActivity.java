package flar2.devcheck.temperature;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.af1;
import defpackage.bj0;
import defpackage.c;
import defpackage.c3;
import defpackage.c71;
import defpackage.cx1;
import defpackage.et;
import defpackage.ex1;
import defpackage.fb0;
import defpackage.gr;
import defpackage.l72;
import defpackage.n72;
import defpackage.op0;
import defpackage.pr;
import defpackage.py0;
import defpackage.sl;
import defpackage.v31;
import defpackage.vq;
import defpackage.x10;
import defpackage.xw1;
import defpackage.yw1;
import defpackage.zd1;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.temperature.TemperatureActivity;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class TemperatureActivity extends a5 {
    public static final /* synthetic */ int N = 0;
    public ex1 F;
    public RecyclerView G;
    public xw1 H;
    public bj0 I;
    public MenuItem J;
    public boolean K = true;
    public boolean L = false;
    public yw1 M = null;

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        pr.m(getWindow());
        setContentView(R.layout.activity_temperature2);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.root);
        if (coordinatorLayout != null) {
            op0.a(coordinatorLayout, true, false, true, false, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        collapsingToolbarLayout.setTitle(getString(R.string.temperatures));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        final int i2 = 0;
        pr.U(getWindow(), false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.G = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        zd1 itemAnimator = this.G.getItemAnimator();
        if (itemAnimator instanceof x10) {
            ((x10) itemAnimator).g = false;
        }
        this.G.j(new fb0(2, this));
        n72 l = l();
        l72 g = g();
        py0 h = h();
        l.getClass();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(ex1.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.F = (ex1) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        this.H = new xw1(this, new c71(10, this));
        this.I = new bj0(bj0.g, i);
        this.G.setAdapter(this.H);
        this.F.c.e(this, new v31(this) { // from class: qw1
            public final /* synthetic */ TemperatureActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i3 = i2;
                TemperatureActivity temperatureActivity = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            temperatureActivity.I.v(list);
                            break;
                        } else {
                            int i4 = TemperatureActivity.N;
                            break;
                        }
                    default:
                        yw1 yw1Var = (yw1) obj;
                        if (yw1Var != null) {
                            temperatureActivity.M = yw1Var;
                            if (!temperatureActivity.K) {
                                temperatureActivity.L = true;
                                break;
                            } else {
                                temperatureActivity.H.w(yw1Var);
                                temperatureActivity.L = false;
                                break;
                            }
                        } else {
                            int i5 = TemperatureActivity.N;
                            break;
                        }
                }
            }
        });
        this.F.d.e(this, new v31(this) { // from class: qw1
            public final /* synthetic */ TemperatureActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i3 = i;
                TemperatureActivity temperatureActivity = this.b;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        if (list != null) {
                            temperatureActivity.I.v(list);
                            break;
                        } else {
                            int i4 = TemperatureActivity.N;
                            break;
                        }
                    default:
                        yw1 yw1Var = (yw1) obj;
                        if (yw1Var != null) {
                            temperatureActivity.M = yw1Var;
                            if (!temperatureActivity.K) {
                                temperatureActivity.L = true;
                                break;
                            } else {
                                temperatureActivity.H.w(yw1Var);
                                temperatureActivity.L = false;
                                break;
                            }
                        } else {
                            int i5 = TemperatureActivity.N;
                            break;
                        }
                }
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_temperature, menu);
        this.J = menu.findItem(R.id.action_tempunit);
        boolean d = et.f248a.d("prefFahrenheit");
        MenuItem menuItem = this.J;
        if (d) {
            menuItem.setTitle(R.string.units_metric);
            return true;
        }
        menuItem.setTitle(R.string.units_imperial);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        int i = 0;
        if (itemId == R.id.action_reset) {
            ex1 ex1Var = this.F;
            ex1Var.getClass();
            MainApp.h.execute(new cx1(ex1Var, i));
            return true;
        }
        if (itemId != R.id.action_tempunit) {
            return super.onOptionsItemSelected(menuItem);
        }
        boolean d = et.f248a.d("prefFahrenheit");
        MenuItem menuItem2 = this.J;
        if (d) {
            menuItem2.setTitle(getResources().getString(R.string.units_imperial));
            et.c("prefFahrenheit", false);
        } else {
            menuItem2.setTitle(getResources().getString(R.string.units_metric));
            et.c("prefFahrenheit", true);
        }
        this.H.f();
        this.I.f();
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onStart() {
        super.onStart();
        ex1 ex1Var = this.F;
        if (ex1Var.n) {
            return;
        }
        ex1Var.n = true;
        ex1Var.p.k();
        ex1Var.f.post(ex1Var.t);
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.F.f();
    }

    @Override // defpackage.a5
    public final boolean z() {
        onBackPressed();
        return true;
    }
}
