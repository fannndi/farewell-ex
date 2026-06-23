package defpackage;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class h60 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f368a;
    public static final Method b;
    public static final Method c;
    public static final boolean d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f368a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod(CGvJMCDBOmCdj.Hnv, cls);
            c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            d = true;
        } catch (NoSuchMethodException unused) {
        }
    }
}
