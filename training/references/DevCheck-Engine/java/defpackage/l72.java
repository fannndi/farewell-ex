package defpackage;

/* loaded from: classes.dex */
public interface l72 {
    default i72 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default i72 b(Class cls, py0 py0Var) {
        return a(cls);
    }

    default i72 e(vq vqVar, py0 py0Var) {
        Class cls = vqVar.f1097a;
        cls.getClass();
        return b(cls, py0Var);
    }
}
