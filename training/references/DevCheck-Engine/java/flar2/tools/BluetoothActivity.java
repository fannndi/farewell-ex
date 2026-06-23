package flar2.devcheck.tools;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.c3;
import defpackage.gi;
import defpackage.j3;
import defpackage.k5;
import defpackage.l01;
import defpackage.n3;
import defpackage.ok;
import defpackage.op0;
import defpackage.pr;
import defpackage.qk;
import defpackage.sl;
import defpackage.th2;
import defpackage.w5;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.Sd.tEegR;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class BluetoothActivity extends a5 {
    public static final /* synthetic */ int O = 0;
    public BluetoothAdapter F;
    public n3 G;
    public DecimalFormat H;
    public RecyclerView I;
    public l01 J;
    public View L;
    public TextView M;
    public final ArrayList K = new ArrayList();
    public final w5 N = new w5(5, this);

    public final void B() {
        this.G.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            int i = (getResources().getDisplayMetrics().widthPixels * 90) / 100;
            if (getResources().getConfiguration().orientation == 2 || getResources().getBoolean(R.bool.isTablet)) {
                i = (getResources().getDisplayMetrics().widthPixels * 60) / 100;
            }
            this.G.getWindow().setLayout(i, -2);
        } catch (Exception unused) {
        }
    }

    public final void C(int i) {
        this.I.setHasFixedSize(true);
        this.I.setLayoutManager(new LinearLayoutManager(1));
        new qk(this, i).executeOnExecutor(MainApp.h, new Void[0]);
    }

    public final void D(String str) {
        th2 th2Var = new th2(this);
        String string = getString(R.string.bluetooth_is_off);
        j3 j3Var = (j3) th2Var.h;
        j3Var.e = string;
        j3Var.g = getString(R.string.Bluetooth_msg);
        j3Var.n = false;
        th2Var.h(getString(R.string.no), new ok(this, 2));
        th2Var.j(getString(R.string.yes), new gi(this, 1, str));
        n3 n3Var = this.G;
        if (n3Var != null && n3Var.isShowing()) {
            this.G.dismiss();
        }
        n3 a2 = th2Var.a();
        this.G = a2;
        a2.show();
        B();
    }

    public final void E(int i) {
        this.K.clear();
        new Handler().postDelayed(new k5(this, 8, new IntentFilter("android.bluetooth.device.action.FOUND")), i);
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_bluetooth);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.root);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        if (coordinatorLayout != null && recyclerView != null) {
            op0.a(coordinatorLayout, true, false, true, false, false, false);
            op0.a(recyclerView, false, false, false, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        r.j0(true);
        this.H = new DecimalFormat("0.0");
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        collapsingToolbarLayout.setTitle(getString(R.string.tools));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        pr.U(getWindow(), false);
        this.L = findViewById(R.id.placeholder);
        this.M = (TextView) findViewById(R.id.temp_placeholder);
        this.I = (RecyclerView) findViewById(R.id.recyclerview);
        this.F = BluetoothAdapter.getDefaultAdapter();
        String stringExtra = getIntent().getStringExtra("start");
        if (stringExtra != null) {
            if (stringExtra.equals(gXdyRQCGVlHW.SLGmwl)) {
                if (Build.VERSION.SDK_INT >= 31 && pr.g(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
                    requestPermissions(new String[]{"android.permission.BLUETOOTH_CONNECT"}, 134);
                    return;
                }
                collapsingToolbarLayout.setTitle(getString(R.string.paired_devices));
                if (this.F.isEnabled()) {
                    C(0);
                    return;
                } else {
                    D(getString(R.string.paired_devices));
                    return;
                }
            }
            if (stringExtra.equals("nearby")) {
                if (Build.VERSION.SDK_INT < 31 || (pr.g(this, "android.permission.ACCESS_FINE_LOCATION") == 0 && pr.g(this, "android.permission.BLUETOOTH_SCAN") == 0)) {
                    if (pr.g(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                        requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 132);
                        return;
                    }
                    collapsingToolbarLayout.setTitle(getString(R.string.nearby_devices));
                    if (this.F.isEnabled()) {
                        E(0);
                        return;
                    } else {
                        D(getString(R.string.nearby_devices));
                        return;
                    }
                }
                th2 th2Var = new th2(this);
                String string = getString(R.string.permissions);
                j3 j3Var = (j3) th2Var.h;
                j3Var.e = string;
                j3Var.g = getString(R.string.bluetooth_permission_msg);
                j3Var.n = false;
                th2Var.h(getString(R.string.cancel), new ok(this, 0));
                th2Var.j(getString(R.string.okay), new ok(this, 1));
                n3 n3Var = this.G;
                if (n3Var != null && n3Var.isShowing()) {
                    this.G.dismiss();
                }
                n3 a2 = th2Var.a();
                this.G = a2;
                a2.show();
                B();
            }
        }
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
            startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        BluetoothAdapter bluetoothAdapter;
        super.onPause();
        try {
            w5 w5Var = this.N;
            if (w5Var != null) {
                unregisterReceiver(w5Var);
            }
        } catch (Exception unused) {
        }
        try {
            if ((this.F == null || Build.VERSION.SDK_INT < 31 || pr.g(this, "android.permission.BLUETOOTH_SCAN") == 0) && (bluetoothAdapter = this.F) != null) {
                bluetoothAdapter.cancelDiscovery();
            }
        } catch (Exception unused2) {
        }
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str = tEegR.BkuQp;
        super.onRequestPermissionsResult(i, strArr, iArr);
        try {
            switch (i) {
                case 132:
                    if (iArr.length != 0 && iArr[0] == 0) {
                        E(0);
                        break;
                    } else {
                        this.L.setVisibility(0);
                        this.M.setText(getString(R.string.permission_denied) + "\nandroid.permission.ACCESS_FINE_LOCATION");
                        break;
                    }
                    break;
                case 133:
                    if (iArr.length != 0 && iArr[0] == 0) {
                        E(0);
                        break;
                    } else {
                        this.L.setVisibility(0);
                        String string = getString(R.string.permission_denied);
                        if (Build.VERSION.SDK_INT >= 31) {
                            string = getString(R.string.permission_denied) + "\nandroid.permission.BLUETOOTH_SCAN";
                        }
                        this.M.setText(string);
                        break;
                    }
                    break;
                case 134:
                    if (iArr.length != 0 && iArr[0] == 0) {
                        C(0);
                        break;
                    } else {
                        this.L.setVisibility(0);
                        String string2 = getString(R.string.permission_denied);
                        if (Build.VERSION.SDK_INT >= 31) {
                            string2 = getString(R.string.permission_denied) + str;
                        }
                        this.M.setText(string2);
                        break;
                    }
                    break;
            }
        } catch (Exception unused) {
        }
    }
}
