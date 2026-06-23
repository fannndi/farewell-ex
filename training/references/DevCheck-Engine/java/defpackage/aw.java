package defpackage;

/* loaded from: classes.dex */
public final class aw extends nt1 implements pf0 {
    public bs0 k;
    public qq1 l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ is0 o;
    public final /* synthetic */ ti0 p;
    public final /* synthetic */ gc2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(is0 is0Var, ti0 ti0Var, gc2 gc2Var, dx dxVar) {
        super(2, dxVar);
        this.o = is0Var;
        this.p = ti0Var;
        this.q = gc2Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        return ((aw) l((dx) obj2, (yx) obj)).o(e42.f219a);
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        aw awVar = new aw(this.o, this.p, this.q, dxVar);
        awVar.n = obj;
        return awVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:44:0x0062, B:45:0x0072, B:15:0x0076, B:18:0x008e, B:21:0x0096, B:22:0x009f, B:24:0x00a0, B:7:0x0014, B:8:0x0057, B:30:0x0044), top: B:2:0x0008, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.m
            r1 = 0
            r2 = -256(0xffffffffffffff00, float:NaN)
            is0 r3 = r12.o
            r4 = 1
            if (r0 == 0) goto L24
            if (r0 != r4) goto L1e
            qq1 r5 = r12.l
            bs0 r6 = r12.k
            java.lang.Object r12 = r12.n
            java.util.concurrent.atomic.AtomicInteger r12 = (java.util.concurrent.atomic.AtomicInteger) r12
            defpackage.om0.O(r13)     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L1b
            goto L57
        L18:
            r0 = move-exception
            r12 = r0
            goto L62
        L1b:
            r0 = move-exception
            r13 = r0
            goto L76
        L1e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r12)
            return r1
        L24:
            defpackage.om0.O(r13)
            java.lang.Object r13 = r12.n
            yx r13 = (defpackage.yx) r13
            java.util.concurrent.atomic.AtomicInteger r8 = new java.util.concurrent.atomic.AtomicInteger
            r8.<init>(r2)
            pn r9 = r3.b()
            zv r5 = new zv
            r10 = 0
            r11 = 0
            ti0 r6 = r12.p
            gc2 r7 = r12.q
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 3
            qq1 r5 = defpackage.ju0.X(r13, r1, r1, r5, r0)
            r12.n = r8     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L5d
            r12.k = r9     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L5d
            r12.l = r5     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L5d
            r12.m = r4     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L5d
            java.lang.Object r13 = defpackage.kk1.f(r9, r12)     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L5d
            zx r12 = defpackage.zx.g
            if (r13 != r12) goto L55
            return r12
        L55:
            r12 = r8
            r6 = r9
        L57:
            hs0 r13 = (defpackage.hs0) r13     // Catch: java.lang.Throwable -> L18 java.util.concurrent.CancellationException -> L1b
            r5.e(r1)
            return r13
        L5d:
            r0 = move-exception
            r13 = r0
            r12 = r8
            r6 = r9
            goto L76
        L62:
            int r13 = defpackage.hw.f403a     // Catch: java.lang.Throwable -> L73
            ai1 r13 = defpackage.ai1.h()     // Catch: java.lang.Throwable -> L73
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Throwable -> L73
            r0.toString()     // Catch: java.lang.Throwable -> L73
            r13.getClass()     // Catch: java.lang.Throwable -> L73
            throw r12     // Catch: java.lang.Throwable -> L73
        L73:
            r0 = move-exception
            r12 = r0
            goto La1
        L76:
            int r0 = defpackage.hw.f403a     // Catch: java.lang.Throwable -> L73
            ai1 r0 = defpackage.ai1.h()     // Catch: java.lang.Throwable -> L73
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L73
            r3.toString()     // Catch: java.lang.Throwable -> L73
            r0.getClass()     // Catch: java.lang.Throwable -> L73
            int r0 = r12.get()     // Catch: java.lang.Throwable -> L73
            if (r0 == r2) goto L8d
            goto L8e
        L8d:
            r4 = 0
        L8e:
            boolean r0 = r6.isCancelled()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto La0
            if (r4 == 0) goto La0
            wv r13 = new wv     // Catch: java.lang.Throwable -> L73
            int r12 = r12.get()     // Catch: java.lang.Throwable -> L73
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L73
            throw r13     // Catch: java.lang.Throwable -> L73
        La0:
            throw r13     // Catch: java.lang.Throwable -> L73
        La1:
            r5.e(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw.o(java.lang.Object):java.lang.Object");
    }
}
