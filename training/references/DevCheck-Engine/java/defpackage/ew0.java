package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class ew0 extends qy0 {
    public final /* synthetic */ int l;
    public final Object m;

    public ew0(int i) {
        this.l = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.m = new AtomicBoolean(false);
                break;
            default:
                this.m = new jj1();
                break;
        }
    }

    @Override // defpackage.ns0
    public void e(eq0 eq0Var, v31 v31Var) {
        switch (this.l) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                eq0Var.getClass();
                super.e(eq0Var, new bt(new x20(this, 4, v31Var), 1));
                break;
            default:
                super.e(eq0Var, v31Var);
                break;
        }
    }

    @Override // defpackage.ns0
    public void g() {
        switch (this.l) {
            case 0:
                Iterator it = ((jj1) this.m).iterator();
                while (true) {
                    fj1 fj1Var = (fj1) it;
                    if (!fj1Var.hasNext()) {
                        break;
                    } else {
                        dw0 dw0Var = (dw0) ((Map.Entry) fj1Var.next()).getValue();
                        dw0Var.f211a.f(dw0Var);
                    }
                }
        }
    }

    @Override // defpackage.ns0
    public void h() {
        switch (this.l) {
            case 0:
                Iterator it = ((jj1) this.m).iterator();
                while (true) {
                    fj1 fj1Var = (fj1) it;
                    if (!fj1Var.hasNext()) {
                        break;
                    } else {
                        dw0 dw0Var = (dw0) ((Map.Entry) fj1Var.next()).getValue();
                        dw0Var.f211a.j(dw0Var);
                    }
                }
        }
    }

    @Override // defpackage.ns0
    public void k(Object obj) {
        switch (this.l) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((AtomicBoolean) this.m).set(true);
                super.k(obj);
                break;
            default:
                super.k(obj);
                break;
        }
    }

    public void l(ns0 ns0Var, v31 v31Var) {
        Object obj;
        if (ns0Var == null) {
            jw0.f("source cannot be null");
            return;
        }
        dw0 dw0Var = new dw0(ns0Var, v31Var);
        jj1 jj1Var = (jj1) this.m;
        gj1 b = jj1Var.b(ns0Var);
        if (b != null) {
            obj = b.h;
        } else {
            gj1 gj1Var = new gj1(ns0Var, dw0Var);
            jj1Var.j++;
            gj1 gj1Var2 = jj1Var.h;
            if (gj1Var2 == null) {
                jj1Var.g = gj1Var;
                jj1Var.h = gj1Var;
            } else {
                gj1Var2.i = gj1Var;
                gj1Var.j = gj1Var2;
                jj1Var.h = gj1Var;
            }
            obj = null;
        }
        dw0 dw0Var2 = (dw0) obj;
        if (dw0Var2 != null && dw0Var2.b != v31Var) {
            c.m("This source was already added with the different observer");
        } else if (dw0Var2 == null && this.c > 0) {
            ns0Var.f(dw0Var);
        }
    }
}
