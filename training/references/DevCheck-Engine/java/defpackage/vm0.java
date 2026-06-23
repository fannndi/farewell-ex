package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class vm0 {

    /* renamed from: a, reason: collision with root package name */
    public long f1091a;
    public final Object b;
    public final Object c;

    public vm0() {
        this.b = new AtomicBoolean(false);
        this.c = new Handler(Looper.getMainLooper());
        this.f1091a = 437472716458L;
    }

    public vm0(List list) {
        this.b = new d52();
        this.c = list;
    }

    public void a(Context context, int i) {
        ud2 ud2Var;
        try {
            synchronized (je2.class) {
                try {
                    if (je2.f479a == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context;
                        }
                        je2.f479a = new ud2(applicationContext);
                    }
                    ud2Var = je2.f479a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            xo2 a2 = ((ke2) ud2Var.g.b()).a(new bf2(this.f1091a));
            p8 p8Var = new p8(23, this);
            kj1 kj1Var = ov1.f761a;
            a2.b(kj1Var, p8Var);
            a2.b.d(new ql2(kj1Var, new um0(this, i, context)));
            a2.h();
        } catch (Throwable unused) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public void b(Context context) {
        if (((te2) tm0.b().c) == null && ((AtomicBoolean) this.b).compareAndSet(false, true)) {
            Context applicationContext = context.getApplicationContext();
            if (jg0.c.b(applicationContext, kg0.f533a) == 0) {
                try {
                    ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo("com.android.vending", 0);
                    if (applicationInfo != null) {
                        if (applicationInfo.enabled) {
                            a(applicationContext, 1);
                            return;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            ((AtomicBoolean) this.b).set(false);
        }
    }
}
