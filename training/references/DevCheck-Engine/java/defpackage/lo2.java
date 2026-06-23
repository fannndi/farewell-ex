package defpackage;

/* loaded from: classes.dex */
public final class lo2 extends xc1 {
    @Override // defpackage.xc1
    public final void M(oo2 oo2Var, oo2 oo2Var2) {
        oo2Var.b = oo2Var2;
    }

    @Override // defpackage.xc1
    public final void N(oo2 oo2Var, Thread thread) {
        oo2Var.f750a = thread;
    }

    @Override // defpackage.xc1
    public final boolean O(ro2 ro2Var, um2 um2Var, um2 um2Var2) {
        synchronized (ro2Var) {
            try {
                if (ro2Var.h != um2Var) {
                    return false;
                }
                ro2Var.h = um2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xc1
    public final boolean P(ro2 ro2Var, Object obj, Object obj2) {
        synchronized (ro2Var) {
            try {
                if (ro2Var.g != obj) {
                    return false;
                }
                ro2Var.g = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.xc1
    public final boolean Q(ro2 ro2Var, oo2 oo2Var, oo2 oo2Var2) {
        synchronized (ro2Var) {
            try {
                if (ro2Var.i != oo2Var) {
                    return false;
                }
                ro2Var.i = oo2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
