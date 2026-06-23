package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class t20 implements Iterator {
    public int g = -1;
    public int h;
    public int i;
    public rm0 j;
    public final /* synthetic */ u20 k;

    public t20(u20 u20Var) {
        this.k = u20Var;
        int length = ((CharSequence) u20Var.b).length();
        if (length < 0) {
            c.m(d51.p(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
            throw null;
        }
        length = length >= 0 ? 0 : length;
        this.h = length;
        this.i = length;
    }

    public final void a() {
        u20 u20Var = this.k;
        CharSequence charSequence = (CharSequence) u20Var.b;
        int i = this.i;
        if (i < 0) {
            this.g = 0;
            this.j = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.h;
            charSequence.getClass();
            this.j = new rm0(i2, charSequence.length() - 1, 1);
            this.i = -1;
        } else {
            z51 z51Var = (z51) ((pf0) u20Var.c).f(charSequence, Integer.valueOf(this.i));
            if (z51Var == null) {
                int i3 = this.h;
                charSequence.getClass();
                this.j = new rm0(i3, charSequence.length() - 1, 1);
                this.i = -1;
            } else {
                int intValue = ((Number) z51Var.g).intValue();
                int intValue2 = ((Number) z51Var.h).intValue();
                this.j = tl2.K(this.h, intValue);
                int i4 = intValue + intValue2;
                this.h = i4;
                this.i = i4 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g == -1) {
            a();
        }
        return this.g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g == -1) {
            a();
        }
        if (this.g == 0) {
            rw.k();
            return null;
        }
        rm0 rm0Var = this.j;
        rm0Var.getClass();
        this.j = null;
        this.g = -1;
        return rm0Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
