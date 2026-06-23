package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import flar2.devcheck.ui.root.ProcessData;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cl0 implements el0 {
    public IBinder g;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }

    @Override // defpackage.el0
    public final ArrayList getProcessData() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("flar2.devcheck.ui.root.IRootAidlInterface");
            this.g.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(ProcessData.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
