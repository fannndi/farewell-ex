package defpackage;

/* loaded from: classes.dex */
public class h90 implements d22 {
    @Override // defpackage.d22
    public final c22 a(nh0 nh0Var, l32 l32Var) {
        Class cls = l32Var.f569a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new i90(cls);
    }
}
