package defpackage;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class c90 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f112a = 0;

    static {
        ai1.k("EnqueueRunnable");
    }

    public static boolean a(pb2 pb2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        UUID uuid;
        WorkDatabase workDatabase;
        boolean z5;
        HashSet a2 = pb2.a(pb2Var);
        zb2 zb2Var = pb2Var.f782a;
        List list = pb2Var.b;
        String[] strArr = (String[]) a2.toArray(new String[0]);
        zb2Var.b.d.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = zb2Var.c;
        boolean z6 = strArr != null && strArr.length > 0;
        yb2 yb2Var = yb2.l;
        yb2 yb2Var2 = yb2.j;
        if (z6) {
            z2 = false;
            z3 = false;
            z = true;
            for (String str : strArr) {
                gc2 b = workDatabase2.C().b(str);
                if (b == null) {
                    ai1.h().getClass();
                    z4 = false;
                    break;
                }
                yb2 yb2Var3 = b.b;
                z &= yb2Var3 == yb2.i;
                if (yb2Var3 == yb2Var2) {
                    z3 = true;
                } else if (yb2Var3 == yb2Var) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        Throwable th = null;
        boolean isEmpty = TextUtils.isEmpty(null);
        if (!isEmpty && !z6) {
            workDatabase2.C().getClass();
            throw null;
        }
        Iterator it = list.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            x41 x41Var = (x41) it.next();
            Throwable th2 = th;
            gc2 gc2Var = x41Var.b;
            Iterator it2 = it;
            UUID uuid2 = x41Var.f1164a;
            if (!z6 || z) {
                uuid = uuid2;
                gc2Var.n = currentTimeMillis;
            } else {
                if (z3) {
                    gc2Var.b = yb2Var2;
                } else if (z2) {
                    gc2Var.b = yb2Var;
                } else {
                    uuid = uuid2;
                    gc2Var.b = yb2.k;
                }
                uuid = uuid2;
            }
            long j = currentTimeMillis;
            if (gc2Var.b == yb2.g) {
                z7 = true;
            }
            kc2 C = workDatabase2.C();
            zb2Var.e.getClass();
            t00 t00Var = gc2Var.e;
            boolean a3 = t00Var.a("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            zb2 zb2Var2 = zb2Var;
            boolean a4 = t00Var.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean a5 = t00Var.a("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!a3 && a4 && a5) {
                String str2 = gc2Var.c;
                workDatabase = workDatabase2;
                z5 = isEmpty;
                s00 s00Var = new s00(0);
                s00Var.b(t00Var.f963a);
                LinkedHashMap linkedHashMap = s00Var.f913a;
                linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str2);
                t00 t00Var2 = new t00(linkedHashMap);
                c3.P(t00Var2);
                gc2Var = gc2.b(gc2Var, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", t00Var2);
            } else {
                workDatabase = workDatabase2;
                z5 = isEmpty;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                lw lwVar = gc2Var.j;
                String str3 = gc2Var.c;
                if (!ym0.b(str3, ConstraintTrackingWorker.class.getName()) && (lwVar.e || lwVar.f)) {
                    s00 s00Var2 = new s00(0);
                    t00 t00Var3 = gc2Var.e;
                    t00Var3.getClass();
                    s00Var2.b(t00Var3.f963a);
                    LinkedHashMap linkedHashMap2 = s00Var2.f913a;
                    linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                    t00 t00Var4 = new t00(linkedHashMap2);
                    c3.P(t00Var4);
                    gc2Var = gc2.b(gc2Var, ConstraintTrackingWorker.class.getName(), t00Var4);
                }
            }
            C.getClass();
            tl2.E(C.f528a, false, true, new x20(C, 8, gc2Var));
            if (z6) {
                for (String str4 : strArr) {
                    String uuid3 = uuid.toString();
                    uuid3.getClass();
                    v20 v20Var = new v20(uuid3, str4);
                    a30 x = workDatabase.x();
                    x.getClass();
                    tl2.E(x.f6a, false, true, new x20(x, 0, v20Var));
                }
            }
            mc2 D = workDatabase.D();
            String uuid4 = uuid.toString();
            uuid4.getClass();
            LinkedHashSet linkedHashSet = x41Var.c;
            D.getClass();
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                tl2.E(D.f625a, false, true, new x20(D, 9, new lc2((String) it3.next(), uuid4)));
            }
            if (!z5) {
                workDatabase.A();
                uuid.toString().getClass();
                throw th2;
            }
            th = th2;
            it = it2;
            currentTimeMillis = j;
            workDatabase2 = workDatabase;
            zb2Var = zb2Var2;
            isEmpty = z5;
        }
        z4 = z7;
        pb2Var.e = true;
        return z4;
    }
}
