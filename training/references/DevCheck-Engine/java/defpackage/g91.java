package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g91 {
    public static final g91 g;
    public static final g91 h;
    public static final g91 i;
    public static final g91 j;
    public static final /* synthetic */ g91[] k;

    static {
        g91 g91Var = new g91("DIRECT", 0);
        g = g91Var;
        g91 g91Var2 = new g91("SHIZUKU", 1);
        h = g91Var2;
        g91 g91Var3 = new g91("ROOT", 2);
        i = g91Var3;
        g91 g91Var4 = new g91("NONE", 3);
        j = g91Var4;
        k = new g91[]{g91Var, g91Var2, g91Var3, g91Var4};
    }

    public static g91 valueOf(String str) {
        return (g91) Enum.valueOf(g91.class, str);
    }

    public static g91[] values() {
        return (g91[]) k.clone();
    }
}
