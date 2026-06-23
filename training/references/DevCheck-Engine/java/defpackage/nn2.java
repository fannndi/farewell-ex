package defpackage;

import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;

/* loaded from: classes.dex */
public final class nn2 extends vl2 {
    public static final nn2 zzb;
    public int zzd;
    public int zze;
    public int zzg;
    public String zzf = "";
    public String zzh = "";

    static {
        nn2 nn2Var = new nn2();
        zzb = nn2Var;
        vl2.k(nn2.class, nn2Var);
    }

    public static /* synthetic */ void n(nn2 nn2Var, String str) {
        nn2Var.zzd |= 8;
        nn2Var.zzh = str;
    }

    public static /* synthetic */ void o(nn2 nn2Var, String str) {
        str.getClass();
        nn2Var.zzd |= 2;
        nn2Var.zzf = str;
    }

    public static /* synthetic */ void p(nn2 nn2Var, int i) {
        nn2Var.zzd |= 1;
        nn2Var.zze = i;
    }

    public static /* synthetic */ void q(nn2 nn2Var, int i) {
        nn2Var.zzg = i - 1;
        nn2Var.zzd |= 4;
    }

    public static mn2 r() {
        return (mn2) zzb.f();
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", cl2.d, bOxzFZXgEkjph.GFMfO});
        }
        if (i2 == 3) {
            return new nn2();
        }
        if (i2 == 4) {
            return new mn2(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
