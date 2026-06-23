package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Pair;
import android.widget.ImageView;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.benchmarkSuite.nativebridge.BenchSuiteBridge;
import flar2.devcheck.benchmarkSuite.sanity.SanityCheckActivity;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import flar2.devcheck.taskmgr2.TaskManager2Activity;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class n51 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ n51(ImageView imageView, Drawable drawable) {
        this.g = 1;
        this.h = imageView;
        this.i = drawable;
    }

    public /* synthetic */ n51(Object obj, int i, Object obj2) {
        this.g = i;
        this.i = obj;
        this.h = obj2;
    }

    public /* synthetic */ n51(Object obj, ArrayList arrayList, long j, int i) {
        this.g = i;
        this.i = obj;
        this.h = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        TaskManager2Activity taskManager2Activity;
        String str;
        int i = 0;
        switch (this.g) {
            case 0:
                p51 p51Var = (p51) this.i;
                try {
                    p51Var.g0().runOnUiThread(new n51((ImageView) this.h, uz1.x(p51Var.i0(), p51Var.u0.packageName)));
                    return;
                } catch (Exception unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((ImageView) this.h).setImageDrawable((Drawable) this.i);
                return;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((s61) this.i).c.i((List) this.h);
                return;
            case 3:
                ((ca1) this.i).e.k(new t91((ArrayList) this.h));
                return;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                ((ba1) this.i).d.k(new y91((ArrayList) this.h));
                return;
            case 5:
                ba1 ba1Var = (ba1) this.i;
                int[] iArr = (int[]) this.h;
                AtomicBoolean atomicBoolean = ba1Var.k;
                try {
                    ba1Var.a(iArr, ju0.M(iArr));
                    z = false;
                } catch (Throwable unused2) {
                    z = false;
                }
                atomicBoolean.set(z);
                return;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                ha1 ha1Var = (ha1) this.i;
                List list = (List) this.h;
                ha1Var.K0 = false;
                if (ha1Var.G()) {
                    ha1Var.C0(list);
                    return;
                }
                return;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                la1 la1Var = (la1) this.i;
                xb2 xb2Var = (xb2) this.h;
                synchronized (la1Var.k) {
                    try {
                        ArrayList arrayList = la1Var.j;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            ((da0) obj).d(xb2Var, false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 8:
                ((qf1) this.i).c.k((ic1) this.h);
                return;
            case rt0.o /* 9 */:
                ((sl) this.i).U((Typeface) this.h);
                return;
            case 10:
                ((h61) this.h).b((rg1) this.i);
                return;
            case 11:
                ((ServiceConnection) this.i).onNullBinding((ComponentName) ((Pair) ((rh1) this.h)).first);
                return;
            case 12:
                ((ServiceConnection) this.h).onServiceDisconnected((ComponentName) ((Pair) ((qh1) ((Pair) ((oh1) this.i)).first).f843a).first);
                return;
            case 13:
                qi1 qi1Var = (qi1) this.i;
                l30 l30Var = (l30) this.h;
                if (qi1Var.d.get()) {
                    qi1Var.b.g(l30Var);
                    return;
                }
                return;
            case 14:
                SanityCheckActivity sanityCheckActivity = (SanityCheckActivity) this.i;
                File file = (File) this.h;
                int i3 = SanityCheckActivity.j;
                c71 c71Var = new c71(1, sanityCheckActivity);
                je2.K(c71Var, "==== DevCheck benchmark suite sanity check ====");
                if (BenchSuiteBridge.a()) {
                    je2.K(c71Var, nTAZxGMqQtZZAQ.pymodXxUjzth + BenchSuiteBridge.d());
                    je2.K(c71Var, "now_ns: " + BenchSuiteBridge.c());
                    int[] b = hy.b();
                    int[] a2 = hy.a();
                    je2.K(c71Var, "single-core pin: " + Arrays.toString(b));
                    je2.K(c71Var, "multi-core pin: " + Arrays.toString(a2));
                    je2.K(c71Var, "");
                    je2.K(c71Var, "-- CPU --");
                    long nanoTime = System.nanoTime();
                    double t = BenchSuiteBridge.t(0.5d, b);
                    long nanoTime2 = System.nanoTime();
                    double t2 = BenchSuiteBridge.t(0.5d, a2);
                    long nanoTime3 = System.nanoTime();
                    Locale locale = Locale.ROOT;
                    je2.K(c71Var, String.format(locale, "%-10s  ST=%10.2f %-9s (%dms)   MT=%10.2f %-9s (%dms)", "SGEMM", Double.valueOf(t), "GFLOPS", Long.valueOf((nanoTime2 - nanoTime) / 1000000), Double.valueOf(t2), "GFLOPS", Long.valueOf((nanoTime3 - nanoTime2) / 1000000)));
                    long nanoTime4 = System.nanoTime();
                    double u = BenchSuiteBridge.u(0.5d, b);
                    long nanoTime5 = System.nanoTime();
                    je2.K(c71Var, String.format(locale, "%-10s  ST=%10.2f %-9s (%dms)   MT=%10.2f %-9s (%dms)", "SHA-256", Double.valueOf(u), "MiB/s", Long.valueOf((nanoTime5 - nanoTime4) / 1000000), Double.valueOf(BenchSuiteBridge.u(0.5d, a2)), "MiB/s", Long.valueOf((System.nanoTime() - nanoTime5) / 1000000)));
                    String str2 = MiGPiFgcCQCVh.tGTAoGScx;
                    long nanoTime6 = System.nanoTime();
                    double e = BenchSuiteBridge.e(0.5d, b);
                    long nanoTime7 = System.nanoTime();
                    je2.K(c71Var, String.format(locale, "%-10s  ST=%10.2f %-9s (%dms)   MT=%10.2f %-9s (%dms)", "AES-256-CTR", Double.valueOf(e), str2, Long.valueOf((nanoTime7 - nanoTime6) / 1000000), Double.valueOf(BenchSuiteBridge.e(0.5d, a2)), str2, Long.valueOf((System.nanoTime() - nanoTime7) / 1000000)));
                    String str3 = tEegR.dmm;
                    String str4 = rlfWzcx.BnI;
                    long nanoTime8 = System.nanoTime();
                    double v = BenchSuiteBridge.v(0.5d, b);
                    long nanoTime9 = System.nanoTime();
                    je2.K(c71Var, String.format(locale, "%-10s  ST=%10.2f %-9s (%dms)   MT=%10.2f %-9s (%dms)", str3, Double.valueOf(v), str4, Long.valueOf((nanoTime9 - nanoTime8) / 1000000), Double.valueOf(BenchSuiteBridge.v(0.5d, a2)), str4, Long.valueOf((System.nanoTime() - nanoTime9) / 1000000)));
                    long nanoTime10 = System.nanoTime();
                    double f = BenchSuiteBridge.f(0.5d, b);
                    long nanoTime11 = System.nanoTime();
                    je2.K(c71Var, String.format(locale, "%-10s  ST=%10.2f %-9s (%dms)   MT=%10.2f %-9s (%dms)", "Dijkstra", Double.valueOf(f), "solves/s", Long.valueOf((nanoTime11 - nanoTime10) / 1000000), Double.valueOf(BenchSuiteBridge.f(0.5d, a2)), "solves/s", Long.valueOf((System.nanoTime() - nanoTime11) / 1000000)));
                    je2.K(c71Var, "");
                    je2.K(c71Var, "-- Memory --");
                    long nanoTime12 = System.nanoTime();
                    double m = BenchSuiteBridge.m(0.5d, b);
                    long nanoTime13 = System.nanoTime();
                    je2.K(c71Var, String.format(locale, "%-10s  ST=%10.2f %-9s (%dms)   MT=%10.2f %-9s (%dms)", "Read", Double.valueOf(m), "MiB/s", Long.valueOf((nanoTime13 - nanoTime12) / 1000000), Double.valueOf(BenchSuiteBridge.m(0.5d, a2)), "MiB/s", Long.valueOf((System.nanoTime() - nanoTime13) / 1000000)));
                    long nanoTime14 = System.nanoTime();
                    double o = BenchSuiteBridge.o(0.5d, b);
                    long nanoTime15 = System.nanoTime();
                    je2.K(c71Var, String.format(locale, "%-10s  ST=%10.2f %-9s (%dms)   MT=%10.2f %-9s (%dms)", "Write", Double.valueOf(o), "MiB/s", Long.valueOf((nanoTime15 - nanoTime14) / 1000000), Double.valueOf(BenchSuiteBridge.o(0.5d, a2)), "MiB/s", Long.valueOf((System.nanoTime() - nanoTime15) / 1000000)));
                    long nanoTime16 = System.nanoTime();
                    double n = BenchSuiteBridge.n(0.5d, b);
                    long nanoTime17 = System.nanoTime();
                    je2.K(c71Var, String.format(locale, "%-10s  ST=%10.2f %-9s (%dms)   MT=%10.2f %-9s (%dms)", "Triad", Double.valueOf(n), "MiB/s", Long.valueOf((nanoTime17 - nanoTime16) / 1000000), Double.valueOf(BenchSuiteBridge.n(0.5d, a2)), "MiB/s", Long.valueOf((System.nanoTime() - nanoTime17) / 1000000)));
                    long nanoTime18 = System.nanoTime();
                    double l = BenchSuiteBridge.l(0.5d, b);
                    long nanoTime19 = System.nanoTime();
                    je2.K(c71Var, String.format(locale, "%-10s  ST=%10.2f %-9s (%dms)   MT=%10.2f %-9s (%dms)", "Latency", Double.valueOf(l), "ns", Long.valueOf((nanoTime19 - nanoTime18) / 1000000), Double.valueOf(BenchSuiteBridge.l(0.5d, a2)), "ns", Long.valueOf((System.nanoTime() - nanoTime19) / 1000000)));
                    je2.K(c71Var, "");
                    je2.K(c71Var, "-- Disk --");
                    File file2 = new File(file, "benchmarksuite.dat");
                    String absolutePath = file2.getAbsolutePath();
                    je2.K(c71Var, "path: " + absolutePath);
                    je2.K(c71Var, String.format(locale, "%-10s  %10.2f %-9s (%dms)", bPnJ.Ezj, Double.valueOf(BenchSuiteBridge.s(0.5d, absolutePath)), "MiB/s", Long.valueOf((System.nanoTime() - System.nanoTime()) / 1000000)));
                    je2.K(c71Var, String.format(locale, "%-10s  %10.2f %-9s (%dms)", "SeqRead", Double.valueOf(BenchSuiteBridge.r(0.5d, absolutePath)), "MiB/s", Long.valueOf((System.nanoTime() - System.nanoTime()) / 1000000)));
                    je2.K(c71Var, String.format(locale, "%-10s  %10.2f %-9s (%dms)", "RandRead", Double.valueOf(BenchSuiteBridge.p(0.5d, absolutePath)), "MiB/s", Long.valueOf((System.nanoTime() - System.nanoTime()) / 1000000)));
                    je2.K(c71Var, String.format(locale, "%-10s  %10.2f %-9s (%dms)", "RandWrite", Double.valueOf(BenchSuiteBridge.q(0.5d, absolutePath)), "MiB/s", Long.valueOf((System.nanoTime() - System.nanoTime()) / 1000000)));
                    if (file2.exists()) {
                        boolean delete = file2.delete();
                        StringBuilder sb = new StringBuilder("cleanup: ");
                        sb.append(delete ? "deleted " : "failed to delete ");
                        sb.append(absolutePath);
                        je2.K(c71Var, sb.toString());
                    }
                    je2.K(c71Var, "");
                    je2.K(c71Var, "-- GPU --");
                    je2.K(c71Var, String.format(locale, "%-12s  %10.2f %-9s (%dms)", "FP32 Matmul", Double.valueOf(BenchSuiteBridge.h(0.5d)), "GFLOPS", Long.valueOf((System.nanoTime() - System.nanoTime()) / 1000000)));
                    je2.K(c71Var, String.format(locale, "%-12s  %10.2f %-9s (%dms)", "FP16 Matmul", Double.valueOf(BenchSuiteBridge.g(0.5d)), "GFLOPS", Long.valueOf((System.nanoTime() - System.nanoTime()) / 1000000)));
                    je2.K(c71Var, String.format(locale, "%-12s  %10.2f %-9s (%dms)", "Mem BW", Double.valueOf(BenchSuiteBridge.j(0.5d)), "MiB/s", Long.valueOf((System.nanoTime() - System.nanoTime()) / 1000000)));
                    je2.K(c71Var, String.format(locale, "%-12s  %10.2f %-9s (%dms)", "Image Blur", Double.valueOf(BenchSuiteBridge.i(0.5d)), "Mpix/s", Long.valueOf((System.nanoTime() - System.nanoTime()) / 1000000)));
                    je2.K(c71Var, String.format(locale, "%-12s  %10.2f %-9s (%dms)", "Reduction", Double.valueOf(BenchSuiteBridge.k(0.5d)), "MiB/s", Long.valueOf((System.nanoTime() - System.nanoTime()) / 1000000)));
                    je2.K(c71Var, "");
                    je2.K(c71Var, "==== done ====");
                } else {
                    je2.K(c71Var, "FAIL: libbenchmarksuite did not load");
                }
                sanityCheckActivity.i.post(new r60(24, sanityCheckActivity));
                return;
            case 15:
                ((SanityCheckActivity) this.i).g.append(((String) this.h).concat("\n"));
                return;
            case 16:
                po1 po1Var = (po1) this.i;
                IBinder iBinder = (IBinder) this.h;
                Iterator it = po1Var.g.iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(po1Var.h, iBinder);
                }
                return;
            case rt0.p /* 17 */:
                TaskManager2Activity taskManager2Activity2 = (TaskManager2Activity) this.i;
                List<pm1> list2 = (List) this.h;
                if (taskManager2Activity2.M == 2) {
                    wm1 wm1Var = taskManager2Activity2.O;
                    ArrayList arrayList2 = wm1Var.f;
                    arrayList2.clear();
                    if (!list2.isEmpty()) {
                        HashMap hashMap = new HashMap();
                        for (pm1 pm1Var : list2) {
                            if (pm1Var != null && (str = pm1Var.i) != null) {
                                ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                    hashMap.put(pm1Var.i, arrayList3);
                                }
                                arrayList3.add(pm1Var);
                            }
                        }
                        Iterator it2 = hashMap.keySet().iterator();
                        while (it2.hasNext()) {
                            String str5 = (String) it2.next();
                            ArrayList arrayList4 = (ArrayList) hashMap.get(str5);
                            if (arrayList4 != null) {
                                arrayList4.sort(new a9(18));
                                int size2 = arrayList4.size();
                                int i4 = i;
                                int i5 = i4;
                                while (i4 < size2) {
                                    Object obj2 = arrayList4.get(i4);
                                    i4++;
                                    if (((pm1) obj2).l) {
                                        i5++;
                                    }
                                }
                                int i6 = arrayList4.isEmpty() ? -1 : ((pm1) arrayList4.get(i)).g;
                                HashSet hashSet = new HashSet();
                                int size3 = arrayList4.size();
                                long j = Long.MAX_VALUE;
                                int i7 = i;
                                int i8 = i7;
                                while (i8 < size3) {
                                    Object obj3 = arrayList4.get(i8);
                                    i8++;
                                    pm1 pm1Var2 = (pm1) obj3;
                                    int i9 = pm1Var2.h;
                                    if (i9 > 0 && hashSet.add(Integer.valueOf(i9))) {
                                        i7 += pm1Var2.s;
                                    }
                                    Iterator it3 = it2;
                                    TaskManager2Activity taskManager2Activity3 = taskManager2Activity2;
                                    long j2 = pm1Var2.o;
                                    if (j2 > 0 && j2 < j) {
                                        j = j2;
                                    }
                                    taskManager2Activity2 = taskManager2Activity3;
                                    it2 = it3;
                                }
                                Iterator it4 = it2;
                                TaskManager2Activity taskManager2Activity4 = taskManager2Activity2;
                                arrayList2.add(new um1(str5, i6, arrayList4.size(), i5, i7, j == Long.MAX_VALUE ? 0L : j, arrayList4));
                                taskManager2Activity2 = taskManager2Activity4;
                                it2 = it4;
                                i = 0;
                            }
                        }
                        taskManager2Activity = taskManager2Activity2;
                        Collections.sort(wm1Var.f, new iy(2, wm1Var));
                        wm1Var.f();
                        taskManager2Activity.E();
                        return;
                    }
                    wm1Var.f();
                }
                taskManager2Activity = taskManager2Activity2;
                taskManager2Activity.E();
                return;
            case 18:
                try {
                    ((PowerManager) this.i).removeThermalStatusListener(fi0.j(this.h));
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 19:
                ((kp) ((gr) this.i).i).p((vq1) this.h, 3);
                return;
            case 20:
                zf zfVar = (zf) this.i;
                String a3 = ((bi) this.h).a();
                n02 n02Var = (n02) zfVar.i;
                if (a3.equals(n02Var.j.a())) {
                    n02Var.h = false;
                    n02Var.e();
                    return;
                }
                return;
            default:
                Runnable runnable = (Runnable) this.i;
                lm1 lm1Var = (lm1) this.h;
                try {
                    runnable.run();
                    return;
                } finally {
                    lm1Var.a();
                }
        }
    }
}
