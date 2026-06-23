package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class n42 extends q42 {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public n42(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.q42
    public final Object a(Class cls) {
        String f = zf.f(cls);
        if (f != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(f));
        }
        return this.b.invoke(null, cls, Integer.valueOf(this.c));
    }
}
