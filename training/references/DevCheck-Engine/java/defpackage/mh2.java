package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class mh2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final wb f633a;
    public final /* synthetic */ mj b;

    public /* synthetic */ mh2(mj mjVar, wb wbVar) {
        this.b = mjVar;
        this.f633a = wbVar;
    }

    public final void a(qj qjVar) {
        synchronized (this.b.f636a) {
            try {
                if (this.b.b == 3) {
                    return;
                }
                this.f633a.f(qjVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        int i = bk2.f89a;
        Log.isLoggable("BillingClient", 5);
        int i2 = 1;
        try {
            mj mjVar = this.b;
            synchronized (mjVar.f636a) {
                z = mjVar.b == 1;
            }
            xi0 xi0Var = this.b.g;
            if (z) {
                hn2 q = in2.q();
                q.c();
                in2.p((in2) q.h, 6);
                mn2 r = nn2.r();
                r.d(122);
                q.d(r);
                xi0Var.m((in2) q.b());
            } else {
                pn2 n = pn2.n();
                xi0Var.getClass();
                try {
                    zn2 t = ao2.t();
                    t.d((tn2) xi0Var.g);
                    t.c();
                    ao2.p((ao2) t.h, n);
                    ((hk) xi0Var.h).f((ao2) t.b());
                } catch (Throwable unused) {
                    bk2.g("BillingLogger");
                }
            }
        } catch (Throwable unused2) {
            bk2.g("BillingClient");
        }
        synchronized (this.b.f636a) {
            if (this.b.b != 3 && this.b.b != 0) {
                this.b.n(0);
                this.b.o();
                wb wbVar = this.f633a;
                wbVar.i = false;
                wb.x.postDelayed(new qb(wbVar, i2), wbVar.t);
                wbVar.t = Math.min(wbVar.t * 2, 900000L);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ch2 zg2Var;
        bk2.f("BillingClient", UQdsoaJMID.hQtIAJfO);
        synchronized (this.b.f636a) {
            try {
                if (this.b.b == 3) {
                    return;
                }
                mj mjVar = this.b;
                int i = ah2.h;
                if (iBinder == null) {
                    zg2Var = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("TryRoom");
                    zg2Var = queryLocalInterface instanceof ch2 ? (ch2) queryLocalInterface : new zg2(iBinder, "TryRoom", 1);
                }
                mjVar.h = zg2Var;
                mj mjVar2 = this.b;
                if (mj.h(new Callable() { // from class: jh2
                    /* JADX WARN: Removed duplicated region for block: B:157:0x01d9  */
                    /* JADX WARN: Removed duplicated region for block: B:159:0x01de  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 662
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh2.call():java.lang.Object");
                    }
                }, 30000L, new f52(8, this), mjVar2.t(), mjVar2.k()) == null) {
                    mj mjVar3 = this.b;
                    qj i2 = mjVar3.i();
                    mjVar3.v(25, 6, i2);
                    a(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        int i = bk2.f89a;
        Log.isLoggable("BillingClient", 5);
        int i2 = 1;
        try {
            mj mjVar = this.b;
            synchronized (mjVar.f636a) {
                z = mjVar.b == 1;
            }
            xi0 xi0Var = this.b.g;
            if (z) {
                hn2 q = in2.q();
                q.c();
                in2.p((in2) q.h, 6);
                mn2 r = nn2.r();
                r.d(121);
                q.d(r);
                xi0Var.m((in2) q.b());
            } else {
                eo2 n = eo2.n();
                xi0Var.getClass();
                if (n != null) {
                    try {
                        zn2 t = ao2.t();
                        t.d((tn2) xi0Var.g);
                        t.c();
                        ao2.s((ao2) t.h, n);
                        ((hk) xi0Var.h).f((ao2) t.b());
                    } catch (Throwable unused) {
                        bk2.g("BillingLogger");
                    }
                }
            }
        } catch (Throwable unused2) {
            bk2.g("BillingClient");
        }
        synchronized (this.b.f636a) {
            try {
                if (this.b.b == 3) {
                    return;
                }
                this.b.n(0);
                wb wbVar = this.f633a;
                wbVar.i = false;
                wb.x.postDelayed(new qb(wbVar, i2), wbVar.t);
                wbVar.t = Math.min(wbVar.t * 2, 900000L);
            } finally {
            }
        }
    }
}
