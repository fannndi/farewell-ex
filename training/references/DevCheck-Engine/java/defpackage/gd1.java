package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class gd1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f334a;
    public final iw1 b;
    public final fd1 c;
    public final ConcurrentLinkedQueue d;

    public gd1(jw1 jw1Var) {
        jw1Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.f334a = 300000000000L;
        this.b = jw1Var.d();
        this.c = new fd1(this, d51.u(new StringBuilder(), rd2.b, " ConnectionPool connection closer"));
        this.d = new ConcurrentLinkedQueue();
    }

    public final int a(ed1 ed1Var, long j) {
        TimeZone timeZone = rd2.f888a;
        ArrayList arrayList = ed1Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + ed1Var.c.f386a.h + " was leaked. Did you forget to close a response body?";
                q71 q71Var = q71.f821a;
                q71.f821a.j(str, ((bd1) reference).f77a);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    ed1Var.q = j - this.f334a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
