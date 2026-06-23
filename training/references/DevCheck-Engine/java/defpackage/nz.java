package defpackage;

/* loaded from: classes.dex */
public final class nz extends nt1 implements pf0 {
    public int k;
    public final /* synthetic */ dh1 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ lf0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(dx dxVar, lf0 lf0Var, dh1 dh1Var, boolean z) {
        super(2, dxVar);
        this.l = dh1Var;
        this.m = z;
        this.n = lf0Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        return ((nz) l((dx) obj2, (yx) obj)).o(e42.f219a);
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        return new nz(dxVar, this.n, this.l, this.m);
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                om0.O(obj);
                return obj;
            }
            c.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        om0.O(obj);
        lf0 lf0Var = this.n;
        dh1 dh1Var = this.l;
        boolean z = this.m;
        pz pzVar = new pz(null, lf0Var, dh1Var, z);
        this.k = 1;
        Object w = dh1Var.w(z, pzVar, this);
        zx zxVar = zx.g;
        return w == zxVar ? zxVar : w;
    }
}
