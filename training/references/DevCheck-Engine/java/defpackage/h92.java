package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public abstract class h92 {
    static {
        ai1.k("WakeLocks");
    }

    public static final PowerManager.WakeLock a(Context context) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String concat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (i92.f419a) {
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
