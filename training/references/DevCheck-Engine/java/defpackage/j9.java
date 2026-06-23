package defpackage;

import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j9 extends v {
    public static final Object[] j = new Object[0];
    public int g;
    public Object[] h = j;
    public int i;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.i;
        if (i < 0 || i > i3) {
            c.g(d51.n(i, i3, "index: ", ", size: "));
            return;
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        j();
        e(this.i + 1);
        int i4 = i(this.g + i);
        int i5 = this.i;
        if (i < ((i5 + 1) >> 1)) {
            if (i4 == 0) {
                Object[] objArr = this.h;
                objArr.getClass();
                i2 = objArr.length - 1;
            } else {
                i2 = i4 - 1;
            }
            int i6 = this.g;
            if (i6 == 0) {
                Object[] objArr2 = this.h;
                objArr2.getClass();
                i6 = objArr2.length;
            }
            int i7 = i6 - 1;
            int i8 = this.g;
            Object[] objArr3 = this.h;
            if (i2 >= i8) {
                objArr3[i7] = objArr3[i8];
                u9.g0(i8, i8 + 1, i2 + 1, objArr3, objArr3);
            } else {
                u9.g0(i8 - 1, i8, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.h;
                objArr4[objArr4.length - 1] = objArr4[0];
                u9.g0(0, 1, i2 + 1, objArr4, objArr4);
            }
            this.h[i2] = obj;
            this.g = i7;
        } else {
            int i9 = i(i5 + this.g);
            Object[] objArr5 = this.h;
            if (i4 < i9) {
                u9.g0(i4 + 1, i4, i9, objArr5, objArr5);
            } else {
                u9.g0(1, 0, i9, objArr5, objArr5);
                Object[] objArr6 = this.h;
                objArr6[0] = objArr6[objArr6.length - 1];
                u9.g0(i4 + 1, i4, objArr6.length - 1, objArr6, objArr6);
            }
            this.h[i4] = obj;
        }
        this.i++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.i;
        if (i < 0 || i > i2) {
            c.g(d51.n(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.i) {
            return addAll(collection);
        }
        j();
        e(collection.size() + this.i);
        int i3 = i(this.i + this.g);
        int i4 = i(this.g + i);
        int size = collection.size();
        if (i >= ((this.i + 1) >> 1)) {
            int i5 = i4 + size;
            Object[] objArr = this.h;
            if (i4 < i3) {
                int i6 = size + i3;
                if (i6 <= objArr.length) {
                    u9.g0(i5, i4, i3, objArr, objArr);
                } else if (i5 >= objArr.length) {
                    u9.g0(i5 - objArr.length, i4, i3, objArr, objArr);
                } else {
                    int length = i3 - (i6 - objArr.length);
                    u9.g0(0, length, i3, objArr, objArr);
                    Object[] objArr2 = this.h;
                    u9.g0(i5, i4, length, objArr2, objArr2);
                }
            } else {
                u9.g0(size, 0, i3, objArr, objArr);
                Object[] objArr3 = this.h;
                if (i5 >= objArr3.length) {
                    u9.g0(i5 - objArr3.length, i4, objArr3.length, objArr3, objArr3);
                } else {
                    u9.g0(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.h;
                    u9.g0(i5, i4, objArr4.length - size, objArr4, objArr4);
                }
            }
            d(i4, collection);
            return true;
        }
        int i7 = this.g;
        int i8 = i7 - size;
        Object[] objArr5 = this.h;
        if (i4 < i7) {
            u9.g0(i8, i7, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.h;
            if (size >= i4) {
                u9.g0(objArr6.length - size, 0, i4, objArr6, objArr6);
            } else {
                u9.g0(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.h;
                u9.g0(0, size, i4, objArr7, objArr7);
            }
        } else if (i8 >= 0) {
            u9.g0(i8, i7, i4, objArr5, objArr5);
        } else {
            i8 += objArr5.length;
            int i9 = i4 - i7;
            int length2 = objArr5.length - i8;
            if (length2 >= i9) {
                u9.g0(i8, i7, i4, objArr5, objArr5);
            } else {
                u9.g0(i8, i7, i7 + length2, objArr5, objArr5);
                Object[] objArr8 = this.h;
                u9.g0(0, this.g + length2, i4, objArr8, objArr8);
            }
        }
        this.g = i8;
        d(g(i4 - size), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        j();
        e(collection.size() + b());
        d(i(b() + this.g), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        e(this.i + 1);
        int i = this.g;
        if (i == 0) {
            Object[] objArr = this.h;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.g = i2;
        this.h[i2] = obj;
        this.i++;
    }

    public final void addLast(Object obj) {
        j();
        e(b() + 1);
        this.h[i(b() + this.g)] = obj;
        this.i = b() + 1;
    }

    @Override // defpackage.v
    public final int b() {
        return this.i;
    }

    @Override // defpackage.v
    public final Object c(int i) {
        int i2 = this.i;
        if (i < 0 || i >= i2) {
            c.g(d51.n(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == b() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        j();
        int i3 = i(this.g + i);
        Object[] objArr = this.h;
        Object obj = objArr[i3];
        int i4 = this.i >> 1;
        int i5 = this.g;
        if (i < i4) {
            if (i3 >= i5) {
                u9.g0(i5 + 1, i5, i3, objArr, objArr);
            } else {
                u9.g0(1, 0, i3, objArr, objArr);
                Object[] objArr2 = this.h;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.g;
                u9.g0(i6 + 1, i6, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.h;
            int i7 = this.g;
            objArr3[i7] = null;
            this.g = f(i7);
        } else {
            int i8 = i((b() - 1) + i5);
            Object[] objArr4 = this.h;
            if (i3 <= i8) {
                u9.g0(i3, i3 + 1, i8 + 1, objArr4, objArr4);
            } else {
                u9.g0(i3, i3 + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.h;
                objArr5[objArr5.length - 1] = objArr5[0];
                u9.g0(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.h[i8] = null;
        }
        this.i--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.g, i(b() + this.g));
        }
        this.g = 0;
        this.i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.h.length;
        while (i < length && it.hasNext()) {
            this.h[i] = it.next();
            i++;
        }
        int i2 = this.g;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.h[i3] = it.next();
        }
        this.i = collection.size() + this.i;
    }

    public final void e(int i) {
        if (i < 0) {
            c.n("Deque is too big.");
            return;
        }
        Object[] objArr = this.h;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == j) {
            if (i < 10) {
                i = 10;
            }
            this.h = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        u9.g0(0, this.g, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.h;
        int length2 = objArr3.length;
        int i3 = this.g;
        u9.g0(length2 - i3, 0, i3, objArr3, objArr2);
        this.g = 0;
        this.h = objArr2;
    }

    public final int f(int i) {
        this.h.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int g(int i) {
        return i < 0 ? i + this.h.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int b = b();
        if (i >= 0 && i < b) {
            return this.h[i(this.g + i)];
        }
        c.g(d51.n(i, b, "index: ", ", size: "));
        return null;
    }

    public final void h(int i, int i2) {
        Object[] objArr = this.h;
        if (i < i2) {
            u9.l0(objArr, null, i, i2);
        } else {
            u9.l0(objArr, null, i, objArr.length);
            u9.l0(this.h, null, 0, i2);
        }
    }

    public final int i(int i) {
        Object[] objArr = this.h;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int i2 = i(b() + this.g);
        int i3 = this.g;
        if (i3 < i2) {
            while (i3 < i2) {
                if (ym0.b(obj, this.h[i3])) {
                    i = this.g;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i3 = this.g) < i2) {
            return -1;
        }
        int length = this.h.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (ym0.b(obj, this.h[i4])) {
                        i3 = i4 + this.h.length;
                        i = this.g;
                    }
                }
                return -1;
            }
            if (ym0.b(obj, this.h[i3])) {
                i = this.g;
                break;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int i2 = i(this.i + this.g);
        int i3 = this.g;
        if (i3 < i2) {
            length = i2 - 1;
            if (i3 <= length) {
                while (!ym0.b(obj, this.h[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i = this.g;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.g >= i2) {
            while (true) {
                i2--;
                Object[] objArr = this.h;
                if (-1 >= i2) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i4 = this.g;
                    if (i4 <= length) {
                        while (!ym0.b(obj, this.h[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.g;
                    }
                } else if (ym0.b(obj, objArr[i2])) {
                    length = i2 + this.h.length;
                    i = this.g;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.h.length != 0) {
            int i2 = i(b() + this.g);
            int i3 = this.g;
            if (i3 < i2) {
                i = i3;
                while (true) {
                    objArr = this.h;
                    if (i3 >= i2) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.h[i] = obj;
                        i++;
                    }
                    i3++;
                }
                u9.l0(objArr, null, i, i2);
            } else {
                int length = this.h.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.h;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.h[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.h;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.h[i] = obj3;
                        i = f(i);
                    }
                }
                z = z2;
            }
            if (z) {
                j();
                this.i = g(i - this.g);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException(CDsMEtnUjndKau.qBsQa);
        }
        j();
        Object[] objArr = this.h;
        int i = this.g;
        Object obj = objArr[i];
        objArr[i] = null;
        this.g = f(i);
        this.i = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i = i((size() - 1) + this.g);
        Object[] objArr = this.h;
        Object obj = objArr[i];
        objArr[i] = null;
        this.i = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        tl2.f(i, i2, this.i);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.i) {
            clear();
            return;
        }
        if (i3 == 1) {
            c(i);
            return;
        }
        j();
        int i4 = this.i - i2;
        int i5 = this.g;
        if (i < i4) {
            int i6 = i((i - 1) + i5);
            int i7 = i(this.g + (i2 - 1));
            while (i > 0) {
                int i8 = i6 + 1;
                int min = Math.min(i, Math.min(i8, i7 + 1));
                Object[] objArr = this.h;
                int i9 = i7 - min;
                int i10 = i6 - min;
                u9.g0(i9 + 1, i10 + 1, i8, objArr, objArr);
                i6 = g(i10);
                i7 = g(i9);
                i -= min;
            }
            int i11 = i(this.g + i3);
            h(this.g, i11);
            this.g = i11;
        } else {
            int i12 = i(i5 + i2);
            int i13 = i(this.g + i);
            int i14 = this.i;
            while (true) {
                i14 -= i2;
                if (i14 <= 0) {
                    break;
                }
                Object[] objArr2 = this.h;
                i2 = Math.min(i14, Math.min(objArr2.length - i12, objArr2.length - i13));
                Object[] objArr3 = this.h;
                int i15 = i12 + i2;
                u9.g0(i13, i12, i15, objArr3, objArr3);
                i12 = i(i15);
                i13 = i(i13 + i2);
            }
            int i16 = i(this.i + this.g);
            h(g(i16 - i3), i16);
        }
        this.i -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.h.length != 0) {
            int i2 = i(b() + this.g);
            int i3 = this.g;
            if (i3 < i2) {
                i = i3;
                while (true) {
                    objArr = this.h;
                    if (i3 >= i2) {
                        break;
                    }
                    Object obj = objArr[i3];
                    if (collection.contains(obj)) {
                        this.h[i] = obj;
                        i++;
                    } else {
                        z = true;
                    }
                    i3++;
                }
                u9.l0(objArr, null, i, i2);
            } else {
                int length = this.h.length;
                boolean z2 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr2 = this.h;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.h[i4] = obj2;
                        i4++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                i = i(i4);
                for (int i5 = 0; i5 < i2; i5++) {
                    Object[] objArr3 = this.h;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        this.h[i] = obj3;
                        i = f(i);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                j();
                this.i = g(i - this.g);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int b = b();
        if (i < 0 || i >= b) {
            c.g(d51.n(i, b, "index: ", ", size: "));
            return null;
        }
        int i2 = i(this.g + i);
        Object[] objArr = this.h;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.i;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int i2 = i(this.i + this.g);
        int i3 = this.g;
        if (i3 < i2) {
            u9.i0(i3, i2, 2, this.h, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.h;
            u9.g0(0, this.g, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.h;
            u9.g0(objArr3.length - this.g, 0, i2, objArr3, objArr);
        }
        int i4 = this.i;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
