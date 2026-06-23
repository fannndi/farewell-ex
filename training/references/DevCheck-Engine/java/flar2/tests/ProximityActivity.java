package flar2.devcheck.tests;

import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import defpackage.a5;
import defpackage.c3;
import defpackage.e90;
import defpackage.et;
import defpackage.gd2;
import defpackage.l0;
import defpackage.n52;
import defpackage.op0;
import defpackage.oq0;
import defpackage.pq0;
import defpackage.pr;
import defpackage.r60;
import defpackage.sl;
import defpackage.uz1;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import flar2.devcheck.tests.ProximityActivity;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public class ProximityActivity extends a5 implements SensorEventListener {
    public static final l0 K = new l0(4);
    public SensorManager F;
    public int[] G;
    public TextView H;
    public TextView I;
    public LineChart J;

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
        r().m0(getResources().getString(R.string.proximity));
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        ((TextView) findViewById(R.id.sensor_msg)).setText(R.string.proximity_msg);
        this.F = (SensorManager) getApplicationContext().getSystemService("sensor");
        this.G = new int[]{getColor(R.color.chart_blue), getColor(R.color.chart_red), getColor(R.color.chart_green), getColor(R.color.chart_orange)};
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sensor_parent_layout);
        linearLayout.addView((LinearLayout) getLayoutInflater().inflate(R.layout.sensor_proximity_card, (ViewGroup) null), linearLayout.getChildCount() - 2);
        this.H = (TextView) linearLayout.findViewById(R.id.proximity_distance);
        this.I = (TextView) linearLayout.findViewById(R.id.proximity_status);
        ((MaterialCardView) linearLayout.findViewById(R.id.card_view)).setCardBackgroundColor(0);
        this.J = (LineChart) findViewById(R.id.sensor_chart);
        oq0 oq0Var = new oq0();
        oq0Var.k();
        this.J.setData(oq0Var);
        this.J.setLayerType(2, null);
        this.J.getLegend().f53a = false;
        this.J.getDescription().f53a = false;
        this.J.setDrawGridBackground(false);
        this.J.getXAxis().f53a = false;
        this.J.getAxisRight().f53a = false;
        this.J.getAxisLeft().a(10.0f);
        boolean d = uz1.d(this);
        LineChart lineChart = this.J;
        if (d) {
            lineChart.getAxisLeft().e = getColor(android.R.color.primary_text_dark);
        } else {
            lineChart.getAxisLeft().e = getColor(android.R.color.primary_text_light);
        }
        gd2 axisLeft = this.J.getAxisLeft();
        axisLeft.getClass();
        axisLeft.h = n52.c(0.5f);
        this.J.getAxisLeft().p = false;
        this.J.setTouchEnabled(false);
        this.J.setScaleEnabled(false);
        this.J.setPinchZoom(false);
        this.J.setHardwareAccelerationEnabled(true);
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: eb1
            public final /* synthetic */ ProximityActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                ProximityActivity proximityActivity = this.h;
                switch (i3) {
                    case 0:
                        l0 l0Var = ProximityActivity.K;
                        sharedPreferences2.edit().putBoolean(proximityActivity.getString(R.string.proximity), true).commit();
                        proximityActivity.finish();
                        break;
                    default:
                        l0 l0Var2 = ProximityActivity.K;
                        sharedPreferences2.edit().putBoolean(proximityActivity.getString(R.string.proximity), false).commit();
                        proximityActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: eb1
            public final /* synthetic */ ProximityActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                ProximityActivity proximityActivity = this.h;
                switch (i3) {
                    case 0:
                        l0 l0Var = ProximityActivity.K;
                        sharedPreferences2.edit().putBoolean(proximityActivity.getString(R.string.proximity), true).commit();
                        proximityActivity.finish();
                        break;
                    default:
                        l0 l0Var2 = ProximityActivity.K;
                        sharedPreferences2.edit().putBoolean(proximityActivity.getString(R.string.proximity), false).commit();
                        proximityActivity.finish();
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
        MainApp.h.execute(new r60(14, this));
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 8) {
            float[] copyOf = Arrays.copyOf(sensorEvent.values, 1);
            oq0 oq0Var = (oq0) this.J.getData();
            for (int i = 0; i < copyOf.length; i++) {
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
                        if (Float.isFinite(copyOf[i])) {
                            oq0Var.b(new e90(pq0Var.j.size(), copyOf[i]), i);
                            oq0Var.c();
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                }
                try {
                    this.J.f();
                    this.J.setVisibleXRangeMaximum(100.0f);
                    if (oq0Var != null) {
                        this.J.k(oq0Var.g());
                    }
                } catch (NullPointerException unused2) {
                }
            }
        }
        try {
            float f = sensorEvent.values[0];
            boolean d = et.f248a.d(bOxzFZXgEkjph.RbXOnDJ);
            TextView textView = this.H;
            l0 l0Var = K;
            if (d) {
                f /= 2.54f;
                textView.setText(((DecimalFormat) l0Var.get()).format(f) + " in");
            } else {
                textView.setText(((DecimalFormat) l0Var.get()).format(f) + " cm");
            }
            TextView textView2 = this.I;
            String str = jYVJoqfHJs.QAhuawh;
            if (f > 0.0f) {
                textView2.setText(getString(R.string.status) + str + getString(R.string.far));
                return;
            }
            textView2.setText(getString(R.string.status) + str + getString(R.string.near));
        } catch (NumberFormatException | Exception unused3) {
        }
    }
}
