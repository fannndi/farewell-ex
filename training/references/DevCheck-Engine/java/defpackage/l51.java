package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l51 {
    public static final l51 g;
    public static final l51 h;
    public static final /* synthetic */ l51[] i;

    static {
        l51 l51Var = new l51("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        g = l51Var;
        l51 l51Var2 = new l51("DROP_WORK_REQUEST", 1);
        h = l51Var2;
        i = new l51[]{l51Var, l51Var2};
    }

    public static l51 valueOf(String str) {
        return (l51) Enum.valueOf(l51.class, str);
    }

    public static l51[] values() {
        return (l51[]) i.clone();
    }
}
