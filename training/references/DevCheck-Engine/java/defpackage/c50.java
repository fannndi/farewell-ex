package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class c50 extends mv1 {
    public int i;

    public c50(int i) {
        super(0L, false);
        this.i = i;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract dx e();

    public Throwable f(Object obj) {
        ot otVar = obj instanceof ot ? (ot) obj : null;
        if (otVar != null) {
            return otVar.f756a;
        }
        return null;
    }

    public Object j(Object obj) {
        return obj;
    }

    public final void k(Throwable th) {
        op0.y(e().d(), new fy("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object l();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.rn0) r5.r(defpackage.pg0.k);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            dx r0 = r11.e()     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            z40 r0 = (defpackage.z40) r0     // Catch: java.lang.Throwable -> L1f
            ex r1 = r0.k     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.m     // Catch: java.lang.Throwable -> L1f
            qx r2 = r1.d()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = defpackage.sy1.c(r2, r0)     // Catch: java.lang.Throwable -> L1f
            o1 r3 = defpackage.sy1.f961a     // Catch: java.lang.Throwable -> L1f
            r4 = 0
            if (r0 == r3) goto L22
            z32 r3 = defpackage.xc1.K(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            goto L8e
        L22:
            r3 = r4
        L23:
            qx r5 = r1.d()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = r11.l()     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r7 = r11.f(r6)     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L48
            int r8 = r11.i     // Catch: java.lang.Throwable -> L46
            r9 = 1
            if (r8 == r9) goto L3b
            r10 = 2
            if (r8 != r10) goto L3a
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto L48
            pg0 r4 = defpackage.pg0.k     // Catch: java.lang.Throwable -> L46
            ox r4 = r5.r(r4)     // Catch: java.lang.Throwable -> L46
            rn0 r4 = (defpackage.rn0) r4     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L82
        L48:
            if (r4 == 0) goto L62
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L62
            bo0 r4 = (defpackage.bo0) r4     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.CancellationException r4 = r4.C()     // Catch: java.lang.Throwable -> L46
            r11.b(r4)     // Catch: java.lang.Throwable -> L46
            pg1 r5 = new pg1     // Catch: java.lang.Throwable -> L46
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L46
            r1.g(r5)     // Catch: java.lang.Throwable -> L46
            goto L74
        L62:
            if (r7 == 0) goto L6d
            pg1 r4 = new pg1     // Catch: java.lang.Throwable -> L46
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L46
            r1.g(r4)     // Catch: java.lang.Throwable -> L46
            goto L74
        L6d:
            java.lang.Object r4 = r11.j(r6)     // Catch: java.lang.Throwable -> L46
            r1.g(r4)     // Catch: java.lang.Throwable -> L46
        L74:
            if (r3 == 0) goto L7e
            boolean r1 = r3.i0()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            defpackage.sy1.a(r2, r0)     // Catch: java.lang.Throwable -> L1f
            return
        L82:
            if (r3 == 0) goto L8a
            boolean r3 = r3.i0()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L8d
        L8a:
            defpackage.sy1.a(r2, r0)     // Catch: java.lang.Throwable -> L1f
        L8d:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L8e:
            r11.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c50.run():void");
    }
}
