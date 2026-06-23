package flar2.devcheck.tools;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.gr;
import defpackage.n3;
import defpackage.n72;
import defpackage.nc;
import defpackage.nj1;
import defpackage.op0;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.rg0;
import defpackage.rj;
import defpackage.sg0;
import defpackage.sj;
import defpackage.sl;
import defpackage.vg0;
import defpackage.vq;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.utils.MyLinearLayoutManager;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public class GpsActivity extends a5 {
    public static long U;
    public static boolean V;
    public LocationManager F;
    public rg0 G;
    public n3 H;
    public sg0 I;
    public ArrayList J;
    public vg0 K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public TextView T;

    public final void B() {
        this.L.setText("-");
        this.M.setText("-");
        this.N.setText("-");
        this.O.setText("-");
        this.P.setVisibility(4);
        this.Q.setVisibility(4);
        this.R.setText("-");
        this.S.setText("");
        this.T.setText("");
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_gps);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.root);
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(R.id.nestedscrollview);
        if (coordinatorLayout != null && nestedScrollView != null) {
            op0.a(coordinatorLayout, true, false, true, false, false, false);
            op0.a(nestedScrollView, false, true, false, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        r.j0(true);
        r().m0(getResources().getString(R.string.gps_status));
        this.L = (TextView) findViewById(R.id.lat);
        this.M = (TextView) findViewById(R.id.lon);
        this.N = (TextView) findViewById(R.id.alt);
        this.O = (TextView) findViewById(R.id.spd);
        this.P = (TextView) findViewById(R.id.bear);
        this.Q = (TextView) findViewById(R.id.bearing);
        this.R = (TextView) findViewById(R.id.accuracy);
        TextView textView = (TextView) findViewById(R.id.fix);
        ImageView imageView = (ImageView) findViewById(R.id.gps_icon);
        this.F = (LocationManager) getSystemService("location");
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        DecimalFormat decimalFormat2 = new DecimalFormat("0.000000");
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, 0);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b == null) {
            c.m(yttXLrAeLjN.eppO);
            return;
        }
        ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(this, new nc(12, this));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        getBaseContext();
        recyclerView.setLayoutManager(new MyLinearLayoutManager(1));
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        arrayList.add(new nj1(0));
        this.J.add(new nj1(2));
        vg0 vg0Var = new vg0(this, this.J);
        this.K = vg0Var;
        recyclerView.setAdapter(vg0Var);
        this.S = (TextView) findViewById(R.id.time_to_first_fix);
        this.T = (TextView) findViewById(R.id.timestamp);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm:ss a", Locale.getDefault());
        textView.setText(R.string.gps_no_fix);
        B();
        if (pr.g(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 126);
        }
        this.G = new rg0(this, imageView, decimalFormat2, decimalFormat, simpleDateFormat);
        this.I = new sg0(this, textView, imageView, decimalFormat);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tools, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_settings) {
            return super.onOptionsItemSelected(menuItem);
        }
        try {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            return true;
        } catch (ActivityNotFoundException unused) {
            return true;
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        V = false;
        this.F.removeUpdates(this.G);
        this.F.unregisterGnssStatusCallback(this.I);
        n3 n3Var = this.H;
        if (n3Var != null) {
            n3Var.dismiss();
        }
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 126) {
            if (iArr.length == 0 || iArr[0] != 0) {
                Toast.makeText(this, R.string.permission_denied, 0).show();
            } else if (pr.g(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                this.F.registerGnssStatusCallback(this.I);
                this.F.requestLocationUpdates("gps", 1000L, 0.0f, this.G);
            }
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (pr.g(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            U = System.currentTimeMillis();
            try {
                this.F.registerGnssStatusCallback(this.I);
            } catch (Exception unused) {
            }
            try {
                this.F.requestLocationUpdates("gps", 1000L, 0.0f, this.G);
            } catch (Exception unused2) {
            }
        }
    }
}
