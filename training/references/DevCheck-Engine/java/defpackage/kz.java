package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class kz extends nt1 implements pf0 {
    public final /* synthetic */ int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ wf0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz(dx dxVar, lf0 lf0Var, int i) {
        super(2, dxVar);
        this.k = i;
        this.m = lf0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(pf0 pf0Var, dx dxVar) {
        super(2, dxVar);
        this.k = 2;
        this.m = pf0Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        int i = this.k;
        e42 e42Var = e42.f219a;
        switch (i) {
            case 0:
                return ((kz) l((dx) obj2, (x71) obj)).o(e42Var);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((kz) l((dx) obj2, (x71) obj)).o(e42Var);
            default:
                return ((kz) l((dx) obj2, (yx) obj)).o(e42Var);
        }
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        int i = this.k;
        wf0 wf0Var = this.m;
        switch (i) {
            case 0:
                kz kzVar = new kz(dxVar, (lf0) wf0Var, 0);
                kzVar.l = obj;
                return kzVar;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                kz kzVar2 = new kz(dxVar, (lf0) wf0Var, 1);
                kzVar2.l = obj;
                return kzVar2;
            default:
                kz kzVar3 = new kz((pf0) wf0Var, dxVar);
                kzVar3.l = obj;
                return kzVar3;
        }
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        int i = this.k;
        wf0 wf0Var = this.m;
        switch (i) {
            case 0:
                om0.O(obj);
                x71 x71Var = (x71) this.l;
                x71Var.getClass();
                return ((lf0) wf0Var).j(x71Var.b());
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                om0.O(obj);
                x71 x71Var2 = (x71) this.l;
                x71Var2.getClass();
                return ((lf0) wf0Var).j(x71Var2.b());
            default:
                om0.O(obj);
                qx f = ((yx) this.l).f();
                j70 j70Var = j70.i;
                ox r = f.r(j70Var);
                r.getClass();
                sx sxVar = (sx) r;
                lt ltVar = new lt(true);
                dx dxVar = null;
                ltVar.L(null);
                bp bpVar = new bp(ltVar, (pf0) wf0Var, dxVar, 4);
                qx o = xc1.o(n80.g, sxVar, true);
                c20 c20Var = e50.f220a;
                if (o != c20Var && o.r(j70Var) == null) {
                    o = o.o(c20Var);
                }
                o qq1Var = new qq1(o, true);
                qq1Var.h0(cy.j, qq1Var, bpVar);
                while (ltVar.I() instanceof vl0) {
                    try {
                        return ju0.p0(sxVar, new xv(ltVar, dxVar, 2));
                    } catch (InterruptedException unused) {
                    }
                }
                Object I = ltVar.I();
                if (I instanceof vl0) {
                    c.n("This job has not completed yet");
                    return dxVar;
                }
                if (I instanceof ot) {
                    throw ((ot) I).f756a;
                }
                return co0.a(I);
        }
    }
}
