package defpackage;

/* loaded from: classes.dex */
public final class tn2 extends vl2 {
    public static final tn2 zzb;
    public int zzd;
    public String zze = "";
    public String zzf = "";
    public int zzg;
    public long zzh;

    static {
        tn2 tn2Var = new tn2();
        zzb = tn2Var;
        vl2.k(tn2.class, tn2Var);
    }

    public static /* synthetic */ void n(tn2 tn2Var, int i) {
        tn2Var.zzd |= 4;
        tn2Var.zzg = i;
    }

    public static /* synthetic */ void o(tn2 tn2Var, long j) {
        tn2Var.zzd |= 8;
        tn2Var.zzh = j;
    }

    public static /* synthetic */ void p(tn2 tn2Var, String str) {
        str.getClass();
        tn2Var.zzd |= 2;
        tn2Var.zzf = str;
    }

    public static /* synthetic */ void q(tn2 tn2Var, String str) {
        str.getClass();
        tn2Var.zzd |= 1;
        tn2Var.zze = str;
    }

    public static sn2 r() {
        return (sn2) zzb.f();
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new tn2();
        }
        if (i2 == 4) {
            return new sn2(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
