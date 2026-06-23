package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class bk2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f89a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            f(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return 6;
    }

    public static void b(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(boolean z, boolean z2, String str, long j) {
        Bundle bundle = new Bundle();
        b(bundle, str, j);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static qj d(Intent intent, String str) {
        if (intent != null) {
            cf a2 = qj.a();
            a2.f122a = a(str, intent.getExtras());
            a2.b = e(str, intent.getExtras());
            return a2.a();
        }
        Log.isLoggable("BillingHelper", 5);
        cf a3 = qj.a();
        a3.f122a = 6;
        a3.b = "An internal error occurred.";
        return a3.a();
    }

    public static String e(String str, Bundle bundle) {
        if (bundle == null) {
            Log.isLoggable(str, 5);
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            f(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        "Unexpected type for debug message: ".concat(obj.getClass().getName());
        Log.isLoggable(str, 5);
        return "";
    }

    public static void f(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int min = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, min);
            str2 = str2.substring(min);
            i -= min;
        }
    }

    public static void g(String str) {
        try {
            Log.isLoggable(str, 5);
        } catch (Throwable unused) {
        }
    }

    public static Bundle h(qj qjVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", qjVar.f847a);
        bundle.putString("DEBUG_MESSAGE", qjVar.b);
        bundle.putInt("LOG_REASON", i - 1);
        return bundle;
    }

    public static Purchase i(String str, String str2) {
        if (str == null || str2 == null) {
            f("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            "Got JSONException while parsing purchase data: ".concat(e.toString());
            Log.isLoggable("BillingHelper", 5);
            return null;
        }
    }
}
