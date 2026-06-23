package defpackage;

import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ly1 {
    public static final ly1 g;
    public static final ly1 h;
    public static final ly1 i;
    public static final ly1 j;
    public static final ly1 k;
    public static final ly1 l;
    public static final ly1 m;
    public static final ly1 n;
    public static final ly1 o;
    public static final ly1 p;
    public static final ly1 q;
    public static final ly1 r;
    public static final /* synthetic */ ly1[] s;

    static {
        ly1 ly1Var = new ly1("CPU_DIE", 0);
        g = ly1Var;
        ly1 ly1Var2 = new ly1("GPU_DIE", 1);
        h = ly1Var2;
        ly1 ly1Var3 = new ly1("SOC_DIE", 2);
        i = ly1Var3;
        ly1 ly1Var4 = new ly1("NPU_DIE", 3);
        j = ly1Var4;
        ly1 ly1Var5 = new ly1("TPU_DIE", 4);
        k = ly1Var5;
        ly1 ly1Var6 = new ly1("BATTERY", 5);
        l = ly1Var6;
        ly1 ly1Var7 = new ly1("SKIN", 6);
        m = ly1Var7;
        ly1 ly1Var8 = new ly1(QCeVODiUkb.aAdVUHbYPS, 7);
        n = ly1Var8;
        ly1 ly1Var9 = new ly1("RADIO_PA", 8);
        o = ly1Var9;
        ly1 ly1Var10 = new ly1("MODEM", 9);
        p = ly1Var10;
        ly1 ly1Var11 = new ly1("POWER", 10);
        ly1 ly1Var12 = new ly1("MEM", 11);
        q = ly1Var12;
        ly1 ly1Var13 = new ly1("OTHER", 12);
        r = ly1Var13;
        s = new ly1[]{ly1Var, ly1Var2, ly1Var3, ly1Var4, ly1Var5, ly1Var6, ly1Var7, ly1Var8, ly1Var9, ly1Var10, ly1Var11, ly1Var12, ly1Var13};
    }

    public static ly1 valueOf(String str) {
        return (ly1) Enum.valueOf(ly1.class, str);
    }

    public static ly1[] values() {
        return (ly1[]) s.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        return ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4;
    }
}
