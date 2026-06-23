package defpackage;

import java.util.concurrent.Executor;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ql2 implements v41, s41 {
    public final /* synthetic */ int g;
    public final Executor h;
    public final Object i;
    public final Object j;

    public ql2(Executor executor, o41 o41Var) {
        this.g = 1;
        this.i = new Object();
        this.h = executor;
        this.j = o41Var;
    }

    public ql2(Executor executor, ql2 ql2Var) {
        this.g = 0;
        this.i = new Object();
        this.h = executor;
        this.j = ql2Var;
    }

    public ql2(Executor executor, s41 s41Var) {
        this.g = 2;
        this.i = new Object();
        this.h = executor;
        this.j = s41Var;
    }

    public ql2(Executor executor, u40 u40Var, xo2 xo2Var) {
        this.g = 4;
        this.h = executor;
        this.i = u40Var;
        this.j = xo2Var;
    }

    public ql2(Executor executor, v41 v41Var) {
        this.g = 3;
        this.i = new Object();
        this.h = executor;
        this.j = v41Var;
    }

    public void a() {
        xo2 xo2Var = (xo2) this.j;
        synchronized (xo2Var.f1192a) {
            try {
                if (xo2Var.c) {
                    return;
                }
                xo2Var.c = true;
                xo2Var.d = true;
                xo2Var.b.f(xo2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(xo2 xo2Var) {
        boolean z = false;
        switch (this.g) {
            case 0:
                if (xo2Var.d) {
                    synchronized (this.i) {
                    }
                    this.h.execute(new f52(10, this));
                    return;
                }
                return;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                synchronized (this.i) {
                }
                this.h.execute(new hk2(this, xo2Var, 22, z));
                return;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                if (xo2Var.d() || xo2Var.d) {
                    return;
                }
                synchronized (this.i) {
                }
                this.h.execute(new hk2(this, xo2Var, 23, z));
                return;
            case 3:
                if (xo2Var.d()) {
                    synchronized (this.i) {
                    }
                    this.h.execute(new hk2(this, xo2Var, 24, z));
                    return;
                }
                return;
            default:
                this.h.execute(new hk2(this, xo2Var, 25, z));
                return;
        }
    }

    @Override // defpackage.v41
    public void i(Object obj) {
        ((xo2) this.j).f(obj);
    }

    @Override // defpackage.s41
    public void j(Exception exc) {
        ((xo2) this.j).e(exc);
    }
}
