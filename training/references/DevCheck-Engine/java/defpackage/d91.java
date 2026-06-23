package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d91 {
    public static final d91 g;
    public static final d91 h;
    public static final d91 i;
    public static final /* synthetic */ d91[] j;

    static {
        d91 d91Var = new d91("DEFAULT", 0);
        g = d91Var;
        d91 d91Var2 = new d91("VERY_LOW", 1);
        h = d91Var2;
        d91 d91Var3 = new d91("HIGHEST", 2);
        i = d91Var3;
        j = new d91[]{d91Var, d91Var2, d91Var3};
    }

    public static d91 valueOf(String str) {
        return (d91) Enum.valueOf(d91.class, str);
    }

    public static d91[] values() {
        return (d91[]) j.clone();
    }
}
