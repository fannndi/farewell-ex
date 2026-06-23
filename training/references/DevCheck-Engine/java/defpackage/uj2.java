package defpackage;

/* loaded from: classes.dex */
public final class uj2 extends ym0 {
    @Override // defpackage.ym0
    public final rj2 E(zj2 zj2Var) {
        rj2 rj2Var;
        rj2 rj2Var2 = rj2.d;
        synchronized (zj2Var) {
            try {
                rj2Var = zj2Var.h;
                if (rj2Var != rj2Var2) {
                    zj2Var.h = rj2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rj2Var;
    }

    @Override // defpackage.ym0
    public final yj2 F(zj2 zj2Var) {
        yj2 yj2Var;
        yj2 yj2Var2 = yj2.c;
        synchronized (zj2Var) {
            try {
                yj2Var = zj2Var.i;
                if (yj2Var != yj2Var2) {
                    zj2Var.i = yj2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yj2Var;
    }

    @Override // defpackage.ym0
    public final void G(yj2 yj2Var, yj2 yj2Var2) {
        yj2Var.b = yj2Var2;
    }

    @Override // defpackage.ym0
    public final void H(yj2 yj2Var, Thread thread) {
        yj2Var.f1234a = thread;
    }

    @Override // defpackage.ym0
    public final boolean I(zj2 zj2Var, rj2 rj2Var, rj2 rj2Var2) {
        synchronized (zj2Var) {
            try {
                if (zj2Var.h != rj2Var) {
                    return false;
                }
                zj2Var.h = rj2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ym0
    public final boolean J(zj2 zj2Var, Object obj, Object obj2) {
        synchronized (zj2Var) {
            try {
                if (zj2Var.g != obj) {
                    return false;
                }
                zj2Var.g = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ym0
    public final boolean K(zj2 zj2Var, yj2 yj2Var, yj2 yj2Var2) {
        synchronized (zj2Var) {
            try {
                if (zj2Var.i != yj2Var) {
                    return false;
                }
                zj2Var.i = yj2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
