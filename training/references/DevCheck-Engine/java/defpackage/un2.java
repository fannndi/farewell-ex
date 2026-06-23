package defpackage;

/* loaded from: classes.dex */
public final class un2 extends vl2 {
    public static final un2 zzb;
    public int zzd;
    public boolean zze;
    public boolean zzf;

    static {
        un2 un2Var = new un2();
        zzb = un2Var;
        vl2.k(un2.class, un2Var);
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new un2();
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
