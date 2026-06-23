package defpackage;

import android.util.SparseArray;
import flar2.devcheck.usage.GgP.rlfWzcx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o11 {
    public static final SparseArray g;
    public static final /* synthetic */ o11[] h;

    /* JADX INFO: Fake field, exist only in values array */
    o11 EF1;

    static {
        o11 o11Var = new o11("UNKNOWN_MOBILE_SUBTYPE", 0);
        o11 o11Var2 = new o11("GPRS", 1);
        o11 o11Var3 = new o11("EDGE", 2);
        o11 o11Var4 = new o11("UMTS", 3);
        o11 o11Var5 = new o11("CDMA", 4);
        o11 o11Var6 = new o11("EVDO_0", 5);
        o11 o11Var7 = new o11("EVDO_A", 6);
        o11 o11Var8 = new o11("RTT", 7);
        o11 o11Var9 = new o11("HSDPA", 8);
        o11 o11Var10 = new o11("HSUPA", 9);
        o11 o11Var11 = new o11("HSPA", 10);
        o11 o11Var12 = new o11("IDEN", 11);
        o11 o11Var13 = new o11("EVDO_B", 12);
        o11 o11Var14 = new o11(rlfWzcx.QrGifQcr, 13);
        o11 o11Var15 = new o11("EHRPD", 14);
        o11 o11Var16 = new o11("HSPAP", 15);
        o11 o11Var17 = new o11("GSM", 16);
        o11 o11Var18 = new o11("TD_SCDMA", 17);
        o11 o11Var19 = new o11("IWLAN", 18);
        o11 o11Var20 = new o11("LTE_CA", 19);
        h = new o11[]{o11Var, o11Var2, o11Var3, o11Var4, o11Var5, o11Var6, o11Var7, o11Var8, o11Var9, o11Var10, o11Var11, o11Var12, o11Var13, o11Var14, o11Var15, o11Var16, o11Var17, o11Var18, o11Var19, o11Var20, new o11("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        g = sparseArray;
        sparseArray.put(0, o11Var);
        sparseArray.put(1, o11Var2);
        sparseArray.put(2, o11Var3);
        sparseArray.put(3, o11Var4);
        sparseArray.put(4, o11Var5);
        sparseArray.put(5, o11Var6);
        sparseArray.put(6, o11Var7);
        sparseArray.put(7, o11Var8);
        sparseArray.put(8, o11Var9);
        sparseArray.put(9, o11Var10);
        sparseArray.put(10, o11Var11);
        sparseArray.put(11, o11Var12);
        sparseArray.put(12, o11Var13);
        sparseArray.put(13, o11Var14);
        sparseArray.put(14, o11Var15);
        sparseArray.put(15, o11Var16);
        sparseArray.put(16, o11Var17);
        sparseArray.put(17, o11Var18);
        sparseArray.put(18, o11Var19);
        sparseArray.put(19, o11Var20);
    }

    public static o11 valueOf(String str) {
        return (o11) Enum.valueOf(o11.class, str);
    }

    public static o11[] values() {
        return (o11[]) h.clone();
    }
}
