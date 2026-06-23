package flar2.devcheck;

import Cwd.YSHrxiHkAFcciU;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.slider.Slider;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import defpackage.a5;
import defpackage.af1;
import defpackage.bp1;
import defpackage.c;
import defpackage.c3;
import defpackage.et;
import defpackage.gr;
import defpackage.i51;
import defpackage.j3;
import defpackage.k5;
import defpackage.n3;
import defpackage.n72;
import defpackage.nc;
import defpackage.op0;
import defpackage.oq1;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.th2;
import defpackage.uz1;
import defpackage.vq;
import defpackage.wn1;
import defpackage.yx0;
import defpackage.zx0;
import flar2.devcheck.MonitorActivity;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import flar2.devcheck.monitors.BatteryMonitorWindow;
import flar2.devcheck.monitors.CPUMonitorWindow;
import flar2.devcheck.monitors.CurrentMonitorWindow;
import flar2.devcheck.monitors.FPSMonitorWindow;
import flar2.devcheck.monitors.GPUMonitorWindow;
import flar2.devcheck.monitors.LoadMonitorWindow;
import flar2.devcheck.monitors.NetworkMonitorWindow;
import flar2.devcheck.monitors.RamMonitorWindow;
import flar2.devcheck.monitors.SignalMonitorWindow;
import flar2.devcheck.monitors.TempMonitorWindow;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Objects;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class MonitorActivity extends a5 {
    public static final /* synthetic */ int Z = 0;
    public Slider F;
    public Slider G;
    public SwitchCompat H;
    public SwitchCompat I;
    public SwitchCompat J;
    public SwitchCompat K;
    public SwitchCompat L;
    public SwitchCompat M;
    public SwitchCompat N;
    public SwitchCompat O;
    public SwitchCompat P;
    public SwitchCompat Q;
    public SwitchCompat R;
    public SwitchCompat S;
    public SwitchCompat T;
    public SwitchCompat U;
    public SwitchCompat V;
    public SwitchCompat W;
    public SwitchCompat X;
    public n3 Y;

    public final void B(Class cls, String str) {
        try {
            oq1.c(getApplicationContext(), cls);
            zx0.c(str, false);
        } catch (Exception unused) {
        }
    }

    public final boolean C(Class cls) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (cls.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void D(Class cls) {
        if (C(cls)) {
            try {
                oq1.c(getApplicationContext(), cls);
            } catch (Exception unused) {
            }
            new Handler().postDelayed(new k5(this, 28, cls), 550L);
        }
    }

    public final void E(Class cls, String str) {
        String str2 = uz1.f1060a;
        if (Build.VERSION.SDK_INT >= 33 && checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
            pr.R(this, new String[]{"android.permission.POST_NOTIFICATIONS"}, 226);
        }
        oq1.v(getApplicationContext(), cls);
        zx0.c(str, true);
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1234 || Settings.canDrawOverlays(this)) {
            return;
        }
        finish();
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_monitor);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.root);
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollview);
        if (linearLayout != null && scrollView != null) {
            op0.a(linearLayout, true, false, true, false, false, false);
            op0.a(scrollView, false, false, false, true, false, false);
        }
        if (!zx0.f1292a.contains("prefSnapStatusBar")) {
            zx0.c("prefSnapStatusBar", true);
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.toolbar);
        A(materialToolbar);
        sl r = r();
        Objects.requireNonNull(r);
        r.j0(true);
        if (uz1.d(this)) {
            materialToolbar.setPopupTheme(R.style.MyPopupMenuStyleDark);
        }
        r().m0(getString(R.string.title_activity_monitor));
        this.F = (Slider) findViewById(R.id.aplpha_seekbar);
        this.G = (Slider) findViewById(R.id.textsize_seekbar);
        this.H = (SwitchCompat) findViewById(R.id.snap_switch);
        this.M = (SwitchCompat) findViewById(R.id.clickthru_switch);
        this.K = (SwitchCompat) findViewById(R.id.darktext_switch);
        this.L = (SwitchCompat) findViewById(R.id.shadowtext_switch);
        this.I = (SwitchCompat) findViewById(R.id.fullscreen_switch);
        this.J = (SwitchCompat) findViewById(R.id.landscape_switch);
        this.N = (SwitchCompat) findViewById(R.id.boot_switch);
        this.P = (SwitchCompat) findViewById(R.id.cpumon_switch);
        this.Q = (SwitchCompat) findViewById(R.id.gpumon_switch);
        this.R = (SwitchCompat) findViewById(R.id.tempmon_switch);
        this.S = (SwitchCompat) findViewById(R.id.loadmon_switch);
        this.O = (SwitchCompat) findViewById(R.id.battmon_switch);
        this.T = (SwitchCompat) findViewById(R.id.rammon_switch);
        this.U = (SwitchCompat) findViewById(R.id.curmon_switch);
        this.V = (SwitchCompat) findViewById(R.id.netmon_switch);
        this.W = (SwitchCompat) findViewById(R.id.signalmon_switch);
        this.X = (SwitchCompat) findViewById(R.id.fpsmon_switch);
        try {
            String[] strArr = op0.j;
            str = uz1.K(strArr[uz1.P(strArr)]).trim();
        } catch (NullPointerException unused) {
            str = "NA";
        }
        if (str.equals("NA") || str.equals("EE") || !str.matches("[0-9]+") || str.equals(YSHrxiHkAFcciU.vorUSnUZR)) {
            this.Q.setVisibility(8);
        }
        String str2 = uz1.f1060a;
        synchronized (uz1.class) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/stat", Gvyagftz.lsrQlISm);
                String[] split = randomAccessFile.readLine().split(" +");
                Long.parseLong(split[4]);
                Long.parseLong(split[2]);
                Long.parseLong(split[3]);
                Long.parseLong(split[5]);
                Long.parseLong(split[6]);
                Long.parseLong(split[7]);
                Long.parseLong(split[8]);
                try {
                    Thread.sleep(250L);
                } catch (Exception unused2) {
                }
                randomAccessFile.seek(0L);
                String readLine = randomAccessFile.readLine();
                randomAccessFile.close();
                String[] split2 = readLine.split(" +");
                Long.parseLong(split2[4]);
                Long.parseLong(split2[2]);
                Long.parseLong(split2[3]);
                Long.parseLong(split2[5]);
                Long.parseLong(split2[6]);
                Long.parseLong(split2[7]);
                Long.parseLong(split2[8]);
            } catch (IOException unused3) {
                try {
                    if (i51.b("prefRoot").booleanValue()) {
                        String str3 = (String) wn1.a("cat /proc/stat").o().c().get(0);
                        try {
                            Thread.sleep(250L);
                        } catch (InterruptedException unused4) {
                        }
                        String str4 = (String) wn1.a("cat /proc/stat").o().c().get(0);
                        String[] split3 = str3.split(" +");
                        Long.parseLong(split3[4]);
                        Long.parseLong(split3[1]);
                        Long.parseLong(split3[3]);
                        Long.parseLong(split3[2]);
                        Long.parseLong(split3[5]);
                        Long.parseLong(split3[6]);
                        Long.parseLong(split3[7]);
                        String[] split4 = str4.split(" +");
                        Long.parseLong(split4[4]);
                        Long.parseLong(split4[1]);
                        Long.parseLong(split4[3]);
                        Long.parseLong(split4[2]);
                        Long.parseLong(split4[5]);
                        Long.parseLong(split4[6]);
                        Long.parseLong(split4[7]);
                    } else {
                        String p = uz1.p();
                        if (p.contains("Nice")) {
                            String[] split5 = p.split(" +");
                            Long.parseLong(split5[1]);
                            Long.parseLong(split5[4]);
                            Long.parseLong(split5[7]);
                            Long.parseLong(split5[21].trim());
                        }
                    }
                } catch (Exception unused5) {
                }
            }
        }
        try {
            String[] strArr2 = op0.g;
            String K = uz1.K(strArr2[uz1.P(strArr2)]);
            if (K.equals("NA") || K.equals("EE")) {
                String valueOf = String.valueOf(((BatteryManager) getSystemService("batterymanager")).getIntProperty(2));
                if (valueOf.equals("0")) {
                    valueOf = String.valueOf(registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("current_now", -1));
                }
                if (valueOf.equals("-1")) {
                    this.U.setVisibility(8);
                }
            }
        } catch (Exception unused6) {
        }
        if (Settings.canDrawOverlays(this)) {
            String str5 = XmJDY.uQJQgZvq;
            if (Build.VERSION.SDK_INT >= 33 && checkSelfPermission(str5) != 0) {
                pr.R(this, new String[]{str5}, 226);
            }
        } else {
            th2 th2Var = new th2(this);
            String string = getString(R.string.allow_floating_monitors);
            j3 j3Var = (j3) th2Var.h;
            j3Var.e = string;
            j3Var.n = false;
            j3Var.g = getString(R.string.allow_floating_monitors_msg);
            th2Var.j(getString(R.string.okay), new yx0(this, 1));
            th2Var.h(getString(R.string.cancel), new yx0(this, 2));
            n3 a2 = th2Var.a();
            this.Y = a2;
            a2.show();
        }
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, 0);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a3 = af1.a(sj.class);
        String b = a3.b();
        if (b != null) {
            ((sj) grVar.t(a3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(this, new nc(17, this));
        } else {
            c.m("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_monitor, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            super.onBackPressed();
            return true;
        }
        if (itemId != R.id.action_reset) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.P.setChecked(false);
        this.Q.setChecked(false);
        this.R.setChecked(false);
        this.S.setChecked(false);
        this.O.setChecked(false);
        this.T.setChecked(false);
        this.U.setChecked(false);
        this.V.setChecked(false);
        this.W.setChecked(false);
        this.X.setChecked(false);
        this.H.setChecked(true);
        zx0.c("prefSnapStatusBar", true);
        this.M.setChecked(false);
        zx0.c("prefMonitorClickThru", false);
        this.I.setChecked(false);
        zx0.c("prefMonitorFullscreen", false);
        this.J.setChecked(false);
        zx0.c("prefMonitorLandscape", false);
        this.K.setChecked(false);
        zx0.c("prefMonitorDarkText", false);
        this.L.setChecked(true);
        zx0.c("prefMonitorShadow", false);
        this.N.setChecked(false);
        et.c("prefMonitorBoot", false);
        zx0.d(0, jYVJoqfHJs.EOtTzTRPV);
        zx0.d(840, "prefCPUMonPosY");
        zx0.d(0, "prefGPUMonPosX");
        zx0.d(240, "prefGPUMonPosY");
        zx0.d(0, "prefTempMonPosX");
        zx0.d(360, "prefTempMonPosY");
        zx0.d(0, "prefLoadMonPosX");
        zx0.d(480, "prefLoadMonPosY");
        zx0.d(0, "prefBattMonPosX");
        zx0.d(600, "prefBattMonPosY");
        zx0.d(0, "prefRamMonPosX");
        zx0.d(720, "prefRamMonPosY");
        zx0.d(Integer.MAX_VALUE, "prefCurMonPosX");
        zx0.d(240, "prefCurMonPosY");
        zx0.d(Integer.MAX_VALUE, "prefNetMonPosX");
        zx0.d(360, "prefNetMonPosY");
        zx0.d(Integer.MAX_VALUE, "prefSignalMonPosX");
        zx0.d(556, "prefSignalMonPosY");
        zx0.d(Integer.MAX_VALUE, CGvJMCDBOmCdj.VNtKJcoAp);
        zx0.d(750, "prefFPSMonPosY");
        zx0.c("prefCPUStatusBar", false);
        zx0.c("prefGPUStatusBar", false);
        zx0.c("prefLoadStatusBar", false);
        zx0.c("prefTempStatusBar", false);
        zx0.c("prefBattStatusBar", false);
        zx0.c("prefRamStatusBar", false);
        zx0.c("prefCurStatusBar", false);
        zx0.c("prefNetStatusBar", false);
        zx0.c("prefSignalStatusBar", false);
        zx0.c(aEQQDLUUMo.wcpzMzgAq, false);
        zx0.c("prefCPUMonEnable", false);
        zx0.c("prefGPUMonEnable", false);
        zx0.c("prefTempMonEnable", false);
        zx0.c("prefLoadMonEnable", false);
        zx0.c(aEQQDLUUMo.FDAKfqK, false);
        zx0.c("prefRamMonEnable", false);
        zx0.c("prefCurMonEnable", false);
        zx0.c("prefNetMonEnable", false);
        zx0.c("prefSignalMonEnable", false);
        zx0.c("prefFPSMonEnable", false);
        zx0.d(44, "prefMonitorAlpha");
        Slider slider = this.F;
        SharedPreferences sharedPreferences = zx0.f1292a;
        slider.setValue(sharedPreferences.getInt("prefMonitorAlpha", 44) / 140.0f);
        if (getResources().getBoolean(R.bool.isTablet)) {
            zx0.d(20, "prefMonitorTextSize");
        } else {
            zx0.d(16, "prefMonitorTextSize");
        }
        this.G.setValue((sharedPreferences.getInt("prefMonitorTextSize", 12) - 4) / 40.0f);
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        n3 n3Var = this.Y;
        if (n3Var == null || !n3Var.isShowing()) {
            return;
        }
        this.Y.dismiss();
    }

    @Override // defpackage.zt, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (menu != null && menu.getClass().getSimpleName().equals("MenuBuilder")) {
            try {
                Method declaredMethod = menu.getClass().getDeclaredMethod("setOptionalIconsVisible", Boolean.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(menu, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
        super.onPreparePanel(i, view, menu);
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        Slider slider = this.F;
        SharedPreferences sharedPreferences = zx0.f1292a;
        slider.setValue(sharedPreferences.getInt("prefMonitorAlpha", 44) / 140.0f);
        final int i = 1;
        this.F.a(new bp1() { // from class: wx0
            @Override // defpackage.bp1
            public final void a(float f) {
                switch (i) {
                    case 0:
                        int i2 = MonitorActivity.Z;
                        zx0.d(((int) (f * 40.0f)) + 4, jYVJoqfHJs.dxPz);
                        break;
                    default:
                        int i3 = MonitorActivity.Z;
                        zx0.d((int) (f * 140.0f), "prefMonitorAlpha");
                        break;
                }
            }
        });
        final int i2 = 4;
        this.G.setValue((sharedPreferences.getInt("prefMonitorTextSize", 12) - 4) / 40.0f);
        final int i3 = 0;
        this.G.a(new bp1() { // from class: wx0
            @Override // defpackage.bp1
            public final void a(float f) {
                switch (i3) {
                    case 0:
                        int i22 = MonitorActivity.Z;
                        zx0.d(((int) (f * 40.0f)) + 4, jYVJoqfHJs.dxPz);
                        break;
                    default:
                        int i32 = MonitorActivity.Z;
                        zx0.d((int) (f * 140.0f), "prefMonitorAlpha");
                        break;
                }
            }
        });
        this.H.setChecked(zx0.b("prefSnapStatusBar").booleanValue());
        this.H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xx0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (i3) {
                    case 0:
                        int i4 = MonitorActivity.Z;
                        if (!z) {
                            zx0.c("prefSnapStatusBar", false);
                            zx0.c("prefCPUStatusBar", false);
                            zx0.c("prefGPUStatusBar", false);
                            zx0.c(QCeVODiUkb.Cewu, false);
                            zx0.c("prefLoadStatusBar", false);
                            zx0.c("prefBattStatusBar", false);
                            zx0.c("prefRamStatusBar", false);
                            zx0.c("prefCurStatusBar", false);
                            zx0.c(CDsMEtnUjndKau.ItQFbp, false);
                            zx0.c("prefSignalStatusBar", false);
                            zx0.c("prefFPSStatusBar", false);
                            break;
                        } else {
                            zx0.c("prefSnapStatusBar", true);
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i5 = MonitorActivity.Z;
                        zx0.c(gXdyRQCGVlHW.LrdbS, z);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i6 = MonitorActivity.Z;
                        zx0.c("prefMonitorLandscape", z);
                        break;
                    case 3:
                        int i7 = MonitorActivity.Z;
                        zx0.c("prefMonitorDarkText", z);
                        break;
                    default:
                        int i8 = MonitorActivity.Z;
                        zx0.c("prefMonitorShadow", z);
                        break;
                }
            }
        });
        this.M.setChecked(zx0.b("prefMonitorClickThru").booleanValue());
        this.M.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i4 = i;
                MonitorActivity monitorActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i6 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i7 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i8 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i9 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i10 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i11 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        this.I.setChecked(zx0.b("prefMonitorFullscreen").booleanValue());
        this.I.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xx0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (i) {
                    case 0:
                        int i4 = MonitorActivity.Z;
                        if (!z) {
                            zx0.c("prefSnapStatusBar", false);
                            zx0.c("prefCPUStatusBar", false);
                            zx0.c("prefGPUStatusBar", false);
                            zx0.c(QCeVODiUkb.Cewu, false);
                            zx0.c("prefLoadStatusBar", false);
                            zx0.c("prefBattStatusBar", false);
                            zx0.c("prefRamStatusBar", false);
                            zx0.c("prefCurStatusBar", false);
                            zx0.c(CDsMEtnUjndKau.ItQFbp, false);
                            zx0.c("prefSignalStatusBar", false);
                            zx0.c("prefFPSStatusBar", false);
                            break;
                        } else {
                            zx0.c("prefSnapStatusBar", true);
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i5 = MonitorActivity.Z;
                        zx0.c(gXdyRQCGVlHW.LrdbS, z);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i6 = MonitorActivity.Z;
                        zx0.c("prefMonitorLandscape", z);
                        break;
                    case 3:
                        int i7 = MonitorActivity.Z;
                        zx0.c("prefMonitorDarkText", z);
                        break;
                    default:
                        int i8 = MonitorActivity.Z;
                        zx0.c("prefMonitorShadow", z);
                        break;
                }
            }
        });
        this.J.setChecked(zx0.b("prefMonitorLandscape").booleanValue());
        final int i4 = 2;
        this.J.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xx0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (i4) {
                    case 0:
                        int i42 = MonitorActivity.Z;
                        if (!z) {
                            zx0.c("prefSnapStatusBar", false);
                            zx0.c("prefCPUStatusBar", false);
                            zx0.c("prefGPUStatusBar", false);
                            zx0.c(QCeVODiUkb.Cewu, false);
                            zx0.c("prefLoadStatusBar", false);
                            zx0.c("prefBattStatusBar", false);
                            zx0.c("prefRamStatusBar", false);
                            zx0.c("prefCurStatusBar", false);
                            zx0.c(CDsMEtnUjndKau.ItQFbp, false);
                            zx0.c("prefSignalStatusBar", false);
                            zx0.c("prefFPSStatusBar", false);
                            break;
                        } else {
                            zx0.c("prefSnapStatusBar", true);
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i5 = MonitorActivity.Z;
                        zx0.c(gXdyRQCGVlHW.LrdbS, z);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i6 = MonitorActivity.Z;
                        zx0.c("prefMonitorLandscape", z);
                        break;
                    case 3:
                        int i7 = MonitorActivity.Z;
                        zx0.c("prefMonitorDarkText", z);
                        break;
                    default:
                        int i8 = MonitorActivity.Z;
                        zx0.c("prefMonitorShadow", z);
                        break;
                }
            }
        });
        this.K.setChecked(zx0.b("prefMonitorDarkText").booleanValue());
        final int i5 = 3;
        this.K.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xx0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (i5) {
                    case 0:
                        int i42 = MonitorActivity.Z;
                        if (!z) {
                            zx0.c("prefSnapStatusBar", false);
                            zx0.c("prefCPUStatusBar", false);
                            zx0.c("prefGPUStatusBar", false);
                            zx0.c(QCeVODiUkb.Cewu, false);
                            zx0.c("prefLoadStatusBar", false);
                            zx0.c("prefBattStatusBar", false);
                            zx0.c("prefRamStatusBar", false);
                            zx0.c("prefCurStatusBar", false);
                            zx0.c(CDsMEtnUjndKau.ItQFbp, false);
                            zx0.c("prefSignalStatusBar", false);
                            zx0.c("prefFPSStatusBar", false);
                            break;
                        } else {
                            zx0.c("prefSnapStatusBar", true);
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i52 = MonitorActivity.Z;
                        zx0.c(gXdyRQCGVlHW.LrdbS, z);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i6 = MonitorActivity.Z;
                        zx0.c("prefMonitorLandscape", z);
                        break;
                    case 3:
                        int i7 = MonitorActivity.Z;
                        zx0.c("prefMonitorDarkText", z);
                        break;
                    default:
                        int i8 = MonitorActivity.Z;
                        zx0.c("prefMonitorShadow", z);
                        break;
                }
            }
        });
        this.L.setChecked(zx0.b("prefMonitorShadow").booleanValue());
        this.L.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xx0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                switch (i2) {
                    case 0:
                        int i42 = MonitorActivity.Z;
                        if (!z) {
                            zx0.c("prefSnapStatusBar", false);
                            zx0.c("prefCPUStatusBar", false);
                            zx0.c("prefGPUStatusBar", false);
                            zx0.c(QCeVODiUkb.Cewu, false);
                            zx0.c("prefLoadStatusBar", false);
                            zx0.c("prefBattStatusBar", false);
                            zx0.c("prefRamStatusBar", false);
                            zx0.c("prefCurStatusBar", false);
                            zx0.c(CDsMEtnUjndKau.ItQFbp, false);
                            zx0.c("prefSignalStatusBar", false);
                            zx0.c("prefFPSStatusBar", false);
                            break;
                        } else {
                            zx0.c("prefSnapStatusBar", true);
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i52 = MonitorActivity.Z;
                        zx0.c(gXdyRQCGVlHW.LrdbS, z);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i6 = MonitorActivity.Z;
                        zx0.c("prefMonitorLandscape", z);
                        break;
                    case 3:
                        int i7 = MonitorActivity.Z;
                        zx0.c("prefMonitorDarkText", z);
                        break;
                    default:
                        int i8 = MonitorActivity.Z;
                        zx0.c("prefMonitorShadow", z);
                        break;
                }
            }
        });
        this.N.setChecked(et.f248a.d("prefMonitorBoot"));
        this.N.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i4;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i6 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i7 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i8 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i9 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i10 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i11 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(CPUMonitorWindow.class)) {
            this.P.setChecked(true);
        } else {
            boolean booleanValue = zx0.b("prefCPUMonEnable").booleanValue();
            SwitchCompat switchCompat = this.P;
            if (booleanValue) {
                switchCompat.setChecked(true);
                E(CPUMonitorWindow.class, "prefCPUMonEnable");
            } else {
                switchCompat.setChecked(false);
            }
        }
        this.P.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i5;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i6 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i7 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i8 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i9 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i10 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i11 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(GPUMonitorWindow.class)) {
            this.Q.setChecked(true);
        } else {
            boolean booleanValue2 = zx0.b("prefGPUMonEnable").booleanValue();
            SwitchCompat switchCompat2 = this.Q;
            if (booleanValue2) {
                switchCompat2.setChecked(true);
                E(GPUMonitorWindow.class, "prefGPUMonEnable");
            } else {
                switchCompat2.setChecked(false);
            }
        }
        this.Q.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i2;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i6 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i7 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i8 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i9 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i10 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i11 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(TempMonitorWindow.class)) {
            this.R.setChecked(true);
        } else {
            boolean booleanValue3 = zx0.b("prefTempMonEnable").booleanValue();
            SwitchCompat switchCompat3 = this.R;
            if (booleanValue3) {
                switchCompat3.setChecked(true);
                E(TempMonitorWindow.class, "prefTempMonEnable");
            } else {
                switchCompat3.setChecked(false);
            }
        }
        final int i6 = 5;
        this.R.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i6;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i62 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i7 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i8 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i9 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i10 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i11 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(LoadMonitorWindow.class)) {
            this.S.setChecked(true);
        } else {
            boolean booleanValue4 = zx0.b("prefLoadMonEnable").booleanValue();
            SwitchCompat switchCompat4 = this.S;
            if (booleanValue4) {
                switchCompat4.setChecked(true);
                E(LoadMonitorWindow.class, "prefLoadMonEnable");
            } else {
                switchCompat4.setChecked(false);
            }
        }
        final int i7 = 6;
        this.S.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i7;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i62 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i72 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i8 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i9 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i10 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i11 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(BatteryMonitorWindow.class)) {
            this.O.setChecked(true);
        } else {
            boolean booleanValue5 = zx0.b("prefBattMonEnable").booleanValue();
            SwitchCompat switchCompat5 = this.O;
            if (booleanValue5) {
                switchCompat5.setChecked(true);
                E(BatteryMonitorWindow.class, "prefBattMonEnable");
            } else {
                switchCompat5.setChecked(false);
            }
        }
        final int i8 = 7;
        this.O.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i8;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i62 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i72 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i82 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i9 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i10 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i11 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(RamMonitorWindow.class)) {
            this.T.setChecked(true);
        } else {
            boolean booleanValue6 = zx0.b("prefRamMonEnable").booleanValue();
            SwitchCompat switchCompat6 = this.T;
            if (booleanValue6) {
                switchCompat6.setChecked(true);
                E(RamMonitorWindow.class, "prefRamMonEnable");
            } else {
                switchCompat6.setChecked(false);
            }
        }
        final int i9 = 8;
        this.T.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i9;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i62 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i72 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i82 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i92 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i10 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i11 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(CurrentMonitorWindow.class)) {
            this.U.setChecked(true);
        } else {
            boolean booleanValue7 = zx0.b("prefCurMonEnable").booleanValue();
            SwitchCompat switchCompat7 = this.U;
            if (booleanValue7) {
                switchCompat7.setChecked(true);
                E(CurrentMonitorWindow.class, "prefCurMonEnable");
            } else {
                switchCompat7.setChecked(false);
            }
        }
        final int i10 = 9;
        this.U.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i10;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i62 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i72 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i82 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i92 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i102 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i11 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(NetworkMonitorWindow.class)) {
            this.V.setChecked(true);
        } else {
            boolean booleanValue8 = zx0.b("prefNetMonEnable").booleanValue();
            SwitchCompat switchCompat8 = this.V;
            if (booleanValue8) {
                switchCompat8.setChecked(true);
                E(NetworkMonitorWindow.class, "prefNetMonEnable");
            } else {
                switchCompat8.setChecked(false);
            }
        }
        final int i11 = 10;
        this.V.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i11;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i62 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i72 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i82 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i92 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i102 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i112 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i12 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(SignalMonitorWindow.class)) {
            this.W.setChecked(true);
        } else {
            boolean booleanValue9 = zx0.b("prefSignalMonEnable").booleanValue();
            SwitchCompat switchCompat9 = this.W;
            if (booleanValue9) {
                switchCompat9.setChecked(true);
                E(SignalMonitorWindow.class, "prefSignalMonEnable");
            } else {
                switchCompat9.setChecked(false);
            }
        }
        final int i12 = 11;
        this.W.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i12;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i62 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i72 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i82 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i92 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i102 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i112 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i122 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
        if (C(FPSMonitorWindow.class)) {
            this.X.setChecked(true);
        } else {
            boolean booleanValue10 = zx0.b("prefFPSMonEnable").booleanValue();
            SwitchCompat switchCompat10 = this.X;
            if (booleanValue10) {
                switchCompat10.setChecked(true);
                E(FPSMonitorWindow.class, "prefFPSMonEnable");
            } else {
                switchCompat10.setChecked(false);
            }
        }
        this.X.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: vx0
            public final /* synthetic */ MonitorActivity b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i42 = i3;
                MonitorActivity monitorActivity = this.b;
                switch (i42) {
                    case 0:
                        int i52 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        } else {
                            monitorActivity.E(FPSMonitorWindow.class, "prefFPSMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        int i62 = MonitorActivity.Z;
                        zx0.c("prefMonitorClickThru", z);
                        monitorActivity.D(CPUMonitorWindow.class);
                        monitorActivity.D(GPUMonitorWindow.class);
                        monitorActivity.D(TempMonitorWindow.class);
                        monitorActivity.D(LoadMonitorWindow.class);
                        monitorActivity.D(BatteryMonitorWindow.class);
                        monitorActivity.D(RamMonitorWindow.class);
                        monitorActivity.D(CurrentMonitorWindow.class);
                        monitorActivity.D(NetworkMonitorWindow.class);
                        monitorActivity.D(SignalMonitorWindow.class);
                        monitorActivity.D(FPSMonitorWindow.class);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        int i72 = MonitorActivity.Z;
                        if (!z) {
                            et.c("prefMonitorBoot", false);
                            break;
                        } else {
                            et.c("prefMonitorBoot", true);
                            if (!TextUtils.isEmpty(uz1.X("ro.miui.ui.version.name"))) {
                                th2 th2Var = new th2(monitorActivity);
                                String string = monitorActivity.getString(R.string.autostart_permission);
                                j3 j3Var = (j3) th2Var.h;
                                j3Var.e = string;
                                j3Var.n = false;
                                j3Var.g = monitorActivity.getString(R.string.miui_permissions_autostart);
                                th2Var.h(monitorActivity.getString(R.string.cancel), null);
                                th2Var.j(monitorActivity.getString(R.string.okay), new yx0(monitorActivity, 0));
                                n3 a2 = th2Var.a();
                                monitorActivity.Y = a2;
                                a2.show();
                                break;
                            }
                        }
                        break;
                    case 3:
                        int i82 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CPUMonitorWindow.class, "prefCPUMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        int i92 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        } else {
                            monitorActivity.E(GPUMonitorWindow.class, "prefGPUMonEnable");
                            break;
                        }
                    case 5:
                        int i102 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        } else {
                            monitorActivity.E(TempMonitorWindow.class, "prefTempMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        int i112 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        } else {
                            monitorActivity.E(LoadMonitorWindow.class, "prefLoadMonEnable");
                            break;
                        }
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        int i122 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        } else {
                            monitorActivity.E(BatteryMonitorWindow.class, "prefBattMonEnable");
                            break;
                        }
                    case 8:
                        int i13 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        } else {
                            monitorActivity.E(RamMonitorWindow.class, "prefRamMonEnable");
                            break;
                        }
                    case rt0.o /* 9 */:
                        int i14 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        } else {
                            monitorActivity.E(CurrentMonitorWindow.class, "prefCurMonEnable");
                            break;
                        }
                    case 10:
                        int i15 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        } else {
                            monitorActivity.E(NetworkMonitorWindow.class, "prefNetMonEnable");
                            break;
                        }
                    default:
                        int i16 = MonitorActivity.Z;
                        if (!z) {
                            monitorActivity.B(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        } else {
                            monitorActivity.E(SignalMonitorWindow.class, "prefSignalMonEnable");
                            break;
                        }
                }
            }
        });
    }
}
