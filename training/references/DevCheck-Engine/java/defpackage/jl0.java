package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class jl0 implements ll0 {
    public IBinder g;

    public final int a(po1 po1Var, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            obtain.writeStrongBinder(po1Var);
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            if (!this.g.transact(12, obtain, obtain2, 0)) {
                int i = kl0.g;
            }
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
            return readInt;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }

    public final boolean b() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            if (!this.g.transact(16, obtain, obtain2, 0)) {
                int i = kl0.g;
            }
            obtain2.readException();
            boolean z = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final int d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            if (!this.g.transact(3, obtain, obtain2, 0)) {
                int i = kl0.g;
            }
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
            return readInt;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final zk0 i(String[] strArr, String[] strArr2, String str) {
        zk0 zk0Var;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            obtain.writeStringArray(strArr);
            obtain.writeStringArray(strArr2);
            obtain.writeString(str);
            if (!this.g.transact(8, obtain, obtain2, 0)) {
                int i = kl0.g;
            }
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            int i2 = yk0.g;
            if (readStrongBinder == null) {
                zk0Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("moe.shizuku.server.IRemoteProcess");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof zk0)) {
                    xk0 xk0Var = new xk0();
                    xk0Var.g = readStrongBinder;
                    zk0Var = xk0Var;
                } else {
                    zk0Var = (zk0) queryLocalInterface;
                }
            }
            return zk0Var;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void j(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            obtain.writeInt(i);
            if (!this.g.transact(15, obtain, obtain2, 0)) {
                int i2 = kl0.g;
            }
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
