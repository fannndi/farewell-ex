package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class vo2 {
    public static final HashMap n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f1095a;
    public final o1 b;
    public boolean g;
    public final Intent h;
    public d9 l;
    public qk2 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final ff2 j = new ff2(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public vo2(Context context, o1 o1Var, Intent intent) {
        this.f1095a = context;
        this.b = o1Var;
        this.h = intent;
    }

    public static void b(vo2 vo2Var, pk2 pk2Var) {
        qk2 qk2Var = vo2Var.m;
        o1 o1Var = vo2Var.b;
        ArrayList arrayList = vo2Var.d;
        int i = 0;
        if (qk2Var != null || vo2Var.g) {
            if (!vo2Var.g) {
                pk2Var.run();
                return;
            } else {
                o1Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(pk2Var);
                return;
            }
        }
        o1Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(pk2Var);
        d9 d9Var = new d9(3, vo2Var);
        vo2Var.l = d9Var;
        vo2Var.g = true;
        if (vo2Var.f1095a.bindService(vo2Var.h, d9Var, 1)) {
            return;
        }
        o1Var.b("Failed to bind to the service.", new Object[0]);
        vo2Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pt ptVar = new pt("Failed to bind to the service.");
            nv1 nv1Var = ((wm2) obj).g;
            if (nv1Var != null) {
                nv1Var.a(ptVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((nv1) it.next()).a(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
