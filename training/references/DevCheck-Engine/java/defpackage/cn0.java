package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class cn0 extends nt1 implements pf0 {
    public final /* synthetic */ int k;
    public int l;
    public final /* synthetic */ en0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn0(en0 en0Var, dx dxVar, int i) {
        super(2, dxVar);
        this.k = i;
        this.m = en0Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        int i = this.k;
        e42 e42Var = e42.f219a;
        yx yxVar = (yx) obj;
        dx dxVar = (dx) obj2;
        switch (i) {
        }
        return ((cn0) l(dxVar, yxVar)).o(e42Var);
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        int i = this.k;
        en0 en0Var = this.m;
        switch (i) {
            case 0:
                return new cn0(en0Var, dxVar, 0);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new cn0(en0Var, dxVar, 1);
            default:
                return new cn0(en0Var, dxVar, 2);
        }
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        int i = this.k;
        e42 e42Var = e42.f219a;
        en0 en0Var = this.m;
        zx zxVar = zx.g;
        switch (i) {
            case 0:
                int i2 = this.l;
                if (i2 == 0) {
                    om0.O(obj);
                    v12 v12Var = en0Var.b;
                    this.l = 1;
                    if (v12Var.f(this) == zxVar) {
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
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i3 = this.l;
                if (i3 == 0) {
                    om0.O(obj);
                    v12 v12Var2 = en0Var.b;
                    this.l = 1;
                    if (v12Var2.f(this) == zxVar) {
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
            default:
                int i4 = this.l;
                if (i4 == 0) {
                    om0.O(obj);
                    this.l = 1;
                    if (en0Var.a(this) == zxVar) {
                        break;
                    }
                } else if (i4 != 1) {
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
