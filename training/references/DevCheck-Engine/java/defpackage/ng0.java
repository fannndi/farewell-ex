package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ng0 implements Handler.Callback {
    public static final Status o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status p = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object q = new Object();
    public static ng0 r;

    /* renamed from: a, reason: collision with root package name */
    public long f680a;
    public boolean b;
    public lw1 c;
    public hg2 d;
    public final Context e;
    public final jg0 f;
    public final i8 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public final r9 k;
    public final r9 l;
    public final lg2 m;
    public volatile boolean n;

    public ng0(Context context, Looper looper) {
        jg0 jg0Var = jg0.c;
        this.f680a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = new r9(0);
        this.l = new r9(0);
        this.n = true;
        this.e = context;
        lg2 lg2Var = new lg2(looper, this);
        Looper.getMainLooper();
        this.m = lg2Var;
        this.f = jg0Var;
        jg0 jg0Var2 = jg0.c;
        i8 i8Var = new i8();
        i8Var.g = new SparseIntArray();
        i8Var.h = jg0Var2;
        this.g = i8Var;
        PackageManager packageManager = context.getPackageManager();
        if (bw0.k == null) {
            bw0.k = Boolean.valueOf(om0.F() && packageManager.hasSystemFeature(YSHrxiHkAFcciU.aTjtVZ));
        }
        if (bw0.k.booleanValue()) {
            this.n = false;
        }
        lg2Var.sendMessage(lg2Var.obtainMessage(6));
    }

    public static Status b(u4 u4Var, uu uuVar) {
        return new Status(17, "API: " + ((String) u4Var.b.i) + " is not available on this device. Connection failed with: " + String.valueOf(uuVar), uuVar.i, uuVar);
    }

    public static ng0 d(Context context) {
        ng0 ng0Var;
        HandlerThread handlerThread;
        synchronized (q) {
            if (r == null) {
                synchronized (qo2.g) {
                    try {
                        handlerThread = qo2.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            qo2.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = qo2.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = jg0.b;
                r = new ng0(applicationContext, looper);
            }
            ng0Var = r;
        }
        return ng0Var;
    }

    public final boolean a(uu uuVar, int i) {
        boolean booleanValue;
        boolean isInstantApp;
        PendingIntent activity;
        Boolean bool;
        jg0 jg0Var = this.f;
        Context context = this.e;
        jg0Var.getClass();
        synchronized (om0.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = om0.f747a;
            if (context2 != null && (bool = om0.b) != null && context2 == applicationContext) {
                booleanValue = bool.booleanValue();
            }
            om0.b = null;
            if (om0.F()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                om0.b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    om0.b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    om0.b = Boolean.FALSE;
                }
            }
            om0.f747a = applicationContext;
            booleanValue = om0.b.booleanValue();
        }
        if (booleanValue) {
            return false;
        }
        int i2 = uuVar.h;
        if (i2 == 0 || (activity = uuVar.i) == null) {
            Intent a2 = jg0Var.a(i2, context, null);
            activity = a2 != null ? PendingIntent.getActivity(context, 0, a2, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i3 = uuVar.h;
        int i4 = GoogleApiActivity.h;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        jg0Var.f(context, i3, PendingIntent.getActivity(context, 0, intent, ig2.f429a | 134217728));
        return true;
    }

    public final mf2 c(hg2 hg2Var) {
        u4 u4Var = hg2Var.e;
        ConcurrentHashMap concurrentHashMap = this.j;
        mf2 mf2Var = (mf2) concurrentHashMap.get(u4Var);
        if (mf2Var == null) {
            mf2Var = new mf2(this, hg2Var);
            concurrentHashMap.put(u4Var, mf2Var);
        }
        if (mf2Var.h.k()) {
            this.l.add(u4Var);
        }
        mf2Var.m();
        return mf2Var;
    }

    public final void e(uu uuVar, int i) {
        if (a(uuVar, i)) {
            return;
        }
        lg2 lg2Var = this.m;
        lg2Var.sendMessage(lg2Var.obtainMessage(5, i, 0, uuVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        if (r0 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0103, code lost:
    
        if (r0 != 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0376  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng0.handleMessage(android.os.Message):boolean");
    }
}
