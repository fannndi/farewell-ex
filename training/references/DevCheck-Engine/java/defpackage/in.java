package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class in implements uo0, Serializable {
    public transient uo0 g;
    public final Object h;
    public final Class i;
    public final String j;
    public final String k;
    public final boolean l;

    public in(Object obj, Class cls, String str, String str2, boolean z) {
        this.h = obj;
        this.i = cls;
        this.j = str;
        this.k = str2;
        this.l = z;
    }

    public abstract uo0 c();

    public final uq d() {
        boolean z = this.l;
        Class cls = this.i;
        if (!z) {
            return af1.a(cls);
        }
        af1.f25a.getClass();
        return new s51(cls);
    }
}
