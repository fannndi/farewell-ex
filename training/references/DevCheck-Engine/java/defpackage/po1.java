package defpackage;

import android.content.ComponentName;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class po1 extends Binder implements IInterface {
    public static final Handler j = new Handler(Looper.getMainLooper());
    public final HashSet g;
    public final ComponentName h;
    public boolean i;

    public po1(co1 co1Var) {
        attachInterface(this, "moe.shizuku.server.IShizukuServiceConnection");
        this.g = new HashSet();
        this.i = false;
        this.h = co1Var.f133a;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        Handler handler = j;
        int i4 = 1;
        if (i == 1) {
            parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
            IBinder readStrongBinder = parcel.readStrongBinder();
            handler.post(new n51(this, 16, readStrongBinder));
            try {
                readStrongBinder.linkToDeath(new lo1(i4, this), 0);
            } catch (RemoteException unused) {
            }
        } else {
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("moe.shizuku.server.IShizukuServiceConnection");
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
            if (!this.i) {
                this.i = true;
                handler.post(new oo1(i3, this));
                return true;
            }
        }
        return true;
    }
}
