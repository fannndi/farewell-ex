package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p11 {
    public static final SparseArray g;
    public static final /* synthetic */ p11[] h;

    /* JADX INFO: Fake field, exist only in values array */
    p11 EF1;

    static {
        p11 p11Var = new p11("MOBILE", 0);
        p11 p11Var2 = new p11("WIFI", 1);
        p11 p11Var3 = new p11("MOBILE_MMS", 2);
        p11 p11Var4 = new p11("MOBILE_SUPL", 3);
        p11 p11Var5 = new p11("MOBILE_DUN", 4);
        p11 p11Var6 = new p11("MOBILE_HIPRI", 5);
        p11 p11Var7 = new p11("WIMAX", 6);
        p11 p11Var8 = new p11("BLUETOOTH", 7);
        p11 p11Var9 = new p11("DUMMY", 8);
        p11 p11Var10 = new p11("ETHERNET", 9);
        p11 p11Var11 = new p11("MOBILE_FOTA", 10);
        p11 p11Var12 = new p11("MOBILE_IMS", 11);
        p11 p11Var13 = new p11("MOBILE_CBS", 12);
        p11 p11Var14 = new p11("WIFI_P2P", 13);
        p11 p11Var15 = new p11("MOBILE_IA", 14);
        p11 p11Var16 = new p11("MOBILE_EMERGENCY", 15);
        p11 p11Var17 = new p11("PROXY", 16);
        p11 p11Var18 = new p11("VPN", 17);
        p11 p11Var19 = new p11("NONE", 18);
        h = new p11[]{p11Var, p11Var2, p11Var3, p11Var4, p11Var5, p11Var6, p11Var7, p11Var8, p11Var9, p11Var10, p11Var11, p11Var12, p11Var13, p11Var14, p11Var15, p11Var16, p11Var17, p11Var18, p11Var19};
        SparseArray sparseArray = new SparseArray();
        g = sparseArray;
        sparseArray.put(0, p11Var);
        sparseArray.put(1, p11Var2);
        sparseArray.put(2, p11Var3);
        sparseArray.put(3, p11Var4);
        sparseArray.put(4, p11Var5);
        sparseArray.put(5, p11Var6);
        sparseArray.put(6, p11Var7);
        sparseArray.put(7, p11Var8);
        sparseArray.put(8, p11Var9);
        sparseArray.put(9, p11Var10);
        sparseArray.put(10, p11Var11);
        sparseArray.put(11, p11Var12);
        sparseArray.put(12, p11Var13);
        sparseArray.put(13, p11Var14);
        sparseArray.put(14, p11Var15);
        sparseArray.put(15, p11Var16);
        sparseArray.put(16, p11Var17);
        sparseArray.put(17, p11Var18);
        sparseArray.put(-1, p11Var19);
    }

    public static p11 valueOf(String str) {
        return (p11) Enum.valueOf(p11.class, str);
    }

    public static p11[] values() {
        return (p11[]) h.clone();
    }
}
