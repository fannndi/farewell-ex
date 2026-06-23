package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class s extends r implements ListIterator {
    public final /* synthetic */ u j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, int i) {
        super(0, uVar);
        this.j = uVar;
        int b = uVar.b();
        if (i < 0 || i > b) {
            c.g(d51.n(i, b, "index: ", ", size: "));
            throw null;
        }
        this.h = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.h > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.h;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            rw.k();
            return null;
        }
        int i = this.h - 1;
        this.h = i;
        return this.j.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.h - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
