package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;

/* loaded from: classes.dex */
public final class of2 implements rd {
    public boolean g;
    public final Object h;
    public final Object i;
    public Object j;
    public Object k;
    public final Object l;

    public of2(Context context, wb wbVar, xi0 xi0Var) {
        this.h = context;
        this.i = wbVar;
        this.j = xi0Var;
        this.k = new io2(this, true);
        this.l = new io2(this, false);
    }

    public of2(ng0 ng0Var, q4 q4Var, u4 u4Var) {
        this.l = ng0Var;
        this.j = null;
        this.k = null;
        this.g = false;
        this.h = q4Var;
        this.i = u4Var;
    }

    public void a(uu uuVar) {
        mf2 mf2Var = (mf2) ((ng0) this.l).j.get((u4) this.i);
        if (mf2Var != null) {
            mf2Var.p(uuVar);
        }
    }

    public void b(boolean z) {
        IntentFilter intentFilter = new IntentFilter(bOxzFZXgEkjph.rtUslhTyrfNd);
        IntentFilter intentFilter2 = new IntentFilter("TryRoom");
        intentFilter2.addAction("TryRoom");
        this.g = z;
        ((io2) this.l).a((Context) this.h, intentFilter2);
        boolean z2 = this.g;
        io2 io2Var = (io2) this.k;
        Context context = (Context) this.h;
        if (!z2) {
            io2Var.a(context, intentFilter);
            return;
        }
        synchronized (io2Var) {
            try {
                if (io2Var.f445a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(io2Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != io2Var.b ? 4 : 2);
                } else {
                    context.registerReceiver(io2Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                io2Var.f445a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rd
    public void q(uu uuVar) {
        ((ng0) this.l).m.post(new hk2(this, uuVar, 16, false));
    }
}
