package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class oj2 extends wi2 {
    public final transient Object i;

    public oj2(Object obj) {
        this.i = obj;
    }

    @Override // defpackage.ki2
    public final int b(Object[] objArr) {
        objArr[0] = this.i;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.i.equals(obj);
    }

    @Override // defpackage.wi2, defpackage.ki2
    public final qi2 e() {
        Object[] objArr = {this.i};
        for (int i = 0; i < 1; i++) {
            ni2 ni2Var = qi2.h;
            if (objArr[i] == null) {
                jw0.f(d51.q("at index ", i));
                return null;
            }
        }
        return qi2.j(1, objArr);
    }

    @Override // defpackage.wi2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new yi2(this.i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return d51.y("[", this.i.toString(), "]");
    }
}
