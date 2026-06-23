package defpackage;

/* loaded from: classes.dex */
public final class fy1 implements mj1 {

    /* renamed from: a, reason: collision with root package name */
    public final ku1 f309a;
    public float b = Float.NaN;
    public long c = 0;

    public fy1(ku1 ku1Var) {
        this.f309a = ku1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.mj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r0 < r1) goto Lf
            r0 = 10
            float r0 = flar2.devcheck.temperature.ThermalHeadroomNative.getThermalHeadroom(r0)     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
            r0 = r2
        L10:
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 != 0) goto L1f
            r5.b = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.c = r0
            goto L36
        L1f:
            long r0 = r5.c
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L36
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r3 = r5.c
            long r0 = r0 - r3
            r3 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L36
            r5.b = r2
        L36:
            ey1 r0 = new ey1
            float r1 = r5.b
            r0.<init>(r1)
            ku1 r5 = r5.f309a
            qy0 r5 = r5.f550a
            r5.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy1.a():void");
    }
}
