package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class fi2 extends mj {
    public volatile int A;
    public volatile ih2 B;
    public volatile d9 C;
    public volatile rk2 D;
    public final Context z;

    public fi2(ai1 ai1Var, Context context, wb wbVar) {
        super(ai1Var, context, wbVar);
        this.A = 0;
        this.z = context;
    }

    public final synchronized boolean A() {
        if (this.A == 2 && this.B != null) {
            if (this.C != null) {
                return true;
            }
        }
        return false;
    }

    public final kk2 B(int i) {
        if (!A()) {
            int i2 = bk2.f89a;
            Log.isLoggable("BillingClientTesting", 5);
            C(106, 28, li2.a(-1, "Billing Override Service connection is disconnected."));
            return new ik2();
        }
        th2 th2Var = new th2(i, this);
        so2 so2Var = new so2();
        so2Var.c = new zo2();
        wo2 wo2Var = new wo2(so2Var);
        so2Var.b = wo2Var;
        so2Var.f948a = th2.class;
        try {
            th2Var.m(so2Var);
            so2Var.f948a = "billingOverrideService.getBillingOverride";
            return wo2Var;
        } catch (Exception e) {
            dm2 dm2Var = new dm2(e);
            xc1 xc1Var = ro2.l;
            uo2 uo2Var = wo2Var.h;
            if (xc1Var.P(uo2Var, null, dm2Var)) {
                ro2.d(uo2Var);
            }
            return wo2Var;
        }
    }

    public final void C(int i, int i2, qj qjVar) {
        in2 b = hi2.b(i, i2, qjVar);
        Objects.requireNonNull(b, hTYJVDOvZnZlYL.ZUWcesdHd);
        this.g.m(b);
    }

    public final void D(int i, Consumer consumer, Runnable runnable) {
        rk2 rk2Var;
        lk2 lk2Var;
        lk2 rk2Var2;
        kk2 B = B(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.D == null) {
                    ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.D = newSingleThreadScheduledExecutor instanceof rk2 ? (rk2) newSingleThreadScheduledExecutor : new rk2(newSingleThreadScheduledExecutor);
                }
                rk2Var = this.D;
            } finally {
            }
        }
        if (!B.isDone()) {
            tk2 tk2Var = new tk2();
            tk2Var.n = B;
            f52 f52Var = new f52();
            f52Var.h = tk2Var;
            tk2Var.o = rk2Var.schedule(f52Var, 28500L, timeUnit);
            B.b(f52Var, fk2.g);
            B = tk2Var;
        }
        og ogVar = new og(i, this, consumer, runnable);
        synchronized (this) {
            try {
                if (this.x == null) {
                    ExecutorService k = k();
                    if (k instanceof lk2) {
                        rk2Var2 = (lk2) k;
                    } else {
                        rk2Var2 = k instanceof ScheduledExecutorService ? new rk2((ScheduledExecutorService) k) : new lk2(k);
                    }
                    this.x = rk2Var2;
                }
                lk2Var = this.x;
            } finally {
            }
        }
        B.b(new hk2(B, 0, ogVar), lk2Var);
    }

    @Override // defpackage.mj
    public final void a(o1 o1Var, tb tbVar) {
        D(3, new sh2(1, tbVar), new qi0(this, o1Var, tbVar, 3));
    }

    @Override // defpackage.mj
    public final void b() {
        synchronized (this) {
            ln2 d = hi2.d(27);
            Objects.requireNonNull(d, "ApiSuccess should not be null");
            this.g.n(d);
            try {
                try {
                    if (this.C != null && this.B != null) {
                        bk2.f("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.z.unbindService(this.C);
                        this.C = new d9(2, this);
                    }
                    this.B = null;
                    if (this.D != null) {
                        this.D.shutdownNow();
                        this.D = null;
                    }
                } catch (RuntimeException unused) {
                    bk2.g("BillingClientTesting");
                }
                this.A = 3;
            } catch (Throwable th) {
                this.A = 3;
                throw th;
            }
        }
        super.b();
    }

    @Override // defpackage.mj
    public final qj d(Activity activity, oj ojVar) {
        int i = 0;
        try {
            i = ((Integer) B(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException unused) {
            C(114, 28, li2.t);
            bk2.g("BillingClientTesting");
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            C(107, 28, li2.t);
            bk2.g("BillingClientTesting");
        }
        if (i > 0) {
            qj a2 = li2.a(i, "Billing override value was set by a license tester.");
            C(105, 2, a2);
            x(a2);
            return a2;
        }
        try {
            return super.d(activity, ojVar);
        } catch (Exception unused2) {
            qj qjVar = li2.i;
            C(115, 2, qjVar);
            bk2.g("BillingClientTesting");
            return qjVar;
        }
    }

    @Override // defpackage.mj
    public final void e(kb1 kb1Var, wb wbVar) {
        D(7, new sh2(0, wbVar), new qi0(this, kb1Var, wbVar, 2));
    }

    @Override // defpackage.mj
    public final void g(wb wbVar) {
        synchronized (this) {
            if (A()) {
                bk2.f("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                ln2 d = hi2.d(26);
                Objects.requireNonNull(d, "ApiSuccess should not be null");
                this.g.n(d);
            } else {
                int i = 1;
                if (this.A == 1) {
                    int i2 = bk2.f89a;
                    Log.isLoggable("BillingClientTesting", 5);
                } else if (this.A == 3) {
                    int i3 = bk2.f89a;
                    Log.isLoggable("BillingClientTesting", 5);
                    C(38, 26, li2.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.A = 1;
                    bk2.f("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.C = new d9(2, this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage(rQcwh.hmCNptWpHAjys);
                    List<ResolveInfo> queryIntentServices = this.z.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                Log.isLoggable("BillingClientTesting", 5);
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.z.bindService(intent2, this.C, 1)) {
                                    bk2.f("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    Log.isLoggable(CGvJMCDBOmCdj.rFAZxjIeupWfrx, 5);
                                }
                            }
                            i = 39;
                        }
                    }
                    this.A = 0;
                    bk2.f("BillingClientTesting", "Billing Override Service unavailable on device.");
                    C(i, 26, li2.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.g(wbVar);
    }

    public final /* synthetic */ void y(o1 o1Var, tb tbVar) {
        super.a(o1Var, tbVar);
    }

    public final /* synthetic */ void z(kb1 kb1Var, wb wbVar) {
        super.e(kb1Var, wbVar);
    }
}
