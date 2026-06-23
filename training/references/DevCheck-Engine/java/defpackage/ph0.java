package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ph0 implements GenericArrayType {
    public final Type g;

    public ph0(Type type) {
        Objects.requireNonNull(type);
        this.g = sl.d(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && sl.p(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.g;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return sl.q0(this.g) + "[]";
    }
}
