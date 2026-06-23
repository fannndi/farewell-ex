package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class e62 {

    /* renamed from: a, reason: collision with root package name */
    public final p9 f224a;
    public final p9 b;
    public final p9 c;

    public e62(p9 p9Var, p9 p9Var2, p9 p9Var3) {
        this.f224a = p9Var;
        this.b = p9Var2;
        this.c = p9Var3;
    }

    public abstract f62 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        p9 p9Var = this.c;
        Class cls2 = (Class) p9Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        p9Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        p9 p9Var = this.f224a;
        Method method = (Method) p9Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, e62.class.getClassLoader()).getDeclaredMethod("read", e62.class);
        p9Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        p9 p9Var = this.b;
        Method method = (Method) p9Var.get(name);
        if (method != null) {
            return method;
        }
        Class b = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", cls, e62.class);
        p9Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((f62) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((f62) this).e.readParcelable(f62.class.getClassLoader());
    }

    public final g62 h() {
        String readString = ((f62) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (g62) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            jw0.l("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            jw0.l("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            jw0.l("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            jw0.l("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((f62) this).e.writeInt(i);
    }

    public final void k(g62 g62Var) {
        if (g62Var == null) {
            ((f62) this).e.writeString(null);
            return;
        }
        try {
            ((f62) this).e.writeString(b(g62Var.getClass()).getName());
            f62 a2 = a();
            try {
                d(g62Var.getClass()).invoke(null, g62Var, a2);
                Parcel parcel = a2.e;
                int i = a2.i;
                if (i >= 0) {
                    int i2 = a2.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                jw0.l("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                jw0.l("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                jw0.l("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                jw0.l("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            jw0.l(g62Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
