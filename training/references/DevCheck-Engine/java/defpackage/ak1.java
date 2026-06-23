package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ak1 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f33a = zr.S(Application.class, oj1.class);
    public static final List b = tl2.z(oj1.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List q0 = u9.q0(parameterTypes);
            if (list.equals(q0)) {
                return constructor;
            }
            if (list.size() == q0.size() && q0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final i72 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (i72) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            jw0.k("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            jw0.l("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
