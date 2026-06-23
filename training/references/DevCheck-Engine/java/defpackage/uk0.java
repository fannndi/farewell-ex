package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class uk0 implements vk0 {
    public IBinder g;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }

    @Override // defpackage.vk0
    public final void c(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(vk0.b);
            obtain.writeStringArray(strArr);
            this.g.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
