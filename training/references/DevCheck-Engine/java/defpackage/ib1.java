package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ib1 {
    public static final ib1 g;
    public static final ib1 h;
    public static final ib1 i;
    public static final ib1 j;
    public static final /* synthetic */ ib1[] k;

    static {
        ib1 ib1Var = new ib1("PSU", 0);
        g = ib1Var;
        ib1 ib1Var2 = new ib1("PSP", 1);
        h = ib1Var2;
        ib1 ib1Var3 = new ib1("PSPP", 2);
        i = ib1Var3;
        ib1 ib1Var4 = new ib1("PSPA", 3);
        j = ib1Var4;
        k = new ib1[]{ib1Var, ib1Var2, ib1Var3, ib1Var4};
    }

    public static ib1 valueOf(String str) {
        return (ib1) Enum.valueOf(ib1.class, str);
    }

    public static ib1[] values() {
        return (ib1[]) k.clone();
    }
}
