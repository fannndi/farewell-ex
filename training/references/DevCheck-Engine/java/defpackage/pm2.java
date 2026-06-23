package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class pm2 extends el2 implements RandomAccess {
    public static final Object[] j;
    public static final pm2 k;
    public Object[] h;
    public int i;

    static {
        Object[] objArr = new Object[0];
        j = objArr;
        k = new pm2(objArr, 0, false);
    }

    public pm2(Object[] objArr, int i, boolean z) {
        super(z);
        this.h = objArr;
        this.i = i;
    }

    @Override // defpackage.yl2
    public final /* bridge */ /* synthetic */ yl2 a(int i) {
        if (i >= this.i) {
            return new pm2(i == 0 ? j : Arrays.copyOf(this.h, i), this.i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i < 0 || i > (i2 = this.i)) {
            c.g(d51.n(i, this.i, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.h;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.h, 0, objArr2, 0, i);
            System.arraycopy(this.h, i, objArr2, i3, this.i - i);
            this.h = objArr2;
        }
        this.h[i] = obj;
        this.i++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.i;
        int length = this.h.length;
        if (i == length) {
            this.h = Arrays.copyOf(this.h, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.h;
        int i2 = this.i;
        this.i = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.i) {
            c.g(d51.n(i, this.i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.h[i];
    }

    @Override // defpackage.el2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        Object[] objArr = this.h;
        Object obj = objArr[i];
        if (i < this.i - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        c(i);
        Object[] objArr = this.h;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }
}
