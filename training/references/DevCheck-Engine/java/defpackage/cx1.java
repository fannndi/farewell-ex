package defpackage;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.media.RfwE.BIxeFreLLop;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class cx1 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ ex1 h;

    public /* synthetic */ cx1(ex1 ex1Var, int i) {
        this.g = i;
        this.h = ex1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dm1 dm1Var;
        SensorManager sensorManager;
        int i = this.g;
        int i2 = 0;
        ex1 ex1Var = this.h;
        switch (i) {
            case 0:
                Application application = ex1Var.b;
                application.getClass();
                String[] strArr = au1.f54a;
                application.getSharedPreferences("devcheck_sysfs_thermal_schema", 0).edit().remove("sysfs_schema_json_v1").apply();
                Application application2 = ex1Var.g;
                ex1Var.k = au1.b(application2, new im());
                my1 my1Var = ex1Var.i;
                i51.a("schema_json_v1");
                ex1Var.j = pr.E(application2, my1Var);
                HashMap hashMap = em1.f237a;
                application.getSharedPreferences("devcheck_sensors_schema", 0).edit().remove("sensors_schema_json_v1").apply();
                ex1Var.l = em1.a(application, ex1Var.h);
                application.getSharedPreferences("devcheck_battery_schema", 0).edit().remove("battery_schema_json_v1").apply();
                ex1Var.m = pr.D(application);
                break;
            default:
                if (ex1Var.n && (dm1Var = ex1Var.l) != null && (sensorManager = ex1Var.h) != null) {
                    HashMap hashMap2 = em1.f237a;
                    if (dm1Var.d && em1.b == null) {
                        em1.b = new cm1();
                        ArrayList arrayList = new ArrayList();
                        Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                        if (defaultSensor != null) {
                            arrayList.add(defaultSensor);
                        }
                        for (Sensor sensor : sensorManager.getSensorList(-1)) {
                            if (sensor != defaultSensor) {
                                String lowerCase = String.valueOf(sensor.getName()).toLowerCase();
                                String lowerCase2 = String.valueOf(sensor.getStringType()).toLowerCase();
                                if (lowerCase2.contains("temp") || lowerCase2.contains(BIxeFreLLop.yPbilXXwqLkqJC) || lowerCase.contains("temp") || lowerCase.contains("therm")) {
                                    arrayList.add(sensor);
                                }
                            }
                        }
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            sensorManager.registerListener(em1.b, (Sensor) obj, 3);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
