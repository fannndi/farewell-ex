package defpackage;

import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import java.io.IOException;

/* loaded from: classes.dex */
public final class in2 extends vl2 {
    public static final in2 zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public int zzg;
    public nn2 zzh;

    static {
        in2 in2Var = new in2();
        zzb = in2Var;
        vl2.k(in2.class, in2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [rm2] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, vl2] */
    public static in2 n(byte[] bArr, ol2 ol2Var) {
        in2 in2Var = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r2 = (vl2) in2Var.d(4);
            try {
                ?? a2 = om2.c.a(r2.getClass());
                gl2 gl2Var = new gl2();
                ol2Var.getClass();
                a2.e(r2, bArr, 0, length, gl2Var);
                a2.a(r2);
                in2Var = r2;
            } catch (bm2 e) {
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof bm2) {
                    throw ((bm2) e2.getCause());
                }
                throw new bm2(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                p22.a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (ym2 e3) {
                p22.a(e3.getMessage());
                return null;
            }
        }
        if (in2Var == null || vl2.m(in2Var, true)) {
            return in2Var;
        }
        p22.a(new ym2().getMessage());
        return null;
    }

    public static /* synthetic */ void o(in2 in2Var, nn2 nn2Var) {
        in2Var.zzh = nn2Var;
        in2Var.zzd |= 2;
    }

    public static /* synthetic */ void p(in2 in2Var, int i) {
        in2Var.zzg = i - 1;
        in2Var.zzd |= 1;
    }

    public static hn2 q() {
        return (hn2) zzb.f();
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", cl2.c, bPnJ.QaPhSgLt, wn2.class});
        }
        if (i2 == 3) {
            return new in2();
        }
        if (i2 == 4) {
            return new hn2(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
