package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pk2 extends wm2 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public pk2(d9 d9Var, IBinder iBinder) {
        this.i = iBinder;
        this.j = d9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk2(em2 em2Var, nv1 nv1Var, nv1 nv1Var2) {
        super(nv1Var);
        this.i = nv1Var2;
        this.j = em2Var;
    }

    @Override // defpackage.wm2
    public final void a() {
        HashMap hashMap;
        qk2 qk2Var = null;
        int i = 0;
        switch (this.h) {
            case 0:
                try {
                    em2 em2Var = (em2) this.j;
                    qk2 qk2Var2 = em2Var.f238a.m;
                    String str = em2Var.b;
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = vm2.f1092a;
                    synchronized (vm2.class) {
                        hashMap = vm2.f1092a;
                        hashMap.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
                    if (hashMap.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
                    }
                    if (hashMap.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
                    }
                    em2 em2Var2 = (em2) this.j;
                    nv1 nv1Var = (nv1) this.i;
                    String str2 = em2Var2.b;
                    rl2 rl2Var = new rl2(em2Var2, nv1Var);
                    bj2 bj2Var = (bj2) qk2Var2;
                    bj2Var.getClass();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    obtain.writeString(str);
                    int i2 = bi2.f87a;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(rl2Var);
                    try {
                        bj2Var.g.transact(2, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e) {
                    em2 em2Var3 = (em2) this.j;
                    o1 o1Var = em2.c;
                    Object[] objArr = {em2Var3.b};
                    o1Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        o1.d(o1Var.h, "error requesting in-app review for %s", objArr);
                    }
                    ((nv1) this.i).a(new RuntimeException(e));
                    return;
                }
            default:
                vo2 vo2Var = (vo2) ((d9) this.j).b;
                IBinder iBinder = (IBinder) this.i;
                int i3 = ck2.h;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    qk2Var = queryLocalInterface instanceof qk2 ? (qk2) queryLocalInterface : new bj2(iBinder);
                }
                vo2Var.m = qk2Var;
                o1 o1Var2 = vo2Var.b;
                o1Var2.b("linkToDeath", new Object[0]);
                try {
                    ((bj2) vo2Var.m).g.linkToDeath(vo2Var.j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr2 = new Object[0];
                    o1Var2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        o1.d(o1Var2.h, "linkToDeath failed", objArr2);
                    }
                }
                vo2Var.g = false;
                ArrayList arrayList = vo2Var.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((Runnable) obj).run();
                }
                vo2Var.d.clear();
                return;
        }
    }
}
