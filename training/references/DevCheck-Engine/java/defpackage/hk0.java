package defpackage;

import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class hk0 implements Closeable {
    public static final Logger j;
    public final fm g;
    public final gk0 h;
    public final mj0 i;

    static {
        Logger logger = Logger.getLogger(vj0.class.getName());
        logger.getClass();
        j = logger;
    }

    public hk0(zc1 zc1Var) {
        zc1Var.getClass();
        this.g = zc1Var;
        gk0 gk0Var = new gk0(zc1Var);
        this.h = gk0Var;
        this.i = new mj0(gk0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0239, code lost:
    
        defpackage.rw.f(defpackage.d51.q("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0242, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r17, defpackage.dk0 r18) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk0.a(boolean, dk0):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final void e(dk0 dk0Var, int i, int i2, final int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            rw.f("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            rw.f("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte readByte = this.g.readByte();
            byte[] bArr = pd2.f785a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        final int r = ym0.r(i, i2, i4);
        fm fmVar = this.g;
        fmVar.getClass();
        final ek0 ek0Var = dk0Var.h;
        if ((i3 == 0 || (i3 & 1) != 0) ? false : z) {
            final wl wlVar = new wl();
            long j2 = r;
            fmVar.x(j2);
            fmVar.g(j2, wlVar);
            iw1.b(ek0Var.o, ek0Var.i + '[' + i3 + "] onData", new af0(i3, wlVar, r, z4) { // from class: yj0
                public final /* synthetic */ int h;
                public final /* synthetic */ wl i;
                public final /* synthetic */ int j;

                @Override // defpackage.af0
                public final Object a() {
                    ek0 ek0Var2 = ek0.this;
                    int i5 = this.h;
                    wl wlVar2 = this.i;
                    int i6 = this.j;
                    try {
                        ek0Var2.q.getClass();
                        wlVar2.skip(i6);
                        ek0Var2.C.r(i5, j90.n);
                        synchronized (ek0Var2) {
                            ek0Var2.E.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return e42.f219a;
                }
            });
        } else {
            lk0 e = ek0Var.e(i3);
            if (e == null) {
                dk0Var.h.r(i3, j90.j);
                long j3 = r;
                dk0Var.h.m(j3);
                fmVar.skip(j3);
            } else {
                TimeZone timeZone = rd2.f888a;
                jk0 jk0Var = e.n;
                long j4 = r;
                jk0Var.getClass();
                long j5 = j4;
                while (true) {
                    lk0 lk0Var = jk0Var.l;
                    if (j5 <= 0) {
                        TimeZone timeZone2 = rd2.f888a;
                        lk0Var.h.m(j4);
                        jk0Var.l.h.v.getClass();
                        break;
                    }
                    synchronized (lk0Var) {
                        z2 = jk0Var.h;
                        z3 = jk0Var.j.h + j5 > jk0Var.g;
                    }
                    if (z3) {
                        fmVar.skip(j5);
                        jk0Var.l.f(j90.l);
                        break;
                    }
                    if (z2) {
                        fmVar.skip(j5);
                        break;
                    }
                    long g = fmVar.g(j5, jk0Var.i);
                    if (g == -1) {
                        throw new EOFException();
                    }
                    j5 -= g;
                    lk0 lk0Var2 = jk0Var.l;
                    synchronized (lk0Var2) {
                        try {
                            if (jk0Var.k) {
                                wl wlVar2 = jk0Var.i;
                                wlVar2.skip(wlVar2.h);
                            } else {
                                wl wlVar3 = jk0Var.j;
                                boolean z5 = wlVar3.h == 0;
                                wlVar3.H(jk0Var.i);
                                if (z5) {
                                    lk0Var2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z4) {
                    e.j(ui0.h, true);
                }
            }
        }
        this.g.skip(i4);
    }

    public final List j(int i, int i2, int i3, int i4) {
        gk0 gk0Var = this.h;
        gk0Var.j = i;
        gk0Var.k = i2;
        gk0Var.h = i3;
        gk0Var.i = i4;
        mj0 mj0Var = this.i;
        zc1 zc1Var = mj0Var.d;
        while (!zc1Var.a()) {
            byte readByte = zc1Var.readByte();
            byte[] bArr = pd2.f785a;
            int i5 = readByte & 255;
            if (i5 == 128) {
                rw.f("index == 0");
                return null;
            }
            if ((readByte & 128) == 128) {
                int f = mj0Var.f(i5, 127);
                int i6 = f - 1;
                if (i6 >= 0) {
                    pi0[] pi0VarArr = oj0.f740a;
                    if (i6 <= pi0VarArr.length - 1) {
                        mj0Var.a(pi0VarArr[i6]);
                    }
                }
                int length = mj0Var.f + 1 + (i6 - oj0.f740a.length);
                if (length >= 0) {
                    pi0[] pi0VarArr2 = mj0Var.e;
                    if (length < pi0VarArr2.length) {
                        pi0 pi0Var = pi0VarArr2[length];
                        pi0Var.getClass();
                        mj0Var.a(pi0Var);
                    }
                }
                rw.f(d51.q("Header index too large ", f));
                return null;
            }
            if (i5 == 64) {
                pi0[] pi0VarArr3 = oj0.f740a;
                km e = mj0Var.e();
                oj0.a(e);
                mj0Var.d(new pi0(e, mj0Var.e()));
            } else if ((readByte & 64) == 64) {
                mj0Var.d(new pi0(mj0Var.c(mj0Var.f(i5, 63) - 1), mj0Var.e()));
            } else if ((readByte & 32) == 32) {
                int f2 = mj0Var.f(i5, 31);
                mj0Var.f637a = f2;
                if (f2 < 0 || f2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + mj0Var.f637a);
                }
                int i7 = mj0Var.h;
                if (f2 < i7) {
                    if (f2 == 0) {
                        u9.l0(r4, null, 0, mj0Var.e.length);
                        mj0Var.f = mj0Var.e.length - 1;
                        mj0Var.g = 0;
                        mj0Var.h = 0;
                    } else {
                        mj0Var.b(i7 - f2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                pi0[] pi0VarArr4 = oj0.f740a;
                km e2 = mj0Var.e();
                oj0.a(e2);
                mj0Var.a(new pi0(e2, mj0Var.e()));
            } else {
                mj0Var.a(new pi0(mj0Var.c(mj0Var.f(i5, 15) - 1), mj0Var.e()));
            }
        }
        ArrayList arrayList = mj0Var.b;
        List g0 = yr.g0(arrayList);
        arrayList.clear();
        mj0Var.c = 0L;
        return g0;
    }

    public final void l(dk0 dk0Var, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            rw.f("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.g.readByte();
            byte[] bArr = pd2.f785a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            fm fmVar = this.g;
            fmVar.readInt();
            fmVar.readByte();
            byte[] bArr2 = pd2.f785a;
            i -= 5;
        }
        List j2 = j(ym0.r(i, i2, i4), i4, i2, i3);
        ek0 ek0Var = dk0Var.h;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            iw1.b(ek0Var.o, ek0Var.i + '[' + i3 + "] onHeaders", new zj0(ek0Var, i3, j2, z2));
            return;
        }
        synchronized (ek0Var) {
            lk0 e = ek0Var.e(i3);
            if (e != null) {
                e.j(rd2.g(j2), z2);
                return;
            }
            if (ek0Var.l) {
                return;
            }
            if (i3 <= ek0Var.j) {
                return;
            }
            int i5 = 2;
            if (i3 % 2 == ek0Var.k % 2) {
                return;
            }
            lk0 lk0Var = new lk0(i3, ek0Var, false, z2, rd2.g(j2));
            ek0Var.j = i3;
            ek0Var.h.put(Integer.valueOf(i3), lk0Var);
            iw1.b(ek0Var.m.d(), ek0Var.i + '[' + i3 + bOxzFZXgEkjph.ToYkrijW, new md(ek0Var, i5, lk0Var));
        }
    }

    public final void m(dk0 dk0Var, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            rw.f("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte readByte = this.g.readByte();
            byte[] bArr = pd2.f785a;
            i4 = readByte & 255;
        } else {
            i4 = 0;
        }
        int readInt = this.g.readInt() & Integer.MAX_VALUE;
        List j2 = j(ym0.r(i - 4, i2, i4), i4, i2, i3);
        ek0 ek0Var = dk0Var.h;
        synchronized (ek0Var) {
            if (ek0Var.E.contains(Integer.valueOf(readInt))) {
                ek0Var.r(readInt, j90.j);
                return;
            }
            ek0Var.E.add(Integer.valueOf(readInt));
            iw1.b(ek0Var.o, ek0Var.i + '[' + readInt + "] onRequest", new zj0(ek0Var, readInt, j2, i5));
        }
    }
}
