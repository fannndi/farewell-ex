package defpackage;

import java.util.Objects;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class od extends nt1 implements pf0 {
    public final /* synthetic */ int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od(Object obj, dx dxVar, int i) {
        super(2, dxVar);
        this.k = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ od(Object obj, Object obj2, dx dxVar, int i) {
        super(2, dxVar);
        this.k = i;
        this.m = obj;
        this.n = obj2;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        int i = this.k;
        e42 e42Var = e42.f219a;
        switch (i) {
            case 0:
                return ((od) l((dx) obj2, (na1) obj)).o(e42Var);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((od) l((dx) obj2, (na1) obj)).o(e42Var);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return ((od) l((dx) obj2, (tb0) obj)).o(e42Var);
            case 3:
                return ((od) l((dx) obj2, (yx) obj)).o(e42Var);
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return ((od) l((dx) obj2, (yx) obj)).o(e42Var);
            case 5:
                return ((od) l((dx) obj2, (yx) obj)).o(e42Var);
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return ((od) l((dx) obj2, (yx) obj)).o(e42Var);
            default:
                return ((od) l((dx) obj2, obj)).o(e42Var);
        }
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        int i = this.k;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                od odVar = new od((pd) obj2, dxVar, 0);
                odVar.m = obj;
                return odVar;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                od odVar2 = new od((cp) obj2, dxVar, 1);
                odVar2.m = obj;
                return odVar2;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                od odVar3 = new od((dp) obj2, dxVar, 2);
                odVar3.m = obj;
                return odVar3;
            case 3:
                return new od((pf0) this.m, (d81) obj2, dxVar, 3);
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return new od((pf0) this.m, (ze1) obj2, dxVar, 4);
            case 5:
                return new od((i21) this.m, (na1) obj2, dxVar, 5);
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return new od((v12) this.m, (af0) obj2, dxVar, 6);
            default:
                od odVar4 = new od((tb0) obj2, dxVar, 7);
                odVar4.m = obj;
                return odVar4;
        }
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        switch (this.k) {
            case 0:
                zx zxVar = zx.g;
                int i = this.l;
                if (i == 0) {
                    om0.O(obj);
                    na1 na1Var = (na1) this.m;
                    pd pdVar = (pd) this.n;
                    nd ndVar = new nd(pdVar, na1Var);
                    uv uvVar = pdVar.f784a;
                    uvVar.getClass();
                    synchronized (uvVar.c) {
                        try {
                            if (uvVar.d.add(ndVar)) {
                                if (uvVar.d.size() == 1) {
                                    uvVar.e = uvVar.a();
                                    ai1 h = ai1.h();
                                    int i2 = vv.f1100a;
                                    Objects.toString(uvVar.e);
                                    h.getClass();
                                    uvVar.c();
                                }
                                Object owVar = pdVar.e(uvVar.e) ? new ow(pdVar.d()) : nw.f704a;
                                na1Var.getClass();
                                na1Var.k(owVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    md mdVar = new md((pd) this.n, 0, ndVar);
                    this.l = 1;
                    if (md2.c(na1Var, mdVar, this) == zxVar) {
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
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                zx zxVar2 = zx.g;
                int i3 = this.l;
                if (i3 == 0) {
                    om0.O(obj);
                    na1 na1Var2 = (na1) this.m;
                    cp cpVar = (cp) this.n;
                    this.l = 1;
                    if (cpVar.c(na1Var2, this) == zxVar2) {
                        return zxVar2;
                    }
                } else {
                    if (i3 != 1) {
                        c.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    om0.O(obj);
                }
                return e42.f219a;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                e42 e42Var = e42.f219a;
                zx zxVar3 = zx.g;
                int i4 = this.l;
                if (i4 == 0) {
                    om0.O(obj);
                    tb0 tb0Var = (tb0) this.m;
                    dp dpVar = (dp) this.n;
                    this.l = 1;
                    Object a2 = dpVar.j.a(tb0Var, this);
                    if (a2 != zxVar3) {
                        a2 = e42Var;
                    }
                    if (a2 == zxVar3) {
                        return zxVar3;
                    }
                } else {
                    if (i4 != 1) {
                        c.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    om0.O(obj);
                }
                return e42Var;
            case 3:
                zx zxVar4 = zx.g;
                int i5 = this.l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        om0.O(obj);
                        return obj;
                    }
                    c.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                om0.O(obj);
                pf0 pf0Var = (pf0) this.m;
                d81 d81Var = (d81) this.n;
                this.l = 1;
                Object f = pf0Var.f(d81Var, this);
                return f == zxVar4 ? zxVar4 : f;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                zx zxVar5 = zx.g;
                int i6 = this.l;
                if (i6 != 0) {
                    if (i6 == 1) {
                        om0.O(obj);
                        return obj;
                    }
                    c.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                om0.O(obj);
                pf0 pf0Var2 = (pf0) this.m;
                Object obj2 = ((ze1) this.n).g;
                this.l = 1;
                Object f2 = pf0Var2.f(obj2, this);
                return f2 == zxVar5 ? zxVar5 : f2;
            case 5:
                zx zxVar6 = zx.g;
                int i7 = this.l;
                if (i7 == 0) {
                    om0.O(obj);
                    this.l = 1;
                    if (pr.l(1000L, this) == zxVar6) {
                        return zxVar6;
                    }
                } else {
                    if (i7 != 1) {
                        c.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    om0.O(obj);
                }
                ai1 h2 = ai1.h();
                int i8 = ob2.f725a;
                h2.getClass();
                ((na1) this.n).k(new ow(7));
                return e42.f219a;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                af0 af0Var = (af0) this.n;
                zx zxVar7 = zx.g;
                int i9 = this.l;
                try {
                    if (i9 == 0) {
                        om0.O(obj);
                        v12 v12Var = (v12) this.m;
                        this.l = 1;
                        obj = v12.b(v12Var, this);
                        if (obj == zxVar7) {
                            return zxVar7;
                        }
                    } else {
                        if (i9 != 1) {
                            c.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        om0.O(obj);
                    }
                    af0Var.a();
                    return e42.f219a;
                } catch (Throwable th2) {
                    af0Var.a();
                    throw th2;
                }
            default:
                zx zxVar8 = zx.g;
                int i10 = this.l;
                if (i10 == 0) {
                    om0.O(obj);
                    Object obj3 = this.m;
                    tb0 tb0Var2 = (tb0) this.n;
                    this.l = 1;
                    if (tb0Var2.k(obj3, this) == zxVar8) {
                        return zxVar8;
                    }
                } else {
                    if (i10 != 1) {
                        c.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    om0.O(obj);
                }
                return e42.f219a;
        }
    }
}
