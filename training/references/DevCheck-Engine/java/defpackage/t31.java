package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t31 {
    public static final t31 g;
    public static final t31 h;
    public static final t31 i;
    public static final /* synthetic */ t31[] j;

    static {
        t31 t31Var = new t31("NO_OP", 0);
        g = t31Var;
        t31 t31Var2 = new t31("ADD", 1);
        h = t31Var2;
        t31 t31Var3 = new t31("REMOVE", 2);
        i = t31Var3;
        j = new t31[]{t31Var, t31Var2, t31Var3};
    }

    public static t31 valueOf(String str) {
        return (t31) Enum.valueOf(t31.class, str);
    }

    public static t31[] values() {
        return (t31[]) j.clone();
    }
}
