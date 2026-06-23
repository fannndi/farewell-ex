package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class ak2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f34a;
    public final /* synthetic */ a b;

    public ak2(a aVar, int i) {
        this.b = aVar;
        this.f34a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        a aVar = this.b;
        if (iBinder == null) {
            synchronized (aVar.f) {
                i = aVar.m;
            }
            if (i == 3) {
                aVar.t = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            kh2 kh2Var = aVar.e;
            kh2Var.sendMessage(kh2Var.obtainMessage(i2, aVar.v.get(), 16));
            return;
        }
        synchronized (aVar.g) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.h = (queryLocalInterface == null || !(queryLocalInterface instanceof rg2)) ? new rg2(iBinder) : (rg2) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar2 = this.b;
        int i3 = this.f34a;
        aVar2.getClass();
        hl2 hl2Var = new hl2(aVar2, 0, null);
        kh2 kh2Var2 = aVar2.e;
        kh2Var2.sendMessage(kh2Var2.obtainMessage(7, i3, -1, hl2Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.b;
        synchronized (aVar.g) {
            aVar.h = null;
        }
        a aVar2 = this.b;
        int i = this.f34a;
        kh2 kh2Var = aVar2.e;
        kh2Var.sendMessage(kh2Var.obtainMessage(6, i, 1));
    }
}
