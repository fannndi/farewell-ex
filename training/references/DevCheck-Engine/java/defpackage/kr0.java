package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class kr0 extends td1 {
    public final y9 d;

    public kr0(kk1 kk1Var) {
        int i;
        jr0 jr0Var = new jr0(this);
        gm2 gm2Var = new gm2(4, this);
        synchronized (d10.f164a) {
            try {
                i = 2;
                if (d10.b == null) {
                    d10.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y9 y9Var = new y9(gm2Var, new u40(d10.b, i, kk1Var));
        this.d = y9Var;
        y9Var.d.add(jr0Var);
    }

    @Override // defpackage.td1
    public final int c() {
        return this.d.f.size();
    }

    public final void v(List list) {
        y9 y9Var = this.d;
        gm2 gm2Var = y9Var.f1219a;
        int i = y9Var.g + 1;
        y9Var.g = i;
        List list2 = y9Var.e;
        if (list == list2) {
            return;
        }
        if (list == null) {
            int size = list2.size();
            y9Var.e = null;
            y9Var.f = Collections.EMPTY_LIST;
            gm2Var.i(0, size);
            y9Var.a();
            return;
        }
        if (list2 != null) {
            ((Executor) y9Var.b.h).execute(new w9(y9Var, list2, list, i));
            return;
        }
        y9Var.e = list;
        y9Var.f = Collections.unmodifiableList(list);
        gm2Var.B(0, list.size());
        y9Var.a();
    }
}
