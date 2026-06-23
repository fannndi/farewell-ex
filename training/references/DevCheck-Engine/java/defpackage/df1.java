package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class df1 extends c3 {
    public final Method j = Class.class.getMethod("isRecord", null);
    public final Method k = Class.class.getMethod("getRecordComponents", null);
    public final Method l;
    public final Method m;

    public df1() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.l = cls.getMethod("getName", null);
        this.m = cls.getMethod("getType", null);
    }

    @Override // defpackage.c3
    public final Method m(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            jw0.l("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.c3
    public final Constructor o(Class cls) {
        try {
            Object[] objArr = (Object[]) this.k.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.m.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            jw0.l("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.c3
    public final String[] s(Class cls) {
        try {
            Object[] objArr = (Object[]) this.k.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.l.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            jw0.l("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // defpackage.c3
    public final boolean v(Class cls) {
        try {
            return ((Boolean) this.j.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            jw0.l("Unexpected ReflectiveOperationException occurred (Gson 2.14.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}
