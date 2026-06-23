package defpackage;

import android.os.Process;
import android.os.SystemClock;
import flar2.devcheck.benchmarkSuite.history.BenchmarkHistoryDb;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class dh implements Runnable {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;

    public /* synthetic */ dh(long j, CountDownLatch countDownLatch) {
        this.h = j;
        this.i = countDownLatch;
    }

    public /* synthetic */ dh(fh fhVar, long j) {
        this.i = fhVar;
        this.h = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        Object obj = this.i;
        long j = this.h;
        switch (i) {
            case 0:
                zg x = ((BenchmarkHistoryDb) ((fh) obj).i).x();
                dh1 dh1Var = (dh1) x.g;
                dh1Var.b();
                h8 h8Var = (h8) x.j;
                ze0 a2 = h8Var.a();
                a2.d(1, j);
                try {
                    dh1Var.c();
                    try {
                        a2.e();
                        dh1Var.v();
                        return;
                    } finally {
                        dh1Var.r();
                    }
                } finally {
                    h8Var.c(a2);
                }
            default:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                try {
                    Process.setThreadPriority(-1);
                } catch (Throwable unused) {
                }
                do {
                    for (int i2 = 0; i2 < 10000; i2++) {
                        double d = i2;
                        Math.sin(d);
                        Math.cos(d);
                    }
                } while (SystemClock.elapsedRealtime() < j);
                countDownLatch.countDown();
                return;
        }
    }
}
