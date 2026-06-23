package flar2.devcheck.monitors;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.d10;
import defpackage.et;
import defpackage.nq1;
import defpackage.nw1;
import defpackage.oq1;
import defpackage.ow1;
import defpackage.ps0;
import defpackage.q00;
import defpackage.r00;
import defpackage.rt0;
import defpackage.uz1;
import defpackage.wa;
import defpackage.z92;
import defpackage.zx0;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.monitors.TempMonitorWindow;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.List;

/* loaded from: classes.dex */
public class TempMonitorWindow extends oq1 {
    public static final /* synthetic */ int I = 0;
    public int A;
    public boolean B;
    public ow1 C;
    public q00 D;
    public q00 E;
    public Handler F;
    public final wa G = new wa(26, this);
    public final ow1 H = new ow1(this, 0);
    public nw1 o;
    public SharedPreferences p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public View u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public static void y(TempMonitorWindow tempMonitorWindow, int i) {
        tempMonitorWindow.q.setVisibility(8);
        int i2 = i / 10;
        try {
            boolean d = et.f248a.d("prefFahrenheit");
            TextView textView = tempMonitorWindow.r;
            if (!d) {
                textView.setText(i2 + "°C");
                return;
            }
            textView.setText(((int) ((i2 * 1.8d) + 32.0d)) + "°F");
        } catch (Exception unused) {
            tempMonitorWindow.r.setText(i2 + "°C");
        }
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [nw1] */
    @Override // defpackage.oq1
    public final void e(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.tempmon_layout, (ViewGroup) frameLayout, true);
        this.v = 16;
        if (getResources().getBoolean(R.bool.isTablet)) {
            this.v = 20;
        }
        this.y = getResources().getDimensionPixelOffset(R.dimen.statusbar_padding_bottom);
        this.x = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_3dp);
        this.w = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_6dp);
        this.z = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_5dp);
        this.A = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_2dp);
        TextView textView = (TextView) inflate.findViewById(R.id.sys_temp);
        this.q = textView;
        int i = this.v;
        SharedPreferences sharedPreferences = zx0.f1292a;
        String str = oWuW.hfzoiL;
        textView.setTextSize(sharedPreferences.getInt(str, i));
        TextView textView2 = (TextView) inflate.findViewById(R.id.cpu_temp);
        this.r = textView2;
        textView2.setTextSize(sharedPreferences.getInt(str, this.v));
        TextView textView3 = (TextView) inflate.findViewById(R.id.temp_test1);
        this.s = textView3;
        textView3.setTextSize(sharedPreferences.getInt(str, this.v));
        TextView textView4 = (TextView) inflate.findViewById(R.id.temp_test2);
        this.t = textView4;
        textView4.setTextSize(sharedPreferences.getInt(str, this.v));
        View findViewById = inflate.findViewById(R.id.tempmon_background);
        this.u = findViewById;
        findViewById.getBackground().setAlpha(sharedPreferences.getInt("prefMonitorAlpha", 44));
        this.C = new ow1(this, 1);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("flar2.devcheck.ACTION_MONITOR_TOGGLE");
        intentFilter.setPriority(999);
        int i2 = Build.VERSION.SDK_INT;
        ow1 ow1Var = this.C;
        if (i2 >= 33) {
            registerReceiver(ow1Var, intentFilter, 4);
        } else {
            registerReceiver(ow1Var, intentFilter);
        }
        this.F = new Handler();
        z();
        try {
            List a2 = r00.a(getApplicationContext());
            if (a2 != null && !a2.isEmpty()) {
                this.D = (q00) a2.get(0);
                if (a2.size() > 1) {
                    this.E = (q00) a2.get(1);
                }
            }
        } catch (Exception unused) {
        }
        try {
            if (this.D == null && uz1.Y(uz1.Z(et.b("prefCPUTemp")).trim()).contains("NA")) {
                this.B = true;
            }
        } catch (Exception unused2) {
            this.B = true;
        }
        if (this.B) {
            getApplicationContext().registerReceiver(this.H, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } else {
            this.F.post(this.G);
        }
        this.o = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: nw1
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str2) {
                int i3 = TempMonitorWindow.I;
                TempMonitorWindow.this.z();
            }
        };
        SharedPreferences sharedPreferences2 = d10.n().getSharedPreferences(hTYJVDOvZnZlYL.lTYztSxO, 0);
        this.p = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this.o);
        this.u.setOnSystemUiVisibilityChangeListener(new ps0(this, 1));
    }

    @Override // defpackage.oq1
    public final String g() {
        return "TempMonitor";
    }

    @Override // defpackage.oq1
    public final int j() {
        return rt0.q | rt0.x;
    }

    @Override // defpackage.oq1
    public final nq1 l(int i) {
        if (zx0.b(CGvJMCDBOmCdj.jxgYe).booleanValue()) {
            SharedPreferences sharedPreferences = zx0.f1292a;
            return new nq1(this, i, true, sharedPreferences.getInt("prefTempMonPosX", 0), sharedPreferences.getInt("prefTempMonPosY", 360));
        }
        SharedPreferences sharedPreferences2 = zx0.f1292a;
        return new nq1(this, i, false, sharedPreferences2.getInt("prefTempMonPosX", 0), sharedPreferences2.getInt("prefTempMonPosY", 360));
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                zx0.a(this.u);
            } else if (i != 2) {
                zx0.a(this.u);
            } else if (zx0.b("prefMonitorLandscape").booleanValue()) {
                this.u.setTranslationY(-8000.0f);
            }
        } catch (NullPointerException unused) {
        }
    }

    @Override // defpackage.oq1
    public final void q() {
        try {
            getApplicationContext().unregisterReceiver(this.H);
        } catch (Exception unused) {
        }
        try {
            Handler handler = this.F;
            if (handler != null) {
                handler.removeCallbacks(this.G);
            }
        } catch (Exception unused2) {
        }
        try {
            ow1 ow1Var = this.C;
            if (ow1Var != null) {
                unregisterReceiver(ow1Var);
            }
        } catch (Exception unused3) {
        }
        try {
            nw1 nw1Var = this.o;
            if (nw1Var != null) {
                this.p.unregisterOnSharedPreferenceChangeListener(nw1Var);
            }
        } catch (Exception unused4) {
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                stopSelf();
            } else {
                stopSelf();
            }
        } catch (Exception unused5) {
        }
    }

    @Override // defpackage.oq1
    public final void r(z92 z92Var, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).x, "prefTempMonPosX");
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).y, "prefTempMonPosY");
        }
        if (motionEvent.getAction() == 2) {
            zx0.c(hTYJVDOvZnZlYL.qCsdqwZLWQA, zx0.b("prefSnapStatusBar").booleanValue() && ((WindowManager.LayoutParams) z92Var.getLayoutParams()).y <= 2);
        }
    }

    public final void z() {
        boolean booleanValue = zx0.b("prefTempStatusBar").booleanValue();
        View view = this.u;
        if (booleanValue) {
            view.getBackground().setAlpha(0);
            int U = uz1.U();
            if (U < 24) {
                View view2 = this.u;
                int i = this.x;
                view2.setPadding(i, this.A, i, this.y);
            } else if (U > 32) {
                View view3 = this.u;
                int i2 = this.x;
                view3.setPadding(i2, U - 5, i2, this.y);
            } else {
                View view4 = this.u;
                if (U > 28) {
                    int i3 = this.x;
                    view4.setPadding(i3, this.w, i3, this.y);
                } else {
                    int i4 = this.x;
                    if (U > 25) {
                        view4.setPadding(i4, this.z, i4, this.y);
                    } else {
                        view4.setPadding(i4, i4, i4, this.y);
                    }
                }
            }
            TextView textView = this.r;
            if (U < 24) {
                textView.setTextSize(12.0f);
            } else {
                textView.setTextSize(14.0f);
            }
            this.q.setVisibility(8);
            this.s.setVisibility(8);
            this.t.setVisibility(8);
        } else {
            view.getBackground().setAlpha(zx0.f1292a.getInt("prefMonitorAlpha", 44));
            View view5 = this.u;
            int i5 = this.w;
            view5.setPadding(i5, this.x, i5, i5);
            this.r.setTextSize(r2.getInt("prefMonitorTextSize", this.v));
            this.q.setVisibility(0);
            this.q.setTextSize(r2.getInt("prefMonitorTextSize", this.v));
            this.s.setVisibility(0);
            this.s.setTextSize(r2.getInt("prefMonitorTextSize", this.v));
            this.t.setVisibility(0);
            this.t.setTextSize(r2.getInt("prefMonitorTextSize", this.v));
        }
        if (zx0.b("prefTempStatusBar").booleanValue()) {
            this.r.setTextColor(-7829368);
        } else {
            boolean booleanValue2 = zx0.b("prefMonitorDarkText").booleanValue();
            TextView textView2 = this.r;
            if (booleanValue2) {
                textView2.setTextColor(-16777216);
                this.q.setTextColor(-16777216);
            } else {
                textView2.setTextColor(-1);
                this.q.setTextColor(-1);
            }
        }
        if (!zx0.b("prefMonitorShadow").booleanValue()) {
            this.r.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.q.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            return;
        }
        boolean booleanValue3 = zx0.b("prefMonitorDarkText").booleanValue();
        TextView textView3 = this.r;
        if (booleanValue3) {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.q.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
        } else {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
            this.q.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        }
    }
}
