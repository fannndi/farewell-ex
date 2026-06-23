package defpackage;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Process;
import flar2.devcheck.tools.WifiActivity;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class f52 implements Runnable {
    public final /* synthetic */ int g;
    public Object h;

    public /* synthetic */ f52(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    public f52(kf2 kf2Var, th2 th2Var) {
        this.g = 7;
        this.h = th2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppOpsManager appOpsManager;
        kk2 kk2Var;
        qj2 qj2Var;
        switch (this.g) {
            case 0:
                a40 a40Var = (a40) this.h;
                if (!a40Var.f7a || (appOpsManager = (AppOpsManager) a40Var.c) == null) {
                    return;
                }
                r1 = appOpsManager.checkOpNoThrow("android:get_usage_stats", Process.myUid(), ((Context) a40Var.b).getPackageName()) == 0;
                Boolean bool = (Boolean) a40Var.f;
                if (bool == null || bool.booleanValue() != r1) {
                    a40Var.f = Boolean.valueOf(r1);
                    if (r1) {
                        a40Var.c();
                        try {
                            ((PendingIntent) a40Var.e).send();
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((b72) this.h).m(0);
                return;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                g82 g82Var = (g82) this.h;
                g82Var.setScrollState(0);
                g82Var.q();
                return;
            case 3:
                WifiActivity wifiActivity = (WifiActivity) this.h;
                WifiActivity.B(wifiActivity);
                Handler handler = wifiActivity.O;
                if (handler == null || !wifiActivity.N) {
                    return;
                }
                handler.postDelayed(wifiActivity.P, 10000L);
                return;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                ((mf2) this.h).h();
                return;
            case 5:
                q4 q4Var = ((mf2) ((my1) this.h).g).h;
                q4Var.c(q4Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                ((vf2) this.h).n.a(new uu(4, null, null));
                return;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                throw null;
            case 8:
                mh2 mh2Var = (mh2) this.h;
                mj mjVar = mh2Var.b;
                mjVar.n(0);
                qj qjVar = li2.l;
                mjVar.v(24, 6, qjVar);
                mh2Var.a(qjVar);
                return;
            case rt0.o /* 9 */:
                tk2 tk2Var = (tk2) this.h;
                if (tk2Var == null || (kk2Var = tk2Var.n) == null) {
                    return;
                }
                this.h = null;
                if (kk2Var.isDone()) {
                    Object obj = tk2Var.g;
                    if (obj == null) {
                        if (kk2Var.isDone()) {
                            if (zj2.l.J(tk2Var, null, zj2.f(kk2Var))) {
                                zj2.h(tk2Var);
                                return;
                            }
                            return;
                        }
                        tj2 tj2Var = new tj2(tk2Var, kk2Var);
                        if (zj2.l.J(tk2Var, null, tj2Var)) {
                            try {
                                kk2Var.b(tj2Var, fk2.g);
                                return;
                            } catch (Throwable th) {
                                try {
                                    qj2Var = new qj2(th);
                                } catch (Error | Exception unused2) {
                                    qj2Var = qj2.b;
                                }
                                zj2.l.J(tk2Var, tj2Var, qj2Var);
                                return;
                            }
                        }
                        obj = tk2Var.g;
                    }
                    if (obj instanceof pj2) {
                        kk2Var.cancel(((pj2) obj).f793a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = tk2Var.o;
                    tk2Var.o = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        } catch (Throwable th2) {
                            tk2Var.e(new sk2(str));
                            throw th2;
                        }
                    }
                    tk2Var.e(new sk2(str + ": " + kk2Var.toString()));
                    return;
                } finally {
                    kk2Var.cancel(true);
                }
            default:
                synchronized (((ql2) this.h).i) {
                    ((ql2) ((ql2) this.h).j).a();
                }
                return;
        }
    }
}
