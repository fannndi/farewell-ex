package defpackage;

import android.app.Application;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class ex1 extends a4 {
    public static final ly1[] v = {ly1.g, ly1.h, ly1.i, ly1.l, ly1.m};
    public final qy0 c;
    public final qy0 d;
    public final ExecutorService e;
    public final Handler f;
    public final Application g;
    public SensorManager h;
    public my1 i;
    public ny1 j;
    public y41 k;
    public dm1 l;
    public dg m;
    public boolean n;
    public boolean o;
    public final ry1 p;
    public List q;
    public final HashMap r;
    public String s;
    public final dx1 t;
    public final dx1 u;

    public ex1(Application application) {
        super(application);
        this.c = new qy0();
        this.d = new qy0();
        this.e = Executors.newSingleThreadExecutor();
        this.f = new Handler(Looper.getMainLooper());
        this.n = false;
        this.o = false;
        this.q = Collections.EMPTY_LIST;
        this.r = new HashMap();
        this.s = null;
        this.t = new dx1(this, 0);
        this.u = new dx1(this, 1);
        this.g = application;
        this.p = ry1.f(application);
    }

    @Override // defpackage.i72
    public final void b() {
        f();
        this.e.shutdownNow();
    }

    public final void d(String str, long j, float f, long j2, HashSet hashSet) {
        if (hashSet.add(str)) {
            HashMap hashMap = this.r;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(str, arrayList);
            }
            pw1 pw1Var = new pw1();
            pw1Var.f811a = j;
            pw1Var.b = f;
            arrayList.add(pw1Var);
            int size = arrayList.size();
            int i = 0;
            while (i < size && ((pw1) arrayList.get(i)).f811a < j2) {
                i++;
            }
            if (i <= 0 || i > arrayList.size()) {
                return;
            }
            arrayList.subList(0, i).clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x03d0, code lost:
    
        if (defpackage.d51.A(r9) >= 1) goto L164;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex1.e():void");
    }

    public final void f() {
        if (this.n) {
            this.n = false;
            this.f.removeCallbacks(this.t);
            SensorManager sensorManager = this.h;
            if (sensorManager != null) {
                cm1 cm1Var = em1.b;
                if (cm1Var != null) {
                    sensorManager.unregisterListener(cm1Var);
                    em1.b = null;
                }
                HashMap hashMap = em1.f237a;
                synchronized (hashMap) {
                    hashMap.clear();
                }
            }
            this.o = false;
            this.p.l();
        }
    }
}
