package defpackage;

import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ul2 implements Cloneable {
    public final vl2 g;
    public vl2 h;

    public ul2(vl2 vl2Var) {
        this.g = vl2Var;
        if (vl2Var.c()) {
            c.m("Default instance must be immutable.");
            throw null;
        }
        this.h = (vl2) vl2Var.d(4);
    }

    public static void a(int i, List list) {
        String p = d51.p(list.size() - i, qJTtDWNCVUDjB.vxmQe, " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(p);
            }
            list.remove(size);
        }
    }

    public final vl2 b() {
        boolean c = this.h.c();
        vl2 vl2Var = this.h;
        if (c) {
            vl2Var.getClass();
            om2.c.a(vl2Var.getClass()).a(vl2Var);
            vl2Var.j();
            vl2Var = this.h;
        }
        if (vl2.m(vl2Var, true)) {
            return vl2Var;
        }
        throw new ym2();
    }

    public final void c() {
        if (this.h.c()) {
            return;
        }
        vl2 vl2Var = (vl2) this.g.d(4);
        om2.c.a(vl2Var.getClass()).b(vl2Var, this.h);
        this.h = vl2Var;
    }

    public final Object clone() {
        ul2 ul2Var = (ul2) this.g.d(5);
        boolean c = this.h.c();
        vl2 vl2Var = this.h;
        if (c) {
            vl2Var.getClass();
            om2.c.a(vl2Var.getClass()).a(vl2Var);
            vl2Var.j();
            vl2Var = this.h;
        }
        ul2Var.h = vl2Var;
        return ul2Var;
    }
}
