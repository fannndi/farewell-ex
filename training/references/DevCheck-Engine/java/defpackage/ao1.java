package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ao1 extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3 = 0;
        if (i == 2) {
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            bundle.getInt("shizuku:attach-reply-uid", -1);
            IBinder iBinder = do1.f203a;
            do1.c = bundle.getInt("shizuku:attach-reply-version", -1);
            bundle.getInt("shizuku:attach-reply-patch-version", -1);
            bundle.getString("shizuku:attach-reply-secontext");
            do1.d = bundle.getBoolean(rQcwh.JFmYZxbCcAyvw, false);
            bundle.getBoolean("shizuku:attach-reply-should-show-request-permission-rationale", false);
            do1.k();
            return true;
        }
        if (i != 3) {
            if (i != 10001) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("moe.shizuku.server.IShizukuApplication");
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            parcel.readInt();
            parcel.readInt();
            parcel.readString();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
        int readInt = parcel.readInt();
        int i4 = (parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null).getBoolean("shizuku:request-permission-reply-allowed", false) ? 0 : -1;
        synchronized (do1.i) {
            try {
                ArrayList arrayList = do1.k;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    bo1 bo1Var = (bo1) obj;
                    bo1Var.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        ((ho1) bo1Var.f94a).a(i4);
                    } else {
                        do1.l.post(new xj(bo1Var, readInt, i4));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
