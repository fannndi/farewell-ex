package defpackage;

/* loaded from: classes.dex */
public abstract class af1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bf1 f25a;

    static {
        bf1 bf1Var = null;
        try {
            bf1Var = (bf1) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (bf1Var == null) {
            bf1Var = new bf1();
        }
        f25a = bf1Var;
    }

    public static vq a(Class cls) {
        f25a.getClass();
        return new vq(cls);
    }
}
