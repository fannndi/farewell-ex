package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class ff2 implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ff2(int i, Object obj) {
        this.f278a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.f278a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                vd2 vd2Var = (vd2) obj;
                df2 df2Var = vd2Var.b;
                df2Var.b("reportBinderDeath", new Object[0]);
                if (vd2Var.j.get() != null) {
                    rw.b();
                    return;
                }
                df2Var.b("%s : Binder has died.", vd2Var.c);
                ArrayList arrayList = vd2Var.d;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ((ef2) obj2).a(new RemoteException(String.valueOf(vd2Var.c).concat(" : Binder has died.")));
                }
                arrayList.clear();
                synchronized (vd2Var.f) {
                    HashSet hashSet = vd2Var.e;
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((nv1) it.next()).a(new RemoteException(String.valueOf(vd2Var.c).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                }
                return;
            default:
                vo2 vo2Var = (vo2) obj;
                vo2Var.b.b("reportBinderDeath", new Object[0]);
                if (vo2Var.i.get() != null) {
                    rw.b();
                    return;
                }
                vo2Var.b.b("%s : Binder has died.", vo2Var.c);
                ArrayList arrayList2 = vo2Var.d;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    RemoteException remoteException = new RemoteException(String.valueOf(vo2Var.c).concat(" : Binder has died."));
                    nv1 nv1Var = ((wm2) obj3).g;
                    if (nv1Var != null) {
                        nv1Var.a(remoteException);
                    }
                }
                vo2Var.d.clear();
                synchronized (vo2Var.f) {
                    vo2Var.c();
                }
                return;
        }
    }
}
