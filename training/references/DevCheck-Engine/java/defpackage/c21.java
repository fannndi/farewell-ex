package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c21 {
    public static final c21 g;
    public static final c21 h;
    public static final c21 i;
    public static final c21 j;
    public static final c21 k;
    public static final /* synthetic */ c21[] l;

    static {
        c21 c21Var = new c21("IDLE", 0);
        g = c21Var;
        c21 c21Var2 = new c21("SCANNING", 1);
        h = c21Var2;
        c21 c21Var3 = new c21("DONE", 2);
        i = c21Var3;
        c21 c21Var4 = new c21("ERROR_NOT_ON_WIFI", 3);
        j = c21Var4;
        c21 c21Var5 = new c21("ERROR_NO_NETWORK_INFO", 4);
        k = c21Var5;
        l = new c21[]{c21Var, c21Var2, c21Var3, c21Var4, c21Var5};
    }

    public static c21 valueOf(String str) {
        return (c21) Enum.valueOf(c21.class, str);
    }

    public static c21[] values() {
        return (c21[]) l.clone();
    }
}
