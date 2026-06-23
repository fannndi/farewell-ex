package defpackage;

/* loaded from: classes.dex */
public final class go2 extends vl2 {
    public static final go2 zzb;
    public int zzd;
    public int zze;
    public boolean zzf;

    static {
        go2 go2Var = new go2();
        zzb = go2Var;
        vl2.k(go2.class, go2Var);
    }

    public static /* synthetic */ void n(go2 go2Var) {
        go2Var.zzd |= 2;
        go2Var.zzf = true;
    }

    public static fo2 o() {
        return (fo2) zzb.f();
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new go2();
        }
        if (i2 == 4) {
            return new fo2(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
