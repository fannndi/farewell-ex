package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pa1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f780a;
    public final long b;

    public pa1(JSONObject jSONObject) {
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        this.f780a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
