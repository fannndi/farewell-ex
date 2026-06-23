package defpackage;

import androidx.emoji2.text.Fk.Iyrs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i2 {
    public static final i2 g;
    public static final i2 h;
    public static final /* synthetic */ i2[] i;

    static {
        i2 i2Var = new i2("ALWAYS", 0);
        g = i2Var;
        i2 i2Var2 = new i2(Iyrs.dHntESgMbfZBv, 1);
        h = i2Var2;
        i = new i2[]{i2Var, i2Var2};
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) i.clone();
    }
}
