package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import flar2.devcheck.ui.root.IShizukuAidlInterface;
import flar2.devcheck.ui.shizuku.ShizukuProcessService;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class eo1 implements ServiceConnection {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [flar2.devcheck.ui.root.IShizukuAidlInterface] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        il0 il0Var;
        ArrayList arrayList;
        int i = ShizukuProcessService.h;
        if (iBinder == null) {
            il0Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IShizukuAidlInterface.DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IShizukuAidlInterface)) {
                il0 il0Var2 = new il0();
                il0Var2.g = iBinder;
                il0Var = il0Var2;
            } else {
                il0Var = (IShizukuAidlInterface) queryLocalInterface;
            }
        }
        fo1.f298a = il0Var;
        fo1.b = true;
        ArrayList arrayList2 = fo1.d;
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.clear();
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            try {
                ((Runnable) obj).run();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        fo1.b = false;
        fo1.f298a = null;
    }
}
