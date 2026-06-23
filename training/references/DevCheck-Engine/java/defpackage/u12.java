package defpackage;

/* loaded from: classes.dex */
public final class u12 extends nt1 implements pf0 {
    public t31[] k;
    public v12 l;
    public u02 m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ t31[] r;
    public final /* synthetic */ v12 s;
    public final /* synthetic */ u02 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u12(t31[] t31VarArr, v12 v12Var, u02 u02Var, dx dxVar) {
        super(2, dxVar);
        this.r = t31VarArr;
        this.s = v12Var;
        this.t = u02Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        return ((u12) l((dx) obj2, (x71) obj)).o(e42.f219a);
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        return new u12(this.r, this.s, this.t, dxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (defpackage.v12.c(r6, r5, r11, r10) == r9) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0074 -> B:10:0x0075). Please report as a decompilation issue!!! */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.q
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L21
            if (r0 == r2) goto La
            if (r0 != r1) goto L1a
        La:
            int r0 = r10.p
            int r3 = r10.o
            int r4 = r10.n
            u02 r5 = r10.m
            v12 r6 = r10.l
            t31[] r7 = r10.k
            defpackage.om0.O(r11)
            goto L57
        L1a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r10)
            r10 = 0
            return r10
        L21:
            defpackage.om0.O(r11)
            t31[] r11 = r10.r
            int r0 = r11.length
            r3 = 0
            v12 r4 = r10.s
            u02 r5 = r10.t
            r7 = r11
            r11 = r3
            r6 = r4
        L2f:
            if (r3 >= r0) goto L77
            r4 = r7[r3]
            int r8 = r11 + 1
            int r4 = r4.ordinal()
            if (r4 == 0) goto L74
            zx r9 = defpackage.zx.g
            if (r4 == r2) goto L5f
            if (r4 != r1) goto L59
            r10.k = r7
            r10.l = r6
            r10.m = r5
            r10.n = r8
            r10.o = r3
            r10.p = r0
            r10.q = r1
            java.lang.Object r11 = defpackage.v12.d(r6, r5, r11, r10)
            if (r11 != r9) goto L56
            goto L73
        L56:
            r4 = r8
        L57:
            r11 = r4
            goto L75
        L59:
            pt r10 = new pt
            r10.<init>()
            throw r10
        L5f:
            r10.k = r7
            r10.l = r6
            r10.m = r5
            r10.n = r8
            r10.o = r3
            r10.p = r0
            r10.q = r2
            java.lang.Object r11 = defpackage.v12.c(r6, r5, r11, r10)
            if (r11 != r9) goto L56
        L73:
            return r9
        L74:
            r11 = r8
        L75:
            int r3 = r3 + r2
            goto L2f
        L77:
            e42 r10 = defpackage.e42.f219a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u12.o(java.lang.Object):java.lang.Object");
    }
}
