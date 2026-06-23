package defpackage;

import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dg {

    /* renamed from: a, reason: collision with root package name */
    public int f190a;
    public String b;
    public int c;
    public boolean d;

    public static dg a(JSONObject jSONObject) {
        dg dgVar = new dg();
        dgVar.f190a = jSONObject.optInt("schemaVersion", 0);
        dgVar.b = jSONObject.optString(GFUHKHDfiFuPm.qcAvFaCjFr, "");
        dgVar.c = jSONObject.optInt("sdkInt", 0);
        dgVar.d = jSONObject.optBoolean("hasBatteryTemp", false);
        return dgVar;
    }
}
