package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class jl2 implements Iterator {
    public int g = 0;
    public final int h;
    public final /* synthetic */ ll2 i;

    public jl2(ll2 ll2Var) {
        this.i = ll2Var;
        this.h = ll2Var.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.h;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.g;
        if (i < this.h) {
            this.g = i + 1;
            return Byte.valueOf(this.i.c(i));
        }
        rw.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
