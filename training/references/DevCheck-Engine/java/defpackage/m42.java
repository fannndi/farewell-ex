package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class m42 extends q42 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public m42(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.q42
    public final Object a(Class cls) {
        String f = zf.f(cls);
        if (f != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f));
        }
        return this.b.invoke(this.c, cls);
    }
}
