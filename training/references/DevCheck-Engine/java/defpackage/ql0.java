package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class ql0 extends h42 implements ListIterator {
    public final int h;
    public int i;
    public final sl0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql0(sl0 sl0Var, int i) {
        super(0);
        int size = sl0Var.size();
        if (i < 0 || i > size) {
            c.g(kk1.g(i, "index", size));
            throw null;
        }
        this.h = size;
        this.i = i;
        this.j = sl0Var;
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
