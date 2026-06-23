package defpackage;

import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ck1 {
    public static final ck1 g;
    public static final ck1 h;
    public static final ck1 i;
    public static final /* synthetic */ ck1[] j;

    static {
        ck1 ck1Var = new ck1("NETWORK_UNMETERED", 0);
        g = ck1Var;
        ck1 ck1Var2 = new ck1(IGQCApxXGMWo.Ljbqf, 1);
        h = ck1Var2;
        ck1 ck1Var3 = new ck1("DEVICE_CHARGING", 2);
        i = ck1Var3;
        j = new ck1[]{ck1Var, ck1Var2, ck1Var3};
    }

    public static ck1 valueOf(String str) {
        return (ck1) Enum.valueOf(ck1.class, str);
    }

    public static ck1[] values() {
        return (ck1[]) j.clone();
    }
}
