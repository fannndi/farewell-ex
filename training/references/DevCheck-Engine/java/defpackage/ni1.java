package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ni1 {

    /* renamed from: a, reason: collision with root package name */
    public o92 f684a;
    public ArrayList b;

    public static long a(c30 c30Var, long j) {
        o92 o92Var = c30Var.d;
        ArrayList arrayList = c30Var.k;
        if (o92Var instanceof yi0) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            w20 w20Var = (w20) arrayList.get(i);
            if (w20Var instanceof c30) {
                c30 c30Var2 = (c30) w20Var;
                if (c30Var2.d != o92Var) {
                    j2 = Math.min(j2, a(c30Var2, c30Var2.f + j));
                }
            }
        }
        c30 c30Var3 = o92Var.i;
        c30 c30Var4 = o92Var.h;
        if (c30Var != c30Var3) {
            return j2;
        }
        long j3 = j - o92Var.j();
        return Math.min(Math.min(j2, a(c30Var4, j3)), j3 - c30Var4.f);
    }

    public static long b(c30 c30Var, long j) {
        o92 o92Var = c30Var.d;
        ArrayList arrayList = c30Var.k;
        if (o92Var instanceof yi0) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            w20 w20Var = (w20) arrayList.get(i);
            if (w20Var instanceof c30) {
                c30 c30Var2 = (c30) w20Var;
                if (c30Var2.d != o92Var) {
                    j2 = Math.max(j2, b(c30Var2, c30Var2.f + j));
                }
            }
        }
        c30 c30Var3 = o92Var.h;
        c30 c30Var4 = o92Var.i;
        if (c30Var != c30Var3) {
            return j2;
        }
        long j3 = o92Var.j() + j;
        return Math.max(Math.max(j2, b(c30Var4, j3)), j3 - c30Var4.f);
    }
}
