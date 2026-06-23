package flar2.devcheck.tools;

import android.content.DialogInterface;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.d51;
import defpackage.f52;
import defpackage.gr;
import defpackage.j3;
import defpackage.n72;
import defpackage.om;
import defpackage.op0;
import defpackage.p92;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.q92;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.t92;
import defpackage.th2;
import defpackage.u92;
import defpackage.uz1;
import defpackage.vq;
import defpackage.w5;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.tools.WifiActivity;
import flar2.devcheck.utils.MyLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class WifiActivity extends a5 {
    public static final /* synthetic */ int R = 0;
    public RecyclerView G;
    public View H;
    public TextView I;
    public ArrayList J;
    public t92 K;
    public IntentFilter M;
    public boolean N;
    public Handler O;
    public int F = 1;
    public om L = null;
    public final f52 P = new f52(3, this);
    public final w5 Q = new w5(20, this);

    public static void B(WifiActivity wifiActivity) {
        synchronized (wifiActivity) {
            om omVar = new om(wifiActivity);
            wifiActivity.L = omVar;
            try {
                try {
                    omVar.executeOnExecutor(MainApp.h, new Void[0]);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                wifiActivity.L.executeOnExecutor(MainApp.h, new Void[0]);
            }
        }
    }

    public static int C(u92 u92Var) {
        String str = u92Var.f;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(" ");
            if (split.length != 0) {
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    if (parseInt >= 57000 && parseInt < 71000) {
                        return 4;
                    }
                    if (parseInt >= 5900 && parseInt < 7125) {
                        return 3;
                    }
                    if (parseInt >= 4900 && parseInt < 5900) {
                        return 2;
                    }
                    if (parseInt >= 2400 && parseInt < 2500) {
                        return 1;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return 0;
    }

    public final synchronized void D() {
        try {
            if (!this.N && this.O != null) {
                om omVar = this.L;
                if (omVar != null) {
                    omVar.cancel(true);
                }
                this.O.post(this.P);
            }
            this.N = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_wifi);
        pr.m(getWindow());
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
        collapsingToolbarLayout.setTitle(getString(R.string.wifi_scanner));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        int i = 0;
        pr.U(getWindow(), false);
        this.H = findViewById(R.id.placeholder);
        this.I = (TextView) findViewById(R.id.placeholder_text);
        this.G = (RecyclerView) findViewById(R.id.recyclerview);
        getBaseContext();
        this.G.setLayoutManager(new MyLinearLayoutManager(1));
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        t92 t92Var = new t92(this, arrayList);
        this.K = t92Var;
        this.G.setAdapter(t92Var);
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, i);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(this, new p92(this, i));
        HandlerThread handlerThread = new HandlerThread("wifi_refresh_thread", 19);
        handlerThread.start();
        this.O = new Handler(handlerThread.getLooper());
        IntentFilter intentFilter = new IntentFilter();
        this.M = intentFilter;
        intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
        if (pr.g(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 344);
        }
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        if (wifiManager.isWifiEnabled()) {
            wifiManager.startScan();
            return;
        }
        this.H.setVisibility(0);
        this.I.setText(getString(R.string.wifi) + " " + getString(R.string.disabled));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_wifi, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        final int i = 1;
        if (menuItem.getItemId() == R.id.action_settings) {
            uz1.u0(this);
            return true;
        }
        if (menuItem.getItemId() != R.id.action_sort) {
            return super.onOptionsItemSelected(menuItem);
        }
        String[] strArr = {getString(R.string.signal_strength), getString(R.string.wifi_channel), getString(R.string.wifi_band), getString(R.string.security)};
        int A = d51.A(this.F);
        th2 th2Var = new th2(this);
        th2Var.k(R.string.sort);
        final int i2 = 0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: r92
            public final /* synthetic */ WifiActivity h;

            {
                this.h = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i2;
                int i5 = 3;
                WifiActivity wifiActivity = this.h;
                switch (i4) {
                    case 0:
                        switch (i3) {
                            case 0:
                                wifiActivity.F = 1;
                                break;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                wifiActivity.F = 2;
                                break;
                            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                wifiActivity.F = 3;
                                break;
                            case 3:
                                wifiActivity.F = 4;
                                break;
                            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                wifiActivity.F = 5;
                                break;
                            case 5:
                                wifiActivity.F = 6;
                                break;
                            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                wifiActivity.F = 7;
                                break;
                            default:
                                int i6 = WifiActivity.R;
                                break;
                        }
                    default:
                        ArrayList arrayList = wifiActivity.J;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            ArrayList arrayList2 = wifiActivity.J;
                            if (arrayList2 != null && arrayList2.size() > 1) {
                                Collections.sort(arrayList2, new iy(i5, wifiActivity));
                            }
                            wifiActivity.K.f();
                            break;
                        }
                        break;
                }
            }
        };
        j3 j3Var = (j3) th2Var.h;
        j3Var.p = strArr;
        j3Var.r = onClickListener;
        j3Var.w = A;
        j3Var.v = true;
        th2Var.i(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: r92
            public final /* synthetic */ WifiActivity h;

            {
                this.h = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i;
                int i5 = 3;
                WifiActivity wifiActivity = this.h;
                switch (i4) {
                    case 0:
                        switch (i3) {
                            case 0:
                                wifiActivity.F = 1;
                                break;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                wifiActivity.F = 2;
                                break;
                            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                wifiActivity.F = 3;
                                break;
                            case 3:
                                wifiActivity.F = 4;
                                break;
                            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                wifiActivity.F = 5;
                                break;
                            case 5:
                                wifiActivity.F = 6;
                                break;
                            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                wifiActivity.F = 7;
                                break;
                            default:
                                int i6 = WifiActivity.R;
                                break;
                        }
                    default:
                        ArrayList arrayList = wifiActivity.J;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            ArrayList arrayList2 = wifiActivity.J;
                            if (arrayList2 != null && arrayList2.size() > 1) {
                                Collections.sort(arrayList2, new iy(i5, wifiActivity));
                            }
                            wifiActivity.K.f();
                            break;
                        }
                        break;
                }
            }
        });
        th2Var.g(android.R.string.cancel, null);
        th2Var.l();
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        om omVar = this.L;
        if (omVar != null) {
            omVar.cancel(true);
        }
        try {
            w5 w5Var = this.Q;
            if (w5Var != null) {
                unregisterReceiver(w5Var);
            }
        } catch (IllegalArgumentException unused) {
        }
        synchronized (this) {
            this.N = false;
            new Handler().postDelayed(new q92(this, 0), 1000L);
        }
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 344 || iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            D();
        } else {
            this.H.setVisibility(0);
            this.I.setText(getString(R.string.permission_denied));
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (pr.g(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        registerReceiver(this.Q, this.M);
        new Handler().postDelayed(new q92(this, 1), 500L);
    }
}
