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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media.RfwE.BIxeFreLLop;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import defpackage.d10;
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
public class CPUMonitorWindow extends oq1 {
    public static final /* synthetic */ int U = 0;
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public w5 R;
    public Handler S;
    public final wa T = new wa(2, this);
    public tf o;
    public SharedPreferences p;
    public View q;
    public View r;
    public View s;
    public LinearLayout t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    public TextView z;

    @Override // defpackage.oq1
    public final void e(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.cpumon_layout, (ViewGroup) frameLayout, true);
        this.K = uz1.k0();
        this.L = 16;
        if (getResources().getBoolean(R.bool.isTablet)) {
            this.L = 20;
        }
        int U2 = uz1.U();
        if (U2 < 22) {
            this.M = 3;
        } else if (U2 >= 28) {
            this.M = 5;
        } else {
            this.M = 4;
        }
        if (uz1.k0() < 3) {
            this.M = 8;
        }
        this.Q = getResources().getDimensionPixelOffset(R.dimen.statusbar_padding_bottom);
        this.P = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_3dp);
        this.O = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_6dp);
        this.N = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_1dp);
        TextView textView = (TextView) inflate.findViewById(R.id.cpu0_freq);
        this.u = textView;
        int i = this.L;
        SharedPreferences sharedPreferences = zx0.f1292a;
        textView.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", i));
        TextView textView2 = (TextView) inflate.findViewById(R.id.cpu1_freq);
        this.v = textView2;
        textView2.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView3 = (TextView) inflate.findViewById(R.id.cpu2_freq);
        this.w = textView3;
        textView3.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView4 = (TextView) inflate.findViewById(R.id.cpu3_freq);
        this.x = textView4;
        textView4.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView5 = (TextView) inflate.findViewById(R.id.cpu4_freq);
        this.y = textView5;
        textView5.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView6 = (TextView) inflate.findViewById(R.id.cpu5_freq);
        this.z = textView6;
        textView6.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView7 = (TextView) inflate.findViewById(R.id.cpu6_freq);
        this.A = textView7;
        textView7.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView8 = (TextView) inflate.findViewById(R.id.cpu7_freq);
        this.B = textView8;
        textView8.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView9 = (TextView) inflate.findViewById(R.id.cpu8_freq);
        this.C = textView9;
        textView9.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView10 = (TextView) inflate.findViewById(R.id.cpu9_freq);
        this.D = textView10;
        textView10.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView11 = (TextView) inflate.findViewById(R.id.cpu10_freq);
        this.E = textView11;
        textView11.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView12 = (TextView) inflate.findViewById(R.id.cpu11_freq);
        this.F = textView12;
        textView12.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView13 = (TextView) inflate.findViewById(R.id.cpu_test1);
        this.G = textView13;
        textView13.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView14 = (TextView) inflate.findViewById(R.id.cpu_test2);
        this.H = textView14;
        textView14.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView15 = (TextView) inflate.findViewById(R.id.cpu_test8);
        this.I = textView15;
        textView15.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        TextView textView16 = (TextView) inflate.findViewById(R.id.cpu_test10);
        this.J = textView16;
        textView16.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.L));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.cpumon_background);
        this.t = linearLayout;
        linearLayout.getBackground().setAlpha(sharedPreferences.getInt("prefMonitorAlpha", 44));
        this.q = inflate.findViewById(R.id.cpumon_background2);
        this.r = inflate.findViewById(R.id.cpumon_background3);
        this.s = inflate.findViewById(R.id.cpumon_background4);
        this.R = new w5(7, this);
        IntentFilter intentFilter = new IntentFilter(IGQCApxXGMWo.HacMt);
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("flar2.devcheck.ACTION_MONITOR_TOGGLE");
        int i2 = Build.VERSION.SDK_INT;
        w5 w5Var = this.R;
        if (i2 >= 33) {
            registerReceiver(w5Var, intentFilter, 4);
        } else {
            registerReceiver(w5Var, intentFilter);
        }
        Handler handler = new Handler();
        this.S = handler;
        handler.post(this.T);
        y();
        this.o = new tf(this, 1);
        SharedPreferences sharedPreferences2 = d10.n().getSharedPreferences("monitors", 0);
        this.p = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this.o);
        this.t.setOnSystemUiVisibilityChangeListener(new uf(this, 1));
    }

    @Override // defpackage.oq1
    public final String g() {
        return "CPUMonitor";
    }

    @Override // defpackage.oq1
    public final int j() {
        return rt0.q | rt0.x;
    }

    @Override // defpackage.oq1
    public final nq1 l(int i) {
        if (zx0.b("prefMonitorClickThru").booleanValue()) {
            SharedPreferences sharedPreferences = zx0.f1292a;
            return new nq1(this, i, true, sharedPreferences.getInt("prefCPUMonPosX", 0), sharedPreferences.getInt("prefCPUMonPosY", 720));
        }
        SharedPreferences sharedPreferences2 = zx0.f1292a;
        return new nq1(this, i, false, sharedPreferences2.getInt("prefCPUMonPosX", 0), sharedPreferences2.getInt("prefCPUMonPosY", 720));
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                zx0.a(this.t);
            } else if (i != 2) {
                zx0.a(this.t);
            } else if (zx0.b("prefMonitorLandscape").booleanValue()) {
                this.t.setTranslationY(-8000.0f);
            }
        } catch (NullPointerException unused) {
        }
    }

    @Override // defpackage.oq1
    public final void q() {
        Handler handler = this.S;
        if (handler != null) {
            handler.removeCallbacks(this.T);
        }
        try {
            w5 w5Var = this.R;
            if (w5Var != null) {
                unregisterReceiver(w5Var);
            }
        } catch (IllegalArgumentException unused) {
        }
        tf tfVar = this.o;
        if (tfVar != null) {
            this.p.unregisterOnSharedPreferenceChangeListener(tfVar);
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
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).x, "prefCPUMonPosX");
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).y, BIxeFreLLop.UMszhGyY);
        }
        if (motionEvent.getAction() == 2) {
            zx0.c("prefCPUStatusBar", zx0.b("prefSnapStatusBar").booleanValue() && ((WindowManager.LayoutParams) z92Var.getLayoutParams()).y <= 0);
        }
    }

    public final void y() {
        if (zx0.b("prefCPUStatusBar").booleanValue()) {
            int i = this.N;
            if (uz1.U() > 32) {
                i = this.P;
            }
            this.t.getBackground().setAlpha(0);
            LinearLayout linearLayout = this.t;
            int i2 = this.P;
            linearLayout.setPadding(i2, i, i2, this.Q);
            this.t.setOrientation(0);
            int k0 = uz1.k0();
            View view = this.q;
            if (k0 > 4) {
                view.setPadding(this.P, 0, 0, 0);
            } else {
                view.setVisibility(8);
            }
            int k02 = uz1.k0();
            View view2 = this.r;
            if (k02 > 8) {
                view2.setPadding(this.P, 0, 0, 0);
            } else {
                view2.setVisibility(8);
            }
            int k03 = uz1.k0();
            View view3 = this.s;
            if (k03 > 10) {
                view3.setPadding(this.P, 0, 0, 0);
            } else {
                view3.setVisibility(8);
            }
            this.u.setTextSize(this.M);
            this.v.setTextSize(this.M);
            this.w.setTextSize(this.M);
            this.x.setTextSize(this.M);
            this.y.setTextSize(this.M);
            this.z.setTextSize(this.M);
            this.A.setTextSize(this.M);
            this.B.setTextSize(this.M);
            this.C.setTextSize(this.M);
            this.D.setTextSize(this.M);
            this.E.setTextSize(this.M);
            this.F.setTextSize(this.M);
            this.G.setTextSize(this.M);
            this.H.setTextSize(this.M);
            this.I.setTextSize(this.M);
            this.J.setTextSize(this.M);
        } else {
            this.t.getBackground().setAlpha(zx0.f1292a.getInt("prefMonitorAlpha", 44));
            LinearLayout linearLayout2 = this.t;
            int i3 = this.O;
            linearLayout2.setPadding(i3, this.P, i3, i3);
            this.t.setOrientation(1);
            int k04 = uz1.k0();
            View view4 = this.q;
            if (k04 > 4) {
                view4.setPadding(0, this.P, 0, 0);
            } else {
                view4.setVisibility(8);
            }
            int k05 = uz1.k0();
            View view5 = this.r;
            if (k05 > 8) {
                view5.setPadding(0, this.P, 0, 0);
            } else {
                view5.setVisibility(8);
            }
            int k06 = uz1.k0();
            View view6 = this.s;
            if (k06 > 10) {
                view6.setPadding(0, this.P, 0, 0);
            } else {
                view6.setVisibility(8);
            }
            this.u.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.v.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.w.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.x.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.y.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.z.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.A.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.B.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.C.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.D.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.E.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.F.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.G.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.H.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.I.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
            this.J.setTextSize(r6.getInt("prefMonitorTextSize", this.L));
        }
        if (zx0.b("prefCPUStatusBar").booleanValue()) {
            this.u.setTextColor(-7829368);
            this.v.setTextColor(-7829368);
            this.w.setTextColor(-7829368);
            this.x.setTextColor(-7829368);
            this.y.setTextColor(-7829368);
            this.z.setTextColor(-7829368);
            this.A.setTextColor(-7829368);
            this.B.setTextColor(-7829368);
            this.C.setTextColor(-7829368);
            this.D.setTextColor(-7829368);
            this.E.setTextColor(-7829368);
            this.F.setTextColor(-7829368);
        } else {
            boolean booleanValue = zx0.b("prefMonitorDarkText").booleanValue();
            TextView textView = this.u;
            if (booleanValue) {
                textView.setTextColor(-16777216);
                this.v.setTextColor(-16777216);
                this.w.setTextColor(-16777216);
                this.x.setTextColor(-16777216);
                this.y.setTextColor(-16777216);
                this.z.setTextColor(-16777216);
                this.A.setTextColor(-16777216);
                this.B.setTextColor(-16777216);
                this.C.setTextColor(-16777216);
                this.D.setTextColor(-16777216);
                this.E.setTextColor(-16777216);
                this.F.setTextColor(-16777216);
            } else {
                textView.setTextColor(-1);
                this.v.setTextColor(-1);
                this.w.setTextColor(-1);
                this.x.setTextColor(-1);
                this.y.setTextColor(-1);
                this.z.setTextColor(-1);
                this.A.setTextColor(-1);
                this.B.setTextColor(-1);
                this.C.setTextColor(-1);
                this.D.setTextColor(-1);
                this.E.setTextColor(-1);
                this.F.setTextColor(-1);
            }
        }
        if (!zx0.b("prefMonitorShadow").booleanValue()) {
            this.u.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.v.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.w.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.x.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.y.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.z.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.A.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.B.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.C.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.D.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.E.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.F.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            return;
        }
        boolean booleanValue2 = zx0.b("prefMonitorDarkText").booleanValue();
        TextView textView2 = this.u;
        if (booleanValue2) {
            textView2.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.v.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.w.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.x.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.y.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.z.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.A.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.B.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.C.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.D.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.E.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.F.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            return;
        }
        textView2.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.v.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.w.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.x.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.y.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.z.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.A.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.B.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.C.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.D.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.E.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        this.F.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
    }
}
