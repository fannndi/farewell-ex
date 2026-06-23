package defpackage;

import android.telephony.fHMN.BFtDZYxPcpGN;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class vq implements uq {
    public static final Map b;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1097a;

    static {
        List S = zr.S(af0.class, lf0.class, pf0.class, qf0.class, rf0.class, sf0.class, ac2.class, tf0.class, uf0.class, vf0.class, bf0.class, cf0.class, df0.class, ef0.class, ff0.class, gf0.class, hf0.class, if0.class, jf0.class, kf0.class, mf0.class, nf0.class, of0.class);
        ArrayList arrayList = new ArrayList(as.U(S));
        int i = 0;
        for (Object obj : S) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new z51((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = ju0.u0(arrayList);
    }

    public vq(Class cls) {
        cls.getClass();
        this.f1097a = cls;
    }

    @Override // defpackage.uq
    public final Class a() {
        return this.f1097a;
    }

    public final String b() {
        String f;
        Class cls = this.f1097a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String f2 = md2.f(cls.getName());
            return f2 == null ? cls.getCanonicalName() : f2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (f = md2.f(componentType.getName())) != null) {
            str = f.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String c() {
        String y;
        Class cls = this.f1097a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String y2 = md2.y(cls.getName());
                return y2 == null ? cls.getSimpleName() : y2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (y = md2.y(componentType.getName())) != null) {
                str = y.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return as1.q0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int f0 = as1.f0(simpleName, '$', 0, 6);
            return f0 == -1 ? simpleName : simpleName.substring(f0 + 1, simpleName.length());
        }
        return as1.q0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean d(Object obj) {
        Class cls = this.f1097a;
        cls.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return k32.A(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = tl2.u(af1.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vq) && tl2.u(this).equals(tl2.u((vq) obj));
    }

    public final int hashCode() {
        return tl2.u(this).hashCode();
    }

    public final String toString() {
        return this.f1097a.toString() + BFtDZYxPcpGN.sfMztkEetFr;
    }
}
