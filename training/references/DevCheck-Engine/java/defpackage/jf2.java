package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class jf2 implements IInterface {
    public final /* synthetic */ int g;
    public final IBinder h;
    public final String i;

    public /* synthetic */ jf2(IBinder iBinder, String str, int i) {
        this.g = i;
        this.h = iBinder;
        this.i = str;
    }

    public Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.i);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.g;
        return this.h;
    }

    public Parcel b(Parcel parcel, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.h.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
