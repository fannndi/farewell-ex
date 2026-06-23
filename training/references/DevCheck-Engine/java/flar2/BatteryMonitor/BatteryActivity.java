package flar2.devcheck.BatteryMonitor;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.text.format.DateFormat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import defpackage.a5;
import defpackage.af1;
import defpackage.bf;
import defpackage.c;
import defpackage.c3;
import defpackage.cp1;
import defpackage.d51;
import defpackage.gr;
import defpackage.i51;
import defpackage.l2;
import defpackage.n72;
import defpackage.nc;
import defpackage.oe;
import defpackage.op0;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.sq;
import defpackage.uz1;
import defpackage.vq;
import defpackage.w5;
import defpackage.ze;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Timer;

/* loaded from: classes.dex */
public class BatteryActivity extends a5 implements AdapterView.OnItemSelectedListener {
    public static final /* synthetic */ int b0 = 0;
    public View F;
    public View G;
    public TextView H;
    public BatteryManager I;
    public boolean J;
    public Spinner L;
    public ArrayList M;
    public int N;
    public long O;
    public long P;
    public int Q;
    public int R;
    public int S;
    public long T;
    public long U;
    public long V;
    public TextView W;
    public TextView X;
    public Timer Y;
    public final sq K = new sq();
    public final DecimalFormat Z = new DecimalFormat("###.#");
    public final w5 a0 = new w5(1, this);

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:107:0x0107
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0142 A[Catch: Exception -> 0x01e7, TryCatch #7 {Exception -> 0x01e7, blocks: (B:31:0x0134, B:33:0x0142, B:51:0x01ae, B:53:0x01b4, B:54:0x01bd, B:91:0x014a), top: B:30:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014a A[Catch: Exception -> 0x01e7, TRY_LEAVE, TryCatch #7 {Exception -> 0x01e7, blocks: (B:31:0x0134, B:33:0x0142, B:51:0x01ae, B:53:0x01b4, B:54:0x01bd, B:91:0x014a), top: B:30:0x0134 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void B(flar2.devcheck.BatteryMonitor.BatteryActivity r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.BatteryMonitor.BatteryActivity.B(flar2.devcheck.BatteryMonitor.BatteryActivity, android.content.Intent):void");
    }

    public static String D(long j) {
        String valueOf = String.valueOf((j / 1000) % 60);
        String valueOf2 = String.valueOf((j / 60000) % 60);
        String valueOf3 = String.valueOf((j / 3600000) % 24);
        String valueOf4 = String.valueOf(j / 86400000);
        StringBuilder sb = new StringBuilder();
        if (!valueOf4.equals("0")) {
            sb.append(valueOf4);
            sb.append("d ");
        }
        if (!valueOf3.equals("0")) {
            sb.append(valueOf3);
            sb.append("h ");
        }
        if (!valueOf2.equals("0")) {
            sb.append(valueOf2);
            sb.append("m ");
        }
        if (valueOf3.equals("0")) {
            sb.append(valueOf);
            sb.append("s");
        }
        return sb.toString();
    }

    public final void C(boolean z) {
        if (z) {
            i51.k("prefBMStartMarker", -1L);
            if (Build.VERSION.SDK_INT >= 26) {
                startForegroundService(new Intent(getApplicationContext(), (Class<?>) BatteryMonitorService.class));
            } else {
                startService(new Intent(getApplicationContext(), (Class<?>) BatteryMonitorService.class));
            }
        } else {
            stopService(new Intent(getApplicationContext(), (Class<?>) BatteryMonitorService.class));
        }
        G();
    }

    public final boolean E() {
        Intent registerReceiver = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : 0;
        return intExtra == 3 || intExtra == 4;
    }

