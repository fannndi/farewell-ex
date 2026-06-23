package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import flar2.devcheck.cputimes.Sd.tEegR;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class eu1 implements p41, da0 {
    public static final /* synthetic */ int p = 0;
    public final zb2 g;
    public final gr h;
    public final Object i = new Object();
    public xb2 j;
    public final LinkedHashMap k;
    public final HashMap l;
    public final HashMap m;
    public final ti0 n;
    public SystemForegroundService o;

    static {
        ai1.k("SystemFgDispatcher");
    }

    public eu1(Context context) {
        zb2 b = zb2.b(context);
        this.g = b;
        this.h = b.d;
        this.j = null;
        this.k = new LinkedHashMap();
        this.m = new HashMap();
        this.l = new HashMap();
        this.n = new ti0(b.j);
        b.f.a(this);
    }

    public static Intent a(Context context, xb2 xb2Var, ad0 ad0Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", xb2Var.f1176a);
        intent.putExtra("KEY_GENERATION", xb2Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", ad0Var.f21a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ad0Var.b);
        intent.putExtra("KEY_NOTIFICATION", ad0Var.c);
        return intent;
    }

    @Override // defpackage.p41
    public final void b(gc2 gc2Var, pw pwVar) {
        if (pwVar instanceof ow) {
            ai1.h().getClass();
            xb2 q = xc1.q(gc2Var);
            int i = ((ow) pwVar).f762a;
            zb2 zb2Var = this.g;
            gr grVar = zb2Var.d;
            ((lm1) grVar.h).execute(new hr1(zb2Var.f, new vq1(q), true, i));
        }
    }

    public final void c(Intent intent) {
        if (this.o == null) {
            c.n("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra(tEegR.Wip, 0);
        xb2 xb2Var = new xb2(intent.getIntExtra("KEY_GENERATION", 0), intent.getStringExtra("KEY_WORKSPEC_ID"));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        ai1.h().getClass();
        if (notification == null) {
            c.m("Notification passed in the intent was null.");
            return;
        }
        ad0 ad0Var = new ad0(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.k;
        linkedHashMap.put(xb2Var, ad0Var);
        ad0 ad0Var2 = (ad0) linkedHashMap.get(this.j);
        if (ad0Var2 == null) {
            this.j = xb2Var;
        } else {
            this.o.j.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((ad0) ((Map.Entry) it.next()).getValue()).b;
                }
                ad0Var = new ad0(ad0Var2.f21a, ad0Var2.c, i);
            } else {
                ad0Var = ad0Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.o;
        int i2 = ad0Var.f21a;
        int i3 = ad0Var.b;
        Notification notification2 = ad0Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            b8.k(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            b8.i(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    @Override // defpackage.da0
    public final void d(xb2 xb2Var, boolean z) {
        Map.Entry entry;
        synchronized (this.i) {
            try {
                rn0 rn0Var = ((gc2) this.l.remove(xb2Var)) != null ? (rn0) this.m.remove(xb2Var) : null;
                if (rn0Var != null) {
                    rn0Var.e(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ad0 ad0Var = (ad0) this.k.remove(xb2Var);
        if (xb2Var.equals(this.j)) {
            if (this.k.size() > 0) {
                Iterator it = this.k.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.j = (xb2) entry.getKey();
                if (this.o != null) {
                    ad0 ad0Var2 = (ad0) entry.getValue();
                    SystemForegroundService systemForegroundService = this.o;
                    int i = ad0Var2.f21a;
                    int i2 = ad0Var2.b;
                    Notification notification = ad0Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        b8.k(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        b8.i(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.o.j.cancel(ad0Var2.f21a);
                }
            } else {
                this.j = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.o;
        if (ad0Var == null || systemForegroundService2 == null) {
            return;
        }
        ai1 h = ai1.h();
        xb2Var.toString();
        h.getClass();
        systemForegroundService2.j.cancel(ad0Var.f21a);
    }

    public final void e() {
        this.o = null;
        synchronized (this.i) {
            try {
                Iterator it = this.m.values().iterator();
                while (it.hasNext()) {
                    ((rn0) it.next()).e(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        la1 la1Var = this.g.f;
        synchronized (la1Var.k) {
            la1Var.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        ai1.h().getClass();
        for (Map.Entry entry : this.k.entrySet()) {
            if (((ad0) entry.getValue()).b == i2) {
                xb2 xb2Var = (xb2) entry.getKey();
                zb2 zb2Var = this.g;
                gr grVar = zb2Var.d;
                ((lm1) grVar.h).execute(new hr1(zb2Var.f, new vq1(xb2Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.o;
        if (systemForegroundService != null) {
            systemForegroundService.h = true;
            ai1.h().getClass();
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
