package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class km0 implements lp1 {
    public final InputStream g;
    public final bz1 h;

    public km0(InputStream inputStream, bz1 bz1Var) {
        this.g = inputStream;
        this.h = bz1Var;
    }

    @Override // defpackage.lp1
    public final bz1 c() {
        return this.h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    @Override // defpackage.lp1
    public final long g(long j, wl wlVar) {
        try {
            this.h.f();
            ml1 E = wlVar.E(1);
            int read = this.g.read(E.f640a, E.c, (int) Math.min(8192L, 8192 - E.c));
            if (read != -1) {
                E.c += read;
                long j2 = read;
                wlVar.h += j2;
                return j2;
            }
            if (E.b != E.c) {
                return -1L;
            }
            wlVar.g = E.a();
            ol1.a(E);
            return -1L;
        } catch (AssertionError e) {
            if (od2.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        return "source(" + this.g + ')';
    }
}
