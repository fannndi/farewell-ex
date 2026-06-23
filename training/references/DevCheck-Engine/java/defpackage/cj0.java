package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.IBinder;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class cj0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f127a;
    public static final Method b;
    public static final Method c;
    public static final int d;

    static {
        int i = Build.VERSION.SDK_INT;
        d = i >= 26 ? 4194304 : 0;
        try {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            Class<?> cls2 = Integer.TYPE;
            if (i >= 28) {
                try {
                    f127a = cls.getDeclaredMethod("addService", String.class, IBinder.class, Boolean.TYPE, cls2);
                } catch (NoSuchMethodException unused) {
                }
            }
            if (f127a == null) {
                f127a = cls.getDeclaredMethod("addService", String.class, IBinder.class);
            }
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            b = declaredMethod;
            declaredMethod.setAccessible(true);
            c = Class.forName("android.ddm.DdmHandleAppName").getDeclaredMethod("setAppName", String.class, cls2);
        } catch (ReflectiveOperationException unused2) {
        }
    }
}
