package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.ArraySet;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class mo1 extends Process implements Parcelable {
    public zk0 g;
    public ParcelFileDescriptor.AutoCloseOutputStream h;
    public ParcelFileDescriptor.AutoCloseInputStream i;
    public static final Set j = Collections.synchronizedSet(new ArraySet());
    public static final Parcelable.Creator<mo1> CREATOR = new i11(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Process
    public final void destroy() {
        try {
            xk0 xk0Var = (xk0) this.g;
            xk0Var.getClass();
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("moe.shizuku.server.IRemoteProcess");
                if (!xk0Var.g.transact(6, obtain, obtain2, 0)) {
                    int i = yk0.g;
                }
                obtain2.readException();
                obtain2.recycle();
                obtain.recycle();
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        } catch (RemoteException e) {
            rw.j(e);
        }
    }

    @Override // java.lang.Process
    public final int exitValue() {
        try {
            return ((xk0) this.g).a();
        } catch (RemoteException e) {
            rw.j(e);
            return 0;
        }
    }

    @Override // java.lang.Process
    public final InputStream getErrorStream() {
        try {
            return new ParcelFileDescriptor.AutoCloseInputStream(((xk0) this.g).b());
        } catch (RemoteException e) {
            rw.j(e);
            return null;
        }
    }

    @Override // java.lang.Process
    public final InputStream getInputStream() {
        if (this.i == null) {
            try {
                this.i = new ParcelFileDescriptor.AutoCloseInputStream(((xk0) this.g).d());
            } catch (RemoteException e) {
                rw.j(e);
                return null;
            }
        }
        return this.i;
    }

    @Override // java.lang.Process
    public final OutputStream getOutputStream() {
        if (this.h == null) {
            try {
                this.h = new ParcelFileDescriptor.AutoCloseOutputStream(((xk0) this.g).i());
            } catch (RemoteException e) {
                rw.j(e);
                return null;
            }
        }
        return this.h;
    }

    @Override // java.lang.Process
    public final int waitFor() {
        try {
            return ((xk0) this.g).j();
        } catch (RemoteException e) {
            rw.j(e);
            return 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(((xk0) this.g).asBinder());
    }
}
