package defpackage;

import com.google.android.material.behavior.YqV.Gvyagftz;

/* loaded from: classes.dex */
public final class t50 implements db1 {
    public static final Object i = new Object();
    public volatile sa0 g;
    public volatile Object h;

    public static db1 a(sa0 sa0Var) {
        if (sa0Var instanceof t50) {
            return sa0Var;
        }
        t50 t50Var = new t50();
        t50Var.h = i;
        t50Var.g = sa0Var;
        return t50Var;
    }

    @Override // defpackage.db1
    public final Object get() {
        Object obj;
        Object obj2 = this.h;
        Object obj3 = i;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.h;
                if (obj == obj3) {
                    obj = this.g.get();
                    Object obj4 = this.h;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException(Gvyagftz.zhXyLWbCUsmV + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.h = obj;
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
