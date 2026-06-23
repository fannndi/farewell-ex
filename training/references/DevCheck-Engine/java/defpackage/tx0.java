package defpackage;

import Cwd.ynLVXgis;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class tx0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1014a;
    public final TelephonyManager b;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public ExecutorService d;
    public sx0 e;
    public volatile String f;

    public tx0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1014a = applicationContext;
        this.b = (TelephonyManager) applicationContext.getSystemService("phone");
    }

    public static String b(int i) {
        if (i == 1 || i == 2) {
            return "2G";
        }
        if (i == 3) {
            return "3G";
        }
        if (i == 13) {
            return "LTE";
        }
        if (i == 15) {
            return "H+";
        }
        if (i == 19) {
            return "LTE";
        }
        if (i == 20) {
            return "5G";
        }
        switch (i) {
            case 8:
            case rt0.o /* 9 */:
            case 10:
                return ynLVXgis.oEkbenJeDK;
            default:
                return "Mobile data";
        }
    }

    public final String a() {
        if (this.e == null && this.b != null && Build.VERSION.SDK_INT >= 31 && pr.g(this.f1014a, "android.permission.READ_PHONE_STATE") == 0) {
            c();
        }
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager == null) {
            return null;
        }
        try {
            int dataNetworkType = telephonyManager.getDataNetworkType();
            if (dataNetworkType == 0) {
                dataNetworkType = this.b.getNetworkType();
            }
            return b(dataNetworkType);
        } catch (SecurityException | Exception unused) {
            return null;
        }
    }

    public final void c() {
        TelephonyManager telephonyManager = this.b;
        if (telephonyManager != null && this.e == null && Build.VERSION.SDK_INT >= 31 && pr.g(this.f1014a, "android.permission.READ_PHONE_STATE") == 0) {
            if (this.d == null) {
                this.d = Executors.newSingleThreadExecutor();
            }
            sx0 sx0Var = new sx0(this);
            telephonyManager.registerTelephonyCallback(this.d, sx0Var);
            this.e = sx0Var;
        }
    }
}
