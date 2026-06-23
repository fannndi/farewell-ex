package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class sg2 extends h42 implements ListIterator {
    public final int h;
    public int i;
    public final wg2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg2(wg2 wg2Var, int i) {
        super(2);
        int size = wg2Var.size();
        if (i < 0 || i > size) {
            c.g(je2.d0(i, "index", size));
            throw null;
        }
        this.h = size;
        this.i = i;
        this.j = wg2Var;
    }

    public final Object a(int i) {
        return this.j.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.i < this.h;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.i > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            rw.k();
            return null;
        }
        int i = this.i;
        this.i = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            rw.k();
            return null;
        }
        int i = this.i - 1;
        this.i = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
