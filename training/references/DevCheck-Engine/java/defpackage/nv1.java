package defpackage;

/* loaded from: classes.dex */
public final class nv1 {

    /* renamed from: a, reason: collision with root package name */
    public final xo2 f703a = new xo2();

    public final void a(Exception exc) {
        xo2 xo2Var = this.f703a;
        xo2Var.getClass();
        xc1.k("Exception must not be null", exc);
        synchronized (xo2Var.f1192a) {
            try {
                if (xo2Var.c) {
                    return;
                }
                xo2Var.c = true;
                xo2Var.f = exc;
                xo2Var.b.f(xo2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        xo2 xo2Var = this.f703a;
        synchronized (xo2Var.f1192a) {
            try {
                if (xo2Var.c) {
                    return;
                }
                xo2Var.c = true;
                xo2Var.e = obj;
                xo2Var.b.f(xo2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
