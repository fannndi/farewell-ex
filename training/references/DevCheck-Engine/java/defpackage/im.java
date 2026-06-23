package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class im implements xt1 {
    public long g = Math.max(500L, 2000L);

    public wn1 a(String... strArr) {
        try {
            TextUtils.join(" ", strArr);
            try {
                wn1 wn1Var = new wn1(this, Runtime.getRuntime().exec(strArr));
                synchronized (rt0.class) {
                    if (rt0.b) {
                        wn1[] wn1VarArr = rt0.f907a;
                        synchronized (wn1VarArr) {
                            wn1VarArr[0] = wn1Var;
                        }
                    }
                }
                return wn1Var;
            } catch (IOException e) {
                throw new w21("Unable to create a shell!", e);
            }
        } catch (IOException e2) {
            throw new w21("Unable to create a shell!", e2);
        }
    }

    @Override // defpackage.xt1
    public void d() {
        int min = Math.min(Math.max(1, Runtime.getRuntime().availableProcessors()) * 2, 8);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.g;
        long j2 = elapsedRealtime + j;
        CountDownLatch countDownLatch = new CountDownLatch(min);
        for (int i = 0; i < min; i++) {
            Thread thread = new Thread(new dh(j2, countDownLatch), d51.q("DevCheck-Cal-CPU-", i));
            thread.setDaemon(true);
            thread.start();
        }
        try {
            countDownLatch.await(j + 2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
    }
}
