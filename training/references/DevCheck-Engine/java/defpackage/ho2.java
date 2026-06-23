package defpackage;

/* loaded from: classes.dex */
public final class ho2 extends wm2 {
    public final /* synthetic */ nv1 h;
    public final /* synthetic */ pk2 i;
    public final /* synthetic */ vo2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho2(vo2 vo2Var, nv1 nv1Var, nv1 nv1Var2, pk2 pk2Var) {
        super(nv1Var);
        this.h = nv1Var2;
        this.i = pk2Var;
        this.j = vo2Var;
    }

    @Override // defpackage.wm2
    public final void a() {
        synchronized (this.j.f) {
            try {
                vo2 vo2Var = this.j;
                nv1 nv1Var = this.h;
                vo2Var.e.add(nv1Var);
                nv1Var.f703a.a(new kp(vo2Var, 15, nv1Var));
                if (this.j.k.getAndIncrement() > 0) {
                    this.j.b.b("Already connected to the service.", new Object[0]);
                }
                vo2.b(this.j, this.i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
