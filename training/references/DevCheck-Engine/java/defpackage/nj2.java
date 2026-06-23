package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class nj2 extends wi2 implements Iterable, NavigableSet {
    public static final nj2 l;
    public final transient Comparator i;
    public transient nj2 j;
    public final transient qi2 k;

    static {
        ni2 ni2Var = qi2.h;
        l = new nj2(gj2.k, dj2.h);
    }

    public nj2(qi2 qi2Var, Comparator comparator) {
        this.i = comparator;
        this.k = qi2Var;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ki2
    public final int b(Object[] objArr) {
        return this.k.b(objArr);
    }

    @Override // defpackage.ki2
    public final int c() {
        return this.k.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int l2 = l(obj, true);
        qi2 qi2Var = this.k;
        if (l2 == qi2Var.size()) {
            return null;
        }
        return qi2Var.get(l2);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.k, obj, this.i) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.i;
        if (!om0.S(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        ni2 listIterator = this.k.listIterator(0);
        Iterator it = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.ki2
    public final int d() {
        return this.k.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.k.h().listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        nj2 nj2Var;
        nj2 nj2Var2 = this.j;
        if (nj2Var2 != null) {
            return nj2Var2;
        }
        Comparator reverseOrder = Collections.reverseOrder(this.i);
        if (!isEmpty()) {
            nj2Var = new nj2(this.k.h(), reverseOrder);
        } else if (dj2.h != reverseOrder) {
            ni2 ni2Var = qi2.h;
            nj2Var = new nj2(gj2.k, reverseOrder);
        } else {
            nj2Var = l;
        }
        this.j = nj2Var;
        nj2Var.j = this;
        return nj2Var;
    }

    @Override // defpackage.wi2, defpackage.ki2
    public final qi2 e() {
        return this.k;
    }

    @Override // defpackage.wi2, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            qi2 qi2Var = this.k;
            if (qi2Var.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.i;
                if (!om0.S(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    ni2 listIterator = qi2Var.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.k.get(0);
        }
        rw.k();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int k = k(obj, true) - 1;
        if (k == -1) {
            return null;
        }
        return this.k.get(k);
    }

    @Override // defpackage.ki2
    public final Object[] g() {
        return this.k.g();
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return m(0, k(obj, z));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        return m(0, k(obj, false));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int l2 = l(obj, false);
        qi2 qi2Var = this.k;
        if (l2 == qi2Var.size()) {
            return null;
        }
        return qi2Var.get(l2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.k.listIterator(0);
    }

    public final int k(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.k, obj, this.i);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int l(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.k, obj, this.i);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            rw.k();
            return null;
        }
        return this.k.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int k = k(obj, false) - 1;
        if (k == -1) {
            return null;
        }
        return this.k.get(k);
    }

    public final nj2 m(int i, int i2) {
        qi2 qi2Var = this.k;
        if (i == 0) {
            if (i2 == qi2Var.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.i;
        if (i < i2) {
            return new nj2(qi2Var.subList(i, i2), comparator);
        }
        if (dj2.h == comparator) {
            return l;
        }
        ni2 ni2Var = qi2.h;
        return new nj2(gj2.k, comparator);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.k.size();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.i.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        nj2 m = m(l(obj, z), this.k.size());
        return m.m(0, m.k(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.i.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        nj2 m = m(l(obj, true), this.k.size());
        return m.m(0, m.k(obj2, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return m(l(obj, z), this.k.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        return m(l(obj, true), this.k.size());
    }
}
