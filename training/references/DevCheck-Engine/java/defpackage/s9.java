package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class s9 implements d22 {
    @Override // defpackage.d22
    public final c22 a(nh0 nh0Var, l32 l32Var) {
        Type type = l32Var.b;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new t9(nh0Var, nh0Var.b(new l32(genericComponentType)), sl.C(genericComponentType));
    }
}
