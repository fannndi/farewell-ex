package defpackage;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class uu1 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1054a = new HashMap();
    public static final Method b;

    static {
        new HashMap();
        try {
            b = Class.forName("android.os.ServiceManager").getMethod("getService", String.class);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.getStackTraceString(e);
        }
    }
}
