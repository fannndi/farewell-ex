package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class mo0 extends c22 {

    /* renamed from: a, reason: collision with root package name */
    public static final mo0 f648a = new mo0();

    public static lo0 d(int i, ro0 ro0Var) {
        int A = d51.A(i);
        if (A == 5) {
            return new qo0(ro0Var.O());
        }
        if (A == 6) {
            return new qo0(new ip0(ro0Var.O()));
        }
        if (A == 7) {
            return new qo0(Boolean.valueOf(ro0Var.G()));
        }
        if (A == 8) {
            ro0Var.M();
            return oo0.g;
        }
        c.n("Unexpected token: ".concat(d51.B(i)));
        return null;
    }

    public static void e(to0 to0Var, lo0 lo0Var) {
        if (lo0Var == null || (lo0Var instanceof oo0)) {
            to0Var.D();
            return;
        }
        if (lo0Var instanceof qo0) {
            qo0 qo0Var = (qo0) lo0Var;
            Serializable serializable = qo0Var.g;
            if (serializable instanceof Number) {
                to0Var.J(qo0Var.c());
                return;
            } else if (serializable instanceof Boolean) {
                to0Var.L(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(qo0Var.d()));
                return;
            } else {
                to0Var.K(qo0Var.d());
                return;
            }
        }
        boolean z = lo0Var instanceof go0;
        if (z) {
            to0Var.e();
            if (!z) {
                rw.n("Not a JSON Array: ", lo0Var);
                return;
            }
            ArrayList arrayList = ((go0) lo0Var).g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e(to0Var, (lo0) obj);
            }
            to0Var.m();
            return;
        }
        boolean z2 = lo0Var instanceof po0;
        if (!z2) {
            rw.g("Couldn't write ", lo0Var.getClass());
            return;
        }
        to0Var.j();
        if (!z2) {
            rw.n("Not a JSON Object: ", lo0Var);
            return;
        }
        Iterator it = ((gr0) ((po0) lo0Var).g.entrySet()).iterator();
        while (((fr0) it).hasNext()) {
            hr0 b = ((fr0) it).b();
            to0Var.r((String) b.getKey());
            e(to0Var, (lo0) b.getValue());
        }
        to0Var.o();
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        lo0 go0Var;
        lo0 go0Var2;
        int Q = ro0Var.Q();
        int A = d51.A(Q);
        if (A == 0) {
            ro0Var.a();
            go0Var = new go0();
        } else if (A != 2) {
            go0Var = null;
        } else {
            ro0Var.e();
            go0Var = new po0();
        }
        if (go0Var == null) {
            return d(Q, ro0Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (ro0Var.D()) {
                String K = go0Var instanceof po0 ? ro0Var.K() : null;
                int Q2 = ro0Var.Q();
                int A2 = d51.A(Q2);
                if (A2 == 0) {
                    ro0Var.a();
                    go0Var2 = new go0();
                } else if (A2 != 2) {
                    go0Var2 = null;
                } else {
                    ro0Var.e();
                    go0Var2 = new po0();
                }
                boolean z = go0Var2 != null;
                if (go0Var2 == null) {
                    go0Var2 = d(Q2, ro0Var);
                }
                if (go0Var instanceof go0) {
                    ((go0) go0Var).g.add(go0Var2);
                } else {
                    ((po0) go0Var).g.put(K, go0Var2);
                }
                if (z) {
                    arrayDeque.addLast(go0Var);
                    go0Var = go0Var2;
                }
            } else {
                if (go0Var instanceof go0) {
                    ro0Var.m();
                } else {
                    ro0Var.o();
                }
                if (arrayDeque.isEmpty()) {
                    return go0Var;
                }
                go0Var = (lo0) arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.c22
    public final /* bridge */ /* synthetic */ void c(to0 to0Var, Object obj) {
        e(to0Var, (lo0) obj);
    }
}
