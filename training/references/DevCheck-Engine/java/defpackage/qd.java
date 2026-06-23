package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class qd implements dx, ay, Serializable {
    public final dx g;

    public qd(dx dxVar) {
        this.g = dxVar;
    }

    public ay c() {
        dx dxVar = this.g;
        if (dxVar instanceof ay) {
            return (ay) dxVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dx
    public final void g(Object obj) {
        while (true) {
            qd qdVar = this;
            dx dxVar = qdVar.g;
            dxVar.getClass();
            try {
                obj = qdVar.o(obj);
                if (obj == zx.g) {
                    return;
                }
            } catch (Throwable th) {
                obj = new pg1(th);
            }
            qdVar.p();
            if (!(dxVar instanceof qd)) {
                dxVar.g(obj);
                return;
            }
            this = dxVar;
        }
    }

    public dx l(dx dxVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement m() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        c10 c10Var = (c10) getClass().getAnnotation(c10.class);
        String str2 = null;
        if (c10Var == null || c10Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? c10Var.l()[i] : -1;
        ux0 ux0Var = bw0.e;
        ux0 ux0Var2 = bw0.f;
        if (ux0Var2 == null) {
            try {
                ux0 ux0Var3 = new ux0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                bw0.f = ux0Var3;
                ux0Var2 = ux0Var3;
            } catch (Exception unused2) {
                bw0.f = ux0Var;
                ux0Var2 = ux0Var;
            }
        }
        if (ux0Var2 != ux0Var && (method = ux0Var2.f1056a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = ux0Var2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = ux0Var2.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = c10Var.c();
        } else {
            str = str2 + '/' + c10Var.c();
        }
        return new StackTraceElement(str, c10Var.m(), c10Var.f(), i2);
    }

    public abstract Object o(Object obj);

    public void p() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object m = m();
        if (m == null) {
            m = getClass().getName();
        }
        sb.append(m);
        return sb.toString();
    }
}
