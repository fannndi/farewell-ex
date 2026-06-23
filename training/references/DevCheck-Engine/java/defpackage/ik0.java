package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class ik0 implements ap1 {
    public final boolean g;
    public final wl h = new wl();
    public boolean i;
    public final /* synthetic */ lk0 j;

    public ik0(lk0 lk0Var, boolean z) {
        this.j = lk0Var;
        this.g = z;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z) {
        long min;
        boolean z2;
        lk0 lk0Var = this.j;
        synchronized (lk0Var) {
            lk0Var.q.h();
            while (lk0Var.j >= lk0Var.k && !this.g && !this.i && lk0Var.g() == null) {
                try {
                    try {
                        lk0Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    lk0Var.q.l();
                    throw th;
                }
            }
            lk0Var.q.l();
            lk0Var.c();
            min = Math.min(lk0Var.k - lk0Var.j, this.h.h);
            lk0Var.j += min;
            z2 = z && min == this.h.h;
        }
        this.j.q.h();
        try {
            lk0 lk0Var2 = this.j;
            lk0Var2.h.o(lk0Var2.g, z2, this.h, min);
        } finally {
            this.j.q.l();
        }
    }

    @Override // defpackage.ap1
    public final bz1 c() {
        return this.j.q;
    }

    @Override // defpackage.ap1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        lk0 lk0Var = this.j;
        TimeZone timeZone = rd2.f888a;
        synchronized (lk0Var) {
            if (this.i) {
                return;
            }
            boolean z = lk0Var.g() == null;
            lk0 lk0Var2 = this.j;
            if (!lk0Var2.o.g) {
                if (this.h.h > 0) {
                    while (this.h.h > 0) {
                        a(true);
                    }
                } else if (z) {
                    lk0Var2.h.o(lk0Var2.g, true, null, 0L);
                }
            }
            lk0 lk0Var3 = this.j;
            synchronized (lk0Var3) {
                this.i = true;
                lk0Var3.notifyAll();
            }
            this.j.h.flush();
            this.j.a();
        }
    }

    @Override // defpackage.ap1, java.io.Flushable
    public final void flush() {
        lk0 lk0Var = this.j;
        TimeZone timeZone = rd2.f888a;
        synchronized (lk0Var) {
            lk0Var.c();
        }
        while (this.h.h > 0) {
            a(false);
            this.j.h.flush();
        }
    }

    @Override // defpackage.ap1
    public final void q(long j, wl wlVar) {
        TimeZone timeZone = rd2.f888a;
        wl wlVar2 = this.h;
        wlVar2.q(j, wlVar);
        while (wlVar2.h >= 16384) {
            a(false);
        }
    }
}
