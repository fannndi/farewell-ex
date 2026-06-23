package defpackage;

/* loaded from: classes.dex */
public abstract class uy1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1059a = new ThreadLocal();

    public static n90 a() {
        ThreadLocal threadLocal = f1059a;
        n90 n90Var = (n90) threadLocal.get();
        if (n90Var != null) {
            return n90Var;
        }
        nk nkVar = new nk(Thread.currentThread());
        threadLocal.set(nkVar);
        return nkVar;
    }
}
