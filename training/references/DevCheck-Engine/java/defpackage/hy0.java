package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class hy0 extends Binder implements wk0 {
    public final /* synthetic */ MultiInstanceInvalidationService g;

    public hy0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.g = multiInstanceInvalidationService;
        attachInterface(this, wk0.c);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        iy0 iy0Var;
        String str = wk0.c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        vk0 vk0Var = null;
        vk0 vk0Var2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(vk0.b);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof vk0)) {
                    uk0 uk0Var = new uk0();
                    uk0Var.g = readStrongBinder;
                    vk0Var = uk0Var;
                } else {
                    vk0Var = (vk0) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            vk0Var.getClass();
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.g;
                synchronized (multiInstanceInvalidationService.i) {
                    try {
                        int i4 = multiInstanceInvalidationService.g + 1;
                        multiInstanceInvalidationService.g = i4;
                        if (multiInstanceInvalidationService.i.register(vk0Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.h.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.g--;
                        }
                    } finally {
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(vk0.b);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof vk0)) {
                    uk0 uk0Var2 = new uk0();
                    uk0Var2.g = readStrongBinder2;
                    vk0Var2 = uk0Var2;
                } else {
                    vk0Var2 = (vk0) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            vk0Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.g;
            synchronized (multiInstanceInvalidationService2.i) {
                multiInstanceInvalidationService2.i.unregister(vk0Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int readInt2 = parcel.readInt();
        String[] createStringArray = parcel.createStringArray();
        createStringArray.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.g;
        synchronized (multiInstanceInvalidationService3.i) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.h.get(Integer.valueOf(readInt2));
                if (str2 != null) {
                    int beginBroadcast = multiInstanceInvalidationService3.i.beginBroadcast();
                    while (true) {
                        iy0Var = multiInstanceInvalidationService3.i;
                        if (i3 >= beginBroadcast) {
                            break;
                        }
                        try {
                            Object broadcastCookie = iy0Var.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.h.get(num);
                            if (readInt2 != intValue && str2.equals(str3)) {
                                try {
                                    ((vk0) multiInstanceInvalidationService3.i.getBroadcastItem(i3)).c(createStringArray);
                                } catch (RemoteException unused) {
                                }
                            }
                            i3++;
                        } catch (Throwable th) {
                            multiInstanceInvalidationService3.i.finishBroadcast();
                            throw th;
                        }
                    }
                    iy0Var.finishBroadcast();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
