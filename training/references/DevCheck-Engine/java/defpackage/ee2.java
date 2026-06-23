package defpackage;

import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;

/* loaded from: classes.dex */
public final class ee2 implements ge2 {
    public static final Object i = new Object();
    public volatile fe2 g;
    public volatile Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public static ee2 a(fe2 fe2Var) {
        if (fe2Var instanceof ee2) {
            return (ee2) fe2Var;
        }
        ee2 ee2Var = new ee2();
        ee2Var.h = i;
        ee2Var.g = fe2Var;
        return ee2Var;
    }

    @Override // defpackage.ge2
    public final Object b() {
        Object obj = this.h;
        Object obj2 = i;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.h;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object b = this.g.b();
                Object obj4 = this.h;
                if (obj4 != obj2 && obj4 != b) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + b + CGvJMCDBOmCdj.FdZIveDNOp);
                }
                this.h = b;
                this.g = null;
                return b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
