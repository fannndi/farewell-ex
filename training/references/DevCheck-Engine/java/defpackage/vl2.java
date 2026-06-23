package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class vl2 extends dl2 {
    public static final Map zzb = new ConcurrentHashMap();
    public zm2 zzc;
    public int zzd;

    public vl2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = zm2.f;
    }

    public static vl2 h(Class cls) {
        Map map = zzb;
        vl2 vl2Var = (vl2) map.get(cls);
        if (vl2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vl2Var = (vl2) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (vl2Var != null) {
            return vl2Var;
        }
        vl2 vl2Var2 = (vl2) ((vl2) en2.g(cls)).d(6);
        if (vl2Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, vl2Var2);
        return vl2Var2;
    }

    public static Object i(Method method, vl2 vl2Var, Object... objArr) {
        try {
            return method.invoke(vl2Var, objArr);
        } catch (IllegalAccessException e) {
            jw0.l("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            jw0.l("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void k(Class cls, vl2 vl2Var) {
        vl2Var.j();
        zzb.put(cls, vl2Var);
    }

    public static final boolean m(vl2 vl2Var, boolean z) {
        byte byteValue = ((Byte) vl2Var.d(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i = om2.c.a(vl2Var.getClass()).i(vl2Var);
        if (z) {
            vl2Var.d(2);
        }
        return i;
    }

    @Override // defpackage.dl2
    public final int a(rm2 rm2Var) {
        if (c()) {
            int f = rm2Var.f(this);
            if (f >= 0) {
                return f;
            }
            c.n(d51.q("serialized size must be non-negative, was ", f));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f2 = rm2Var.f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | f2;
            return f2;
        }
        c.n(d51.q("serialized size must be non-negative, was ", f2));
        return 0;
    }

    public final boolean c() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object d(int i);

    public final int e() {
        if (c()) {
            int f = om2.c.a(getClass()).f(this);
            if (f >= 0) {
                return f;
            }
            c.n(d51.q("serialized size must be non-negative, was ", f));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int f2 = om2.c.a(getClass()).f(this);
        if (f2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | f2;
            return f2;
        }
        c.n(d51.q("serialized size must be non-negative, was ", f2));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return om2.c.a(getClass()).d(this, (vl2) obj);
    }

    public final ul2 f() {
        return (ul2) d(5);
    }

    public final ul2 g() {
        ul2 ul2Var = (ul2) d(5);
        if (!ul2Var.g.equals(this)) {
            if (!ul2Var.h.c()) {
                vl2 vl2Var = (vl2) ul2Var.g.d(4);
                om2.c.a(vl2Var.getClass()).b(vl2Var, ul2Var.h);
                ul2Var.h = vl2Var;
            }
            vl2 vl2Var2 = ul2Var.h;
            om2.c.a(vl2Var2.getClass()).b(vl2Var2, this);
        }
        return ul2Var;
    }

    public final int hashCode() {
        if (c()) {
            return om2.c.a(getClass()).g(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int g = om2.c.a(getClass()).g(this);
        this.zza = g;
        return g;
    }

    public final void j() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void l() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = km2.f540a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        km2.c(this, sb, 0);
        return sb.toString();
    }
}
