package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ve0 {
    public static final ve0 g;
    public static final ve0 h;
    public static final ve0 i;
    public static final ve0 j;
    public static final ve0 k;
    public static final /* synthetic */ ve0[] l;

    static {
        ve0 ve0Var = new ve0("ON_CONFIGURE", 0);
        g = ve0Var;
        ve0 ve0Var2 = new ve0("ON_CREATE", 1);
        h = ve0Var2;
        ve0 ve0Var3 = new ve0("ON_UPGRADE", 2);
        i = ve0Var3;
        ve0 ve0Var4 = new ve0("ON_DOWNGRADE", 3);
        j = ve0Var4;
        ve0 ve0Var5 = new ve0("ON_OPEN", 4);
        k = ve0Var5;
        l = new ve0[]{ve0Var, ve0Var2, ve0Var3, ve0Var4, ve0Var5};
    }

    public static ve0 valueOf(String str) {
        return (ve0) Enum.valueOf(ve0.class, str);
    }

    public static ve0[] values() {
        return (ve0[]) l.clone();
    }
}
