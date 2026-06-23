package flar2.devcheck.tests;

import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.c3;
import defpackage.e90;
import defpackage.gd2;
import defpackage.l0;
import defpackage.n52;
import defpackage.op0;
import defpackage.oq0;
import defpackage.pq0;
import defpackage.pr;
import defpackage.sl;
import defpackage.uz1;
import defpackage.wa;
import flar2.devcheck.R;
import flar2.devcheck.tests.LightSensorActivity;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class LightSensorActivity extends a5 implements SensorEventListener {
    public static final l0 Q = new l0(3);
    public SensorManager F;
    public int[] G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public LineChart M;
    public HandlerThread N;
    public Handler O;
    public final ArrayList L = new ArrayList();
    public final wa P = new wa(14, this);

    public static pq0 C(int i) {
        pq0 pq0Var = new pq0(null, null);
        pq0Var.n(2.5f);
        pq0Var.e = false;
        pq0Var.l(i);
        pq0Var.z = false;
        return pq0Var;
    }

    public final void B(float f) {
        try {
            oq0 oq0Var = (oq0) this.M.getData();
            if (oq0Var != null) {
                try {
                    pq0 pq0Var = (pq0) oq0Var.e(0);
                    if (pq0Var == null) {
                        pq0Var = C(this.G[0]);
                        oq0Var.a(pq0Var);
                    }
                    if (Float.isFinite(f)) {
                        oq0Var.b(new e90(pq0Var.j.size(), f), 0);
                        oq0Var.c();
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    return;
                }
            }
            this.M.f();
            this.M.setVisibleXRangeMaximum(100.0f);
            if (oq0Var != null) {
                this.M.k(oq0Var.g());
            }
        } catch (Exception | OutOfMemoryError unused2) {
            finish();
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_sensor_test);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root);
        if (relativeLayout != null) {
            op0.a(relativeLayout, true, false, true, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.light_sensor));
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        this.F = (SensorManager) getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("light_refresh_thread", 19);
        this.N = handlerThread;
        handlerThread.start();
        this.O = new Handler(this.N.getLooper());
        this.G = new int[]{getColor(R.color.chart_blue), getColor(R.color.chart_red), getColor(R.color.chart_green), getColor(R.color.chart_orange)};
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sensor_parent_layout);
        linearLayout.addView((LinearLayout) getLayoutInflater().inflate(R.layout.sensor_test_light_card, (ViewGroup) null), linearLayout.getChildCount() - 2);
        this.H = (TextView) linearLayout.findViewById(R.id.lux);
        this.I = (TextView) linearLayout.findViewById(R.id.lux_max);
        this.J = (TextView) linearLayout.findViewById(R.id.lux_min);
        this.K = (TextView) linearLayout.findViewById(R.id.lux_avg);
        this.M = (LineChart) findViewById(R.id.sensor_chart);
        oq0 oq0Var = new oq0();
        oq0Var.k();
        this.M.setData(oq0Var);
        this.M.setLayerType(2, null);
        this.M.getLegend().f53a = false;
        this.M.getDescription().f53a = false;
        this.M.setDrawGridBackground(false);
        this.M.getXAxis().f53a = false;
        this.M.getAxisRight().f53a = false;
        this.M.getAxisLeft().a(10.0f);
        boolean d = uz1.d(this);
        LineChart lineChart = this.M;
        if (d) {
            lineChart.getAxisLeft().e = getColor(android.R.color.primary_text_dark);
        } else {
            lineChart.getAxisLeft().e = getColor(android.R.color.primary_text_light);
        }
        gd2 axisLeft = this.M.getAxisLeft();
        axisLeft.getClass();
        axisLeft.h = n52.c(0.5f);
        this.M.getAxisLeft().p = false;
        this.M.setTouchEnabled(false);
        this.M.setScaleEnabled(false);
        this.M.setPinchZoom(false);
        this.M.setHardwareAccelerationEnabled(true);
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: iq0
            public final /* synthetic */ LightSensorActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                LightSensorActivity lightSensorActivity = this.h;
                switch (i3) {
                    case 0:
                        l0 l0Var = LightSensorActivity.Q;
                        sharedPreferences2.edit().putBoolean(lightSensorActivity.getString(R.string.light_sensor), true).commit();
                        lightSensorActivity.finish();
                        break;
                    default:
                        l0 l0Var2 = LightSensorActivity.Q;
                        sharedPreferences2.edit().putBoolean(lightSensorActivity.getString(R.string.light_sensor), false).commit();
                        lightSensorActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: iq0
            public final /* synthetic */ LightSensorActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                LightSensorActivity lightSensorActivity = this.h;
                switch (i3) {
                    case 0:
                        l0 l0Var = LightSensorActivity.Q;
                        sharedPreferences2.edit().putBoolean(lightSensorActivity.getString(R.string.light_sensor), true).commit();
                        lightSensorActivity.finish();
                        break;
                    default:
                        l0 l0Var2 = LightSensorActivity.Q;
                        sharedPreferences2.edit().putBoolean(lightSensorActivity.getString(R.string.light_sensor), false).commit();
                        lightSensorActivity.finish();
                        break;
                }
            }
        });
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        synchronized (this) {
            Handler handler = this.O;
            if (handler != null) {
                handler.removeCallbacks(this.P);
            }
        }
        this.F.unregisterListener(this);
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        SensorManager sensorManager = this.F;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(5), 2);
        synchronized (this) {
            Handler handler = this.O;
            if (handler != null) {
                handler.post(this.P);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            float[] fArr = sensorEvent.values;
            this.H.setText(((DecimalFormat) Q.get()).format(fArr[0]) + " lx");
            this.L.add(Float.valueOf(fArr[0]));
        } catch (Exception unused) {
        }
    }
}
