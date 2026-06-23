package defpackage;

/* loaded from: classes.dex */
public abstract class sy1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f961a = new o1(6, "NO_THREAD_ELEMENTS");
    public static final ys b = new ys(6);
    public static final ys c = new ys(7);
    public static final ys d = new ys(8);

    public static final void a(qx qxVar, Object obj) {
        if (obj == f961a) {
            return;
        }
        if (!(obj instanceof xy1)) {
            Object m = qxVar.m(null, c);
            m.getClass();
            ((ty1) m).h.set(obj);
            return;
        }
        xy1 xy1Var = (xy1) obj;
        ty1[] ty1VarArr = xy1Var.c;
        int length = ty1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ty1 ty1Var = ty1VarArr[length];
            ty1Var.getClass();
            ty1Var.h.set(xy1Var.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(qx qxVar) {
        Object m = qxVar.m(0, b);
        m.getClass();
        return m;
    }

    public static final Object c(qx qxVar, Object obj) {
        if (obj == null) {
            obj = b(qxVar);
        }
        if (obj == 0) {
            return f961a;
        }
        if (obj instanceof Integer) {
            return qxVar.m(new xy1(((Number) obj).intValue(), qxVar), d);
        }
        ty1 ty1Var = (ty1) obj;
        ThreadLocal threadLocal = ty1Var.h;
        Object obj2 = threadLocal.get();
        threadLocal.set(ty1Var.g);
        return obj2;
    }
}
