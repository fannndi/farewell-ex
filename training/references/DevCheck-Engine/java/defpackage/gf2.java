package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gf2 extends ef2 {
    public final /* synthetic */ nv1 h;
    public final /* synthetic */ pe2 i;
    public final /* synthetic */ vd2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf2(vd2 vd2Var, nv1 nv1Var, nv1 nv1Var2, pe2 pe2Var) {
        super(nv1Var);
        this.h = nv1Var2;
        this.i = pe2Var;
        Objects.requireNonNull(vd2Var);
        this.j = vd2Var;
    }

    @Override // defpackage.ef2
    public final void b() {
        vd2 vd2Var = this.j;
        synchronized (vd2Var.f) {
            try {
                nv1 nv1Var = this.h;
                vd2Var.e.add(nv1Var);
                nv1Var.f703a.a(new kp(vd2Var, 13, nv1Var));
                if (vd2Var.l.getAndIncrement() > 0) {
                    vd2Var.b.b("Already connected to the service.", new Object[0]);
                }
                vd2.b(vd2Var, this.i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
