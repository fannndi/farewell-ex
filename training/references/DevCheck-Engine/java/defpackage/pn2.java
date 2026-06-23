package defpackage;

/* loaded from: classes.dex */
public final class pn2 extends vl2 {
    public static final pn2 zzb;

    static {
        pn2 pn2Var = new pn2();
        zzb = pn2Var;
        vl2.k(pn2.class, pn2Var);
    }

    public static pn2 n() {
        return zzb;
    }

    @Override // defpackage.vl2
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new qm2(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new pn2();
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
