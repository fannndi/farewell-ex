package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class dm0 implements lp1 {
    public final zc1 g;
    public final Inflater h;
    public int i;
    public boolean j;

    public dm0(zc1 zc1Var, Inflater inflater) {
        this.g = zc1Var;
        this.h = inflater;
    }

    @Override // defpackage.lp1
    public final bz1 c() {
        return this.g.g.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.j) {
            return;
        }
        this.h.end();
        this.j = true;
        this.g.close();
    }

    @Override // defpackage.lp1
    public final long g(long j, wl wlVar) {
        long j2;
        Inflater inflater = this.h;
        while (!this.j) {
            try {
                ml1 E = wlVar.E(1);
                int min = (int) Math.min(8192L, 8192 - E.c);
                boolean needsInput = inflater.needsInput();
                zc1 zc1Var = this.g;
                if (needsInput && !zc1Var.a()) {
                    ml1 ml1Var = zc1Var.h.g;
                    ml1Var.getClass();
                    int i = ml1Var.c;
                    int i2 = ml1Var.b;
                    int i3 = i - i2;
                    this.i = i3;
                    inflater.setInput(ml1Var.f640a, i2, i3);
                }
                int inflate = inflater.inflate(E.f640a, E.c, min);
                int i4 = this.i;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.i -= remaining;
                    zc1Var.skip(remaining);
                }
                if (inflate > 0) {
                    E.c += inflate;
                    j2 = inflate;
                    wlVar.h += j2;
                } else {
                    if (E.b == E.c) {
                        wlVar.g = E.a();
                        ol1.a(E);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (zc1Var.a()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        c.n("closed");
        return 0L;
    }
}
