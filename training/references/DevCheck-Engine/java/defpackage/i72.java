package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class i72 {

    /* renamed from: a, reason: collision with root package name */
    public final j72 f414a = new j72();

    public final void a() {
        j72 j72Var = this.f414a;
        if (j72Var != null && !j72Var.d) {
            j72Var.d = true;
            synchronized (j72Var.f466a) {
                try {
                    Iterator it = j72Var.b.values().iterator();
                    while (it.hasNext()) {
                        j72.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = j72Var.c.iterator();
                    while (it2.hasNext()) {
                        j72.a((AutoCloseable) it2.next());
                    }
                    j72Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
