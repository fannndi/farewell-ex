package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Pair;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class lh1 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final String f588a = "com.topjohnwu.superuser.DAEMON_MODE";

    public static void a(Intent intent, ServiceConnection serviceConnection) {
        b(intent, x32.b, serviceConnection);
    }

    public static void b(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        sn1 c;
        if (Objects.equals(ju0.U(), Boolean.FALSE) || (c = c(intent, executor, serviceConnection)) == null) {
            return;
        }
        wn1.m.execute(new r60(18, c));
    }

    public static sn1 c(final Intent intent, final Executor executor, final ServiceConnection serviceConnection) {
        if (th1.g == null) {
            th1.g = new th1();
        }
        final th1 th1Var = th1.g;
        rh1 a2 = th1Var.a(intent, executor, serviceConnection);
        if (a2 == null) {
            return null;
        }
        th1Var.d.add(new Object() { // from class: mh1
        });
        int i = ((Boolean) ((Pair) a2).second).booleanValue() ? 2 : 1;
        int i2 = th1Var.c;
        if ((i2 & i) != 0) {
            return null;
        }
        th1Var.c = i | i2;
        return th1Var.d((ComponentName) ((Pair) a2).first, ((Boolean) ((Pair) a2).second).booleanValue() ? ILBLnlCHDVqsSN.SbTHB : "start");
    }

    @Deprecated
    public static Runnable d(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        sn1 c = c(intent, executor, serviceConnection);
        if (c == null) {
            return null;
        }
        return new r60(18, c);
    }

    public static void l(Intent intent) {
        sn1 m;
        if (Objects.equals(ju0.U(), Boolean.FALSE) || (m = m(intent)) == null) {
            return;
        }
        wn1.m.execute(new r60(18, m));
    }

    public static sn1 m(Intent intent) {
        if (th1.g == null) {
            th1.g = new th1();
        }
        th1 th1Var = th1.g;
        th1Var.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            c.n("This method can only be called on the main thread");
            return null;
        }
        rh1 c = th1.c(intent);
        ph1 ph1Var = ((Boolean) ((Pair) c).second).booleanValue() ? th1Var.b : th1Var.f988a;
        if (ph1Var == null) {
            if (((Boolean) ((Pair) c).second).booleanValue()) {
                return th1Var.d((ComponentName) ((Pair) c).first, "stop");
            }
            return null;
        }
        try {
            ph1Var.b.h(-1, (ComponentName) ((Pair) c).first);
        } catch (RemoteException unused) {
        }
        th1Var.b(c);
        return null;
    }

    public static void o(ServiceConnection serviceConnection) {
        if (th1.g == null) {
            th1.g = new th1();
        }
        th1 th1Var = th1.g;
        th1Var.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            c.n("This method can only be called on the main thread");
            return;
        }
        oh1 oh1Var = (oh1) th1Var.f.remove(serviceConnection);
        if (oh1Var != null) {
            qh1 qh1Var = (qh1) ((Pair) oh1Var).first;
            int i = qh1Var.d;
            rh1 rh1Var = qh1Var.f843a;
            int i2 = i - 1;
            qh1Var.d = i2;
            if (i2 == 0) {
                th1Var.e.remove(rh1Var);
                try {
                    qh1Var.c.b.e((ComponentName) ((Pair) rh1Var).first);
                } catch (RemoteException unused) {
                }
            }
            oh1Var.a(serviceConnection);
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        super.attachBaseContext(f(context2));
        if (zh1.k == null) {
            zh1.k = new zh1(context);
        }
        zh1 zh1Var = zh1.k;
        zh1Var.getClass();
        zh1Var.h.put(e(), new yh1(this));
        h();
    }

    public ComponentName e() {
        return new ComponentName(this, getClass());
    }

    public Context f(Context context) {
        return context;
    }

    public abstract IBinder g(Intent intent);

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return ju0.c;
    }

    public void h() {
    }

    public void i() {
    }

    public void j(Intent intent) {
    }

    public abstract boolean k(Intent intent);

    public final void n() {
        if (zh1.k == null) {
            zh1.k = new zh1(this);
        }
        zh1 zh1Var = zh1.k;
        ComponentName e = e();
        zh1Var.getClass();
        x32.a(new vh1(zh1Var, e, 0));
    }
}
