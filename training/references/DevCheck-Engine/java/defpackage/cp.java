package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class cp implements zf0 {
    public final qx g;
    public final int h;
    public final xl i;

    public cp(qx qxVar, int i, xl xlVar) {
        this.g = qxVar;
        this.h = i;
        this.i = xlVar;
    }

    @Override // defpackage.rb0
    public Object a(tb0 tb0Var, dx dxVar) {
        bp bpVar = new bp(tb0Var, this, null, 0);
        hk1 hk1Var = new hk1(dxVar, dxVar.d());
        Object W = je2.W(hk1Var, hk1Var, bpVar);
        return W == zx.g ? W : e42.f219a;
    }

    @Override // defpackage.zf0
    public final rb0 b(qx qxVar, int i, xl xlVar) {
        qx qxVar2 = this.g;
        qx o = qxVar.o(qxVar2);
        xl xlVar2 = xl.g;
        xl xlVar3 = this.i;
        int i2 = this.h;
        if (xlVar == xlVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            xlVar = xlVar3;
        }
        return (ym0.b(o, qxVar2) && i == i2 && xlVar == xlVar3) ? this : d(o, i, xlVar);
    }

    public abstract Object c(na1 na1Var, dx dxVar);

    public abstract cp d(qx qxVar, int i, xl xlVar);

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        n80 n80Var = n80.g;
        qx qxVar = this.g;
        if (qxVar != n80Var) {
            arrayList.add("context=" + qxVar);
        }
        int i = this.h;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        xl xlVar = xl.g;
        xl xlVar2 = this.i;
        if (xlVar2 != xlVar) {
            arrayList.add("onBufferOverflow=" + xlVar2);
        }
        return getClass().getSimpleName() + '[' + yr.Z(arrayList, ", ", null, null, null, 62) + ']';
    }
}
