package defpackage;

import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class vh0 implements lp1 {
    public byte g;
    public final zc1 h;
    public final Inflater i;
    public final dm0 j;
    public final CRC32 k;

    public vh0(fm fmVar) {
        fmVar.getClass();
        zc1 zc1Var = new zc1(fmVar);
        this.h = zc1Var;
        Inflater inflater = new Inflater(true);
        this.i = inflater;
        this.j = new dm0(zc1Var, inflater);
        this.k = new CRC32();
    }

    public static void a(int i, String str, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + as1.l0(je2.Y(i2)) + " != expected 0x" + as1.l0(je2.Y(i)));
    }

    @Override // defpackage.lp1
    public final bz1 c() {
        return this.h.g.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    public final void e(wl wlVar, long j, long j2) {
        ml1 ml1Var = wlVar.g;
        ml1Var.getClass();
        while (true) {
            int i = ml1Var.c;
            int i2 = ml1Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            ml1Var = ml1Var.f;
            ml1Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(ml1Var.c - r6, j2);
            this.k.update(ml1Var.f640a, (int) (ml1Var.b + j), min);
            j2 -= min;
            ml1Var = ml1Var.f;
            ml1Var.getClass();
            j = 0;
        }
    }

    @Override // defpackage.lp1
    public final long g(long j, wl wlVar) {
        long j2;
        vh0 vh0Var = this;
        byte b = vh0Var.g;
        CRC32 crc32 = vh0Var.k;
        zc1 zc1Var = vh0Var.h;
        if (b == 0) {
            zc1Var.x(10L);
            wl wlVar2 = zc1Var.h;
            byte j3 = wlVar2.j(3L);
            boolean z = ((j3 >> 1) & 1) == 1;
            if (z) {
                vh0Var.e(wlVar2, 0L, 10L);
            }
            a(8075, bPnJ.NisPDiPHkggJa, zc1Var.readShort());
            zc1Var.skip(8L);
            if (((j3 >> 2) & 1) == 1) {
                zc1Var.x(2L);
                if (z) {
                    e(wlVar2, 0L, 2L);
                }
                short readShort = wlVar2.readShort();
                long j4 = ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8))) & 65535;
                zc1Var.x(j4);
                if (z) {
                    e(wlVar2, 0L, j4);
                }
                zc1Var.skip(j4);
            }
            if (((j3 >> 3) & 1) == 1) {
                long e = zc1Var.e((byte) 0, 0L, Long.MAX_VALUE);
                if (e == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    e(wlVar2, 0L, e + 1);
                } else {
                    j2 = 2;
                }
                zc1Var.skip(e + 1);
            } else {
                j2 = 2;
            }
            if (((j3 >> 4) & 1) == 1) {
                long j5 = j2;
                long e2 = zc1Var.e((byte) 0, 0L, Long.MAX_VALUE);
                if (e2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j5;
                    vh0Var = this;
                    vh0Var.e(wlVar2, 0L, e2 + 1);
                } else {
                    vh0Var = this;
                    j2 = j5;
                }
                zc1Var.skip(e2 + 1);
            } else {
                vh0Var = this;
            }
            if (z) {
                zc1Var.x(j2);
                short readShort2 = wlVar2.readShort();
                a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), "FHCRC", (short) crc32.getValue());
                crc32.reset();
            }
            vh0Var.g = (byte) 1;
        }
        if (vh0Var.g == 1) {
            long j6 = wlVar.h;
            long g = vh0Var.j.g(8192L, wlVar);
            if (g != -1) {
                vh0Var.e(wlVar, j6, g);
                return g;
            }
            vh0Var.g = (byte) 2;
        }
        if (vh0Var.g == 2) {
            zc1Var.x(4L);
            wl wlVar3 = zc1Var.h;
            a(je2.P(wlVar3.readInt()), "CRC", (int) crc32.getValue());
            zc1Var.x(4L);
            a(je2.P(wlVar3.readInt()), "ISIZE", (int) vh0Var.i.getBytesWritten());
            vh0Var.g = (byte) 3;
            if (!zc1Var.a()) {
                rw.f("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }
}
