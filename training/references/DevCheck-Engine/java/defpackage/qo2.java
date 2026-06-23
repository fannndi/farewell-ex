package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class qo2 {
    public static final Object g = new Object();
    public static qo2 h;
    public static HandlerThread i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f856a = new HashMap();
    public final Context b;
    public volatile lg2 c;
    public final ai1 d;
    public final long e;
    public final long f;

    public qo2(Context context, Looper looper) {
        dp1 dp1Var = new dp1(1, this);
        this.b = context.getApplicationContext();
        lg2 lg2Var = new lg2(looper, dp1Var);
        Looper.getMainLooper();
        this.c = lg2Var;
        if (ai1.i == null) {
            synchronized (ai1.h) {
                try {
                    if (ai1.i == null) {
                        ai1 ai1Var = new ai1();
                        new ConcurrentHashMap();
                        ai1.i = ai1Var;
                    }
                } finally {
                }
            }
        }
        ai1 ai1Var2 = ai1.i;
        xc1.j(ai1Var2);
        this.d = ai1Var2;
        this.e = 5000L;
        this.f = 300000L;
    }

    public final uu a(ko2 ko2Var, ak2 ak2Var, String str) {
        uu uuVar;
        HashMap hashMap = this.f856a;
        synchronized (hashMap) {
            try {
                no2 no2Var = (no2) hashMap.get(ko2Var);
                if (no2Var == null) {
                    no2Var = new no2(this, ko2Var);
                    no2Var.f694a.put(ak2Var, ak2Var);
                    uuVar = no2Var.a(str, null);
                    hashMap.put(ko2Var, no2Var);
                } else {
                    this.c.removeMessages(0, ko2Var);
                    if (no2Var.f694a.containsKey(ak2Var)) {
                        String ko2Var2 = ko2Var.toString();
                        StringBuilder sb = new StringBuilder(ko2Var2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(ko2Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                    no2Var.f694a.put(ak2Var, ak2Var);
                    int i2 = no2Var.b;
                    if (i2 == 1) {
                        ak2Var.onServiceConnected(no2Var.f, no2Var.d);
                    } else if (i2 == 2) {
                        uuVar = no2Var.a(str, null);
                    }
                    uuVar = null;
                }
                if (no2Var.c) {
                    return uu.l;
                }
                if (uuVar == null) {
                    uuVar = new uu(-1, null, null);
                }
                return uuVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z) {
        ko2 ko2Var = new ko2(str, z);
        xc1.k("ServiceConnection must not be null", serviceConnection);
        HashMap hashMap = this.f856a;
        synchronized (hashMap) {
            try {
                no2 no2Var = (no2) hashMap.get(ko2Var);
                if (no2Var == null) {
                    String ko2Var2 = ko2Var.toString();
                    StringBuilder sb = new StringBuilder(ko2Var2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(ko2Var2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!no2Var.f694a.containsKey(serviceConnection)) {
                    String ko2Var3 = ko2Var.toString();
                    StringBuilder sb2 = new StringBuilder(ko2Var3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(ko2Var3);
                    throw new IllegalStateException(sb2.toString());
                }
                no2Var.f694a.remove(serviceConnection);
                if (no2Var.f694a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, ko2Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
