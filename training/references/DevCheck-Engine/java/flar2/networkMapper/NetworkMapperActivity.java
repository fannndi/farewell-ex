package flar2.devcheck.networkMapper;

import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.d51;
import defpackage.e21;
import defpackage.fp0;
import defpackage.gr;
import defpackage.i51;
import defpackage.l72;
import defpackage.n21;
import defpackage.n72;
import defpackage.op0;
import defpackage.p8;
import defpackage.pr;
import defpackage.py0;
import defpackage.s11;
import defpackage.sl;
import defpackage.tc;
import defpackage.tl0;
import defpackage.uz1;
import defpackage.v31;
import defpackage.vc;
import defpackage.vq;
import defpackage.z11;
import flar2.devcheck.R;
import flar2.devcheck.networkMapper.NetworkMapperActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class NetworkMapperActivity extends a5 {
    public static final /* synthetic */ int j0 = 0;
    public e21 F;
    public fp0 G;
    public LinearLayout H;
    public LinearLayout I;
    public LinearLayout J;
    public LinearLayout K;
    public LinearLayout L;
    public TextView M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public TextView T;
    public TextView U;
    public TextView V;
    public TextView W;
    public Button X;
    public ProgressBar Y;
    public RecyclerView Z;
    public ImageView a0;
    public int b0;
    public int c0;
    public View d0;
    public View e0;
    public TextView f0;
    public TextView g0;
    public TextView h0;
    public TextView i0;

    public static void B(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    public static void D(View view, int i) {
        if (view == null || view.getVisibility() == i) {
            return;
        }
        view.setVisibility(i);
    }

    public final boolean C() {
        return (pr.g(this, "android.permission.ACCESS_WIFI_STATE") == 0) && (pr.g(this, "android.permission.INTERNET") == 0) && (Build.VERSION.SDK_INT < 29 ? pr.g(this, "android.permission.ACCESS_FINE_LOCATION") == 0 : pr.g(this, "android.permission.ACCESS_FINE_LOCATION") == 0);
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_network_mapper);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.root);
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
        collapsingToolbarLayout.setTitle(getString(R.string.network_mapper));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        final int i2 = 0;
        pr.U(getWindow(), false);
        k().a(this, new vc(7, this));
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        this.b0 = typedValue.data;
        getTheme().resolveAttribute(R.attr.textTertiary, typedValue, true);
        this.c0 = typedValue.data;
        this.a0 = (ImageView) findViewById(R.id.image_wifi);
        this.V = (TextView) findViewById(R.id.text_ssid);
        this.W = (TextView) findViewById(R.id.text_status);
        this.X = (Button) findViewById(R.id.button_scan);
        this.Y = (ProgressBar) findViewById(R.id.progress_scan);
        this.Z = (RecyclerView) findViewById(R.id.recycler_devices);
        this.d0 = findViewById(R.id.info_card);
        this.e0 = findViewById(R.id.placeholder);
        this.f0 = (TextView) findViewById(R.id.overview_connection);
        this.g0 = (TextView) findViewById(R.id.overview_signal);
        this.h0 = (TextView) findViewById(R.id.overview_gateway);
        this.i0 = (TextView) findViewById(R.id.overview_vpn);
        this.H = (LinearLayout) findViewById(R.id.node_internet);
        this.I = (LinearLayout) findViewById(R.id.node_vpn);
        this.J = (LinearLayout) findViewById(R.id.node_gateway);
        this.K = (LinearLayout) findViewById(R.id.node_ap);
        this.L = (LinearLayout) findViewById(R.id.node_device);
        this.M = (TextView) findViewById(R.id.arrow_internet_gateway);
        this.N = (TextView) findViewById(R.id.arrow_gateway_ap);
        this.O = (TextView) findViewById(R.id.arrow_ap_vpn);
        this.P = (TextView) findViewById(R.id.arrow_vpn_device);
        this.Q = (TextView) findViewById(R.id.node_internet_subtitle);
        this.R = (TextView) findViewById(R.id.node_vpn_subtitle);
        this.S = (TextView) findViewById(R.id.node_gateway_subtitle);
        this.T = (TextView) findViewById(R.id.node_ap_subtitle);
        this.U = (TextView) findViewById(R.id.node_device_subtitle);
        this.Z.setLayoutManager(new LinearLayoutManager(1));
        fp0 fp0Var = new fp0(new p8(27, this));
        this.G = fp0Var;
        this.Z.setAdapter(fp0Var);
        n72 l = l();
        l72 g = g();
        py0 h = h();
        l.getClass();
        g.getClass();
        gr grVar = new gr(l, g, h);
        vq a2 = af1.a(e21.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.F = (e21) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        int c = i51.c(0, "pref_network_mapper_sort_mode");
        int[] D = d51.D(4);
        int i3 = (c < 0 || c >= D.length) ? 1 : D[c];
        e21 e21Var = this.F;
        e21Var.e = i3;
        ArrayList arrayList = e21Var.f;
        if (arrayList != null) {
            e21Var.r(arrayList);
        }
        this.F.j.e(this, new z11(this, 0));
        this.F.k.e(this, new v31(this) { // from class: y11
            public final /* synthetic */ NetworkMapperActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i4 = i2;
                NetworkMapperActivity networkMapperActivity = this.b;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        int i5 = NetworkMapperActivity.j0;
                        if (list.isEmpty()) {
                            networkMapperActivity.d0.setVisibility(0);
                            networkMapperActivity.e0.setVisibility(8);
                        } else if (list.size() > 1) {
                            networkMapperActivity.d0.setVisibility(8);
                            networkMapperActivity.Z.setVisibility(0);
                            networkMapperActivity.e0.setVisibility(8);
                        } else {
                            networkMapperActivity.e0.setVisibility(0);
                            networkMapperActivity.Z.setVisibility(8);
                        }
                        fp0 fp0Var2 = networkMapperActivity.G;
                        ArrayList arrayList2 = fp0Var2.d;
                        arrayList2.clear();
                        arrayList2.addAll(list);
                        fp0Var2.f();
                        break;
                    default:
                        c21 c21Var = (c21) obj;
                        int i6 = NetworkMapperActivity.j0;
                        if (c21Var != null) {
                            int ordinal = c21Var.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    networkMapperActivity.Y.setVisibility(0);
                                    networkMapperActivity.X.setEnabled(false);
                                    networkMapperActivity.X.setText(R.string.scanning);
                                    break;
                                } else if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                                }
                            }
                            networkMapperActivity.Y.setVisibility(8);
                            networkMapperActivity.X.setEnabled(true);
                            networkMapperActivity.X.setText(R.string.scan_network);
                            break;
                        }
                        break;
                }
            }
        });
        this.F.l.e(this, new v31(this) { // from class: y11
            public final /* synthetic */ NetworkMapperActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i4 = i;
                NetworkMapperActivity networkMapperActivity = this.b;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        int i5 = NetworkMapperActivity.j0;
                        if (list.isEmpty()) {
                            networkMapperActivity.d0.setVisibility(0);
                            networkMapperActivity.e0.setVisibility(8);
                        } else if (list.size() > 1) {
                            networkMapperActivity.d0.setVisibility(8);
                            networkMapperActivity.Z.setVisibility(0);
                            networkMapperActivity.e0.setVisibility(8);
                        } else {
                            networkMapperActivity.e0.setVisibility(0);
                            networkMapperActivity.Z.setVisibility(8);
                        }
                        fp0 fp0Var2 = networkMapperActivity.G;
                        ArrayList arrayList2 = fp0Var2.d;
                        arrayList2.clear();
                        arrayList2.addAll(list);
                        fp0Var2.f();
                        break;
                    default:
                        c21 c21Var = (c21) obj;
                        int i6 = NetworkMapperActivity.j0;
                        if (c21Var != null) {
                            int ordinal = c21Var.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    networkMapperActivity.Y.setVisibility(0);
                                    networkMapperActivity.X.setEnabled(false);
                                    networkMapperActivity.X.setText(R.string.scanning);
                                    break;
                                } else if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                                }
                            }
                            networkMapperActivity.Y.setVisibility(8);
                            networkMapperActivity.X.setEnabled(true);
                            networkMapperActivity.X.setText(R.string.scan_network);
                            break;
                        }
                        break;
                }
            }
        });
        this.F.m.e(this, new z11(this, 1));
        this.X.setOnClickListener(new tc(20, this));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_network_mapper, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_settings) {
            uz1.u0(this);
            return true;
        }
        if (menuItem.getItemId() == R.id.action_sort) {
            new n21().z0(s(), "network_sort_sheet");
            return true;
        }
        if (menuItem.getItemId() != R.id.action_filter) {
            return super.onOptionsItemSelected(menuItem);
        }
        new s11().z0(s(), "network_filter_sheet");
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        tl0.a("network_mapper");
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1001) {
            if (C()) {
                this.F.w();
            } else {
                this.W.setText(R.string.permissions_required_to_scan_network);
            }
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        tl0.b(this, "network_mapper");
        this.F.u();
    }

    @Override // defpackage.a5
    public final boolean z() {
        finish();
        return true;
    }
}
