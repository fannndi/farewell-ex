package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class uv {

    /* renamed from: a, reason: collision with root package name */
    public final gr f1055a;
    public final Context b;
    public final Object c;
    public final LinkedHashSet d;
    public Object e;

    public uv(Context context, gr grVar) {
        this.f1055a = grVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.b = applicationContext;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                ((kj1) this.f1055a.k).execute(new k5(yr.g0(this.d), 12, this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
