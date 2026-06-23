package defpackage;

import android.graphics.Typeface;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r32 extends q32 {
    @Override // defpackage.q32
    public final Typeface H(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.u.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            rw.j(e);
            return null;
        }
    }

    @Override // defpackage.q32
    public final Method K(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod(jYVJoqfHJs.Cbgab, cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
