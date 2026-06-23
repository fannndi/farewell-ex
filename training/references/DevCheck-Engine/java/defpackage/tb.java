package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.google.android.material.chip.ChipGroup;
import flar2.devcheck.MainApp;
import flar2.devcheck.benchmarkSuite.backend.BenchmarkSubmission;
import flar2.devcheck.benchmarkSuite.backend.b;
import flar2.devcheck.bottomDrawer.BottomDrawer;
import flar2.devcheck.widgets.barDetailWidget.BarDetailWidgetConfigureActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class tb implements hb1, jq, wg, v41, b41, o41, nn, oz0, sn1, xi1, vt1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ tb(Object obj, int i, Object obj2) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    @Override // defpackage.nn
    public Object a(mn mnVar) {
        int i = this.g;
        r40 r40Var = r40.g;
        Object obj = this.i;
        final int i2 = 0;
        Executor executor = (Executor) this.h;
        switch (i) {
            case 8:
                vb2 vb2Var = (vb2) obj;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Runnable runnable = new Runnable() { // from class: cs0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        switch (i3) {
                            case 0:
                                atomicBoolean2.set(true);
                                break;
                            default:
                                atomicBoolean2.set(true);
                                break;
                        }
                    }
                };
                dg1 dg1Var = mnVar.c;
                if (dg1Var != null) {
                    dg1Var.a(runnable, r40Var);
                }
                executor.execute(new b9(12, atomicBoolean, mnVar, vb2Var));
                return "setForegroundAsync";
            default:
                af0 af0Var = (af0) obj;
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                final int i3 = 1;
                Runnable runnable2 = new Runnable() { // from class: cs0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        AtomicBoolean atomicBoolean22 = atomicBoolean2;
                        switch (i32) {
                            case 0:
                                atomicBoolean22.set(true);
                                break;
                            default:
                                atomicBoolean22.set(true);
                                break;
                        }
                    }
                };
                dg1 dg1Var2 = mnVar.c;
                if (dg1Var2 != null) {
                    dg1Var2.a(runnable2, r40Var);
                }
                executor.execute(new b9(19, atomicBoolean2, mnVar, af0Var));
                return e42.f219a;
        }
    }

    @Override // defpackage.xi1
    public Object apply(Object obj) {
        zi1 zi1Var = (zi1) this.h;
        nb nbVar = (nb) this.i;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        fb fbVar = zi1Var.j;
        ArrayList l = zi1Var.l(sQLiteDatabase, nbVar, fbVar.b);
        for (d91 d91Var : d91.values()) {
            if (d91Var != nbVar.c) {
                int size = fbVar.b - l.size();
                if (size <= 0) {
                    break;
                }
                fh a2 = nb.a();
                a2.P(nbVar.f670a);
                if (d91Var == null) {
                    jw0.f("Null priority");
                    return null;
                }
                a2.j = d91Var;
                a2.i = nbVar.b;
                l.addAll(zi1Var.l(sQLiteDatabase, a2.o(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < l.size(); i++) {
            sb.append(((kb) l.get(i)).f524a);
            if (i < l.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new yi1(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = l.listIterator();
        while (listIterator.hasNext()) {
            kb kbVar = (kb) listIterator.next();
            long j2 = kbVar.f524a;
            if (hashMap.containsKey(Long.valueOf(j2))) {
                yf c = kbVar.c.c();
                for (yi1 yi1Var : (Set) hashMap.get(Long.valueOf(j2))) {
                    c.a(yi1Var.f1233a, yi1Var.b);
                }
                listIterator.set(new kb(j2, kbVar.b, c.c()));
            }
        }
        return l;
    }

    @Override // defpackage.o41
    public void b(xo2 xo2Var) {
        wg1 wg1Var;
        Activity activity;
        WeakReference weakReference = (WeakReference) this.h;
        zf zfVar = (zf) this.i;
        if (!xo2Var.d() || (wg1Var = (wg1) xo2Var.c()) == null || (activity = (Activity) weakReference.get()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        try {
            zfVar.C(activity, wg1Var);
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.hb1
    public void c(qj qjVar, List list) {
        int i;
        PurchaseHistoryRecord purchaseHistoryRecord;
        wb wbVar = (wb) this.h;
        List list2 = (List) this.i;
        List<String> list3 = wbVar.k;
        if (qjVar.f847a != 0) {
            wbVar.l();
            i51.i("pbc", true);
            return;
        }
        list2.addAll(list);
        boolean isEmpty = list2.isEmpty();
        ib1 ib1Var = ib1.g;
        if (isEmpty) {
            if (i51.g("phrj")) {
                i51.a("phrj");
                i51.a("phrs");
            }
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                wbVar.n((String) it.next(), ib1Var);
            }
            return;
        }
        List list4 = wbVar.g;
        Iterator it2 = list2.iterator();
        do {
            i = 0;
            if (!it2.hasNext()) {
                if (i51.g("phrj")) {
                    i51.a("phrj");
                    i51.a("phrs");
                }
                if (list2.isEmpty()) {
                    wbVar.l();
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new qb(wbVar, i), 4986L);
                    return;
                }
            }
            purchaseHistoryRecord = (PurchaseHistoryRecord) it2.next();
        } while (!wbVar.p(purchaseHistoryRecord));
        HashSet hashSet = new HashSet();
        i51.l("phrj", purchaseHistoryRecord.f135a);
        i51.l("phrs", purchaseHistoryRecord.b);
        ArrayList a2 = purchaseHistoryRecord.a();
        int size = a2.size();
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = a2.get(i);
            i++;
            String str = (String) obj;
            if (list4.contains(str)) {
                wbVar.i(purchaseHistoryRecord);
                hashSet.add(str);
                break;
            }
        }
        for (String str2 : list3) {
            if (!hashSet.contains(str2)) {
                wbVar.n(str2, ib1Var);
            }
        }
    }

    public void d(qj qjVar) {
        wb wbVar = (wb) this.h;
        Purchase purchase = (Purchase) this.i;
        if (qjVar.f847a == 0) {
            ArrayList a2 = purchase.a();
            int size = a2.size();
            int i = 0;
            while (i < size) {
                Object obj = a2.get(i);
                i++;
                wbVar.n((String) obj, ib1.g);
            }
            wbVar.q.i(purchase.a());
        }
    }

    @Override // defpackage.vt1
    public Object e() {
        int i = this.g;
        Object obj = this.i;
        w42 w42Var = (w42) this.h;
        switch (i) {
            case 13:
                Iterable iterable = (Iterable) obj;
                zi1 zi1Var = w42Var.c;
                zi1Var.getClass();
                if (iterable.iterator().hasNext()) {
                    zi1Var.a().compileStatement("DELETE FROM events WHERE _id in ".concat(zi1.r(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    w42Var.i.m(((Integer) r2.getValue()).intValue(), at0.m, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.jq
    public void f(ChipGroup chipGroup, ArrayList arrayList) {
        View findViewById;
        int i = this.g;
        Object obj = this.i;
        Object obj2 = this.h;
        switch (i) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                int i2 = BarDetailWidgetConfigureActivity.T;
                MainApp.h.execute(new b9((BarDetailWidgetConfigureActivity) obj2, arrayList, (ChipGroup) obj, 2));
                break;
            default:
                p8 p8Var = (p8) obj;
                if (!((ht) obj2).G && !arrayList.isEmpty() && (findViewById = chipGroup.findViewById(((Integer) arrayList.get(0)).intValue())) != null) {
                    Object tag = findViewById.getTag();
                    if (tag instanceof String) {
                        String str = (String) tag;
                        qy0 qy0Var = ((ci) p8Var.h).d0.f;
                        if (!str.equals(qy0Var.d())) {
                            qy0Var.k(str);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.wg
    public void h(mi miVar) {
        miVar.p.add(new ni((String) this.h, (ps1) this.i));
        miVar.h = null;
        miVar.i = null;
        miVar.j = null;
        miVar.k = -1;
        miVar.l = 0;
    }

    @Override // defpackage.v41
    public void i(Object obj) {
        BenchmarkSubmission benchmarkSubmission = (BenchmarkSubmission) this.h;
        yh yhVar = (yh) this.i;
        String str = ((se2) obj).f932a;
        String c = new nh0().c(benchmarkSubmission);
        yh yhVar2 = new yh();
        yhVar2.f("https://api.devcheck.app/api/reportBenchmark/full");
        yhVar2.b("POST", xf1.c(c, b.f288a));
        String concat = "Bearer ".concat(str);
        ti0 ti0Var = (ti0) yhVar2.i;
        ti0Var.getClass();
        op0.A("Authorization");
        op0.B(concat, "Authorization");
        op0.f(ti0Var, "Authorization", concat);
        yf yfVar = new yf(yhVar2);
        a41 a41Var = b.b;
        a41Var.getClass();
        new dd1(a41Var, yfVar).e(new kp(benchmarkSubmission, 3, yhVar));
    }

    @Override // defpackage.sn1
    public void j(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        String str;
        int i = this.g;
        Object obj = this.i;
        Object obj2 = this.h;
        switch (i) {
            case 10:
                String str2 = (String) obj2;
                ComponentName componentName = (ComponentName) obj;
                Context createDeviceProtectedStorageContext = ju0.F().createDeviceProtectedStorageContext();
                File file = new File(createDeviceProtectedStorageContext.getCacheDir(), "main.jar");
                InputStream open = createDeviceProtectedStorageContext.getResources().getAssets().open("main.jar");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[rt0.B];
                        while (true) {
                            int read = open.read(bArr);
                            if (read <= 0) {
                                fileOutputStream.close();
                                open.close();
                                if (str2.equals("daemon")) {
                                    str = "--nice-name=" + createDeviceProtectedStorageContext.getPackageName() + ":root:daemon";
                                } else if (str2.equals("start")) {
                                    Locale locale = Locale.ROOT;
                                    str = "--nice-name=" + createDeviceProtectedStorageContext.getPackageName() + ":root:" + (Process.myUid() / 100000);
                                } else {
                                    str = "";
                                }
                                outputStream.write(String.format(Locale.ROOT, "(%s CLASSPATH=%s %s %s /system/bin %s com.topjohnwu.superuser.internal.RootServerMain '%s' %d %s >/dev/null 2>&1)&", "", file, "/system/bin/app_process".concat(Process.is64Bit() ? "64" : "32"), " -Xnoimage-dex2oat", str, componentName.flattenToString(), Integer.valueOf(Process.myUid()), str2).getBytes(StandardCharsets.UTF_8));
                                outputStream.write(10);
                                outputStream.flush();
                                return;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } finally {
                    }
                } finally {
                }
            default:
                outputStream.write(("cat " + ((ks1) obj2).g + " > " + ((File) obj) + " 2>/dev/null &").getBytes(StandardCharsets.UTF_8));
                outputStream.write(10);
                outputStream.flush();
                outputStream.write(xn1.f1189a);
                outputStream.flush();
                inputStream.read(d10.c);
                return;
        }
    }

    @Override // defpackage.oz0
    public void k(int i) {
        l01 l01Var = (l01) this.h;
        xz0 xz0Var = (xz0) this.i;
        List list = l01Var.d;
        try {
            l01Var.q.B0(((hn0) list.get(xz0Var.b())).d, ((hn0) list.get(xz0Var.b())).z);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.b41
    public gb2 v(View view, gb2 gb2Var) {
        BottomDrawer bottomDrawer = (BottomDrawer) this.h;
        Context context = (Context) this.i;
        int i = BottomDrawer.t;
        view.getClass();
        int i2 = context.getResources().getDisplayMetrics().heightPixels;
        bottomDrawer.q = i2;
        bottomDrawer.r = i2;
        bottomDrawer.s = i2 / 2;
        bottomDrawer.n = gb2Var.d() + bottomDrawer.m;
        return gb2Var.f329a.c();
    }
}
