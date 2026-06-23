package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class em1 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f237a = new HashMap();
    public static cm1 b;

    public static dm1 a(Context context, SensorManager sensorManager) {
        int i = 0;
        dm1 dm1Var = null;
        String string = context.getSharedPreferences("devcheck_sensors_schema", 0).getString("sensors_schema_json_v1", null);
        if (string != null) {
            try {
                dm1Var = dm1.a(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        if (dm1Var != null && dm1Var.f198a == 1 && TextUtils.equals(dm1Var.b, Build.FINGERPRINT) && dm1Var.c == Build.VERSION.SDK_INT) {
            return dm1Var;
        }
        dm1 dm1Var2 = new dm1();
        dm1Var2.f198a = 1;
        dm1Var2.b = Build.FINGERPRINT;
        dm1Var2.c = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        Sensor defaultSensor = sensorManager.getDefaultSensor(13);
        if (defaultSensor != null) {
            arrayList.add(defaultSensor.getName());
        }
        for (Sensor sensor : sensorManager.getSensorList(-1)) {
            if (sensor != defaultSensor) {
                String lowerCase = String.valueOf(sensor.getName()).toLowerCase();
                String lowerCase2 = String.valueOf(sensor.getStringType()).toLowerCase();
                if (lowerCase2.contains("temp") || lowerCase2.contains("temperature") || lowerCase.contains("temp") || lowerCase.contains("therm")) {
                    arrayList.add(sensor.getName());
                }
            }
        }
        dm1Var2.e = arrayList;
        dm1Var2.d = !arrayList.isEmpty();
        SharedPreferences.Editor edit = context.getSharedPreferences("devcheck_sensors_schema", 0).edit();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("schemaVersion", dm1Var2.f198a);
            jSONObject.put("deviceFingerprint", dm1Var2.b);
            jSONObject.put("sdkInt", dm1Var2.c);
            jSONObject.put("hasSensors", dm1Var2.d);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList2 = dm1Var2.e;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                jSONArray.put((String) obj);
            }
            jSONObject.put("labels", jSONArray);
        } catch (JSONException unused2) {
        }
        edit.putString("sensors_schema_json_v1", jSONObject.toString()).apply();
        return dm1Var2;
    }
}
