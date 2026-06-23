package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class p9 extends yo1 implements Map {
    public gr0 j;
    public m9 k;
    public o9 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(yo1 yo1Var) {
        super(0);
        int i = yo1Var.i;
        b(this.i + i);
        if (this.i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(yo1Var.f(i2), yo1Var.i(i2));
            }
        } else if (i > 0) {
            u9.f0(0, 0, i, yo1Var.g, this.g);
            u9.g0(0, 0, i << 1, yo1Var.h, this.h);
            this.i = i;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        gr0 gr0Var = this.j;
        if (gr0Var != null) {
            return gr0Var;
        }
        gr0 gr0Var2 = new gr0(2, this);
        this.j = gr0Var2;
        return gr0Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.i;
    }

    @Override // java.util.Map
    public final Set keySet() {
        m9 m9Var = this.k;
        if (m9Var != null) {
            return m9Var;
        }
        m9 m9Var2 = new m9(this);
        this.k = m9Var2;
        return m9Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.i);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        o9 o9Var = this.l;
        if (o9Var != null) {
            return o9Var;
        }
        o9 o9Var2 = new o9(this);
        this.l = o9Var2;
        return o9Var2;
    }
}
