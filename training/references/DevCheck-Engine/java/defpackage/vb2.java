package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class vb2 implements af0 {
    public final /* synthetic */ wb2 g;
    public final /* synthetic */ UUID h;
    public final /* synthetic */ ad0 i;
    public final /* synthetic */ Context j;

    public /* synthetic */ vb2(wb2 wb2Var, UUID uuid, ad0 ad0Var, Context context) {
        this.g = wb2Var;
        this.h = uuid;
        this.i = ad0Var;
        this.j = context;
    }

    @Override // defpackage.af0
    public final Object a() {
        wb2 wb2Var = this.g;
        UUID uuid = this.h;
        ad0 ad0Var = this.i;
        Context context = this.j;
        String uuid2 = uuid.toString();
        gc2 b = wb2Var.c.b(uuid2);
        if (b == null || b.b.a()) {
            c.n("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            return null;
        }
        la1 la1Var = wb2Var.b;
        synchronized (la1Var.k) {
            try {
                ai1.h().getClass();
                yc2 yc2Var = (yc2) la1Var.g.remove(uuid2);
                if (yc2Var != null) {
                    if (la1Var.f576a == null) {
                        PowerManager.WakeLock a2 = h92.a(la1Var.b);
                        la1Var.f576a = a2;
                        a2.acquire();
                    }
                    la1Var.f.put(uuid2, yc2Var);
                    Intent a3 = eu1.a(la1Var.b, xc1.q(yc2Var.f1226a), ad0Var);
                    Context context2 = la1Var.b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        ax.q(context2, a3);
                    } else {
                        context2.startService(a3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xb2 q = xc1.q(b);
        int i = eu1.p;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", ad0Var.f21a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ad0Var.b);
        intent.putExtra("KEY_NOTIFICATION", ad0Var.c);
        intent.putExtra("KEY_WORKSPEC_ID", q.f1176a);
        intent.putExtra("KEY_GENERATION", q.b);
        context.startService(intent);
        return null;
    }
}
