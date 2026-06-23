package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j61 {
    public static final j61 g;
    public static final j61 h;
    public static final j61 i;
    public static final j61 j;
    public static final /* synthetic */ j61[] k;

    static {
        j61 j61Var = new j61("ALLOWED", 0);
        g = j61Var;
        j61 j61Var2 = new j61("NOT_ALLOWED", 1);
        h = j61Var2;
        j61 j61Var3 = new j61("SPECIAL", 2);
        i = j61Var3;
        j61 j61Var4 = new j61("UNKNOWN", 3);
        j = j61Var4;
        k = new j61[]{j61Var, j61Var2, j61Var3, j61Var4};
    }

    public static j61 valueOf(String str) {
        return (j61) Enum.valueOf(j61.class, str);
    }

    public static j61[] values() {
        return (j61[]) k.clone();
    }
}
