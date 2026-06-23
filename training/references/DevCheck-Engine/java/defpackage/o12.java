package defpackage;

/* loaded from: classes.dex */
public final class o12 implements tb0 {
    public final /* synthetic */ ze1 g;
    public final /* synthetic */ tb0 h;
    public final /* synthetic */ String[] i;
    public final /* synthetic */ int[] j;

    public o12(ze1 ze1Var, tb0 tb0Var, String[] strArr, int[] iArr) {
        this.g = ze1Var;
        this.h = tb0Var;
        this.i = strArr;
        this.j = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r9.k(r2, r3) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        if (r9.k(r2, r3) == r10) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.tb0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int[] r18, defpackage.dx r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.n12
            if (r3 == 0) goto L19
            r3 = r2
            n12 r3 = (defpackage.n12) r3
            int r4 = r3.n
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.n = r4
            goto L1e
        L19:
            n12 r3 = new n12
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.l
            int r4 = r3.n
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3f
            if (r4 == r7) goto L32
            if (r4 != r6) goto L2c
            goto L32
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r0)
            return r5
        L32:
            int[] r0 = r3.k
            o12 r1 = r3.j
            defpackage.om0.O(r2)
            r16 = r1
            r1 = r0
            r0 = r16
            goto La7
        L3f:
            defpackage.om0.O(r2)
            ze1 r2 = r0.g
            java.lang.Object r4 = r2.g
            java.lang.String[] r8 = r0.i
            tb0 r9 = r0.h
            zx r10 = defpackage.zx.g
            if (r4 != 0) goto L5f
            java.util.Set r2 = defpackage.u9.r0(r8)
            r3.j = r0
            r3.k = r1
            r3.n = r7
            java.lang.Object r2 = r9.k(r2, r3)
            if (r2 != r10) goto La7
            goto La6
        L5f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r7 = r8.length
            r11 = 0
            r12 = r11
        L67:
            if (r11 >= r7) goto L90
            r13 = r8[r11]
            int r14 = r12 + 1
            java.lang.Object r15 = r2.g
            if (r15 == 0) goto L88
            int[] r15 = (int[]) r15
            r19 = r5
            int[] r5 = r0.j
            r5 = r5[r12]
            r12 = r15[r5]
            r5 = r1[r5]
            if (r12 == r5) goto L82
            r4.add(r13)
        L82:
            int r11 = r11 + 1
            r5 = r19
            r12 = r14
            goto L67
        L88:
            r19 = r5
            java.lang.String r0 = "Required value was null."
            defpackage.c.n(r0)
            return r19
        L90:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto La7
            java.util.Set r2 = defpackage.yr.i0(r4)
            r3.j = r0
            r3.k = r1
            r3.n = r6
            java.lang.Object r2 = r9.k(r2, r3)
            if (r2 != r10) goto La7
        La6:
            return r10
        La7:
            ze1 r0 = r0.g
            r0.g = r1
            e42 r0 = defpackage.e42.f219a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o12.k(int[], dx):java.lang.Object");
    }
}
