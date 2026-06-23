package defpackage;

/* loaded from: classes.dex */
public abstract class o10 {

    /* renamed from: a, reason: collision with root package name */
    public static final q20 f712a;

    static {
        String str;
        q20 q20Var;
        int i = tu1.f1008a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            c20 c20Var = e50.f220a;
            xh0 xh0Var = qt0.f861a;
            xh0 xh0Var2 = xh0Var.k;
            q20Var = xh0Var;
            if (xh0Var == null) {
                q20Var = n10.r;
            }
        } else {
            q20Var = n10.r;
        }
        f712a = q20Var;
    }
}
