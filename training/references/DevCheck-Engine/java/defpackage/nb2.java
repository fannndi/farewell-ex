package defpackage;

/* loaded from: classes.dex */
public final class nb2 extends nt1 implements qf0 {
    public int k;
    public /* synthetic */ tb0 l;
    public /* synthetic */ Object[] m;

    @Override // defpackage.qf0
    public final Object e(Object obj, Object obj2, Object obj3) {
        nb2 nb2Var = new nb2(3, (dx) obj3);
        nb2Var.l = (tb0) obj;
        nb2Var.m = (Object[]) obj2;
        return nb2Var.o(e42.f219a);
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        pw pwVar;
        int i = this.k;
        pw pwVar2 = null;
        if (i == 0) {
            om0.O(obj);
            tb0 tb0Var = this.l;
            pw[] pwVarArr = (pw[]) this.m;
            int length = pwVarArr.length;
            int i2 = 0;
            while (true) {
                pwVar = nw.f704a;
                if (i2 >= length) {
                    break;
                }
                pw pwVar3 = pwVarArr[i2];
                if (!ym0.b(pwVar3, pwVar)) {
                    pwVar2 = pwVar3;
                    break;
                }
                i2++;
            }
            if (pwVar2 != null) {
                pwVar = pwVar2;
            }
            this.k = 1;
            Object k = tb0Var.k(pwVar, this);
            zx zxVar = zx.g;
            if (k == zxVar) {
                return zxVar;
            }
        } else {
            if (i != 1) {
                c.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            om0.O(obj);
        }
        return e42.f219a;
    }
}
