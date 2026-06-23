package flar2.devcheck.tests;

import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
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
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.tests.AccelerometerActivity;
import java.text.DecimalFormat;
import java.util.Objects;

/* loaded from: classes.dex */
public class AccelerometerActivity extends a5 implements SensorEventListener {
    public static final l0 L = new l0(0);
    public SensorManager F;
    public int[] G;
    public LineChart H;
    public TextView I;
    public TextView J;
    public TextView K;

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
        r().m0(getResources().getString(R.string.accelerometer));
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(RIhTGWkqQvGL.WTYgFt, 0);
        this.F = (SensorManager) getApplicationContext().getSystemService("sensor");
        this.G = new int[]{getColor(R.color.chart_blue), getColor(R.color.chart_red), getColor(R.color.chart_green), getColor(R.color.chart_orange)};
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sensor_parent_layout);
        linearLayout.addView((LinearLayout) getLayoutInflater().inflate(R.layout.sensor_three_axis_card, (ViewGroup) null), linearLayout.getChildCount() - 2);
        this.I = (TextView) linearLayout.findViewById(R.id.x_axis);
        this.J = (TextView) linearLayout.findViewById(R.id.y_axis);
        this.K = (TextView) linearLayout.findViewById(R.id.z_axis);
        ((MaterialCardView) linearLayout.findViewById(R.id.hardware_card)).setCardBackgroundColor(0);
        this.H = (LineChart) findViewById(R.id.sensor_chart);
        oq0 oq0Var = new oq0();
        oq0Var.k();
        this.H.setData(oq0Var);
        this.H.setLayerType(2, null);
        this.H.getLegend().f53a = false;
        this.H.getDescription().f53a = false;
        this.H.setDrawGridBackground(false);
        this.H.getXAxis().f53a = false;
        this.H.getAxisRight().f53a = false;
        this.H.getAxisLeft().a(10.0f);
        boolean d = uz1.d(this);
        LineChart lineChart = this.H;
        if (d) {
            lineChart.getAxisLeft().e = getColor(android.R.color.primary_text_dark);
        } else {
            lineChart.getAxisLeft().e = getColor(android.R.color.primary_text_light);
        }
        gd2 axisLeft = this.H.getAxisLeft();
        axisLeft.getClass();
        axisLeft.h = n52.c(0.5f);
        this.H.getAxisLeft().p = false;
        this.H.setTouchEnabled(false);
        this.H.setScaleEnabled(false);
        this.H.setPinchZoom(false);
        this.H.setHardwareAccelerationEnabled(true);
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: k0
            public final /* synthetic */ AccelerometerActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                AccelerometerActivity accelerometerActivity = this.h;
                switch (i3) {
                    case 0:
                        l0 l0Var = AccelerometerActivity.L;
                        sharedPreferences2.edit().putBoolean(accelerometerActivity.getString(R.string.accelerometer), true).commit();
                        accelerometerActivity.finish();
                        break;
                    default:
                        l0 l0Var2 = AccelerometerActivity.L;
                        sharedPreferences2.edit().putBoolean(accelerometerActivity.getString(R.string.accelerometer), false).commit();
                        accelerometerActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: k0
            public final /* synthetic */ AccelerometerActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                AccelerometerActivity accelerometerActivity = this.h;
                switch (i3) {
                    case 0:
                        l0 l0Var = AccelerometerActivity.L;
                        sharedPreferences2.edit().putBoolean(accelerometerActivity.getString(R.string.accelerometer), true).commit();
                        accelerometerActivity.finish();
                        break;
                    default:
                        l0 l0Var2 = AccelerometerActivity.L;
                        sharedPreferences2.edit().putBoolean(accelerometerActivity.getString(R.string.accelerometer), false).commit();
                        accelerometerActivity.finish();
                        break;
                }
            }
        });
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.F.unregisterListener(this);
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        SensorManager sensorManager = this.F;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 2);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        oq0 oq0Var = (oq0) this.H.getData();
        for (int i = 0; i < fArr.length; i++) {
            if (oq0Var != null) {
                try {
                    pq0 pq0Var = (pq0) oq0Var.e(i);
                    if (pq0Var == null) {
                        int i2 = this.G[i];
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
                } catch (Exception unused) {
                }
            }
        }
        this.H.f();
        this.H.setVisibleXRangeMaximum(100.0f);
        if (oq0Var != null) {
            this.H.k(oq0Var.g());
        }
        String str = GFUHKHDfiFuPm.JEPxqZQfLXJwa;
        try {
            float[] fArr2 = sensorEvent.values;
            TextView textView = this.I;
            StringBuilder sb = new StringBuilder("x: ");
            l0 l0Var = L;
            sb.append(((DecimalFormat) l0Var.get()).format(fArr2[0]));
            sb.append(" m/s²");
            textView.setText(sb.toString());
            this.J.setText(str + ((DecimalFormat) l0Var.get()).format(fArr2[1]) + " m/s²");
            this.K.setText("z: " + ((DecimalFormat) l0Var.get()).format((double) fArr2[2]) + " m/s²");
        } catch (Exception unused2) {
        }
    }
}
