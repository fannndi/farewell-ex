package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t40 {
    public static final t40 g;
    public static final /* synthetic */ t40[] h;

    static {
        t40 t40Var = new t40("CW", 0);
        g = t40Var;
        h = new t40[]{t40Var, new t40("CCW", 1)};
    }

    public static t40 valueOf(String str) {
        return (t40) Enum.valueOf(t40.class, str);
    }

    public static t40[] values() {
        return (t40[]) h.clone();
    }
}
