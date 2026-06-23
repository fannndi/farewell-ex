package defpackage;

import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class iz1 implements Runnable {
    public final /* synthetic */ int g;
    public final bs0 h;
    public final ao i;

    public /* synthetic */ iz1(bs0 bs0Var, ao aoVar, int i) {
        this.g = i;
        this.h = bs0Var;
        this.i = aoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        ao aoVar = this.i;
        bs0 bs0Var = this.h;
        switch (i) {
            case 0:
                if (bs0Var.isCancelled()) {
                    aoVar.q(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = bs0Var.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            aoVar.g(obj);
                            return;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            aoVar.g(new pg1(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
            default:
                if (bs0Var.isCancelled()) {
                    aoVar.q(null);
                    return;
                }
                try {
                    aoVar.g(f0.g(bs0Var));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    cause2.getClass();
                    aoVar.g(new pg1(cause2));
                    return;
                }
        }
    }
}
