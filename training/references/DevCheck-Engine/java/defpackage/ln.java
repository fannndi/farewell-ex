package defpackage;

/* loaded from: classes.dex */
public final class ln extends cp {
    public final pf0 j;
    public final pf0 k;

    public ln(pf0 pf0Var, qx qxVar, int i, xl xlVar) {
        super(qxVar, i, xlVar);
        this.j = pf0Var;
        this.k = pf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.cp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.na1 r6, defpackage.dx r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.kn
            if (r0 == 0) goto L13
            r0 = r7
            kn r0 = (defpackage.kn) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L1a
        L13:
            kn r0 = new kn
            ex r7 = (defpackage.ex) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.k
            int r1 = r0.m
            r2 = 0
            e42 r3 = defpackage.e42.f219a
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2c
            na1 r6 = r0.j
            defpackage.om0.O(r7)
            goto L48
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r5)
            return r2
        L32:
            defpackage.om0.O(r7)
            r0.j = r6
            r0.m = r4
            pf0 r5 = r5.j
            java.lang.Object r5 = r5.f(r6, r0)
            zx r7 = defpackage.zx.g
            if (r5 != r7) goto L44
            goto L45
        L44:
            r5 = r3
        L45:
            if (r5 != r7) goto L48
            return r7
        L48:
            bm r5 = r6.l
            boolean r5 = r5.z()
            if (r5 == 0) goto L51
            return r3
        L51:
            r5 = 0
            java.lang.String r5 = com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB.GMHKn
            defpackage.c.n(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln.c(na1, dx):java.lang.Object");
    }

    @Override // defpackage.cp
    public final cp d(qx qxVar, int i, xl xlVar) {
        return new ln(this.k, qxVar, i, xlVar);
    }

    @Override // defpackage.cp
    public final String toString() {
        return "block[" + this.j + "] -> " + super.toString();
    }
}
