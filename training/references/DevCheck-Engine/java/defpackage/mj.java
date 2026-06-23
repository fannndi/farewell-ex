package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class mj {

    /* renamed from: a, reason: collision with root package name */
    public final Object f636a;
    public volatile int b;
    public final String c;
    public final Handler d;
    public volatile of2 e;
    public final Context f;
    public final xi0 g;
    public volatile ch2 h;
    public volatile mh2 i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final ai1 u;
    public final boolean v;
    public ExecutorService w;
    public volatile lk2 x;
    public final Long y;

    public mj(ai1 ai1Var, Context context, wb wbVar) {
        String str;
        fh c;
        v80 v80Var;
        i42 i42Var;
        Set set;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "7.1.1";
        }
        this.f636a = new Object();
        this.b = 0;
        this.d = new Handler(Looper.getMainLooper());
        this.k = 0;
        long nextLong = new Random().nextLong();
        this.y = Long.valueOf(nextLong);
        this.c = str;
        this.f = context.getApplicationContext();
        sn2 r = tn2.r();
        r.c();
        tn2.q((tn2) r.h, str);
        String packageName = this.f.getPackageName();
        r.c();
        tn2.p((tn2) r.h, packageName);
        r.c();
        tn2.o((tn2) r.h, nextLong);
        Context context2 = this.f;
        tn2 tn2Var = (tn2) r.b();
        hk hkVar = new hk();
        try {
            l12.b(context2);
            c = l12.a().c(lm.e);
            v80Var = new v80("proto");
            i42Var = new i42();
            set = (Set) c.h;
        } catch (Throwable unused2) {
            hkVar.g = true;
        }
        if (!set.contains(v80Var)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", v80Var, set));
        }
        hkVar.h = new fh((nb) c.i, v80Var, i42Var, (l12) c.j);
        xi0 xi0Var = new xi0();
        xi0Var.h = hkVar;
        xi0Var.g = tn2Var;
        this.g = xi0Var;
        if (wbVar == null) {
            int i = bk2.f89a;
            Log.isLoggable("BillingClient", 5);
        }
        this.e = new of2(this.f, wbVar, this.g);
        this.u = ai1Var;
        this.v = false;
        this.f.getPackageName();
    }

    public static Future h(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new hk2(submit, 19, runnable), (long) (j * 0.95d));
            return submit;
        } catch (Exception unused) {
            bk2.g("BillingClient");
            return null;
        }
    }

    public void a(o1 o1Var, tb tbVar) {
        if (!c()) {
            qj qjVar = li2.k;
            v(2, 3, qjVar);
            tbVar.d(qjVar);
            return;
        }
        if (TextUtils.isEmpty(o1Var.h)) {
            int i = bk2.f89a;
            Log.isLoggable("BillingClient", 5);
            qj qjVar2 = li2.h;
            v(26, 3, qjVar2);
            tbVar.d(qjVar2);
            return;
        }
        int i2 = 27;
        if (!this.m) {
            qj qjVar3 = li2.b;
            v(27, 3, qjVar3);
            tbVar.d(qjVar3);
        } else if (h(new bh2(this, tbVar, o1Var, 4), 30000L, new hk2(this, i2, tbVar), t(), k()) == null) {
            qj i3 = i();
            v(25, 3, i3);
            tbVar.d(i3);
        }
    }

    public void b() {
        try {
            m(hi2.d(12));
        } catch (Throwable unused) {
            bk2.g("BillingClient");
        }
        synchronized (this.f636a) {
            try {
                if (this.e != null) {
                    of2 of2Var = this.e;
                    io2 io2Var = (io2) of2Var.k;
                    Context context = (Context) of2Var.h;
                    io2Var.b(context);
                    ((io2) of2Var.l).b(context);
                }
            } catch (Throwable unused2) {
                bk2.g("BillingClient");
            }
            try {
                bk2.f("BillingClient", "Unbinding from service.");
                o();
            } catch (Throwable unused3) {
                bk2.g("BillingClient");
            }
            try {
                synchronized (this) {
                    try {
                        ExecutorService executorService = this.w;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.w = null;
                            this.x = null;
                        }
                    } finally {
                        n(3);
                    }
                }
            } catch (Throwable unused4) {
                bk2.g("BillingClient");
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.f636a) {
            try {
                z = false;
                if (this.b == 2 && this.h != null && this.i != null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x052e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.qj d(android.app.Activity r28, final defpackage.oj r29) {
        /*
            Method dump skipped, instructions count: 1622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj.d(android.app.Activity, oj):qj");
    }

    public void e(kb1 kb1Var, wb wbVar) {
        if (!c()) {
            qj qjVar = li2.k;
            v(2, 7, qjVar);
            wbVar.g(qjVar, new ArrayList());
        } else {
            if (this.q) {
                if (h(new bh2(this, kb1Var, wbVar, 0), 30000L, new hk2(this, 21, wbVar), t(), k()) == null) {
                    qj i = i();
                    v(25, 7, i);
                    wbVar.g(i, new ArrayList());
                    return;
                }
                return;
            }
            int i2 = bk2.f89a;
            Log.isLoggable("BillingClient", 5);
            qj qjVar2 = li2.q;
            v(20, 7, qjVar2);
            wbVar.g(qjVar2, new ArrayList());
        }
    }

    public final void f(o1 o1Var, sb sbVar) {
        String str = o1Var.h;
        if (!c()) {
            qj qjVar = li2.k;
            v(2, 9, qjVar);
            ni2 ni2Var = qi2.h;
            sbVar.a(qjVar, gj2.k);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            int i = bk2.f89a;
            Log.isLoggable("BillingClient", 5);
            qj qjVar2 = li2.f;
            v(50, 9, qjVar2);
            ni2 ni2Var2 = qi2.h;
            sbVar.a(qjVar2, gj2.k);
            return;
        }
        if (h(new bh2(this, str, sbVar, 1), 30000L, new hk2(this, 18, sbVar), t(), k()) == null) {
            qj i2 = i();
            v(25, 9, i2);
            ni2 ni2Var3 = qi2.h;
            sbVar.a(i2, gj2.k);
        }
    }

    public void g(wb wbVar) {
        qj qjVar;
        qj qjVar2;
        synchronized (this.f636a) {
            try {
                if (c()) {
                    qjVar = u();
                } else {
                    if (this.b == 1) {
                        int i = bk2.f89a;
                        Log.isLoggable("BillingClient", 5);
                        qjVar2 = li2.e;
                        v(37, 6, qjVar2);
                    } else if (this.b == 3) {
                        int i2 = bk2.f89a;
                        Log.isLoggable("BillingClient", 5);
                        qjVar2 = li2.k;
                        v(38, 6, qjVar2);
                    } else {
                        n(1);
                        o();
                        bk2.f("BillingClient", "Starting in-app billing setup.");
                        this.i = new mh2(this, wbVar);
                        Intent intent = new Intent("TryRoom");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> queryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
                        int i3 = 41;
                        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            i3 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    Log.isLoggable("BillingClient", 5);
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.c);
                                    synchronized (this.f636a) {
                                        try {
                                            if (this.b == 2) {
                                                qjVar = u();
                                            } else if (this.b != 1) {
                                                Log.isLoggable("BillingClient", 5);
                                                qjVar2 = li2.k;
                                                v(117, 6, qjVar2);
                                            } else {
                                                mh2 mh2Var = this.i;
                                                if (this.f.bindService(intent2, mh2Var, 1)) {
                                                    bk2.f("BillingClient", "Service was bonded successfully.");
                                                    qjVar = null;
                                                } else {
                                                    Log.isLoggable("BillingClient", 5);
                                                    i3 = 39;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                Log.isLoggable("BillingClient", 5);
                            }
                        }
                        n(0);
                        bk2.f("BillingClient", "Billing service unavailable on device.");
                        qj qjVar3 = li2.c;
                        v(i3, 6, qjVar3);
                        qjVar = qjVar3;
                    }
                    qjVar = qjVar2;
                }
            } finally {
            }
        }
        if (qjVar != null) {
            wbVar.f(qjVar);
        }
    }

    public final qj i() {
        int[] iArr = {0, 3};
        synchronized (this.f636a) {
            for (int i = 0; i < 2; i++) {
                if (this.b == iArr[i]) {
                    return li2.k;
                }
            }
            return li2.i;
        }
    }

    public final void j() {
        if (TextUtils.isEmpty(null)) {
            this.f.getPackageName();
        }
    }

    public final synchronized ExecutorService k() {
        try {
            if (this.w == null) {
                this.w = Executors.newFixedThreadPool(bk2.f89a, new fh2());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.w;
    }

    public final void l(in2 in2Var) {
        try {
            xi0 xi0Var = this.g;
            int i = this.k;
            xi0Var.getClass();
            try {
                sn2 sn2Var = (sn2) ((tn2) xi0Var.g).g();
                sn2Var.c();
                tn2.n((tn2) sn2Var.h, i);
                xi0Var.g = (tn2) sn2Var.b();
                xi0Var.m(in2Var);
            } catch (Throwable unused) {
                bk2.g("BillingLogger");
            }
        } catch (Throwable unused2) {
            bk2.g("BillingClient");
        }
    }

    public final void m(ln2 ln2Var) {
        try {
            xi0 xi0Var = this.g;
            int i = this.k;
            xi0Var.getClass();
            try {
                sn2 sn2Var = (sn2) ((tn2) xi0Var.g).g();
                sn2Var.c();
                tn2.n((tn2) sn2Var.h, i);
                xi0Var.g = (tn2) sn2Var.b();
                xi0Var.n(ln2Var);
            } catch (Throwable unused) {
                bk2.g("BillingLogger");
            }
        } catch (Throwable unused2) {
            bk2.g("BillingClient");
        }
    }

    public final void n(int i) {
        synchronized (this.f636a) {
            try {
                if (this.b == 3) {
                    return;
                }
                int i2 = this.b;
                bk2.f("BillingClient", "Setting clientState from " + (i2 != 0 ? i2 != 1 ? i2 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i != 0 ? i != 1 ? i != 2 ? "CLOSED" : "CONNECTED" : bPnJ.uVKcO : "DISCONNECTED"));
                this.b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        synchronized (this.f636a) {
            if (this.i != null) {
                try {
                    try {
                        this.f.unbindService(this.i);
                    } finally {
                        this.h = null;
                        this.i = null;
                    }
                } catch (Throwable unused) {
                    bk2.g("BillingClient");
                    this.h = null;
                    this.i = null;
                }
            }
        }
    }

    public final rg1 p(qj qjVar, int i, Exception exc) {
        bk2.g("BillingClient");
        w(i, 7, qjVar, hi2.a(exc));
        return new rg1(qjVar.f847a, qjVar.b, new ArrayList());
    }

    public final u40 q(qj qjVar, int i, Exception exc) {
        bk2.g("BillingClient");
        w(i, 11, qjVar, hi2.a(exc));
        return new u40(qjVar, null, 14, false);
    }

    public final i8 r(qj qjVar, int i, Exception exc) {
        w(i, 9, qjVar, hi2.a(exc));
        bk2.g("BillingClient");
        return new i8(qjVar, (Object) null);
    }

    public final void s(tb tbVar, qj qjVar, int i, Exception exc) {
        bk2.g("BillingClient");
        w(i, 3, qjVar, hi2.a(exc));
        tbVar.d(qjVar);
    }

    public final Handler t() {
        return Looper.myLooper() == null ? this.d : new Handler(Looper.myLooper());
    }

    public final qj u() {
        bk2.f("BillingClient", "Service connection is valid. No need to re-initialize.");
        kn2 p = ln2.p();
        p.c();
        ln2.o((ln2) p.h, 6);
        fo2 o = go2.o();
        o.c();
        go2.n((go2) o.h);
        p.c();
        ln2.n((ln2) p.h, (go2) o.b());
        m((ln2) p.b());
        return li2.j;
    }

    public final void v(int i, int i2, qj qjVar) {
        try {
            l(hi2.b(i, i2, qjVar));
        } catch (Throwable unused) {
            bk2.g(XmJDY.TMEekpzv);
        }
    }

    public final void w(int i, int i2, qj qjVar, String str) {
        try {
            l(hi2.c(i, i2, qjVar, str));
        } catch (Throwable unused) {
            bk2.g(ILBLnlCHDVqsSN.RNOlTWhZMhmwj);
        }
    }

    public final void x(qj qjVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.d.post(new hk2(this, 26, qjVar));
    }
}
