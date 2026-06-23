package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ad1 implements Runnable {
    public final jn g;
    public volatile AtomicInteger h = new AtomicInteger(0);
    public final /* synthetic */ dd1 i;

    public ad1(dd1 dd1Var, jn jnVar) {
        this.i = dd1Var;
        this.g = jnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gr grVar;
        String concat = "OkHttp ".concat(((ok0) this.i.h.b).g());
        dd1 dd1Var = this.i;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            dd1Var.k.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.g.m(dd1Var.g());
                        grVar = dd1Var.g.f8a;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            q71 q71Var = q71.f821a;
                            q71.f821a.i(4, "Callback failure for ".concat(dd1.a(dd1Var)));
                        } else {
                            this.g.h(e);
                        }
                        grVar = dd1Var.g.f8a;
                        grVar.getClass();
                        gr.z(grVar, null, this, 3);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        dd1Var.d();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.g.h(iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        grVar = dd1Var.g.f8a;
                        grVar.getClass();
                        gr.z(grVar, null, this, 3);
                    }
                } catch (Throwable th2) {
                    gr grVar2 = dd1Var.g.f8a;
                    grVar2.getClass();
                    gr.z(grVar2, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            grVar.getClass();
            gr.z(grVar, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
