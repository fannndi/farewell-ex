package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class de2 extends be2 {
    public static final Object[] o;
    public static final de2 p;
    public final transient Object[] m;
    public final transient Object[] n;

    static {
        Object[] objArr = new Object[0];
        o = objArr;
        p = new de2(objArr, objArr);
    }

    public de2(Object[] objArr, Object[] objArr2) {
        super(1);
        this.m = objArr;
        this.n = objArr2;
    }

    @Override // defpackage.pl0
    public final int b(Object[] objArr) {
        System.arraycopy(this.m, 0, objArr, 0, 0);
        return 0;
    }

    @Override // defpackage.pl0
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.n.length;
        return false;
    }

    @Override // defpackage.pl0
    public final int d() {
        return 0;
    }

    @Override // defpackage.pl0
    public final Object[] f() {
        return this.m;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ce2 ce2Var = this.k;
        if (ce2Var == null) {
            yd2 yd2Var = ae2.k;
            ce2Var = ce2.m;
            this.k = ce2Var;
        }
        return ce2Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
