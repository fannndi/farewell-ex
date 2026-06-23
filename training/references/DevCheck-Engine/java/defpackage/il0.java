package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import flar2.devcheck.ui.root.IShizukuAidlInterface;
import flar2.devcheck.ui.root.ProcessData;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.util.List;

/* loaded from: classes.dex */
public final class il0 implements IShizukuAidlInterface {
    public IBinder g;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final void destroy() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuAidlInterface.DESCRIPTOR);
            this.g.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final String execute(String str, long j) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuAidlInterface.DESCRIPTOR);
            obtain.writeString(str);
            obtain.writeLong(j);
            this.g.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final void exit() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(rlfWzcx.FXqCWMaQrBsIe);
            this.g.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getAllServices() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuAidlInterface.DESCRIPTOR);
            this.g.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(pm1.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getProcessData() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuAidlInterface.DESCRIPTOR);
            this.g.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(ProcessData.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getProcessMemInfo(int[] iArr) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuAidlInterface.DESCRIPTOR);
            obtain.writeIntArray(iArr);
            this.g.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(p91.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getServicesForUid(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuAidlInterface.DESCRIPTOR);
            obtain.writeInt(i);
            this.g.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArrayList();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getTopSnapshot(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuAidlInterface.DESCRIPTOR);
            obtain.writeInt(i);
            this.g.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createTypedArrayList(ia1.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final int[] getUidImportance() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuAidlInterface.DESCRIPTOR);
            this.g.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createIntArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final String readTextFile(String str, int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IShizukuAidlInterface.DESCRIPTOR);
            obtain.writeString(str);
            obtain.writeInt(i);
            this.g.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
