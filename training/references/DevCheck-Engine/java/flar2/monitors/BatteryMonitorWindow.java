package flar2.devcheck.monitors;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import defpackage.d10;
import defpackage.nq1;
import defpackage.oq1;
import defpackage.rt0;
import defpackage.tf;
import defpackage.uf;
import defpackage.uz1;
import defpackage.vf;
import defpackage.z92;
import defpackage.zx0;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class BatteryMonitorWindow extends oq1 {
    public static final /* synthetic */ int D = 0;
    public int A;
    public vf B;
    public final vf C = new vf(this, 0);
    public tf o;
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

    @Override // defpackage.oq1
    public final void e(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.battmon_layout, (ViewGroup) frameLayout, true);
        this.v = 16;
        if (getResources().getBoolean(R.bool.isTablet)) {
            this.v = 20;
        }
        this.A = getResources().getDimensionPixelOffset(R.dimen.statusbar_padding_bottom);
        this.x = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_3dp);
        this.w = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_6dp);
        this.y = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_5dp);
        this.z = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_2dp);
        TextView textView = (TextView) inflate.findViewById(R.id.batt_level);
        this.q = textView;
        int i = this.v;
        SharedPreferences sharedPreferences = zx0.f1292a;
        textView.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", i));
        TextView textView2 = (TextView) inflate.findViewById(R.id.batt_temp);
        this.r = textView2;
        textView2.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.v));
        TextView textView3 = (TextView) inflate.findViewById(R.id.batt_test1);
        this.s = textView3;
        textView3.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.v));
        TextView textView4 = (TextView) inflate.findViewById(R.id.batt_test2);
        this.t = textView4;
        textView4.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.v));
        View findViewById = inflate.findViewById(R.id.battmon_background);
        this.u = findViewById;
        findViewById.getBackground().setAlpha(sharedPreferences.getInt("prefMonitorAlpha", 44));
        try {
            try {
                this.B = new vf(this, 1);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("flar2.devcheck.ACTION_MONITOR_TOGGLE");
                intentFilter.setPriority(999);
                int i2 = Build.VERSION.SDK_INT;
                vf vfVar = this.B;
                if (i2 >= 33) {
                    registerReceiver(vfVar, intentFilter, 4);
                } else {
                    registerReceiver(vfVar, intentFilter);
                }
            } catch (IllegalArgumentException unused) {
                this.B = new vf(this, 1);
                IntentFilter intentFilter2 = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter2.addAction("android.intent.action.SCREEN_OFF");
                intentFilter2.addAction("flar2.devcheck.ACTION_MONITOR_TOGGLE");
                intentFilter2.setPriority(999);
                int i3 = Build.VERSION.SDK_INT;
                vf vfVar2 = this.B;
                if (i3 >= 33) {
                    registerReceiver(vfVar2, intentFilter2, 4);
                } else {
                    registerReceiver(vfVar2, intentFilter2);
                }
            }
        } catch (Exception unused2) {
        }
        getApplicationContext().registerReceiver(this.C, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        y();
        this.o = new tf(this, 0);
        SharedPreferences sharedPreferences2 = d10.n().getSharedPreferences("monitors", 0);
        this.p = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this.o);
        this.u.setOnSystemUiVisibilityChangeListener(new uf(this, 0));
    }

    @Override // defpackage.oq1
    public final String g() {
        return "BatteryMonitor";
    }

    @Override // defpackage.oq1
    public final int j() {
        return rt0.q | rt0.x;
    }

    @Override // defpackage.oq1
    public final nq1 l(int i) {
        if (zx0.b("prefMonitorClickThru").booleanValue()) {
            SharedPreferences sharedPreferences = zx0.f1292a;
            return new nq1(this, i, true, sharedPreferences.getInt("prefBattMonPosX", 0), sharedPreferences.getInt("prefBattMonPosY", 600));
        }
        SharedPreferences sharedPreferences2 = zx0.f1292a;
        return new nq1(this, i, false, sharedPreferences2.getInt("prefBattMonPosX", 0), sharedPreferences2.getInt("prefBattMonPosY", 600));
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
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.oq1
    public final void q() {
        vf vfVar = this.C;
        if (vfVar != null) {
            try {
                getApplicationContext().unregisterReceiver(vfVar);
            } catch (IllegalArgumentException unused) {
            }
        }
        try {
            vf vfVar2 = this.B;
            if (vfVar2 != null) {
                unregisterReceiver(vfVar2);
            }
        } catch (IllegalArgumentException unused2) {
        }
        try {
            tf tfVar = this.o;
            if (tfVar != null) {
                this.p.unregisterOnSharedPreferenceChangeListener(tfVar);
            }
        } catch (IllegalArgumentException unused3) {
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                stopSelf();
            } else {
                stopSelf();
            }
        } catch (Exception unused4) {
        }
    }

    @Override // defpackage.oq1
    public final void r(z92 z92Var, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).x, "prefBattMonPosX");
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).y, "prefBattMonPosY");
        }
        if (motionEvent.getAction() == 2) {
            zx0.c("prefBattStatusBar", zx0.b("prefSnapStatusBar").booleanValue() && ((WindowManager.LayoutParams) z92Var.getLayoutParams()).y <= 2);
        }
    }

    public final void y() {
        boolean booleanValue = zx0.b("prefBattStatusBar").booleanValue();
        View view = this.u;
        if (booleanValue) {
            view.getBackground().setAlpha(0);
            int U = uz1.U();
            if (U < 24) {
                View view2 = this.u;
                int i = this.x;
                view2.setPadding(i, this.z, i, this.A);
            } else if (U > 32) {
                View view3 = this.u;
                int i2 = this.x;
                view3.setPadding(i2, U - 5, i2, this.A);
            } else {
                View view4 = this.u;
                if (U > 28) {
                    int i3 = this.x;
                    view4.setPadding(i3, this.w, i3, this.A);
                } else {
                    int i4 = this.x;
                    if (U > 25) {
                        view4.setPadding(i4, this.y, i4, this.A);
                    } else {
                        view4.setPadding(i4, i4, i4, this.A);
                    }
                }
            }
            TextView textView = this.q;
            if (U < 24) {
                textView.setTextSize(12.0f);
            } else {
                textView.setTextSize(14.0f);
            }
            this.r.setVisibility(8);
            this.s.setVisibility(8);
            this.t.setVisibility(8);
        } else {
            view.getBackground().setAlpha(zx0.f1292a.getInt("prefMonitorAlpha", 44));
            View view5 = this.u;
            int i5 = this.w;
            view5.setPadding(i5, this.x, i5, i5);
            TextView textView2 = this.q;
            int i6 = this.v;
            String str = UQdsoaJMID.uZUJU;
            textView2.setTextSize(r1.getInt(str, i6));
            this.r.setVisibility(0);
            this.r.setTextSize(r1.getInt(str, this.v));
            this.s.setVisibility(0);
            this.s.setTextSize(r1.getInt(str, this.v));
            this.t.setVisibility(0);
            this.t.setTextSize(r1.getInt(str, this.v));
        }
        boolean booleanValue2 = zx0.b("prefMonitorDarkText").booleanValue();
        TextView textView3 = this.q;
        if (booleanValue2) {
            textView3.setTextColor(-16777216);
            this.r.setTextColor(-16777216);
        } else {
            textView3.setTextColor(-1);
            this.r.setTextColor(-1);
        }
        if (!zx0.b("prefMonitorShadow").booleanValue()) {
            this.q.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.r.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            return;
        }
        boolean booleanValue3 = zx0.b("prefMonitorDarkText").booleanValue();
        TextView textView4 = this.q;
        if (booleanValue3) {
            textView4.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.r.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
        } else {
            textView4.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
            this.r.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        }
    }
}
