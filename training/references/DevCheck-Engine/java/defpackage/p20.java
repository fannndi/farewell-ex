package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class p20 implements ap1 {
    public final /* synthetic */ int g = 1;
    public boolean h;
    public final Object i;
    public final Object j;

    public p20(uj0 uj0Var) {
        this.j = uj0Var;
        this.i = new gd0(((yc1) uj0Var.c.j).g.c());
    }

    public p20(yc1 yc1Var, Deflater deflater) {
        this.i = yc1Var;
        this.j = deflater;
    }

    public void a(boolean z) {
        ml1 E;
        int deflate;
        Deflater deflater = (Deflater) this.j;
        yc1 yc1Var = (yc1) this.i;
        wl wlVar = yc1Var.h;
        while (true) {
            E = wlVar.E(1);
            byte[] bArr = E.f640a;
            int i = E.c;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (IllegalStateException e) {
                    throw new IOException("Deflater already closed", e);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                E.c += deflate;
                wlVar.h += deflate;
                yc1Var.a();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (E.b == E.c) {
            wlVar.g = E.a();
            ol1.a(E);
        }
    }

    @Override // defpackage.ap1
    public final bz1 c() {
        int i = this.g;
        Object obj = this.i;
        switch (i) {
            case 0:
                return ((yc1) obj).g.c();
            default:
                return (gd0) obj;
        }
    }

    @Override // defpackage.ap1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.g;
        Object obj = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj2;
                if (this.h) {
                    return;
                }
                try {
                    deflater.finish();
                    a(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((yc1) obj).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.h = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                uj0 uj0Var = (uj0) obj2;
                if (this.h) {
                    return;
                }
                this.h = true;
                gd0 gd0Var = (gd0) obj;
                bz1 bz1Var = gd0Var.e;
                gd0Var.e = bz1.d;
                bz1Var.a();
                bz1Var.b();
                uj0Var.d = 3;
                return;
        }
    }

    @Override // defpackage.ap1, java.io.Flushable
    public final void flush() {
        switch (this.g) {
            case 0:
                a(true);
                ((yc1) this.i).flush();
                break;
            default:
                if (!this.h) {
                    ((yc1) ((uj0) this.j).c.j).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ap1
    public final void q(long j, wl wlVar) {
        int i = this.g;
        Object obj = this.j;
        switch (i) {
            case 0:
                Deflater deflater = (Deflater) obj;
                je2.g(wlVar.h, 0L, j);
                long j2 = j;
                while (j2 > 0) {
                    ml1 ml1Var = wlVar.g;
                    ml1Var.getClass();
                    int min = (int) Math.min(j2, ml1Var.c - ml1Var.b);
                    deflater.setInput(ml1Var.f640a, ml1Var.b, min);
                    a(false);
                    long j3 = min;
                    wlVar.h -= j3;
                    int i2 = ml1Var.b + min;
                    ml1Var.b = i2;
                    if (i2 == ml1Var.c) {
                        wlVar.g = ml1Var.a();
                        ol1.a(ml1Var);
                    }
                    j2 -= j3;
                }
                deflater.setInput(kk1.f, 0, 0);
                break;
            default:
                if (!this.h) {
                    pd2.a(wlVar.h, 0L, j);
                    ((yc1) ((uj0) obj).c.j).q(j, wlVar);
                    break;
                } else {
                    c.n("closed");
                    break;
                }
        }
    }

    public String toString() {
        switch (this.g) {
            case 0:
                return "DeflaterSink(" + ((yc1) this.i) + ')';
            default:
                return super.toString();
        }
    }
}
