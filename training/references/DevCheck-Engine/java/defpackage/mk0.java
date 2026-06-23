package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class mk0 implements Closeable {
    public static final Logger l = Logger.getLogger(vj0.class.getName());
    public final em g;
    public final wl h;
    public int i;
    public boolean j;
    public final nj0 k;

    public mk0(yc1 yc1Var) {
        yc1Var.getClass();
        this.g = yc1Var;
        wl wlVar = new wl();
        this.h = wlVar;
        this.i = rt0.z;
        this.k = new nj0(wlVar);
    }

    public final void a(ym1 ym1Var) {
        ym1Var.getClass();
        synchronized (this) {
            try {
                if (this.j) {
                    throw new IOException("closed");
                }
                int i = this.i;
                int i2 = ym1Var.f1239a;
                if ((i2 & 32) != 0) {
                    i = ym1Var.b[5];
                }
                this.i = i;
                if (((i2 & 2) != 0 ? ym1Var.b[1] : -1) != -1) {
                    nj0 nj0Var = this.k;
                    int i3 = (i2 & 2) != 0 ? ym1Var.b[1] : -1;
                    nj0Var.getClass();
                    int min = Math.min(i3, rt0.z);
                    int i4 = nj0Var.d;
                    if (i4 != min) {
                        if (min < i4) {
                            nj0Var.b = Math.min(nj0Var.b, min);
                        }
                        nj0Var.c = true;
                        nj0Var.d = min;
                        int i5 = nj0Var.h;
                        if (min < i5) {
                            if (min == 0) {
                                pi0[] pi0VarArr = nj0Var.e;
                                u9.l0(pi0VarArr, null, 0, pi0VarArr.length);
                                nj0Var.f = nj0Var.e.length - 1;
                                nj0Var.g = 0;
                                nj0Var.h = 0;
                            } else {
                                nj0Var.a(i5 - min);
                            }
                        }
                    }
                }
                j(0, 0, 4, 1);
                this.g.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.j = true;
            this.g.close();
        }
    }

    public final void e(boolean z, int i, wl wlVar, int i2) {
        synchronized (this) {
            if (this.j) {
                throw new IOException("closed");
            }
            j(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                em emVar = this.g;
                wlVar.getClass();
                emVar.q(i2, wlVar);
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.j) {
                throw new IOException("closed");
            }
            this.g.flush();
        }
    }

    public final void j(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = l;
            if (logger.isLoggable(level)) {
                logger.fine(vj0.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.i) {
            c.i("FRAME_SIZE_ERROR length > ", this.i, ": ", i2);
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            c.d(d51.q("reserved bit set: ", i));
            return;
        }
        byte[] bArr = pd2.f785a;
        em emVar = this.g;
        emVar.getClass();
        emVar.writeByte((i2 >>> 16) & 255);
        emVar.writeByte((i2 >>> 8) & 255);
        emVar.writeByte(i2 & 255);
        emVar.writeByte(i3 & 255);
        emVar.writeByte(i4 & 255);
        emVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final void l(int i, j90 j90Var, byte[] bArr) {
        synchronized (this) {
            if (this.j) {
                throw new IOException("closed");
            }
            if (j90Var.g == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            j(0, bArr.length + 8, 7, 0);
            this.g.writeInt(i);
            this.g.writeInt(j90Var.g);
            if (bArr.length != 0) {
                this.g.write(bArr);
            }
            this.g.flush();
        }
    }

    public final void m(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.j) {
                throw new IOException("closed");
            }
            this.k.d(arrayList);
            long j = this.h.h;
            long min = Math.min(this.i, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            j(i, (int) min, 1, i2);
            this.g.q(min, this.h);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.i, j2);
                    j2 -= min2;
                    j(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                    this.g.q(min2, this.h);
                }
            }
        }
    }

    public final void o(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.j) {
                throw new IOException("closed");
            }
            j(0, 8, 6, z ? 1 : 0);
            this.g.writeInt(i);
            this.g.writeInt(i2);
            this.g.flush();
        }
    }

    public final void r(int i, j90 j90Var) {
        synchronized (this) {
            if (this.j) {
                throw new IOException("closed");
            }
            if (j90Var.g == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            j(i, 4, 3, 0);
            this.g.writeInt(j90Var.g);
            this.g.flush();
        }
    }

    public final void v(int i, long j) {
        synchronized (this) {
            try {
                if (this.j) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = l;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(vj0.c(false, i, 4, j));
                }
                j(i, 4, 8, 0);
                this.g.writeInt((int) j);
                this.g.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
