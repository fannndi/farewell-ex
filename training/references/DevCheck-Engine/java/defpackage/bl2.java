package defpackage;

/* loaded from: classes.dex */
public final class bl2 extends vl2 {
    public static final bl2 zzb;
    public int zzd;
    public String zze = "";

    static {
        bl2 bl2Var = new bl2();
        zzb = bl2Var;
        vl2.k(bl2.class, bl2Var);
    }

    public static al2 n() {
        return (al2) zzb.f();
    }

    public static /* synthetic */ void o(bl2 bl2Var, String str) {
        bl2Var.zzd |= 1;
        bl2Var.zze = str;
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new bl2();
        }
        if (i2 == 4) {
            return new al2(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
