package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Pair;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class th1 implements Handler.Callback {
    public static th1 g;

    /* renamed from: a, reason: collision with root package name */
    public ph1 f988a;
    public ph1 b;
    public int c = 0;
    public final ArrayList d = new ArrayList();
    public final ArrayMap e = new ArrayMap();
    public final ArrayMap f = new ArrayMap();

    public static rh1 c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            c.m("The intent does not have a component set");
            return null;
        }
        if (component.getPackageName().equals(ju0.F().getPackageName())) {
            return new rh1(component, intent.hasCategory(lh1.f588a));
        }
        c.m(XmJDY.iSsMI);
        return null;
    }

    public final rh1 a(Intent intent, Executor executor, final ServiceConnection serviceConnection) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            c.n("This method can only be called on the main thread");
            return null;
        }
        final rh1 c = c(intent);
        ArrayMap arrayMap = this.e;
        qh1 qh1Var = (qh1) arrayMap.get(c);
        final int i = 1;
        ArrayMap arrayMap2 = this.f;
        if (qh1Var != null) {
            arrayMap2.put(serviceConnection, new oh1(qh1Var, executor));
            qh1Var.d++;
            final IBinder iBinder = qh1Var.b;
            final int i2 = 0;
            executor.execute(new Runnable() { // from class: nh1
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i2;
                    IBinder iBinder2 = iBinder;
                    rh1 rh1Var = c;
                    ServiceConnection serviceConnection2 = serviceConnection;
                    switch (i3) {
                        case 0:
                            serviceConnection2.onServiceConnected((ComponentName) ((Pair) rh1Var).first, iBinder2);
                            break;
                        default:
                            serviceConnection2.onServiceConnected((ComponentName) ((Pair) rh1Var).first, iBinder2);
                            break;
                    }
                }
            });
            return null;
        }
        ph1 ph1Var = ((Boolean) ((Pair) c).second).booleanValue() ? this.b : this.f988a;
        if (ph1Var == null) {
            return c;
        }
        try {
            final IBinder g2 = ph1Var.b.g(intent);
            if (g2 == null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    executor.execute(new n51(serviceConnection, 11, c));
                }
                return null;
            }
            qh1 qh1Var2 = new qh1(c, g2, ph1Var);
            arrayMap2.put(serviceConnection, new oh1(qh1Var2, executor));
            arrayMap.put(c, qh1Var2);
            executor.execute(new Runnable() { // from class: nh1
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = i;
                    IBinder iBinder2 = g2;
                    rh1 rh1Var = c;
                    ServiceConnection serviceConnection2 = serviceConnection;
                    switch (i3) {
                        case 0:
                            serviceConnection2.onServiceConnected((ComponentName) ((Pair) rh1Var).first, iBinder2);
                            break;
                        default:
                            serviceConnection2.onServiceConnected((ComponentName) ((Pair) rh1Var).first, iBinder2);
                            break;
                    }
                }
            });
            return null;
        } catch (RemoteException unused) {
            ph1Var.binderDied();
            return c;
        }
    }

    public final void b(rh1 rh1Var) {
        qh1 qh1Var = (qh1) this.e.remove(rh1Var);
        if (qh1Var != null) {
            Iterator it = this.f.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                oh1 oh1Var = (oh1) entry.getValue();
                if (qh1Var == ((qh1) ((Pair) oh1Var).first)) {
                    oh1Var.a((ServiceConnection) entry.getKey());
                    it.remove();
                }
            }
        }
    }

    public final tb d(ComponentName componentName, String str) {
        Context F = ju0.F();
        if ((this.c & 4) == 0) {
            IntentFilter intentFilter = new IntentFilter("com.topjohnwu.superuser.RECEIVER_BROADCAST");
            if (Build.VERSION.SDK_INT >= 26) {
                F.registerReceiver(new sh1(this), intentFilter, "android.permission.BROADCAST_PACKAGE_REMOVED", null, 4);
            } else {
                F.registerReceiver(new sh1(this), intentFilter, "android.permission.BROADCAST_PACKAGE_REMOVED", null);
            }
            this.c |= 4;
        }
        return new tb(str, 10, componentName);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            b(new rh1((ComponentName) message.obj, message.arg1 != 0));
        }
        return false;
    }
}
