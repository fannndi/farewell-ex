package flar2.devcheck.monitors;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.d10;
import defpackage.j21;
import defpackage.nq1;
import defpackage.oq1;
import defpackage.rt0;
import defpackage.tf;
import defpackage.uf;
import defpackage.uz1;
import defpackage.w5;
import defpackage.wa;
import defpackage.z92;
import defpackage.zx0;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class SignalMonitorWindow extends oq1 {
    public static int D;
    public static int E;
    public int A;
    public int B;
    public w5 C;
    public tf o;
    public SharedPreferences p;
    public j21 q;
    public TelephonyManager r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public View w;
    public int x;
    public int y;
    public int z;

    public SignalMonitorWindow() {
        new wa(21, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        if (r0 > 75) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y(flar2.devcheck.monitors.SignalMonitorWindow r12) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.monitors.SignalMonitorWindow.y(flar2.devcheck.monitors.SignalMonitorWindow):void");
    }

    @Override // defpackage.oq1
    public final void e(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.signalmon_layout, (ViewGroup) frameLayout, true);
        this.x = 16;
        if (getResources().getBoolean(R.bool.isTablet)) {
            this.x = 20;
        }
        this.B = getResources().getDimensionPixelOffset(R.dimen.statusbar_padding_bottom);
        this.A = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_3dp);
        this.z = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_6dp);
        this.y = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_1dp);
        TextView textView = (TextView) inflate.findViewById(R.id.dbm_value);
        this.t = textView;
        int i = this.x;
        SharedPreferences sharedPreferences = zx0.f1292a;
        textView.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", i));
        TextView textView2 = (TextView) inflate.findViewById(R.id.percent_value);
        this.s = textView2;
        textView2.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.x));
        TextView textView3 = (TextView) inflate.findViewById(R.id.signal_test1);
        this.u = textView3;
        textView3.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.x));
        TextView textView4 = (TextView) inflate.findViewById(R.id.signal_test2);
        this.v = textView4;
        textView4.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.x));
        View findViewById = inflate.findViewById(R.id.signalmon_background);
        this.w = findViewById;
        findViewById.getBackground().setAlpha(sharedPreferences.getInt("prefMonitorAlpha", 44));
        this.C = new w5(17, this);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("flar2.devcheck.ACTION_MONITOR_TOGGLE");
        intentFilter.setPriority(999);
        int i2 = Build.VERSION.SDK_INT;
        w5 w5Var = this.C;
        if (i2 >= 33) {
            registerReceiver(w5Var, intentFilter, 4);
        } else {
            registerReceiver(w5Var, intentFilter);
        }
        z();
        D = 0;
        this.q = new j21(2, this);
        TelephonyManager telephonyManager = (TelephonyManager) getApplicationContext().getSystemService("phone");
        this.r = telephonyManager;
        if (telephonyManager != null) {
            telephonyManager.listen(this.q, rt0.t);
        }
        this.o = new tf(this, 8);
        SharedPreferences sharedPreferences2 = d10.n().getSharedPreferences("monitors", 0);
        this.p = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this.o);
        this.w.setOnSystemUiVisibilityChangeListener(new uf(this, 7));
    }

    @Override // defpackage.oq1
    public final String g() {
        return "SignalMonitor";
    }

    @Override // defpackage.oq1
    public final int j() {
        return rt0.q | rt0.x;
    }

    @Override // defpackage.oq1
    public final nq1 l(int i) {
        if (zx0.b("prefMonitorClickThru").booleanValue()) {
            SharedPreferences sharedPreferences = zx0.f1292a;
            return new nq1(this, i, true, sharedPreferences.getInt("prefSignalMonPosX", Integer.MAX_VALUE), sharedPreferences.getInt("prefSignalMonPosY", 556));
        }
        SharedPreferences sharedPreferences2 = zx0.f1292a;
        return new nq1(this, i, false, sharedPreferences2.getInt("prefSignalMonPosX", Integer.MAX_VALUE), sharedPreferences2.getInt("prefSignalMonPosY", 556));
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                zx0.a(this.w);
            } else if (i != 2) {
                zx0.a(this.w);
            } else if (zx0.b("prefMonitorLandscape").booleanValue()) {
                this.w.setTranslationY(-8000.0f);
            }
        } catch (NullPointerException unused) {
        }
    }

    @Override // defpackage.oq1
    public final void q() {
        try {
            w5 w5Var = this.C;
            if (w5Var != null) {
                unregisterReceiver(w5Var);
            }
        } catch (IllegalArgumentException unused) {
        }
        tf tfVar = this.o;
        if (tfVar != null) {
            this.p.unregisterOnSharedPreferenceChangeListener(tfVar);
        }
        TelephonyManager telephonyManager = this.r;
        if (telephonyManager != null) {
            telephonyManager.listen(this.q, 0);
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                stopSelf();
            } else {
                stopSelf();
            }
        } catch (Exception unused2) {
        }
    }

    @Override // defpackage.oq1
    public final void r(z92 z92Var, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).x, "prefSignalMonPosX");
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).y, "prefSignalMonPosY");
        }
        if (motionEvent.getAction() == 2) {
            zx0.c("prefSignalStatusBar", zx0.b("prefSnapStatusBar").booleanValue() && ((WindowManager.LayoutParams) z92Var.getLayoutParams()).y <= 0);
        }
    }

    public final void z() {
        boolean booleanValue = zx0.b("prefSignalStatusBar").booleanValue();
        View view = this.w;
        if (booleanValue) {
            view.getBackground().setAlpha(0);
            int U = uz1.U();
            TextView textView = this.t;
            if (U <= 22) {
                textView.setTextSize(6.0f);
                this.s.setTextSize(6.0f);
            } else {
                textView.setTextSize(8.0f);
                this.s.setTextSize(8.0f);
            }
            View view2 = this.w;
            if (U > 32) {
                int i = this.A;
                view2.setPadding(i, U - 5, i, this.B);
            } else {
                int i2 = this.A;
                if (U >= 28) {
                    view2.setPadding(i2, i2, i2, this.B);
                } else {
                    view2.setPadding(i2, this.y, i2, this.B);
                }
            }
            this.u.setVisibility(8);
            this.v.setVisibility(8);
        } else {
            view.getBackground().setAlpha(zx0.f1292a.getInt("prefMonitorAlpha", 44));
            View view3 = this.w;
            int i3 = this.z;
            view3.setPadding(i3, this.A, i3, i3);
            this.t.setTextSize(r2.getInt("prefMonitorTextSize", this.x));
            this.s.setTextSize(r2.getInt("prefMonitorTextSize", this.x));
            this.u.setVisibility(0);
            this.u.setTextSize(r2.getInt("prefMonitorTextSize", this.x));
            this.v.setVisibility(0);
            this.v.setTextSize(r2.getInt("prefMonitorTextSize", this.x));
        }
        if (zx0.b("prefSignalStatusBar").booleanValue()) {
            this.s.setTextColor(-7829368);
            this.t.setTextColor(-7829368);
        } else {
            boolean booleanValue2 = zx0.b("prefMonitorDarkText").booleanValue();
            TextView textView2 = this.t;
            if (booleanValue2) {
                textView2.setTextColor(-16777216);
                this.s.setTextColor(-16777216);
            } else {
                textView2.setTextColor(-1);
                this.s.setTextColor(-1);
            }
        }
        if (!zx0.b("prefMonitorShadow").booleanValue()) {
            this.t.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.s.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            return;
        }
        boolean booleanValue3 = zx0.b("prefMonitorDarkText").booleanValue();
        TextView textView3 = this.t;
        if (booleanValue3) {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.s.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
        } else {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
            this.s.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        }
    }
}
