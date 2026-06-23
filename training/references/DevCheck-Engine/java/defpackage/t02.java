package defpackage;

import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t02 {
    public static final t02 g;
    public static final t02 h;
    public static final /* synthetic */ t02[] i;

    static {
        t02 t02Var = new t02("DEFERRED", 0);
        g = t02Var;
        t02 t02Var2 = new t02("IMMEDIATE", 1);
        h = t02Var2;
        i = new t02[]{t02Var, t02Var2, new t02(IGQCApxXGMWo.IvCop, 2)};
    }

    public static t02 valueOf(String str) {
        return (t02) Enum.valueOf(t02.class, str);
    }

    public static t02[] values() {
        return (t02[]) i.clone();
    }
}
