package defpackage;

/* loaded from: classes.dex */
public abstract class sx extends p implements ox {
    public static final rx h = new rx(j70.i, new ub(1));

    public sx() {
        super(j70.i);
    }

    public abstract void D(qx qxVar, Runnable runnable);

    public void E(qx qxVar, Runnable runnable) {
        D(qxVar, runnable);
    }

    public boolean F(qx qxVar) {
        return !(this instanceof y32);
    }

    public sx G(int i) {
        ym0.c(i);
        return new lq0(this, i);
    }

    @Override // defpackage.p, defpackage.qx
    public final ox r(px pxVar) {
        ox oxVar;
        pxVar.getClass();
        if (pxVar instanceof rx) {
            rx rxVar = (rx) pxVar;
            px pxVar2 = this.g;
            if ((pxVar2 == rxVar || rxVar.h == pxVar2) && (oxVar = (ox) rxVar.g.j(this)) != null) {
                return oxVar;
            }
        } else if (j70.i == pxVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + d10.r(this);
    }

    @Override // defpackage.p, defpackage.qx
    public final qx v(px pxVar) {
        pxVar.getClass();
        if (pxVar instanceof rx) {
            rx rxVar = (rx) pxVar;
            px pxVar2 = this.g;
            if ((pxVar2 != rxVar && rxVar.h != pxVar2) || ((ox) rxVar.g.j(this)) == null) {
                return this;
            }
        } else if (j70.i != pxVar) {
            return this;
        }
        return n80.g;
    }
}
