package defpackage;

/* loaded from: classes.dex */
public final class d0 extends rt0 {
    @Override // defpackage.rt0
    public final void A(e0 e0Var, Thread thread) {
        e0Var.f214a = thread;
    }

    @Override // defpackage.rt0
    public final boolean b(f0 f0Var, b0 b0Var, b0 b0Var2) {
        synchronized (f0Var) {
            try {
                if (f0Var.h != b0Var) {
                    return false;
                }
                f0Var.h = b0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rt0
    public final boolean c(f0 f0Var, Object obj, Object obj2) {
        synchronized (f0Var) {
            try {
                if (f0Var.g != obj) {
                    return false;
                }
                f0Var.g = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rt0
    public final boolean d(f0 f0Var, e0 e0Var, e0 e0Var2) {
        synchronized (f0Var) {
            try {
                if (f0Var.i != e0Var) {
                    return false;
                }
                f0Var.i = e0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rt0
    public final void z(e0 e0Var, e0 e0Var2) {
        e0Var.b = e0Var2;
    }
}
