package defpackage;

import flar2.devcheck.cputimes.Sd.tEegR;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e9 {
    public static final e9 g;
    public static final e9 h;
    public static final e9 i;
    public static final e9 j;
    public static final /* synthetic */ e9[] k;

    static {
        e9 e9Var = new e9("GET_RUNNING", 0);
        g = e9Var;
        e9 e9Var2 = new e9(tEegR.WailpwhpIDxhGAK, 1);
        h = e9Var2;
        e9 e9Var3 = new e9("GET_SYSTEM", 2);
        i = e9Var3;
        e9 e9Var4 = new e9("GET_ALL", 3);
        j = e9Var4;
        k = new e9[]{e9Var, e9Var2, e9Var3, e9Var4};
    }

    public static e9 valueOf(String str) {
        return (e9) Enum.valueOf(e9.class, str);
    }

    public static e9[] values() {
        return (e9[]) k.clone();
    }
}
