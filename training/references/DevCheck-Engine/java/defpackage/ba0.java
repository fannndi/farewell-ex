package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ba0 implements d22, Cloneable {
    public static final ba0 i = new ba0();
    public final List g;
    public final List h;

    public ba0() {
        List list = Collections.EMPTY_LIST;
        this.g = list;
        this.h = list;
    }

    @Override // defpackage.d22
    public final c22 a(nh0 nh0Var, l32 l32Var) {
        Class cls = l32Var.f569a;
        boolean b = b(cls, true);
        boolean b2 = b(cls, false);
        if (b || b2) {
            return new aa0(this, b2, b, nh0Var, l32Var);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            c3 c3Var = ef1.f230a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.g : this.h).iterator();
        if (it.hasNext()) {
            throw d51.l(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (ba0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
