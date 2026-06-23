package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g52 {
    public static final g52 g;
    public static final g52 h;
    public static final g52 i;
    public static final /* synthetic */ g52[] j;

    static {
        g52 g52Var = new g52("TODAY", 0);
        g = g52Var;
        g52 g52Var2 = new g52("LAST_7_DAYS", 1);
        h = g52Var2;
        g52 g52Var3 = new g52("LAST_30_DAYS", 2);
        i = g52Var3;
        j = new g52[]{g52Var, g52Var2, g52Var3};
    }

    public static g52 valueOf(String str) {
        return (g52) Enum.valueOf(g52.class, str);
    }

    public static g52[] values() {
        return (g52[]) j.clone();
    }
}
