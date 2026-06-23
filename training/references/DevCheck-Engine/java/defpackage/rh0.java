package defpackage;

import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rh0 implements WildcardType {
    public final Type g;
    public final Type h;

    public rh0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            c.m("At most one lower bound is supported");
            throw null;
        }
        if (typeArr.length != 1) {
            c.m(yFbVsaLCWAtQC.PsDUggoOMcTA);
            throw null;
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            sl.e(typeArr[0]);
            this.h = null;
            this.g = sl.d(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        sl.e(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            c.m("When lower bound is specified, upper bound must be Object");
            throw null;
        }
        this.h = sl.d(typeArr2[0]);
        this.g = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && sl.p(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.h;
        return type != null ? new Type[]{type} : sl.n;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.g};
    }

    public final int hashCode() {
        Type type = this.h;
        return (this.g.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.h;
        if (type != null) {
            return "? super " + sl.q0(type);
        }
        Type type2 = this.g;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + sl.q0(type2);
    }
}
