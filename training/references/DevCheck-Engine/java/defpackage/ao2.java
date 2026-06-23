package defpackage;

/* loaded from: classes.dex */
public final class ao2 extends vl2 {
    public static final ao2 zzb;
    public int zzd;
    public int zze = 0;
    public Object zzf;
    public tn2 zzg;
    public un2 zzh;

    static {
        ao2 ao2Var = new ao2();
        zzb = ao2Var;
        vl2.k(ao2.class, ao2Var);
    }

    public static /* synthetic */ void n(ao2 ao2Var, in2 in2Var) {
        ao2Var.zzf = in2Var;
        ao2Var.zze = 2;
    }

    public static /* synthetic */ void o(ao2 ao2Var, ln2 ln2Var) {
        ao2Var.zzf = ln2Var;
        ao2Var.zze = 3;
    }

    public static /* synthetic */ void p(ao2 ao2Var, pn2 pn2Var) {
        pn2Var.getClass();
        ao2Var.zzf = pn2Var;
        ao2Var.zze = 7;
    }

    public static /* synthetic */ void q(ao2 ao2Var, tn2 tn2Var) {
        tn2Var.getClass();
        ao2Var.zzg = tn2Var;
        ao2Var.zzd |= 1;
    }

    public static /* synthetic */ void r(ao2 ao2Var, do2 do2Var) {
        ao2Var.zzf = do2Var;
        ao2Var.zze = 8;
    }

    public static /* synthetic */ void s(ao2 ao2Var, eo2 eo2Var) {
        ao2Var.zzf = eo2Var;
        ao2Var.zze = 4;
    }

    public static zn2 t() {
        return (zn2) zzb.f();
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", in2.class, ln2.class, eo2.class, rn2.class, "zzh", pn2.class, do2.class});
        }
        if (i2 == 3) {
            return new ao2();
        }
        if (i2 == 4) {
            return new zn2(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
