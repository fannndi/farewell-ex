package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import flar2.devcheck.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class hk2 implements Runnable {
    public final /* synthetic */ int g;
    public Object h;
    public final Object i;

    public /* synthetic */ hk2(Object obj, int i, Object obj2) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    public /* synthetic */ hk2(Object obj, Object obj2, int i, boolean z) {
        this.g = i;
        this.i = obj;
        this.h = obj2;
    }

    public hk2(k20 k20Var, ArrayList arrayList, up1 up1Var) {
        this.g = 8;
        this.h = arrayList;
        this.i = up1Var;
    }

    private final void a() {
        synchronized (((ql2) this.i).i) {
            ((o41) ((ql2) this.i).j).b((xo2) this.h);
        }
    }

    private final void b() {
        Exception exc;
        synchronized (((ql2) this.i).i) {
            s41 s41Var = (s41) ((ql2) this.i).j;
            xo2 xo2Var = (xo2) this.h;
            synchronized (xo2Var.f1192a) {
                exc = xo2Var.f;
            }
            xc1.j(exc);
            s41Var.j(exc);
        }
    }

    private final void c() {
        synchronized (((ql2) this.i).i) {
            ((v41) ((ql2) this.i).j).i(((xo2) this.h).c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ow0 ow0Var;
        String[] strArr;
        qk0 qk0Var;
        qk0 to2Var;
        final int i = 0;
        final int i2 = 1;
        Throwable th = null;
        gc2 gc2Var = null;
        th = null;
        switch (this.g) {
            case 0:
                og ogVar = (og) this.i;
                kk2 kk2Var = (kk2) this.h;
                if (kk2Var instanceof zj2) {
                    zj2 zj2Var = (zj2) kk2Var;
                    if (zj2Var instanceof vj2) {
                        Object obj = zj2Var.g;
                        if (obj instanceof qj2) {
                            th = ((qj2) obj).f848a;
                        }
                    }
                    if (th != null) {
                        ogVar.a(th);
                        return;
                    }
                }
                try {
                    boolean isDone = kk2Var.isDone();
                    String str = gXdyRQCGVlHW.sCYetMtoSiR;
                    if (!isDone) {
                        throw new IllegalStateException(rt0.O(str, kk2Var));
                    }
                    while (true) {
                        try {
                            Object obj2 = kk2Var.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj2;
                            int intValue = num.intValue();
                            fi2 fi2Var = (fi2) ogVar.j;
                            if (intValue <= 0) {
                                ((Runnable) ogVar.i).run();
                                return;
                            }
                            int i3 = ogVar.g;
                            qj a2 = li2.a(num.intValue(), "Billing override value was set by a license tester.");
                            fi2Var.C(105, i3, a2);
                            ((Consumer) ogVar.h).accept(a2);
                            return;
                        } catch (InterruptedException unused) {
                            i = 1;
                        } catch (Throwable th2) {
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    }
                } catch (ExecutionException e) {
                    ogVar.a(e.getCause());
                    return;
                } catch (Throwable th3) {
                    ogVar.a(th3);
                    return;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                z1 z1Var = (z1) this.h;
                d2 d2Var = (d2) this.i;
                MenuBuilder menuBuilder = d2Var.i;
                if (menuBuilder != null && (ow0Var = menuBuilder.e) != null) {
                    ow0Var.H(menuBuilder);
                }
                View view = (View) d2Var.n;
                if (view != null && view.getWindowToken() != null) {
                    if (!z1Var.b()) {
                        if (z1Var.f != null) {
                            z1Var.d(0, 0, false, false);
                        }
                    }
                    d2Var.z = z1Var;
                }
                d2Var.B = null;
                return;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((m2) this.h).g = this.i;
                return;
            case 3:
                ((Application) this.h).unregisterActivityLifecycleCallbacks((m2) this.i);
                return;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                Object obj3 = this.i;
                Object obj4 = this.h;
                try {
                    Method method = n2.d;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        n2.e.invoke(obj4, obj3, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 5:
                final v8 v8Var = (v8) this.i;
                final Uri data = ((Intent) this.h).getData();
                String str2 = IGQCApxXGMWo.iahlzHWgQAAhLTG;
                try {
                    ApplicationInfo applicationInfo = v8Var.i0().getPackageManager().getApplicationInfo(v8Var.l0, 0);
                    if (Build.VERSION.SDK_INT >= 26) {
                        strArr = applicationInfo.splitNames;
                        if (strArr != null) {
                            ArrayList arrayList = new ArrayList(Arrays.asList(applicationInfo.splitPublicSourceDirs));
                            arrayList.add(applicationInfo.publicSourceDir);
                            File v = ju0.v(v8Var.i0(), applicationInfo.packageName, arrayList);
                            if (!v.exists()) {
                                return;
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(v8Var.i0().getContentResolver().openFileDescriptor(data, str2).getFileDescriptor());
                            FileInputStream fileInputStream = new FileInputStream(v);
                            try {
                                try {
                                    byte[] bArr = new byte[rt0.v];
                                    while (true) {
                                        int read = fileInputStream.read(bArr);
                                        if (read <= 0) {
                                            fileInputStream.close();
                                            v8Var.g0().runOnUiThread(new Runnable() { // from class: r8
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i4 = i;
                                                    Uri uri = data;
                                                    v8 v8Var2 = v8Var;
                                                    switch (i4) {
                                                        case 0:
                                                            Toast.makeText(v8Var2.i0(), v8Var2.i0().getString(R.string.saved_to) + " " + uz1.p0(v8Var2.i0().getContentResolver(), uri), 0).show();
                                                            break;
                                                        default:
                                                            Toast.makeText(v8Var2.i0(), v8Var2.i0().getString(R.string.saved_to) + " " + uz1.p0(v8Var2.i0().getContentResolver(), uri), 0).show();
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(v8Var.i0().getContentResolver().openFileDescriptor(data, str2).getFileDescriptor());
                    FileInputStream fileInputStream2 = new FileInputStream(new File(applicationInfo.publicSourceDir));
                    try {
                        try {
                            byte[] bArr2 = new byte[rt0.v];
                            while (true) {
                                int read2 = fileInputStream2.read(bArr2);
                                if (read2 <= 0) {
                                    fileInputStream2.close();
                                    v8Var.g0().runOnUiThread(new Runnable() { // from class: r8
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i4 = i2;
                                            Uri uri = data;
                                            v8 v8Var2 = v8Var;
                                            switch (i4) {
                                                case 0:
                                                    Toast.makeText(v8Var2.i0(), v8Var2.i0().getString(R.string.saved_to) + " " + uz1.p0(v8Var2.i0().getContentResolver(), uri), 0).show();
                                                    break;
                                                default:
                                                    Toast.makeText(v8Var2.i0(), v8Var2.i0().getString(R.string.saved_to) + " " + uz1.p0(v8Var2.i0().getContentResolver(), uri), 0).show();
                                                    break;
                                            }
                                        }
                                    });
                                    return;
                                }
                                fileOutputStream2.write(bArr2, 0, read2);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException | IOException unused3) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                w9 w9Var = (w9) this.i;
                y9 y9Var = w9Var.j;
                if (y9Var.g == w9Var.i) {
                    List list = w9Var.h;
                    k40 k40Var = (k40) this.h;
                    y9Var.e = list;
                    y9Var.f = Collections.unmodifiableList(list);
                    k40Var.a(y9Var.f1219a);
                    y9Var.a();
                    return;
                }
                return;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                my1 my1Var = (my1) this.h;
                Typeface typeface = (Typeface) this.i;
                sl slVar = (sl) my1Var.g;
                if (slVar != null) {
                    slVar.U(typeface);
                    return;
                }
                return;
            case 8:
                ArrayList arrayList2 = (ArrayList) this.h;
                up1 up1Var = (up1) this.i;
                if (arrayList2.contains(up1Var)) {
                    arrayList2.remove(up1Var);
                    d51.b(up1Var.c.M, up1Var.f1051a);
                    return;
                }
                return;
            case rt0.o /* 9 */:
                ai1 h = ai1.h();
                int i4 = r20.e;
                gc2 gc2Var2 = (gc2) this.h;
                h.getClass();
                ((r20) this.i).f871a.c(gc2Var2);
                return;
            case 10:
                ((ao) this.h).H((xh0) this.i);
                return;
            case 11:
                lq0 lq0Var = (lq0) this.i;
                sx sxVar = lq0Var.j;
                while (true) {
                    try {
                        ((Runnable) this.h).run();
                    } catch (Throwable th4) {
                        op0.y(n80.g, th4);
                    }
                    Runnable H = lq0Var.H();
                    if (H == null) {
                        return;
                    }
                    this.h = H;
                    i++;
                    if (i >= 16 && sxVar.F(lq0Var)) {
                        sxVar.D(lq0Var, this);
                        return;
                    }
                }
                break;
            case 12:
                ((rc0) this.h).accept(this.i);
                return;
            case 13:
                ((ao) this.i).H((ga0) this.h);
                return;
            case 14:
                try {
                    ((Runnable) this.i).run();
                    synchronized (((lm1) this.h).k) {
                        ((lm1) this.h).a();
                    }
                    return;
                } catch (Throwable th5) {
                    synchronized (((lm1) this.h).k) {
                        ((lm1) this.h).a();
                        throw th5;
                    }
                }
            case 15:
                la1 la1Var = ((eu1) this.i).g.f;
                String str3 = (String) this.h;
                synchronized (la1Var.k) {
                    try {
                        yc2 c = la1Var.c(str3);
                        if (c != null) {
                            gc2Var = c.f1226a;
                        }
                    } finally {
                    }
                }
                if (gc2Var == null || ym0.b(lw.j, gc2Var.j)) {
                    return;
                }
                synchronized (((eu1) this.i).i) {
                    ((eu1) this.i).l.put(xc1.q(gc2Var), gc2Var);
                    eu1 eu1Var = (eu1) this.i;
                    ((eu1) this.i).m.put(xc1.q(gc2Var), ob2.a(eu1Var.n, gc2Var, (sx) eu1Var.h.i, eu1Var));
                }
                return;
            case 16:
                uu uuVar = (uu) this.h;
                of2 of2Var = (of2) this.i;
                q4 q4Var = (q4) of2Var.h;
                mf2 mf2Var = (mf2) ((ng0) of2Var.l).j.get((u4) of2Var.i);
                if (mf2Var == null) {
                    return;
                }
                if (uuVar.h != 0) {
                    mf2Var.o(uuVar, null);
                    return;
                }
                of2Var.g = true;
                if (q4Var.k()) {
                    if (!of2Var.g || (qk0Var = (qk0) of2Var.j) == null) {
                        return;
                    }
                    q4Var.l(qk0Var, (Set) of2Var.k);
                    return;
                }
                try {
                    q4Var.l(null, q4Var.b());
                    return;
                } catch (SecurityException unused4) {
                    q4Var.c("Failed to get service from broker.");
                    mf2Var.o(new uu(10, null, null), null);
                    return;
                }
            case rt0.p /* 17 */:
                vf2 vf2Var = (vf2) this.i;
                gg2 gg2Var = (gg2) this.h;
                uu uuVar2 = gg2Var.h;
                if (uuVar2.h == 0) {
                    mg2 mg2Var = gg2Var.i;
                    xc1.j(mg2Var);
                    uu uuVar3 = mg2Var.i;
                    if (uuVar3.h != 0) {
                        String valueOf = String.valueOf(uuVar3);
                        new Exception();
                        "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                        vf2Var.n.a(uuVar3);
                        vf2Var.m.n();
                        return;
                    }
                    of2 of2Var2 = vf2Var.n;
                    IBinder iBinder = mg2Var.h;
                    if (iBinder == null) {
                        to2Var = null;
                    } else {
                        int i5 = n1.h;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        to2Var = queryLocalInterface instanceof qk0 ? (qk0) queryLocalInterface : new to2(iBinder);
                    }
                    Set set = vf2Var.k;
                    of2Var2.getClass();
                    if (to2Var == null || set == null) {
                        new Exception();
                        of2Var2.a(new uu(4, null, null));
                    } else {
                        of2Var2.j = to2Var;
                        of2Var2.k = set;
                        if (of2Var2.g) {
                            ((q4) of2Var2.h).l(to2Var, set);
                        }
                    }
                } else {
                    vf2Var.n.a(uuVar2);
                }
                vf2Var.m.n();
                return;
            case 18:
                mj mjVar = (mj) this.h;
                sb sbVar = (sb) this.i;
                mjVar.getClass();
                qj qjVar = li2.l;
                mjVar.v(24, 9, qjVar);
                ni2 ni2Var = qi2.h;
                sbVar.a(qjVar, gj2.k);
                return;
            case 19:
                Future future = (Future) this.h;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.i;
                future.cancel(true);
                int i6 = bk2.f89a;
                Log.isLoggable("BillingClient", 5);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 20:
                mj mjVar2 = (mj) this.h;
                hb1 hb1Var = (hb1) this.i;
                mjVar2.getClass();
                qj qjVar2 = li2.l;
                mjVar2.v(24, 11, qjVar2);
                hb1Var.c(qjVar2, null);
                return;
            case 21:
                mj mjVar3 = (mj) this.h;
                wb wbVar = (wb) this.i;
                qj qjVar3 = li2.l;
                mjVar3.v(24, 7, qjVar3);
                wbVar.g(qjVar3, new ArrayList());
                return;
            case 22:
                a();
                return;
            case 23:
                b();
                return;
            case 24:
                c();
                return;
            case 25:
                ql2 ql2Var = (ql2) this.i;
                xo2 xo2Var = (xo2) ql2Var.j;
                try {
                    xo2 o = ((u40) ql2Var.i).o(((xo2) this.h).c());
                    y30 y30Var = o.b;
                    l5 l5Var = ov1.b;
                    o.b(l5Var, ql2Var);
                    y30Var.d(new ql2((Executor) l5Var, (s41) ql2Var));
                    o.h();
                    y30Var.d(new ql2((Executor) l5Var, ql2Var));
                    o.h();
                    return;
                } catch (CancellationException unused5) {
                    ql2Var.a();
                    return;
                } catch (ri1 e3) {
                    if (e3.getCause() instanceof Exception) {
                        ql2Var.j((Exception) e3.getCause());
                        return;
                    } else {
                        xo2Var.e(e3);
                        return;
                    }
                } catch (Exception e4) {
                    xo2Var.e(e4);
                    return;
                }
            case 26:
                mj mjVar4 = (mj) this.h;
                qj qjVar4 = (qj) this.i;
                wb wbVar2 = (wb) mjVar4.e.i;
                of2 of2Var3 = mjVar4.e;
                if (wbVar2 != null) {
                    ((wb) of2Var3.i).h(qjVar4, null);
                    return;
                } else {
                    int i7 = bk2.f89a;
                    Log.isLoggable("BillingClient", 5);
                    return;
                }
            default:
                mj mjVar5 = (mj) this.h;
                tb tbVar = (tb) this.i;
                qj qjVar5 = li2.l;
                mjVar5.v(24, 3, qjVar5);
                tbVar.d(qjVar5);
                return;
        }
    }

    public String toString() {
        switch (this.g) {
            case 0:
                z12 z12Var = new z12(hk2.class.getSimpleName());
                og ogVar = (og) this.i;
                kp kpVar = new kp(14, false);
                ((kp) z12Var.d).i = kpVar;
                z12Var.d = kpVar;
                kpVar.h = ogVar;
                return z12Var.toString();
            default:
                return super.toString();
        }
    }
}
