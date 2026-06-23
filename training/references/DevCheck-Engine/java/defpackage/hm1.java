package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class hm1 implements Iterator, dx {
    public int g;
    public Object h;
    public Iterator i;
    public dx j;

    public final RuntimeException a() {
        int i = this.g;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.g);
    }

    @Override // defpackage.dx
    public final qx d() {
        return n80.g;
    }

    @Override // defpackage.dx
    public final void g(Object obj) {
        om0.O(obj);
        this.g = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.g;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.i;
                it.getClass();
                if (it.hasNext()) {
                    this.g = 2;
                    return true;
                }
                this.i = null;
            }
            this.g = 5;
            dx dxVar = this.j;
            dxVar.getClass();
            this.j = null;
            dxVar.g(e42.f219a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.g;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            rw.k();
            return null;
        }
        if (i == 2) {
            this.g = 1;
            Iterator it = this.i;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw a();
        }
        this.g = 0;
        Object obj = this.h;
        this.h = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
