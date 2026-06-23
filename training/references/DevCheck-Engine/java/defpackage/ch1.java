package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ch1 {
    public static final ch1 g;
    public static final ch1 h;
    public static final ch1 i;
    public static final /* synthetic */ ch1[] j;

    static {
        ch1 ch1Var = new ch1("AUTOMATIC", 0);
        g = ch1Var;
        ch1 ch1Var2 = new ch1("TRUNCATE", 1);
        h = ch1Var2;
        ch1 ch1Var3 = new ch1("WRITE_AHEAD_LOGGING", 2);
        i = ch1Var3;
        j = new ch1[]{ch1Var, ch1Var2, ch1Var3};
    }

    public static ch1 valueOf(String str) {
        return (ch1) Enum.valueOf(ch1.class, str);
    }

    public static ch1[] values() {
        return (ch1[]) j.clone();
    }
}
