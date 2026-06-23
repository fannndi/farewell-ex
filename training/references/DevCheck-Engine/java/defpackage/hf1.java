package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class hf1 extends c22 {

    /* renamed from: a, reason: collision with root package name */
    public final jf1 f380a;

    public hf1(jf1 jf1Var) {
        this.f380a = jf1Var;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        Object d = d();
        Map map = this.f380a.f481a;
        try {
            ro0Var.e();
            while (ro0Var.D()) {
                gf1 gf1Var = (gf1) map.get(ro0Var.K());
                if (gf1Var == null) {
                    ro0Var.W();
                } else {
                    f(d, ro0Var, gf1Var);
                }
            }
            ro0Var.o();
            return e(d);
        } catch (IllegalAccessException e) {
            c3 c3Var = ef1.f230a;
            jw0.l("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new no0(e2);
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        if (obj == null) {
            to0Var.D();
            return;
        }
        to0Var.j();
        try {
            Iterator it = this.f380a.b.iterator();
            while (it.hasNext()) {
                ((gf1) it.next()).a(to0Var, obj);
            }
            to0Var.o();
        } catch (IllegalAccessException e) {
            c3 c3Var = ef1.f230a;
            jw0.l("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, ro0 ro0Var, gf1 gf1Var);
}
