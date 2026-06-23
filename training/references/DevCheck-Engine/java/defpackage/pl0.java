package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class pl0 extends AbstractCollection implements Serializable {
    public static final Object[] h = new Object[0];
    public static final Object[] i = new Object[0];
    public static final Object[] j = new Object[0];
    public final /* synthetic */ int g;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.g) {
            case 0:
                throw new UnsupportedOperationException();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.g) {
            case 0:
                throw new UnsupportedOperationException();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract int b(Object[] objArr);

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.g) {
            case 0:
                throw new UnsupportedOperationException();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public abstract int d();

    public abstract int e(Object[] objArr);

    public abstract Object[] f();

    public abstract Object[] g();

    public abstract int h();

    public abstract int i();

    public Object[] j() {
        return null;
    }

    public int k() {
        throw new UnsupportedOperationException();
    }

    public int l() {
        throw new UnsupportedOperationException();
    }

    public abstract int m(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.g) {
            case 0:
                throw new UnsupportedOperationException();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.g) {
            case 0:
                throw new UnsupportedOperationException();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.g) {
            case 0:
                throw new UnsupportedOperationException();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        switch (this.g) {
        }
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.g) {
            case 0:
                return toArray(h);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return toArray(i);
            default:
                return toArray(j);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.g) {
            case 0:
                objArr.getClass();
                int size = size();
                if (objArr.length < size) {
                    Object[] g = g();
                    if (g != null) {
                        break;
                    } else {
                        if (objArr.length != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size);
                    }
                } else if (objArr.length > size) {
                    objArr[size] = null;
                }
                e(objArr);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                objArr.getClass();
                int size2 = size();
                int length = objArr.length;
                if (length < size2) {
                    Object[] f = f();
                    if (f != null) {
                        break;
                    } else {
                        if (length != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size2);
                    }
                } else if (length > size2) {
                    objArr[size2] = null;
                }
                b(objArr);
                break;
            default:
                objArr.getClass();
                int size3 = size();
                int length2 = objArr.length;
                if (length2 < size3) {
                    Object[] j2 = j();
                    if (j2 != null) {
                        break;
                    } else {
                        if (length2 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size3);
                    }
                } else if (length2 > size3) {
                    objArr[size3] = null;
                }
                m(objArr);
                break;
        }
        return objArr;
    }
}
