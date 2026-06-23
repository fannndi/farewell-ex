package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class py1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f814a;
    public final my1 b;
    public ny1 d;
    public y41 e;
    public boolean f;
    public ArrayList h;
    public long i;
    public final Object c = new Object();
    public final AtomicBoolean g = new AtomicBoolean(false);

    public py1(Application application) {
        Context applicationContext = application.getApplicationContext();
        this.f814a = applicationContext;
        this.b = new my1(applicationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:11:0x0033, B:13:0x003b, B:15:0x0045, B:18:0x004a, B:21:0x0056, B:23:0x005e, B:25:0x006b, B:26:0x006f, B:28:0x0075, B:31:0x007e, B:34:0x0085, B:43:0x008b, B:44:0x008f, B:46:0x0095, B:49:0x009d, B:52:0x00a2, B:55:0x00a8, B:64:0x00b1, B:66:0x00b7, B:67:0x00bb, B:68:0x00bd), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:11:0x0033, B:13:0x003b, B:15:0x0045, B:18:0x004a, B:21:0x0056, B:23:0x005e, B:25:0x006b, B:26:0x006f, B:28:0x0075, B:31:0x007e, B:34:0x0085, B:43:0x008b, B:44:0x008f, B:46:0x0095, B:49:0x009d, B:52:0x00a2, B:55:0x00a8, B:64:0x00b1, B:66:0x00b7, B:67:0x00bb, B:68:0x00bd), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7 A[Catch: all -> 0x0047, TryCatch #1 {all -> 0x0047, blocks: (B:11:0x0033, B:13:0x003b, B:15:0x0045, B:18:0x004a, B:21:0x0056, B:23:0x005e, B:25:0x006b, B:26:0x006f, B:28:0x0075, B:31:0x007e, B:34:0x0085, B:43:0x008b, B:44:0x008f, B:46:0x0095, B:49:0x009d, B:52:0x00a2, B:55:0x00a8, B:64:0x00b1, B:66:0x00b7, B:67:0x00bb, B:68:0x00bd), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            monitor-enter(r0)
            boolean r1 = r9.f     // Catch: java.lang.Throwable -> La
            r2 = 0
            if (r1 == 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            goto L30
        La:
            r9 = move-exception
            goto Lc1
        Ld:
            r1 = 1
            r9.f = r1     // Catch: java.lang.Throwable -> La
            android.content.Context r1 = r9.f814a     // Catch: java.lang.Throwable -> L1b
            my1 r3 = r9.b     // Catch: java.lang.Throwable -> L1b
            ny1 r1 = defpackage.pr.E(r1, r3)     // Catch: java.lang.Throwable -> L1b
            r9.d = r1     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r9.d = r2     // Catch: java.lang.Throwable -> La
        L1d:
            android.content.Context r1 = r9.f814a     // Catch: java.lang.Throwable -> L2d
            jw0 r3 = new jw0     // Catch: java.lang.Throwable -> L2d
            r4 = 22
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            y41 r1 = defpackage.au1.b(r1, r3)     // Catch: java.lang.Throwable -> L2d
            r9.e = r1     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r9.e = r2     // Catch: java.lang.Throwable -> La
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
        L30:
            java.lang.Object r1 = r9.c
            monitor-enter(r1)
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList r0 = r9.h     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L4a
            long r5 = r9.i     // Catch: java.lang.Throwable -> L47
            long r5 = r3 - r5
            r7 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L4a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            return r0
        L47:
            r9 = move-exception
            goto Lbf
        L4a:
            ny1 r0 = r9.d     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L55
            my1 r5 = r9.b     // Catch: java.lang.Throwable -> L55
            java.util.List r0 = defpackage.pr.P(r0, r5)     // Catch: java.lang.Throwable -> L55
            goto L56
        L55:
            r0 = r2
        L56:
            y41 r5 = r9.e     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L5e
            java.util.List r2 = defpackage.au1.d(r5)     // Catch: java.lang.Throwable -> L5e
        L5e:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L47
            r5.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.Class<ly1> r6 = defpackage.ly1.class
            java.util.EnumSet r6 = java.util.EnumSet.noneOf(r6)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L89
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L47
        L6f:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L89
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L47
            oy1 r7 = (defpackage.oy1) r7     // Catch: java.lang.Throwable -> L47
            if (r7 != 0) goto L7e
            goto L6f
        L7e:
            r5.add(r7)     // Catch: java.lang.Throwable -> L47
            ly1 r7 = r7.d     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L6f
            r6.add(r7)     // Catch: java.lang.Throwable -> L47
            goto L6f
        L89:
            if (r2 == 0) goto Lb1
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L47
        L8f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L47
            oy1 r2 = (defpackage.oy1) r2     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L8f
            ly1 r7 = r2.d     // Catch: java.lang.Throwable -> L47
            if (r7 != 0) goto La2
            goto L8f
        La2:
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> L47
            if (r7 != 0) goto L8f
            r5.add(r2)     // Catch: java.lang.Throwable -> L47
            ly1 r2 = r2.d     // Catch: java.lang.Throwable -> L47
            r6.add(r2)     // Catch: java.lang.Throwable -> L47
            goto L8f
        Lb1:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto Lbb
            r9.h = r5     // Catch: java.lang.Throwable -> L47
            r9.i = r3     // Catch: java.lang.Throwable -> L47
        Lbb:
            java.util.ArrayList r9 = r9.h     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            return r9
        Lbf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            throw r9
        Lc1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py1.a():java.util.List");
    }

    public final void b() {
        synchronized (this.c) {
            try {
                ArrayList arrayList = this.h;
                boolean z = false;
                boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                ArrayList arrayList2 = this.h;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Object obj = arrayList2.get(i);
                        i++;
                        oy1 oy1Var = (oy1) obj;
                        if (oy1Var != null && oy1Var.d == ly1.h) {
                            z = true;
                            break;
                        }
                    }
                }
                i51.l("sysgraphs_thermal_fp", Build.FINGERPRINT);
                i51.h("sysgraphs_has_thermals", z2);
                i51.h("sysgraphs_has_gpu_die", z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
