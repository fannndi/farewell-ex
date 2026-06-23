package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class hr0 implements Map.Entry {
    public hr0 g;
    public hr0 h;
    public hr0 i;
    public hr0 j;
    public hr0 k;
    public final Object l;
    public final boolean m;
    public Object n;
    public int o;

    public hr0(boolean z) {
        this.l = null;
        this.m = z;
        this.k = this;
        this.j = this;
    }

    public hr0(boolean z, hr0 hr0Var, Object obj, hr0 hr0Var2, hr0 hr0Var3) {
        this.g = hr0Var;
        this.l = obj;
        this.m = z;
        this.o = 1;
        this.j = hr0Var2;
        this.k = hr0Var3;
        hr0Var3.j = this;
        hr0Var2.k = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.l;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.n;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.l;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.n;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.m) {
            jw0.f("value == null");
            return null;
        }
        Object obj2 = this.n;
        this.n = obj;
        return obj2;
    }

    public final String toString() {
        return this.l + "=" + this.n;
    }
}
