package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.Objects;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class d9 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9(int i, Object obj) {
        this.f182a = i;
        this.b = obj;
    }

    public /* synthetic */ d9(vd2 vd2Var) {
        this.f182a = 1;
        Objects.requireNonNull(vd2Var);
        this.b = vd2Var;
    }

    private final void a(ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        el0 el0Var = null;
        ih2 ih2Var = null;
        switch (this.f182a) {
            case 0:
                f9 f9Var = (f9) this.b;
                int i = dl0.g;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("flar2.devcheck.ui.root.IRootAidlInterface");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof el0)) {
                        cl0 cl0Var = new cl0();
                        cl0Var.g = iBinder;
                        el0Var = cl0Var;
                    } else {
                        el0Var = (el0) queryLocalInterface;
                    }
                }
                try {
                    f9Var.h.submit(new x8(f9Var, el0Var.getProcessData(), 0));
                    lh1.o(f9Var.j);
                    break;
                } catch (RemoteException e) {
                    rw.j(e);
                    return;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                vd2 vd2Var = (vd2) this.b;
                vd2Var.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                vd2Var.a().post(new sd2(this, iBinder));
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                bk2.f(XmJDY.dhmFZDQKEMbivq, "Billing Override Service connected.");
                fi2 fi2Var = (fi2) this.b;
                int i2 = hh2.h;
                if (iBinder != null) {
                    IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    ih2Var = queryLocalInterface2 instanceof ih2 ? (ih2) queryLocalInterface2 : new gh2(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
                }
                fi2Var.B = ih2Var;
                ((fi2) this.b).A = 2;
                fi2 fi2Var2 = (fi2) this.b;
                ln2 d = hi2.d(26);
                Objects.requireNonNull(d, "ApiSuccess should not be null");
                fi2Var2.g.n(d);
                break;
            default:
                vo2 vo2Var = (vo2) this.b;
                vo2Var.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                vo2Var.a().post(new pk2(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f182a) {
            case 0:
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                vd2 vd2Var = (vd2) this.b;
                vd2Var.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                vd2Var.a().post(new td2(this));
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                int i = bk2.f89a;
                Log.isLoggable("BillingClientTesting", 5);
                ((fi2) this.b).B = null;
                ((fi2) this.b).A = 0;
                break;
            default:
                vo2 vo2Var = (vo2) this.b;
                vo2Var.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                vo2Var.a().post(new mo2(1, this));
                break;
        }
    }
}
