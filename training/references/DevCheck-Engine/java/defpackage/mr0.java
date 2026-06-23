package defpackage;

import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class mr0 extends v implements RandomAccess, Serializable {
    public Object[] g;
    public final int h;
    public int i;
    public final mr0 j;
    public final nr0 k;

    public mr0(Object[] objArr, int i, int i2, mr0 mr0Var, nr0 nr0Var) {
        int i3;
        objArr.getClass();
        nr0Var.getClass();
        this.g = objArr;
        this.h = i;
        this.i = i2;
        this.j = mr0Var;
        this.k = nr0Var;
        i3 = ((AbstractList) nr0Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i2 = this.i;
        if (i < 0 || i > i2) {
            c.g(d51.n(i, i2, "index: ", ", size: "));
        } else {
            f(this.h + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.h + this.i, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        g();
        int i2 = this.i;
        if (i < 0 || i > i2) {
            c.g(d51.n(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        e(this.h + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        g();
        int size = collection.size();
        e(this.h + this.i, collection, size);
        return size > 0;
    }

    @Override // defpackage.v
    public final int b() {
        g();
        return this.i;
    }

    @Override // defpackage.v
    public final Object c(int i) {
        h();
        g();
        int i2 = this.i;
        if (i >= 0 && i < i2) {
            return i(this.h + i);
        }
        c.g(d51.n(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.h, this.i);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        nr0 nr0Var = this.k;
        mr0 mr0Var = this.j;
        if (mr0Var != null) {
            mr0Var.e(i, collection, i2);
        } else {
            nr0 nr0Var2 = nr0.j;
            nr0Var.e(i, collection, i2);
        }
        this.g = nr0Var.g;
        this.i += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.g;
            int i = this.i;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (ym0.b(objArr[this.h + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        nr0 nr0Var = this.k;
        mr0 mr0Var = this.j;
        if (mr0Var != null) {
            mr0Var.f(i, obj);
        } else {
            nr0 nr0Var2 = nr0.j;
            nr0Var.f(i, obj);
        }
        this.g = nr0Var.g;
        this.i++;
    }

    public final void g() {
        int i;
        i = ((AbstractList) this.k).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i2 = this.i;
        if (i >= 0 && i < i2) {
            return this.g[this.h + i];
        }
        c.g(d51.n(i, i2, nTAZxGMqQtZZAQ.GYbiaVFQZnkjq, ", size: "));
        return null;
    }

    public final void h() {
        if (this.k.i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.g;
        int i = this.i;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.h + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final Object i(int i) {
        Object i2;
        ((AbstractList) this).modCount++;
        mr0 mr0Var = this.j;
        if (mr0Var != null) {
            i2 = mr0Var.i(i);
        } else {
            nr0 nr0Var = nr0.j;
            i2 = this.k.i(i);
        }
        this.i--;
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.i; i++) {
            if (ym0.b(this.g[this.h + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        mr0 mr0Var = this.j;
        if (mr0Var != null) {
            mr0Var.j(i, i2);
        } else {
            nr0 nr0Var = nr0.j;
            this.k.j(i, i2);
        }
        this.i -= i2;
    }

    public final int k(int i, int i2, Collection collection, boolean z) {
        int k;
        mr0 mr0Var = this.j;
        if (mr0Var != null) {
            k = mr0Var.k(i, i2, collection, z);
        } else {
            nr0 nr0Var = nr0.j;
            k = this.k.k(i, i2, collection, z);
        }
        if (k > 0) {
            ((AbstractList) this).modCount++;
        }
        this.i -= k;
        return k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.i - 1; i >= 0; i--) {
            if (ym0.b(this.g[this.h + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i2 = this.i;
        if (i >= 0 && i <= i2) {
            return new lr0(this, i);
        }
        c.g(d51.n(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.h, this.i, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.h, this.i, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i2 = this.i;
        if (i < 0 || i >= i2) {
            c.g(d51.n(i, i2, "index: ", Gvyagftz.aLNGyluQHZAsgdA));
            return null;
        }
        Object[] objArr = this.g;
        int i3 = this.h;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        tl2.f(i, i2, this.i);
        return new mr0(this.g, this.h + i, i2 - i, this, this.k);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.g;
        int i = this.i;
        int i2 = this.h;
        return u9.k0(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        g();
        int length = objArr.length;
        int i = this.i;
        Object[] objArr2 = this.g;
        int i2 = this.h;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        u9.g0(0, i2, i + i2, objArr2, objArr);
        int i3 = this.i;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return bw0.a(this.g, this.h, this.i, this);
    }
}
