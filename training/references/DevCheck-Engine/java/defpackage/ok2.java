package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class ok2 extends ng2 {
    public final IBinder g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok2(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.ng2
    public final boolean a() {
        String interfaceDescriptor;
        a aVar;
        IBinder iBinder = this.g;
        try {
            xc1.j(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            aVar = this.h;
        } catch (RemoteException unused) {
        }
        if (!aVar.r().equals(interfaceDescriptor)) {
            new StringBuilder(aVar.r().length() + 34 + String.valueOf(interfaceDescriptor).length());
            return false;
        }
        IInterface m = aVar.m(iBinder);
        if (m != null && (aVar.u(2, 4, m) || aVar.u(3, 4, m))) {
            aVar.s = null;
            my1 my1Var = aVar.n;
            if (my1Var == null) {
                return true;
            }
            ((lg0) my1Var.g).d();
            return true;
        }
        return false;
    }

    @Override // defpackage.ng2
    public final void b(uu uuVar) {
        my1 my1Var = this.h.o;
        if (my1Var != null) {
            ((mg0) my1Var.g).b(uuVar);
        }
        System.currentTimeMillis();
    }
}
