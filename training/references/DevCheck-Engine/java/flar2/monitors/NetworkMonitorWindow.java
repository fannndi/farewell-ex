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
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
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
public class NetworkMonitorWindow extends oq1 {
    public static final /* synthetic */ int G = 0;
    public int A;
    public int B;
    public int C;
    public w5 D;
    public Handler E;
    public tf o;
    public SharedPreferences p;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public View x;
    public int y;
    public int z;
    public long q = 0;
    public long r = 0;
    public long s = 0;
    public final wa F = new wa(16, this);

    @Override // defpackage.oq1
    public final void e(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.netmon_layout, (ViewGroup) frameLayout, true);
        this.y = 16;
        if (getResources().getBoolean(R.bool.isTablet)) {
            this.y = 20;
        }
        this.C = getResources().getDimensionPixelOffset(R.dimen.statusbar_padding_bottom);
        this.B = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_3dp);
        this.A = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_6dp);
        this.z = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_1dp);
        TextView textView = (TextView) inflate.findViewById(R.id.rx_value);
        this.u = textView;
        int i = this.y;
        SharedPreferences sharedPreferences = zx0.f1292a;
        textView.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", i));
        TextView textView2 = (TextView) inflate.findViewById(R.id.tx_value);
        this.t = textView2;
        textView2.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.y));
        TextView textView3 = (TextView) inflate.findViewById(R.id.net_test1);
        this.v = textView3;
        textView3.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.y));
        TextView textView4 = (TextView) inflate.findViewById(R.id.net_test2);
        this.w = textView4;
        textView4.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.y));
        View findViewById = inflate.findViewById(R.id.netmon_background);
        this.x = findViewById;
        findViewById.getBackground().setAlpha(sharedPreferences.getInt("prefMonitorAlpha", 44));
        this.D = new w5(15, this);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("flar2.devcheck.ACTION_MONITOR_TOGGLE");
        intentFilter.setPriority(999);
        int i2 = Build.VERSION.SDK_INT;
        w5 w5Var = this.D;
        if (i2 >= 33) {
            registerReceiver(w5Var, intentFilter, 4);
        } else {
            registerReceiver(w5Var, intentFilter);
        }
        Handler handler = new Handler();
        this.E = handler;
        handler.post(this.F);
        y();
        this.o = new tf(this, 6);
        SharedPreferences sharedPreferences2 = d10.n().getSharedPreferences("monitors", 0);
        this.p = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this.o);
        this.x.setOnSystemUiVisibilityChangeListener(new uf(this, 5));
    }

    @Override // defpackage.oq1
    public final String g() {
        return "NetworkMonitor";
    }

    @Override // defpackage.oq1
    public final int j() {
        return rt0.q | rt0.x;
    }

    @Override // defpackage.oq1
    public final nq1 l(int i) {
        if (zx0.b("prefMonitorClickThru").booleanValue()) {
            SharedPreferences sharedPreferences = zx0.f1292a;
            return new nq1(this, i, true, sharedPreferences.getInt("prefNetMonPosX", Integer.MAX_VALUE), sharedPreferences.getInt("prefNetMonPosY", 360));
        }
        SharedPreferences sharedPreferences2 = zx0.f1292a;
        return new nq1(this, i, false, sharedPreferences2.getInt("prefNetMonPosX", Integer.MAX_VALUE), sharedPreferences2.getInt("prefNetMonPosY", 360));
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                zx0.a(this.x);
            } else if (i != 2) {
                zx0.a(this.x);
            } else if (zx0.b("prefMonitorLandscape").booleanValue()) {
                this.x.setTranslationY(-8000.0f);
            }
        } catch (NullPointerException unused) {
        }
    }

    @Override // defpackage.oq1
    public final void q() {
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacks(this.F);
        }
        try {
            w5 w5Var = this.D;
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
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).x, "prefNetMonPosX");
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).y, "prefNetMonPosY");
        }
        if (motionEvent.getAction() == 2) {
            zx0.c("prefNetStatusBar", zx0.b("prefSnapStatusBar").booleanValue() && ((WindowManager.LayoutParams) z92Var.getLayoutParams()).y <= 0);
        }
    }

    public final void y() {
        boolean booleanValue = zx0.b("prefNetStatusBar").booleanValue();
        View view = this.x;
        if (booleanValue) {
            view.getBackground().setAlpha(0);
            int U = uz1.U();
            TextView textView = this.u;
            if (U <= 22) {
                textView.setTextSize(6.0f);
                this.t.setTextSize(6.0f);
            } else {
                textView.setTextSize(8.0f);
                this.t.setTextSize(8.0f);
            }
            View view2 = this.x;
            if (U > 32) {
                int i = this.B;
                view2.setPadding(i, U - 5, i, this.C);
            } else {
                int i2 = this.B;
                if (U >= 28) {
                    view2.setPadding(i2, i2, i2, this.C);
                } else {
                    view2.setPadding(i2, this.z, i2, this.C);
                }
            }
            this.v.setVisibility(8);
            this.w.setVisibility(8);
        } else {
            view.getBackground().setAlpha(zx0.f1292a.getInt("prefMonitorAlpha", 44));
            View view3 = this.x;
            int i3 = this.A;
            view3.setPadding(i3, this.B, i3, i3);
            this.u.setTextSize(r2.getInt("prefMonitorTextSize", this.y));
            this.t.setTextSize(r2.getInt("prefMonitorTextSize", this.y));
            this.v.setVisibility(0);
            this.v.setTextSize(r2.getInt("prefMonitorTextSize", this.y));
            this.w.setVisibility(0);
            this.w.setTextSize(r2.getInt("prefMonitorTextSize", this.y));
        }
        boolean booleanValue2 = zx0.b("prefNetStatusBar").booleanValue();
        String str = yFbVsaLCWAtQC.mOb;
        if (booleanValue2) {
            this.u.setTextColor(-7829368);
            this.t.setTextColor(-7829368);
        } else {
            boolean booleanValue3 = zx0.b(str).booleanValue();
            TextView textView2 = this.u;
            if (booleanValue3) {
                textView2.setTextColor(-16777216);
                this.t.setTextColor(-16777216);
            } else {
                textView2.setTextColor(-1);
                this.t.setTextColor(-1);
            }
        }
        if (!zx0.b(gXdyRQCGVlHW.Ypi).booleanValue()) {
            this.u.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.t.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            return;
        }
        boolean booleanValue4 = zx0.b(str).booleanValue();
        TextView textView3 = this.u;
        if (booleanValue4) {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.t.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
        } else {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
            this.t.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        }
    }
}
