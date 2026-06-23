package defpackage;

import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import moe.shizuku.api.hYGD.yttXLrAeLjN;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hy1 {

    /* renamed from: a, reason: collision with root package name */
    public String f406a;
    public int b;
    public String c;
    public ly1 d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(yttXLrAeLjN.JaVVOiFzlhFqiz, this.f406a);
            jSONObject.put("type", this.b);
            jSONObject.put("displayName", this.c);
            jSONObject.put("role", this.d.name());
            jSONObject.put("dieOrSkin", iy1.h(this.e));
            jSONObject.put("warningThreshold", this.f);
            jSONObject.put("criticalThreshold", this.g);
            jSONObject.put("minDisplay", this.h);
            jSONObject.put("maxDisplay", this.i);
            jSONObject.put(yFbVsaLCWAtQC.mwTaOFaPpHbnMrU, this.j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
