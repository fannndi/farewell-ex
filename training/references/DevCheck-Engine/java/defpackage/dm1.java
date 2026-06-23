package defpackage;

import Cwd.ynLVXgis;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dm1 {

    /* renamed from: a, reason: collision with root package name */
    public int f198a;
    public String b;
    public int c;
    public boolean d = false;
    public ArrayList e = new ArrayList();

    public static dm1 a(JSONObject jSONObject) {
        dm1 dm1Var = new dm1();
        dm1Var.f198a = jSONObject.optInt("schemaVersion", 0);
        dm1Var.b = jSONObject.optString(ynLVXgis.TfICvQrWFzI, "");
        dm1Var.c = jSONObject.optInt("sdkInt", 0);
        dm1Var.d = jSONObject.optBoolean("hasSensors", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("labels");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                dm1Var.e.add(optJSONArray.optString(i));
            }
        }
        return dm1Var;
    }
}
