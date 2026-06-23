package defpackage;

/* loaded from: classes.dex */
public final class bo2 extends vl2 {
    public static final bo2 zzb;
    public int zzd;
    public int zzf;
    public yl2 zze = pm2.k;
    public String zzg = "";

    static {
        bo2 bo2Var = new bo2();
        zzb = bo2Var;
        vl2.k(bo2.class, bo2Var);
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new bo2();
        }
        if (i2 == 4) {
            return new on2(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
