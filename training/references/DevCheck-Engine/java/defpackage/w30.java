package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class w30 implements jn {
    public final /* synthetic */ int g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ w30(Runnable runnable, int i) {
        this.g = i;
        this.h = runnable;
    }

    @Override // defpackage.jn
    public final void h(IOException iOException) {
        switch (this.g) {
            case 0:
                i51.h("needs_upload_check", true);
                break;
            default:
                i51.h("needs_upload_check", true);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.jn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.lg1 r13) {
        /*
            r12 = this;
            int r0 = r12.g
            r1 = 429(0x1ad, float:6.01E-43)
            r2 = 403(0x193, float:5.65E-43)
            r3 = 300(0x12c, float:4.2E-43)
            java.lang.String r4 = "needs_upload_check"
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 200(0xc8, float:2.8E-43)
            java.lang.String r9 = "needs_upload"
            switch(r0) {
                case 0: goto L78;
                default: goto L14;
            }
        L14:
            int r0 = r13.j     // Catch: java.lang.Throwable -> L1f
            ng1 r10 = r13.m     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            if (r10 == 0) goto L21
            java.lang.String r10 = r10.l()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            goto L22
        L1f:
            r12 = move-exception
            goto L6f
        L21:
            r10 = r7
        L22:
            r13.close()
            if (r0 < r8) goto L36
            if (r0 >= r3) goto L36
            boolean r13 = defpackage.x30.a(r10)
            if (r13 == 0) goto L36
            android.content.Context r13 = defpackage.d10.n()     // Catch: java.lang.Throwable -> L36
            defpackage.ym0.x(r13)     // Catch: java.lang.Throwable -> L36
        L36:
            defpackage.x30.b = r7
            r10 = 0
            defpackage.x30.c = r10
            if (r0 == r8) goto L61
            r13 = 201(0xc9, float:2.82E-43)
            if (r0 == r13) goto L61
            if (r0 == r2) goto L5a
            if (r0 == r1) goto L56
            r12 = 409(0x199, float:5.73E-43)
            if (r0 == r12) goto L52
            r12 = 410(0x19a, float:5.75E-43)
            if (r0 == r12) goto L52
            defpackage.i51.h(r4, r6)
            goto L6e
        L52:
            defpackage.i51.h(r4, r6)
            goto L6e
        L56:
            defpackage.i51.h(r4, r6)
            goto L6e
        L5a:
            defpackage.i51.h(r9, r5)
            defpackage.i51.h(r4, r5)
            goto L6e
        L61:
            defpackage.i51.h(r9, r5)
            defpackage.i51.h(r4, r5)
            java.lang.Runnable r12 = r12.h
            if (r12 == 0) goto L6e
            r12.run()
        L6e:
            return
        L6f:
            r13.close()     // Catch: java.lang.Throwable -> L73
            goto L77
        L73:
            r13 = move-exception
            r12.addSuppressed(r13)
        L77:
            throw r12
        L78:
            int r0 = r13.j     // Catch: java.lang.Throwable -> L83
            ng1 r10 = r13.m     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            if (r10 == 0) goto L85
            java.lang.String r7 = r10.l()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L85
            goto L85
        L83:
            r12 = move-exception
            goto Lc7
        L85:
            r13.close()
            if (r0 < r8) goto L99
            if (r0 >= r3) goto L99
            boolean r13 = defpackage.x30.a(r7)
            if (r13 == 0) goto L99
            android.content.Context r13 = defpackage.d10.n()     // Catch: java.lang.Throwable -> L99
            defpackage.ym0.x(r13)     // Catch: java.lang.Throwable -> L99
        L99:
            if (r0 == r8) goto Lb9
            r12 = 401(0x191, float:5.62E-43)
            if (r0 == r12) goto Lb2
            if (r0 == r2) goto Lab
            if (r0 == r1) goto La7
            defpackage.i51.h(r4, r6)
            goto Lc6
        La7:
            defpackage.i51.h(r4, r6)
            goto Lc6
        Lab:
            defpackage.i51.h(r9, r5)
            defpackage.i51.h(r4, r5)
            goto Lc6
        Lb2:
            defpackage.i51.h(r9, r5)
            defpackage.i51.h(r4, r5)
            goto Lc6
        Lb9:
            defpackage.i51.h(r9, r5)
            defpackage.i51.h(r4, r5)
            java.lang.Runnable r12 = r12.h
            if (r12 == 0) goto Lc6
            r12.run()
        Lc6:
            return
        Lc7:
            r13.close()     // Catch: java.lang.Throwable -> Lcb
            goto Lcf
        Lcb:
            r13 = move-exception
            r12.addSuppressed(r13)
        Lcf:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w30.m(lg1):void");
    }
}
