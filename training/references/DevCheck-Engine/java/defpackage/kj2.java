package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class kj2 extends qi2 {
    public final transient Object[] i;
    public final transient int j;
    public final transient int k;

    public kj2(Object[] objArr, int i, int i2) {
        this.i = objArr;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.ki2
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tl2.M(i, this.k);
        Object obj = this.i[i + i + this.j];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.k;
    }
}
