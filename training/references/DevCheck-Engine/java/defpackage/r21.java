package defpackage;

import com.imn.iivisu.ltkT.CDsMEtnUjndKau;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r21 {
    public static final r21 g;
    public static final r21 h;
    public static final r21 i;
    public static final r21 j;
    public static final r21 k;
    public static final r21 l;
    public static final /* synthetic */ r21[] m;

    static {
        r21 r21Var = new r21("NOT_REQUIRED", 0);
        g = r21Var;
        r21 r21Var2 = new r21(CDsMEtnUjndKau.Mph, 1);
        h = r21Var2;
        r21 r21Var3 = new r21("UNMETERED", 2);
        i = r21Var3;
        r21 r21Var4 = new r21("NOT_ROAMING", 3);
        j = r21Var4;
        r21 r21Var5 = new r21("METERED", 4);
        k = r21Var5;
        r21 r21Var6 = new r21("TEMPORARILY_UNMETERED", 5);
        l = r21Var6;
        m = new r21[]{r21Var, r21Var2, r21Var3, r21Var4, r21Var5, r21Var6};
    }

    public static r21 valueOf(String str) {
        return (r21) Enum.valueOf(r21.class, str);
    }

    public static r21[] values() {
        return (r21[]) m.clone();
    }
}
