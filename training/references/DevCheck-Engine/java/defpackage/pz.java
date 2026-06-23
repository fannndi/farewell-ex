package defpackage;

/* loaded from: classes.dex */
public final class pz extends nt1 implements pf0 {
    public t02 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ dh1 o;
    public final /* synthetic */ lf0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz(dx dxVar, lf0 lf0Var, dh1 dh1Var, boolean z) {
        super(2, dxVar);
        this.n = z;
        this.o = dh1Var;
        this.p = lf0Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        return ((pz) l((dx) obj2, (u02) obj)).o(e42.f219a);
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        pz pzVar = new pz(dxVar, this.p, this.o, this.n);
        pzVar.m = obj;
        return pzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r12 != r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.l
            lf0 r1 = r11.p
            if (r0 == 0) goto L99
            r2 = 0
            dh1 r3 = r11.o
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            zx r8 = defpackage.zx.g
            if (r0 == r7) goto L36
            if (r0 == r6) goto L2c
            if (r0 == r5) goto L24
            if (r0 != r4) goto L1e
            java.lang.Object r11 = r11.m
            defpackage.om0.O(r12)
            goto L82
        L1e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r11)
            return r2
        L24:
            java.lang.Object r0 = r11.m
            u02 r0 = (defpackage.u02) r0
            defpackage.om0.O(r12)
            goto L70
        L2c:
            t02 r0 = r11.k
            java.lang.Object r6 = r11.m
            u02 r6 = (defpackage.u02) r6
            defpackage.om0.O(r12)
            goto L59
        L36:
            t02 r0 = r11.k
            java.lang.Object r9 = r11.m
            u02 r9 = (defpackage.u02) r9
            defpackage.om0.O(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L5c
            en0 r12 = r3.j()
            r11.m = r9
            r11.k = r0
            r11.l = r6
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r8) goto L58
            goto L7e
        L58:
            r6 = r9
        L59:
            r12 = r0
            r0 = r6
            goto L5e
        L5c:
            r12 = r0
            r0 = r9
        L5e:
            kz r6 = new kz
            r6.<init>(r2, r1, r7)
            r11.m = r0
            r11.k = r2
            r11.l = r5
            java.lang.Object r12 = r0.a(r12, r6, r11)
            if (r12 != r8) goto L70
            goto L7e
        L70:
            boolean r1 = r11.n
            if (r1 != 0) goto L98
            r11.m = r12
            r11.l = r4
            java.lang.Object r11 = r0.c(r11)
            if (r11 != r8) goto L7f
        L7e:
            return r8
        L7f:
            r10 = r12
            r12 = r11
            r11 = r10
        L82:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L97
            en0 r12 = r3.j()
            v12 r0 = r12.b
            re0 r1 = r12.e
            re0 r12 = r12.f
            r0.e(r1, r12)
        L97:
            return r11
        L98:
            return r12
        L99:
            defpackage.om0.O(r12)
            java.lang.Object r11 = r11.m
            u02 r11 = (defpackage.u02) r11
            r11.getClass()
            wc1 r11 = (defpackage.wc1) r11
            ti1 r11 = r11.b()
            java.lang.Object r11 = r1.j(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz.o(java.lang.Object):java.lang.Object");
    }
}
