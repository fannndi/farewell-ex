package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class bp extends nt1 implements pf0 {
    public final /* synthetic */ int k;
    public int l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp(Object obj, Object obj2, dx dxVar, int i) {
        super(2, dxVar);
        this.k = i;
        this.n = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bp(Object obj, Object obj2, Object obj3, dx dxVar, int i) {
        super(2, dxVar);
        this.k = i;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        int i = this.k;
        e42 e42Var = e42.f219a;
        switch (i) {
            case 0:
                return ((bp) l((dx) obj2, (yx) obj)).o(e42Var);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((bp) l((dx) obj2, (yx) obj)).o(e42Var);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return ((bp) l((dx) obj2, (yx) obj)).o(e42Var);
            case 3:
                return ((bp) l((dx) obj2, (na1) obj)).o(e42Var);
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return ((bp) l((dx) obj2, (yx) obj)).o(e42Var);
            case 5:
                return ((bp) l((dx) obj2, (yx) obj)).o(e42Var);
            default:
                return ((bp) l((dx) obj2, (yx) obj)).o(e42Var);
        }
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        int i = this.k;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (i) {
            case 0:
                bp bpVar = new bp((tb0) obj3, (cp) obj2, dxVar, 0);
                bpVar.m = obj;
                return bpVar;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new bp((ze1) obj3, (u71) obj2, dxVar, 1);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                bp bpVar2 = new bp((pf0) obj3, (mn) obj2, dxVar, 2);
                bpVar2.m = obj;
                return bpVar2;
            case 3:
                bp bpVar3 = new bp((lw) obj3, (i21) obj2, dxVar, 3);
                bpVar3.m = obj;
                return bpVar3;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                bp bpVar4 = new bp((lt) obj3, (pf0) obj2, dxVar, 4);
                bpVar4.m = obj;
                return bpVar4;
            case 5:
                return new bp((ti0) this.m, (gc2) obj3, (p41) obj2, dxVar, 5);
            default:
                return new bp((yc2) this.m, (is0) obj3, (wb2) obj2, dxVar, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r0 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103 A[LOOP:0: B:47:0x0103->B:54:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp.o(java.lang.Object):java.lang.Object");
    }
}
