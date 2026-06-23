package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ha0 {
    public static final ha0 g;
    public static final /* synthetic */ ha0[] h;

    /* JADX INFO: Fake field, exist only in values array */
    ha0 EF0;

    static {
        ha0 ha0Var = new ha0("REPLACE", 0);
        ha0 ha0Var2 = new ha0("KEEP", 1);
        g = ha0Var2;
        h = new ha0[]{ha0Var, ha0Var2, new ha0("APPEND", 2), new ha0("APPEND_OR_REPLACE", 3)};
    }

    public static ha0 valueOf(String str) {
        return (ha0) Enum.valueOf(ha0.class, str);
    }

    public static ha0[] values() {
        return (ha0[]) h.clone();
    }
}
