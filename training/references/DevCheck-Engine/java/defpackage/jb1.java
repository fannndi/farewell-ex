package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jb1 {
    public static final jb1 g;
    public static final /* synthetic */ jb1[] h;

    static {
        jb1 jb1Var = new jb1("DEFAULT", 0);
        g = jb1Var;
        jb1 jb1Var2 = new jb1("UNMETERED_ONLY", 1);
        jb1 jb1Var3 = new jb1("UNMETERED_OR_DAILY", 2);
        jb1 jb1Var4 = new jb1("FAST_IF_RADIO_AWAKE", 3);
        jb1 jb1Var5 = new jb1("NEVER", 4);
        jb1 jb1Var6 = new jb1("UNRECOGNIZED", 5);
        h = new jb1[]{jb1Var, jb1Var2, jb1Var3, jb1Var4, jb1Var5, jb1Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, jb1Var);
        sparseArray.put(1, jb1Var2);
        sparseArray.put(2, jb1Var3);
        sparseArray.put(3, jb1Var4);
        sparseArray.put(4, jb1Var5);
        sparseArray.put(-1, jb1Var6);
    }

    public static jb1 valueOf(String str) {
        return (jb1) Enum.valueOf(jb1.class, str);
    }

    public static jb1[] values() {
        return (jb1[]) h.clone();
    }
}
