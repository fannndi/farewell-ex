package defpackage;

/* loaded from: classes.dex */
public final class ht1 implements u02, wc1 {

    /* renamed from: a, reason: collision with root package name */
    public final ct1 f398a;

    public ht1(ct1 ct1Var) {
        this.f398a = ct1Var;
    }

    @Override // defpackage.u02
    public final Object a(t02 t02Var, pf0 pf0Var, nt1 nt1Var) {
        return e(t02Var, pf0Var, nt1Var);
    }

    @Override // defpackage.wc1
    public final ti1 b() {
        return this.f398a;
    }

    @Override // defpackage.u02
    public final Object c(nt1 nt1Var) {
        return Boolean.valueOf(this.f398a.g.r());
    }

    @Override // defpackage.v71
    public final Object d(String str, lf0 lf0Var, ex exVar) {
        mt1 C = this.f398a.C(str);
        try {
            Object j = lf0Var.j(C);
            rt0.e(C, null);
            return j;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.t02 r9, defpackage.pf0 r10, defpackage.ex r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.gt1
            if (r0 == 0) goto L13
            r0 = r11
            gt1 r0 = (defpackage.gt1) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            gt1 r0 = new gt1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.l
            int r1 = r0.n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            se0 r8 = r0.k
            ht1 r9 = r0.j
            defpackage.om0.O(r11)     // Catch: java.lang.Throwable -> L2b
            goto Lb3
        L2b:
            r10 = move-exception
            goto Lc6
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r8)
            return r2
        L34:
            defpackage.om0.O(r11)
            ct1 r11 = r8.f398a
            se0 r11 = r11.g
            r11.r()
            int r9 = r9.ordinal()
            if (r9 == 0) goto L57
            if (r9 == r3) goto L53
            r1 = 2
            if (r9 != r1) goto L4d
            r11.a()
            goto L9b
        L4d:
            pt r8 = new pt
            r8.<init>()
            throw r8
        L53:
            r11.e()
            goto L9b
        L57:
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.database.sqlite.SQLiteDatabase r1 = r11.g
            jp0 r4 = defpackage.se0.k
            java.lang.Object r5 = r4.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L98
            jp0 r5 = defpackage.se0.j
            java.lang.Object r6 = r5.getValue()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L98
            java.lang.Object r4 = r4.getValue()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Object r5 = r5.getValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            java.lang.Object r1 = r5.invoke(r1, r2)
            if (r1 == 0) goto L92
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r2, r9, r2}
            r4.invoke(r1, r9)
            goto L9b
        L92:
            java.lang.String r9 = "Required value was null."
            defpackage.c.n(r9)
            goto L9b
        L98:
            r11.a()
        L9b:
            x71 r9 = new x71     // Catch: java.lang.Throwable -> Lc3
            r9.<init>(r3, r8)     // Catch: java.lang.Throwable -> Lc3
            r0.j = r8     // Catch: java.lang.Throwable -> Lc3
            r0.k = r11     // Catch: java.lang.Throwable -> Lc3
            r0.n = r3     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r9 = r10.f(r9, r0)     // Catch: java.lang.Throwable -> Lc3
            zx r10 = defpackage.zx.g
            if (r9 != r10) goto Laf
            return r10
        Laf:
            r7 = r9
            r9 = r8
            r8 = r11
            r11 = r7
        Lb3:
            r8.D()     // Catch: java.lang.Throwable -> L2b
            r8.l()
            boolean r8 = r8.r()
            if (r8 != 0) goto Lc2
            r9.getClass()
        Lc2:
            return r11
        Lc3:
            r10 = move-exception
            r9 = r8
            r8 = r11
        Lc6:
            r8.l()
            boolean r8 = r8.r()
            if (r8 != 0) goto Ld2
            r9.getClass()
        Ld2:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht1.e(t02, pf0, ex):java.lang.Object");
    }
}
