package defpackage;

/* loaded from: classes.dex */
public final class hh1 extends nt1 implements pf0 {
    public final /* synthetic */ int k;
    public int l;
    public final /* synthetic */ xg1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh1(xg1 xg1Var, dx dxVar, int i) {
        super(2, dxVar);
        this.k = i;
        this.m = xg1Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        int i = this.k;
        e42 e42Var = e42.f219a;
        yx yxVar = (yx) obj;
        dx dxVar = (dx) obj2;
        switch (i) {
        }
        return ((hh1) l(dxVar, yxVar)).o(e42Var);
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        int i = this.k;
        xg1 xg1Var = this.m;
        switch (i) {
            case 0:
                return new hh1(xg1Var, dxVar, 0);
            default:
                return new hh1(xg1Var, dxVar, 1);
        }
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        int i = this.k;
        e42 e42Var = e42.f219a;
        xg1 xg1Var = this.m;
        zx zxVar = zx.g;
        switch (i) {
            case 0:
                int i2 = this.l;
                if (i2 == 0) {
                    om0.O(obj);
                    this.l = 1;
                    if (xg1.l(xg1Var, this) == zxVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    c.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    om0.O(obj);
                    break;
                }
                break;
            default:
                int i3 = this.l;
                if (i3 == 0) {
                    om0.O(obj);
                    this.l = 1;
                    if (xg1.l(xg1Var, this) == zxVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    c.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    om0.O(obj);
                    break;
                }
                break;
        }
        return zxVar;
    }
}
