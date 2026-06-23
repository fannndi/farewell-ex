package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class n9 implements Iterator, Map.Entry {
    public int g;
    public int h = -1;
    public boolean i;
    public final /* synthetic */ p9 j;

    public n9(p9 p9Var) {
        this.j = p9Var;
        this.g = p9Var.i - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.i) {
            c.n("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.h;
            p9 p9Var = this.j;
            if (ym0.b(key, p9Var.f(i)) && ym0.b(entry.getValue(), p9Var.i(this.h))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.i) {
            return this.j.f(this.h);
        }
        c.n("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.i) {
            return this.j.i(this.h);
        }
        c.n("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.i) {
            c.n("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.h;
        p9 p9Var = this.j;
        Object f = p9Var.f(i);
        Object i2 = p9Var.i(this.h);
        return (f == null ? 0 : f.hashCode()) ^ (i2 != null ? i2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            rw.k();
            return null;
        }
        this.h++;
        this.i = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException();
        }
        this.j.g(this.h);
        this.h--;
        this.g--;
        this.i = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.i) {
            return this.j.h(this.h, obj);
        }
        c.n("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
