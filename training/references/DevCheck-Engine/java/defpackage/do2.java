package defpackage;

/* loaded from: classes.dex */
public final class do2 extends vl2 {
    public static final do2 zzb;
    public int zzd;
    public nn2 zze;

    static {
        do2 do2Var = new do2();
        zzb = do2Var;
        vl2.k(do2.class, do2Var);
    }

    public static /* synthetic */ void n(do2 do2Var, nn2 nn2Var) {
        do2Var.zze = nn2Var;
        do2Var.zzd |= 1;
    }

    public static co2 o() {
        return (co2) zzb.f();
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new do2();
        }
        if (i2 == 4) {
            return new co2(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
