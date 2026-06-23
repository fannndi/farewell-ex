package defpackage;

import android.telephony.fHMN.BFtDZYxPcpGN;

/* loaded from: classes.dex */
public final class ln2 extends vl2 {
    public static final ln2 zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public int zzg;

    static {
        ln2 ln2Var = new ln2();
        zzb = ln2Var;
        vl2.k(ln2.class, ln2Var);
    }

    public static /* synthetic */ void n(ln2 ln2Var, go2 go2Var) {
        ln2Var.zzf = go2Var;
        ln2Var.zze = 3;
    }

    public static /* synthetic */ void o(ln2 ln2Var, int i) {
        ln2Var.zzg = i - 1;
        ln2Var.zzd |= 1;
    }

    public static kn2 p() {
        return (kn2) zzb.f();
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", BFtDZYxPcpGN.eAy, "zzd", "zzg", cl2.c, wn2.class, go2.class, yn2.class});
        }
        if (i2 == 3) {
            return new ln2();
        }
        if (i2 == 4) {
            return new kn2(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
