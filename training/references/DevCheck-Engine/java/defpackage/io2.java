package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.pairip.VMRunner;

/* loaded from: classes.dex */
public final class io2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f445a;
    public final boolean b;
    public final /* synthetic */ of2 c;

    public io2(of2 of2Var, boolean z) {
        this.c = of2Var;
        this.b = z;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f445a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f445a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        if (this.f445a) {
            context.unregisterReceiver(this);
            this.f445a = false;
        } else {
            int i = bk2.f89a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    public final void c(Bundle bundle, qj qjVar, int i) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            ji2 ji2Var = (ji2) this.c.j;
            if (byteArray == null) {
                ((xi0) ji2Var).m(hi2.b(23, i, qjVar));
                return;
            }
            byte[] byteArray2 = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i2 = ol2.f745a;
            synchronized (ol2.class) {
                int i3 = ol2.f745a;
                om2 om2Var = om2.c;
                tl2.O();
                int i4 = ol2.f745a;
            }
            ((xi0) ji2Var).m(in2.n(byteArray2, null));
        } catch (Throwable unused) {
            int i5 = bk2.f89a;
            Log.isLoggable("BillingBroadcastManager", 5);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("9OgTxK6Lxt3ttHBG", new Object[]{this, context, intent});
    }
}