    public final int F() {
        int i;
        int i2;
        Intent registerReceiver = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("level", -1);
            i2 = registerReceiver.getIntExtra("scale", -1);
        } else {
            i = 0;
            i2 = 0;
        }
        return (i * 100) / i2;
    }

    public final void G() {
        long j;
        long j2;
        double d;
        String v;
        boolean booleanValue = i51.b("prefBMEnable").booleanValue();
        View view = this.F;
        if (!booleanValue) {
            view.setVisibility(8);
            this.G.setVisibility(8);
            this.H.setVisibility(0);
            Timer timer = this.Y;
            if (timer != null) {
                timer.cancel();
            }
            View findViewById = findViewById(R.id.battery_container);
            int[] iArr = cp1.B;
            cp1 f = cp1.f(findViewById, findViewById.getResources().getText(R.string.service_is_disabled), -2);
            ((SnackbarContentLayout) f.i.getChildAt(0)).getActionView().setTextColor(uz1.R(this));
            f.g(f.h.getText(R.string.enable), new ze(this, 1));
            f.h();
            return;
        }
        view.setVisibility(0);
        this.G.setVisibility(0);
        this.H.setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.idle_drain);
        TextView textView2 = (TextView) findViewById(R.id.screen_drain);
        TextView textView3 = (TextView) findViewById(R.id.screen_on);
        TextView textView4 = (TextView) findViewById(R.id.screen_off);
        TextView textView5 = (TextView) findViewById(R.id.screen_on_usage);
        TextView textView6 = (TextView) findViewById(R.id.screen_off_usage);
        TextView textView7 = (TextView) findViewById(R.id.charge_time);
        TextView textView8 = (TextView) findViewById(R.id.bm_deepsleep);
        TextView textView9 = (TextView) findViewById(R.id.battery_time);
        TextView textView10 = (TextView) findViewById(R.id.held_awake);
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        DecimalFormat decimalFormat2 = new DecimalFormat("###.#");
        long d2 = i51.d("prefTBatt");
        if (E()) {
            d2 = (System.currentTimeMillis() - i51.d("prefTBattMark")) + d2;
        }
        textView9.setText(getString(R.string.time_on_battery) + ":  " + D(d2 - this.V));
        long d3 = i51.d("prefTSOn");
        if (E()) {
            d3 = (System.currentTimeMillis() - i51.d("prefTSOnMark")) + d3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.time));
        sb.append(":  ");
        sb.append(D(d3 - this.O));
        textView3.setText(sb.toString());
        int c = i51.c(0, "prefPSOn");
        if (E()) {
            c += i51.c(0, "prefPSOnMark") - F();
        }
        int i = c - this.Q;
        textView5.setText(getString(R.string.usage) + ":  " + i + "%");
        long d4 = i51.d("prefTSOff");
        textView4.setText(getString(R.string.time) + ":  " + D(d4 - this.P));
        int c2 = i51.c(0, "prefPSOff") - this.R;
        textView6.setText(getString(R.string.usage) + ":  " + c2 + "%");
        long d5 = i51.d("prefTDSDischarge");
        textView8.setText(getString(R.string.deep_sleep) + ":  " + D(d5 - this.T));
        long j3 = d4 - this.P;
        long j4 = j3 - (d5 - this.T);
        if (d4 > 0) {
            j2 = 0;
            j = j4;
            d = (j4 / j3) * 100.0d;
        } else {
            j = j4;
            j2 = 0;
            d = 0.0d;
        }
        if (j3 <= j2) {
            v = getString(R.string.held_awake) + ":  " + D(j);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(R.string.held_awake));
            sb2.append(":  ");
            sb2.append(D(j));
            sb2.append(" (");
            v = d51.v(decimalFormat2, d, sb2, "%)");
        }
        textView10.setText(v);
        long d6 = i51.d(bPnJ.oUP);
        if (!E()) {
            d6 += System.currentTimeMillis() - i51.d("prefTChargeMark");
        }
        textView7.setText(getString(R.string.time_charging) + ":  " + D(d6 - this.U));
        float f2 = c2 > 0 ? (c2 * 3600000.0f) / (d4 - this.P) : 0.0f;
        textView2.setText(getString(R.string.active_drain) + ":  " + decimalFormat.format(i > 0 ? (i * 3600000.0f) / (r17 - this.O) : 0.0f) + "% " + getString(R.string.per_hour));
        textView.setText(getString(R.string.idle_drain) + ":  " + decimalFormat.format((double) f2) + "% " + getString(R.string.per_hour));
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_battery);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.battery_container);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scroll_view);
        if (linearLayout != null && scrollView != null) {
            op0.a(linearLayout, true, false, true, false, false, false);
            op0.a(scrollView, false, false, false, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        int i = 1;
        try {
            sl r = r();
            Objects.requireNonNull(r);
            r.j0(true);
        } catch (NullPointerException unused) {
        }
        sl r2 = r();
        Objects.requireNonNull(r2);
        r2.m0(getString(R.string.battery_monitor));
        if (this.I == null) {
            this.I = (BatteryManager) getSystemService("batterymanager");
        }
        int intProperty = this.I.getIntProperty(1);
        int i2 = 0;
        this.J = intProperty < 10000000 && intProperty > 1;
        this.W = (TextView) findViewById(R.id.batmon_current);
        this.X = (TextView) findViewById(R.id.batmon_power);
        this.F = findViewById(R.id.batmon_container);
        this.G = findViewById(R.id.status_card);
        this.H = (TextView) findViewById(R.id.batmon_nostats);
        ((ImageView) findViewById(R.id.settings_button)).setOnClickListener(new ze(this, i2));
        this.L = (Spinner) findViewById(R.id.battery_spinner);
        ArrayList arrayList = new ArrayList();
        this.M = arrayList;
        arrayList.add(getString(R.string.since_start));
        i51.d("prefBMFullMarker");
        this.N = 1;
        this.M.add(getString(R.string.since_now));
        if (i51.d("prefBMCustomMarker") > 0) {
            this.M.add(getString(R.string.since) + " " + ((Object) DateFormat.format("MMM dd hh:mm a", i51.d("prefBMCustomMarker"))));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.M);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.L.setAdapter((SpinnerAdapter) arrayAdapter);
        this.L.setOnItemSelectedListener(this);
        if (i51.g("prefBMSpinnerSelection")) {
            try {
                int c = i51.c(0, "prefBMSpinnerSelection");
                int i3 = this.N;
                if (c == i3) {
                    c = i3 + 1;
                }
                if (c >= 0 && c < this.M.size()) {
                    this.L.setSelection(c);
                }
            } catch (Exception unused2) {
            }
        }
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, i2);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b != null) {
            ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(this, new nc(i, this));
        } else {
            c.m("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_battery, menu);
        if (i51.b("prefBMEnable").booleanValue()) {
            menu.findItem(R.id.action_disable_bm).setTitle(R.string.disable_batmon);
            return true;
        }
        menu.findItem(R.id.action_disable_bm).setTitle(R.string.enable_batmon);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        try {
            this.L.setSelection(i);
            String str = (String) this.L.getSelectedItem();
            i51.j(i, "prefBMSpinnerSelection");
            if (str.equals(getString(R.string.since_start))) {
                this.V = 0L;
                this.O = 0L;
                this.P = 0L;
                this.Q = 0;
                this.R = 0;
                this.S = 0;
                this.T = 0L;
                this.U = 0L;
            } else if (str.equals(getString(R.string.since_last_charge))) {
                i51.d("prefBMFullMarker");
            } else if (str.equals(getString(R.string.since_now))) {
                i51.k("prefBMCustomMarker", System.currentTimeMillis());
                this.V = i51.d("prefTBatt");
                if (E()) {
                    this.V = (System.currentTimeMillis() - i51.d("prefTBattMark")) + this.V;
                }
                i51.k("prefCustomTBatt", this.V);
                this.O = i51.d(bPnJ.BXXLSazWUwvThUD);
                if (E()) {
                    this.O = (System.currentTimeMillis() - i51.d("prefTSOnMark")) + this.O;
                }
                i51.k("prefCustomTSOn", this.O);
                this.Q = i51.c(0, "prefPSOn");
                if (E()) {
                    this.Q = (i51.c(0, "prefPSOnMark") - F()) + this.Q;
                }
                i51.j(this.Q, "prefCustomPSOff");
                long d = i51.d("prefTSOff");
                this.P = d;
                i51.k("prefCustomTSOff", d);
                int c = i51.c(0, "prefPSOff");
                this.R = c;
                i51.j(c, "prefCustomPSOn");
                if (this.J) {
                    this.S = i51.c(0, "prefCSOn");
                    if (E()) {
                        int i2 = this.S;
                        int c2 = i51.c(0, "prefCSOnMark");
                        if (this.I == null) {
                            this.I = (BatteryManager) getSystemService("batterymanager");
                        }
                        this.S = (c2 - this.I.getIntProperty(1)) + i2;
                    }
                    i51.j(this.S, "prefCustomCSOff");
                    i51.j(i51.c(0, "prefPCOff"), "prefCustomCSOn");
                }
                long d2 = i51.d("prefTDSDischarge");
                this.T = d2;
                i51.k("prefCustomTDSDischarge", d2);
                this.U = i51.d("prefTCharge");
                if (!E()) {
                    this.U = (System.currentTimeMillis() - i51.d("prefTChargeMark")) + this.U;
                }
                i51.k("prefCustomTCharge", this.U);
                if (this.M.size() > 2) {
                    this.M.remove(this.N + 1);
                }
                this.M.add(getString(R.string.since) + " " + ((Object) DateFormat.format("MMM dd hh:mm a", i51.d("prefBMCustomMarker"))));
            } else {
                this.V = i51.d("prefCustomTBatt");
                this.O = i51.d("prefCustomTSOn");
                this.P = i51.d("prefCustomTSOff");
                this.Q = i51.c(0, "prefCustomPSOff");
                this.R = i51.c(0, "prefCustomPSOn");
                this.S = i51.c(0, "prefCustomCSOff");
                i51.c(0, "prefCustomCSOn");
                this.T = i51.d("prefCustomTDSDischarge");
                this.U = i51.d("prefCustomTCharge");
            }
            G();
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Handler handler = new Handler();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            op0.E(this);
            return true;
        }
        int i = 0;
        if (itemId != R.id.action_disable_bm) {
            if (itemId != R.id.action_reset_stats) {
                return super.onOptionsItemSelected(menuItem);
            }
            new bf(this, i).executeOnExecutor(MainApp.h, new Void[0]);
            return true;
        }
        if (i51.b("prefBMEnable").booleanValue()) {
            menuItem.setTitle(R.string.enable_batmon);
            i51.i("prefBMEnable", false);
        } else if (Build.VERSION.SDK_INT < 33 || checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            menuItem.setTitle(R.string.disable_batmon);
            i51.i("prefBMEnable", true);
            View findViewById = findViewById(R.id.battery_container);
            int[] iArr = cp1.B;
            cp1 f = cp1.f(findViewById, findViewById.getResources().getText(R.string.service_enabled), 0);
            oe oeVar = f.i;
            ((SnackbarContentLayout) oeVar.getChildAt(0)).getActionView().setTextColor(uz1.R(this));
            ((SnackbarContentLayout) oeVar.getChildAt(0)).getActionView().setTextColor(uz1.R(this));
            f.h();
        } else {
            pr.R(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 226);
        }
        C(i51.b("prefBMEnable").booleanValue());
        try {
            this.L.setSelection(0);
        } catch (Exception unused) {
        }
        handler.postDelayed(new l2(6, this), 1000L);
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        unregisterReceiver(this.a0);
        try {
            Timer timer = this.Y;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.getClass().getSimpleName().equals(BFtDZYxPcpGN.rYDENeDhJIb)) {
            try {
                Method declaredMethod = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(menu, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 226) {
            if (iArr.length > 0) {
                int i2 = iArr[0];
            }
            i51.i("prefBMEnable", true);
            C(true);
            invalidateOptionsMenu();
            new bf(this, 1).executeOnExecutor(MainApp.h, new Void[0]);
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!uz1.g0(this)) {
            i51.i("prefBMEnable", false);
        }
        registerReceiver(this.a0, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (i51.b("prefBMEnable").booleanValue()) {
            new bf(this, 1).executeOnExecutor(MainApp.h, new Void[0]);
        }
    }
}
