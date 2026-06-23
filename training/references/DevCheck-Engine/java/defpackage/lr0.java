package defpackage;

import Cwd.ynLVXgis;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class lr0 implements ListIterator {
    public int h;
    public int j;
    public final v k;
    public final /* synthetic */ int g = 0;
    public int i = -1;

    public lr0(mr0 mr0Var, int i) {
        int i2;
        this.k = mr0Var;
        this.h = i;
        i2 = ((AbstractList) mr0Var).modCount;
        this.j = i2;
    }

    public lr0(nr0 nr0Var, int i) {
        int i2;
        this.k = nr0Var;
        this.h = i;
        i2 = ((AbstractList) nr0Var).modCount;
        this.j = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((mr0) this.k).k).modCount;
        if (i != this.j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.g;
        v vVar = this.k;
        switch (i3) {
            case 0:
                a();
                mr0 mr0Var = (mr0) vVar;
                int i4 = this.h;
                this.h = i4 + 1;
                mr0Var.add(i4, obj);
                this.i = -1;
                i = ((AbstractList) mr0Var).modCount;
                this.j = i;
                break;
            default:
                b();
                nr0 nr0Var = (nr0) vVar;
                int i5 = this.h;
                this.h = i5 + 1;
                nr0Var.add(i5, obj);
                this.i = -1;
                i2 = ((AbstractList) nr0Var).modCount;
                this.j = i2;
                break;
        }
    }

    public void b() {
        int i;
        i = ((AbstractList) ((nr0) this.k)).modCount;
        if (i != this.j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.g;
        v vVar = this.k;
        switch (i) {
            case 0:
                if (this.h < ((mr0) vVar).i) {
                    break;
                }
                break;
            default:
                if (this.h < ((nr0) vVar).h) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.g) {
            case 0:
                if (this.h > 0) {
                }
                break;
            default:
                if (this.h > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.g;
        v vVar = this.k;
        switch (i) {
            case 0:
                a();
                int i2 = this.h;
                mr0 mr0Var = (mr0) vVar;
                if (i2 >= mr0Var.i) {
                    rw.k();
                    break;
                } else {
                    this.h = i2 + 1;
                    this.i = i2;
                    break;
                }
            default:
                b();
                int i3 = this.h;
                nr0 nr0Var = (nr0) vVar;
                if (i3 >= nr0Var.h) {
                    rw.k();
                    break;
                } else {
                    this.h = i3 + 1;
                    this.i = i3;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.g) {
        }
        return this.h;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.g;
        v vVar = this.k;
        switch (i) {
            case 0:
                a();
                int i2 = this.h;
                if (i2 <= 0) {
                    rw.k();
                    break;
                } else {
                    int i3 = i2 - 1;
                    this.h = i3;
                    this.i = i3;
                    mr0 mr0Var = (mr0) vVar;
                    break;
                }
            default:
                b();
                int i4 = this.h;
                if (i4 <= 0) {
                    rw.k();
                    break;
                } else {
                    int i5 = i4 - 1;
                    this.h = i5;
                    this.i = i5;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.g) {
            case 0:
                i = this.h;
                break;
            default:
                i = this.h;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.g;
        v vVar = this.k;
        switch (i3) {
            case 0:
                mr0 mr0Var = (mr0) vVar;
                a();
                int i4 = this.i;
                if (i4 == -1) {
                    c.n("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    mr0Var.c(i4);
                    this.h = this.i;
                    this.i = -1;
                    i = ((AbstractList) mr0Var).modCount;
                    this.j = i;
                    break;
                }
            default:
                nr0 nr0Var = (nr0) vVar;
                b();
                int i5 = this.i;
                if (i5 == -1) {
                    c.n("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    nr0Var.c(i5);
                    this.h = this.i;
                    this.i = -1;
                    i2 = ((AbstractList) nr0Var).modCount;
                    this.j = i2;
                    break;
                }
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.g;
        String str = ynLVXgis.VyGXww;
        v vVar = this.k;
        switch (i) {
            case 0:
                a();
                int i2 = this.i;
                if (i2 == -1) {
                    c.n(str);
                    break;
                } else {
                    ((mr0) vVar).set(i2, obj);
                    break;
                }
            default:
                b();
                int i3 = this.i;
                if (i3 == -1) {
                    c.n(str);
                    break;
                } else {
                    ((nr0) vVar).set(i3, obj);
                    break;
                }
        }
    }
}
