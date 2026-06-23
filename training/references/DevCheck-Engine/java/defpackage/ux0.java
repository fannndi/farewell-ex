package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class ux0 {

    /* renamed from: a, reason: collision with root package name */
    public Method f1056a;
    public Method b;
    public Method c;

    public ux0(Method method, Method method2, Method method3) {
        this.f1056a = method;
        this.b = method2;
        this.c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
