package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class no2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f694a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final ko2 e;
    public ComponentName f;
    public final /* synthetic */ qo2 g;

    public no2(qo2 qo2Var, ko2 ko2Var) {
        this.g = qo2Var;
        this.e = ko2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        if ((defpackage.bd2.a(r3).g.getPackageManager().getApplicationInfo(r2, 0).flags & 2097152) != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.uu a(java.lang.String r9, java.util.concurrent.Executor r10) {
        /*
            r8 = this;
            qo2 r9 = r8.g     // Catch: defpackage.tg2 -> La5
            android.content.Context r9 = r9.b     // Catch: defpackage.tg2 -> La5
            ko2 r0 = r8.e     // Catch: defpackage.tg2 -> La5
            android.content.Intent r9 = defpackage.xg2.a(r9, r0)     // Catch: defpackage.tg2 -> La5
            r0 = 3
            r8.b = r0
            android.os.StrictMode$VmPolicy r0 = android.os.StrictMode.getVmPolicy()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L27
            android.os.StrictMode$VmPolicy$Builder r1 = new android.os.StrictMode$VmPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$VmPolicy$Builder r1 = defpackage.ci2.a(r1)
            android.os.StrictMode$VmPolicy r1 = r1.build()
            android.os.StrictMode.setVmPolicy(r1)
        L27:
            qo2 r1 = r8.g     // Catch: java.lang.Throwable -> L8a
            ai1 r2 = r1.d     // Catch: java.lang.Throwable -> L8a
            android.content.Context r3 = r1.b     // Catch: java.lang.Throwable -> L8a
            ko2 r4 = r8.e     // Catch: java.lang.Throwable -> L8a
            r2.getClass()     // Catch: java.lang.Throwable -> L8a
            android.content.ComponentName r2 = r9.getComponent()     // Catch: java.lang.Throwable -> L8a
            r5 = 0
            if (r2 != 0) goto L3a
            goto L5a
        L3a:
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = "com.google.android.gms"
            r6.equals(r2)     // Catch: java.lang.Throwable -> L8a
            qz r6 = defpackage.bd2.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a java.lang.Throwable -> L8a
            android.content.Context r6 = r6.g     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a java.lang.Throwable -> L8a
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a java.lang.Throwable -> L8a
            r7 = 0
            android.content.pm.ApplicationInfo r2 = r6.getApplicationInfo(r2, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a java.lang.Throwable -> L8a
            int r2 = r2.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5a java.lang.Throwable -> L8a
            r6 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r6
            if (r2 == 0) goto L5a
            goto L72
        L5a:
            if (r10 != 0) goto L5d
            r10 = r5
        L5d:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L8a
            r6 = 29
            if (r2 < r6) goto L6b
            if (r10 == 0) goto L6b
            boolean r9 = defpackage.r0.q(r3, r9, r10, r8)     // Catch: java.lang.Throwable -> L8a
        L69:
            r7 = r9
            goto L72
        L6b:
            r10 = 4225(0x1081, float:5.92E-42)
            boolean r9 = r3.bindService(r9, r8, r10)     // Catch: java.lang.Throwable -> L8a
            goto L69
        L72:
            r8.c = r7     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L8c
            lg2 r8 = r1.c     // Catch: java.lang.Throwable -> L8a
            r9 = 1
            android.os.Message r8 = r8.obtainMessage(r9, r4)     // Catch: java.lang.Throwable -> L8a
            lg2 r9 = r1.c     // Catch: java.lang.Throwable -> L8a
            long r1 = r1.f     // Catch: java.lang.Throwable -> L8a
            r9.sendMessageDelayed(r8, r1)     // Catch: java.lang.Throwable -> L8a
            uu r8 = defpackage.uu.l     // Catch: java.lang.Throwable -> L8a
            android.os.StrictMode.setVmPolicy(r0)
            return r8
        L8a:
            r8 = move-exception
            goto La1
        L8c:
            r9 = 2
            r8.b = r9     // Catch: java.lang.Throwable -> L8a
            ai1 r9 = r1.d     // Catch: java.lang.Throwable -> L8a java.lang.IllegalArgumentException -> L96
            android.content.Context r10 = r1.b     // Catch: java.lang.Throwable -> L8a java.lang.IllegalArgumentException -> L96
            r9.l(r10, r8)     // Catch: java.lang.Throwable -> L8a java.lang.IllegalArgumentException -> L96
        L96:
            uu r8 = new uu     // Catch: java.lang.Throwable -> L8a
            r9 = 16
            r8.<init>(r9, r5, r5)     // Catch: java.lang.Throwable -> L8a
            android.os.StrictMode.setVmPolicy(r0)
            goto La8
        La1:
            android.os.StrictMode.setVmPolicy(r0)
            throw r8
        La5:
            r8 = move-exception
            uu r8 = r8.g
        La8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no2.a(java.lang.String, java.util.concurrent.Executor):uu");
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qo2 qo2Var = this.g;
        synchronized (qo2Var.f856a) {
            try {
                qo2Var.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.f694a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qo2 qo2Var = this.g;
        synchronized (qo2Var.f856a) {
            try {
                qo2Var.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.f694a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
