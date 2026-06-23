package defpackage;

import androidx.work.CoroutineWorker;

/* loaded from: classes.dex */
public final class ey extends nt1 implements pf0 {
    public final /* synthetic */ int k;
    public int l;
    public final /* synthetic */ CoroutineWorker m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey(CoroutineWorker coroutineWorker, dx dxVar, int i) {
        super(2, dxVar);
        this.k = i;
        this.m = coroutineWorker;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        int i = this.k;
        e42 e42Var = e42.f219a;
        yx yxVar = (yx) obj;
        dx dxVar = (dx) obj2;
        switch (i) {
            case 0:
                ((ey) l(dxVar, yxVar)).o(e42Var);
                return e42Var;
            default:
                return ((ey) l(dxVar, yxVar)).o(e42Var);
        }
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        int i = this.k;
        CoroutineWorker coroutineWorker = this.m;
        switch (i) {
            case 0:
                return new ey(coroutineWorker, dxVar, 0);
            default:
                return new ey(coroutineWorker, dxVar, 1);
        }
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        switch (this.k) {
            case 0:
                int i = this.l;
                if (i == 0) {
                    om0.O(obj);
                    this.l = 1;
                    c.n("Not implemented");
                } else {
                    if (i == 1) {
                        om0.O(obj);
                        return obj;
                    }
                    c.n("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                int i2 = this.l;
                if (i2 != 0) {
                    if (i2 == 1) {
                        om0.O(obj);
                        return obj;
                    }
                    c.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                om0.O(obj);
                this.l = 1;
                Object c = this.m.c(this);
                zx zxVar = zx.g;
                return c == zxVar ? zxVar : c;
        }
    }
}
