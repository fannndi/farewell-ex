package defpackage;

/* loaded from: classes.dex */
public final class dq1 implements dx, ay {
    public final dx g;
    public final qx h;

    public dq1(dx dxVar, qx qxVar) {
        this.g = dxVar;
        this.h = qxVar;
    }

    @Override // defpackage.ay
    public final ay c() {
        dx dxVar = this.g;
        if (dxVar instanceof ay) {
            return (ay) dxVar;
        }
        return null;
    }

    @Override // defpackage.dx
    public final qx d() {
        return this.h;
    }

    @Override // defpackage.dx
    public final void g(Object obj) {
        this.g.g(obj);
    }
}
