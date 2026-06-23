package defpackage;

import android.app.Application;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a51 extends a4 {
    public final ExecutorService c;
    public qy0 d;
    public String e;

    public a51(Application application) {
        super(application);
        this.e = "—";
        this.c = MainApp.h;
    }

    public static Boolean f(JSONObject jSONObject, String str) {
        try {
            String[] split = str.split("\\.");
            for (int i = 0; i < split.length - 1; i++) {
                jSONObject = jSONObject.optJSONObject(split[i]);
                if (jSONObject == null) {
                    return null;
                }
            }
            if (jSONObject.has(split[split.length - 1])) {
                return Boolean.valueOf(jSONObject.optBoolean(split[split.length - 1]));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String g(JSONObject jSONObject, String str) {
        try {
            String[] split = str.split("\\.");
            for (int i = 0; i < split.length - 1; i++) {
                jSONObject = jSONObject.optJSONObject(split[i]);
                if (jSONObject == null) {
                    return null;
                }
            }
            if (jSONObject.has(split[split.length - 1])) {
                return String.valueOf(jSONObject.optDouble(split[split.length - 1]));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String h(JSONObject jSONObject, String str) {
        try {
            String[] split = str.split("\\.");
            for (int i = 0; i < split.length - 1; i++) {
                jSONObject = jSONObject.optJSONObject(split[i]);
                if (jSONObject == null) {
                    return null;
                }
            }
            if (jSONObject.has(split[split.length - 1])) {
                return String.valueOf(jSONObject.optInt(split[split.length - 1]));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
    
        r4 = r4[r4.length - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r3.has(r4) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        r3 = r3.optString(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r3.length() <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(org.json.JSONObject r3, java.lang.String r4) {
        /*
            r0 = 0
            java.lang.String r1 = "\\."
            java.lang.String[] r4 = r4.split(r1)     // Catch: java.lang.Throwable -> L31
            r1 = 0
        L8:
            int r2 = r4.length     // Catch: java.lang.Throwable -> L31
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L19
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L31
            org.json.JSONObject r3 = r3.optJSONObject(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L16
            goto L31
        L16:
            int r1 = r1 + 1
            goto L8
        L19:
            int r1 = r4.length     // Catch: java.lang.Throwable -> L31
            int r1 = r1 + (-1)
            r4 = r4[r1]     // Catch: java.lang.Throwable -> L31
            boolean r1 = r3.has(r4)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L31
            java.lang.String r3 = r3.optString(r4, r0)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L31
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L31
            if (r4 <= 0) goto L31
            return r3
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a51.i(org.json.JSONObject, java.lang.String):java.lang.String");
    }

    public final void d(int i, String str, ArrayList arrayList) {
        String e = e(i);
        if (str == null || str.isEmpty()) {
            str = "—";
        }
        arrayList.add(new hn0(1, e, str));
    }

    public final String e(int i) {
        Application application = this.b;
        application.getClass();
        return ts0.b(application, i);
    }

    public final String j(Boolean bool) {
        if (bool == null) {
            return "—";
        }
        return e(bool.booleanValue() ? R.string.yes : R.string.no);
    }
}
