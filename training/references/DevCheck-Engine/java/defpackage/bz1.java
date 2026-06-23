package defpackage;

import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class bz1 {
    public static final az1 d = new az1();

    /* renamed from: a, reason: collision with root package name */
    public boolean f102a;
    public long b;
    public long c;

    public bz1 a() {
        this.f102a = false;
        return this;
    }

    public bz1 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.f102a) {
            return this.b;
        }
        c.n(ILBLnlCHDVqsSN.lYHqlFlgld);
        return 0L;
    }

    public bz1 d(long j) {
        this.f102a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.f102a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f102a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public bz1 g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        c.j("timeout < 0: ", j);
        return null;
    }
}
