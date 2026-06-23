package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class l21 implements mj1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f567a;
    public final ku1 b;
    public final ConnectivityManager c;
    public final WifiManager d;
    public final TelephonyManager e;
    public final j21 f;
    public long g = -1;
    public long h = -1;
    public volatile int i = Integer.MIN_VALUE;
    public int j = -2;
    public String k;

    public l21(Application application, ku1 ku1Var) {
        Context applicationContext = application.getApplicationContext();
        this.f567a = applicationContext;
        this.b = ku1Var;
        this.c = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.d = (WifiManager) applicationContext.getSystemService("wifi");
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
        this.e = telephonyManager;
        j21 j21Var = new j21(0, this);
        this.f = j21Var;
        if (telephonyManager != null) {
            try {
                telephonyManager.listen(j21Var, rt0.t);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:73|(3:77|78|(12:80|81|(6:85|86|(4:95|96|97|98)|94|82|83)|120|(1:102)|(1:117)(1:105)|106|107|(1:109)|115|111|112))|125|(0)|(0)|117|106|107|(0)|115|111|112) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0182, code lost:
    
        if (r3.isEmpty() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0190, code lost:
    
        r14 = r1;
        r13 = r2;
        r17 = null;
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0071, code lost:
    
        if (r4.hasTransport(3) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0073, code lost:
    
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0075, code lost:
    
        r8 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x008e, code lost:
    
        if (r1 != 9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        if ("<unknown ssid>".equalsIgnoreCase(r7) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017e A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #0 {all -> 0x0190, blocks: (B:107:0x0176, B:109:0x017e), top: B:106:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    @Override // defpackage.mj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l21.a():void");
    }

    @Override // defpackage.mj1
    public final void close() {
        try {
            TelephonyManager telephonyManager = this.e;
            if (telephonyManager != null) {
                telephonyManager.listen(this.f, 0);
            }
        } catch (Throwable unused) {
        }
    }
}
