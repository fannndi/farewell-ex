package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class jj2 extends wi2 {
    public final transient lj2 i;
    public final transient kj2 j;

    public jj2(lj2 lj2Var, kj2 kj2Var) {
        this.i = lj2Var;
        this.j = kj2Var;
    }

    @Override // defpackage.ki2
    public final int b(Object[] objArr) {
        return this.j.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.i.get(obj) != null;
    }

    @Override // defpackage.wi2, defpackage.ki2
    public final qi2 e() {
        return this.j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.j.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i.l;
    }
}
