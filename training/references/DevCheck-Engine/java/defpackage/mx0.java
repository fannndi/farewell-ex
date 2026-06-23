package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class mx0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f659a;
    public u32 b;

    public mx0(int i) {
        this.f659a = new SparseArray(i);
    }

    public final void a(u32 u32Var, int i, int i2) {
        int a2 = u32Var.a(i);
        SparseArray sparseArray = this.f659a;
        mx0 mx0Var = sparseArray == null ? null : (mx0) sparseArray.get(a2);
        if (mx0Var == null) {
            mx0Var = new mx0(1);
            sparseArray.put(u32Var.a(i), mx0Var);
        }
        if (i2 > i) {
            mx0Var.a(u32Var, i + 1, i2);
        } else {
            mx0Var.b = u32Var;
        }
    }
}
