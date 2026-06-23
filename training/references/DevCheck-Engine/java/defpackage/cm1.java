package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class cm1 implements SensorEventListener {
    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        float f = fArr[0];
        String name = sensorEvent.sensor.getName();
        HashMap hashMap = em1.f237a;
        synchronized (hashMap) {
            hashMap.put(name, Float.valueOf(f));
        }
    }
}
