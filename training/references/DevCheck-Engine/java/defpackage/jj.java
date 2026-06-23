package defpackage;

import android.app.Application;
import android.content.Context;
import flar2.devcheck.MainApp;
import flar2.devcheck.benchmarkSuite.history.BenchmarkHistoryDb;
import flar2.devcheck.sensors.JCZI.nyGJ;

/* loaded from: classes.dex */
public final class jj extends a4 {
    public final yf c;
    public final yh d;
    public final fh e;
    public final qf1 f;

    public jj(Application application) {
        super(application);
        MainApp mainApp = (MainApp) application;
        yh yhVar = mainApp.g;
        this.c = (yf) yhVar.i;
        this.d = (yh) yhVar.j;
        this.e = fh.u(application);
        this.f = (qf1) mainApp.g.k;
    }

    public final xg1 d() {
        zg x = ((BenchmarkHistoryDb) this.e.i).x();
        x.getClass();
        gh1 a2 = gh1.a(0, nyGJ.UqEqFNkrBNWyS);
        en0 j = ((dh1) x.g).j();
        String[] strArr = {"subtest_value", "benchmark_run"};
        yg ygVar = new yg(x, a2, 0);
        j.b.g(strArr);
        xi0 xi0Var = j.g;
        xi0Var.getClass();
        return new xg1((dh1) xi0Var.g, xi0Var, true, strArr, ygVar);
    }

    public final void e() {
        yf yfVar = this.c;
        synchronized (yfVar.d) {
            try {
                Thread thread = (Thread) yfVar.f;
                if (thread != null) {
                    thread.interrupt();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        yf yfVar = this.c;
        synchronized (yfVar.d) {
            try {
                Thread thread = (Thread) yfVar.f;
                if (thread == null || !thread.isAlive()) {
                    ((qy0) yfVar.c).k(pi.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        yf yfVar = this.c;
        synchronized (yfVar.d) {
            try {
                Thread thread = (Thread) yfVar.f;
                if (thread == null || !thread.isAlive()) {
                    r30 a2 = r30.a((Context) yfVar.b);
                    long currentTimeMillis = System.currentTimeMillis();
                    mi b = pi.a().b();
                    int i = 2;
                    b.f634a = 2;
                    b.b = a2;
                    b.c = currentTimeMillis;
                    pi piVar = new pi(b);
                    synchronized (yfVar.d) {
                        yfVar.e = piVar;
                    }
                    ((qy0) yfVar.c).k(piVar);
                    gy1 gy1Var = new gy1((Context) yfVar.b, currentTimeMillis, new p8(i, yfVar));
                    yfVar.g = gy1Var;
                    if (gy1Var.c == null) {
                        gy1Var.d = false;
                        gy1Var.c = new Thread(new oo1(7, gy1Var), "benchmark-thermal-sampler");
                        gy1Var.c.setPriority(1);
                        gy1Var.c.start();
                    }
                    Thread thread2 = new Thread(new l2(11, yfVar), "benchmark-runner");
                    yfVar.f = thread2;
                    thread2.setPriority(5);
                    ((Thread) yfVar.f).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
