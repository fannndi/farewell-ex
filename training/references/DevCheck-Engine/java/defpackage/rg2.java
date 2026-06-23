package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class rg2 implements IInterface {
    public final IBinder g;

    public rg2(IBinder iBinder) {
        this.g = iBinder;
    }

    public final void a(zi2 zi2Var, dg0 dg0Var) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(zi2Var);
            obtain.writeInt(1);
            lh2.a(dg0Var, obtain, 0);
            this.g.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }
}
