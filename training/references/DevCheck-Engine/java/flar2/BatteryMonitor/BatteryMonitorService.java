package flar2.devcheck.BatteryMonitor;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import defpackage.b8;
import defpackage.e31;
import defpackage.gm2;
import defpackage.hf;
import defpackage.i51;
import defpackage.jf;
import defpackage.q0;
import defpackage.rf;
import defpackage.w5;
import flar2.devcheck.R;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import flar2.devcheck.sensors.JCZI.nyGJ;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class BatteryMonitorService extends Service {
    public static final /* synthetic */ int B = 0;
    public jf g;
    public w5 h;
    public PowerManager.WakeLock i;
    public e31 j;
    public NotificationManager k;
    public BatteryManager l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public float t;
    public float u;
    public float v;
    public float w;
    public PowerManager x;
    public AppWidgetManager y;
    public Handler z;
    public final DecimalFormat r = new DecimalFormat("###.##");
    public final gm2 s = new gm2(11, this);
    public final rf A = new rf(this, 0);

    public static void a(BatteryMonitorService batteryMonitorService) {
        DecimalFormat decimalFormat = batteryMonitorService.r;
        int c = i51.c(0, "prefPSOn");
        if (batteryMonitorService.f()) {
            c += i51.c(0, "prefPSOnMark") - batteryMonitorService.g();
        }
        long d = i51.d("prefTSOn");
        if (batteryMonitorService.f()) {
            d += System.currentTimeMillis() - i51.d("prefTSOnMark");
        }
        if (c > 0) {
            batteryMonitorService.t = (c * 3600000.0f) / d;
        } else {
            batteryMonitorService.t = 0.0f;
        }
        if (!batteryMonitorService.p) {
            batteryMonitorService.getString(R.string.active);
            decimalFormat.format(batteryMonitorService.t);
            return;
        }
        int c2 = i51.c(0, "prefCSOn");
        if (batteryMonitorService.f()) {
            c2 += i51.c(0, "prefCSOnMark") - batteryMonitorService.d();
        }
        int i = c2 / 1000;
        float f = i / batteryMonitorService.q;
        if (i > 0) {
            batteryMonitorService.u = (f * 3600000.0f) / d;
        } else {
            batteryMonitorService.u = 0.0f;
        }
        batteryMonitorService.getString(R.string.active);
        decimalFormat.format(batteryMonitorService.u * 100.0f);
    }

    public static AppWidgetManager b(BatteryMonitorService batteryMonitorService) {
        if (batteryMonitorService.y == null) {
            batteryMonitorService.y = (AppWidgetManager) batteryMonitorService.getSystemService("appwidget");
        }
        return batteryMonitorService.y;
    }

    public static void c(BatteryMonitorService batteryMonitorService) {
        DecimalFormat decimalFormat = batteryMonitorService.r;
        int c = i51.c(0, "prefPSOff");
        long d = i51.d("prefTSOff");
        if (c > 0) {
            batteryMonitorService.v = (c * 3600000.0f) / d;
        } else {
            batteryMonitorService.v = 0.0f;
        }
        if (!batteryMonitorService.p) {
            batteryMonitorService.getString(R.string.idle);
            decimalFormat.format(batteryMonitorService.v);
            return;
        }
        int c2 = i51.c(0, "prefPCOff") / 1000;
        float f = c2 / batteryMonitorService.q;
        if (c2 > 0) {
            batteryMonitorService.w = (f * 3600000.0f) / d;
        } else {
            batteryMonitorService.w = 0.0f;
        }
        batteryMonitorService.getString(R.string.idle);
        decimalFormat.format(batteryMonitorService.w * 100.0f);
    }

    public static long e() {
        return SystemClock.elapsedRealtime() - SystemClock.uptimeMillis();
    }

    public final int d() {
        if (this.l == null) {
            this.l = (BatteryManager) getSystemService("batterymanager");
        }
        return this.l.getIntProperty(1);
    }

    public final boolean f() {
        int intExtra;
        try {
            Intent registerReceiver = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : 0;
        } catch (IllegalArgumentException unused) {
        }
        return intExtra == 3 || intExtra == 4;
    }

    public final int g() {
        int i;
        int i2;
        int i3;
        int i4;
        try {
            try {
                Intent registerReceiver = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    i4 = registerReceiver.getIntExtra("level", -1);
                    i3 = registerReceiver.getIntExtra("scale", -1);
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                if (i3 <= 0) {
                    return 0;
                }
                return (i4 * 100) / i3;
            } catch (IllegalArgumentException unused) {
                Intent registerReceiver2 = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver2 != null) {
                    i2 = registerReceiver2.getIntExtra("level", -1);
                    i = registerReceiver2.getIntExtra("scale", -1);
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (i <= 0) {
                    return 0;
                }
                return (i2 * 100) / i;
            }
        } catch (Exception unused2) {
            return 0;
        }
    }

    public final Notification h() {
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, new Intent(getApplicationContext(), (Class<?>) BatteryActivity.class), 201326592);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel d = q0.d();
            d.setImportance(1);
            d.setShowBadge(true);
            d.setLockscreenVisibility(1);
            if (this.k == null) {
                this.k = (NotificationManager) getSystemService("notification");
            }
            this.k.createNotificationChannel(d);
            e31 e31Var = new e31(this, "Battery Monitor");
            this.j = e31Var;
            e31Var.n = "DC_NOTIF_ID_BM";
        } else {
            this.j = new e31(this, "Battery Monitor");
        }
        e31 e31Var2 = this.j;
        e31Var2.c(2);
        e31Var2.p.icon = R.drawable.ic_battery;
        e31Var2.c(8);
        e31Var2.h = -1;
        e31Var2.g = activity;
        e31Var2.i = false;
        e31Var2.m = getResources().getColor(R.color.green);
        return this.j.a();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        int i;
        super.onCreate();
        try {
            Notification h = h();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                b8.l(this, h);
            } else if (i2 >= 29) {
                b8.j(this, h);
            } else {
                startForeground(48, h);
            }
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 31 && hf.u(e)) {
                stopSelf();
                return;
            }
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) getApplicationContext().getSystemService("power")).newWakeLock(1, "DC:BatMonWakeLock");
            this.i = newWakeLock;
            newWakeLock.acquire(4000L);
        } catch (SecurityException unused) {
        }
        if (this.l == null) {
            this.l = (BatteryManager) getSystemService("batterymanager");
        }
        int intProperty = this.l.getIntProperty(1);
        boolean z = intProperty < 10000000 && intProperty > 1;
        this.p = z;
        if (z) {
            try {
                Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
                i = Math.round((long) ((Double) cls.getMethod("getBatteryCapacity", null).invoke(cls.getDeclaredConstructor(Context.class).newInstance(this), null)).doubleValue());
            } catch (Exception unused2) {
                i = 0;
            }
            if (i < 10) {
                i *= 1000;
            }
            if (i == 0 || i > 7000) {
                int intProperty2 = this.l.getIntProperty(1);
                i = (int) (Math.round((this.l.getIntProperty(4) > 0 ? (intProperty2 / r5) / 10 : 0) / 5.0d) * 5);
            }
            this.q = i;
        }
        this.o = true;
        try {
            if (i51.d("prefBMStartMarker") == -1) {
                i51.k("prefTBatt", 0L);
                i51.k("prefTCharge", 0L);
                i51.k("prefTSOn", 0L);
                i51.k("prefTSOff", 0L);
                i51.k("prefTDSDischarge", 0L);
                i51.k("prefTDSCharge", 0L);
                i51.j(0, "prefPCharge");
                i51.j(0, "prefPSOn");
                i51.j(0, "prefPSOff");
                if (this.p) {
                    i51.j(0, "prefCCharge");
                    i51.j(0, "prefCSOn");
                    i51.j(0, "prefPCOff");
                }
                i51.k("prefTBattMark", System.currentTimeMillis());
                i51.k("prefTChargeMark", System.currentTimeMillis());
                i51.k("prefTSOnMark", System.currentTimeMillis());
                i51.k("prefTSOffMark", System.currentTimeMillis());
                i51.k("prefTDSDischargeMark", e());
                i51.k(bOxzFZXgEkjph.yfgbswnmCthOgXZ, e());
                i51.j(g(), gXdyRQCGVlHW.RvuobfuXXnjtJw);
                i51.j(g(), "prefPSOnMark");
                i51.j(g(), "prefPSOffMark");
                if (this.p) {
                    i51.j(d(), XmJDY.LLEXu);
                    i51.j(d(), "prefCSOnMark");
                    i51.j(d(), "prefCSOffMark");
                }
                i51.k("prefBMFullMarker", 0L);
                i51.k("prefBMCustomMarker", 0L);
                i51.j(0, "prefBMSpinnerSelection");
                i51.k(ILBLnlCHDVqsSN.AtKckFauljCdJ, 0L);
                i51.k("prefCustomTSOn", 0L);
                i51.k("prefCustomTSOff", 0L);
                i51.j(0, bPnJ.RIiA);
                i51.j(0, "prefCustomPSOn");
                if (this.p) {
                    i51.j(0, "prefCustomCSOff");
                    i51.j(0, "prefCustomCSOn");
                }
                i51.k("prefCustomTDSDischarge", 0L);
                i51.k("prefCustomTCharge", 0L);
            }
            i51.k("prefBMStartMarker", 1L);
        } catch (Exception unused3) {
        }
        this.h = new w5(2, this);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        intentFilter.addAction("flar2.devcheck.BATTERY_MONITOR_UPDATE");
        int i3 = Build.VERSION.SDK_INT;
        w5 w5Var = this.h;
        if (i3 >= 33) {
            registerReceiver(w5Var, intentFilter, 4);
        } else {
            registerReceiver(w5Var, intentFilter);
        }
        this.z = new Handler();
        try {
            if (this.i.isHeld()) {
                this.i.release();
            }
        } catch (Exception unused4) {
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.z;
        if (handler != null) {
            handler.removeCallbacks(this.A);
        }
        i51.k(nyGJ.uSWVLmfwEfVF, -1L);
        w5 w5Var = this.h;
        if (w5Var != null) {
            unregisterReceiver(w5Var);
        }
        try {
            if (this.k == null) {
                this.k = (NotificationManager) getSystemService("notification");
            }
            this.k.cancel(48);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        try {
            Notification h = h();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                b8.l(this, h);
            } else if (i3 >= 29) {
                b8.j(this, h);
            } else {
                startForeground(48, h);
            }
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 31 && hf.u(e)) {
                return 2;
            }
        }
        this.m = f();
        if (this.x == null) {
            this.x = (PowerManager) getSystemService("power");
        }
        this.n = this.x.isPowerSaveMode();
        this.g = new jf(this.q);
        new Handler().postDelayed(new rf(this, 1), 0L);
        return 1;
    }
}
