package defpackage;

import android.app.Application;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class j52 extends a4 {
    public final ExecutorService c;
    public final qy0 d;
    public final qy0 e;
    public final qy0 f;
    public final qy0 g;
    public volatile g52 h;
    public volatile g52 i;
    public final qy0 j;
    public final qy0 k;

    public j52(Application application) {
        super(application);
        this.c = Executors.newSingleThreadExecutor();
        this.d = new qy0();
        this.e = new qy0();
        this.f = new qy0();
        this.g = new qy0();
        g52 g52Var = g52.g;
        this.h = g52Var;
        this.i = g52Var;
        this.j = new qy0(g52Var);
        this.k = new qy0(g52Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r1 != null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011c, code lost:
    
        if (r2 != null) goto L178;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.vm0 d(android.content.Context r53, defpackage.g52 r54) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j52.d(android.content.Context, g52):vm0");
    }

    public static vm0 e(Context context, g52 g52Var) {
        Long l;
        h52 B = d10.B(g52Var);
        long j = B.b;
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
        if (usageStatsManager == null) {
            return new vm0(Collections.EMPTY_LIST);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        UsageEvents.Event event = new UsageEvents.Event();
        long j2 = B.f366a;
        while (j2 < j) {
            long min = Math.min(j, 21600000 + j2);
            UsageEvents queryEvents = usageStatsManager.queryEvents(j2, min);
            if (queryEvents != null) {
                while (queryEvents.hasNextEvent()) {
                    queryEvents.getNextEvent(event);
                    String packageName = event.getPackageName();
                    if (packageName != null) {
                        int eventType = event.getEventType();
                        long timeStamp = event.getTimeStamp();
                        if (eventType == 1) {
                            hashMap.put(packageName, Long.valueOf(timeStamp));
                        } else if (eventType == 2 && (l = (Long) hashMap.get(packageName)) != null && timeStamp >= l.longValue()) {
                            long longValue = timeStamp - l.longValue();
                            if (longValue > 0) {
                                Long l2 = (Long) hashMap2.get(packageName);
                                hashMap2.put(packageName, Long.valueOf((l2 == null ? 0L : l2.longValue()) + longValue));
                            }
                            hashMap.remove(packageName);
                        }
                    }
                }
            }
            j2 = min;
        }
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Long l3 = (Long) hashMap.get(str);
            if (l3 != null && j >= l3.longValue()) {
                long longValue2 = j - l3.longValue();
                if (longValue2 > 0) {
                    Long l4 = (Long) hashMap2.get(str);
                    hashMap2.put(str, Long.valueOf((l4 == null ? 0L : l4.longValue()) + longValue2));
                }
            }
        }
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        long j3 = 0;
        for (String str2 : hashMap2.keySet()) {
            Long l5 = (Long) hashMap2.get(str2);
            long longValue3 = l5 != null ? l5.longValue() : 0L;
            if (longValue3 >= 1000) {
                try {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str2, 0);
                    if (applicationInfo != null) {
                        String str3 = applicationInfo.packageName;
                        PackageManager packageManager2 = context.getPackageManager();
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.addCategory("android.intent.category.LAUNCHER");
                        intent.setPackage(str3);
                        if (packageManager2.resolveActivity(intent, 0) != null) {
                            int i2 = applicationInfo.flags;
                            if ((i2 & 1) == 0 || (i2 & rt0.s) != 0) {
                                c52 c52Var = new c52(packageManager.getApplicationIcon(applicationInfo), str2, packageManager.getApplicationLabel(applicationInfo).toString());
                                c52Var.d = longValue3;
                                arrayList2.add(c52Var);
                                j3 += longValue3;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        arrayList2.sort(new a9(24));
        vm0 vm0Var = new vm0(arrayList2);
        vm0Var.f1091a = j3;
        return vm0Var;
    }

    public final void f(g52 g52Var) {
        this.i = g52Var;
        this.k.k(g52Var);
        y42 y42Var = (y42) this.g.d();
        if (y42Var == null || y42Var.a(g52Var) == null) {
            return;
        }
        this.e.i((List) y42Var.a(g52Var).c);
    }

    public final void g(g52 g52Var) {
        this.h = g52Var;
        this.j.k(g52Var);
        y42 y42Var = (y42) this.f.d();
        if (y42Var == null || y42Var.a(g52Var) == null) {
            return;
        }
        this.d.i((List) y42Var.a(g52Var).c);
    }
}
