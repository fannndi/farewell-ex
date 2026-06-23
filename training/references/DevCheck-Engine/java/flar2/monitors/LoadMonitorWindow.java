package flar2.devcheck.monitors;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.d10;
import defpackage.d51;
import defpackage.go1;
import defpackage.i51;
import defpackage.je2;
import defpackage.ju0;
import defpackage.nq1;
import defpackage.op0;
import defpackage.oq1;
import defpackage.ps0;
import defpackage.r60;
import defpackage.rt0;
import defpackage.tf;
import defpackage.uz1;
import defpackage.w5;
import defpackage.wn1;
import defpackage.xj;
import defpackage.z92;
import defpackage.zx0;
import flar2.devcheck.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import rikka.shizuku.ShizukuProvider;

/* loaded from: classes.dex */
public class LoadMonitorWindow extends oq1 implements Runnable {
    public static final String[] O = {"/sys/devices/system/cpu/cpufreq/stats/cpu0/time_in_state", "/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state"};
    public int A;
    public w5 B;
    public Handler C;
    public Handler D;
    public HandlerThread E;
    public RandomAccessFile G;
    public int H;
    public int K;
    public int L;
    public go1 M;
    public File N;
    public tf o;
    public SharedPreferences p;
    public View q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public boolean F = false;
    public long I = 0;
    public long J = 0;

    public static String A(String str) {
        try {
            for (String str2 : uz1.w(str)) {
                if (!str2.split(" ")[1].equals("0")) {
                    return str2.substring(0, str2.indexOf(" "));
                }
            }
        } catch (Exception unused) {
        }
        return uz1.K("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq");
    }

