package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class mj2 extends wi2 {
    public static final Object[] n;
    public static final mj2 o;
    public final transient Object[] i;
    public final transient int j;
    public final transient Object[] k;
    public final transient int l;
    public final transient int m;

    static {
        Object[] objArr = new Object[0];
        n = objArr;
        o = new mj2(0, 0, 0, objArr, objArr);
    }

    public mj2(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.i = objArr;
        this.j = i;
        this.k = objArr2;
        this.l = i2;
        this.m = i3;
    }

    @Override // defpackage.ki2
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.i;
        int i = this.m;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.ki2
    public final int c() {
        return this.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.k;
            if (objArr.length != 0) {
                int W = pr.W(obj.hashCode());
                while (true) {
                    int i = W & this.l;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    W = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ki2
    public final int d() {
        return 0;
    }

    @Override // defpackage.ki2
    public final Object[] g() {
        return this.i;
    }

    @Override // defpackage.wi2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.j;
    }

    @Override // defpackage.wi2
    public final qi2 i() {
        return qi2.j(this.m, this.i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.m;
    }
}
