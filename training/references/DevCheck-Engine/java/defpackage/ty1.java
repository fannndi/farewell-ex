package defpackage;

/* loaded from: classes.dex */
public final class ty1 implements ox {
    public final Object g;
    public final ThreadLocal h;
    public final vy1 i;

    public ty1(d81 d81Var, ThreadLocal threadLocal) {
        this.g = d81Var;
        this.h = threadLocal;
        this.i = new vy1(threadLocal);
    }

    @Override // defpackage.ox
    public final px getKey() {
        return this.i;
    }

    @Override // defpackage.qx
    public final Object m(Object obj, pf0 pf0Var) {
        return pf0Var.f(obj, this);
    }

    @Override // defpackage.qx
    public final qx o(qx qxVar) {
        return bw0.w(this, qxVar);
    }

    @Override // defpackage.qx
    public final ox r(px pxVar) {
        if (this.i.equals(pxVar)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.g + ", threadLocal = " + this.h + ')';
    }

    @Override // defpackage.qx
    public final qx v(px pxVar) {
        return this.i.equals(pxVar) ? n80.g : this;
    }
}
