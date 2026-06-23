package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class r9 implements Collection, Set {
    public int[] g;
    public Object[] h;
    public int i;

    public r9(int i) {
        this.g = k32.f512a;
        this.h = k32.c;
        if (i > 0) {
            this.g = new int[i];
            this.h = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int m;
        int i2 = this.i;
        if (obj == null) {
            m = md2.m(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            m = md2.m(this, obj, hashCode);
        }
        if (m >= 0) {
            return false;
        }
        int i3 = ~m;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.h;
            int[] iArr2 = new int[i4];
            this.g = iArr2;
            this.h = new Object[i4];
            if (i2 != this.i) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                u9.f0(0, 0, iArr.length, iArr, iArr2);
                u9.i0(0, objArr.length, 6, objArr, this.h);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.g;
            int i5 = i3 + 1;
            u9.f0(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.h;
            u9.g0(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.i;
        if (i2 == i6) {
            int[] iArr4 = this.g;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.h[i3] = obj;
                this.i = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.i;
        int i = this.i;
        int[] iArr = this.g;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.h;
            int[] iArr2 = new int[size];
            this.g = iArr2;
            this.h = new Object[size];
            if (i > 0) {
                u9.f0(0, 0, i, iArr, iArr2);
                u9.i0(0, this.i, 6, objArr, this.h);
            }
        }
        if (this.i != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final Object b(int i) {
        int i2 = this.i;
        Object[] objArr = this.h;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.g;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                u9.f0(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.h;
                u9.g0(i, i4, i2, objArr2, objArr2);
            }
            this.h[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.g = iArr2;
            this.h = new Object[i5];
            if (i > 0) {
                u9.f0(0, 0, i, iArr, iArr2);
                u9.i0(0, i, 6, objArr, this.h);
            }
            if (i < i3) {
                int i6 = i + 1;
                u9.f0(i, i6, i2, iArr, this.g);
                u9.g0(i, i6, i2, objArr, this.h);
            }
        }
        if (i2 != this.i) {
            throw new ConcurrentModificationException();
        }
        this.i = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.i != 0) {
            this.g = k32.f512a;
            this.h = k32.c;
            this.i = 0;
        }
        if (this.i != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? md2.m(this, null, 0) : md2.m(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.i != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.i;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.h[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.g;
        int i = this.i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.i <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new l9(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m = obj == null ? md2.m(this, null, 0) : md2.m(this, obj, obj.hashCode());
        if (m < 0) {
            return false;
        }
        b(m);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.i - 1; -1 < i; i--) {
            if (!collection.contains(this.h[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return u9.k0(this.h, 0, this.i);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.i;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        u9.g0(0, 0, this.i, this.h, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.i * 14);
        sb.append('{');
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.h[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
