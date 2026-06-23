package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class kk0 extends aa {
    public final /* synthetic */ lk0 n;

    public kk0(lk0 lk0Var) {
        this.n = lk0Var;
    }

    @Override // defpackage.aa
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // defpackage.aa
    public final void k() {
        this.n.f(j90.n);
        ek0 ek0Var = this.n.h;
        synchronized (ek0Var) {
            long j = ek0Var.t;
            long j2 = ek0Var.s;
            if (j < j2) {
                return;
            }
            ek0Var.s = j2 + 1;
            ek0Var.u = System.nanoTime() + 1000000000;
            iw1.b(ek0Var.n, d51.u(new StringBuilder(), ek0Var.i, " ping"), new qt(4, ek0Var));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
