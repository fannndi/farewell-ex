package defpackage;

/* loaded from: classes.dex */
public class tn0 extends bo0 {
    public final boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn0(rn0 rn0Var) {
        super(true);
        boolean z = true;
        L(rn0Var);
        xp H = H();
        yp ypVar = H instanceof yp ? (yp) H : null;
        if (ypVar != null) {
            bo0 q = ypVar.q();
            while (!q.E()) {
                xp H2 = q.H();
                yp ypVar2 = H2 instanceof yp ? (yp) H2 : null;
                if (ypVar2 != null) {
                    q = ypVar2.q();
                }
            }
            this.k = z;
        }
        z = false;
        this.k = z;
    }

    @Override // defpackage.bo0
    public final boolean E() {
        return this.k;
    }

    @Override // defpackage.bo0
    public final boolean F() {
        return true;
    }
}
