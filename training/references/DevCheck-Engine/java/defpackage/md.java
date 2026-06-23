package defpackage;

import android.net.ConnectivityManager;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.UUID;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class md implements af0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ md(Object obj, int i, Object obj2) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    private final Object c() {
        int i;
        long a2;
        lk0[] lk0VarArr;
        dk0 dk0Var = (dk0) this.h;
        ym1 ym1Var = (ym1) this.i;
        ze1 ze1Var = new ze1();
        ek0 ek0Var = dk0Var.h;
        synchronized (ek0Var.C) {
            synchronized (ek0Var) {
                try {
                    ym1 ym1Var2 = ek0Var.x;
                    ym1 ym1Var3 = new ym1();
                    ym1Var2.getClass();
                    for (int i2 = 0; i2 < 10; i2++) {
                        if (((1 << i2) & ym1Var2.f1239a) != 0) {
                            ym1Var3.b(i2, ym1Var2.b[i2]);
                        }
                    }
                    for (int i3 = 0; i3 < 10; i3++) {
                        if (((1 << i3) & ym1Var.f1239a) != 0) {
                            ym1Var3.b(i3, ym1Var.b[i3]);
                        }
                    }
                    ze1Var.g = ym1Var3;
                    a2 = ym1Var3.a() - ym1Var2.a();
                    if (a2 != 0 && !ek0Var.h.isEmpty()) {
                        lk0VarArr = (lk0[]) ek0Var.h.values().toArray(new lk0[0]);
                        ym1 ym1Var4 = (ym1) ze1Var.g;
                        ym1Var4.getClass();
                        ek0Var.x = ym1Var4;
                        iw1.b(ek0Var.p, ek0Var.i + " onSettings", new md(ek0Var, 4, ze1Var));
                    }
                    lk0VarArr = null;
                    ym1 ym1Var42 = (ym1) ze1Var.g;
                    ym1Var42.getClass();
                    ek0Var.x = ym1Var42;
                    iw1.b(ek0Var.p, ek0Var.i + " onSettings", new md(ek0Var, 4, ze1Var));
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                ek0Var.C.a((ym1) ze1Var.g);
            } catch (IOException e) {
                j90 j90Var = j90.j;
                ek0Var.a(j90Var, j90Var, e);
            }
        }
        if (lk0VarArr != null) {
            for (lk0 lk0Var : lk0VarArr) {
                synchronized (lk0Var) {
                    lk0Var.k += a2;
                    if (a2 > 0) {
                        lk0Var.notifyAll();
                    }
                }
            }
        }
        return e42.f219a;
    }

    @Override // defpackage.af0
    public final Object a() {
        switch (this.g) {
            case 0:
                pd pdVar = (pd) this.h;
                nd ndVar = (nd) this.i;
                uv uvVar = pdVar.f784a;
                uvVar.getClass();
                synchronized (uvVar.c) {
                    if (uvVar.d.remove(ndVar) && uvVar.d.isEmpty()) {
                        uvVar.d();
                    }
                }
                return e42.f219a;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                zb2 zb2Var = (zb2) this.h;
                UUID uuid = (UUID) this.i;
                WorkDatabase workDatabase = zb2Var.c;
                workDatabase.getClass();
                k5 k5Var = new k5(zb2Var, 11, uuid);
                workDatabase.c();
                try {
                    k5Var.run();
                    workDatabase.v();
                    workDatabase.r();
                    ek1.b(zb2Var.b, zb2Var.c, zb2Var.e);
                    return e42.f219a;
                } catch (Throwable th) {
                    workDatabase.r();
                    throw th;
                }
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ek0 ek0Var = (ek0) this.h;
                lk0 lk0Var = (lk0) this.i;
                try {
                    ek0Var.g.c(lk0Var);
                } catch (IOException e) {
                    q71 q71Var = q71.f821a;
                    q71.f821a.i(4, "Http2Connection.Listener failure for " + ek0Var.i);
                    try {
                        lk0Var.d(j90.j, e);
                    } catch (IOException unused) {
                    }
                }
                return e42.f219a;
            case 3:
                return c();
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                ek0 ek0Var2 = (ek0) this.h;
                ek0Var2.g.a(ek0Var2, (ym1) ((ze1) this.i).g);
                return e42.f219a;
            default:
                x20 x20Var = (x20) this.h;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.i;
                synchronized (on1.b) {
                    LinkedHashMap linkedHashMap = on1.c;
                    linkedHashMap.remove(x20Var);
                    if (linkedHashMap.isEmpty()) {
                        ai1 h = ai1.h();
                        int i = ob2.f725a;
                        h.getClass();
                        connectivityManager.unregisterNetworkCallback(on1.f749a);
                        on1.f = null;
                        on1.d = null;
                        on1.e = false;
                    }
                }
                return e42.f219a;
        }
    }
}
