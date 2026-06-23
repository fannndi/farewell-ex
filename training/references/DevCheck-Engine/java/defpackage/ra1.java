package defpackage;

import android.text.TextUtils;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ra1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f880a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    public ra1(String str) {
        this.f880a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (TextUtils.isEmpty(optString)) {
            c.m("Product id cannot be empty.");
            throw null;
        }
        if (TextUtils.isEmpty(optString2)) {
            c.m("Product type cannot be empty.");
            throw null;
        }
        this.e = jSONObject.optString(YHJbtPFAANaPQ.trkWxdXA);
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f = jSONObject.optString("skuDetailsToken");
        this.g = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new qa1(optJSONArray.getJSONObject(i)));
            }
            this.h = arrayList;
        } else {
            this.h = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new oa1(optJSONArray2.getJSONObject(i2)));
            }
            this.i = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.i = null;
        } else {
            arrayList2.add(new oa1(optJSONObject));
            this.i = arrayList2;
        }
    }

    public final oa1 a() {
        ArrayList arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (oa1) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ra1) {
            return TextUtils.equals(this.f880a, ((ra1) obj).f880a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f880a.hashCode();
    }

    public final String toString() {
        return "ProductDetails{jsonString='" + this.f880a + "', parsedJson=" + this.b.toString() + ", productId='" + this.c + "', productType='" + this.d + "', title='" + this.e + Gvyagftz.iTGHoAAV + this.f + "', subscriptionOfferDetails=" + String.valueOf(this.h) + "}";
    }
}