    @Override // defpackage.oq1
    public final void e(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.loadmon_layout, (ViewGroup) frameLayout, true);
        try {
            ShizukuProvider.a(getApplicationContext());
        } catch (Throwable unused) {
        }
        go1 m = op0.m(getApplicationContext());
        this.M = m;
        je2.d(m, new r60(6, this));
        this.v = 16;
        if (getResources().getBoolean(R.bool.isTablet)) {
            this.v = 20;
        }
        this.y = getResources().getDimensionPixelOffset(R.dimen.statusbar_padding_bottom);
        this.x = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_3dp);
        this.w = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_6dp);
        this.z = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_5dp);
        this.A = getResources().getDimensionPixelOffset(R.dimen.monitor_padding_2dp);
        TextView textView = (TextView) inflate.findViewById(R.id.cpu_load);
        this.r = textView;
        int i = this.v;
        SharedPreferences sharedPreferences = zx0.f1292a;
        textView.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", i));
        TextView textView2 = (TextView) inflate.findViewById(R.id.load_label);
        this.s = textView2;
        textView2.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.v));
        TextView textView3 = (TextView) inflate.findViewById(R.id.load_test1);
        this.t = textView3;
        textView3.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.v));
        TextView textView4 = (TextView) inflate.findViewById(R.id.load_test2);
        this.u = textView4;
        textView4.setTextSize(sharedPreferences.getInt("prefMonitorTextSize", this.v));
        this.s.setText(getString(R.string.load));
        View findViewById = inflate.findViewById(R.id.loadmon_background);
        this.q = findViewById;
        findViewById.getBackground().setAlpha(sharedPreferences.getInt("prefMonitorAlpha", 44));
        this.B = new w5(14, this);
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
        z();
        HandlerThread handlerThread = new HandlerThread("load_refresh_thread", 10);
        this.E = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.E.getLooper());
        this.D = handler;
        handler.postDelayed(this, 500L);
        this.F = true;
        this.C = new Handler();
        y();
        this.o = new tf(this, 5);
        SharedPreferences sharedPreferences2 = d10.n().getSharedPreferences("monitors", 0);
        this.p = sharedPreferences2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(this.o);
        this.q.setOnSystemUiVisibilityChangeListener(new ps0(this, 0));
    }

    @Override // defpackage.oq1
    public final String g() {
        return "LoadMonitor";
    }

    @Override // defpackage.oq1
    public final int j() {
        return rt0.q | rt0.x;
    }

    @Override // defpackage.oq1
    public final nq1 l(int i) {
        if (zx0.b("prefMonitorClickThru").booleanValue()) {
            SharedPreferences sharedPreferences = zx0.f1292a;
            return new nq1(this, i, true, sharedPreferences.getInt("prefLoadMonPosX", 0), sharedPreferences.getInt("prefLoadMonPosY", 480));
        }
        SharedPreferences sharedPreferences2 = zx0.f1292a;
        return new nq1(this, i, false, sharedPreferences2.getInt("prefLoadMonPosX", 0), sharedPreferences2.getInt("prefLoadMonPosY", 480));
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            int i = getResources().getConfiguration().orientation;
            if (i == 1) {
                zx0.a(this.q);
            } else if (i != 2) {
                zx0.a(this.q);
            } else if (zx0.b("prefMonitorLandscape").booleanValue()) {
                this.q.setTranslationY(-8000.0f);
            }
        } catch (NullPointerException unused) {
        }
    }

    @Override // defpackage.oq1
    public final void q() {
        HandlerThread handlerThread = this.E;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacks(this.E);
        }
        try {
            RandomAccessFile randomAccessFile = this.G;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } catch (IOException unused) {
        }
        try {
            w5 w5Var = this.B;
            if (w5Var != null) {
                unregisterReceiver(w5Var);
            }
        } catch (IllegalArgumentException unused2) {
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
        } catch (Exception unused3) {
        }
    }

    @Override // defpackage.oq1
    public final void r(z92 z92Var, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).x, "prefLoadMonPosX");
            zx0.d(((WindowManager.LayoutParams) z92Var.getLayoutParams()).y, "prefLoadMonPosY");
        }
        if (motionEvent.getAction() == 2) {
            zx0.c("prefLoadStatusBar", zx0.b("prefSnapStatusBar").booleanValue() && ((WindowManager.LayoutParams) z92Var.getLayoutParams()).y <= 0);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        if (this.F) {
            Process.setThreadPriority(10);
            try {
                int A = d51.A(this.H);
                long j = 0;
                int i3 = 0;
                if (A != 1) {
                    if (A == 2) {
                        String[] split = this.G.readLine().substring(5).split(" ");
                        long h = d51.h(split[3]);
                        int length = split.length;
                        long j2 = 0;
                        while (i3 < length) {
                            j2 += d51.h(split[i3]);
                            i3++;
                        }
                        i2 = (int) ((1.0d - ((h - this.I) / (j2 - this.J))) * 100.0d);
                        this.I = h;
                        this.J = j2;
                        this.G.seek(0L);
                    } else if (A != 3) {
                        i = -1;
                        if (A == 4) {
                            String u = ju0.u("head -n 1 /proc/stat");
                            if (u != null && u.startsWith("cpu")) {
                                String[] split2 = u.substring(5).trim().split("\\s+");
                                long parseLong = Long.parseLong(split2[3]);
                                int length2 = split2.length;
                                while (i3 < length2) {
                                    j += Long.parseLong(split2[i3]);
                                    i3++;
                                }
                                i2 = (int) ((1.0d - ((parseLong - this.I) / (j - this.J))) * 100.0d);
                                this.I = parseLong;
                                this.J = j;
                            }
                        } else if (A != 5) {
                            try {
                                double parseDouble = Double.parseDouble(this.G.readLine());
                                double d = this.L;
                                String str = uz1.f1060a;
                                int i4 = (int) (((parseDouble - 100.0d) / (d - 100.0d)) * 100.0d);
                                this.K = i4;
                                i2 = (int) ((this.K + i4) / 2.0d);
                                this.G.seek(0L);
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        String[] split3 = ((String) wn1.a("cat /proc/stat").o().c().get(0)).substring(5).split(" ");
                        long h2 = d51.h(split3[3]);
                        int length3 = split3.length;
                        while (i3 < length3) {
                            j += d51.h(split3[i3]);
                            i3++;
                        }
                        i2 = (int) ((1.0d - ((h2 - this.I) / (j - this.J))) * 100.0d);
                        this.I = h2;
                        this.J = j;
                    }
                    i = i2;
                } else {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        String readLine = this.G.readLine();
                        if (readLine == null || !readLine.contains(" = ")) {
                            break;
                        }
                        i5 += Integer.parseInt(readLine.split(" = ")[1].split("/")[0]);
                        i6++;
                    }
                    i = i5 / i6;
                    this.G.seek(0L);
                }
                this.C.post(new xj(i, 2, this));
            } catch (Exception unused2) {
            }
            this.D.postDelayed(this, 500L);
        }
    }

    public final void y() {
        boolean booleanValue = zx0.b("prefLoadStatusBar").booleanValue();
        View view = this.q;
        if (booleanValue) {
            view.getBackground().setAlpha(0);
            int U = uz1.U();
            if (U < 24) {
                View view2 = this.q;
                int i = this.x;
                view2.setPadding(i, this.A, i, this.y);
            } else if (U > 32) {
                View view3 = this.q;
                int i2 = this.x;
                view3.setPadding(i2, U - 5, i2, this.y);
            } else {
                View view4 = this.q;
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
            this.s.setVisibility(8);
            this.t.setVisibility(8);
            this.u.setVisibility(8);
        } else {
            view.getBackground().setAlpha(zx0.f1292a.getInt("prefMonitorAlpha", 44));
            View view5 = this.q;
            int i5 = this.w;
            view5.setPadding(i5, this.x, i5, i5);
            this.r.setTextSize(r2.getInt("prefMonitorTextSize", this.v));
            this.s.setVisibility(0);
            this.s.setTextSize(r2.getInt("prefMonitorTextSize", this.v));
            this.t.setVisibility(0);
            this.t.setTextSize(r2.getInt("prefMonitorTextSize", this.v));
            this.u.setVisibility(0);
            this.u.setTextSize(r2.getInt("prefMonitorTextSize", this.v));
        }
        if (zx0.b("prefLoadStatusBar").booleanValue()) {
            this.r.setTextColor(-7829368);
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

    public final void z() {
        if (this.M.d()) {
            this.G = null;
            this.H = 5;
            return;
        }
        if (i51.b("prefRoot").booleanValue()) {
            this.G = null;
            this.H = 4;
            return;
        }
        int i = Build.VERSION.SDK_INT;
        String[] strArr = O;
        if (i < 26) {
            this.N = new File("/proc/stat");
            try {
                try {
                    this.G = new RandomAccessFile(this.N, "r");
                    this.H = 3;
                    return;
                } catch (FileNotFoundException unused) {
                    this.L = Integer.parseInt(uz1.A0(uz1.K("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq")));
                    try {
                        Integer.parseInt(A(strArr[uz1.P(strArr)]));
                    } catch (Exception unused2) {
                    }
                    this.H = 1;
                    return;
                }
            } catch (Exception unused3) {
                this.L = 1800;
                Integer.parseInt(A(strArr[uz1.P(strArr)]));
                this.H = 1;
                return;
            }
        }
        if (!uz1.q("/sys/devices/system/cpu/rq-stats/cpu_normalized_load")) {
            try {
                String str = strArr[uz1.P(strArr)];
                this.L = Integer.parseInt(uz1.K("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            } catch (Exception unused4) {
                this.L = 1800000;
            }
            try {
                Integer.parseInt(A(strArr[uz1.P(strArr)]));
            } catch (Exception unused5) {
            }
            this.N = new File("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq");
            try {
                this.G = new RandomAccessFile(this.N, "r");
                this.H = 1;
                return;
            } catch (FileNotFoundException unused6) {
                this.H = 0;
                return;
            }
        }
        this.N = new File("/sys/devices/system/cpu/rq-stats/cpu_normalized_load");
        try {
            try {
                this.G = new RandomAccessFile(this.N, "r");
                this.H = 2;
            } catch (FileNotFoundException unused7) {
                this.L = Integer.parseInt(uz1.A0(uz1.K("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq")));
                try {
                    Integer.parseInt(A(strArr[uz1.P(strArr)]));
                } catch (Exception unused8) {
                }
                this.H = 1;
            }
        } catch (Exception unused9) {
            this.L = 1800;
            Integer.parseInt(A(strArr[uz1.P(strArr)]));
            this.H = 1;
        }
    }
}
