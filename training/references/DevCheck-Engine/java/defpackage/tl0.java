package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class tl0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f994a = new HashMap();
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();

    public static void a(String str) {
        Long l;
        WeakReference weakReference;
        int currentThermalStatus;
        HashMap hashMap = f994a;
        synchronized (hashMap) {
            l = (Long) hashMap.remove(str);
        }
        if (l == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        if (currentTimeMillis <= 0) {
            return;
        }
        String e = i51.e(IGQCApxXGMWo.ZXfQZ);
        HashSet hashSet = new HashSet();
        if (e != null && !e.isEmpty()) {
            for (String str2 : e.split(",")) {
                if (!str2.isEmpty()) {
                    hashSet.add(str2);
                }
            }
        }
        if (hashSet.contains(str)) {
            return;
        }
        HashMap hashMap2 = b;
        synchronized (hashMap2) {
            try {
                Long l2 = (Long) hashMap2.get(str);
                long longValue = (l2 == null ? 0L : l2.longValue()) + currentTimeMillis;
                if (longValue < 30000) {
                    hashMap2.put(str, Long.valueOf(longValue));
                    return;
                }
                hashMap2.remove(str);
                hashSet.add(str);
                StringBuilder sb = new StringBuilder();
                Iterator it = hashSet.iterator();
                boolean z = true;
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (!z) {
                        sb.append(',');
                    }
                    sb.append(str3);
                    z = false;
                }
                i51.l("prefDeepVisitedScreens", sb.toString());
                if (hashSet.size() < 4) {
                    return;
                }
                HashMap hashMap3 = c;
                synchronized (hashMap3) {
                    weakReference = (WeakReference) hashMap3.get(str);
                }
                Activity activity = weakReference == null ? null : (Activity) weakReference.get();
                if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                long d = i51.d("prefLastReviewAttempt");
                if (d > 0 && System.currentTimeMillis() - d < 7776000000L) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        PowerManager powerManager = (PowerManager) activity.getSystemService(YSHrxiHkAFcciU.oArMyMawj);
                        if (powerManager != null) {
                            currentThermalStatus = powerManager.getCurrentThermalStatus();
                            if (currentThermalStatus >= 2) {
                                return;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                i51.k("prefLastReviewAttempt", System.currentTimeMillis());
                WeakReference weakReference2 = new WeakReference(activity);
                try {
                    Context applicationContext = activity.getApplicationContext();
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (applicationContext2 != null) {
                        applicationContext = applicationContext2;
                    }
                    zf zfVar = new zf(new em2(applicationContext));
                    zfVar.L().a(new tb(weakReference2, 7, zfVar));
                } catch (Throwable unused2) {
                }
            } finally {
            }
        }
    }

    public static void b(a5 a5Var, String str) {
        HashMap hashMap = f994a;
        synchronized (hashMap) {
            hashMap.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        if (a5Var != null) {
            HashMap hashMap2 = c;
            synchronized (hashMap2) {
                hashMap2.put(str, new WeakReference(a5Var));
            }
        }
    }
}
