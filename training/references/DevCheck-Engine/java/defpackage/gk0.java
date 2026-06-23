package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class gk0 implements lp1 {
    public final fm g;
    public int h;
    public int i;
    public int j;
    public int k;

    public gk0(fm fmVar) {
        fmVar.getClass();
        this.g = fmVar;
    }

    @Override // defpackage.lp1
    public final bz1 c() {
        return this.g.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.lp1
    public final long g(long j, wl wlVar) {
        int i;
        int readInt;
        do {
            int i2 = this.j;
            fm fmVar = this.g;
            if (i2 == 0) {
                fmVar.skip(this.k);
                this.k = 0;
                if ((this.h & 4) == 0) {
                    i = this.i;
                    int l = pd2.l(fmVar);
                    this.j = l;
                    int readByte = fmVar.readByte() & 255;
                    this.h = fmVar.readByte() & 255;
                    Logger logger = hk0.j;
                    if (logger.isLoggable(Level.FINE)) {
                        km kmVar = vj0.f1088a;
                        logger.fine(vj0.b(true, this.i, l, readByte, this.h));
                    }
                    readInt = fmVar.readInt() & Integer.MAX_VALUE;
                    this.i = readInt;
                    if (readByte != 9) {
                        rw.f(d51.o(readByte, " != TYPE_CONTINUATION"));
                        return 0L;
                    }
                }
            } else {
                long g = fmVar.g(Math.min(8192L, i2), wlVar);
                if (g != -1) {
                    this.j -= (int) g;
                    return g;
                }
            }
            return -1L;
        } while (readInt == i);
        rw.f("TYPE_CONTINUATION streamId changed");
        return 0L;
    }
}
