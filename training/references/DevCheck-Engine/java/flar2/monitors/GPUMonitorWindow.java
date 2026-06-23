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
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
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
public class GPUMonitorWindow extends oq1 {
    public static final /* synthetic */ int E = 0;
    public int A;
    public w5 B;
    public Handler C;
    public final wa D = new wa(13, this);
    public tf o;
    public SharedPreferences p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public View u;
    public LinearLayout v;
    public int w;
    public int x;
    public int y;
    public int z;

    @Override // defpackage.oq1
    public final void e(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.gpumon_layout, (ViewGroup) frameLayout, true);
        this.w = 16;
        if (getResources().getBoolean(R.bool.isTablet)) {
            this.w = 20;
        }
        this.A = getResources().getDimensionPixelOffset(R.dimen.statusbar_padding_bottom);
        this.z = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_3dp);
        this.y = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_6dp);
        this.x = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_1dp);
        TextView textView = (TextView) inflate.findViewById(R.id.gpu_freq);
        this.q = textView;
        int i = this.w;
        SharedPreferences sharedPreferences = zx0.f1292a;
        textView.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", i));
        TextView textView2 = (TextView) inflate.findViewById(R.id.gpu_label);
        this.r = textView2;
        textView2.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.w));
        TextView textView3 = (TextView) inflate.findViewById(R.id.gpu_test1);
        this.s = textView3;
        textView3.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.w));
        TextView textView4 = (TextView) inflate.findViewById(R.id.gpu_test2);
        this.t = textView4;
        textView4.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.w));
        View findViewById = inflate.findViewById(R.id.gpumon_background);
        this.u = findViewById;
        findViewById.getBackground().setAlpha(sharedPreferences.getInt("prefMonitorAlpha", 44));
        this.v = (LinearLayout) inflate.findViewById(R.id.gpumon_container);
        try {
            try {
                this.B = new w5(12, this);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("flar2.devcheck.ACTION_MONITOR_TOGGLE");
                intentFilter.setPriority(999);
                int i2 = Build.VERSION.SDK_INT;
                w5 w5Var = this.B;
                if (i2 >= 33) {
                    registerReceiver(w5Var, intentFilter, 4);
                } else {
                    registerReceiver(w5Var, intentFilter);
                }
            } catch (IllegalArgumentException unused) {
                this.B = new w5(12, this);
                IntentFilter intentFilter2 = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter2.addAction("android.intent.action.SCREEN_OFF");
                intentFilter2.setPriority(999);
                int i3 = Build.VERSION.SDK_INT;
                w5 w5Var2 = this.B;
                if (i3 >= 33) {
                    registerReceiver(w5Var2, intentFilter2, 4);
                } else {
                    registerReceiver(w5Var2, intentFilter2);
                }
            }
        } catch (Exception unused2) {
        }
        Handler handler = new Handler();
        this.C = handler;
        handler.post(this.D);
        y();
        this.o = new tf(this, 4);
        SharedPreferences sharedPreferences2 = d10.n().getSharedPreferences("monitors", 0);
        this.p = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this.o);
        this.u.setOnSystemUiVisibilityChangeListener(new uf(this, 4));
    }

    @Override // defpackage.oq1
    public final String g() {
        return "GPUMonitor";
    }

    @Override // defpackage.oq1
    public final int j() {
        return rt0.q | rt0.x;
    }

    @Override // defpackage.oq1
    public final nq1 l(int i) {
        if (zx0.b("prefMonitorClickThru").booleanValue()) {
            SharedPreferences sharedPreferences = zx0.f1292a;
            return new nq1(this, i, true, sharedPreferences.getInt("prefGPUMonPosX", 0), sharedPreferences.getInt("prefGPUMonPosY", 240));
        }
        SharedPreferences sharedPreferences2 = zx0.f1292a;
        return new nq1(this, i, false, sharedPreferences2.getInt("prefGPUMonPosX", 0), sharedPreferences2.getInt("prefGPUMonPosY", 240));
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
        Handler handler = this.C;
        if (handler != null) {
            handler.removeCallbacks(this.D);
        }
        try {
            w5 w5Var = this.B;
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
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).x, "prefGPUMonPosX");
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).y, "prefGPUMonPosY");
        }
        if (motionEvent.getAction() == 2) {
            zx0.c("prefGPUStatusBar", zx0.b("prefSnapStatusBar").booleanValue() && ((WindowManager.LayoutParams) z92Var.getLayoutParams()).y <= 0);
        }
    }

    public final void y() {
        boolean booleanValue = zx0.b("prefGPUStatusBar").booleanValue();
        View view = this.u;
        if (booleanValue) {
            view.getBackground().setAlpha(0);
            this.v.setOrientation(1);
            int U = uz1.U();
            TextView textView = this.q;
            if (U <= 22) {
                textView.setTextSize(6.0f);
                this.r.setTextSize(6.0f);
            } else {
                textView.setTextSize(8.0f);
                this.r.setTextSize(8.0f);
            }
            View view2 = this.u;
            if (U > 32) {
                int i = this.z;
                view2.setPadding(i, U - 5, i, this.A);
            } else {
                int i2 = this.z;
                if (U >= 28) {
                    view2.setPadding(i2, i2, i2, this.A);
                } else {
                    view2.setPadding(i2, this.x, i2, this.A);
                }
            }
            this.s.setVisibility(8);
            this.t.setVisibility(8);
        } else {
            view.getBackground().setAlpha(zx0.f1292a.getInt(nTAZxGMqQtZZAQ.FaNwN, 44));
            this.v.setOrientation(0);
            View view3 = this.u;
            int i3 = this.y;
            view3.setPadding(i3, this.z, i3, i3);
            this.q.setTextSize(r2.getInt("prefMonitorTextSize", this.w));
            this.r.setTextSize(r2.getInt("prefMonitorTextSize", this.w));
            this.s.setVisibility(0);
            this.s.setTextSize(r2.getInt("prefMonitorTextSize", this.w));
            this.t.setVisibility(0);
            this.t.setTextSize(r2.getInt("prefMonitorTextSize", this.w));
        }
        if (zx0.b("prefGPUStatusBar").booleanValue()) {
            this.q.setTextColor(-7829368);
            this.r.setTextColor(-7829368);
        } else {
            boolean booleanValue2 = zx0.b("prefMonitorDarkText").booleanValue();
            TextView textView2 = this.q;
            if (booleanValue2) {
                textView2.setTextColor(-16777216);
                this.r.setTextColor(-16777216);
            } else {
                textView2.setTextColor(-1);
                this.r.setTextColor(-1);
            }
        }
        if (!zx0.b("prefMonitorShadow").booleanValue()) {
            this.q.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.r.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            return;
        }
        boolean booleanValue3 = zx0.b("prefMonitorDarkText").booleanValue();
        TextView textView3 = this.q;
        if (booleanValue3) {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.r.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
        } else {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
            this.r.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        }
    }
}
