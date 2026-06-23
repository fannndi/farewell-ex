package defpackage;

/* loaded from: classes.dex */
public abstract class ex extends qd {
    public final qx h;
    public transient dx i;

    public ex(dx dxVar) {
        this(dxVar, dxVar != null ? dxVar.d() : null);
    }

    public ex(dx dxVar, qx qxVar) {
        super(dxVar);
        this.h = qxVar;
    }

    @Override // defpackage.dx
    public qx d() {
        qx qxVar = this.h;
        qxVar.getClass();
        return qxVar;
    }

    @Override // defpackage.qd
    public void p() {
        dx dxVar = this.i;
        if (dxVar != null && dxVar != this) {
            ox r = d().r(j70.i);
            r.getClass();
            z40 z40Var = (z40) dxVar;
            z40Var.m();
            ao p = z40Var.p();
            if (p != null) {
                p.r();
            }
        }
        this.i = nt.h;
    }
}
