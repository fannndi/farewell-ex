package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bp0 {
    public static final bp0 g;
    public static final bp0 h;
    public static final bp0 i;
    public static final bp0 j;
    public static final bp0 k;
    public static final bp0 l;
    public static final bp0 m;
    public static final /* synthetic */ bp0[] n;

    static {
        bp0 bp0Var = new bp0("UNKNOWN", 0);
        g = bp0Var;
        bp0 bp0Var2 = new bp0("ROUTER_AP", 1);
        h = bp0Var2;
        bp0 bp0Var3 = new bp0("NAS", 2);
        i = bp0Var3;
        bp0 bp0Var4 = new bp0("PRINTER", 3);
        j = bp0Var4;
        bp0 bp0Var5 = new bp0("TV_STREAMING", 4);
        k = bp0Var5;
        bp0 bp0Var6 = new bp0("COMPUTER", 5);
        l = bp0Var6;
        bp0 bp0Var7 = new bp0("MOBILE", 6);
        m = bp0Var7;
        n = new bp0[]{bp0Var, bp0Var2, bp0Var3, bp0Var4, bp0Var5, bp0Var6, bp0Var7};
    }

    public static bp0 valueOf(String str) {
        return (bp0) Enum.valueOf(bp0.class, str);
    }

    public static bp0[] values() {
        return (bp0[]) n.clone();
    }
}
