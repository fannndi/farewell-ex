package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class dl0 extends Binder implements el0 {
    public static final /* synthetic */ int g = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("flar2.devcheck.ui.root.IRootAidlInterface");
        }
        if (i == 1598968902) {
            parcel2.writeString("flar2.devcheck.ui.root.IRootAidlInterface");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        ArrayList processData = ((da1) this).getProcessData();
        parcel2.writeNoException();
        int size = processData.size();
        parcel2.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) processData.get(i3);
            if (parcelable != null) {
                parcel2.writeInt(1);
                parcelable.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
        }
        return true;
    }
}
