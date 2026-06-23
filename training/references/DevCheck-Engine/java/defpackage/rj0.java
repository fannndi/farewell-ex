package defpackage;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rj0 extends pj0 {
    public long k;
    public boolean l;
    public final /* synthetic */ uj0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(uj0 uj0Var, ok0 ok0Var) {
        super(uj0Var, ok0Var);
        ok0Var.getClass();
        this.m = uj0Var;
        this.k = -1L;
        this.l = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.i) {
            return;
        }
        if (this.l) {
            TimeZone timeZone = rd2.f888a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = rd2.f(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.m.b.h();
                a(uj0.f);
            }
        }
        this.i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bc, code lost:
    
        if (r16.l == false) goto L46;
     */
    @Override // defpackage.pj0, defpackage.lp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(long r17, defpackage.wl r19) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj0.g(long, wl):long");
    }
}
