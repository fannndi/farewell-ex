package defpackage;

import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qh0 implements ParameterizedType {
    public final Type g;
    public final Type h;
    public final Type[] i;

    public qh0(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            rw.o("Must specify owner type for ", cls);
            throw null;
        }
        this.g = type != null ? sl.d(type) : null;
        this.h = sl.d(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.i = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.i[i]);
            sl.e(this.i[i]);
            Type[] typeArr3 = this.i;
            typeArr3[i] = sl.d(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && sl.p(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.i.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.g;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.i) ^ this.h.hashCode();
        Type type = this.g;
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        Type[] typeArr = this.i;
        int length = typeArr.length;
        Type type = this.h;
        if (length == 0) {
            return sl.q0(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(sl.q0(type));
        sb.append(jYVJoqfHJs.YINGxpeGmdaq);
        sb.append(sl.q0(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(sl.q0(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
