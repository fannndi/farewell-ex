package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class sj extends i72 {
    public final pj b;

    public sj(pj pjVar) {
        this.b = pjVar;
        pjVar.f792a.d();
    }

    public final ew0 c() {
        return this.b.f792a.d();
    }

    public final boolean d() {
        return Boolean.TRUE.equals((Boolean) this.b.f792a.d().d());
    }

    public final ew0 e() {
        wb wbVar = this.b.f792a;
        wbVar.getClass();
        final int i = 0;
        ew0 ew0Var = new ew0(0);
        HashMap hashMap = wbVar.o;
        ns0 ns0Var = (ns0) hashMap.get("devcheck.monthly");
        ns0 ns0Var2 = (ns0) hashMap.get("devcheck.annual");
        if (ns0Var == null && ns0Var2 == null) {
            ew0Var.k(Boolean.FALSE);
            return ew0Var;
        }
        final int i2 = 1;
        final b9 b9Var = new b9(i2, ns0Var, ns0Var2, ew0Var);
        if (ns0Var != null) {
            ew0Var.l(ns0Var, new v31() { // from class: rb
                @Override // defpackage.v31
                public final void a(Object obj) {
                    int i3 = i;
                    b9 b9Var2 = b9Var;
                    switch (i3) {
                        case 0:
                            b9Var2.run();
                            break;
                        default:
                            b9Var2.run();
                            break;
                    }
                }
            });
        }
        if (ns0Var2 != null) {
            ew0Var.l(ns0Var2, new v31() { // from class: rb
                @Override // defpackage.v31
                public final void a(Object obj) {
                    int i3 = i2;
                    b9 b9Var2 = b9Var;
                    switch (i3) {
                        case 0:
                            b9Var2.run();
                            break;
                        default:
                            b9Var2.run();
                            break;
                    }
                }
            });
        }
        b9Var.run();
        return ew0Var;
    }
}
