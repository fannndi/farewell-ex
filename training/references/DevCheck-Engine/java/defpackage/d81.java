package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class d81 implements u02, wc1 {

    /* renamed from: a, reason: collision with root package name */
    public final zu f181a;
    public final boolean b;
    public final j9 c;
    public final AtomicBoolean d;

    public d81(zu zuVar, boolean z) {
        zuVar.getClass();
        this.f181a = zuVar;
        this.b = z;
        this.c = new j9();
        this.d = new AtomicBoolean(false);
    }

    @Override // defpackage.u02
    public final Object a(t02 t02Var, pf0 pf0Var, nt1 nt1Var) {
        if (this.d.get()) {
            kk1.S(21, "Connection is recycled");
            throw null;
        }
        qx qxVar = nt1Var.h;
        qxVar.getClass();
        pu puVar = (pu) qxVar.r(pu.h);
        if (puVar != null && puVar.g == this) {
            return g(t02Var, pf0Var, nt1Var);
        }
        kk1.S(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.wc1
    public final ti1 b() {
        return this.f181a;
    }

    @Override // defpackage.u02
    public final Object c(nt1 nt1Var) {
        if (this.d.get()) {
            kk1.S(21, "Connection is recycled");
            throw null;
        }
        qx qxVar = nt1Var.h;
        qxVar.getClass();
        pu puVar = (pu) qxVar.r(pu.h);
        if (puVar != null && puVar.g == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        kk1.S(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // defpackage.v71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, defpackage.lf0 r7, defpackage.ex r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.c81
            if (r0 == 0) goto L13
            r0 = r8
            c81 r0 = (defpackage.c81) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            c81 r0 = new c81
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.n
            int r1 = r0.p
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 != r2) goto L30
            zu r5 = r0.m
            lf0 r7 = r0.l
            java.lang.String r6 = r0.k
            d81 r0 = r0.j
            defpackage.om0.O(r8)
            r8 = r5
            r5 = r0
            goto L6d
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r5)
            return r3
        L36:
            defpackage.om0.O(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.d
            boolean r8 = r8.get()
            r1 = 21
            if (r8 != 0) goto L96
            qx r8 = r0.h
            r8.getClass()
            j70 r4 = defpackage.pu.h
            ox r8 = r8.r(r4)
            pu r8 = (defpackage.pu) r8
            if (r8 == 0) goto L90
            d81 r8 = r8.g
            if (r8 != r5) goto L90
            r0.j = r5
            r0.k = r6
            r0.l = r7
            zu r8 = r5.f181a
            r0.m = r8
            r0.p = r2
            ry0 r1 = r8.h
            java.lang.Object r0 = r1.e(r0)
            zx r1 = defpackage.zx.g
            if (r0 != r1) goto L6d
            return r1
        L6d:
            w71 r0 = new w71     // Catch: java.lang.Throwable -> L83
            zu r1 = r5.f181a     // Catch: java.lang.Throwable -> L83
            aj1 r6 = r1.C(r6)     // Catch: java.lang.Throwable -> L83
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r5 = r7.j(r0)     // Catch: java.lang.Throwable -> L85
            defpackage.rt0.e(r0, r3)     // Catch: java.lang.Throwable -> L83
            r8.a(r3)
            return r5
        L83:
            r5 = move-exception
            goto L8c
        L85:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L87
        L87:
            r6 = move-exception
            defpackage.rt0.e(r0, r5)     // Catch: java.lang.Throwable -> L83
            throw r6     // Catch: java.lang.Throwable -> L83
        L8c:
            r8.a(r3)
            throw r5
        L90:
            java.lang.String r5 = "Attempted to use connection on a different coroutine"
            defpackage.kk1.S(r1, r5)
            throw r3
        L96:
            java.lang.String r5 = "Connection is recycled"
            defpackage.kk1.S(r1, r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d81.d(java.lang.String, lf0, ex):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004e, B:13:0x005a, B:18:0x0065, B:19:0x0093, B:23:0x006d, B:24:0x0072, B:25:0x0073, B:26:0x0079, B:27:0x007f), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004e, B:13:0x005a, B:18:0x0065, B:19:0x0093, B:23:0x006d, B:24:0x0072, B:25:0x0073, B:26:0x0079, B:27:0x007f), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.t02 r7, defpackage.ex r8) {
        /*
            r6 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r8 instanceof defpackage.z71
            if (r1 == 0) goto L15
            r1 = r8
            z71 r1 = (defpackage.z71) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.o = r2
            goto L1a
        L15:
            z71 r1 = new z71
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.m
            int r2 = r1.o
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            zu r6 = r1.l
            t02 r7 = r1.k
            d81 r1 = r1.j
            defpackage.om0.O(r8)
            r8 = r6
            r6 = r1
            goto L4e
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r6)
            return r4
        L36:
            defpackage.om0.O(r8)
            r1.j = r6
            r1.k = r7
            zu r8 = r6.f181a
            r1.l = r8
            r1.o = r3
            ry0 r2 = r8.h
            java.lang.Object r1 = r2.e(r1)
            zx r2 = defpackage.zx.g
            if (r1 != r2) goto L4e
            return r2
        L4e:
            j9 r1 = r6.c     // Catch: java.lang.Throwable -> L6b
            zu r6 = r6.f181a     // Catch: java.lang.Throwable -> L6b
            int r2 = r1.i     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L7f
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L6b
            if (r7 == 0) goto L79
            if (r7 == r3) goto L73
            r0 = 2
            if (r7 != r0) goto L6d
            java.lang.String r7 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.kk1.s(r6, r7)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L6b:
            r6 = move-exception
            goto La1
        L6d:
            pt r6 = new pt     // Catch: java.lang.Throwable -> L6b
            r6.<init>()     // Catch: java.lang.Throwable -> L6b
            throw r6     // Catch: java.lang.Throwable -> L6b
        L73:
            java.lang.String r7 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.kk1.s(r6, r7)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L79:
            java.lang.String r7 = "BEGIN DEFERRED TRANSACTION"
            defpackage.kk1.s(r6, r7)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L7f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            r7.append(r2)     // Catch: java.lang.Throwable -> L6b
            r0 = 39
            r7.append(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L6b
            defpackage.kk1.s(r6, r7)     // Catch: java.lang.Throwable -> L6b
        L93:
            y71 r6 = new y71     // Catch: java.lang.Throwable -> L6b
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L6b
            r1.addLast(r6)     // Catch: java.lang.Throwable -> L6b
            e42 r6 = defpackage.e42.f219a     // Catch: java.lang.Throwable -> L6b
            r8.a(r4)
            return r6
        La1:
            r8.a(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d81.e(t02, ex):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x0050, B:13:0x005a, B:15:0x0064, B:17:0x006d, B:18:0x00aa, B:22:0x0075, B:23:0x008a, B:25:0x0090, B:26:0x0096, B:27:0x00b0, B:28:0x00b7), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[Catch: all -> 0x0073, TRY_ENTER, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x0050, B:13:0x005a, B:15:0x0064, B:17:0x006d, B:18:0x00aa, B:22:0x0075, B:23:0x008a, B:25:0x0090, B:26:0x0096, B:27:0x00b0, B:28:0x00b7), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r7, defpackage.ex r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r8 instanceof defpackage.a81
            if (r2 == 0) goto L17
            r2 = r8
            a81 r2 = (defpackage.a81) r2
            int r3 = r2.o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.o = r3
            goto L1c
        L17:
            a81 r2 = new a81
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r2.m
            int r3 = r2.o
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L32
            boolean r7 = r2.l
            zu r6 = r2.k
            d81 r2 = r2.j
            defpackage.om0.O(r8)
            r8 = r6
            r6 = r2
            goto L50
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r6)
            return r5
        L38:
            defpackage.om0.O(r8)
            r2.j = r6
            zu r8 = r6.f181a
            r2.k = r8
            r2.l = r7
            r2.o = r4
            ry0 r3 = r8.h
            java.lang.Object r2 = r3.e(r2)
            zx r3 = defpackage.zx.g
            if (r2 != r3) goto L50
            return r3
        L50:
            j9 r2 = r6.c     // Catch: java.lang.Throwable -> L73
            zu r6 = r6.f181a     // Catch: java.lang.Throwable -> L73
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r3 != 0) goto Lb0
            java.lang.Object r3 = defpackage.es.W(r2)     // Catch: java.lang.Throwable -> L73
            y71 r3 = (defpackage.y71) r3     // Catch: java.lang.Throwable -> L73
            r4 = 39
            if (r7 == 0) goto L8a
            r3.getClass()     // Catch: java.lang.Throwable -> L73
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L75
            java.lang.String r7 = "END TRANSACTION"
            defpackage.kk1.s(r6, r7)     // Catch: java.lang.Throwable -> L73
            goto Laa
        L73:
            r6 = move-exception
            goto Lb8
        L75:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L73
            int r0 = r3.f1217a     // Catch: java.lang.Throwable -> L73
            r7.append(r0)     // Catch: java.lang.Throwable -> L73
            r7.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L73
            defpackage.kk1.s(r6, r7)     // Catch: java.lang.Throwable -> L73
            goto Laa
        L8a:
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L96
            java.lang.String r7 = "ROLLBACK TRANSACTION"
            defpackage.kk1.s(r6, r7)     // Catch: java.lang.Throwable -> L73
            goto Laa
        L96:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L73
            int r0 = r3.f1217a     // Catch: java.lang.Throwable -> L73
            r7.append(r0)     // Catch: java.lang.Throwable -> L73
            r7.append(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L73
            defpackage.kk1.s(r6, r7)     // Catch: java.lang.Throwable -> L73
        Laa:
            e42 r6 = defpackage.e42.f219a     // Catch: java.lang.Throwable -> L73
            r8.a(r5)
            return r6
        Lb0:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            java.lang.String r7 = "Not in a transaction"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L73
            throw r6     // Catch: java.lang.Throwable -> L73
        Lb8:
            r8.a(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d81.f(boolean, ex):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x007d, code lost:
    
        if (e(r11, r0) == r8) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.t02 r11, defpackage.pf0 r12, defpackage.ex r13) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d81.g(t02, pf0, ex):java.lang.Object");
    }
}
