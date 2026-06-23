package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class r31 extends c22 {
    public static final q31 c = new q31(1);

    /* renamed from: a, reason: collision with root package name */
    public final nh0 f873a;
    public final int b;

    public r31(nh0 nh0Var, int i) {
        this.f873a = nh0Var;
        this.b = i;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        Object arrayList;
        Serializable arrayList2;
        int Q = ro0Var.Q();
        int A = d51.A(Q);
        if (A == 0) {
            ro0Var.a();
            arrayList = new ArrayList();
        } else if (A != 2) {
            arrayList = null;
        } else {
            ro0Var.e();
            arrayList = new ir0(true);
        }
        if (arrayList == null) {
            return d(Q, ro0Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (ro0Var.D()) {
                String K = arrayList instanceof Map ? ro0Var.K() : null;
                int Q2 = ro0Var.Q();
                int A2 = d51.A(Q2);
                if (A2 == 0) {
                    ro0Var.a();
                    arrayList2 = new ArrayList();
                } else if (A2 != 2) {
                    arrayList2 = null;
                } else {
                    ro0Var.e();
                    arrayList2 = new ir0(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(Q2, ro0Var);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(K, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    ro0Var.m();
                } else {
                    ro0Var.o();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        if (obj == null) {
            to0Var.D();
            return;
        }
        Class<?> cls = obj.getClass();
        nh0 nh0Var = this.f873a;
        nh0Var.getClass();
        c22 b = nh0Var.b(new l32(cls));
        if (!(b instanceof r31)) {
            b.c(to0Var, obj);
        } else {
            to0Var.j();
            to0Var.o();
        }
    }

    public final Serializable d(int i, ro0 ro0Var) {
        int A = d51.A(i);
        if (A == 5) {
            return ro0Var.O();
        }
        if (A == 6) {
            return iy1.a(this.b, ro0Var);
        }
        if (A == 7) {
            return Boolean.valueOf(ro0Var.G());
        }
        if (A == 8) {
            ro0Var.M();
            return null;
        }
        c.n("Unexpected token: ".concat(d51.B(i)));
        return null;
    }
}
