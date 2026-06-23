package flar2.devcheck.sensors;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.LineChart;
import defpackage.a5;
import defpackage.d51;
import defpackage.e90;
import defpackage.et;
import defpackage.l0;
import defpackage.oq0;
import defpackage.pq0;
import defpackage.rt0;
import defpackage.tl0;
import defpackage.tm;
import defpackage.zl1;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public class SensorActivity extends a5 implements SensorEventListener {
    public static final l0 m0 = new l0(5);
    public static final l0 n0 = new l0(6);
    public static final l0 o0;
    public static final l0 p0;
    public static final l0 q0;
    public static final l0 r0;
    public static final l0 s0;
    public SensorManager F;
    public int G;
    public String H;
    public String I;
    public Sensor J;
    public RecyclerView K;
    public tm L;
    public TextView M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public TextView S;
    public TextView T;
    public TextView V;
    public TextView W;
    public TextView X;
    public TextView Y;
    public TextView Z;
    public TextView a0;
    public TextView b0;
    public Vibrator d0;
    public MenuItem f0;
    public LineChart h0;
    public int[] i0;
    public HandlerThread j0;
    public Handler k0;
    public final ArrayList U = new ArrayList();
    public int c0 = 0;
    public int e0 = 0;
    public WeakReference g0 = null;
    public final zl1 l0 = new zl1(this, 1);

    static {
        new l0(7);
        o0 = new l0(8);
        p0 = new l0(9);
        q0 = new l0(10);
        r0 = new l0(11);
        s0 = new l0(12);
    }

    public static String D(Sensor sensor, boolean z) {
        int type = sensor.getType();
        l0 l0Var = m0;
        if (type != 1) {
            if (type == 2) {
                return (z ? ((DecimalFormat) l0Var.get()).format(sensor.getMaximumRange()) : ((DecimalFormat) l0Var.get()).format(sensor.getResolution())) + " µT";
            }
            if (type == 4) {
                return (z ? ((DecimalFormat) l0Var.get()).format(sensor.getMaximumRange()) : ((DecimalFormat) l0Var.get()).format(sensor.getResolution())) + " rad/s";
            }
            l0 l0Var2 = r0;
            if (type != 5) {
                if (type == 6) {
                    float maximumRange = z ? sensor.getMaximumRange() : sensor.getResolution();
                    if (et.f248a.d("prefFahrenheit")) {
                        return d51.v((DecimalFormat) l0Var.get(), maximumRange * 0.014503774f, new StringBuilder(), " in");
                    }
                    return d51.v((DecimalFormat) l0Var.get(), maximumRange, new StringBuilder(), " hPa");
                }
                if (type == 12) {
                    return (z ? ((DecimalFormat) l0Var.get()).format(sensor.getMaximumRange()) : ((DecimalFormat) l0Var.get()).format(sensor.getResolution())) + "%";
                }
                if (type != 13) {
                    if (type == 18 || type == 19) {
                        l0 l0Var3 = s0;
                        return z ? ((DecimalFormat) l0Var3.get()).format(sensor.getMaximumRange()) : ((DecimalFormat) l0Var3.get()).format(sensor.getResolution());
                    }
                    if (type != 65545) {
                        if (type != 33171031) {
                            switch (type) {
                                case 8:
                                    break;
                                case rt0.o /* 9 */:
                                case 10:
                                    break;
                                default:
                                    switch (type) {
                                        case 65538:
                                        case 65539:
                                            break;
                                        default:
                                            return z ? ((DecimalFormat) l0Var.get()).format(sensor.getMaximumRange()) : ((DecimalFormat) l0Var.get()).format(sensor.getResolution());
                                    }
                            }
                        }
                        float maximumRange2 = z ? sensor.getMaximumRange() : sensor.getResolution();
                        if (et.f248a.d("prefFahrenheit")) {
                            return d51.v((DecimalFormat) l0Var2.get(), maximumRange2 / 2.54f, new StringBuilder(), " in");
                        }
                        return d51.v((DecimalFormat) l0Var2.get(), maximumRange2, new StringBuilder(), " cm");
                    }
                }
                float maximumRange3 = z ? sensor.getMaximumRange() : sensor.getResolution();
                if (et.f248a.d("prefFahrenheit")) {
                    return d51.v((DecimalFormat) l0Var2.get(), (maximumRange3 * 1.8f) + 32.0f, new StringBuilder(), "°F");
                }
                return d51.v((DecimalFormat) l0Var2.get(), maximumRange3, new StringBuilder(), "°C");
            }
            return (z ? ((DecimalFormat) l0Var2.get()).format(sensor.getMaximumRange()) : ((DecimalFormat) l0Var2.get()).format(sensor.getResolution())) + " lx";
        }
        return (z ? ((DecimalFormat) l0Var.get()).format(sensor.getMaximumRange()) : ((DecimalFormat) l0Var.get()).format(sensor.getResolution())) + " m/s²";
    }

    public final void B(float f) {
        try {
            oq0 oq0Var = (oq0) this.h0.getData();
            if (oq0Var != null) {
                try {
                    pq0 pq0Var = (pq0) oq0Var.e(0);
                    if (pq0Var == null) {
                        int i = this.i0[0];
                        pq0 pq0Var2 = new pq0(null, null);
                        pq0Var2.n(2.5f);
                        pq0Var2.e = false;
                        pq0Var2.l(i);
                        pq0Var2.z = false;
                        oq0Var.a(pq0Var2);
                        pq0Var = pq0Var2;
                    }
                    if (Float.isFinite(f)) {
                        oq0Var.b(new e90(pq0Var.j.size(), f), 0);
                        oq0Var.c();
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return;
                }
            }
            this.h0.f();
            this.h0.setVisibleXRangeMaximum(100.0f);
            if (oq0Var != null) {
                this.h0.k(oq0Var.g());
            }
        } catch (Exception | OutOfMemoryError unused2) {
            finish();
        }
    }

    public final void C(float[] fArr) {
        try {
            oq0 oq0Var = (oq0) this.h0.getData();
            for (int i = 0; i < fArr.length; i++) {
                if (oq0Var != null) {
                    pq0 pq0Var = (pq0) oq0Var.e(i);
                    if (pq0Var == null) {
                        int i2 = this.i0[i];
                        pq0 pq0Var2 = new pq0(null, null);
                        pq0Var2.n(2.5f);
                        pq0Var2.e = false;
                        pq0Var2.l(i2);
                        pq0Var2.z = false;
                        oq0Var.a(pq0Var2);
                        pq0Var = pq0Var2;
                    }
                    if (Float.isFinite(fArr[i])) {
                        oq0Var.b(new e90(pq0Var.j.size(), fArr[i]), i);
                        oq0Var.c();
                    }
                }
            }
            this.h0.f();
            this.h0.setVisibleXRangeMaximum(100.0f);
            if (oq0Var != null) {
                this.h0.k(oq0Var.g());
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0185 A[FALL_THROUGH] */
    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.sensors.SensorActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sensor, menu);
        MenuItem findItem = menu.findItem(R.id.action_tempunit);
        this.f0 = findItem;
        int i = this.G;
        if (i == 5 || i == 65545 || i == 131088 || i == 1 || i == 2 || i == 4 || i == 9 || i == 10 || i == 18 || i == 19 || i == 27 || i == 15 || i == 3) {
            findItem.setVisible(false);
            return true;
        }
        boolean d = et.f248a.d("prefFahrenheit");
        MenuItem menuItem = this.f0;
        if (d) {
            menuItem.setTitle(R.string.units_metric);
            return true;
        }
        menuItem.setTitle(R.string.units_imperial);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        if (itemId != R.id.action_tempunit) {
            return super.onOptionsItemSelected(menuItem);
        }
        boolean d = et.f248a.d("prefFahrenheit");
        MenuItem menuItem2 = this.f0;
        if (d) {
            menuItem2.setTitle(getResources().getString(R.string.units_imperial));
            et.c("prefFahrenheit", false);
            return true;
        }
        menuItem2.setTitle(getResources().getString(R.string.units_metric));
        et.c("prefFahrenheit", true);
        return true;
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        tl0.a("sensor_detail");
        tm tmVar = this.L;
        if (tmVar != null) {
            tmVar.cancel(true);
        }
        int i = this.G;
        if (i == 5 || i == 65545) {
            synchronized (this) {
                Handler handler = this.k0;
                if (handler != null) {
                    handler.removeCallbacks(this.l0);
                }
            }
        }
        this.F.unregisterListener((SensorEventListener) this.g0.get());
    }

    @Override // defpackage.zt, android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (menu.getClass().getSimpleName().equals("MenuBuilder")) {
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
        tl0.b(this, "sensor_detail");
        this.F.registerListener((SensorEventListener) this.g0.get(), this.F.getDefaultSensor(this.G), 2);
        tm tmVar = new tm(this, 1);
        this.L = tmVar;
        try {
            try {
                tmVar.executeOnExecutor(MainApp.h, new Void[0]);
            } catch (RejectedExecutionException unused) {
                this.L.executeOnExecutor(MainApp.h, new Void[0]);
            }
        } catch (Exception unused2) {
        }
        int i = this.G;
        if (i == 5 || i == 65545) {
            synchronized (this) {
                Handler handler = this.k0;
                if (handler != null) {
                    handler.post(this.l0);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0305 A[Catch: Exception -> 0x068d, TryCatch #0 {Exception -> 0x068d, blocks: (B:30:0x007c, B:50:0x00bf, B:54:0x00d2, B:56:0x00f3, B:58:0x0114, B:61:0x041b, B:65:0x042b, B:68:0x0471, B:70:0x0493, B:72:0x0449, B:73:0x05d8, B:75:0x013d, B:79:0x014d, B:81:0x016c, B:83:0x018d, B:85:0x01f2, B:87:0x0266, B:89:0x0305, B:91:0x051a, B:93:0x036a, B:95:0x0372, B:97:0x037e, B:100:0x0389, B:103:0x0395, B:106:0x03a3, B:108:0x03c4, B:109:0x03c9, B:110:0x03f4, B:112:0x03e2, B:114:0x04b5, B:117:0x054c, B:127:0x0566, B:129:0x0582, B:131:0x059e, B:133:0x05ba), top: B:29:0x007c, inners: #1 }] */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r23) {
        /*
            Method dump skipped, instructions count: 1718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.sensors.SensorActivity.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
