package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class r71 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f876a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (ym0.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (ym0.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f876a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !ym0.b(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
