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
import androidx.emoji2.text.Fk.Iyrs;
import defpackage.d10;
import defpackage.nq1;
import defpackage.oq1;
import defpackage.ox0;
import defpackage.qa0;
import defpackage.rt0;
import defpackage.tf;
import defpackage.uf;
import defpackage.uz1;
import defpackage.w5;
import defpackage.z92;
import defpackage.zx0;
import flar2.devcheck.R;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class FPSMonitorWindow extends oq1 {
    public static final /* synthetic */ int C = 0;
    public w5 A;
    public ox0 B;
    public tf o;
    public SharedPreferences p;
    public TextView q;
    public TextView r;
    public TextView s;
    public View t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    @Override // defpackage.oq1
    public final void e(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.fpsmon_layout, (ViewGroup) frameLayout, true);
        this.u = 16;
        if (getResources().getBoolean(R.bool.isTablet)) {
            this.u = 20;
        }
        this.x = getResources().getDimensionPixelOffset(R.dimen.statusbar_padding_bottom);
        this.w = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_3dp);
        this.v = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_6dp);
        this.y = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_5dp);
        this.z = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_2dp);
        TextView textView = (TextView) inflate.findViewById(R.id.fps_value);
        this.q = textView;
        int i = this.u;
        SharedPreferences sharedPreferences = zx0.f1292a;
        textView.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", i));
        TextView textView2 = (TextView) inflate.findViewById(R.id.fps_test1);
        this.r = textView2;
        textView2.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.u));
        TextView textView3 = (TextView) inflate.findViewById(R.id.fps_test2);
        this.s = textView3;
        textView3.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.u));
        View findViewById = inflate.findViewById(R.id.fpsmon_background);
        this.t = findViewById;
        findViewById.getBackground().setAlpha(sharedPreferences.getInt("prefMonitorAlpha", 44));
        this.A = new w5(11, this);
        IntentFilter intentFilter = new IntentFilter("flar2.devcheck.ACTION_MONITOR_TOGGLE");
        intentFilter.setPriority(999);
        int i2 = Build.VERSION.SDK_INT;
        w5 w5Var = this.A;
        if (i2 >= 33) {
            registerReceiver(w5Var, intentFilter, 4);
        } else {
            registerReceiver(w5Var, intentFilter);
        }
        DecimalFormat decimalFormat = new DecimalFormat(Iyrs.KGkxxiYaHtnxis);
        ox0 ox0Var = new ox0();
        this.B = ox0Var;
        ox0Var.d.add(new qa0(this, decimalFormat));
        ox0 ox0Var2 = this.B;
        ox0Var2.f764a.postFrameCallback(ox0Var2);
        y();
        int i3 = 3;
        this.o = new tf(this, i3);
        SharedPreferences sharedPreferences2 = d10.n().getSharedPreferences("monitors", 0);
        this.p = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this.o);
        this.t.setOnSystemUiVisibilityChangeListener(new uf(this, i3));
    }

    @Override // defpackage.oq1
    public final String g() {
        return "FPSMonitor";
    }

    @Override // defpackage.oq1
    public final int j() {
        return rt0.q | rt0.x;
    }

    @Override // defpackage.oq1
    public final nq1 l(int i) {
        if (zx0.b("prefMonitorClickThru").booleanValue()) {
            SharedPreferences sharedPreferences = zx0.f1292a;
            return new nq1(this, i, true, sharedPreferences.getInt("prefFPSMonPosX", Integer.MAX_VALUE), sharedPreferences.getInt("prefFPSMonPosY", 750));
        }
        SharedPreferences sharedPreferences2 = zx0.f1292a;
        return new nq1(this, i, false, sharedPreferences2.getInt("prefFPSMonPosX", Integer.MAX_VALUE), sharedPreferences2.getInt("prefFPSMonPosY", 750));
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
        try {
            w5 w5Var = this.A;
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
            ox0 ox0Var = this.B;
            if (ox0Var != null) {
                ox0Var.b = 0L;
                ox0Var.c = 0;
                ox0Var.f764a.removeFrameCallback(ox0Var);
            }
        } catch (NullPointerException unused2) {
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                stopSelf();
            } else {
                stopSelf();
            }
        } catch (Exception unused3) {
        }
    }

    @Override // defpackage.oq1
    public final void r(z92 z92Var, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).x, "prefFPSMonPosX");
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).y, "prefFPSMonPosY");
        }
        if (motionEvent.getAction() == 2) {
            zx0.c("prefFPSStatusBar", zx0.b("prefSnapStatusBar").booleanValue() && ((WindowManager.LayoutParams) z92Var.getLayoutParams()).y <= 2);
        }
    }

    public final void y() {
        boolean booleanValue = zx0.b("prefFPSStatusBar").booleanValue();
        View view = this.t;
        if (booleanValue) {
            view.getBackground().setAlpha(0);
            int U = uz1.U();
            if (U < 24) {
                View view2 = this.t;
                int i = this.w;
                view2.setPadding(i, this.z, i, this.x);
            } else if (U > 32) {
                View view3 = this.t;
                int i2 = this.w;
                view3.setPadding(i2, U - 5, i2, this.x);
            } else {
                View view4 = this.t;
                if (U > 28) {
                    int i3 = this.w;
                    view4.setPadding(i3, this.v, i3, this.x);
                } else {
                    int i4 = this.w;
                    if (U > 25) {
                        view4.setPadding(i4, this.y, i4, this.x);
                    } else {
                        view4.setPadding(i4, i4, i4, this.x);
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
        } else {
            view.getBackground().setAlpha(zx0.f1292a.getInt("prefMonitorAlpha", 44));
            View view5 = this.t;
            int i5 = this.v;
            view5.setPadding(i5, this.w, i5, i5);
            this.q.setTextSize(r2.getInt("prefMonitorTextSize", this.u));
            this.r.setVisibility(0);
            this.r.setTextSize(r2.getInt("prefMonitorTextSize", this.u));
            this.s.setVisibility(0);
            this.s.setTextSize(r2.getInt("prefMonitorTextSize", this.u));
        }
        if (zx0.b("prefFPSStatusBar").booleanValue()) {
            this.q.setTextColor(-7829368);
        } else {
            boolean booleanValue2 = zx0.b("prefMonitorDarkText").booleanValue();
            TextView textView2 = this.q;
            if (booleanValue2) {
                textView2.setTextColor(-16777216);
            } else {
                textView2.setTextColor(-1);
            }
        }
        if (!zx0.b("prefMonitorShadow").booleanValue()) {
            this.q.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            return;
        }
        boolean booleanValue3 = zx0.b("prefMonitorDarkText").booleanValue();
        TextView textView3 = this.q;
        if (booleanValue3) {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
        } else {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        }
    }
}
