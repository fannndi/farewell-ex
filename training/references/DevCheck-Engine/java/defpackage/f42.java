package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f42 {
    public static final f42 g;
    public static final /* synthetic */ f42[] h;

    /* JADX INFO: Fake field, exist only in values array */
    f42 EF0;

    static {
        f42 f42Var = new f42("TOP", 0);
        f42 f42Var2 = new f42("BOTTOM", 1);
        f42 f42Var3 = new f42("LEFT_TOP", 2);
        f42 f42Var4 = new f42("RIGHT_TOP", 3);
        g = f42Var4;
        h = new f42[]{f42Var, f42Var2, f42Var3, f42Var4, new f42("LEFT_BOTTOM", 4), new f42("RIGHT_BOTTOM", 5)};
    }

    public static f42 valueOf(String str) {
        return (f42) Enum.valueOf(f42.class, str);
    }

    public static f42[] values() {
        return (f42[]) h.clone();
    }
}
