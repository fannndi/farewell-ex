package defpackage;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class q12 extends nt1 implements pf0 {
    public final /* synthetic */ int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ v12 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q12(v12 v12Var, dx dxVar, int i) {
        super(2, dxVar);
        this.k = i;
        this.n = v12Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        int i = this.k;
        e42 e42Var = e42.f219a;
        switch (i) {
            case 0:
                return ((q12) l((dx) obj2, (x71) obj)).o(e42Var);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((q12) l((dx) obj2, (u02) obj)).o(e42Var);
            default:
                return ((q12) l((dx) obj2, (u02) obj)).o(e42Var);
        }
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        int i = this.k;
        v12 v12Var = this.n;
        switch (i) {
            case 0:
                q12 q12Var = new q12(v12Var, dxVar, 0);
                q12Var.m = obj;
                return q12Var;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                q12 q12Var2 = new q12(v12Var, dxVar, 1);
                q12Var2.m = obj;
                return q12Var2;
            default:
                q12 q12Var3 = new q12(v12Var, dxVar, 2);
                q12Var3.m = obj;
                return q12Var3;
        }
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        u02 u02Var;
        Object c;
        Object a2;
        u02 u02Var2;
        Object c2;
        t31[] t31VarArr;
        t31 t31Var;
        int i = this.k;
        t02 t02Var = t02.h;
        boolean z = false;
        zx zxVar = zx.g;
        boolean z2 = true;
        v12 v12Var = this.n;
        dx dxVar = null;
        switch (i) {
            case 0:
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
                x71 x71Var = (x71) this.m;
                this.l = 1;
                Object a3 = v12.a(v12Var, x71Var, this);
                return a3 == zxVar ? zxVar : a3;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i3 = this.l;
                try {
                    if (i3 == 0) {
                        om0.O(obj);
                        u02Var = (u02) this.m;
                        this.m = u02Var;
                        this.l = 1;
                        c = u02Var.c(this);
                        if (c == zxVar) {
                            return zxVar;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                c.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            om0.O(obj);
                            a2 = obj;
                            return (Set) a2;
                        }
                        u02Var = (u02) this.m;
                        om0.O(obj);
                        c = obj;
                    }
                    if (!((Boolean) c).booleanValue()) {
                        q12 q12Var = new q12(v12Var, dxVar, 0);
                        this.m = null;
                        this.l = 2;
                        a2 = u02Var.a(t02Var, q12Var, this);
                        if (a2 == zxVar) {
                            return zxVar;
                        }
                        return (Set) a2;
                    }
                } catch (SQLException unused) {
                }
                return r80.g;
            default:
                int i4 = this.l;
                e42 e42Var = e42.f219a;
                if (i4 == 0) {
                    om0.O(obj);
                    u02Var2 = (u02) this.m;
                    this.m = u02Var2;
                    this.l = 1;
                    c2 = u02Var2.c(this);
                    if (c2 == zxVar) {
                        return zxVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            om0.O(obj);
                            return e42Var;
                        }
                        c.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u02Var2 = (u02) this.m;
                    om0.O(obj);
                    c2 = obj;
                }
                if (!((Boolean) c2).booleanValue()) {
                    oj ojVar = v12Var.h;
                    long[] jArr = (long[]) ojVar.c;
                    ReentrantLock reentrantLock = (ReentrantLock) ojVar.b;
                    reentrantLock.lock();
                    try {
                        if (ojVar.f739a) {
                            ojVar.f739a = false;
                            int length = jArr.length;
                            t31VarArr = new t31[length];
                            int i5 = 0;
                            boolean z3 = false;
                            while (i5 < length) {
                                if (jArr[i5] > 0) {
                                    z = z2;
                                }
                                boolean[] zArr = (boolean[]) ojVar.d;
                                if (z != zArr[i5]) {
                                    zArr[i5] = z;
                                    t31Var = z ? t31.h : t31.i;
                                    z3 = true;
                                } else {
                                    t31Var = t31.g;
                                }
                                t31VarArr[i5] = t31Var;
                                i5++;
                                z = false;
                                z2 = true;
                            }
                            if (!z3) {
                                t31VarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            t31VarArr = null;
                        }
                        if (t31VarArr != null) {
                            u12 u12Var = new u12(t31VarArr, v12Var, u02Var2, null);
                            this.m = null;
                            this.l = 2;
                            if (u02Var2.a(t02Var, u12Var, this) == zxVar) {
                                return zxVar;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return e42Var;
        }
    }
}
