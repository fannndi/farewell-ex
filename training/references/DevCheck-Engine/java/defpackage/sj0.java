package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class sj0 extends pj0 {
    public long k;
    public final /* synthetic */ uj0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj0(uj0 uj0Var, ok0 ok0Var, long j) {
        super(uj0Var, ok0Var);
        ok0Var.getClass();
        this.l = uj0Var;
        this.k = j;
        if (j == 0) {
            a(ui0.h);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.i) {
            return;
        }
        if (this.k != 0) {
            TimeZone timeZone = rd2.f888a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = rd2.f(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.l.b.h();
                a(uj0.f);
            }
        }
        this.i = true;
    }

    @Override // defpackage.pj0, defpackage.lp1
    public final long g(long j, wl wlVar) {
        if (this.i) {
            c.n("closed");
            return 0L;
        }
        long j2 = this.k;
        if (j2 == 0) {
            return -1L;
        }
        long g = super.g(Math.min(j2, 8192L), wlVar);
        if (g == -1) {
            this.l.b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(uj0.f);
            throw protocolException;
        }
        long j3 = this.k - g;
        this.k = j3;
        if (j3 == 0) {
            a(ui0.h);
        }
        return g;
    }
}
