package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class hu0 extends w {
    public final /* synthetic */ int g;
    public final gu0 h;

    public /* synthetic */ hu0(gu0 gu0Var, int i) {
        this.g = i;
        this.h = gu0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.g) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.g;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.w
    public final int b() {
        switch (this.g) {
        }
        return this.h.o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.g) {
            case 0:
                this.h.clear();
                break;
            default:
                this.h.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.g;
        gu0 gu0Var = this.h;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                gu0Var.getClass();
                int g = gu0Var.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object[] objArr = gu0Var.h;
                objArr.getClass();
                return ym0.b(objArr[g], entry.getValue());
            default:
                return gu0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.g) {
            case 0:
                collection.getClass();
                return this.h.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.g) {
        }
        return this.h.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.g;
        gu0 gu0Var = this.h;
        switch (i) {
            case 0:
                gu0Var.getClass();
                return new du0(gu0Var, 0);
            default:
                gu0Var.getClass();
                return new du0(gu0Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.g;
        gu0 gu0Var = this.h;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    gu0Var.getClass();
                    gu0Var.c();
                    int g = gu0Var.g(entry.getKey());
                    if (g >= 0) {
                        Object[] objArr = gu0Var.h;
                        objArr.getClass();
                        if (ym0.b(objArr[g], entry.getValue())) {
                            gu0Var.k(g);
                            break;
                        }
                    }
                }
                break;
            default:
                gu0Var.c();
                int g2 = gu0Var.g(obj);
                if (g2 >= 0) {
                    gu0Var.k(g2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.g;
        gu0 gu0Var = this.h;
        collection.getClass();
        switch (i) {
            case 0:
                gu0Var.c();
                break;
            default:
                gu0Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.g;
        gu0 gu0Var = this.h;
        collection.getClass();
        switch (i) {
            case 0:
                gu0Var.c();
                break;
            default:
                gu0Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
