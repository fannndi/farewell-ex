package defpackage;

import androidx.media.RfwE.BIxeFreLLop;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ny1 {

    /* renamed from: a, reason: collision with root package name */
    public int f707a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public ArrayList g = new ArrayList();

    public static String a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jy1 jy1Var = (jy1) obj;
            arrayList2.add(jy1Var.b + ":" + jy1Var.c);
        }
        Collections.sort(arrayList2);
        StringBuilder sb = new StringBuilder();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            sb.append((String) obj2);
            sb.append("|");
        }
        return Integer.toHexString(sb.toString().hashCode());
    }

    public static ny1 b(JSONObject jSONObject) {
        ny1 ny1Var = new ny1();
        ny1Var.f707a = jSONObject.optInt("schemaVersion", 0);
        ny1Var.b = jSONObject.optString("deviceModel", "");
        ny1Var.c = jSONObject.optString("deviceFingerprint", "");
        ny1Var.d = jSONObject.optInt("sdkInt", 0);
        ny1Var.e = jSONObject.optString("halId", "");
        ny1Var.f = jSONObject.optString("sensorSignature", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("sensors");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    ArrayList arrayList = ny1Var.g;
                    hy1 hy1Var = new hy1();
                    hy1Var.f406a = optJSONObject.optString("name", "");
                    hy1Var.b = optJSONObject.optInt("type", -1);
                    hy1Var.c = optJSONObject.optString("displayName", hy1Var.f406a);
                    hy1Var.d = ly1.valueOf(optJSONObject.optString("role", "OTHER"));
                    hy1Var.e = iy1.i(optJSONObject.optString("dieOrSkin", "UNKNOWN"));
                    hy1Var.f = (float) optJSONObject.optDouble("warningThreshold", 0.0d);
                    hy1Var.g = (float) optJSONObject.optDouble("criticalThreshold", 0.0d);
                    hy1Var.h = (float) optJSONObject.optDouble(BIxeFreLLop.gFSXNaajjg, 0.0d);
                    hy1Var.i = (float) optJSONObject.optDouble("maxDisplay", 0.0d);
                    hy1Var.j = optJSONObject.optBoolean("useForUi", true);
                    arrayList.add(hy1Var);
                }
            }
        }
        return ny1Var;
    }
}
