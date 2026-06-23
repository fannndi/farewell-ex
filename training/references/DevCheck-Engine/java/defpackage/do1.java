package defpackage;

import Cwd.ynLVXgis;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import java.util.ArrayList;
import java.util.Map;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public abstract class do1 {

    /* renamed from: a, reason: collision with root package name */
    public static IBinder f203a = null;
    public static ll0 b = null;
    public static int c = -1;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static final ao1 g;
    public static final zn1 h;
    public static final ArrayList i;
    public static final ArrayList j;
    public static final ArrayList k;
    public static final Handler l;

    static {
        ao1 ao1Var = new ao1();
        ao1Var.attachInterface(ao1Var, yttXLrAeLjN.FfN);
        g = ao1Var;
        h = new zn1();
        i = new ArrayList();
        j = new ArrayList();
        k = new ArrayList();
        l = new Handler(Looper.getMainLooper());
    }

    public static void a(io1 io1Var) {
        if (f) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                io1Var.a();
            } else {
                l.post(new r60(27, io1Var));
            }
        }
        ArrayList arrayList = i;
        synchronized (arrayList) {
            arrayList.add(new bo1(io1Var));
        }
    }

    public static void b(ho1 ho1Var) {
        synchronized (i) {
            k.add(new bo1(ho1Var));
        }
    }

    public static boolean c(IBinder iBinder, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            ao1 ao1Var = g;
            ao1Var.getClass();
            obtain.writeStrongBinder(ao1Var);
            obtain.writeString(str);
            boolean transact = iBinder.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            return transact;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static boolean d(IBinder iBinder, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("shizuku:attach-api-version", 13);
        bundle.putString(MiGPiFgcCQCVh.PkP, str);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            ao1 ao1Var = g;
            ao1Var.getClass();
            obtain.writeStrongBinder(ao1Var);
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            boolean transact = iBinder.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            return transact;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public static void e(co1 co1Var, ServiceConnection serviceConnection) {
        Map map = qo1.f855a;
        co1Var.getClass();
        String className = co1Var.f133a.getClassName();
        Map map2 = qo1.f855a;
        po1 po1Var = (po1) map2.get(className);
        if (po1Var == null) {
            po1Var = new po1(co1Var);
            map2.put(className, po1Var);
        }
        if (serviceConnection != null) {
            po1Var.g.add(serviceConnection);
        }
        try {
            ((jl0) j()).a(po1Var, co1.a(co1Var));
        } catch (RemoteException e2) {
            rw.j(e2);
        }
    }

    public static int f() {
        if (d) {
            return 0;
        }
        try {
            boolean b2 = ((jl0) j()).b();
            d = b2;
            return b2 ? 0 : -1;
        } catch (RemoteException e2) {
            rw.j(e2);
            return 0;
        }
    }

    public static mo1 g(String[] strArr, String[] strArr2, String str) {
        try {
            zk0 i2 = ((jl0) j()).i(strArr, strArr2, str);
            mo1 mo1Var = new mo1();
            mo1Var.g = i2;
            try {
                ((xk0) i2).g.linkToDeath(new lo1(0, mo1Var), 0);
            } catch (RemoteException unused) {
            }
            mo1.j.add(mo1Var);
            return mo1Var;
        } catch (RemoteException e2) {
            rw.j(e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [ll0] */
    public static void h(IBinder iBinder, String str) {
        jl0 jl0Var;
        IBinder iBinder2 = f203a;
        if (iBinder2 == iBinder) {
            return;
        }
        int i2 = 0;
        if (iBinder == null) {
            f203a = null;
            b = null;
            c = -1;
            synchronized (i) {
                try {
                    ArrayList arrayList = j;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        bo1 bo1Var = (bo1) obj;
                        bo1Var.getClass();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            ((jo1) bo1Var.f94a).f491a.a();
                        } else {
                            l.post(new r60(28, (jo1) bo1Var.f94a));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iBinder2 != null) {
            iBinder2.unlinkToDeath(h, 0);
        }
        f203a = iBinder;
        int i3 = kl0.g;
        IInterface queryLocalInterface = iBinder.queryLocalInterface(ynLVXgis.HovvEYvQogpreM);
        if (queryLocalInterface == null || !(queryLocalInterface instanceof ll0)) {
            jl0 jl0Var2 = new jl0();
            jl0Var2.g = iBinder;
            jl0Var = jl0Var2;
        } else {
            jl0Var = (ll0) queryLocalInterface;
        }
        b = jl0Var;
        try {
            f203a.linkToDeath(h, 0);
        } catch (Throwable unused) {
        }
        try {
            if (!d(f203a, str) && !c(f203a, str)) {
                e = true;
            }
        } catch (Throwable th2) {
            Log.getStackTraceString(th2);
        }
        if (e) {
            f = true;
            k();
        }
    }

    public static boolean i() {
        IBinder iBinder = f203a;
        return iBinder != null && iBinder.pingBinder();
    }

    public static ll0 j() {
        ll0 ll0Var = b;
        if (ll0Var != null) {
            return ll0Var;
        }
        c.n("binder haven't been received");
        return null;
    }

    public static void k() {
        ArrayList arrayList = i;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    bo1 bo1Var = (bo1) obj;
                    bo1Var.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((io1) bo1Var.f94a).a();
                    } else {
                        l.post(new r60(27, (io1) bo1Var.f94a));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f = true;
    }
}
