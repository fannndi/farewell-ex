package defpackage;

/* loaded from: classes.dex */
public final class eo2 extends vl2 {
    public static final eo2 zzb;
    public int zzd;
    public int zze;

    static {
        eo2 eo2Var = new eo2();
        zzb = eo2Var;
        vl2.k(eo2.class, eo2Var);
    }

    public static eo2 n() {
        return zzb;
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", cl2.i});
        }
        if (i2 == 3) {
            return new eo2();
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
