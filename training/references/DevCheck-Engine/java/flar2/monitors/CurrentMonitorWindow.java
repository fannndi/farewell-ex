package flar2.devcheck.monitors;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media.RfwE.BIxeFreLLop;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import defpackage.d10;
import defpackage.nq1;
import defpackage.oq1;
import defpackage.rt0;
import defpackage.sq;
import defpackage.tf;
import defpackage.uf;
import defpackage.uz1;
import defpackage.w5;
import defpackage.wa;
import defpackage.z92;
import defpackage.zx0;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;

/* loaded from: classes.dex */
public class CurrentMonitorWindow extends oq1 {
    public static final /* synthetic */ int I = 0;
    public int A;
    public int B;
    public int C;
    public w5 D;
    public HandlerThread E;
    public Handler F;
    public Handler G;
    public tf o;
    public SharedPreferences p;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public View v;
    public LinearLayout w;
    public int x;
    public BatteryManager y;
    public int z;
    public final sq q = new sq();
    public final wa H = new wa(5, this);

    @Override // defpackage.oq1
    public final void e(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.curmon_layout, (ViewGroup) frameLayout, true);
        this.y = (BatteryManager) getSystemService("batterymanager");
        this.x = 16;
        if (getResources().getBoolean(R.bool.isTablet)) {
            this.x = 20;
        }
        this.C = getResources().getDimensionPixelOffset(R.dimen.statusbar_padding_bottom);
        this.B = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_3dp);
        this.A = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_6dp);
        this.z = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_1dp);
        TextView textView = (TextView) inflate.findViewById(R.id.cur_value);
        this.r = textView;
        int i = this.x;
        SharedPreferences sharedPreferences = zx0.f1292a;
        textView.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", i));
        this.s = (TextView) inflate.findViewById(R.id.cur_label);
        TextView textView2 = (TextView) inflate.findViewById(R.id.cur_test1);
        this.t = textView2;
        textView2.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.x));
        TextView textView3 = (TextView) inflate.findViewById(R.id.cur_test2);
        this.u = textView3;
        textView3.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.x));
        View findViewById = inflate.findViewById(R.id.curmon_background);
        this.v = findViewById;
        findViewById.getBackground().setAlpha(sharedPreferences.getInt("prefMonitorAlpha", 44));
        this.w = (LinearLayout) inflate.findViewById(R.id.curmon_container);
        this.D = new w5(9, this);
        IntentFilter intentFilter = new IntentFilter(BIxeFreLLop.MpluU);
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction(RIhTGWkqQvGL.ZrMruTBiWsIM);
        intentFilter.setPriority(999);
        int i2 = Build.VERSION.SDK_INT;
        w5 w5Var = this.D;
        if (i2 >= 33) {
            registerReceiver(w5Var, intentFilter, 4);
        } else {
            registerReceiver(w5Var, intentFilter);
        }
        HandlerThread handlerThread = new HandlerThread("curmon_refresh_thread", 10);
        this.E = handlerThread;
        handlerThread.start();
        this.F = new Handler(this.E.getLooper());
        this.G = new Handler(Looper.getMainLooper());
        this.F.post(this.H);
        y();
        this.o = new tf(this, 2);
        SharedPreferences sharedPreferences2 = d10.n().getSharedPreferences("monitors", 0);
        this.p = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this.o);
        this.v.setOnSystemUiVisibilityChangeListener(new uf(this, 2));
    }

    @Override // defpackage.oq1
    public final String g() {
        return "CurrentMonitor";
    }

    @Override // defpackage.oq1
    public final int j() {
        return rt0.q | rt0.x;
    }

    @Override // defpackage.oq1
    public final nq1 l(int i) {
        if (zx0.b("prefMonitorClickThru").booleanValue()) {
            SharedPreferences sharedPreferences = zx0.f1292a;
            return new nq1(this, i, true, sharedPreferences.getInt("prefCurMonPosX", Integer.MAX_VALUE), sharedPreferences.getInt("prefCurMonPosY", 240));
        }
        SharedPreferences sharedPreferences2 = zx0.f1292a;
        return new nq1(this, i, false, sharedPreferences2.getInt("prefCurMonPosX", Integer.MAX_VALUE), sharedPreferences2.getInt("prefCurMonPosY", 240));
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                zx0.a(this.v);
            } else if (i != 2) {
                zx0.a(this.v);
            } else if (zx0.b(UQdsoaJMID.qZr).booleanValue()) {
                this.v.setTranslationY(-8000.0f);
            }
        } catch (NullPointerException unused) {
        }
    }

    @Override // defpackage.oq1
    public final void q() {
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacks(this.H);
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
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).x, "prefCurMonPosX");
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).y, "prefCurMonPosY");
        }
        if (motionEvent.getAction() == 2) {
            zx0.c("prefCurStatusBar", zx0.b("prefSnapStatusBar").booleanValue() && ((WindowManager.LayoutParams) z92Var.getLayoutParams()).y <= 0);
        }
    }

    public final void y() {
        boolean booleanValue = zx0.b("prefCurStatusBar").booleanValue();
        View view = this.v;
        if (booleanValue) {
            view.getBackground().setAlpha(0);
            this.w.setOrientation(1);
            int U = uz1.U();
            TextView textView = this.r;
            if (U <= 22) {
                textView.setTextSize(6.0f);
                this.s.setTextSize(6.0f);
            } else {
                textView.setTextSize(8.0f);
                this.s.setTextSize(8.0f);
            }
            View view2 = this.v;
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
            this.s.setVisibility(0);
            this.t.setVisibility(8);
            this.u.setVisibility(8);
        } else {
            view.getBackground().setAlpha(zx0.f1292a.getInt("prefMonitorAlpha", 44));
            this.w.setOrientation(0);
            View view3 = this.v;
            int i3 = this.A;
            view3.setPadding(i3, this.B, i3, i3);
            this.r.setTextSize(r2.getInt("prefMonitorTextSize", this.x));
            this.s.setVisibility(8);
            this.t.setVisibility(0);
            this.t.setTextSize(r2.getInt("prefMonitorTextSize", this.x));
            this.u.setVisibility(0);
            this.u.setTextSize(r2.getInt("prefMonitorTextSize", this.x));
        }
        if (zx0.b("prefCurStatusBar").booleanValue()) {
            this.r.setTextColor(-7829368);
            this.s.setTextColor(-7829368);
        } else {
            boolean booleanValue2 = zx0.b("prefMonitorDarkText").booleanValue();
            TextView textView2 = this.r;
            if (booleanValue2) {
                textView2.setTextColor(-16777216);
                this.s.setTextColor(-16777216);
            } else {
                textView2.setTextColor(-1);
                this.s.setTextColor(-1);
            }
        }
        if (!zx0.b("prefMonitorShadow").booleanValue()) {
            this.r.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            this.s.setShadowLayer(0.0f, -0.7f, -0.2f, -16777216);
            return;
        }
        boolean booleanValue3 = zx0.b("prefMonitorDarkText").booleanValue();
        TextView textView3 = this.r;
        if (booleanValue3) {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
            this.s.setShadowLayer(1.5f, -0.7f, -0.2f, -3355444);
        } else {
            textView3.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
            this.s.setShadowLayer(1.5f, -0.7f, -0.2f, -16777216);
        }
    }
}
