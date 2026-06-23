package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class k72 extends x42 {
    public static k72 i;
    public static final i42 j = new i42();
    public final Application h;

    public k72(Application application) {
        this.h = application;
    }

    @Override // defpackage.x42, defpackage.l72
    public final i72 a(Class cls) {
        Application application = this.h;
        if (application != null) {
            return g(cls, application);
        }
        rw.l("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.x42, defpackage.l72
    public final i72 b(Class cls, py0 py0Var) {
        if (this.h != null) {
            return a(cls);
        }
        Application application = (Application) py0Var.f1057a.get(j);
        if (application != null) {
            return g(cls, application);
        }
        if (!a4.class.isAssignableFrom(cls)) {
            return rt0.h(cls);
        }
        c.m("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final i72 g(Class cls, Application application) {
        if (!a4.class.isAssignableFrom(cls)) {
            return rt0.h(cls);
        }
        try {
            i72 i72Var = (i72) cls.getConstructor(Application.class).newInstance(application);
            i72Var.getClass();
            return i72Var;
        } catch (IllegalAccessException e) {
            jw0.k("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            jw0.k("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            jw0.k("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            jw0.k("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
