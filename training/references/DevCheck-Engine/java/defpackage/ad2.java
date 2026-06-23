package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class ad2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22a = 0;

    static {
        ai1.k("WorkerWrapper");
    }

    public static final Object a(bs0 bs0Var, is0 is0Var, nt1 nt1Var) {
        Object obj;
        try {
            boolean z = false;
            if (!bs0Var.isDone()) {
                ao aoVar = new ao(1, ju0.T(nt1Var));
                aoVar.x();
                bs0Var.a(new iz1(bs0Var, aoVar, 0), r40.g);
                aoVar.z(new zc2(is0Var, bs0Var));
                return aoVar.v();
            }
            while (true) {
                try {
                    obj = bs0Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
