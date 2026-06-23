package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class gj1 implements Map.Entry {
    public final Object g;
    public final Object h;
    public gj1 i;
    public gj1 j;

    public gj1(Object obj, Object obj2) {
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gj1)) {
            return false;
        }
        gj1 gj1Var = (gj1) obj;
        return this.g.equals(gj1Var.g) && this.h.equals(gj1Var.h);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.h.hashCode() ^ this.g.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.g + "=" + this.h;
    }
}
