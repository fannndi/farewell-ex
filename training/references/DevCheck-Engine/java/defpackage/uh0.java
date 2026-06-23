package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class uh0 implements ap1 {
    public final yc1 g;
    public final Deflater h;
    public final p20 i;
    public boolean j;
    public final CRC32 k;

    public uh0(yc1 yc1Var) {
        yc1 yc1Var2 = new yc1(yc1Var);
        this.g = yc1Var2;
        Deflater deflater = new Deflater(-1, true);
        this.h = deflater;
        this.i = new p20(yc1Var2, deflater);
        this.k = new CRC32();
        wl wlVar = yc1Var2.h;
        wlVar.M(8075);
        wlVar.I(8);
        wlVar.I(0);
        wlVar.L(0);
        wlVar.I(0);
        wlVar.I(0);
    }

    @Override // defpackage.ap1
    public final bz1 c() {
        return this.g.g.c();
    }

    @Override // defpackage.ap1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int value;
        boolean z;
        wl wlVar;
        Deflater deflater = this.h;
        yc1 yc1Var = this.g;
        if (this.j) {
            return;
        }
        try {
            p20 p20Var = this.i;
            ((Deflater) p20Var.j).finish();
            p20Var.a(false);
            value = (int) this.k.getValue();
            z = yc1Var.i;
            wlVar = yc1Var.h;
        } catch (Throwable th) {
            th = th;
        }
        if (z) {
            throw new IllegalStateException("closed");
        }
        wlVar.L(je2.P(value));
        yc1Var.a();
        int bytesRead = (int) deflater.getBytesRead();
        if (yc1Var.i) {
            throw new IllegalStateException("closed");
        }
        wlVar.L(je2.P(bytesRead));
        yc1Var.a();
        th = null;
        try {
            deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            yc1Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.j = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.ap1, java.io.Flushable
    public final void flush() {
        this.i.flush();
    }

    @Override // defpackage.ap1
    public final void q(long j, wl wlVar) {
        if (j < 0) {
            c.j("byteCount < 0: ", j);
            return;
        }
        if (j == 0) {
            return;
        }
        ml1 ml1Var = wlVar.g;
        ml1Var.getClass();
        long j2 = j;
        while (j2 > 0) {
            int min = (int) Math.min(j2, ml1Var.c - ml1Var.b);
            this.k.update(ml1Var.f640a, ml1Var.b, min);
            j2 -= min;
            ml1Var = ml1Var.f;
            ml1Var.getClass();
        }
        this.i.q(j, wlVar);
    }
}
