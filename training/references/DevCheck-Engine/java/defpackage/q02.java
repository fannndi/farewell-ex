package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class q02 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f816a;
    public static final Method b;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f816a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b8.b();
        }
        try {
            return ((Boolean) b.invoke(null, Long.valueOf(f816a))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
