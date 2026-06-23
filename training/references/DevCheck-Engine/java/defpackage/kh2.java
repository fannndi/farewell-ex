package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class kh2 extends lg2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f535a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh2(a aVar, Looper looper) {
        super(looper, 2);
        this.f535a = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        ng2 ng2Var;
        a aVar = this.f535a;
        int i = aVar.v.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (ng2Var = (ng2) message.obj) != null) {
                synchronized (ng2Var) {
                    ng2Var.f681a = null;
                }
                a aVar2 = ng2Var.c;
                synchronized (aVar2.k) {
                    aVar2.k.remove(ng2Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !aVar.e()) {
            ng2 ng2Var2 = (ng2) message.obj;
            if (ng2Var2 != null) {
                synchronized (ng2Var2) {
                    ng2Var2.f681a = null;
                }
                a aVar3 = ng2Var2.c;
                synchronized (aVar3.k) {
                    aVar3.k.remove(ng2Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            aVar.s = new uu(message.arg2, null, null);
            if (!aVar.t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    if (!aVar.t) {
                        aVar.v(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            uu uuVar = aVar.s;
            if (uuVar == null) {
                uuVar = new uu(8, null, null);
            }
            aVar.i.q(uuVar);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            uu uuVar2 = aVar.s;
            if (uuVar2 == null) {
                uuVar2 = new uu(8, null, null);
            }
            aVar.i.q(uuVar2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            aVar.i.q(new uu(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            aVar.v(5, null);
            my1 my1Var = aVar.n;
            if (my1Var != null) {
                ((lg0) my1Var.g).a(message.arg2);
            }
            System.currentTimeMillis();
            aVar.u(5, 1, null);
            return;
        }
        if (i4 == 2 && !aVar.a()) {
            ng2 ng2Var3 = (ng2) message.obj;
            if (ng2Var3 != null) {
                synchronized (ng2Var3) {
                    ng2Var3.f681a = null;
                }
                a aVar4 = ng2Var3.c;
                synchronized (aVar4.k) {
                    aVar4.k.remove(ng2Var3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            new StringBuilder(String.valueOf(i5).length() + 34);
            new Exception();
            return;
        }
        ng2 ng2Var4 = (ng2) message.obj;
        synchronized (ng2Var4) {
            try {
                bool = ng2Var4.f681a;
                if (ng2Var4.b) {
                    new StringBuilder(ng2Var4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a aVar5 = ng2Var4.f;
            int i6 = ng2Var4.d;
            if (i6 != 0) {
                aVar5.v(1, null);
                Bundle bundle = ng2Var4.e;
                ng2Var4.b(new uu(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!ng2Var4.a()) {
                aVar5.v(1, null);
                ng2Var4.b(new uu(8, null, null));
            }
        }
        synchronized (ng2Var4) {
            ng2Var4.b = true;
        }
        synchronized (ng2Var4) {
            ng2Var4.f681a = null;
        }
        a aVar6 = ng2Var4.c;
        synchronized (aVar6.k) {
            aVar6.k.remove(ng2Var4);
        }
    }
}
