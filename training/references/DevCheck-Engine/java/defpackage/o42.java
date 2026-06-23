package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o42 extends q42 {
    public final /* synthetic */ Method b;

    public o42(Method method) {
        this.b = method;
    }

    @Override // defpackage.q42
    public final Object a(Class cls) {
        String f = zf.f(cls);
        if (f != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f));
        }
        return this.b.invoke(null, cls, Object.class);
    }
}
