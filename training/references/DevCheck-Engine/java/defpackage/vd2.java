package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class vd2 {
    public static final HashMap o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f1082a;
    public final df2 b;
    public boolean g;
    public final Intent h;
    public final x42 i;
    public d9 m;
    public af2 n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final ff2 k = new ff2(0, this);
    public final AtomicInteger l = new AtomicInteger(0);
    public final String c = "ExpressIntegrityService";
    public final WeakReference j = new WeakReference(null);

    public vd2(Context context, df2 df2Var, Intent intent, x42 x42Var) {
        this.f1082a = context;
        this.b = df2Var;
        this.h = intent;
        this.i = x42Var;
    }

    public static void b(vd2 vd2Var, pe2 pe2Var) {
        af2 af2Var = vd2Var.n;
        ArrayList arrayList = vd2Var.d;
        df2 df2Var = vd2Var.b;
        int i = 0;
        if (af2Var != null || vd2Var.g) {
            if (!vd2Var.g) {
                pe2Var.run();
                return;
            }
            df2Var.b(jYVJoqfHJs.tEOgpTg, new Object[0]);
            arrayList.add(pe2Var);
            return;
        }
        df2Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(pe2Var);
        d9 d9Var = new d9(vd2Var);
        vd2Var.m = d9Var;
        vd2Var.g = true;
        if (vd2Var.f1082a.bindService(vd2Var.h, d9Var, 1)) {
            return;
        }
        df2Var.b("Failed to bind to the service.", new Object[0]);
        vd2Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ef2) obj).a(new wd2("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = o;
        synchronized (hashMap) {
            try {
                String str = this.c;
                if (!hashMap.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    hashMap.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(nv1 nv1Var) {
        synchronized (this.f) {
            this.e.remove(nv1Var);
        }
        a().post(new td2(this));
    }
}
