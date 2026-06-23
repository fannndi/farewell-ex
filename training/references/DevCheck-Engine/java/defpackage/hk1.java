package defpackage;

/* loaded from: classes.dex */
public class hk1 extends o implements ay {
    public final dx l;

    public hk1(dx dxVar, qx qxVar) {
        super(qxVar, true);
        this.l = dxVar;
    }

    @Override // defpackage.bo0
    public final boolean O() {
        return true;
    }

    @Override // defpackage.ay
    public final ay c() {
        dx dxVar = this.l;
        if (dxVar instanceof ay) {
            return (ay) dxVar;
        }
        return null;
    }

    @Override // defpackage.bo0
    public void p(Object obj) {
        a50.a(ju0.T(this.l), sl.e0(obj));
    }

    @Override // defpackage.bo0
    public void q(Object obj) {
        this.l.g(sl.e0(obj));
    }
}
