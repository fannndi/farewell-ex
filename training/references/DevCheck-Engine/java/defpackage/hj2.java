package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hj2 extends qi2 {
    public final /* synthetic */ ij2 i;

    public hj2(ij2 ij2Var) {
        this.i = ij2Var;
    }

    @Override // defpackage.ki2
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        ij2 ij2Var = this.i;
        tl2.M(i, ij2Var.k);
        Object[] objArr = ij2Var.j;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i.k;
    }
}
