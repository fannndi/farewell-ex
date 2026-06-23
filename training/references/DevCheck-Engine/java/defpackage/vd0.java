package defpackage;

import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class vd0 {
    public static final yo1 b = new yo1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ae0 f1081a;

    public vd0(ae0 ae0Var) {
        this.f1081a = ae0Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        yo1 yo1Var = b;
        yo1 yo1Var2 = (yo1) yo1Var.get(classLoader);
        if (yo1Var2 == null) {
            yo1Var2 = new yo1(0);
            yo1Var.put(classLoader, yo1Var2);
        }
        Class cls = (Class) yo1Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        yo1Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        String str2 = QCeVODiUkb.ixfCqygl;
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new pt(d51.y(str2, str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new pt(d51.y(str2, str, ": make sure class name exists"), e2);
        }
    }

    public final ld0 a(String str) {
        try {
            return (ld0) c(this.f1081a.t.o.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new pt(d51.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new pt(d51.y("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new pt(d51.y("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new pt(d51.y("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
