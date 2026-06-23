package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class la1 {
    public final Context b;
    public final ju c;
    public final gr d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f576a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    static {
        ai1.k("Processor");
    }

    public la1(Context context, ju juVar, gr grVar, WorkDatabase workDatabase) {
        this.b = context;
        this.c = juVar;
        this.d = grVar;
        this.e = workDatabase;
    }

    public static boolean d(yc2 yc2Var, int i) {
        if (yc2Var == null) {
            ai1.h().getClass();
            return false;
        }
        yc2Var.l.t(new oc2(i));
        ai1.h().getClass();
        return true;
    }

    public final void a(da0 da0Var) {
        synchronized (this.k) {
            this.j.add(da0Var);
        }
    }

    public final yc2 b(String str) {
        yc2 yc2Var = (yc2) this.f.remove(str);
        boolean z = yc2Var != null;
        if (!z) {
            yc2Var = (yc2) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        int i = eu1.p;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable unused) {
                            ai1.h().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.f576a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f576a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return yc2Var;
    }

    public final yc2 c(String str) {
        yc2 yc2Var = (yc2) this.f.get(str);
        return yc2Var == null ? (yc2) this.g.get(str) : yc2Var;
    }
}
